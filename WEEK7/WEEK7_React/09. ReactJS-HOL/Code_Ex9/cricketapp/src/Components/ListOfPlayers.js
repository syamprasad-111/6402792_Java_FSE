import React from 'react'
import { players } from '../PlayersData'

function ListOfPlayers() {
  return (
    <div>
        <h1>List of Players</h1>
        <ul>
            {players.map((player) => {
                return <li>Mr. {player.name} {player.score}</li>
            })}
        </ul>
    </div>
  )
}

export default ListOfPlayers;