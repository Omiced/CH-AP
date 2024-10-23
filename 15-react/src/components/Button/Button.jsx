/* Props. Permiten modificar las propiedades del componente.
- Estructurados, utilizamos la palabra `props` como parámetro de la función y lo asignamos a la propiedad específica del componente, asignando un método al props
*/

// Importar estilos CSS
import './Button.css'

const Button = ( props ) => {
    return(
        <button>{ props.text }</button>
    )
}

export default Button