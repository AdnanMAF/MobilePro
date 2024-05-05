package com.adnansapplication.app.modules.orderdetails.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityOrderDetailsBinding
import com.adnansapplication.app.modules.orderdetails.`data`.model.ListnikeairzoompRowModel
import com.adnansapplication.app.modules.orderdetails.`data`.model.ListshippingdetailRowModel
import com.adnansapplication.app.modules.orderdetails.`data`.viewmodel.OrderDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrderDetailsActivity :
    BaseActivity<ActivityOrderDetailsBinding>(R.layout.activity_order_details) {
  private val viewModel: OrderDetailsVM by viewModels<OrderDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnikeairzoompAdapter =
    ListnikeairzoompAdapter(viewModel.listnikeairzoompList.value?:mutableListOf())
    binding.recyclerListnikeairzoomp.adapter = listnikeairzoompAdapter
    listnikeairzoompAdapter.setOnItemClickListener(
    object : ListnikeairzoompAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnikeairzoompRowModel) {
        onClickRecyclerListnikeairzoomp(view, position, item)
      }
    }
    )
    viewModel.listnikeairzoompList.observe(this) {
      listnikeairzoompAdapter.updateData(it)
    }
    val listshippingdetailAdapter =
    ListshippingdetailAdapter(viewModel.listshippingdetailList.value?:mutableListOf())
    binding.recyclerListshippingdetail.adapter = listshippingdetailAdapter
    listshippingdetailAdapter.setOnItemClickListener(
    object : ListshippingdetailAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListshippingdetailRowModel) {
        onClickRecyclerListshippingdetail(view, position, item)
      }
    }
    )
    viewModel.listshippingdetailList.observe(this) {
      listshippingdetailAdapter.updateData(it)
    }
    binding.orderDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListnikeairzoomp(
    view: View,
    position: Int,
    item: ListnikeairzoompRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListshippingdetail(
    view: View,
    position: Int,
    item: ListshippingdetailRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORDER_DETAILS_ACTIVITY"

  }
}
