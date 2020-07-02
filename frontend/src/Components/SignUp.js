import React, { useState, useContext } from "react";
import { Redirect } from "react-router-dom";
import Avatar from "@material-ui/core/Avatar";
import Button from "@material-ui/core/Button";
import CssBaseline from "@material-ui/core/CssBaseline";
import Link from "@material-ui/core/Link";
import Grid from "@material-ui/core/Grid";
import Box from "@material-ui/core/Box";
import LockOutlinedIcon from "@material-ui/icons/LockOutlined";
import Typography from "@material-ui/core/Typography";
import { makeStyles } from "@material-ui/core/styles";
import Container from "@material-ui/core/Container";
import { ValidatorForm, TextValidator } from "react-material-ui-form-validator";
import { UserContext } from "../DataStore/UserProvider";

const usernameRegex =
  "^(?=.{3,10}$)(?![_.])(?!.*[_.]{2})[a-zA-Z0-9._]+(?<![_.])$";
const passwordRegex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}$";

const useStyles = makeStyles((theme) => ({
  paper: {
    marginTop: theme.spacing(8),
    display: "flex",
    flexDirection: "column",
    alignItems: "center",
  },
  avatar: {
    margin: theme.spacing(1),
    backgroundColor: theme.palette.secondary.main,
  },
  form: {
    width: "100%", // Fix IE 11 issue.
    marginTop: theme.spacing(3),
  },
  submit: {
    margin: theme.spacing(3, 0, 2),
  },
}));

export default function SignUp(props) {
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

  const styleClasses = useStyles();
  //const { register } = useContext(UserContext);
  //const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [passwordRepeat, setPasswordRepeat] = useState("");
  const [email, setemail] = useState("");

  return (
    <Container component='main' maxWidth='xs'>
      <CssBaseline />
      <div className={styleClasses.paper}>
        <Avatar className={styleClasses.avatar}>
          <LockOutlinedIcon />
        </Avatar>
        <Typography component='h1' variant='h5'>
          Sign up
        </Typography>
        <ValidatorForm
          className={styleClasses.form}
          onSubmit={(e) => {
            e.preventDefault();
            register({ username, email, password });
            props.history.push("/");
          }}
        >
          <Grid container spacing={2}>
            <Grid item xs={12}>
              <TextValidator
                name='username'
                variant='outlined'
                required
                fullWidth
                id='username'
                label='Teljes név'
                autoFocus
                autoComplete='off'
                value={username}
                validators={[`matchRegexp:${usernameRegex}`]}
                errorMessages={["3-10 long. A-Z, 0-9 and , or _"]}
                onChange={(e) => setUsername(e.target.value)}
              />
            </Grid>
            <Grid item xs={12}>
              <TextValidator
                variant='outlined'
                required
                fullWidth
                id='email'
                label='Email cím'
                name='email'
                autoComplete='off'
                value={email}
                onChange={(e) => setemail(e.target.value)}
                validators={[`isEmail`]}
                errorMessages={["Email is not valid"]}
              />
            </Grid>
            <Grid item xs={12}>
              <TextValidator
                variant='outlined'
                required
                fullWidth
                name='password'
                label='Jelszó'
                type='password'
                id='password'
                value={password}
                autoComplete='current-password'
                onChange={(e) => setPassword(e.target.value)}
                validators={[`matchRegexp:${passwordRegex}`]}
                errorMessages={["8- long, at least one: A-Z, a-z, 0-9"]}
              />
            </Grid>
            <Grid item xs={12}>
              <TextValidator
                variant='outlined'
                required
                fullWidth
                name='repeatPassword'
                label='Jelszó ismét'
                type='password'
                id='password'
                value={passwordRepeat}
                onChange={(e) => setPasswordRepeat(e.target.value)}
                autoComplete='current-password'
                validators={[`isPasswordMatch`]}
                errorMessages={["Passwords are not matching"]}
              />
            </Grid>
          </Grid>
          <Button
            type='submit'
            fullWidth
            variant='contained'
            color='primary'
            className={styleClasses.submit}
          >
            Sign Up
          </Button>
          <Grid container justify='flex-end'>
            <Grid item>
              <Link href='/' variant='body2'>
                Already have an account? Sign in
              </Link>
            </Grid>
          </Grid>
        </ValidatorForm>
      </div>
    </Container>
  );
}
