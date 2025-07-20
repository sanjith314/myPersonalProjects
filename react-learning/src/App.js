import logo from './logo.svg';
import './App.css';

function App() {
  const title = "Bonjour"
  return (
    <div className="App">
      <h1>{ title }</h1>
      <p>This is a paragraph</p>
      <p>{Math.random() * 5 }</p>
    </div>

  );
}

export default App;
