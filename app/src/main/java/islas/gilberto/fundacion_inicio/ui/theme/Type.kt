
package islas.gilberto.fundacion_inicio.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import islas.gilberto.fundacion_inicio.R

val OpenSans = FontFamily(
    Font(R.font.opensans_regular, FontWeight.Normal),
    Font(R.font.opensans_semibold, FontWeight.SemiBold),
    Font(R.font.opensans_bold, FontWeight.Bold)
)

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    titleLarge = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp
    )
)
