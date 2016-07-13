using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;

namespace CalculatorXamarin
{
    public class SimpleCalculator : Calculator
    {

        double inputValue1 = 0;
        double inputValue2 = 0;
        Activity Activitycontext;
        public static void Make(Activity context, CalculatorElements elements)
        {

            new SimpleCalculator(context, elements);
        }
        private SimpleCalculator(Activity context, CalculatorElements elements) : base(elements)
        {

            Activitycontext = context;
            AddListeners();
         
        }
        private void AddListeners()
        {
            addOnClearListener();
            addOnAdditionListener();
            addOnSubtractionListener();
            addOnDivisionListener();
            addOnMultiplyListener();
           
        }

        private void addOnClearListener()
        {
            getClearButton().Click += delegate
            {
                Clear();
            };
        }

        private void addOnMultiplyListener()
        {
            getMultiplicationButton().Click += delegate
            {

                if (OperandInputsAreValid())
                {
                    getValuesFromOperandInputs();
                    Multiply();
                }
                else
                {
                    Toast.MakeText(Activitycontext, "please enter  numbers in both operand fields", ToastLength.Long).Show();
                }

            };
        }

        private void addOnDivisionListener()
        {
            getDivisionButton().Click += delegate
            {

                if (OperandInputsAreValid())
                {
                    getValuesFromOperandInputs();
                    Divide();
                }
                else
                {
                    Toast.MakeText(Activitycontext, "please enter  numbers in both operand fields", ToastLength.Long).Show();
                }

            };
        }

        private void addOnSubtractionListener()
        {
            getSubtractionButton().Click += delegate
            {

                if (OperandInputsAreValid())
                {
                    getValuesFromOperandInputs();
                    SubTract();
                }
                else
                {
                    Toast.MakeText(Activitycontext, "please enter  numbers in both operand fields", ToastLength.Long).Show();
                }

            };
        }

        private void addOnAdditionListener()
        {
            getAdditionButton().Click += delegate
            {

                if (OperandInputsAreValid())
                {
                    getValuesFromOperandInputs();
                    Add();
                }
                else
                {
                    Toast.MakeText(Activitycontext, "please enter  numbers in both operand fields", ToastLength.Long).Show();
                }

            };
        }

        public override void Add()
        {
            double result = inputValue1 + inputValue2;
            getResultTxt().Text = result.ToString();

            
        }

        public override void SubTract()
        {
            double result = inputValue1 - inputValue2;
            getResultTxt().Text = result.ToString();
        }

        public override void Divide()
        {
            double result = inputValue1 / inputValue2;
            getResultTxt().Text = result.ToString();
        }

        public override void Multiply()
        {
            double result = inputValue1 - inputValue2;
            getResultTxt().Text = result.ToString();
        }

        public override void Clear()
        {
            getOperand1Txt().Text="";
            getOperand2Txt().Text="";
            getResultTxt().Text="0.00";
            getOperand1Txt().RequestFocus();
        }


        private bool OperandInputsAreValid()
        {
            var isValid = getOperand1Txt().Text.Length > 0 && getOperand2Txt().Text.Length > 0;
            return isValid;
        }

        private void getValuesFromOperandInputs()
        {
            inputValue1 = double.Parse(getOperand1Txt().Text);
            inputValue2 = double.Parse(getOperand2Txt().Text);
        }
    }
}