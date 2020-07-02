import React, { createContext, useState } from "react";
//import { emuAPI } from "../Components/emuAPI";

export const UserContext = createContext();

export function UserProvider(props) {
  const [userId, setUserId] = useState(-1);
  const [trigger, setTrigger] = useState(0);
  const [username, setUsername] = useState("");
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const data = {
    id: 2,
    username: "saveemus",
  };

  const setCredentials = (data) => {
    setIsLoggedIn(true);
    setUserId(data.id);
    setUsername(data.username);
  };

  function register(userInformation) {
    setCredentials(data);
    console.log(username);
  }

  return (
    <UserContext.Provider
      value={{
        username,
        userId,
        setUserId,
        isLoggedIn,
        setIsLoggedIn,
        register,
        setTrigger,
        trigger,
      }}
    >
      {props.children}
    </UserContext.Provider>
  );
}
