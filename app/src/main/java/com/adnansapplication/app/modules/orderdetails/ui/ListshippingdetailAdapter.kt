package com.adnansapplication.app.modules.orderdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowListshippingdetailBinding
import com.adnansapplication.app.modules.orderdetails.`data`.model.ListshippingdetailRowModel
import kotlin.Int
import kotlin.collections.List

class ListshippingdetailAdapter(
  var list: List<ListshippingdetailRowModel>
) : RecyclerView.Adapter<ListshippingdetailAdapter.RowListshippingdetailVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListshippingdetailVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listshippingdetail,parent,false)
    return RowListshippingdetailVH(view)
  }

  override fun onBindViewHolder(holder: RowListshippingdetailVH, position: Int) {
    val listshippingdetailRowModel = ListshippingdetailRowModel()
    // TODO uncomment following line after integration with data source
    // val listshippingdetailRowModel = list[position]
    holder.binding.listshippingdetailRowModel = listshippingdetailRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListshippingdetailRowModel>) {
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
      item: ListshippingdetailRowModel
    ) {
    }
  }

  inner class RowListshippingdetailVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListshippingdetailBinding = RowListshippingdetailBinding.bind(itemView)
  }
}
