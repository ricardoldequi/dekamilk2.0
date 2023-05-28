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
/*
document.querySelector('.collapseMenu').addEventListener('click', () => {
  document.querySelector('.sidebar').classList.toggle('isOpen');
  document.querySelector('.fechaMenu').classList.toggle('isClose');
});

document.querySelector('.fechaMenu').addEventListener('click', () => {
  document.querySelector('.sidebar').classList.toggle('isOpen');
  document.querySelector('.fechaMenu').classList.toggle('isClose');
});*/


// Cadastro de Fornecedor

document.getElementById('btIncluir').addEventListener('click', function(event) {
  event.preventDefault(); // Evita que o formulário seja enviado

  // Obtém os valores dos campos de entrada
  var nomeFornecedor = document.getElementById('nomeFornecedor').value;
  /*var tipoFornecedor = document.querySelector('input[name="tipoFornecedor"]:checked').value;
  var CPFFornecedor = document.getElementById('CPFFornecedor').value;
  var IEFornecedor = document.getElementById('IEFornecedor').value;
  var enderecoFornecedor = document.getElementById('EnderecoFornecedor').value;
  var cidadeFornecedor = document.getElementById('CidadeFornecedor').value;
  var UFFornecedor = document.getElementById('UFFornecedor').value;
  var CEPFornecedor = document.getElementById('CEPFornecedor').value;
  var telefoneCFornecedor = document.getElementById('TelefoneCFornecedor').value;
  var telefoneFFornecedor = document.getElementById('TelefoneFFornecedor').value;
  var emailFornecedor = document.getElementById('EmailFornecedor').value;*/

  // Cria um objeto com os dados do fornecedor
  var fornecedor = {
    nome: nomeFornecedor,
    /*tipo: tipoFornecedor,
    cpf_cnpj: CPFFornecedor,
    inscricao_estadual: IEFornecedor,
    endereco: enderecoFornecedor,
    cidade: cidadeFornecedor,
    uf: UFFornecedor,
    cep: CEPFornecedor,
    telefone_celular: telefoneCFornecedor,
    telefone_fixo: telefoneFFornecedor,
    email: emailFornecedor*/
  };

  // Realiza a requisição fetch
  fetch('http://localhost:8080/fornecedor/fornecedores', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(fornecedor)
  })
  .then(function(response) {
    if (response.ok) {
      alert('Fornecedor incluído com sucesso!');
      // Limpa os campos de entrada após o sucesso
      document.getElementById('nomeFornecedor').value = '';
      document.getElementById('CPFFornecedor').value = '';
      document.getElementById('IEFornecedor').value = '';
      document.getElementById('EnderecoFornecedor').value = '';
      document.getElementById('CidadeFornecedor').value = '';
      document.getElementById('UFFornecedor').value = '';
      document.getElementById('CEPFornecedor').value = '';
      document.getElementById('TelefoneCFornecedor').value = '';
      document.getElementById('TelefoneFFornecedor').value = '';
      document.getElementById('EmailFornecedor').value = '';
    } else {
      throw new Error('Erro ao incluir fornecedor. Por favor, tente novamente.');
    }
  })
  .catch(function(error) {
    alert(error.message);
  });
});
