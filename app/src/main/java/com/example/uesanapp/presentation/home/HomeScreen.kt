/*
package com.example.uesanapp.presentation.home
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.uesanapp.data.model.CountryModel
import androidx.compose.foundation.layout.fillMaxWidth
val mockCountries = listOf(
    CountryModel("USA", 1, "https://flagcdn.com/w320/us.png"),
    CountryModel("Canada", 2, "https://flagcdn.com/w320/pe.png"),
    CountryModel("Mexico", 3, "https://flagcdn.com/w320/mx.png"),
    CountryModel("Brazil", 4, "https://flagcdn.com/w320/br.png"),
    CountryModel("Argentina", 5, "https://flagcdn.com/w320/ar.png")

)
@Composable
fun HomeScreen(items: (List<CountryModel?>, Any?) -> Modifier) {
    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize().statusBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) { /*{
        Text(
            text = "Bienvenido a HomeScreen",
            style = MaterialTheme.typography.headlineMedium
        )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Bienvenido a HomeScreen",
            style = MaterialTheme.typography.headlineMedium
        )*/

        Text("Ranking FIFA 2026")
        Spacer(modifier = Modifier.height(9.dp))


        LazyColumn {
            items(mockCountries) { country ->
                Card(
                    modifier =  Modifier.
                                fillMaxSize().
                                padding(vertical = 8.dp)
                ) {
                    Row(
                        modifier = Modifier.padding(16.dp)
                    ) {

                    }
                }
            }
        }
    }
}

*/

package com.example.uesanapp.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.uesanapp.data.model.CountryModel

val mockCountries = listOf(
    CountryModel("USA", 1, "https://flagcdn.com/w320/us.png"),
    CountryModel("Canada", 2, "https://flagcdn.com/w320/pe.png"),
    CountryModel("Mexico", 3, "https://flagcdn.com/w320/mx.png"),
    CountryModel("Brazil", 4, "https://flagcdn.com/w320/br.png"),
    CountryModel("Argentina", 5, "https://flagcdn.com/w320/ar.png")
)

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .statusBarsPadding(),

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text("Ranking FIFA 2026")

        Spacer(modifier = Modifier.height(9.dp))

        LazyColumn {

            items(mockCountries) { country ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {

                    Row(
                        modifier = Modifier.padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        Image(
                            painter = rememberAsyncImagePainter(country.imageUrl),
                            contentDescription = country.name,
                            modifier = Modifier
                                .size(80.dp)
                                .padding(end = 16.dp),
                            contentScale = ContentScale.Crop
                        )

                        Column {

                            Text(
                                text = country.name,
                                style = MaterialTheme.typography.titleMedium
                            )

                            Text("RANKING FIFA 2026: ${country.ranking}")
                        }
                    }
                }
            }
        }
    }
}