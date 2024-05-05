package com.adnansapplication.app.modules.searchresult.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adnansapplication.app.R
import com.adnansapplication.app.databinding.RowSearchResultBinding
import com.adnansapplication.app.modules.searchresult.`data`.model.SearchResultRowModel
import kotlin.Int
import kotlin.collections.List

class SearchResultAdapter(
  var list: List<SearchResultRowModel>
) : RecyclerView.Adapter<SearchResultAdapter.RowSearchResultVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearchResultVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_result,parent,false)
    return RowSearchResultVH(view)
  }

  override fun onBindViewHolder(holder: RowSearchResultVH, position: Int) {
    val searchResultRowModel = SearchResultRowModel()
    // TODO uncomment following line after integration with data source
    // val searchResultRowModel = list[position]
    holder.binding.searchResultRowModel = searchResultRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SearchResultRowModel>) {
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
      item: SearchResultRowModel
    ) {
    }
  }

  inner class RowSearchResultVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSearchResultBinding = RowSearchResultBinding.bind(itemView)
  }
}
