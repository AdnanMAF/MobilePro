package com.adnansapplication.app.modules.offerscreen.ui

import androidx.fragment.app.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseFragment
import com.adnansapplication.app.databinding.FragmentOfferScreenBinding
import com.adnansapplication.app.modules.offerscreen.`data`.viewmodel.OfferScreenVM
import kotlin.String
import kotlin.Unit

class OfferScreenFragment : BaseFragment<FragmentOfferScreenBinding>(R.layout.fragment_offer_screen)
    {
  private val viewModel: OfferScreenVM by viewModels<OfferScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.offerScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "OFFER_SCREEN_FRAGMENT"

  }
}
