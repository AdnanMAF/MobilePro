package com.adnansapplication.app.modules.order.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityOrderBinding
import com.adnansapplication.app.modules.order.`data`.model.OrdersRowModel
import com.adnansapplication.app.modules.order.`data`.viewmodel.OrderVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OrderActivity : BaseActivity<ActivityOrderBinding>(R.layout.activity_order) {
  private val viewModel: OrderVM by viewModels<OrderVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val ordersAdapter = OrdersAdapter(viewModel.ordersList.value?:mutableListOf())
    binding.recyclerOrders.adapter = ordersAdapter
    ordersAdapter.setOnItemClickListener(
    object : OrdersAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OrdersRowModel) {
        onClickRecyclerOrders(view, position, item)
      }
    }
    )
    viewModel.ordersList.observe(this) {
      ordersAdapter.updateData(it)
    }
    binding.orderVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerOrders(
    view: View,
    position: Int,
    item: OrdersRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ORDER_ACTIVITY"

  }
}
