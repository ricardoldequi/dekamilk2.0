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