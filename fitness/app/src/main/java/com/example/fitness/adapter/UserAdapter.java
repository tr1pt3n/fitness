package com.example.fitness.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fitness.R;
import com.example.fitness.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    private User user;

    public UserAdapter(User mUser) {
        this.user = mUser;
    }

    public void setUser(User user) {
        this.user = user;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.bind(user);
    }

    @Override
    public int getItemCount() {
        return user != null ? 1 : 0;
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView tvName, tvUsername, tvEmail;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvUsername = itemView.findViewById(R.id.tvUsername);
            tvEmail = itemView.findViewById(R.id.tvEmail);
        }

        public void bind(User user) {
            tvName.setText(user.getName());
            tvUsername.setText(user.getUsername());
            tvEmail.setText(user.getEmail());
        }
    }
}
