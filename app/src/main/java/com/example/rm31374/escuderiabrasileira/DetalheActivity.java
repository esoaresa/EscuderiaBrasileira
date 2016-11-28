package com.example.rm31374.escuderiabrasileira;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import com.example.rm31374.escuderiabrasileira.model.Time;

public class DetalheActivity extends AppCompatActivity {
    private ImageView imagem;
    private TextView desc;
    private CollapsingToolbarLayout collapsingToolbar;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        //toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        imagem = (ImageView) findViewById(R.id.ivEscudo);
        desc = (TextView) findViewById(R.id.tvNome);

        if (getIntent() != null) {
            try {
                Time time = getIntent().getParcelableExtra("Time");
                InputStream ims = getAssets().open(time.getEscudo());
                Drawable d = Drawable.createFromStream(ims, null);
                imagem.setImageDrawable(d);
                // collapsingToolbar.setTitle(carro.getNome());

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

        }
    }
}

