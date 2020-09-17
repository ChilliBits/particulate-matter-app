/*
 * Copyright © Marc Auberer 2017 - 2020. All rights reserved
 */

package com.mrgames13.jimdo.feinstaubapp.network

import android.content.Context
import android.util.Log
import com.mrgames13.jimdo.feinstaubapp.R
import com.mrgames13.jimdo.feinstaubapp.model.other.DataRecord
import com.mrgames13.jimdo.feinstaubapp.shared.Constants
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

suspend fun loadAverageOfMultipleChipIds(context: Context, chipIds: List<Long>): DataRecord? {
    try {
        val response = networkClient.get<HttpStatement>(context.getString(R.string.api_root) + "/data/average?chipIds=" + chipIds.joinToString(",")).execute()
        if(response.status == HttpStatusCode.OK) {
            //Log.d(Constants.TAG, response.readText())
            val responseContent = URLDecoder.decode(response.readText(), StandardCharsets.UTF_8.name())
            return Json.decodeFromString<DataRecord>(responseContent)
        } else {
            Log.e(Constants.TAG, response.status.toString())
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
    return null
}