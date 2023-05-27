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

document.addEventListener('DOMContentLoaded', function() {
  document.getElementById('btIncluir').addEventListener('click', function(event) {
    salvarDados();
  });
});


function salvarDados() {
  // Capturando os valores dos inputs
  var nome = document.getElementById('nomeFornecedor').value;
  var tipo = document.querySelector('input[name="tipoFornecedor"]:checked').value;
  var cpfCnpj = document.getElementById('CPFFornecedor').value;
  var inscricaoEstadual = document.getElementById('IEFornecedor').value;
  var endereco = document.getElementById('EnderecoFornecedor').value;
  var cidade = document.getElementById('CidadeFornecedor').value;
  var uf = document.getElementById('UFFornecedor').value;
  var cep = document.getElementById('CEPFornecedor').value;
  var telefoneCelular = document.getElementById('TelefoneCFornecedor').value;
  var telefoneFixo = document.getElementById('TelefoneFFornecedor').value;
  var email = document.getElementById('EmailFornecedor').value;

  // Objeto com os dados a serem enviados para o servidor
  var dados = {
    nome: nome,
    //tipo: tipo,
    //cpfCnpj: cpfCnpj,
    //inscricaoEstadual: inscricaoEstadual,
    endereco: endereco,
    cidade: cidade,
    uf: uf,
    cep: cep,
    telefoneCelular: telefone,
    telefoneFixo: telefone_fixo,
    email: email
  };

  // Fazendo a requisição HTTP para a API
  fetch('http://localhost:8080/fornecedor/fornecedor', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(dados)
  })
  .then(function(response) {
    if (response.ok) {
      console.log('Dados salvos com sucesso!');
      // Limpar os campos do formulário após o salvamento (opcional)
      document.getElementById('form-cad-forn').reset();
    } else {
      console.log('Erro ao salvar os dados.');
    }
  })
  .catch(function(error) {
    console.log('Ocorreu um erro na requisição:', error.message);
  });
}
