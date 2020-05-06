/*
 * Copyright © Marc Auberer 2017 - 2020. All rights reserved
 */

package com.mrgames13.jimdo.feinstaubapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mrgames13.jimdo.feinstaubapp.R
import kotlinx.android.synthetic.main.fragment_local_network.view.*

class LocalNetworkFragment : Fragment() {

    // Variables as objects
    private lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.fragment_local_network, container, false)



        return rootView
    }

    fun updateSearchProgress(progress: Int) {
        val progressString = getString(R.string.searching_for_sensors) + " " +
                String.format(getString(R.string.loading_percent), progress)
        rootView.loading_text.text = progressString
    }

    fun showSearchingScreen() {
        rootView.run {
            noData.visibility = View.GONE
            loading_container.visibility = View.VISIBLE
        }
    }
}