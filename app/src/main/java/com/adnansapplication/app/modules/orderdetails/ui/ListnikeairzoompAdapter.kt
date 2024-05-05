package com.adnansapplication.app.modules.orderdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowListnikeairzoompBinding
import com.adnansapplication.app.modules.orderdetails.`data`.model.ListnikeairzoompRowModel
import kotlin.Int
import kotlin.collections.List

class ListnikeairzoompAdapter(
  var list: List<ListnikeairzoompRowModel>
) : RecyclerView.Adapter<ListnikeairzoompAdapter.RowListnikeairzoompVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnikeairzoompVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnikeairzoomp,parent,false)
    return RowListnikeairzoompVH(view)
  }

  override fun onBindViewHolder(holder: RowListnikeairzoompVH, position: Int) {
    val listnikeairzoompRowModel = ListnikeairzoompRowModel()
    // TODO uncomment following line after integration with data source
    // val listnikeairzoompRowModel = list[position]
    holder.binding.listnikeairzoompRowModel = listnikeairzoompRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnikeairzoompRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListnikeairzoompRowModel
    ) {
    }
  }

  inner class RowListnikeairzoompVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnikeairzoompBinding = RowListnikeairzoompBinding.bind(itemView)
  }
}
