const registrar = document.getElementById('submit');

registrar.addEventListener('click', () => {
    const nombreUsuario = document.getElementById('username').value;
    const correoElectronico = document.getElementById('email').value;
    const contrasena = document.getElementById('password').value;

    // Crear mi objeto que interactúa con el backend
    const user = {
        username: nombreUsuario,
        email: correoElectronico,
        password: contrasena
    }


    // Comenzar con la llamada de la API (fetch, asynch-await, axios)
    const url = `http://localhost:8080/api/v1`;

    fetch(url, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })
        .then(response => {
            return response.json();
        })
        .then(data => {
            console.log('Guardado', data)
        })
        .catch(error => {
            console.error(error);
        })

})