document.addEventListener("keypress", function(e) {

    if(e.key === "Enter") {
        
        const btn = document.querySelector("#enviar");
        btn.click();

    }
})

history.pushState(null, null, document.URL);
window.addEventListener('popstate', function () {
    history.pushState(null, null, document.URL);
});




function logout() {
    localStorage.removeItem("user");
}

export default logout;

