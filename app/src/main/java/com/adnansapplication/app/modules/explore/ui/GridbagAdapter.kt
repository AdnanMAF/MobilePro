package com.adnansapplication.app.modules.explore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowGridbagBinding
import com.adnansapplication.app.modules.explore.`data`.model.GridbagRowModel
import kotlin.Int
import kotlin.collections.List

class GridbagAdapter(
  var list: List<GridbagRowModel>
) : RecyclerView.Adapter<GridbagAdapter.RowGridbagVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGridbagVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_gridbag,parent,false)
    return RowGridbagVH(view)
  }

  override fun onBindViewHolder(holder: RowGridbagVH, position: Int) {
    val gridbagRowModel = GridbagRowModel()
    // TODO uncomment following line after integration with data source
    // val gridbagRowModel = list[position]
    holder.binding.gridbagRowModel = gridbagRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GridbagRowModel>) {
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
      item: GridbagRowModel
    ) {
    }
  }

  inner class RowGridbagVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGridbagBinding = RowGridbagBinding.bind(itemView)
  }
}
