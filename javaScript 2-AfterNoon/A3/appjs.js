let student=
    {firstName:"Spider",
    lastName:"Man",
    age:"23",
    gender:"Male",
    roll:"1",
    dob:"10 sep 1997",
    setOccupation(occupation){
            this.occupation=occupation;
    },

    getroll(){
        return this.roll;
    }

    };

    function myfun(){
    var x=document.getElementById('occupation').value;
    student.setOccupation.call(student,x);
        }


   
     let getfulldetail=function(){
            console.log("My name is "+this.firstName + this.lastName+"my age is "+this.age+" gender is "+this.gender+" roll is "+this.roll+" dob is "+this.dob+ "my occupation is "+ this.occupation );
     }


function getdata(){
    let r=document.getElementById('getroll').value;

    if(r==student.getroll())
    {getfulldetail.call(student);}    
}
