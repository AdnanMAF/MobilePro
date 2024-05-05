package com.adnansapplication.app.modules.addcard.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityAddCardBinding
import com.adnansapplication.app.modules.addcard.`data`.viewmodel.AddCardVM
import kotlin.String
import kotlin.Unit

class AddCardActivity : BaseActivity<ActivityAddCardBinding>(R.layout.activity_add_card) {
  private val viewModel: AddCardVM by viewModels<AddCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_CARD_ACTIVITY"

  }
}
