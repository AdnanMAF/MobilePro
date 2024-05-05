package com.adnansapplication.app.modules.notificationoffer.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowListsortBinding
import com.adnansapplication.app.modules.notificationoffer.`data`.model.ListsortRowModel
import kotlin.Int
import kotlin.collections.List

class ListsortAdapter(
  var list: List<ListsortRowModel>
) : RecyclerView.Adapter<ListsortAdapter.RowListsortVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsortVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsort,parent,false)
    return RowListsortVH(view)
  }

  override fun onBindViewHolder(holder: RowListsortVH, position: Int) {
    val listsortRowModel = ListsortRowModel()
    // TODO uncomment following line after integration with data source
    // val listsortRowModel = list[position]
    holder.binding.listsortRowModel = listsortRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsortRowModel>) {
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
      item: ListsortRowModel
    ) {
    }
  }

  inner class RowListsortVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsortBinding = RowListsortBinding.bind(itemView)
  }
}
