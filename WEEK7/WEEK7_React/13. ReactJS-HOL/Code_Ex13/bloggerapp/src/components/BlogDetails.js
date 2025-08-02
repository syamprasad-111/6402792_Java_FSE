import React from 'react'
import { blog } from './Data'
function BlogDetails() {
   return (
     <div style={{display:'flex',flexDirection:'column',rowGap:'10px'}}>
      <h1>Blog Details</h1>
       {blog.map((blogData)=>(
         <div>
           <h1>{blogData.name}</h1>
           <h4>{blogData.author}</h4>
           <p>{blogData.des}</p>
         </div>
       ))}
     </div>
   )
}

export default BlogDetails