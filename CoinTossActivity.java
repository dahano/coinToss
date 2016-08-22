package ofirdahan.com.coinflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class CoinTossActivity extends AppCompatActivity {
    // Declare our view variables
    private TextView mHeadsview;
    private TextView mTailsview;
    private Button mFlipButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin_toss);


        // Assign the views from the layout file to the corresponding variables
        mHeadsview = (TextView) findViewById(R.id.heads);
        mTailsview = (TextView) findViewById(R.id.tails);
        mFlipButton = (Button) findViewById(R.id.button);

        mHeadsview.setText("");

        View.OnClickListener listener = new View.OnClickListener() {
            Random randomFlip = new Random();
            int result;
            
            @Override
            public void onClick(View v) {
                // The button was clicked so Hide either the Heads or Tails
                result = randomFlip.nextInt(2);

                if(result == 0){
                    enableHeads();

                }else {
                    enableTails();
                }
            }

            private void enableTails() {
                mHeadsview.setText("");
                mTailsview.setText("Tails");
            }

            private void enableHeads() {
                mHeadsview.setText("Heads");
                mTailsview.setText("");
            }
        };

        mFlipButton.setOnClickListener(listener);

    }


}
