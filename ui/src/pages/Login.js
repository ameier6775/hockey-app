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

export default () => {
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
                placeholder="username"
                variant="outlined"
              ></TextField>
              <TextField
                fullWidth
                margin="normal"
                label="Password"
                type="password"
                placeholder="password"
                variant="outlined"
              ></TextField>
              <Typography component="label">
                <Button color="primary">
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
