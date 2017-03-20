package thisnthat.fadinganimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean clicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView shark = (ImageView) findViewById(R.id.shark);
        shark.setTranslationX(1000);

    }

    public void fade(View view)
    {
        ImageView shark = (ImageView) findViewById(R.id.shark);
        ImageView shark2 = (ImageView) findViewById(R.id.shark2);


        //shark.animate().translationY(100f).setDuration(2000);
        if(!clicked)
        {
            shark2.animate().translationYBy(-900).translationXBy(200).scaleX(2f).scaleY(2f).setDuration(4000);
            shark.animate().alpha(1).translationX(0).rotationBy(1800).setDuration(5000);
            clicked = true;
        }
        else
        {
            shark2.animate().translationYBy(900).translationXBy(-200).scaleX(1f).scaleY(1f).setDuration(4000); // move 900 vertical -200 horizontal  1f larger for 4 seconds
            shark.animate().alpha(1).translationXBy(1000).rotationBy(1800).setDuration(5000);
            clicked = false;
        }





    }

}
