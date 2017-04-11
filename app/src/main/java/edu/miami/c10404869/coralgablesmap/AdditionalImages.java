package edu.miami.c10404869.coralgablesmap;
//-----------------------------------------------------------------------------
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

//-----------------------------------------------------------------------------
public class AdditionalImages extends Activity {
//-----------------------------------------------------------------------------
    private int extra_id;
    private int next_extra_id;
    private int prev_extra_id;
//-----------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional_images);
        Intent intent = getIntent();
        extra_id = intent.getIntExtra("extra_id", 0);
        populate();
        ImageView main_image = (ImageView)findViewById(R.id.main_image);
        main_image.setOnTouchListener(new OnSwipeTouchListener(this) {
            public void onSwipeRight() {
                extra_id = prev_extra_id;
                populate();
            }
            public void onSwipeLeft() {
                extra_id = next_extra_id;
                populate();
            }
        });
    }
//-----------------------------------------------------------------------------
    public void populate() {

        ImageView mainImage = (ImageView)findViewById(R.id.main_image);

        switch (extra_id) {
            case 1:
                mainImage.setImageResource(R.drawable.building01exterior01);
                next_extra_id = 2;
                prev_extra_id = 9;
                break;
            case 2:
                mainImage.setImageResource(R.drawable.building01exterior02);
                next_extra_id = 3;
                prev_extra_id = 1;
                break;
            case 3:
                mainImage.setImageResource(R.drawable.building01exterior03);
                next_extra_id = 4;
                prev_extra_id = 2;
                break;
            case 4:
                mainImage.setImageResource(R.drawable.building01exterior04);
                next_extra_id = 5;
                prev_extra_id = 3;
                break;
            case 5:
                mainImage.setImageResource(R.drawable.building01exterior05);
                next_extra_id = 6;
                prev_extra_id = 4;
                break;
            case 6:
                mainImage.setImageResource(R.drawable.building01exterior06);
                next_extra_id = 7;
                prev_extra_id = 5;
                break;
            case 7:
                mainImage.setImageResource(R.drawable.building01exterior07);
                next_extra_id = 8;
                prev_extra_id = 6;
                break;
            case 8:
                mainImage.setImageResource(R.drawable.building01exterior08);
                next_extra_id = 9;
                prev_extra_id = 7;
                break;
            case 9:
                mainImage.setImageResource(R.drawable.building01exterior09);
                next_extra_id = 1;
                prev_extra_id = 8;
                break;
            case 10:
                mainImage.setImageResource(R.drawable.building01interior01);
                next_extra_id = 11;
                prev_extra_id = 14;
                break;
            case 11:
                mainImage.setImageResource(R.drawable.building01interior02);
                next_extra_id = 12;
                prev_extra_id = 10;
                break;
            case 12:
                mainImage.setImageResource(R.drawable.building01interior03);
                next_extra_id = 13;
                prev_extra_id = 11;
                break;
            case 13:
                mainImage.setImageResource(R.drawable.building01interior04);
                next_extra_id = 14;
                prev_extra_id = 12;
                break;
            case 14:
                mainImage.setImageResource(R.drawable.building01interior05);
                next_extra_id = 10;
                prev_extra_id = 13;
                break;
            default:
                break;
        }
    }
}
