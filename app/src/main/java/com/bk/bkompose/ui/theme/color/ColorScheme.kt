package com.bk.bkompose.ui.theme.color

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class ColorScheme(
    val primary: Color,
    val primaryLight: Color,

    val onPrimary: OnPrimaryColors,

    val rose: ColorVariant,
    val mint: ColorVariant,
    val amber: ColorVariant,
    val purple: ColorVariant,
    val error: ColorVariant,

    val surface: SurfaceColors,

    val shade: ShadeColors,

    val disabled: Color,
    val textDisabled: Color,
    val border: Color,
    val success: Color,
)

@Immutable
data class ColorVariant(
    val default: Color,
    val light: Color
)

@Immutable
data class SurfaceColors(
    val low: Color,
    val default: Color,
    val high: Color
)

@Immutable
data class ShadeColors(
    val primary: Color,
    val secondary: Color,
    val tertiary: Color
)

@Immutable
data class OnPrimaryColors(
    val default: Color,
    val body: Color,
    val hint: Color,
    val disabled: Color
)
