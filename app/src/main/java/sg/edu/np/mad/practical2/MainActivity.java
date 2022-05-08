package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User usr = new User("Kyler", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua \n test \n test", 1, false);

        Button button1 = findViewById(R.id.button);
        TextView username = findViewById(R.id.username);
        username.setText(usr.Name);
        TextView description = findViewById(R.id.description);
        description.setText(usr.Description);
        button1.setText(usr.Followed ? "Unfollow" : "Follow");
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V) {
                if (button1.getText() == "Follow") {
                    button1.setText("Unfollow");
                }
                else{
                    button1.setText("Follow");
                }
                usr.Followed = !usr.Followed;
            }
        });
    }
}