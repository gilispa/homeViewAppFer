
package islas.gilberto.fundacion_inicio.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import islas.gilberto.fundacion_inicio.R
import islas.gilberto.fundacion_inicio.ui.theme.*

@Composable
fun BottomNavBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(76.dp)
            .background(Blanco)
            .padding(horizontal = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        NavItem(
            icono = R.drawable.ic_anuncios,
            texto = "Anuncios",
            seleccionado = false
        )

        NavItem(
            icono = R.drawable.ic_inicio,
            texto = "Inicio",
            seleccionado = true
        )

        NavItem(
            icono = R.drawable.ic_preferencias,
            texto = "Preferencias",
            seleccionado = false
        )
    }
}

@Composable
private fun RowScope.NavItem(
    icono: Int,
    texto: String,
    seleccionado: Boolean
) {
    Column(
        modifier = Modifier.weight(1f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(icono),
            contentDescription = texto,
            modifier = Modifier.size(26.dp)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = texto,
            fontFamily = OpenSans,
            fontWeight = if (seleccionado) {
                FontWeight.Bold
            } else {
                FontWeight.Normal
            },
            fontSize = 10.sp,
            color = if (seleccionado) {
                AzulPrincipal
            } else {
                GrisDescripcion
            }
        )
    }
}
