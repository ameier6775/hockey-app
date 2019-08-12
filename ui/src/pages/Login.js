import React from 'react'
import {
  Typography,
  Card,
  CardContent,
  Button,
  TextField,
} from '@material-ui/core'
import Layout from '../components/Layout'
import { Link } from 'react-router-dom'
import Axios from 'axios'

class Login extends React.Component {
  constructor(props) {
    super(props)

    this.state = { username: '', password: '' }
    this.handleLogin = this.handleLogin.bind(this)
    this.handleChange = this.handleChange.bind(this)
  }

  async handleLogin(e) {
    e.preventDefault()

    const response = await Axios.post(`http://localhost:8080/login`, {
      username: this.state.username,
      password: this.state.password,
    })
  }
  handleChange(e) {
    this.setState({ [e.target.name]: e.target.value })
  }

  async componentDidMount() {}
  render() {
    return (
      <Layout>
        <div>
          <form>
            <Card
              style={{
                margin: '10px',
                marginTop: '100px',
                marginBottom: '100px',
                marginLeft: '18%',
                display: 'flex',
                flexWrap: 'wrap',
                width: '58%',
                height: 'auto',
              }}
            >
              <CardContent>
                <Typography variant="h3">
                  <b>Login</b>
                </Typography>
                <TextField
                  fullWidth
                  margin="normal"
                  label="Username"
                  name="user"
                  type="text"
                  onChange={this.handleChange}
                  placeholder="username"
                  variant="outlined"
                ></TextField>
                <TextField
                  fullWidth
                  margin="normal"
                  label="Password"
                  type="password"
                  onChange={this.handleChange}
                  placeholder="password"
                  variant="outlined"
                ></TextField>
                <Typography component="label">
                  <Button onSubmit={this.handleLogin} color="primary">
                    <em>LOGIN</em>
                  </Button>
                </Typography>
                Don't have an account?{' '}
                <Link color="primary" to={`/signup`}>
                  <em>SIGN UP</em>
                </Link>
              </CardContent>
            </Card>
          </form>
        </div>
      </Layout>
    )
  }
}
export default Login
