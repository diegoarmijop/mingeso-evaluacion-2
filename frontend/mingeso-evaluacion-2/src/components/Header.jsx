import React from "react";

function Header() {
    return (
        <div className="menu-container">
            <header>
                <nav>
                    <a href="/estudiantes">INGRESAR ESTUDIANTE</a>
                    <a href="/estudiantes/listado">ESTUDIANTES</a>
                    <a href="/examenes">EXAMENES</a>
                    <a href="/examenes/upload">SUBIR EXAMEN</a>
                </nav>
            </header>
        </div>
    );
}

export default Header;
