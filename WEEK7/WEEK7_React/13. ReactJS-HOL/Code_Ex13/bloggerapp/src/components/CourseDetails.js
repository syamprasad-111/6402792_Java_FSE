import React from 'react'
import { course } from './Data'
function CourseDetails() {
  return (
    <div style={{display:'flex',flexDirection:'column',rowGap:'10px'}} >
      <h1>Course Details</h1>
      {course.map((courseData)=>(
        <div>
          <h1>{courseData.name}</h1>
          <h4>{courseData.date}</h4>
        </div>
      ))}
    </div>
  )
}
export default CourseDetails