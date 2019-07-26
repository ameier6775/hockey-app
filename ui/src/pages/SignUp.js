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
      <div
        style={{
          color: 'gold',
        }}
      >
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
              <b>Sign Up</b>
            </Typography>
            <Typography>
              <TextField
                marginLeft="100px"
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
              <TextField
                type="password"
                placeholder="verify"
                style={{
                  marginTop: '10px',
                  border: 'solid orange',
                }}
              ></TextField>
            </Typography>
            <Typography>
              <div>
                <Button color="primary">
                  <em>SIGN UP</em>
                </Button>
              </div>
            </Typography>
            Already have an account?{' '}
            <Link color="primary" to={`/login`}>
              <em>LOGIN</em>
            </Link>
          </CardContent>
        </Card>
      </div>
    </Layout>
  )
}
