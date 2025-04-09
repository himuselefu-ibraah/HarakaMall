package com.nyokabi.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.neworange
import com.nyokabi.harakamall.ui.theme.neworangeone

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize().background(color = neworange)
        ){
        Box (){
            //Card
            Card (modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(neworangeone)
            ){
                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) { Icon(imageVector = Icons.Default.Menu, contentDescription = "rong reggea") }
                    }
                )


            }
            //End of Card

            //2ND CARD
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .align(alignment = Alignment.BottomCenter)
                .padding(start = 20.dp, end = 20.dp)
                .offset(y = 90.dp)

            ){ Text(text = "ARSENAL WON", fontSize = 50.sp) }
        }
        //end of box

        Spacer(modifier = Modifier.height(110.dp))

        //row
        Row (modifier = Modifier.padding(start = 20.dp)){
            //card1
            Card (modifier = Modifier.width(150.dp).height(180.dp)){
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,


                    )
                {
                    Image(painter = painterResource(R.drawable.min),
                        contentDescription = "lambo",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 25.sp)
                }
            }
            //cardend
            Spacer(modifier = Modifier.width(40.dp))
            //card2
            Card (modifier = Modifier.width(150.dp).height(180.dp)){
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,


                    )
                {
                    Image(painter = painterResource(R.drawable.min),
                        contentDescription = "lambo",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "About", fontSize = 25.sp)
                }
            }
        }
        //endrow

        Spacer(modifier = Modifier.height(20.dp))

        //row
        Row (modifier = Modifier.padding(start = 20.dp)){
            //card1
            Card (modifier = Modifier.width(150.dp).height(180.dp)){
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,


                    )
                {
                    Image(painter = painterResource(R.drawable.min),
                        contentDescription = "lambo",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Contact", fontSize = 25.sp)
                }
            }
            //cardend
            Spacer(modifier = Modifier.width(40.dp))
            //card2
            Card (modifier = Modifier.width(150.dp).height(180.dp)){
                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,


                    )
                {
                    Image(painter = painterResource(R.drawable.min),
                        contentDescription = "lambo",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 25.sp)
                }
            }
        }

    }


}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){

    DashboardScreen(rememberNavController())
}