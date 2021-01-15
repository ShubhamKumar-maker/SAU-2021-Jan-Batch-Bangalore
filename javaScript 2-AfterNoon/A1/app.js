class input {
    constructor(param) {
        this.input = param;
    }
    calculateLength() {
        return this.input.length;
    };
    getUpperCase() {
        return this.input.toUpperCase();
    };
    getLowerCase() {
        return this.input.toLowerCase();
    };


     Vowel() {
        var name = this.input; 
        let len=this.input.length;
        
        function displayVowel() { 
            var vwl="";
            for(let i=0;i<len;i++)
            {
                
                    if(name[i]=='a'||name[i]=='e'||name[i]=='i'||name[i]=='o'||name[i]=='u'||name[i]=='A')
                    {
                            vwl+=name[i];
                    }
            }
          return vwl; 
        }
        return displayVowel();
      }


      Consonent() {
        var name = this.input; 
        let len=this.input.length;
        
        function displayConsonent() { 
            var cnst="";
            for(let i=0;i<len;i++)
            {
                
                    if(!(name[i]=='a'||name[i]=='e'||name[i]=='i'||name[i]=='o'||name[i]=='u'||name[i]=='A'))
                    {
                            cnst+=name[i];
                    }
            }
          return cnst; 
        }
        return displayConsonent();
      }

      checkNumber(){
          if(/[0-1]/.test(this.input))
         alert("error: string contain number")
          else
          return true;
      }

    
}


  




function callFunction() {
    var inputValue = document.getElementById("inputTxt").value;
    let inputObject = new input(inputValue);
    if(inputObject.checkNumber()){
    document.getElementById("lengthOp").innerHTML = inputObject.calculateLength();
    document.getElementById("ucOp").innerHTML = inputObject.getUpperCase();
    document.getElementById("lcOp").innerHTML = inputObject.getLowerCase();
    document.getElementById("vlOp").innerHTML = inputObject.Vowel();
    document.getElementById("cnOp").innerHTML = inputObject.Consonent();
    }
}