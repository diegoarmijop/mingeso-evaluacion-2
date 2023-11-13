import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './components/Header.jsx';
import Formulario from './components/Formulario.jsx';
import './styles.css';



function App() {
  return (
    <Router>
      <div className="App">
        <Header />

        <Routes>
          <Route path="/estudiantes" element={<Formulario/>} />
        </Routes>

      </div>
    </Router>
  );
}

export default App;