// import Button from './components/Button/Button'
import './App.css'
import RecipeReviewCard from './components/Card/Card';
import Navbar from './components/Navbar/Navbar'
import Products from './components/Products/Products'

function App() {

  // Voy a guardar las rutas de las imgs en constantes
  const tenisMorados = 'https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/82/6142201/1.jpg?2933';
  const tenisDark = 'https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/01/241417/1.jpg?6747';
  const tenisCamel = 'https://ng.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/06/4410121/1.jpg?4437';

  // Estilos para la Card de MUI
  const stylesCard = {
    display: 'flex', 
    justifyContent: 'center',
    marginTop: '50px',
    marginBottom: '50px'
  }

  return(
    <>
    <Navbar />
    <h1>Hola React</h1>

    <Products
      image={tenisMorados}
      title='Tenis Morados'
      description='Tenis aerodinámicos para running'
      price='$ 2599.00'
    />

    <Products
      image={tenisDark}
      title='Tenis Dark'
      description='Tenis elegantes y sofisticados'
      price='$ 1855.00'
    />

    <Products
      image={tenisCamel}
      title='Tenis Camel'
      description='Tenis para el viernes de oficina'
      price='$ 2050.00'
    />

    {/* Aplicando estilos en línea en un elemento del componente. Se utiliza camelCase */}
    <h2 style={ {color: '#94bbe9', fontSize: 28, border: '1px solid white', borderRadius: '20px'} }>Material UI - Components</h2>

    {/* Componente de Material UI con estilos como Objeto en una variable */}
    <div style={stylesCard}>
      <RecipeReviewCard />
    </div>

    {/* Comentario dentro de la función
    <Button text="Registrarse" />
    <br />
    <Button text="Iniciar Sesión" />
    */}

    </>
  )
}

export default App
