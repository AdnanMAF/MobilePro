package com.adnansapplication.app.modules.favoriteproduct.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityFavoriteProductBinding
import com.adnansapplication.app.modules.favoriteproduct.`data`.model.GridnikeairmaxreRowModel
import com.adnansapplication.app.modules.favoriteproduct.`data`.viewmodel.FavoriteProductVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FavoriteProductActivity :
    BaseActivity<ActivityFavoriteProductBinding>(R.layout.activity_favorite_product) {
  private val viewModel: FavoriteProductVM by viewModels<FavoriteProductVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val gridnikeairmaxreAdapter =
    GridnikeairmaxreAdapter(viewModel.gridnikeairmaxreList.value?:mutableListOf())
    binding.recyclerGridnikeairmaxre.adapter = gridnikeairmaxreAdapter
    gridnikeairmaxreAdapter.setOnItemClickListener(
    object : GridnikeairmaxreAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridnikeairmaxreRowModel) {
        onClickRecyclerGridnikeairmaxre(view, position, item)
      }
    }
    )
    viewModel.gridnikeairmaxreList.observe(this) {
      gridnikeairmaxreAdapter.updateData(it)
    }
    binding.favoriteProductVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerGridnikeairmaxre(
    view: View,
    position: Int,
    item: GridnikeairmaxreRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FAVORITE_PRODUCT_ACTIVITY"

  }
}
