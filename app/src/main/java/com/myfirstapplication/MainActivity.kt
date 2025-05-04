package com.myfirstapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.myfirstapplication.ui.theme.MyFirstApplicationTheme
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstApplicationTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "welcome") {
                    composable("welcome") {
                        WelcomeScreen(navController)
                    }
                    composable("login") {
                        LoginScreen()
                    }
                    composable("register") {
                        RegisterScreen()
                    }
                }
            }
        }
    }
}

@Composable
fun WelcomeScreen(navController: androidx.navigation.NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        // Imagen
        Image(
            painter = painterResource(id = R.drawable.welcomeimage),
            contentDescription = "Welcome illustration",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            contentScale = ContentScale.Fit
        )
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "Discover Your Dream Job here",
                textAlign = TextAlign.Center,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1D4ED8)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Explore all the existing job roles based on your interest and study major",
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                color = Color.DarkGray
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {
                    navController.navigate("login")
                },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1D4ED8))
            ) {
                Text("Login", color = Color.White)
            }
            TextButton(onClick = { }) {
                Text("Register", fontWeight = FontWeight.Bold)
            }
        }
        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login here",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1D4ED8)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Welcome back you’ve been missed!",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Forgot your password?",
            color = Color(0xFF1D4ED8),
            fontSize = 14.sp,
            modifier = Modifier.align(Alignment.End)
        )
        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1D4ED8))
        ) {
            Text("Sign in", color = Color.White, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Create new account")

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Or continue with", color = Color.Gray)

        /* Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
         IconButton(onClick = { /* Google */ }) {
             Icon(painter = painterResource(R.drawable.ic_google), contentDescription = "Google")
         }
         IconButton(onClick = { /* Facebook */ }) {
             Icon(painter = painterResource(R.drawable.ic_facebook), contentDescription = "Facebook")
         }
         IconButton(onClick = { /* Apple */ }) {
             Icon(painter = painterResource(R.drawable.ic_apple), contentDescription = "Apple")
         }
        } */
    }
  }

@Composable
fun RegisterScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Create Account",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1D4ED8)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Create an account so you can explore all the existing jobs",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(32.dp))

        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = { Text("Confirm Password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1D4ED8))
        ) {
            Text("Sign up", color = Color.White, fontSize = 16.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Already have an accouint")

        Spacer(modifier = Modifier.height(24.dp))
        Text(text = "Or continue with", color = Color.Gray)

        /* Spacer(modifier = Modifier.height(16.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
         IconButton(onClick = { /* Google */ }) {
             Icon(painter = painterResource(R.drawable.ic_google), contentDescription = "Google")
         }
         IconButton(onClick = { /* Facebook */ }) {
             Icon(painter = painterResource(R.drawable.ic_facebook), contentDescription = "Facebook")
         }
         IconButton(onClick = { /* Apple */ }) {
             Icon(painter = painterResource(R.drawable.ic_apple), contentDescription = "Apple")
         }
        } */
    }
}
