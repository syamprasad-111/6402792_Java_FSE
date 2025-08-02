import React from 'react'
import { players } from '../PlayersData'

function ScoreLessThan70() {
    return (
        <div>
            <h1>List of Players having Score Less than 70</h1>
            <ul>
                {players.filter((player) => player.score < 70).map((player) => {
                    return <li>Mr. {player.name} {player.score}</li>
                })}
            </ul>
        </div>
    )
}

export default ScoreLessThan70