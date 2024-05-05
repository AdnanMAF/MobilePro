package com.adnansapplication.app.modules.account.ui

import androidx.fragment.app.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseFragment
import com.adnansapplication.app.databinding.FragmentAccountBinding
import com.adnansapplication.app.modules.account.`data`.viewmodel.AccountVM
import kotlin.String
import kotlin.Unit

class AccountFragment : BaseFragment<FragmentAccountBinding>(R.layout.fragment_account) {
  private val viewModel: AccountVM by viewModels<AccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.accountVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ACCOUNT_FRAGMENT"

  }
}
