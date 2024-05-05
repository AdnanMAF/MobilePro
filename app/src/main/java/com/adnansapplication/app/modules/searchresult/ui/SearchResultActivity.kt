package com.adnansapplication.app.modules.searchresult.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivitySearchResultBinding
import com.adnansapplication.app.modules.searchresult.`data`.model.SearchResultRowModel
import com.adnansapplication.app.modules.searchresult.`data`.model.SpinnerGroupFiveModel
import com.adnansapplication.app.modules.searchresult.`data`.viewmodel.SearchResultVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchResultActivity :
    BaseActivity<ActivitySearchResultBinding>(R.layout.activity_search_result) {
  private val viewModel: SearchResultVM by viewModels<SearchResultVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFiveList.value = mutableListOf(
    SpinnerGroupFiveModel("Item1"),
    SpinnerGroupFiveModel("Item2"),
    SpinnerGroupFiveModel("Item3"),
    SpinnerGroupFiveModel("Item4"),
    SpinnerGroupFiveModel("Item5")
    )
    val spinnerGroupFiveAdapter =
    SpinnerGroupFiveAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFiveList.value?:
    mutableListOf())
    binding.spinnerGroupFive.adapter = spinnerGroupFiveAdapter
    val searchResultAdapter =
    SearchResultAdapter(viewModel.searchResultList.value?:mutableListOf())
    binding.recyclerSearchResult.adapter = searchResultAdapter
    searchResultAdapter.setOnItemClickListener(
    object : SearchResultAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SearchResultRowModel) {
        onClickRecyclerSearchResult(view, position, item)
      }
    }
    )
    viewModel.searchResultList.observe(this) {
      searchResultAdapter.updateData(it)
    }
    binding.searchResultVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSearchResult(
    view: View,
    position: Int,
    item: SearchResultRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_RESULT_ACTIVITY"

  }
}
