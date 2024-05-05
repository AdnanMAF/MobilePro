package com.adnansapplication.app.modules.shipto.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityShipToBinding
import com.adnansapplication.app.modules.shipto.`data`.model.AddressRowModel
import com.adnansapplication.app.modules.shipto.`data`.viewmodel.ShipToVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ShipToActivity : BaseActivity<ActivityShipToBinding>(R.layout.activity_ship_to) {
  private val viewModel: ShipToVM by viewModels<ShipToVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val addressAdapter = AddressAdapter(viewModel.addressList.value?:mutableListOf())
    binding.recyclerAddress.adapter = addressAdapter
    addressAdapter.setOnItemClickListener(
    object : AddressAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AddressRowModel) {
        onClickRecyclerAddress(view, position, item)
      }
    }
    )
    viewModel.addressList.observe(this) {
      addressAdapter.updateData(it)
    }
    binding.shipToVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerAddress(
    view: View,
    position: Int,
    item: AddressRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SHIP_TO_ACTIVITY"

  }
}
