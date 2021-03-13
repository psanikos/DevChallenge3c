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

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
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
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.ui.theme.CustomColor1
import com.example.androiddevchallenge.ui.theme.CustomColor2
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.grey_900

@Composable
fun MainScreen(navController: NavController) {
    Scaffold(
        backgroundColor = MaterialTheme.colors.background
    ) {

        LazyColumn(
            modifier = Modifier

                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            item {
                Column(
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top
                ) {

                    Box(modifier = Modifier.height(64.dp), contentAlignment = Alignment.BottomCenter) {

                        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {

                            Text("ACCOUNT", style = MaterialTheme.typography.button.copy(color = Color.White))
                            Text("WATCHLIST", style = MaterialTheme.typography.button, color = Color.White.copy(alpha = 0.7F))
                            Text("PROFILE", style = MaterialTheme.typography.button, color = Color.White.copy(alpha = 0.7F))
                        }
                    }

                    Box(
                        modifier = Modifier
                            .padding(vertical = 8.dp)
                            .height(32.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {

                        Text("Balance", style = MaterialTheme.typography.subtitle1.copy(color = Color.White))
                    }

                    Box(
                        modifier = Modifier
                            .padding(bottom = 24.dp)
                            .height(48.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {

                        Text("$73,589.01", style = MaterialTheme.typography.h1.copy(color = Color.White))
                    }

                    Box(
                        modifier = Modifier
                            .padding(bottom = 32.dp)
                            .height(18.dp),
                        contentAlignment = Alignment.BottomCenter
                    ) {

                        Text("+412.35 today", style = MaterialTheme.typography.subtitle1.copy(color = CustomColor1))
                    }

                    Box(
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .height(48.dp)
                            .fillMaxWidth()
                    ) {
                        Button(
                            onClick = {
                            },
                            shape = RoundedCornerShape(48),
                            elevation = ButtonDefaults.elevation(defaultElevation = 0.dp),
                            colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary),
                            modifier = Modifier
                                .height(48.dp)
                                .fillMaxWidth()
                        ) {
                            Text("TRANSACT", style = MaterialTheme.typography.button, color = grey_900)
                        }
                    }

                    Box(
                        modifier = Modifier
                            .padding(bottom = 16.dp)
                            .height(40.dp)
                            .fillMaxWidth()
                    ) {
                        LazyRow(
                            content = {

                                item {
                                    Surface(
                                        modifier = Modifier.padding(end = 8.dp),
                                        elevation = 0.dp,
                                        shape = RoundedCornerShape(48),
                                        color = Color.Transparent,
                                        border = BorderStroke(
                                            width = 1.dp,
                                            color = Color.White
                                        )
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .height(40.dp)
                                                .padding(horizontal = 16.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Row(
                                                verticalAlignment = Alignment.CenterVertically,

                                            ) {
                                                Text("Week", style = MaterialTheme.typography.body1.copy(Color.White))
                                                Icon(
                                                    Icons.Filled.ExpandMore,
                                                    contentDescription = "",
                                                    tint = Color.White,

                                                )
                                            }
                                        }
                                    }
                                }
                                item {
                                    Surface(
                                        modifier = Modifier.padding(end = 8.dp),
                                        elevation = 0.dp,
                                        color = Color.Transparent,
                                        shape = RoundedCornerShape(48),
                                        border = BorderStroke(
                                            width = 1.dp,
                                            color = Color.White
                                        )
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .height(40.dp)
                                                .padding(horizontal = 16.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                "ETFs",
                                                style = MaterialTheme.typography.body1.copy(Color.White),

                                            )
                                        }
                                    }
                                }
                                item {
                                    Surface(
                                        modifier = Modifier.padding(end = 8.dp),

                                        elevation = 0.dp,
                                        shape = RoundedCornerShape(48),
                                        color = Color.Transparent,
                                        border = BorderStroke(
                                            width = 1.dp,
                                            color = Color.White
                                        )
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .height(40.dp)
                                                .padding(horizontal = 16.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                "Stocks",
                                                style = MaterialTheme.typography.body1.copy(Color.White),

                                            )
                                        }
                                    }
                                }
                                item {
                                    Surface(
                                        modifier = Modifier.padding(end = 8.dp),
                                        elevation = 0.dp,
                                        shape = RoundedCornerShape(48),
                                        color = Color.Transparent,
                                        border = BorderStroke(
                                            width = 1.dp,
                                            color = Color.White
                                        )
                                    ) {
                                        Box(
                                            modifier = Modifier
                                                .height(40.dp)
                                                .padding(horizontal = 16.dp),
                                            contentAlignment = Alignment.Center
                                        ) {
                                            Text(
                                                "Funds",
                                                style = MaterialTheme.typography.body1.copy(Color.White),

                                            )
                                        }
                                    }
                                }
                            }
                        )
                    }

                    Image(
                        painter = painterResource(id = R.drawable.home_illos), contentDescription = "",
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.FillWidth
                    )

                    Spacer(modifier = Modifier.height(32.dp))
                }
            }

            item {
                Surface(modifier = Modifier.fillMaxWidth(), color = MaterialTheme.colors.surface) {

                    Column() {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(40.dp),
                            contentAlignment = Alignment.BottomCenter
                        ) {
                            Text(
                                "Positions",
                                style = MaterialTheme.typography.subtitle1.copy(
                                    color = MaterialTheme.colors.onSurface
                                )
                            )
                        }
                        Spacer(modifier = Modifier.height(24.dp))

                        MainCard(imageId = R.drawable.home_alk, isUp = false, title = "ALK", imageDescription = "Alaska Air Group, Inc", price = "$7,918", change = "-0.54%")
                        MainCard(imageId = R.drawable.home_ba, isUp = true, title = "BA", imageDescription = "Boeing Co.", price = "$1,293", change = "+4.18%")
                        MainCard(imageId = R.drawable.home_dal, isUp = false, title = "DAL", imageDescription = "Delta Airlines Inc.", price = "$893,50", change = "-0.54%")
                        MainCard(imageId = R.drawable.home_exp, isUp = true, title = "EXPE", imageDescription = "Expedia Group Inc.", price = "$12,301", change = "+2.51%")
                        MainCard(imageId = R.drawable.home_eadsy, isUp = true, title = "EADSY", imageDescription = "Airbus SE", price = "$12,301", change = "+1.38%")
                        MainCard(imageId = R.drawable.home_jblu, isUp = true, title = "JBLU", imageDescription = "JetBlue Airways Corp.", price = "$8,521", change = "+1.56%")
                        MainCard(imageId = R.drawable.home_mar, isUp = true, title = "MAR", imageDescription = "Marriot Insternational Inc.", price = "$521", change = "+2.75%")
                        MainCard(imageId = R.drawable.home_ccl, isUp = true, title = "CCL", imageDescription = "Carnival Corp.", price = "$5,481", change = "+0.14%")
                        MainCard(imageId = R.drawable.home_rcl, isUp = true, title = "RCL", imageDescription = "Royal Caribbean Cruises", price = "$9,184", change = "+1.69%")
                        MainCard(imageId = R.drawable.home_trvl, isUp = true, title = "TRVL", imageDescription = "Travelocity Inc.", price = "$654", change = "+3.23%")
                    }
                }
            }
        }
    }
}

