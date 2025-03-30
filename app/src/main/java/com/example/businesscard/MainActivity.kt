package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BusinessCardMainScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(color = Color(0xB33DDC84))) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxHeight().fillMaxWidth()
        ) {
            DisplayDetails()
        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxHeight().fillMaxWidth().padding(16.dp)
        ) {
            DisplayContacts()
        }

    }
}

@Composable
fun DisplayDetails(modifier : Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier.size(150.dp)
        )
        Text(
            text = stringResource(id = R.string.business_card_name),
            fontSize = 36.sp,
            fontWeight = FontWeight.ExtraBold,
            modifier = modifier
        )
        Text(
            text = stringResource(id = R.string.business_card_title),
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
        )
    }
}

//@Preview(showSystemUi = true)
@Composable
fun DisplayContacts(modifier : Modifier = Modifier) {
    Column {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.padding(16.dp, 0.dp, 16.dp, 0.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.business_phone_no),
                contentDescription = "business phone number",
            )
            Spacer(
                modifier = modifier.width(16.dp)
            )
            Text(
                text = stringResource(id = R.string.business_phone_number),
                fontSize = 16.sp,
                color = Color(0xFFFFFFFF)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.padding(16.dp, 0.dp, 16.dp, 0.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.business_social),
                contentDescription = "business social"
            )
            Spacer(
                modifier = modifier.width(16.dp)
            )
            Text(
                text = stringResource(id = R.string.business_social_media),
                fontSize = 16.sp,
                color = Color(0xFFFFFFFF)
            )
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.padding(16.dp, 0.dp, 16.dp, 0.dp)) {
            Icon(
                painter = painterResource(id = R.drawable.business_email),
                contentDescription = "business email"
            )
            Spacer(
                modifier = modifier.width(16.dp)
            )
            Text(
                text = stringResource(id = R.string.business_email),
                fontSize = 16.sp,
                color = Color(0xFFFFFFFF)
            )
        }
    }
}