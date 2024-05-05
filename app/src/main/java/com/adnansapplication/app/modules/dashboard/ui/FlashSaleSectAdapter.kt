package com.adnansapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowFlashsalesectBinding
import com.adnansapplication.app.modules.dashboard.`data`.model.FlashsalesectRowModel
import kotlin.Int
import kotlin.collections.List

class FlashSaleSectAdapter(
  var list: List<FlashsalesectRowModel>
) : RecyclerView.Adapter<FlashSaleSectAdapter.RowFlashsalesectVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFlashsalesectVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_flashsalesect,parent,false)
    return RowFlashsalesectVH(view)
  }

  override fun onBindViewHolder(holder: RowFlashsalesectVH, position: Int) {
    val flashsalesectRowModel = FlashsalesectRowModel()
    // TODO uncomment following line after integration with data source
    // val flashsalesectRowModel = list[position]
    holder.binding.flashsalesectRowModel = flashsalesectRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FlashsalesectRowModel>) {
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
      item: FlashsalesectRowModel
    ) {
    }
  }

  inner class RowFlashsalesectVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFlashsalesectBinding = RowFlashsalesectBinding.bind(itemView)
  }
}
