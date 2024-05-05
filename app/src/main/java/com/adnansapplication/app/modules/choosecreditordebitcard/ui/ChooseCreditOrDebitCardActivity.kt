package com.adnansapplication.app.modules.choosecreditordebitcard.ui

import android.net.Uri
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityChooseCreditOrDebitCardBinding
import com.adnansapplication.app.modules.choosecreditordebitcard.`data`.model.ImageSliderSlideruserModel
import com.adnansapplication.app.modules.choosecreditordebitcard.`data`.viewmodel.ChooseCreditOrDebitCardVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ChooseCreditOrDebitCardActivity :
    BaseActivity<ActivityChooseCreditOrDebitCardBinding>(R.layout.activity_choose_credit_or_debit_card)
    {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.adnansapplication.app/drawable/img_user_gray_400")


  private val imageSliderSlideruserItems: ArrayList<ImageSliderSlideruserModel> =
      arrayListOf(ImageSliderSlideruserModel(imageUser =
  imageUri.toString()),ImageSliderSlideruserModel(imageUser = imageUri.toString()))


  private val viewModel: ChooseCreditOrDebitCardVM by viewModels<ChooseCreditOrDebitCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slideruserAdapter = SlideruserAdapter(imageSliderSlideruserItems,true)
    binding.imageSliderSlideruser.adapter = slideruserAdapter
    binding.imageSliderSlideruser.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorSettings.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSettings.updateIndicatorCounts(binding.imageSliderSlideruser.indicatorCount)
    binding.chooseCreditOrDebitCardVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlideruser.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlideruser.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CHOOSE_CREDIT_OR_DEBIT_CARD_ACTIVITY"

  }
}
