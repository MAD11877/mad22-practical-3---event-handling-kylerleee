package sg.edu.np.mad.practical2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ImageView iv = findViewById(R.id.alert_img);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ad = new AlertDialog.Builder(ListActivity.this);
                ad.setTitle("Profile");
                ad.setMessage("MADness");
                ad.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                ad.setPositiveButton("View", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Random r = new Random();
                        int randint = r.nextInt(1000000000);
                        Intent intent = new Intent(ListActivity.this, MainActivity.class);
                        intent.putExtra("random", randint);
                        startActivity(intent);
                    }
                });
                AlertDialog imgAlert = ad.create();
                imgAlert.show();
            }
        });
    }
}