package com.adnansapplication.app.modules.address.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityAddressBinding
import com.adnansapplication.app.modules.address.`data`.model.AddressesRowModel
import com.adnansapplication.app.modules.address.`data`.viewmodel.AddressVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AddressActivity : BaseActivity<ActivityAddressBinding>(R.layout.activity_address) {
  private val viewModel: AddressVM by viewModels<AddressVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val addressesAdapter = AddressesAdapter(viewModel.addressesList.value?:mutableListOf())
    binding.recyclerAddresses.adapter = addressesAdapter
    addressesAdapter.setOnItemClickListener(
    object : AddressesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AddressesRowModel) {
        onClickRecyclerAddresses(view, position, item)
      }
    }
    )
    viewModel.addressesList.observe(this) {
      addressesAdapter.updateData(it)
    }
    binding.addressVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerAddresses(
    view: View,
    position: Int,
    item: AddressesRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ADDRESS_ACTIVITY"

  }
}
