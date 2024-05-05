package com.adnansapplication.app.modules.dashboardcontainer.ui

import androidx.activity.viewModels
import com.adnansapplication.app.R
import com.adnansapplication.app.appcomponents.base.BaseActivity
import com.adnansapplication.app.databinding.ActivityDashboardContainerBinding
import com.adnansapplication.app.extensions.loadFragment
import com.adnansapplication.app.modules.dashboard.ui.DashboardFragment
import com.adnansapplication.app.modules.dashboardcontainer.`data`.viewmodel.DashboardContainerVM
import kotlin.String
import kotlin.Unit

class DashboardContainerActivity :
    BaseActivity<ActivityDashboardContainerBinding>(R.layout.activity_dashboard_container) {
  private val viewModel: DashboardContainerVM by viewModels<DashboardContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.dashboardContainerVM = viewModel
    val destFragment = DashboardFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = DashboardFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DASHBOARD_CONTAINER_ACTIVITY"

  }
}
