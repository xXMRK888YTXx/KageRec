package com.xxmrk888ytxx.coreandroid.models

import androidx.annotation.StringRes
import com.xxmrk888ytxx.coreandroid.R

enum class VolumeKeyButton(val id: Int, @StringRes val titleRes: Int) {
    VOLUME_UP(0, R.string.volume_key_button_up),
    VOLUME_DOWN(1, R.string.volume_key_button_down);

    companion object {
        fun fromId(id: Int): VolumeKeyButton = entries.firstOrNull { it.id == id } ?: VOLUME_UP
    }
}
