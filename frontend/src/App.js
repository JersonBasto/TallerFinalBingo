import { Route, Routes } from 'react-router-dom';
import './App.css';
import Home from './views/home';
import Register from './views/register';
import Login from './views/login';
import Bingo from './views/Bingo';

function App() {
  return (
    <div className='App'>
      <Routes>
        <Route path="/" element={<Home></Home>}></Route>
        <Route path="/register" element={<Register></Register>}></Route>
        <Route path="/login" element={<Login></Login>}></Route>
        <Route path="/bingo" element={<Bingo></Bingo>}></Route>
      </Routes>
    </div>
  );
}

export default App;
