package com.rizki.klinikapp_mi2c.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rizki.klinikapp_mi2c.R
import com.rizki.klinikapp_mi2c.model.ModelListDoctors

class ListDoctorsAdapter(
    val itemDoctorList : List<ModelListDoctors>
) : RecyclerView.Adapter<ListDoctorsAdapter.MyViewHolder>(){
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgItemDoctor : ImageView = itemView.findViewById(R.id.imgItemDoctor)
        var txtNamaDoctor : TextView = itemView.findViewById(R.id.txtNamaDoctor)
        var txtSpesDoctor : TextView = itemView.findViewById(R.id.txtSpesDoctor)
        var txtReviewDoctor : TextView = itemView.findViewById(R.id.txtReviewDoctor)
        var txtJumlahRating : TextView = itemView.findViewById(R.id.txtJumlahRating)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doctors, parent, false)
        return  MyViewHolder(nView)
    }


    override fun getItemCount(): Int {
        return itemDoctorList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val  currentItem = itemDoctorList[position]
        holder.txtNamaDoctor.text = currentItem.NamaDoctor
        holder.txtSpesDoctor.text = currentItem.SpesDoctor
        holder.txtReviewDoctor.text = currentItem.JumlahReview
        holder.txtJumlahRating.text = currentItem.JumlahRating
        holder.imgItemDoctor.setImageResource(currentItem.ImgDoctor)
    }


}