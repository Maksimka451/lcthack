package com.example.calendar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SlotAdapter extends RecyclerView.Adapter<SlotAdapter.SlotViewHolder> {

    private List<Slot> slots;
    private ItemClickListener itemClickListener;

    public SlotAdapter(List<Slot> slots) {
        this.slots = slots;
    }
    public void setItemClickListener(ItemClickListener listener) {
        this.itemClickListener = listener;
    }


    @NonNull
    @Override
    public SlotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slot, parent, false);
        return new SlotViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull SlotViewHolder holder, int position) {
        Slot slot = slots.get(position);

        holder.departmentTextView.setText(slot.getDepartment());
        holder.dateTextView.setText(slot.getDate());
        holder.timeTextView.setText(slot.getTime());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (itemClickListener != null) {
                    itemClickListener.onItemClick(position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return slots.size();
    }

    public class SlotViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;
        private TextView departmentTextView;
        private TextView dateTextView;
        private TextView timeTextView;

        public SlotViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            departmentTextView = itemView.findViewById(R.id.departmentTextView);
            dateTextView = itemView.findViewById(R.id.dateTextView);
            timeTextView = itemView.findViewById(R.id.timeTextView);
        }
    }
}
