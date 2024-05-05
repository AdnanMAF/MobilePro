package com.adnansapplication.app.modules.addpayment.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityAddPaymentBinding
import com.adnansapplication.app.modules.addpayment.`data`.viewmodel.AddPaymentVM
import kotlin.String
import kotlin.Unit

class AddPaymentActivity : BaseActivity<ActivityAddPaymentBinding>(R.layout.activity_add_payment) {
  private val viewModel: AddPaymentVM by viewModels<AddPaymentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addPaymentVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_PAYMENT_ACTIVITY"

  }
}
