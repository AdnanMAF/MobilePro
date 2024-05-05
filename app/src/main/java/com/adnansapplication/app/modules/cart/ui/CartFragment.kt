package com.adnansapplication.app.modules.cart.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseFragment
import com.adnansapplication.app.databinding.FragmentCartBinding
import com.adnansapplication.app.modules.cart.`data`.model.CartRowModel
import com.adnansapplication.app.modules.cart.`data`.viewmodel.CartVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CartFragment : BaseFragment<FragmentCartBinding>(R.layout.fragment_cart) {
  private val viewModel: CartVM by viewModels<CartVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val cartAdapter = CartAdapter(viewModel.cartList.value?:mutableListOf())
    binding.recyclerCart.adapter = cartAdapter
    cartAdapter.setOnItemClickListener(
    object : CartAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CartRowModel) {
        onClickRecyclerCart(view, position, item)
      }
    }
    )
    viewModel.cartList.observe(requireActivity()) {
      cartAdapter.updateData(it)
    }
    binding.cartVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerCart(
    view: View,
    position: Int,
    item: CartRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CART_FRAGMENT"

  }
}
