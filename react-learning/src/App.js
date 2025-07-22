import logo from './logo.svg';
import './App.css';
import Navbar  from './Navbar';
import Home from './Home';

function App() {
  const title = "Bonjour"
  return (
    <div className="App">
      <Navbar />
      <div>
        <Home />
      </div>
    </div>

  );
}

export default App;
