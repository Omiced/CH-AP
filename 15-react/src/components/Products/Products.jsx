import './Products.css'

/** Props desesctructurados. No posee la palabra `props`, sino que los nombres se asignan con base en el contexto.
 * Se pasan como argumentos de la función y deben ir encerrados en llave
 */

const Products = ({ image, title, description, price }) => {
    return (
        <div className='card--container'>
            <div className='product--card'>
                <img src={image} alt="" />
                <h2>{title}</h2>
                <p>{description}</p>
                <h3>{price}</h3>
            </div>
        </div>
    )
}

export default Products
