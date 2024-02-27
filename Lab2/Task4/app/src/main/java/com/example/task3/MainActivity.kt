package com.example.lab2task4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab2task4.ui.theme.Lab2Task4Theme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2Task4Theme {

                val images = listOf(
                    R.drawable.dhaka_600x600,
                    R.drawable.sundarbans_600x600,
                    R.drawable.sonargaon_600x600,
                    R.drawable.barisal_600x600,
                    R.drawable.srimangal_600x600,
                    R.drawable.chittagong_600x600,

                    )
                val titles = listOf(
                    "Dhaka",
                    "Sundarbans",
                    "Sonargaon",
                    "Barisal",
                    "Srimangal",
                    "Chittagong"
                )
                Column (modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxSize()
                ){

                    Text(text = "Lazy Grid Layout", fontSize = 20.sp, color = Color.White,
                        modifier = Modifier
                            .background(color = Color.Blue)
                            .fillMaxWidth()
                            .height(60.dp)
                            .offset(x = 10.dp, y = 15.dp)
                    )


                    LazyVerticalGrid(columns = GridCells.Fixed(2),
                        content = {
                            items(images.size) { index ->
                                Column(
                                    modifier = Modifier
                                        .background(Color.White)
                                        .offset(y=15.dp)


                                ) {
                                    Image(
                                        painter = painterResource(id = images[index]),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .fillMaxWidth()
                                            .height(160.dp)
                                    )

                                    Text(
                                        text = titles[index],
                                        color = Color.White, fontSize = 16.sp,
                                        modifier = Modifier
                                            .background(color = Color.Blue)
                                            .width(160.dp)
                                            .height(60.dp)
                                            .padding(vertical = 8.dp)
                                            .align(Alignment.CenterHorizontally)
                                            .offset(10.dp)

                                    )
                                }




                            }
                        }, modifier = Modifier.background(color = Color.White))

                }
            }
        }
    }

    @ExperimentalFoundationApi
    @Preview(showBackground = true)
    @Composable
    fun GridPreview() {
        Lab2Task4Theme {
            // Preview code
            val images = listOf(
                R.drawable.dhaka_600x600,
                R.drawable.sundarbans_600x600,
                R.drawable.sonargaon_600x600,
                R.drawable.barisal_600x600,
                R.drawable.srimangal_600x600,
                R.drawable.chittagong_600x600,

            )
            val titles = listOf(
                "Dhaka",
                "Sundarbans",
                "Sonargaon",
                "Barisal",
                "Srimangal",
                "Chittagong"
            )
            Column (modifier = Modifier
                .background(color = Color.White)
                .fillMaxSize()
                ){

                Text(text = "Lazy Grid Layout", fontSize = 20.sp, color = Color.White,
                    modifier = Modifier
                        .background(color = Color.Blue)
                        .fillMaxWidth()
                        .height(60.dp)
                        .offset(x = 10.dp, y = 15.dp)
                    )


            LazyVerticalGrid(columns = GridCells.Fixed(2),
                content = {
                    items(images.size) { index ->
                        Column(
                            modifier = Modifier
                                .background(Color.White)
                                .offset(y=15.dp)

                        ) {
                            Image(
                                painter = painterResource(id = images[index]),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(160.dp)

                            )

                            Text(
                                text = titles[index],
                                color = Color.White, fontSize = 16.sp,
                                modifier = Modifier
                                    .background(color = Color.Blue)
                                    .width(160.dp)
                                    .height(60.dp)
                                    .padding(vertical = 8.dp)
                                    .align(Alignment.CenterHorizontally)
                                    .offset(10.dp)

                            )
                        }




                    }
                }, modifier = Modifier.background(color = Color.White))

        }
        }
    }


}
