package com.adnansapplication.app.modules.choosecreditordebitcard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.adnansapplication.app.databinding.SlideritemChooseCreditOrDebitCard1Binding
import com.adnansapplication.app.modules.choosecreditordebitcard.`data`.model.ImageSliderSlideruserModel
import com.asksira.loopingviewpager.LoopingPagerAdapter
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlideruserAdapter(
  val dataList: ArrayList<ImageSliderSlideruserModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlideruserModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemChooseCreditOrDebitCard1Binding) {
      binding.imageSliderSlideruserModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemChooseCreditOrDebitCard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
