package com.example.laboratorio_3_pm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laboratorio_3_pm.ui.theme.Laboratorio3PMTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio3PMTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NameList(
                        names = listOf("Javier Linares 231135", "Marcos Ambrocio 231140", "Daniel Chet 231177", "Nombre Apellido Carnet", "Nombre Apellido Carnet"),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun NameList(names: List<String>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(names) { name ->
            NameItem(name = name)
        }
    }
}

@Composable
fun NameItem(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier.padding(8.dp)
    )
}