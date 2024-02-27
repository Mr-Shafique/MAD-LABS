package com.example.lab2.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab2.R
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


class task2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Wellcome("Android")
                }
            }
        }
    }
}



@Composable
fun Wellcome(name: String, modifier: Modifier = Modifier.fillMaxSize()
) {

    Column(modifier=Modifier.fillMaxSize()) {
        var InputText= remember {
            mutableStateOf("")
        }
//second state
        var numberfield= remember {
            mutableStateOf("")
        }
        Row(modifier=Modifier
            .padding(10.dp)

        ) {

            Image(painter = painterResource(R.drawable.ic_launcher_background), contentDescription ="" )
            Column(modifier= Modifier
                .offset(10.dp)
                .width(250.dp)

            ) {


                TextField(value = InputText.value, shape = RoundedCornerShape(16.dp), onValueChange ={
                    InputText.value=it
                } )
                    Spacer(modifier = Modifier.height(10.dp))
                TextField(value = numberfield.value, shape = RoundedCornerShape(16.dp), onValueChange ={
                    InputText.value=it
                } )


            }
        }

    }



}

@Preview(showBackground = true)
@Composable
fun WellcomePreview() {
    Lab2Theme {

        Wellcome(name = "talabdar")
    }
}