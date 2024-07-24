import componentsImg from './assets/components.png'
import {CORE_CONCEPTS} from './data.js'
import Header from './components/Header/Header.jsx'
import CoreConcept from './components/CoreConcept.jsx';
import TapButton from './components/TapButton.jsx';
import {useState} from 'react'
import {EXAMPLES} from './data.js'

function App() {
  const [ selectedTopic, setSelectedTopic ] = useState()

  function handleSelect(selectedButton) {
    setSelectedTopic(selectedButton)
    // console.log(sel   ectedTopic)
  }

  console.log('APP COMPONENT EXECUTING')
  
  let tapContent = <p>Please select a topic.</p>
  if (selectedTopic) {
    tapContent = (
      <div id="tab-content">
        <h3>{EXAMPLES[selectedTopic].title}</h3>
        <p>{EXAMPLES[selectedTopic].description}</p>
        <pre>
          <code>{EXAMPLES[selectedTopic].code}</code>
        </pre>
      </div>
    )
  }

  return (
    <div>
      <header>
        <h1>Hello World!</h1>
      </header>
      <Header />
      <main>
        <section id="core-concepts">
          <h2>Core Concepts</h2>
          <ul>
            {CORE_CONCEPTS.map((conceptItem) => <CoreConcept key={conceptItem.title} {...conceptItem} />)}
          </ul>
        </section>
        <section id="examples">
          <h2>Examples</h2>
          <menu>
            <TapButton isSelected={selectedTopic === 'components'} onSelect={() => handleSelect('components')}>Components</TapButton>
            <TapButton isSelected={selectedTopic === 'jsx'} onSelect={() => handleSelect('jsx')}>JSX</TapButton>
            <TapButton isSelected={selectedTopic === 'props'} onSelect={() => handleSelect('props')}>Props</TapButton>
            <TapButton isSelected={selectedTopic === 'state'} onSelect={() => handleSelect('state')}>State</TapButton>
          </menu>
          {tapContent}
        </section>
      </main> 
    </div>
  );
}

export default App;