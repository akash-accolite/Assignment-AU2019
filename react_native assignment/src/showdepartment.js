import React , {Component} from 'react';

class Showdepartment extends Component{


render(){
    

    return(

        <div><ol>
            {
             this.props.depname.map((department,i)=>{
                 return (<li> {department.departmentname} </li>

                 )
             })


            }
            </ol>
        </div>

    );

}






}

export default Showdepartment;