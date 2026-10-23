
package islas.gilberto.fundacion_inicio.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import islas.gilberto.fundacion_inicio.R
import islas.gilberto.fundacion_inicio.ui.theme.*

@Composable
fun InicioScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(FondoGeneral)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp)
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Lo más reciente",
            color = AzulPrincipal,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = OpenSans
        )

        Spacer(modifier = Modifier.height(16.dp))

        PublicacionItem(
            imagen = R.drawable.convocatoria_becas,
            titulo = "Convocatoria de becas 2026",
            fecha = "Hace 2 horas",
            descripcion = "Conoce las fechas, requisitos y pasos para participar en la nueva convocatoria de becas.",
            imagenPrimero = true
        )

        HorizontalDivider(
            modifier = Modifier.padding(vertical = 22.dp),
            color = GrisDescripcion.copy(alpha = 0.15f)
        )

        Text(
            text = "Publicaciones recientes",
            color = AzulPrincipal,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = OpenSans
        )

        Spacer(modifier = Modifier.height(16.dp))

        PublicacionItem(
            imagen = R.drawable.taller_profesional,
            titulo = "Taller de desarrollo profesional",
            fecha = "Hace 2 horas",
            descripcion = "Participa en los talleres y actividades que preparamos para nuestra comunidad."
        )

        Spacer(modifier = Modifier.height(24.dp))

        PublicacionItem(
            imagen = R.drawable.actividades_octubre,
            titulo = "Actividades de octubre",
            fecha = "Hace 3 días",
            descripcion = "Consulta las próximas actividades, eventos y novedades de la fundación."
        )

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
private fun PublicacionItem(
    imagen: Int,
    titulo: String,
    descripcion: String,
    fecha: String? = null,
    imagenPrimero: Boolean = false
) {
    Column(modifier = Modifier.fillMaxWidth()) {

        if (imagenPrimero) {
            ImagenPublicacion(imagen, titulo)
            Spacer(modifier = Modifier.height(12.dp))
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = titulo,
                color = AzulOscuro,
                fontFamily = OpenSans,
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
                modifier = Modifier.weight(1f)
            )

            if (fecha != null) {
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = fecha,
                    color = GrisDescripcion,
                    fontFamily = OpenSans,
                    fontSize = 10.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = descripcion,
            color = GrisDescripcion,
            fontFamily = OpenSans,
            fontSize = 12.sp,
            lineHeight = 17.sp
        )

        if (!imagenPrimero) {
            Spacer(modifier = Modifier.height(14.dp))
            ImagenPublicacion(imagen, titulo)
        }
    }
}

@Composable
private fun ImagenPublicacion(
    imagen: Int,
    descripcion: String
) {
    Image(
        painter = painterResource(id = imagen),
        contentDescription = descripcion,
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.FillWidth
    )
}