@Composable
fun MainCard(imageId: Int, isUp: Boolean, title: String, imageDescription: String, price: String, change: String) {
    Box(
        modifier = Modifier
            .height(56.dp)
            .padding(horizontal = 16.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Divider()
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                Column(modifier = Modifier.fillMaxWidth(0.75F)) {
                    Box(modifier = Modifier.height(24.dp), contentAlignment = Alignment.BottomStart) {
                        Row() {
                            Text(price, style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface))
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(title, style = MaterialTheme.typography.h3.copy(color = MaterialTheme.colors.onSurface))
                        }
                    }
                    Box(modifier = Modifier.height(16.dp), contentAlignment = Alignment.BottomStart) {
                        Row() {
                            Text(change, style = MaterialTheme.typography.body1.copy(color = if (isUp) CustomColor1 else CustomColor2))
                            Spacer(modifier = Modifier.width(16.dp))
                            Text(imageDescription, style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onSurface))
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }
                Image(painter = painterResource(id = imageId), contentDescription = "", contentScale = ContentScale.Fit)
            }
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun MainScreenPreview() {
    val navController = rememberNavController()
    MyTheme {
        MainScreen(navController = navController)
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun MainScreenDarkPreview() {
    val navController = rememberNavController()
    MyTheme(darkTheme = true) {
        MainScreen(navController = navController)
    }
}
