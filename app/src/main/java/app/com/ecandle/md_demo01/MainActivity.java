package app.com.ecandle.md_demo01;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton myFab = (FloatingActionButton)  findViewById(R.id.myFAB);

        Toolbar mToolbar = (Toolbar) findViewById(R.id.miToolbar);

        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Toast.makeText(MainActivity.class,"demo FAB",Toast.LENGTH_LONG);

                MostraMsj();
            }
        });
    }

    void MostraMsj(){
        Toast.makeText(this, "Demo FAB ", Toast.LENGTH_LONG).show();

    }
}
