import {Component} from "@angular/core";
import {Calculator} from "./Calculator"
import {SimpleCalculator} from "./SimpleCalculator"
@Component({
    selector: "simple-calculator",
    templateUrl: "calculator.component.html",
})
export class SimpleCalculatorPage {
    private simpleCalculator:Calculator;
    public result:number;
   
    constructor(){
    this.result=0.0;
    this.simpleCalculator = new SimpleCalculator();
    }

    public Add(operand1:number,operand2:number){
        console.log(operand1,operand2);
        this.result = this.simpleCalculator.Add(operand1,operand2);   
    }

    public Subtract(operand1:number,operand2:number){

      this.result = this.simpleCalculator.Subtract(operand1,operand2);  
    }
    public Multiply(operand1:number,operand2:number){

      this.result = this.simpleCalculator.Multiply(operand1,operand2);  
    }
    public Divide(operand1:number,operand2:number){
        this.result = this.simpleCalculator.Divide(operand1,operand2);  
    }

}
