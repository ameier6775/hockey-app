import React from 'react'
import { BrowserRouter as Router, Route } from 'react-router-dom'
import Home from './pages/Home'
import Stats from './pages/Stats'
import Teams from './pages/Teams'

export default () => {
    return (
        <Router>
            <Route path="/" component={Home} />
            <Route path="/stats" component={Stats} />
            <Route path="/teams" component={Teams} />
        </Router>
    )
}
