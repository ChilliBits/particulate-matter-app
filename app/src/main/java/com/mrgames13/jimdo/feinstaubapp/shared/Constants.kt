/*
 * Copyright © Marc Auberer 2017 - 2020. All rights reserved
 */

package com.mrgames13.jimdo.feinstaubapp.shared

object Constants {
    // Logging tag
    const val TAG = "FA"

    // Thresholds
    const val THRESHOLD_WHO_PM10 = 20.0
    const val THRESHOLD_WHO_PM2_5 = 10.0
    const val THRESHOLD_EU_PM10 = 40.0
    const val THRESHOLD_EU_PM2_5 = 25.0

    // Default values
    const val DEFAULT_SYNC_CYCLE = 30 // 30 seconds
    const val MIN_SYNC_CYCLE = 15 // 15 seconds
    const val DEFAULT_SYNC_CYCLE_BACKGROUND = 15 // 15 minutes
    const val MIN_SYNC_CYCLE_BACKGROUND = 10 // 10 minutes
    const val DEFAULT_FIT_ARRAY_LIST_ENABLED = true
    const val DEFAULT_FIT_ARRAY_LIST_CONSTANT = 200 // Optimize as of 200 data records
    const val DEFAULT_P1_LIMIT = THRESHOLD_EU_PM10.toInt()
    const val DEFAULT_P2_LIMIT = THRESHOLD_EU_PM2_5.toInt()
    const val DEFAULT_TEMP_LIMIT = 0
    const val DEFAULT_HUMIDITY_LIMIT = 0
    const val DEFAULT_PRESSURE_LIMIT = 0
    const val DEFAULT_MISSING_MEASUREMENT_NUMBER0 = 5

    // Notification channels
    const val CHANNEL_SYSTEM = "System"
    const val CHANNEL_LIMIT = "Limit"
    const val CHANNEL_MISSING_MEASUREMENTS = "Missing Measurements"

    // JobScheduler ids
    const val JOB_SYNC_ID = 1001

    // Request codes
    const val REQ_ALARM_MANAGER_BACKGROUND_SYNC = 1002
    const val REQ_SCAN_WEB = 1003
    const val REQ_ADD_SENSOR = 1004
    const val REQ_PLACE_PICKER = 1005

    // HomeScreen widget
    const val WIDGET_LARGE_EXTRA_SENSOR_ID = "WidgetLargeSensorID"
    const val WIDGET_SMALL_EXTRA_SENSOR_ID = "WidgetSmallSensorID"
    const val WIDGET_EXTRA_LARGE_WIDGET_ID = "LargeWidgetID"
    const val WIDGET_EXTRA_SMALL_WIDGET_ID = "SmallWidgetID"

    // Local db constants
    const val DB_NAME = "pmapp-main"

    // NetworkScan constants
    const val JOB_COUNT = 5

    // SharedPreferences keys
    const val PREFS_CHOOSE_COLOR_REMEMBER = "ChooseColorRemember"
}