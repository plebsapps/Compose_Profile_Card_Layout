package ch.plebsapps.composeprofilecardlayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ch.plebsapps.composeprofilecardlayout.ui.theme.LightGreen
import ch.plebsapps.composeprofilecardlayout.ui.theme.MyTheme
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MainScreen(userProfileList)
            }
        }
    }
}


@Composable
fun MainScreen(userProfiles: List<UserProfile>) {
    Scaffold(topBar = { AppBar() }) {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            LazyColumn() {
                items(userProfiles) { userProfile ->
                    ProfileCard(userProfile = userProfile)
                }
            }
        }
    }
}


@Composable
fun AppBar() {
    TopAppBar(
        navigationIcon = {
            Icon(
                Icons.Default.Home,
                contentDescription = "Content Description",
                modifier = Modifier.padding(12.dp)
            )
        },
        title = { Text("Messaging Application users") }
    )
}

@Composable
fun ProfileCard(userProfile: UserProfile) {
    Card(
        modifier = Modifier
            .padding(top = 8.dp, bottom = 4.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top),
        elevation = 8.dp,
        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture(userProfile.pictureUrl, userProfile.status)
            ProfileContent(userProfile.name, userProfile.status)
        }
    }
}

@Composable
fun ProfileContent(userName: String, onlineStatus: Boolean) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Text(
            userName,
            color = if (onlineStatus) Color.Black else Color.Gray,
            style = MaterialTheme.typography.h5
        )
        Text(
            text = if (onlineStatus) "Active now" else "Offline",
            color = if (onlineStatus) Color.DarkGray else Color.Gray,
            style = MaterialTheme.typography.body2
        )
    }
}



@Composable
fun ProfilePicture(pictureURL: String, onlineStatus: Boolean) {
    Card(
        shape = CircleShape,
        border = BorderStroke(
            width = 2.dp,
            color = if (onlineStatus) MaterialTheme.colors.LightGreen else Color.Red
        ),
        modifier = Modifier.padding(16.dp),
        elevation = 4.dp
    )
    {
        AsyncImage (
            model = pictureURL,
            contentDescription = "Pictures",
            modifier = Modifier.size(72.dp)
        )
        /*
        Image (
            painter = painterResource(id = R.drawable.images3),
            contentDescription = "Picture",
            modifier = Modifier.size(72.dp)
        )*/
    }

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyTheme {
        MainScreen(userProfileList)
    }
}