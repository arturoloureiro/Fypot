package com.example.fypot.presentation.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.example.fypot.presentation.model.Artist
import com.example.fypot.ui.theme.Black
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.firestore
//@Preview
@Composable
fun HomeScreen(db: FirebaseFirestore, viewmodel: HomeViewModel = viewModel()){
    val db = Firebase.firestore // uma instância do Firebase
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Black)
    ) {
        Text("Popular artist",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            modifier = Modifier.padding(16.dp)
        )
    }

    /*LazyRow() {
        items(artists){

        }
    }*/

    Button(onClick = {
        //createArtit(db)
    }) {
        Text("Adicionar artista")
    }


}

@Composable
fun ArtistItem(artist: Artist){
    Column {
        AsyncImage(
            model = artist.image,
            contentDescription = "Artist image",
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = artist.name, color = Color.White)
    }
}

@Preview
@Composable
fun ArtistItemPreview(){
    val artist = Artist(
        "Pepe",
        "El meior",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4d/Wyspa_%C5%9Bw._Jerzego_w_Pera%C5%9Bcie_02.jpg/960px-Wyspa_%C5%9Bw._Jerzego_w_Pera%C5%9Bcie_02.jpg",
        emptyList()
    )
}


/*fun createArtit(db: FirebaseFirestore) {
    val random = (1..10000).random()
    val artist = Artist(name = "Random $random", numberOfSongs = random)
    db.collection("artists")
        .add(artist).addOnSuccessListener {
            Log.i("Aris", "Sucess")
        }
        .addOnFailureListener {
            Log.i("Aris", "Failure")
        }
        .addOnCompleteListener {
            Log.i("Aris", "Complete")
        }
}*/