package islas.gilberto.fundacion_inicio.ui.theme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val AppColorScheme = lightColorScheme(
    primary = AzulPrincipal,
    secondary = AzulOscuro,
    background = FondoGeneral,
    surface = Blanco,
    onPrimary = Blanco,
    onBackground = AzulOscuro,
    onSurface = AzulOscuro
)

@Composable
fun FundacionFERTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        content = content
    )
}