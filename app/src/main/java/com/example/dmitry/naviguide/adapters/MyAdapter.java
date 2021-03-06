package com.example.dmitry.naviguide.adapters;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dmitry.naviguide.R;
import com.example.dmitry.naviguide.RoutesListActivity;
import com.example.dmitry.naviguide.RoutesSingletone;
import com.example.dmitry.naviguide.Route;


import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Route> routes;
    private Context context;

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        Button changeBtn;
        ImageView image;

        ViewHolder(View v) {
            super(v);
            changeBtn = v.findViewById(R.id.chngBtn);
            textView = v.findViewById(R.id.textView);
            image = v.findViewById(R.id.image);
        }
    }

    public MyAdapter(Context context) {
        this.context = context;
//        routsNames = new String[]{"Центр Москвы", "Древняя Москва",  "Культурная Москва", "Шоппинг в Москве",
//                                  "Ночная Москва", "Парки Москвы", "Мраморные пещеры Крыма",
//                                  "Грязевые вулканы Гобустана", "Лучшие граффити Берлина",
//                                  };
        routes = RoutesSingletone.getInstance().getRoutes();
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Route cur_route = routes.get(position);
        holder.textView.setText(cur_route.name);
        holder.textView.setTypeface(Typeface.createFromAsset(
                context.getAssets(), "font/lobster.otf"));

        ChangeBtnListener cbl = new ChangeBtnListener(position);
        holder.changeBtn.setOnClickListener(cbl);
        int resourceId = context.getResources().getIdentifier(cur_route.picture, "drawable", context.getPackageName());
        holder.image.setImageResource(resourceId);
        holder.image.setOnClickListener(cbl);
    }


    private class ChangeBtnListener implements View.OnClickListener {

        private int position;
        ChangeBtnListener(int position){
            this.position = position;
        }

        @Override
        public void onClick(View view) {
            if (context instanceof RoutesListActivity)
                ((RoutesListActivity) context).callRouteActivity(position);
        }
    }

    @Override
    public int getItemCount() {
        return routes.size();
    }
}