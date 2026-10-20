package com.example.composable.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composable.ui.theme.ComposableTheme

@Composable
fun LoginScreen() {
    // PASO 9 - Estados
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    // PASO 3 - Scaffold y Column
    Scaffold { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            // PASO 4 - Icon AccountCircle de 80.dp (logo), color primary
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = "Logo",
                modifier = Modifier.size(80.dp),
                tint = MaterialTheme.colorScheme.primary
            )

            // PASO 5 - Spacer de 16.dp
            Spacer(modifier = Modifier.height(16.dp))

            // PASO 6 - Text "¡Bienvenido de nuevo!" (headlineMedium en negrita)
            Text(
                text = "¡Bienvenido de nuevo!",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )

            // PASO 7 - Text "Inicia sesión para continuar" (bodyLarge, color onSurfaceVariant)
            Text(
                text = "Inicia sesión para continuar",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            // PASO 8 - Spacer de 32.dp
            Spacer(modifier = Modifier.height(32.dp))

            // PASO 10 - OutlinedTextField "Correo electrónico" con icono Email
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Correo electrónico") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Correo electrónico"
                    )
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            // PASO 11 - Spacer de 16.dp
            Spacer(modifier = Modifier.height(16.dp))

            // PASO 12 - OutlinedTextField "Contraseña" con icono Lock e IconButton con el ojo
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Contraseña") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Lock,
                        contentDescription = "Contraseña"
                    )
                },
                trailingIcon = {
                    val image = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff
                    val description = if (passwordVisible) "Ocultar contraseña" else "Mostrar contraseña"
                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(imageVector = image, contentDescription = description)
                    }
                },
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            // PASO 13 - Spacer de 8.dp
            Spacer(modifier = Modifier.height(8.dp))

            // PASO 14 - TextButton "¿Olvidaste tu contraseña?" alineado a la derecha
            TextButton(
                onClick = { /* TODO */ },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text("¿Olvidaste tu contraseña?")
            }

            // PASO 15 - Spacer de 16.dp
            Spacer(modifier = Modifier.height(16.dp))

            // PASO 16 - Button "Iniciar Sesión" (fillMaxWidth, alto 50.dp, texto 16.sp negrita)
            Button(
                onClick = { /* TODO */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text(
                    text = "Iniciar Sesión",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            // PASO 17 - Spacer de 24.dp
            Spacer(modifier = Modifier.height(24.dp))

            // PASO 18 - Row con dos Divider (weight 1f) y en medio el texto " O continúa con "
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                HorizontalDivider(modifier = Modifier.weight(1f))
                Text(
                    text = " O continúa con ",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                HorizontalDivider(modifier = Modifier.weight(1f))
            }

            // PASO 19 - Spacer de 16.dp
            Spacer(modifier = Modifier.height(16.dp))

            // PASO 20 - OutlinedButton "Continuar con Google" con Icon AccountBox, color Color(0xFFEA4335)
            OutlinedButton(
                onClick = { /* TODO */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.AccountBox,
                    contentDescription = "Google",
                    tint = Color(0xFFEA4335)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Continuar con Google",
                    color = Color(0xFFEA4335),
                    fontWeight = FontWeight.Medium
                )
            }

            // PASO 21 - Spacer(modifier = Modifier.weight(1f)) (empuja el pie hacia abajo)
            Spacer(modifier = Modifier.weight(1f))

            // PASO 22 - Row: Text "¿No tienes una cuenta? " + TextButton "Regístrate"
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "¿No tienes una cuenta? ",
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                TextButton(onClick = { /* TODO */ }) {
                    Text("Regístrate")
                }
            }

            // PASO 23 - Spacer de 16.dp al final
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLogin() {
    ComposableTheme {
        LoginScreen()
    }
}
