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


// Cadastro de Clientes
// Selecionar o formulário
const form = document.querySelector('form');

// Manipulador de envio do formulário
form.addEventListener('submit', function(event) {
  event.preventDefault(); // Impedir o envio do formulário

  // Obter os valores dos campos do formulário
  const nomeCliente = document.getElementById('nomeCliente').value;
  const cpfCliente = document.getElementById('CPFCliente').value;
  const ieCliente = document.getElementById('IECliente').value;
  const enderecoCliente = document.getElementById('EnderecoCliente').value;
  const cidadeCliente = document.getElementById('CidadeCliente').value;
  const ufCliente = document.getElementById('UFCliente').value;
  const cepCliente = document.getElementById('CEPCliente').value;
  const telefoneCliente = document.getElementById('TelefoneCliente').value;
  const telefoneFCliente = document.getElementById('TelefoneFCliente').value;
  const emailCliente = document.getElementById('EmailCliente').value;

  // Criar um objeto com os dados do cliente
  const cliente = {
    nome: nomeCliente,
    cpf: cpfCliente,
    cnpj: null,
    ie: ieCliente,
    endereco: enderecoCliente,
    cidade: cidadeCliente,
    uf: ufCliente,
    cep: cepCliente,
    bairro: 'tres vendas',
    telefone: telefoneCliente,
    telefone_fixo: telefoneFCliente,
    email: emailCliente
  };

  // Enviar os dados do cliente para o servidor usando fetch
  fetch('http://localhost:8080/clientes', {
    method: 'POST', // Ou 'PUT', 'GET', 'DELETE', dependendo da sua necessidade
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(cliente)
  })
  .then(function(response) {
    if (response.ok) {
      alert('Fornecedor incluído com sucesso!');
      // Limpa os campos de entrada após o sucesso
      document.getElementById('nomeCliente').value = '';
      document.getElementById('CPFCliente').value = '';
      document.getElementById('IECliente').value = '';
      document.getElementById('EnderecoCliente').value = '';
      document.getElementById('CidadeCliente').value = '';
      document.getElementById('UFCliente').value = '';
      document.getElementById('CEPCliente').value = '';
      document.getElementById('TelefoneCliente').value = '';
      document.getElementById('TelefoneFCliente').value = '';
      document.getElementById('EmailCliente').value = '';
    } else {
      throw new Error('Erro ao incluir cliente. Por favor, tente novamente.');
    }
  })
  .catch(function(error) {
    alert(error.message);
  });
});
