package com.adnansapplication.app.modules.successscreen.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivitySuccessScreenBinding
import com.adnansapplication.app.modules.successscreen.`data`.viewmodel.SuccessScreenVM
import kotlin.String
import kotlin.Unit

class SuccessScreenActivity :
    BaseActivity<ActivitySuccessScreenBinding>(R.layout.activity_success_screen) {
  private val viewModel: SuccessScreenVM by viewModels<SuccessScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.successScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUCCESS_SCREEN_ACTIVITY"

  }
}
