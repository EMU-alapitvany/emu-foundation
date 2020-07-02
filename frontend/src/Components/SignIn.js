import React from "react";
import { Link } from "react-router-dom";

export default function SignIn(props) {
  return (
    <div>
      <h2>Nincs még fiókja? Itt regisztrálhat:</h2>
      <Link to='/signup'>Signup</Link>
      <h3>SignIn</h3>
    </div>
  );
}
