package com.adnansapplication.app.modules.reviewproduct.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityReviewProductBinding
import com.adnansapplication.app.modules.reviewproduct.`data`.viewmodel.ReviewProductVM
import kotlin.String
import kotlin.Unit

class ReviewProductActivity :
    BaseActivity<ActivityReviewProductBinding>(R.layout.activity_review_product) {
  private val viewModel: ReviewProductVM by viewModels<ReviewProductVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.reviewProductVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "REVIEW_PRODUCT_ACTIVITY"

  }
}
