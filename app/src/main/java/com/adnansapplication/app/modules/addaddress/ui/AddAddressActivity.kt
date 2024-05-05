package com.adnansapplication.app.modules.addaddress.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityAddAddressBinding
import com.adnansapplication.app.modules.addaddress.`data`.viewmodel.AddAddressVM
import kotlin.String
import kotlin.Unit

class AddAddressActivity : BaseActivity<ActivityAddAddressBinding>(R.layout.activity_add_address) {
  private val viewModel: AddAddressVM by viewModels<AddAddressVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.addAddressVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ADD_ADDRESS_ACTIVITY"

  }
}
