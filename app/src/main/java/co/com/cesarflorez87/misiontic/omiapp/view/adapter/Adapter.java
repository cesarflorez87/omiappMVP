package co.com.cesarflorez87.misiontic.omiapp.view.adapter;


import android.view.LayoutInflater;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import co.com.cesarflorez87.misiontic.omiapp.view.dto.ItemResult;
import co.com.cesarflorez87.misiontic.omiapp.R;


public class Adapter  extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ItemResult> data;

    public Adapter() {
        data = new ArrayList<>();
    }

    public void setData(List<ItemResult> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public void addItem(ItemResult item) {
        data.add(item);
        notifyItemInserted(data.size() - 1);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_resultado, parent);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        ItemResult item = data.get(position);
        ViewHolder holder = null;
        holder.Descripcion.setText(item.getDescripcion());
        holder.Date.setText(item.getDate());

    }

    @Override
    public int getItemCount() { return data == null ? 0 : data.size();}

    protected class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView Icono;
        private final TextView Descripcion;
        private final TextView Date;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Icono = itemView.findViewById(R.id.Icono);
            Descripcion = itemView.findViewById(R.id.Descripcion);
            Date = itemView.findViewById(R.id.Date);
        }
    }
}
