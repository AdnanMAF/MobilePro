package com.adnansapplication.app.modules.dashboard.ui

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseFragment
import com.adnansapplication.app.databinding.FragmentDashboardBinding
import com.adnansapplication.app.modules.dashboard.`data`.model.DashboardRowModel
import com.adnansapplication.app.modules.dashboard.`data`.model.FlashsalesectRowModel
import com.adnansapplication.app.modules.dashboard.`data`.model.ImageSliderSliderofferModel
import com.adnansapplication.app.modules.dashboard.`data`.model.MegasalesectiRowModel
import com.adnansapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class DashboardFragment : BaseFragment<FragmentDashboardBinding>(R.layout.fragment_dashboard) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.adnansapplication.app/drawable/img_promotionimage")


  private val imageSliderSliderofferItems: ArrayList<ImageSliderSliderofferModel> =
      arrayListOf(ImageSliderSliderofferModel(imagePromotionImage =
  imageUri.toString()),ImageSliderSliderofferModel(imagePromotionImage =
  imageUri.toString()))


  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val sliderofferAdapter = SliderofferAdapter(imageSliderSliderofferItems,true)
    binding.imageSliderSlideroffer.adapter = sliderofferAdapter
    binding.imageSliderSlideroffer.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorSettings.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorSettings.updateIndicatorCounts(binding.imageSliderSlideroffer.indicatorCount)
    val flashSaleSectAdapter =
    FlashSaleSectAdapter(viewModel.flashSaleSectList.value?:mutableListOf())
    binding.recyclerFlashSaleSect.adapter = flashSaleSectAdapter
    flashSaleSectAdapter.setOnItemClickListener(
    object : FlashSaleSectAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FlashsalesectRowModel) {
        onClickRecyclerFlashSaleSect(view, position, item)
      }
    }
    )
    viewModel.flashSaleSectList.observe(requireActivity()) {
      flashSaleSectAdapter.updateData(it)
    }
    val megaSaleSectiAdapter =
    MegaSaleSectiAdapter(viewModel.megaSaleSectiList.value?:mutableListOf())
    binding.recyclerMegaSaleSecti.adapter = megaSaleSectiAdapter
    megaSaleSectiAdapter.setOnItemClickListener(
    object : MegaSaleSectiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MegasalesectiRowModel) {
        onClickRecyclerMegaSaleSecti(view, position, item)
      }
    }
    )
    viewModel.megaSaleSectiList.observe(requireActivity()) {
      megaSaleSectiAdapter.updateData(it)
    }
    val dashboardAdapter = DashboardAdapter(viewModel.dashboardList.value?:mutableListOf())
    binding.recyclerDashboard.adapter = dashboardAdapter
    dashboardAdapter.setOnItemClickListener(
    object : DashboardAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DashboardRowModel) {
        onClickRecyclerDashboard(view, position, item)
      }
    }
    )
    viewModel.dashboardList.observe(requireActivity()) {
      dashboardAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlideroffer.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlideroffer.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerFlashSaleSect(
    view: View,
    position: Int,
    item: FlashsalesectRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerMegaSaleSecti(
    view: View,
    position: Int,
    item: MegasalesectiRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerDashboard(
    view: View,
    position: Int,
    item: DashboardRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_FRAGMENT"


    fun getInstance(bundle: Bundle?): DashboardFragment {
      val fragment = DashboardFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
