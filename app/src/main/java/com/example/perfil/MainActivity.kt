package com.example.perfil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.perfil.ui.theme.PerfilTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PerfilTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ImagemFundo()
                    Cabecalho()
                    Rodape()

                }
            }
        }
    }
    @Composable
    fun Rodape() {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(10.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Contato(
                painter = painterResource(id =  R.drawable.telefone),
                text = "MILENA"
            )
            Contato(
                painter  = painterResource(id =  R.drawable.telefone),
                text = "11 94077-6073"
            )
            Contato(
                painter = painterResource(id =  R.drawable.telefone),
                text = "11 94077-6073"
            )
        }
    }
    private @Composable
    fun Contato(painter: Painter, text:String) {

        Divider(
            color = Color.Blue,
            modifier = Modifier
                .fillMaxWidth()
                .height(0.5.dp)
        )
        Row (
            modifier= Modifier
                .padding(top = 10.dp, start = 30.dp)
                ) {
            Image(
                painter = painterResource(id = R.drawable.telefone),
                contentDescription = null,
                modifier = Modifier
                    .size(25.dp)
            )
            Text(
                text = text,
                fontSize = 25.sp,
                color = Color.LightGray,
                textAlign = TextAlign.Left,
            )
        }
    }
    @Composable
    private fun ImagemFundo(modifier: Modifier = Modifier ) {

        val ImagemFundo = painterResource(id = R.drawable._11111111111111111111111111)
        Image(
            painter =ImagemFundo ,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}
@Composable
fun Cabecalho() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(R.drawable.icone2) ,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
        )
        Text(
            text = "Milena Martins",
            color = Color.DarkGray,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Desenvolvedora - DEV TI",
            color = Color.Gray,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PerfilTheme {
        Cabecalho()
    }
}
