package com.adnansapplication.app.modules.changepassword.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowListoldpasswordBinding
import com.adnansapplication.app.modules.changepassword.`data`.model.ListoldpasswordRowModel
import kotlin.Int
import kotlin.collections.List

class ListoldpasswordAdapter(
  var list: List<ListoldpasswordRowModel>
) : RecyclerView.Adapter<ListoldpasswordAdapter.RowListoldpasswordVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListoldpasswordVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listoldpassword,parent,false)
    return RowListoldpasswordVH(view)
  }

  override fun onBindViewHolder(holder: RowListoldpasswordVH, position: Int) {
    val listoldpasswordRowModel = ListoldpasswordRowModel()
    // TODO uncomment following line after integration with data source
    // val listoldpasswordRowModel = list[position]
    holder.binding.listoldpasswordRowModel = listoldpasswordRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListoldpasswordRowModel>) {
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
      item: ListoldpasswordRowModel
    ) {
    }
  }

  inner class RowListoldpasswordVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListoldpasswordBinding = RowListoldpasswordBinding.bind(itemView)
  }
}
