import React from 'react'
import { AppBar } from '@material-ui/core'
import Layout from '../components/Layout'
import { Paper, Typography } from '@material-ui/core'

// const homeStyle = {
//   border: '5px dashed yellow;',
// }

export default () => {
  return (
    <Layout>
      <Paper>
        <center>
          <Typography variant="h2">HOME PAGE</Typography>
        </center>
      </Paper>
    </Layout>
  )
}
