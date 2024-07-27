import {useState} from 'react'
import {EXAMPLES} from '../data.js'
import Tabs from './Tabs.jsx'
import TapButton from './TapButton.jsx'


export default function Examples() {
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
    <section title="Examples" id="examples">
      <Tabs
        // ButtonsContainer = "menu"
        buttons={
          <>
            <TapButton isSelected={selectedTopic === 'components'} onSelect={() => handleSelect('components')}>Components</TapButton>
            <TapButton isSelected={selectedTopic === 'jsx'} onSelect={() => handleSelect('jsx')}>JSX</TapButton>
            <TapButton isSelected={selectedTopic === 'props'} onSelect={() => handleSelect('props')}>Props</TapButton>
            <TapButton isSelected={selectedTopic === 'state'} onSelect={() => handleSelect('state')}>State</TapButton>
          </>
      }
      >
        {tapContent}
      </Tabs>
      <menu></menu>
   </section>
  )
}