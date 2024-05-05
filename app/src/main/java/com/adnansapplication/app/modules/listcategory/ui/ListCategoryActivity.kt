package com.adnansapplication.app.modules.listcategory.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityListCategoryBinding
import com.adnansapplication.app.modules.listcategory.`data`.viewmodel.ListCategoryVM
import kotlin.String
import kotlin.Unit

class ListCategoryActivity :
    BaseActivity<ActivityListCategoryBinding>(R.layout.activity_list_category) {
  private val viewModel: ListCategoryVM by viewModels<ListCategoryVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.listCategoryVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LIST_CATEGORY_ACTIVITY"

  }
}
