package com.example.logonrm.apprestaula09.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.logonrm.apprestaula09.APIUtils;
import com.example.logonrm.apprestaula09.Linha;
import com.example.logonrm.apprestaula09.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LinhaAdapter extends RecyclerView.Adapter<LinhaAdapter.AndroidViewHolder> {

    private List<Linha> linhas;
    private OnClickItemListener listener;

    public LinhaAdapter(List<Linha> linhas, OnClickItemListener listener) {
        this.linhas = linhas;
        this.listener = listener;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View meuLayout = inflater.inflate(R.layout.android_row,
                parent, false);

        return new AndroidViewHolder(meuLayout);
    }

    @Override
    public void onBindViewHolder(AndroidViewHolder holder, final int position) {

        holder.tvTitulo.setText(linhas.get(position).getNumero());
        holder.tvSubTitulo.setText(linhas.get(position).getCor());

        Picasso.with(holder.itemView.getContext())
                .load(APIUtils.BASE_URL+linhas.get(position).getUrlImage())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.ivLogo);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(linhas.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return linhas.size();
    }

    public class AndroidViewHolder extends RecyclerView.ViewHolder {

        public ImageView ivLogo;
        public TextView tvTitulo;
        public TextView tvSubTitulo;

        public AndroidViewHolder(View itemView) {
            super(itemView);
            ivLogo = (ImageView) itemView.findViewById(R.id.ivlogo);
            tvTitulo = (TextView) itemView.findViewById(R.id.tvTitulo);
            tvSubTitulo = (TextView) itemView.findViewById(R.id.tvSubTitulo);
        }
    }

    public void refreshLinhaAdapter(List<Linha> linhas) {
        this.linhas.clear();
        this.linhas.addAll(linhas);
        notifyDataSetChanged();
    }


}
