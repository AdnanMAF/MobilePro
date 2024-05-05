package com.adnansapplication.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowGridvectorOneBinding
import com.adnansapplication.app.modules.explore.`data`.model.GridvectorOneRowModel
import kotlin.Int
import kotlin.collections.List

class GridvectorOneAdapter(
  var list: List<GridvectorOneRowModel>
) : RecyclerView.Adapter<GridvectorOneAdapter.RowGridvectorOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridvectorOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridvector_one,parent,false)
    return RowGridvectorOneVH(view)
  }

  override fun onBindViewHolder(holder: RowGridvectorOneVH, position: Int) {
    val gridvectorOneRowModel = GridvectorOneRowModel()
    // TODO uncomment following line after integration with data source
    // val gridvectorOneRowModel = list[position]
    holder.binding.gridvectorOneRowModel = gridvectorOneRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridvectorOneRowModel>) {
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
      item: GridvectorOneRowModel
    ) {
    }
  }

  inner class RowGridvectorOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridvectorOneBinding = RowGridvectorOneBinding.bind(itemView)
  }
}
