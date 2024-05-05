package com.adnansapplication.app.modules.productdetail.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.adnansapplication.app.databinding.SlideritemProductDetail1Binding
import com.adnansapplication.app.modules.productdetail.`data`.model.ImageSliderSliderModel
import com.asksira.loopingviewpager.LoopingPagerAdapter
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderAdapter(
  val dataList: ArrayList<ImageSliderSliderModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemProductDetail1Binding) {
      binding.imageSliderSliderModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemProductDetail1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
