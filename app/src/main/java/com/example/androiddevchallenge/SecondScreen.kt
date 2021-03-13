/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.Password
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.grey_900

@Composable
fun Login(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val textfieldModifier = Modifier
        .height(56.dp)
        .fillMaxWidth()

    Scaffold(
        backgroundColor = if (isSystemInDarkTheme()) grey_900 else Color.White
    ) {

        Column(modifier = Modifier.fillMaxSize()) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp)
                    .fillMaxHeight(0.5F)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.login_bg),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.FillBounds
                )
                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(152.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Text(
                            "Welcome",
                            style = MaterialTheme.typography.h2,
                            color = Color.White,

                        )
                    }
                    Text(
                        "back",
                        style = MaterialTheme.typography.h2,
                        color = Color.White,

                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
                    .fillMaxHeight(0.5F)
            ) {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Box() {
                        OutlinedTextField(
                            value = email,
                            onValueChange = {
                                email = it
                            },
                            modifier = textfieldModifier, textStyle = MaterialTheme.typography.body1,
                            placeholder = { Text("Email address", style = MaterialTheme.typography.body1) },
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                leadingIconColor = MaterialTheme.colors.onSurface,
                                placeholderColor = MaterialTheme.colors.onSurface,
                                textColor = MaterialTheme.colors.onSurface,
                                disabledBorderColor = MaterialTheme.colors.onSurface,
                                focusedBorderColor = MaterialTheme.colors.onSurface,
                                unfocusedBorderColor = MaterialTheme.colors.onSurface

                            ),
                            leadingIcon = {
                                Icon(
                                    Icons.Outlined.Mail, contentDescription = "", tint = MaterialTheme.colors.onSurface,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        )
                    }
                    Box() {
                        OutlinedTextField(
                            value = password,
                            onValueChange = {
                                password = it
                            },
                            modifier = textfieldModifier, textStyle = MaterialTheme.typography.body1,
                            placeholder = {
                                Text(
                                    "Password",
                                    style = MaterialTheme.typography.body1,

                                )
                            },
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                leadingIconColor = MaterialTheme.colors.onSurface,
                                placeholderColor = MaterialTheme.colors.onSurface,
                                textColor = MaterialTheme.colors.onSurface,
                                disabledBorderColor = MaterialTheme.colors.onSurface,
                                focusedBorderColor = MaterialTheme.colors.onSurface,
                                unfocusedBorderColor = MaterialTheme.colors.onSurface

                            ),
                            leadingIcon = {
                                Icon(
                                    Icons.Outlined.Password, contentDescription = "", tint = MaterialTheme.colors.onSurface,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                        )
                    }

                    Box(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .height(48.dp)
                            .fillMaxWidth()
                    ) {
                        Button(
                            onClick = {
                                navController.navigate("Main")
                            },
                            shape = RoundedCornerShape(48),
                            elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                            modifier = Modifier
                                .height(48.dp)
                                .fillMaxWidth()
                        ) {
                            Text("LOG IN", style = MaterialTheme.typography.button, color = grey_900)
                        }
                    }
                }
            }
        }
    }
}
@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginPreview() {
    val navController = rememberNavController()
    MyTheme {
        Login(navController = navController)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun LoginDarkPreview() {
    val navController = rememberNavController()
    MyTheme(darkTheme = true) {
        Login(navController = navController)
    }
}
