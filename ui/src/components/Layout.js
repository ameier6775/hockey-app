import React from 'react'
import { AppBar, Typography } from '@material-ui/core'
import { Link } from 'react-router-dom'

export default props => (
  <div>
    <AppBar style={{ marginBottom: '4000px' }}>
      <ul className="nav-bar">
        <li className="nav-item">
          <Link className="nav-item" to="/">
            <Typography gutterBottom variant="body1">
              Home
            </Typography>
          </Link>
        </li>
        <li className="nav-item">
          <Link className="nav-item" to="/teams">
            <Typography gutterBottom variant="body1">
              Teams
            </Typography>
          </Link>
        </li>
        <li className="nav-item">
          <Link className="nav-item" to="/stats">
            <Typography gutterBottom variant="body1">
              Stats
            </Typography>
          </Link>
        </li>
      </ul>
    </AppBar>
    {props.children}
  </div>
)
