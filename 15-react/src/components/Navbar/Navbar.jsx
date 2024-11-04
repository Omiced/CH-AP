import { Link } from 'react-router-dom';
import Button from '../Button/Button'
import './Navbar.css'
// Importar una imagen desde una ruta
import LogoNasa from '/src/assets/NASA_logo.png'
import AccountCircleIcon from '@mui/icons-material/AccountCircle';


const Navbar = () => {
    return (
        <>
        <nav className='navbar--container'>
            {/* Logo */}
            <div className='navbar--logo'>
                {/* Componente que me permite linkear a otro sitio */}
                <Link to='/' > 
                    <img src={LogoNasa} alt='logo nasa' />
                </Link>
            </div>

            {/* Menu */}
            <div className='navbar--menu'>
                <div className='menu--links'>
                    <Link to='/astros-api'>
                        <a>Astros</a>
                    </Link>
                    <a href='#'>Nasa</a>
                    <a href='#'>ISS</a>
                </div>
                {/* Button */}
                <Button text='Buscar' />
                <Link to='/login'>
                    <AccountCircleIcon style={{fontSize: 'xx-large'}}/>
                </Link>
            </div>
        </nav>
        </>
    )
}

export default Navbar