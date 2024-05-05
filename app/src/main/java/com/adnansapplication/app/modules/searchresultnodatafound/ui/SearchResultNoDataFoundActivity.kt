package com.adnansapplication.app.modules.searchresultnodatafound.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivitySearchResultNoDataFoundBinding
import com.adnansapplication.app.modules.searchresultnodatafound.`data`.model.SpinnerGroupFourModel
import com.adnansapplication.app.modules.searchresultnodatafound.`data`.viewmodel.SearchResultNoDataFoundVM
import kotlin.String
import kotlin.Unit

class SearchResultNoDataFoundActivity :
    BaseActivity<ActivitySearchResultNoDataFoundBinding>(R.layout.activity_search_result_no_data_found)
    {
  private val viewModel: SearchResultNoDataFoundVM by viewModels<SearchResultNoDataFoundVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupFourList.value = mutableListOf(
    SpinnerGroupFourModel("Item1"),
    SpinnerGroupFourModel("Item2"),
    SpinnerGroupFourModel("Item3"),
    SpinnerGroupFourModel("Item4"),
    SpinnerGroupFourModel("Item5")
    )
    val spinnerGroupFourAdapter =
    SpinnerGroupFourAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupFourList.value?:
    mutableListOf())
    binding.spinnerGroupFour.adapter = spinnerGroupFourAdapter
    binding.searchResultNoDataFoundVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SEARCH_RESULT_NO_DATA_FOUND_ACTIVITY"

  }
}
