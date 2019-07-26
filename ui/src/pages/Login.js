import React from 'react'
import { yellow } from '@material-ui/core/colors'
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
            <Typography>
              <TextField
                type="text"
                placeholder="username"
                style={{
                  marginTop: '10px',
                  border: 'solid orange',
                }}
              ></TextField>
            </Typography>
            <Typography>
              <TextField
                type="password"
                placeholder="password"
                style={{
                  marginTop: '10px',
                  border: 'solid orange',
                }}
              ></TextField>
            </Typography>
            <Typography>
              <div>
                <Button color="primary">
                  <em>LOGIN</em>
                </Button>
              </div>
            </Typography>
            Don't have an account?{' '}
            <Link color="primary" to={`/signup`}>
              <em>SIGN UP</em>
            </Link>
          </CardContent>
        </Card>
      </div>
    </Layout>
  )
}
