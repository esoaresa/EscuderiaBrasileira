package com.example.rm31374.escuderiabrasileira.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rm31374.escuderiabrasileira.R;
import com.example.rm31374.escuderiabrasileira.listener.TimeOnClickListener;
import com.example.rm31374.escuderiabrasileira.model.Time;
import com.squareup.picasso.Picasso;

import java.util.List;

import retrofit2.Call;

/**
 * Created by rm31374 on 28/11/2016.
 */
public class TimeListAdapter extends RecyclerView.Adapter<TimeListAdapter.TimeViewHolder> {

    private final List<Time> times;
    private Context context;
    private TimeOnClickListener clickListener;

    public TimeListAdapter(List<Time> times, Context context, TimeOnClickListener clickListener) {
        this.times = times;
        this.context = context;
        this.clickListener = clickListener;
    }

    @Override
    public TimeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context)
                .inflate(R.layout.item_time, parent, false);

        return new TimeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final TimeViewHolder holder, final int position) {

        holder.tvNome.setText(times.get(position).getNome());
        holder.tvAnoFundacao.setText(times.get(position).getAnoFundacao());
        holder.tvEstado.setText(times.get(position).getEstado());

        Picasso.with(context)
                .load(times.get(position).getEscudo())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivEscudo);

        if (clickListener != null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickListener.onClick(holder.itemView, position);
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return times.size();
    }

    public Time getItem(int position){

        return times.get(position);

    }

    public static class TimeViewHolder extends RecyclerView.ViewHolder{

        TextView  tvNome;
        TextView  tvEstado;
        ImageView ivEscudo;
        TextView  tvAnoFundacao;

        public TimeViewHolder(View itemView) {
            super(itemView);

            tvNome          = (TextView)itemView.findViewById(R.id.tvNome);
            tvEstado        = (TextView)itemView.findViewById(R.id.tvEstado);
            tvAnoFundacao   = (TextView)itemView.findViewById(R.id.tvAnoFundacao);
            ivEscudo        = (ImageView)itemView.findViewById(R.id.ivEscudo);

        }
    }

}

