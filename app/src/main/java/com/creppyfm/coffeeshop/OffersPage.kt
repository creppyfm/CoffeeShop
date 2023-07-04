package com.creppyfm.coffeeshop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.creppyfm.coffeeshop.ui.theme.Alternative2

//Preview composable to pass valid arguments
@Preview(showBackground = true, widthDp = 400)
@Composable
private fun Offer_Preview() {
    OffersPage()
}

//Offer Page view composable
//@Preview(showBackground = true, widthDp = 400)
@Composable
fun OffersPage() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
        .verticalScroll(rememberScrollState())
    ) {
        //OffersPageHeader()
        Offer(title = "Early Bird Special", description = "10% off. Offer valid weekdays from 4am until 7am.")
        Offer(title = "Welcome Gift", description = "25% off on your first order of $10 or more.")
        Offer(title = "Night Owl", description = "10% off. Offer valid weekdays from 7pm until 9pm.")
        Offer(title = "Intern Special", description = "10% off when you buy 3 or more regular coffees.")
    }
}

/*@Preview(showBackground = true, widthDp = 400)
@Composable
fun OffersPageHeader() {
    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Offers",
                style = MaterialTheme.typography.headlineLarge,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(8.dp, 0.dp, 8.dp, 0.dp)
                    .background(Alternative2)
                    .padding(8.dp, 0.dp, 8.dp, 0.dp)
            )
        }
    }
}*/

//Offer composable
@Composable
fun Offer(title: String, description: String) {

    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.background_pattern),
            contentDescription = "Background Pattern",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.matchParentSize()
        )

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Alternative2)
                    .padding(16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = description,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .padding(16.dp)
                    .background(Alternative2)
                    .padding(16.dp)
            )
        }
    }

}