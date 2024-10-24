# React Router Dom v6

1. Instalar los módulos de React-Router-Dom en el proyecto de React
```bash
npm install react-router-dom
```
2. En el archivo `main.jsx` debemos crear una constante `router` donde vive el componente `createBrowserRouter` y dentro las rutas específicas que el usuario puede seguir (en forma de un Array de Objetos).
3. Importar createBrowserRouter desde 'react-router-dom'.
4. Crear la primera ruta dentro de la constante `router`, es decir, llenar el primer Object que recibe un par key-value referentes a la ruta (path) y el componente al que apunta (element):
```javascript
const router = createBrowserRouter([
  {
    path: '/', element: <App />
  }
])
```
5. Para indicar donde se renderiza react-router, debemos sustituir el componente `<App />` que se encuentra dentro `React.<StrictMode>` y en su lugar, agregar el componente `<RouterProvider />` el cual va a recibir el conjunto (Array) de rutas a renderizar