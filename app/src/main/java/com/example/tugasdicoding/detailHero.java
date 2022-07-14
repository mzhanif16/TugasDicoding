package com.example.tugasdicoding;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class detailHero extends AppCompatActivity {

    ImageView tvimage;
    TextView tvname,tvdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        tvname = findViewById(R.id.tv_item_name);
        tvimage = findViewById(R.id.img_item_photo);
        tvdetail = findViewById(R.id.tv_item_detail);

        ActionBar JUDUL = getSupportActionBar();
        JUDUL.setTitle("Detail Hero");
        JUDUL.setDisplayHomeAsUpEnabled(true);

        getIncomingExtra();

    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("Image")&& getIntent().hasExtra("nama_hero")&& getIntent().hasExtra("detail_hero")){
            Integer Imagehero = getIntent().getIntExtra("Image",0);
            String namahero = getIntent().getStringExtra("nama_hero");
            String detailhero = getIntent().getStringExtra("detail_hero");

            setDataActivity(Imagehero,namahero,detailhero);
        }
    }
    private void setDataActivity(Integer Imagehero, String namahero, String detailhero){

        Glide.with(this)
                .load(Imagehero)
                .into(tvimage);
        tvname.setText(namahero);
        tvdetail.setText(detailhero);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}