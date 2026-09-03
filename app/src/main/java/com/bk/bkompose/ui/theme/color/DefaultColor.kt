package com.bk.bkompose.ui.theme.color

import androidx.compose.ui.graphics.Color

val defaultColorScheme = ColorScheme(
    primary = Color(0xFF4F46E5),
    primaryLight = Color(0xFFE0E7FF),
    onPrimary = OnPrimaryColors(
        default = Color(0xFFFFFFFF),
        body = Color(0x99FFFFFF),
        hint = Color(0x61FFFFFF),
        disabled = Color(0x29FFFFFF)
    ),
    rose = ColorVariant(
        default = Color(0xFFFB7185),
        light = Color(0xFFFFE4E6)
    ),
    mint = ColorVariant(
        default = Color(0xFF10B981),
        light = Color(0xFFD1FAE5)
    ),
    amber = ColorVariant(
        default = Color(0xFFF59E0B),
        light = Color(0xFFFEF3C7)
    ),
    purple = ColorVariant(
        default = Color(0xFF8B5CF6),
        light = Color(0xFFEDE9FE)
    ),
    error = ColorVariant(
        default = Color(0xFFB42318),
        light = Color(0xFFFEF3F2)
    ),
    surface = SurfaceColors(
        low = Color(0xFFFFFFFF),
        default = Color(0xFFF2F4F7),
        high = Color(0xFFEAECF0)
    ),
    shade = ShadeColors(
        primary = Color(0xFF0E1017),
        secondary = Color(0xFF3E4252),
        tertiary = Color(0xFF818599)
    ),
    disabled = Color(0xFFBEC0CC),
    textDisabled = Color(0xFF818599),
    border = Color(0xFFEAECF0),
    success = Color(0xFF19A44A)
)
