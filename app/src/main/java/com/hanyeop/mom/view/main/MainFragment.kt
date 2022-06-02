package com.hanyeop.mom.view.main

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.hanyeop.mom.R
import com.hanyeop.mom.base.BaseFragmentMain
import com.hanyeop.mom.databinding.FragmentMainBinding
import com.hanyeop.mom.util.KeepStateNavigator

class MainFragment : BaseFragmentMain<FragmentMainBinding>(R.layout.fragment_main) {

    override fun init() {
        initNavigation()
    }

    private fun initNavigation() {
        val navHostFragment =
            childFragmentManager.findFragmentById(R.id.main_navigation_view) as NavHostFragment
        val navController = navHostFragment.navController
        val keepStateNavigator = KeepStateNavigator(
            requireContext(),
            childFragmentManager,
            R.id.main_navigation_view
        )
        navController.navigatorProvider.addNavigator(keepStateNavigator)
        navController.setGraph(R.navigation.navi_graph_main)
        binding.mainBottomNavigation.setupWithNavController(navController)
        binding.mainBottomNavigation.itemIconTintList = null
    }
}