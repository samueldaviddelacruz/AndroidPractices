
using Android.Widget;

namespace CalculatorXamarin
{
    public abstract class Calculator
    {
        CalculatorElements calcElements;
        protected Calculator(CalculatorElements elements)
        {
            calcElements = elements;

        }
        public abstract void Add();
        public abstract void SubTract();
        public abstract void Divide();
        public abstract void Multiply();
        public abstract void Clear();

        public EditText getOperand1Txt()
        {
           
            return calcElements.Operand1Txt;
        }

        public EditText getOperand2Txt()
        {
            return calcElements.Operand2Txt;
        }

        public Button getAdditionButton()
        {
            return calcElements.AdditionButton;
        }

        public Button getSubtractionButton()
        {
            return calcElements.SubtractionButton;
        }

        public Button getDivisionButton()
        {
            return calcElements.DivisionButton;
        }

        public Button getMultiplicationButton()
        {
            return calcElements.MultiplicationButton;
        }

        public Button getClearButton()
        {
            return calcElements.ClearButton;
        }

        public TextView getResultTxt()
        {
            return calcElements.ResultTxt;
        }
    }
}