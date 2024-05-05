package com.adnansapplication.app.modules.superflashsale.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivitySuperFlashSaleBinding
import com.adnansapplication.app.modules.superflashsale.`data`.model.GridproducticonRowModel
import com.adnansapplication.app.modules.superflashsale.`data`.viewmodel.SuperFlashSaleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SuperFlashSaleActivity :
    BaseActivity<ActivitySuperFlashSaleBinding>(R.layout.activity_super_flash_sale) {
  private val viewModel: SuperFlashSaleVM by viewModels<SuperFlashSaleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridproducticonAdapter =
    GridproducticonAdapter(viewModel.gridproducticonList.value?:mutableListOf())
    binding.recyclerGridproducticon.adapter = gridproducticonAdapter
    gridproducticonAdapter.setOnItemClickListener(
    object : GridproducticonAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridproducticonRowModel) {
        onClickRecyclerGridproducticon(view, position, item)
      }
    }
    )
    viewModel.gridproducticonList.observe(this) {
      gridproducticonAdapter.updateData(it)
    }
    binding.superFlashSaleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridproducticon(
    view: View,
    position: Int,
    item: GridproducticonRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SUPER_FLASH_SALE_ACTIVITY"

  }
}
