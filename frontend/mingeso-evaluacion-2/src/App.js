import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import './styles.css';
import Header from './components/Header.jsx';
import Formulario from './components/Formulario.jsx';
import Listado from './components/Listado.jsx';
import Cuotas from './components/Cuotas.jsx';

function App() {
  return (
    <Router>
      <div className="App">

        <Routes>
          <Route path="/" element={<Header/>} />
          <Route path="/estudiantes" element={<Formulario />} />
          <Route path="/estudiantes/listado" element={<Listado />} />
          <Route path="/cuotas/:id" element={<Cuotas/>} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
