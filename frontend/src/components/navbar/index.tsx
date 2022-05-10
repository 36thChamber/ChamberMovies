import {ReactComponent as GithubIcon} from 'assets/img/github.svg';
import './styles.css'
function Navbar() {
    return (
        <header>
        <nav className="container">
          <div className="ChamberMovies-nav-content">
            <h1>Chamber</h1>
            <a href="https://github.com/36thChamber">
              <div className='ChamberMovies-contact-container'>
                <GithubIcon />
                <p className='ChamberMovies-contact-link'>/36thChamber</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;