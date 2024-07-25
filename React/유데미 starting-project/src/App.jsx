import componentsImg from './assets/components.png'
import Header from './components/Header/Header.jsx'
import TapButton from './components/TapButton.jsx';
import CoreConcepts from './components/CoreConcepts.jsx'
import {useState, Fragment} from 'react'
import {EXAMPLES} from './data.js'

function App() {


  return (
    <Fragment>
      <header>
        <h1>Hello World!</h1>
      </header>
      <Header />
      <main>
        <CoreConcepts />

      </main> 
    </Fragment>
  );
}

export default App;