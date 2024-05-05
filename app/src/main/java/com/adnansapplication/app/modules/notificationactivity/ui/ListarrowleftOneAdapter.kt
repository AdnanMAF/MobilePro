package com.adnansapplication.app.modules.notificationactivity.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowListarrowleftOneBinding
import com.adnansapplication.app.modules.notificationactivity.`data`.model.ListarleftOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListarrowleftOneAdapter(
  var list: List<ListarleftOneRowModel>
) : RecyclerView.Adapter<ListarrowleftOneAdapter.RowListarrowleftOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListarrowleftOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listarrowleft_one,parent,false)
    return RowListarrowleftOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListarrowleftOneVH, position: Int) {
    val listarleftOneRowModel = ListarleftOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listarleftOneRowModel = list[position]
    holder.binding.listarleftOneRowModel = listarleftOneRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListarleftOneRowModel>) {
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
      item: ListarleftOneRowModel
    ) {
    }
  }

  inner class RowListarrowleftOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListarrowleftOneBinding = RowListarrowleftOneBinding.bind(itemView)
  }
}
