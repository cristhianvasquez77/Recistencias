package com.example.iniciosjetpack.Items

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun menu() {

    var context = LocalContext.current

    var banda1 by remember { mutableStateOf("0") }
    var banda2 by remember { mutableStateOf("0") }
    var banda3 by remember { mutableStateOf("0") }
    var banda4 by remember { mutableStateOf("0") }
    var isExpanded by remember { mutableStateOf(false) }
    var isExpanded2 by remember { mutableStateOf(false) }
    var isExpanded3 by remember { mutableStateOf(false) }
    var isExpanded4 by remember { mutableStateOf(false) }
    var colorBanda1 by remember { mutableStateOf(Color.Transparent) }
    var colorBanda2 by remember { mutableStateOf(Color.Transparent) }
    var colorBanda3 by remember { mutableStateOf(Color.Transparent) }
    var colorBanda4 by remember { mutableStateOf(Color.Transparent) }
    var resultado by remember { mutableStateOf(0L) }


    Column(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .padding(10.dp),
         Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ExposedDropdownMenuBox(
            expanded = isExpanded,
            onExpandedChange = { isExpanded = !isExpanded } // Alterna el estado expandido
        ) {
            TextField(
                value = banda1 ?: "Valor banda 1", // Valor por defecto o el valor de banda1
                onValueChange = {},
                readOnly = true, // Solo lectura
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(isExpanded) }, // Ícono desplegable
                colors = ExposedDropdownMenuDefaults.textFieldColors(),
                modifier = Modifier
                    .menuAnchor(),
                leadingIcon = {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .background(colorBanda1) // Muestra el color seleccionado
                    )
                }
            )

            ExposedDropdownMenu(
                expanded = isExpanded,
                onDismissRequest = { isExpanded = false }
            ) {
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Black)
                            )
                            Text("  Negro - 0") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "0" // Valor para banda1
                        colorBanda1 = Color.Black
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 1", Toast.LENGTH_SHORT).show()
                    }
                )
                // Opción 2: Azul - 0
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFF795548))
                            )
                            Text("  Marron - 1") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "1" // Valor para banda1
                        colorBanda1 = (Color(0xFF795548))
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 2", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Red)
                            )
                            Text("  Rojo - 2") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "2" // Valor para banda1
                        colorBanda1 = Color.Red
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 3", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFFFA500))
                            )
                            Text("  Naranja - 3") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "3" // Valor para banda1
                        colorBanda1 = (Color(0xFFFFA500))
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 4", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Yellow)
                            )
                            Text("  Amarillo - 4") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "4" // Valor para banda1
                        colorBanda1 = Color.Yellow
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 5", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Green)
                            )
                            Text("  Verde - 5") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "5" // Valor para banda1
                        colorBanda1 = Color.Green
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 6", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Blue)
                            )
                            Text("  Azul - 6") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "6" // Valor para banda1
                        colorBanda1 = Color.Blue
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 7", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFF8A2BE2))
                            )
                            Text("  Violeta - 7") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "7" // Valor para banda1
                        colorBanda1 = (Color(0xFF8A2BE2))
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 8", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Gray)
                            )
                            Text("  Gris - 8") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "8" // Valor para banda1
                        colorBanda1 = Color.Gray
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 9", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.White)
                            )
                            Text("  Blanco - 9") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "9" // Valor para banda1
                        colorBanda1 = Color.White
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 10", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFFFD700))
                            )
                            Text("  Dorado - 10") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "10" // Valor para banda1
                        colorBanda1 = (Color(0xFFFFD700))
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 11", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFC0C0C0))
                            )
                            Text("  Plateado - 11") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda1 = "11" // Valor para banda1
                        colorBanda1 = (Color(0xFFC0C0C0))
                        isExpanded = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 12", Toast.LENGTH_SHORT).show()
                    }
                )


            }
        }
        Spacer(modifier = Modifier.padding(40.dp))
        ExposedDropdownMenuBox(
            expanded = isExpanded2,
            onExpandedChange = { isExpanded2 = !isExpanded2 } // Alterna el estado expandido
        ) {
            TextField(
                value = banda2 ?: "Valor banda 1", // Valor por defecto o el valor de banda1
                onValueChange = {},
                readOnly = true, // Solo lectura
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(isExpanded2) }, // Ícono desplegable
                colors = ExposedDropdownMenuDefaults.textFieldColors(),
                modifier = Modifier.menuAnchor(),
                leadingIcon = {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .background(colorBanda2) // Muestra el color seleccionado
                    )
                }
            )

            ExposedDropdownMenu(
                expanded = isExpanded2,
                onDismissRequest = { isExpanded2 = false }
            ) {
                // Opción 1: Negro - 0
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Black)
                            )
                            Text("  Negro - 0") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "0" // Valor para banda1
                        colorBanda2 = Color.Black
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 1", Toast.LENGTH_SHORT).show()
                    }
                )
                // Opción 2: Azul - 0
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFF795548))
                            )
                            Text("  Marron - 1") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "1" // Valor para banda1
                        colorBanda2 = (Color(0xFF795548))
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 2", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Red)
                            )
                            Text("  Rojo - 2") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "2" // Valor para banda1
                        colorBanda2 = Color.Red
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 3", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFFFA500))
                            )
                            Text("  Naranja - 3") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "3" // Valor para banda1
                        colorBanda2 = (Color(0xFFFFA500))
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 4", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Yellow)
                            )
                            Text("  Amarillo - 4") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "4" // Valor para banda1
                        colorBanda2 = Color.Yellow
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 5", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Green)
                            )
                            Text("  Verde - 5") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "5" // Valor para banda1
                        colorBanda2 = Color.Green
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 6", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Blue)
                            )
                            Text("  Azul - 6") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "6" // Valor para banda1
                        colorBanda2 = Color.Blue
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 7", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFF8A2BE2))
                            )
                            Text("  Violeta - 7") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "7" // Valor para banda1
                        colorBanda2 = (Color(0xFF8A2BE2))
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 8", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Gray)
                            )
                            Text("  Gris - 8") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "8" // Valor para banda1
                        colorBanda2 = Color.Gray
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 9", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.White)
                            )
                            Text("  Blanco - 9") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "9" // Valor para banda1
                        colorBanda2 = Color.White
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 10", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFFFD700))
                            )
                            Text("  Dorado - 10") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "10" // Valor para banda1
                        colorBanda2 = (Color(0xFFFFD700))
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 11", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFC0C0C0))
                            )
                            Text("  Plateado - 11") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda2 = "11" // Valor para banda1
                        colorBanda2 = (Color(0xFFC0C0C0))
                        isExpanded2 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 12", Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }
        Spacer(modifier = Modifier.padding(40.dp))
        ExposedDropdownMenuBox(
            expanded = isExpanded3,
            onExpandedChange = { isExpanded3 = !isExpanded3 } // Alterna el estado expandido
        ) {
            TextField(
                value = banda3 ?: "Valor banda 1", // Valor por defecto o el valor de banda1
                onValueChange = {},
                readOnly = true, // Solo lectura
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(isExpanded3) }, // Ícono desplegable
                colors = ExposedDropdownMenuDefaults.textFieldColors(),
                modifier = Modifier.menuAnchor(),
                leadingIcon = {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .background(colorBanda3) // Muestra el color seleccionado
                    )
                }
            )

            ExposedDropdownMenu(
                expanded = isExpanded3,
                onDismissRequest = { isExpanded3 = false }
            ) {
                // Opción 1: Negro - 0
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Black)
                            )
                            Text("  Negro - x1") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "1" // Valor para banda1
                        colorBanda3 = Color.Black
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 1", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFF795548))
                            )
                            Text("  Marron - x10") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "10" // Valor para banda1
                        colorBanda3 = (Color(0xFF795548))
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 2", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Red)
                            )
                            Text("  Rojo - x100") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "100" // Valor para banda1
                        colorBanda3 = Color.Red
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 3", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFFFA500))
                            )
                            Text("  Naranja - x1000") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "1000" // Valor para banda1
                        colorBanda3 = (Color(0xFFFFA500))
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 4", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Yellow)
                            )
                            Text("  Amarillo - x10,000") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "10000" // Valor para banda1
                        colorBanda3 = Color.Yellow
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 5", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Green)
                            )
                            Text("  Verde - 100,000") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "100000" // Valor para banda1
                        colorBanda3 = Color.Green
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 6", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Blue)
                            )
                            Text("  Azul - 1,000,000") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "1000000" // Valor para banda1
                        colorBanda3 = Color.Blue
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 7", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFF8A2BE2))
                            )
                            Text("  Violeta - 10,000,000") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "10000000" // Valor para banda1
                        colorBanda3 = (Color(0xFF8A2BE2))
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 8", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Gray)
                            )
                            Text("  Gris - 100,000,000") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "100000000" // Valor para banda1
                        colorBanda3 = Color.Gray
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 9", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.White)
                            )
                            Text("  Blanco - 1,000,000,000") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "1000000000" // Valor para banda1
                        colorBanda3 = Color.White
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 10", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFFFD700))
                            )
                            Text("  Dorado - x0.1") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "0.1" // Valor para banda1
                        colorBanda3 = (Color(0xFFFFD700))
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 11", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFC0C0C0))
                            )
                            Text("  Plateado - x0.01") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda3 = "0.01" // Valor para banda1
                        colorBanda3 = (Color(0xFFC0C0C0))
                        isExpanded3 = false // Cierra el menú
                        resultado = banda1.toLong() * banda2.toLong() * banda3.toLong()
                        Toast.makeText(context, "SELECCIONO OPCION 12", Toast.LENGTH_SHORT).show()
                    }
                )

            }
        }
        Spacer(modifier = Modifier.padding(40.dp))
        ExposedDropdownMenuBox(
            expanded = isExpanded4,
            onExpandedChange = { isExpanded4 = !isExpanded4 } // Alterna el estado expandido
        ) {
            TextField(
                value = banda4 ?: "Valor banda 1", // Valor por defecto o el valor de banda1
                onValueChange = {},
                readOnly = true, // Solo lectura
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(isExpanded4) }, // Ícono desplegable
                colors = ExposedDropdownMenuDefaults.textFieldColors(),
                modifier = Modifier.menuAnchor(),
                leadingIcon = {
                    Box(
                        modifier = Modifier
                            .size(24.dp)
                            .background(colorBanda4) // Muestra el color seleccionado
                    )
                }
            )

            ExposedDropdownMenu(
                expanded = isExpanded4,
                onDismissRequest = { isExpanded4 = false }
            ) {
                // Opción 1: Negro - 0
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Black)
                            )
                            Text("  Negro +/-1%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/-1%" // Valor para banda1
                        colorBanda4 = Color.Black
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 1", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFF795548))
                            )
                            Text("  Marron +/-2%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/-2%" // Valor para banda1
                        colorBanda4 = (Color(0xFF795548))
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 2", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Green)
                            )
                            Text("  Verde +/-0.5%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/-0.5%" // Valor para banda1
                        colorBanda4 = Color.Green
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 3", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Blue)
                            )
                            Text("  Azul +/-0.25%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/-0.25%" // Valor para banda1
                        colorBanda4 = Color.Blue
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 4", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFF8A2BE2))
                            )
                            Text("  Violeta +/-0.10%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/-0.10%" // Valor para banda1
                        colorBanda4 = (Color(0xFF8A2BE2))
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 5", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Gray)
                            )
                            Text("  Gris +/-0.05%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/- 0.05%" // Valor para banda1
                        colorBanda4 = Color.Gray
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 6", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFFFD700))
                            )
                            Text("  Dorado - +/-5%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/-5%" // Valor para banda1
                        colorBanda4 = (Color(0xFFFFD700))
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 7", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color(0xFFC0C0C0))
                            )
                            Text("  Plateado - +/-10%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/-10%" // Valor para banda1
                        colorBanda4 = (Color(0xFFC0C0C0))
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 8", Toast.LENGTH_SHORT).show()
                    }
                )
                DropdownMenuItem(
                    text = {
                        Row {
                            Box(
                                modifier = Modifier
                                    .size(24.dp)
                                    .background(Color.Transparent)
                            )
                            Text("  Ninguna +/-20%") // Texto de la opción
                        }
                    },
                    onClick = {
                        banda4 = "+/-20%" // Valor para banda1
                        colorBanda4 = (Color.Transparent)
                        isExpanded4 = false // Cierra el menú
                        Toast.makeText(context, "SELECCIONO OPCION 9", Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Column {
            // Fila con los colores seleccionados
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                // Color de banda1
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(colorBanda1) // Usa el color de banda1
                )

                // Color de banda2
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(colorBanda2) // Usa el color de banda2
                )

                // Color de banda3
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(colorBanda3) // Usa el color de banda3
                )
                Box(
                    modifier = Modifier
                        .size(40.dp)
                        .background(colorBanda4) // Usa el color de banda3
                )
            }

        }
        Spacer(modifier = Modifier.padding(16.dp))

        // Mostrar el resultado
        Text(
            text = "El Resultado es: $resultado Ohms $banda4",
            style = MaterialTheme.typography.bodySmall,
            modifier = Modifier.padding(40.dp)
        )

    }
}