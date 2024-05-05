package com.adnansapplication.app.modules.sortby.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivitySortByBinding
import com.adnansapplication.app.modules.sortby.`data`.viewmodel.SortByVM
import kotlin.String
import kotlin.Unit

class SortByActivity : BaseActivity<ActivitySortByBinding>(R.layout.activity_sort_by) {
  private val viewModel: SortByVM by viewModels<SortByVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.sortByVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SORT_BY_ACTIVITY"

  }
}
