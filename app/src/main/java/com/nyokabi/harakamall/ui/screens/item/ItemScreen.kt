package com.nyokabi.harakamall.ui.screens.item



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nyokabi.harakamall.R
import com.nyokabi.harakamall.ui.theme.newblue
import com.nyokabi.harakamall.ui.theme.neworange
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        //start of topappbar
        TopAppBar(
            title = { Text(text = "Products") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = neworange,
                titleContentColor = newblue,
                navigationIconContentColor = newblue



            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "Shoppingcart")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notification")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "Notification")
                }


            }
        )
        //endtopappbar

        Image(painter = painterResource(R.drawable.lambo),
            contentDescription = "lambo",
            modifier = Modifier.fillMaxWidth().height(200.dp),
            contentScale = ContentScale.FillWidth
        )

        Spacer(modifier = Modifier.height(20.dp))

        //searchbar

        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search") },
            placeholder = { Text(text = "Search ...") }
        )

        //end of searchbar

        Spacer(modifier = Modifier.height(10.dp))

      Column (modifier = Modifier.verticalScroll(rememberScrollState())){

          Row (
              modifier = Modifier.padding(start = 10.dp, end = 10.dp)
          ) {
              Image(painter = painterResource(R.drawable.img),
                  contentDescription = "Image",
                  modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(15.dp)),
                  contentScale = ContentScale.FillWidth
              )

              Spacer(modifier = Modifier.width(10.dp))

              Column (){
                  Text(text="GTR",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold

                  )
                  Text(text="Car has everything you need",
                      fontSize = 15.sp,
                  )
                  Text(text="It now in Kenya",
                      fontSize = 15.sp,
                  )
                  Text(text = "Ksh 100000000000",
                      textDecoration = TextDecoration.LineThrough)
                  Text(text=" Price = Ksh200000000000000",

                      )
                  Row (
                  ){
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Spacer(modifier = Modifier.height(10.dp))


                  }
                  Button(onClick = {},
                      colors = ButtonDefaults.buttonColors(neworange),
                      shape = RoundedCornerShape(10.dp),
                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
                  ) {
                      Text( text = "Contact Us")
                  }

              }



          }


          //Row starts here
          Row (
              modifier = Modifier.padding(start = 10.dp, end = 10.dp)
          ) {
              Image(painter = painterResource(R.drawable.img),
                  contentDescription = "Image",
                  modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(15.dp)),
                  contentScale = ContentScale.FillWidth
              )

              Spacer(modifier = Modifier.width(10.dp))

              Column (){
                  Text(text="GTR",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold

                  )
                  Text(text="Car has everything you need",
                      fontSize = 15.sp,
                  )
                  Text(text="It now in Kenya",
                      fontSize = 15.sp,
                  )
                  Text(text = "Ksh 100000000000",
                      textDecoration = TextDecoration.LineThrough)
                  Text(text=" Price = Ksh200000000000000",

                      )
                  Row (
                  ){
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Spacer(modifier = Modifier.height(10.dp))


                  }
                  Button(onClick = {},
                      colors = ButtonDefaults.buttonColors(neworange),
                      shape = RoundedCornerShape(10.dp),
                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
                  ) {
                      Text( text = "Contact Us")
                  }

              }



          }
          Row (
              modifier = Modifier.padding(start = 10.dp, end = 10.dp)
          ) {
              Image(painter = painterResource(R.drawable.img),
                  contentDescription = "Image",
                  modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(15.dp)),
                  contentScale = ContentScale.FillWidth
              )

              Spacer(modifier = Modifier.width(10.dp))

              Column (){
                  Text(text="GTR",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold

                  )
                  Text(text="Car has everything you need",
                      fontSize = 15.sp,
                  )
                  Text(text="It now in Kenya",
                      fontSize = 15.sp,
                  )
                  Text(text = "Ksh 100000000000",
                      textDecoration = TextDecoration.LineThrough)
                  Text(text=" Price = Ksh200000000000000",

                      )
                  Row (
                  ){
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Spacer(modifier = Modifier.height(10.dp))


                  }
                  Button(onClick = {},
                      colors = ButtonDefaults.buttonColors(neworange),
                      shape = RoundedCornerShape(10.dp),
                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
                  ) {
                      Text( text = "Contact Us")
                  }

              }



          }
          Row (
              modifier = Modifier.padding(start = 10.dp, end = 10.dp)
          ) {
              Image(painter = painterResource(R.drawable.img),
                  contentDescription = "Image",
                  modifier = Modifier.width(200.dp).height(150.dp).clip(shape = RoundedCornerShape(15.dp)),
                  contentScale = ContentScale.FillWidth
              )

              Spacer(modifier = Modifier.width(10.dp))

              Column (){
                  Text(text="GTR",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold

                  )
                  Text(text="Car has everything you need",
                      fontSize = 15.sp,
                  )
                  Text(text="It now in Kenya",
                      fontSize = 15.sp,
                  )
                  Text(text = "Ksh 100000000000",
                      textDecoration = TextDecoration.LineThrough)
                  Text(text=" Price = Ksh200000000000000",

                      )
                  Row (
                  ){
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "my", tint = neworange)
                      Spacer(modifier = Modifier.height(10.dp))


                  }
                  Button(onClick = {},
                      colors = ButtonDefaults.buttonColors(neworange),
                      shape = RoundedCornerShape(10.dp),
                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp)
                  ) {
                      Text( text = "Contact Us")
                  }

              }



          }
          

      }


    }


}

@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
ItemScreen(rememberNavController())
}