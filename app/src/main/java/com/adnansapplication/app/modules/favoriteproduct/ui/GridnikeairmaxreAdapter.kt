package com.adnansapplication.app.modules.favoriteproduct.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowGridnikeairmaxreBinding
import com.adnansapplication.app.modules.favoriteproduct.`data`.model.GridnikeairmaxreRowModel
import kotlin.Int
import kotlin.collections.List

class GridnikeairmaxreAdapter(
  var list: List<GridnikeairmaxreRowModel>
) : RecyclerView.Adapter<GridnikeairmaxreAdapter.RowGridnikeairmaxreVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridnikeairmaxreVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridnikeairmaxre,parent,false)
    return RowGridnikeairmaxreVH(view)
  }

  override fun onBindViewHolder(holder: RowGridnikeairmaxreVH, position: Int) {
    val gridnikeairmaxreRowModel = GridnikeairmaxreRowModel()
    // TODO uncomment following line after integration with data source
    // val gridnikeairmaxreRowModel = list[position]
    holder.binding.gridnikeairmaxreRowModel = gridnikeairmaxreRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridnikeairmaxreRowModel>) {
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
      item: GridnikeairmaxreRowModel
    ) {
    }
  }

  inner class RowGridnikeairmaxreVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridnikeairmaxreBinding = RowGridnikeairmaxreBinding.bind(itemView)
  }
}
