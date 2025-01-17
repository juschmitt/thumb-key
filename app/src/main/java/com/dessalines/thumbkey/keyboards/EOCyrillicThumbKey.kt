@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.dessalines.thumbkey.keyboards

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import com.dessalines.thumbkey.utils.*
import com.dessalines.thumbkey.utils.ColorVariant.*
import com.dessalines.thumbkey.utils.FontSizeVariant.*
import com.dessalines.thumbkey.utils.KeyAction.*
import com.dessalines.thumbkey.utils.SwipeNWay.*

val KB_EO_CYRILLIC_THUMBKEY_MAIN =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("о", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("к"),
                    top = KeyC("м"),
                    left = KeyC("'"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("с", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ш"),
                    top = KeyC("п"),
                    left = KeyC("ϗ"),
                    right = KeyC("₷"),
                ),
                KeyItemC(
                    center = KeyC("е", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("х"),
                    top = KeyC("һ"),
                    left = KeyC("#"),
                    right = KeyC(":"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("н", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ж"),
                    top = KeyC("j"),
                    left = KeyC("."),
                    right = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("р", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("в"),
                    top = KeyC("ф"),
                    left = KeyC("?"),
                    right = KeyC("!"),
                ),
                KeyItemC(
                    center = KeyC("а", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("д"),
                    left = KeyC("("),
                    right = KeyC(")"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(true),
                            swipeReturnAction = ToggleCurrentWordCapitalization(true),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("т", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ч"),
                    top = KeyC("ц"),
                    left = KeyC("б"),
                ),
                KeyItemC(
                    center = KeyC("л", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("џ"),
                    top = KeyC("г"),
                    right = KeyC("з"),
                ),
                KeyItemC(
                    center = KeyC("и", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("ў"),
                    top = KeyC("у"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EO_CYRILLIC_THUMBKEY_SHIFTED =
    KeyboardC(
        listOf(
            listOf(
                KeyItemC(
                    center = KeyC("О", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("К"),
                    top = KeyC("М"),
                    left = KeyC("'"),
                    right = KeyC("@"),
                ),
                KeyItemC(
                    center = KeyC("С", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ш"),
                    top = KeyC("П"),
                    left = KeyC("ϗ"),
                    right = KeyC("₷"),
                ),
                KeyItemC(
                    center = KeyC("Е", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Х"),
                    top = KeyC("Һ"),
                    left = KeyC("#"),
                    right = KeyC(":"),
                ),
                EMOJI_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Н", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ж"),
                    top = KeyC("J"),
                    left = KeyC("."),
                    right = KeyC(","),
                ),
                KeyItemC(
                    center = KeyC("Р", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("В"),
                    top = KeyC("Ф"),
                    left = KeyC("?"),
                    right = KeyC("‽"),
                ),
                KeyItemC(
                    center = KeyC("А", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Д"),
                    left = KeyC("("),
                    right = KeyC(")"),
                    top =
                        KeyC(
                            display = KeyDisplay.IconDisplay(Icons.Outlined.ArrowDropUp),
                            action = ToggleShiftMode(false),
                            swipeReturnAction = ToggleCurrentWordCapitalization(false),
                            color = MUTED,
                        ),
                ),
                NUMERIC_KEY_ITEM,
            ),
            listOf(
                KeyItemC(
                    center = KeyC("Т", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ч"),
                    top = KeyC("Ц"),
                    left = KeyC("Б"),
                ),
                KeyItemC(
                    center = KeyC("Л", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Џ"),
                    top = KeyC("Г"),
                    right = KeyC("З"),
                ),
                KeyItemC(
                    center = KeyC("И", size = LARGE),
                    swipeType = FOUR_WAY_CROSS,
                    bottom = KeyC("Ў"),
                    top = KeyC("У"),
                ),
                BACKSPACE_KEY_ITEM,
            ),
            listOf(
                SPACEBAR_KEY_ITEM,
                RETURN_KEY_ITEM,
            ),
        ),
    )

val KB_EO_CYRILLIC_THUMBKEY: KeyboardDefinition =
    KeyboardDefinition(
        title = "esperanto cyrillic thumb-key",
        modes =
            KeyboardDefinitionModes(
                main = KB_EO_CYRILLIC_THUMBKEY_MAIN,
                shifted = KB_EO_CYRILLIC_THUMBKEY_SHIFTED,
                numeric = NUMERIC_KEYBOARD,
            ),
        settings =
            KeyboardDefinitionSettings(
                autoCapitalizers = arrayOf(::autoCapitalizeI, ::autoCapitalizeIApostrophe),
            ),
    )
