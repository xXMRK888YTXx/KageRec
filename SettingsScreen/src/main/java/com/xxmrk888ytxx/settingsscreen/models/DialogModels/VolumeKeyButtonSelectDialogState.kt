package com.xxmrk888ytxx.settingsscreen.models.DialogModels

import com.xxmrk888ytxx.coreandroid.models.VolumeKeyButton

sealed interface VolumeKeyButtonSelectDialogState {
    data object Hidden : VolumeKeyButtonSelectDialogState
    data class Showed(val currentButton: VolumeKeyButton) : VolumeKeyButtonSelectDialogState
}
