import React from 'react'
import {books} from './Data'
function BookDetails() {
  return (
    <div style={{display:'flex',flexDirection:'column',rowGap:'10px'}}>
      <h1>Book Details</h1>
      {books.map((bookData)=>(
        <div>
          <h2>{bookData.id} - {bookData.bname}</h2>
          <h4>{bookData.price}</h4>
        </div>
      ))}
    </div>
  )
}

export default BookDetails