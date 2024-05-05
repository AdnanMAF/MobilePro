package com.adnansapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowMegasalesectiBinding
import com.adnansapplication.app.modules.dashboard.`data`.model.MegasalesectiRowModel
import kotlin.Int
import kotlin.collections.List

class MegaSaleSectiAdapter(
  var list: List<MegasalesectiRowModel>
) : RecyclerView.Adapter<MegaSaleSectiAdapter.RowMegasalesectiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMegasalesectiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_megasalesecti,parent,false)
    return RowMegasalesectiVH(view)
  }

  override fun onBindViewHolder(holder: RowMegasalesectiVH, position: Int) {
    val megasalesectiRowModel = MegasalesectiRowModel()
    // TODO uncomment following line after integration with data source
    // val megasalesectiRowModel = list[position]
    holder.binding.megasalesectiRowModel = megasalesectiRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MegasalesectiRowModel>) {
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
      item: MegasalesectiRowModel
    ) {
    }
  }

  inner class RowMegasalesectiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMegasalesectiBinding = RowMegasalesectiBinding.bind(itemView)
  }
}
