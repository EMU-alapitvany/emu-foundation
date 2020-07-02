import React from "react";
import { BrowserRouter } from "react-router-dom";
import "./App.css";
import Registry from "./Components/Registry";

function App(props) {
  return (
    <BrowserRouter>
      <div className='App'>
        <h1>Emu Alapítvány</h1>
        <Registry />
      </div>
    </BrowserRouter>
  );
}

export default App;
