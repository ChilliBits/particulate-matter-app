/*
 * Copyright © Marc Auberer 2017 - 2021. All rights reserved
 */

package com.mrgames13.jimdo.feinstaubapp.ui.dialog

import android.content.Context
import androidx.appcompat.app.AlertDialog
import com.mrgames13.jimdo.feinstaubapp.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun Context.showClearSensorDataDialog() {
    AlertDialog.Builder(this)
        .setTitle(R.string.clear_sensor_data_t)
        .setMessage(R.string.clear_sensor_data_m)
        .setIcon(R.drawable.delete_red)
        .setNegativeButton(R.string.cancel, null)
        .setPositiveButton(R.string.yes) { _, _ ->
            ProgressDialog(this).run {
                show()
                CoroutineScope(Dispatchers.IO).launch {
                    clearSensorData()
                    CoroutineScope(Dispatchers.Main).launch { dismiss() }
                }
            }
        }
        .show()
}

private suspend fun clearSensorData() {

}