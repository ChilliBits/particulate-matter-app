/*
 * Copyright © 2019 Marc Auberer. All rights reserved.
 */

package com.mrgames13.jimdo.feinstaubapp.model

import java.io.Serializable

class Sensor: Comparable<Any>, Serializable {

    // Variables
    var chipID = "no_id"
    var name = "unknown"
    var color = 0

    constructor()

    constructor(id: String, name: String, color: Int) {
        this.chipID = id
        this.name = name
        this.color = color
    }

    override operator fun compareTo(other: Any): Int {
        return name.compareTo((other as Sensor).name)
    }
}