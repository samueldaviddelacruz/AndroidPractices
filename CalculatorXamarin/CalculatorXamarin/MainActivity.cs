using System;
using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;

namespace CalculatorXamarin
{
    [Activity(Label = "CalculatorXamarin", MainLauncher = true, Icon = "@drawable/icon")]
    public class MainActivity : Activity
    {
        private EditText Operand1Txt;
        private EditText Operand2Txt;
        private Button AdditionButton;
        private Button SubtractionButton;
        private Button DivisionButton;
        private Button MultiplicationButton;
        private Button ClearButton;
        private TextView ResultTxt;
        protected override void OnCreate(Bundle bundle)
        {
            base.OnCreate(bundle);

           
            // Set our view from the "main" layout resource
            SetContentView(Resource.Layout.Main);
            // FindViewById(Re)
            Operand1Txt = FindViewById<EditText>(Resource.Id.editOperand1);
            Operand2Txt = FindViewById<EditText>(Resource.Id.editOperand2);
            AdditionButton = (Button)FindViewById(Resource.Id.Addition);
            SubtractionButton = (Button)FindViewById(Resource.Id.Subtraction);
            DivisionButton = (Button)FindViewById(Resource.Id.Division);
            MultiplicationButton = (Button)FindViewById(Resource.Id.Multiplication);
            ClearButton = (Button)FindViewById(Resource.Id.Clear);
            ResultTxt = (TextView)FindViewById(Resource.Id.Result);

            CalculatorElements elements = new CalculatorElements(
                Operand1Txt, Operand2Txt, AdditionButton, SubtractionButton, DivisionButton, MultiplicationButton, ClearButton, ResultTxt);
            SimpleCalculator.Make(this, elements);
        }
    }
}

