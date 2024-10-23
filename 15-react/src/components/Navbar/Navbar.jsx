import Button from '../Button/Button'
import './Navbar.css'
// Importar una imagen desde una ruta
import LogoNasa from '/src/assets/NASA_logo.png'


const Navbar = () => {
    return (
        <>
        <nav className='navbar--container'>
            {/* Logo */}
            <div className='navbar--logo'>
                <img src={LogoNasa} alt='logo nasa' />
            </div>

            {/* Menu */}
            <div className='navbar--menu'>
                <div className='menu--links'>
                    <a href='#'>Astros</a>
                    <a href='#'>Nasa</a>
                    <a href='#'>ISS</a>
                </div>
                {/* Button */}
                <Button text='Buscar' />
            </div>
        </nav>
        </>
    )
}

export default Navbar