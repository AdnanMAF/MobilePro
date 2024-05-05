package com.adnansapplication.app.modules.writereviewfill.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityWriteReviewFillBinding
import com.adnansapplication.app.modules.writereviewfill.`data`.viewmodel.WriteReviewFillVM
import kotlin.String
import kotlin.Unit

class WriteReviewFillActivity :
    BaseActivity<ActivityWriteReviewFillBinding>(R.layout.activity_write_review_fill) {
  private val viewModel: WriteReviewFillVM by viewModels<WriteReviewFillVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.writeReviewFillVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "WRITE_REVIEW_FILL_ACTIVITY"

  }
}
