package com.example.submission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListTankAdapter(private val listTank: ArrayList<Tank>) : RecyclerView.Adapter<ListTankAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Tank)
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvOrigin: TextView = itemView.findViewById(R.id.tv_item_origin)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_tank, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tank = listTank[position]

        Glide.with(holder.itemView.context).load(tank.gambar_tank)
            .apply(RequestOptions().override(200, 200)).into(holder.imgPhoto)

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listTank[holder.adapterPosition]) }

        holder.tvName.text = tank.name_tank
        holder.tvOrigin.text = tank.negara_tank
    }

    override fun getItemCount(): Int {
        return listTank.size
    }
}