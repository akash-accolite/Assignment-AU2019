//declared one function for employee
/*user is giving input for employee details
then details is showing using one function displayfunction
in this code i am making use of 
-prototype,prompt,console.log()
,__proto__,bind
*/

//function for emp object

function employee(fname,lname,des,doj,eml,cno,strt,city)
{
  
  this.Firstname = fname;
  this.Lastname = lname;
  this.designation = des;
  this.Dateofjoin = doj;
  this.Email = eml;
  this.Contactnumber=cno;
  this.address={
    Street:strt,
    city:city
  };

//display function
    
 this.displayfunction=function()
{
   console.log(" ");
console.log("Details of Employee");
  
console.log("First name : " +this.Firstname);

console.log("Last name : " +this.Lastname);

console.log("designation : " +this.designation);

console.log("Date of join : " +this.Dateofjoin);

console.log("Email : " +this.Email);

console.log("Contact number : " +this.Contactnumber);

console.log("Full Address :");
   
console.log("Street name : " +this.address.Street);
   
console.log("City number : " +this.address.city);

console.log("company name is" +this.companyname);
 }
  
}

/*Adding property with prototype
now all the objects of employee has company name as accolite
*/
employee.prototype.companyname="Accolite";

//asking from user if he wants to enter employee details or not

var ans=prompt("if you want to enter employee detail please press y/Y or else press n/N");
if("Y"===ans.toUpperCase())
{
//var n=prompt("How many employee do you want in your company");

//for(var i=0;i<n;i++)
//  {
var  fname=prompt("Enter the name");
var  lname=prompt("Enter the last name");
var  des=prompt("enter the designation");
var  doj=prompt("Enter the joining date");
var  eml=prompt("Enter the Email id");
var  cno=prompt("Enter the contact number");
var  strt=prompt("Enter the street name");
var  cty=prompt("Enter the city name");
    var  lastcompany=prompt("Enter the last company  name");
var emp=new employee(fname,lname,des,doj,eml,cno,strt,cty);
    emp.displayfunction();
 }
else
    {
        alert("Done!");    //if no the show one alert window
    }


/*using bind to call a function with the this value set explicitly.
bound allows us to easily set which specific object will be bound 
to this when a function or method is invoked
*/

function getjoindate()
{
    console.log("Mr "+this.Firstname +"joined on"+this.Dateofjoin);
}

var fdoj=getjoindate.bind(emp);
fdoj();

//using dunder "__proto" to add property to particular object

emp.__proto__.previouscompany=lastcompany;
console.log("last company name is "+emp.previouscompany);
