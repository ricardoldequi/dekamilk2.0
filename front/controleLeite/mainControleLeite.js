const linkColor = document.querySelectorAll('.nav__link')
function colorLink(){
    linkColor.forEach(l=> l.classList.remove('active'))
    this.classList.add('active')
}
linkColor.forEach(l=> l.addEventListener('click', colorLink))


const linkCollapse = document.getElementsByClassName('collapse__link')
var i

for(i=0;i<linkCollapse.length;i++){
  linkCollapse[i].addEventListener('click', function(){
    const collapseMenu = this.nextElementSibling
    collapseMenu.classList.toggle('showCollapse')

    const rotate = collapseMenu.previousElementSibling
    rotate.classList.toggle('rotate')
  })
}


const form = document.querySelector('form');

form.addEventListener('submit', function(event) {
  event.preventDefault();

  const animal = {
    data: document.getElementById('data').value,
    valor: document.getElementById('valor').value,
    cliente: document.getElementById('cliente').value
  };
  // falta os radio buttons n consegui pegar

  // trocar a rota
  fetch('http://localhost:8080/clientes', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(animal)
  })
  .then(function(response) {
    if (response.ok) {
      alert('Fornecedor incluído com sucesso!');
      // Limpa os campos de entrada após o sucesso
      document.getElementById('data').value = '';
      document.getElementById('valor').value = '';
      document.getElementById('cliente').value = '';
    } else {
      throw new Error('Erro ao incluir cliente. Por favor, tente novamente.');
    }
  })
  .catch(function(error) {
    alert(error.message);
  });
});
