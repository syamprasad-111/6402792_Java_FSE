import React from 'react'
import { IndianPlayers } from '../PlayersData'

function IndianPlayersMerged() {
  return (
    <div>
        <h1>List of Indian Players Merged</h1>
        <ul>
            {IndianPlayers.map((player) => {
                return <li>Mr. {player}</li>
            })}
        </ul>
    </div>
  )
}

export default IndianPlayersMerged