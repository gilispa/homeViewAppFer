
package islas.gilberto.fundacion_inicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import islas.gilberto.fundacion_inicio.ui.components.AppHeader
import islas.gilberto.fundacion_inicio.ui.components.BottomNavBar
import islas.gilberto.fundacion_inicio.ui.screens.InicioScreen
import islas.gilberto.fundacion_inicio.ui.theme.FundacionFERTheme
import islas.gilberto.fundacion_inicio.ui.theme.FondoGeneral

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FundacionFERTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = FondoGeneral,
                    topBar = {
                        AppHeader()
                    },
                    bottomBar = {
                        BottomNavBar()
                    }
                ) { innerPadding ->
                    androidx.compose.foundation.layout.Box(
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        InicioScreen()
                    }
                }
            }
        }
    }
}
