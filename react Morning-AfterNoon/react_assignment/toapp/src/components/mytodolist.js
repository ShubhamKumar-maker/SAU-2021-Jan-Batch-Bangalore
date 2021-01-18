import React,{useState} from 'react';
import '../components/mytodostyle.css'
import {Mytodolistview} from '../components/mytodolistview'


export const Mytodolist=()=>{
    const [tasks, setTasks] = useState([
        {
            title: "Grab some Pizza",
            date:"21:9",
            completed:true,
           
        },
        {
            title: "Do your workout",
            date:"20:2",
            completed:false,
            
        },
        {
            title: "Hangout with friends",
            date:"20:1",
            completed:false,
            
        }
    ]);
   
   
    
    const [data1,setdata1]=useState(null)
    const [data2,setdat2]=useState(null);
    const[len,setlen]=useState(tasks.length);
    


    const addtasks=()=>{
        const newTasks = [...tasks, { title:data1,date:data2, completed: false }];
        setTasks(newTasks);
    console.log(data1);
    setlen(newTasks.length);

    }


    const SortTask=()=>
    {
     var sortedTesk=tasks.slice(0);
     sortedTesk.sort(function(a,b) {
     return parseInt(a.date.substring(0,2))*60+parseInt(a.date.substring(3))-(parseInt(b.date.substring(0,2))*60+parseInt(b.date.substring(3)));
     });
     console.log(sortedTesk);
     setTasks(sortedTesk);
     console.log(sortedTesk.length);
    }

    

   function handle(evt)
   {
       setdata1(evt.target.value);
       console.log(evt.target.value);
   }
   function handle2(event)
   {
        setdat2(event.target.value);
   }



   const removeTask = key => {
    const newTasks = [...tasks];
    newTasks.splice(key, 1);
    setTasks(newTasks);
    console.log(key);
    setlen(newTasks.length);

    
};
const completedfun=(index)=>{
    const newTasks = [...tasks];
            newTasks[index].completed = true;
            setTasks(newTasks);
}




    return (
        <>
                <h1>My Todo List</h1>
                <h4>total Task:-{len}</h4><br>
                </br>
              <span>Enter Task:-</span><input type="text"  className="textbox" placeholder="Enter task" onChange={handle} />
              <span>Completion Time:-</span><input type="Time"   className="textbox" onChange={handle2}/><br></br>
              <button onClick={addtasks}>Add</button>
              <br></br>
              <hr></hr>
              
              <div>
                    <button onClick={SortTask}>sort</button>
                </div>
        
              <ul>
        {tasks.map((item,key)=> {
          return <li item={item} key={key} ><Mytodolistview title={item.title} date={item.date} index={key} cmp={item.completed} completerd={completedfun.bind(this)} /><button onClick={()=>{removeTask(key)}}>Delete</button></li>;
        })}

        
      </ul> 




             
               


        </>
    );
} 