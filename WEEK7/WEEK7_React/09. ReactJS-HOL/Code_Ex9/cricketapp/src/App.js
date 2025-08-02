import logo from './logo.svg';
import './App.css';
import { useState } from 'react';
import ListOfPlayers from './Components/ListOfPlayers';
import ScoreLessThan70 from './Components/ScoreLessThan70';
import EvenOddPlayers from './Components/EvenOddPlayers';
import IndianPlayersMerged from './Components/IndianPlayersMerged';

function App() {
  let [flag, setFlag] = useState(true);

  return (
    <div className="">
      <div style={{textAlign: 'center', margin: '10px'}}>
        <button style={{padding: '5px'}} onClick={() => setFlag(!flag)}>Change the Data View</button>
      </div>
      <div>
        {flag ? (
            <div>
              <ListOfPlayers />
              <hr></hr>
              <ScoreLessThan70 />
            </div>
        ) : (
            <div>
              <EvenOddPlayers />
              <hr></hr>
              <IndianPlayersMerged />
            </div>
        )}
      </div>
    </div>
  );
}

export default App;
