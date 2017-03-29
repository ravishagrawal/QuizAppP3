package com.example.android.quizappp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method is called when the order button is clicked.
     */
    int score;

    /**public void increment (View view) {
        quantity= quantity + 1 ;
        if (quantity>100) {
            Toast.makeText(MainActivity.this,
                    "Quantity cannot be larger than 99", Toast.LENGTH_LONG).show();

        }
        display (quantity);
    }

    public void decrement (View view) {
        quantity= quantity - 1;
        if (quantity<0) {
            quantity=1;
            Toast.makeText(MainActivity.this,
                    "Quantity cannot be smaller than one", Toast.LENGTH_LONG).show();
        }
        display(quantity);
    }*/

    public void submitOrder (View view) {

        EditText nameDisplay = (EditText)findViewById(R.id.name);
        String nameResult = nameDisplay.getText().toString();
        nameDisplay.setText(nameResult);

        CheckBox question1a= (CheckBox) findViewById(R.id.a1_1_checkbox);
        boolean hasAnswer1a= question1a.isChecked();

        CheckBox question1b= (CheckBox) findViewById(R.id.a1_2_checkbox);
        boolean hasAnswer1b= question1b.isChecked();

        if (hasAnswer1a) {
            score= score + 1;
        }

        CheckBox question2a= (CheckBox) findViewById(R.id.a2_1_checkbox);
        boolean hasAnswer2a= question1a.isChecked();

        CheckBox question2b= (CheckBox) findViewById(R.id.a2_2_checkbox);
        boolean hasAnswer2b= question1b.isChecked();

        if (hasAnswer2a) {
            score= score + 1;
        }

        CheckBox question3a= (CheckBox) findViewById(R.id.a3_1_checkbox);
        boolean hasAnswer3a= question1a.isChecked();

        CheckBox question3b= (CheckBox) findViewById(R.id.a3_2_checkbox);
        boolean hasAnswer3b= question1b.isChecked();

        if (hasAnswer3a) {
            score= score + 1;
        }

        CheckBox question4a= (CheckBox) findViewById(R.id.a4_1_checkbox);
        boolean hasAnswer4a= question1a.isChecked();

        CheckBox question4b= (CheckBox) findViewById(R.id.a4_2_checkbox);
        boolean hasAnswer4b= question1b.isChecked();

        if (hasAnswer4b) {
            score= score + 1;
        }

        CheckBox question5a= (CheckBox) findViewById(R.id.a5_1_checkbox);
        boolean hasAnswer5a= question1a.isChecked();

        CheckBox question5b= (CheckBox) findViewById(R.id.a5_2_checkbox);
        boolean hasAnswer5b= question1b.isChecked();

        if (hasAnswer5b) {
            score= score + 1;
        }

        CheckBox question6a= (CheckBox) findViewById(R.id.a6_1_checkbox);
        boolean hasAnswer6a= question1a.isChecked();

        CheckBox question6b= (CheckBox) findViewById(R.id.a6_2_checkbox);
        boolean hasAnswer6b= question1b.isChecked();

        if (hasAnswer6b) {
            score= score + 1;
        }


        /**int price= baseprice*quantity;

        String priceMessage= createOrderSummary(price,hasWhippedCream,hasChoclate,nameResult);
        // displayMessage(priceMessage);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Coffee Order Summary");
        intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }*/
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    /**private void display (int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }*/


    /**
     * Calculates the price of the order.
     *
     * @param quantity is the number of cups of coffee ordered
     */
    private int calculatePrice(int quantity) {
        int price = quantity * 5;
        return price;
    }

    /**private String createOrderSummary(int price, boolean addWhippedCream, boolean addChoclate, String nameInput) {
        String priceMessage= "Name: " + nameInput;
        priceMessage= priceMessage + " \nQuantity" + quantity;
        priceMessage= priceMessage + " \nTotal: $" + price;
        priceMessage= priceMessage + " \nWhipped Cream: "+ addWhippedCream;
        priceMessage= priceMessage + " \nChoclate: "+ addChoclate;
        priceMessage= priceMessage + "\n" + getString(R.string.thank_you);
        return priceMessage;
    }*/

    /**
     * This method displays the given text on the screen.

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }*/
}