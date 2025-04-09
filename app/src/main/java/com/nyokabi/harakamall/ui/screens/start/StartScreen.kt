package com.nyokabi.harakamall.ui.screens.start



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_ITEM
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.neworange


@Composable
fun StartScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(text = "I am Jose Mourinho",
            fontSize = 20.sp)

        Spacer(modifier = Modifier.height(20.dp))

        //Circular Shape
        Image(painter = painterResource(R.drawable.estavio),
            contentDescription = "estavio",
            modifier = Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop)
        //End of circular

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Youngest Bestplayer!!",
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            color = neworange

            )
        Text(text = "Chelsea-bound Estevao Willian has given another boost to the Blues ahead of his move to Stamford Bridge.\n" +
                "\n" +
                "It was in June last year that Chelsea agreed a swoop to snap-up Estevao on a permanent deal from Brazilian club Palmeiras. The Blues agreed an initial £29million fee, which could rise to £55million with add-ons, with the 17-year-old set to formally complete his move to west London this summer.",
            textAlign = TextAlign.Center,
            fontSize = 18.sp)

        Button(onClick = {
            navController.navigate(ROUT_ITEM)
        },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
        ) {
            Text( text = "Add to cart")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen(rememberNavController())

}