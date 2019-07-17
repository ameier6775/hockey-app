import React from 'react'
import Layout from '../components/Layout'
import axios from 'axios'
import { Paper, Typography, Card, CardContent } from '@material-ui/core'

class Player extends React.Component {
  constructor() {
    super()
    this.state = {
      name: '',
      playerId: '',
      age: '',
      team: {
        name: '',
        id: '',
      },
      nationality: '',
      position: {
        name: '',
        shortName: '',
      },
      link: '',
      captain: '',
    }
  }

  async componentDidMount() {
    const playersData = await axios.get(
      `http://localhost:8080/player/${this.props.match.params.id}`
    )
    const player = playersData.data.people[0]

    console.log(playersData.data.people[0].fullName)

    this.setState({
      name: player.fullName,
      playerId: player.id,
      age: player.currentAge,
      team: {
        name: player.currentTeam.name,
        id: player.currentTeam.id,
      },
      nationality: player.nationality,
      position: {
        name: player.primaryPosition.name,
        shortName: player.primaryPosition.abbreviation,
      },
      link: player.link,
      captain: player.captain,
    })
  }

  render() {
    return (
      <Layout>
        <div>
          <Paper
            style={{
              position: '-webkit-sticky',
              position: 'sticky',
              top: 0,
              marginTop: 15,
              border: '3px solid black',
            }}
            elevation={10}
          >
            <Typography variant="h3">
              <center>{this.state.name}'s Stats</center>
            </Typography>
          </Paper>
          <Card
            style={{
              width: '400px',
              margin: '10px',
              textAlign: 'left',
            }}
            key={this.state.fullName}
          >
            <CardContent>
              <Typography>{this.state.fullName}</Typography>
            </CardContent>
          </Card>
        </div>
      </Layout>
    )
  }
}

export default Player
