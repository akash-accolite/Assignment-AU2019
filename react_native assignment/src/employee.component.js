import React,{Component} from 'react';
import AddComponent from './addemployee.component';
import ListComponent from './listemployee.component';
import Department from './department';
import Showdepartment from './showdepartment';
class Employee extends Component{
    state= {

        departments: [
            
        ] ,
        employees:[
            {
                name: "raviteja",
                lname: "V",
                age: 21,
                Department :"IT",
                designation: "intern",
                location: "Mangalore, Karnataka,India, Asia, World, Earth"
              },
              {
                name: "Devraj",
                lname: "M",
                age: 21,
                Department:"IT",
                designation: "intern",
                location: "Bangalore,Karnataka,India, Asia, World, Earth"
              },
              {
                name: "kumar",
                lname: "santanu",
                age: 26,
                Department:"IT",
                designation: "intern",
                location: "Patna, Bihar,India, Asia, World, Earth"
              }
        ]
    };
    onEmployeeAdded = (newEmployeeData)=>{
        console.log("new e Data",newEmployeeData)
        let employees=[...this.state.employees];
        employees.push(newEmployeeData)
        this.setState({employees:employees})
    }
    onDepartmentAdded = (newDepartmentData)=>{
        console.log("new Data",newDepartmentData)
        let newdepartments=[...this.state.departments];
        newdepartments.push(newDepartmentData)
        this.setState({departments:newdepartments})
    }
    render(){
        return(
            <React.Fragment>
                <AddComponent onEmpAdd={this.onEmployeeAdded}>
                </AddComponent>
                <ListComponent employee={this.state.employees}>
                </ListComponent>
                <Department onDepAdd={this.onDepartmentAdded} ></Department>
                <Showdepartment depname={this.state.departments}></Showdepartment>
            </React.Fragment>
        );
    }
}
export default Employee;