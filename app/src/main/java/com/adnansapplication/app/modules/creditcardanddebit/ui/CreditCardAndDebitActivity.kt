package com.adnansapplication.app.modules.creditcardanddebit.ui

import android.view.View
import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityCreditCardAndDebitBinding
import com.adnansapplication.app.modules.creditcardanddebit.`data`.model.ListuserRowModel
import com.adnansapplication.app.modules.creditcardanddebit.`data`.viewmodel.CreditCardAndDebitVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CreditCardAndDebitActivity :
    BaseActivity<ActivityCreditCardAndDebitBinding>(R.layout.activity_credit_card_and_debit) {
  private val viewModel: CreditCardAndDebitVM by viewModels<CreditCardAndDebitVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listuserAdapter = ListuserAdapter(viewModel.listuserList.value?:mutableListOf())
    binding.recyclerListuser.adapter = listuserAdapter
    listuserAdapter.setOnItemClickListener(
    object : ListuserAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListuserRowModel) {
        onClickRecyclerListuser(view, position, item)
      }
    }
    )
    viewModel.listuserList.observe(this) {
      listuserAdapter.updateData(it)
    }
    binding.creditCardAndDebitVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListuser(
    view: View,
    position: Int,
    item: ListuserRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CREDIT_CARD_AND_DEBIT_ACTIVITY"

  }
}
