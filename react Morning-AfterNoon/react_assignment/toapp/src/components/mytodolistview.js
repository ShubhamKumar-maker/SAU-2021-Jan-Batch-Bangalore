import React,{useState} from 'react';
 
export const Mytodolistview=(props)=>{
    

   
    

    return (
       
        
                                        
            <p style={{ textDecoration: props.cmp ? "line-through" : "" }}>{props.title},<span> completion time:-</span>{props.date} &nbsp;&nbsp;
            <button onClick={()=>props.completerd(props.index)}>Completed</button>
           
            
            </p>

  

    

       
    )

}