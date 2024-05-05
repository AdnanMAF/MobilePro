package com.adnansapplication.app.modules.lailyfafebrinacard.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityLailyfaFebrinaCardBinding
import com.adnansapplication.app.modules.lailyfafebrinacard.`data`.viewmodel.LailyfaFebrinaCardVM
import kotlin.String
import kotlin.Unit

class LailyfaFebrinaCardActivity :
    BaseActivity<ActivityLailyfaFebrinaCardBinding>(R.layout.activity_lailyfa_febrina_card) {
  private val viewModel: LailyfaFebrinaCardVM by viewModels<LailyfaFebrinaCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.lailyfaFebrinaCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LAILYFA_FEBRINA_CARD_ACTIVITY"

  }
}
