package com.adnansapplication.app.modules.superflashsale.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowGridproducticonBinding
import com.adnansapplication.app.modules.superflashsale.`data`.model.GridproducticonRowModel
import kotlin.Int
import kotlin.collections.List

class GridproducticonAdapter(
  var list: List<GridproducticonRowModel>
) : RecyclerView.Adapter<GridproducticonAdapter.RowGridproducticonVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridproducticonVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridproducticon,parent,false)
    return RowGridproducticonVH(view)
  }

  override fun onBindViewHolder(holder: RowGridproducticonVH, position: Int) {
    val gridproducticonRowModel = GridproducticonRowModel()
    // TODO uncomment following line after integration with data source
    // val gridproducticonRowModel = list[position]
    holder.binding.gridproducticonRowModel = gridproducticonRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridproducticonRowModel>) {
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
      item: GridproducticonRowModel
    ) {
    }
  }

  inner class RowGridproducticonVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridproducticonBinding = RowGridproducticonBinding.bind(itemView)
  }
}
