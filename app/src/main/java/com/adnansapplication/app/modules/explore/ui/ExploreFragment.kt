package com.adnansapplication.app.modules.explore.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseFragment
import com.adnansapplication.app.databinding.FragmentExploreBinding
import com.adnansapplication.app.modules.explore.`data`.model.GridbagRowModel
import com.adnansapplication.app.modules.explore.`data`.model.GridvectorOneRowModel
import com.adnansapplication.app.modules.explore.`data`.viewmodel.ExploreVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ExploreFragment : BaseFragment<FragmentExploreBinding>(R.layout.fragment_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val gridbagAdapter = GridbagAdapter(viewModel.gridbagList.value?:mutableListOf())
    binding.recyclerGridbag.adapter = gridbagAdapter
    gridbagAdapter.setOnItemClickListener(
    object : GridbagAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridbagRowModel) {
        onClickRecyclerGridbag(view, position, item)
      }
    }
    )
    viewModel.gridbagList.observe(requireActivity()) {
      gridbagAdapter.updateData(it)
    }
    val gridvectorOneAdapter =
    GridvectorOneAdapter(viewModel.gridvectorOneList.value?:mutableListOf())
    binding.recyclerGridvectorOne.adapter = gridvectorOneAdapter
    gridvectorOneAdapter.setOnItemClickListener(
    object : GridvectorOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridvectorOneRowModel) {
        onClickRecyclerGridvectorOne(view, position, item)
      }
    }
    )
    viewModel.gridvectorOneList.observe(requireActivity()) {
      gridvectorOneAdapter.updateData(it)
    }
    binding.exploreVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridbag(
    view: View,
    position: Int,
    item: GridbagRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerGridvectorOne(
    view: View,
    position: Int,
    item: GridvectorOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "EXPLORE_FRAGMENT"

  }
}
