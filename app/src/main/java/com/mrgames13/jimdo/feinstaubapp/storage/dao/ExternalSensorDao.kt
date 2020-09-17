/*
 * Copyright © Marc Auberer 2017 - 2020. All rights reserved
 */

package com.mrgames13.jimdo.feinstaubapp.storage.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mrgames13.jimdo.feinstaubapp.model.dbo.ExternalSensorDbo

@Dao
interface ExternalSensorDao {
    @Query("SELECT * FROM `external-sensor`")
    fun getAll(): LiveData<List<ExternalSensorDbo>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(sensors: List<ExternalSensorDbo>)
}