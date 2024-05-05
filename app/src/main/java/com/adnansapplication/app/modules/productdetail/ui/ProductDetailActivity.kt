package com.adnansapplication.app.modules.productdetail.ui

import android.net.Uri
import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityProductDetailBinding
import com.adnansapplication.app.modules.productdetail.`data`.model.ImageSliderSliderModel
import com.adnansapplication.app.modules.productdetail.`data`.model.RecomendedRowModel
import com.adnansapplication.app.modules.productdetail.`data`.viewmodel.ProductDetailVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ProductDetailActivity :
    BaseActivity<ActivityProductDetailBinding>(R.layout.activity_product_detail) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.adnansapplication.app/drawable/img_productimage_5")


  private val imageSliderSliderItems: ArrayList<ImageSliderSliderModel> =
      arrayListOf(ImageSliderSliderModel(imageProductImage =
  imageUri.toString()),ImageSliderSliderModel(imageProductImage = imageUri.toString()))


  private val viewModel: ProductDetailVM by viewModels<ProductDetailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderAdapter = SliderAdapter(imageSliderSliderItems,true)
    binding.imageSliderSlider.adapter = sliderAdapter
    binding.imageSliderSlider.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorSettings.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSettings.updateIndicatorCounts(binding.imageSliderSlider.indicatorCount)
    val recomendedAdapter = RecomendedAdapter(viewModel.recomendedList.value?:mutableListOf())
    binding.recyclerRecomended.adapter = recomendedAdapter
    recomendedAdapter.setOnItemClickListener(
    object : RecomendedAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RecomendedRowModel) {
        onClickRecyclerRecomended(view, position, item)
      }
    }
    )
    viewModel.recomendedList.observe(this) {
      recomendedAdapter.updateData(it)
    }
    binding.productDetailVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlider.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlider.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerRecomended(
    view: View,
    position: Int,
    item: RecomendedRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_DETAIL_ACTIVITY"

  }
}
