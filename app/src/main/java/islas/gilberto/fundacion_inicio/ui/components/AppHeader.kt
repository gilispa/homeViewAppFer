
package islas.gilberto.fundacion_inicio.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
fun AppHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp)
            .background(Blanco)
            .padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(R.drawable.logo_fer),
                contentDescription = "Logo de la Fundación",
                modifier = Modifier.size(42.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = "Inicio",
                color = AzulOscuro,
                fontFamily = OpenSans,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }

        Box(
            modifier = Modifier
                .size(38.dp)
                .background(
                    color = FondoGeneral,
                    shape = CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.ic_notificaciones),
                contentDescription = "Notificaciones",
                modifier = Modifier.size(20.dp)
            )
        }
    }
}
