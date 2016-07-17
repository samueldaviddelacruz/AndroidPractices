import {Calculator} from "./Calculator";
export class SimpleCalculator implements Calculator {

    public Add(operand1:number,operand2:number): number {

        return (+operand1)+(+operand2);
    }

    public Subtract(operand1:number,operand2:number): number {

        return (+operand1)-(+operand2);
    }
    public Multiply(operand1:number,operand2:number): number {

        return (+operand1)*(+operand2);
    }
    public Divide(operand1:number,operand2:number): number {

        return (+operand1)/(+operand2);
    }

}
