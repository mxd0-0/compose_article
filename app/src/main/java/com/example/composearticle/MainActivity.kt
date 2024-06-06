package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticle()

        }
    }
}

@Composable
fun ComposeArticle(modifier: Modifier = Modifier) {
    val composeImage = painterResource(R.drawable.bg_compose_background)
    Column(modifier = modifier.fillMaxSize()) {
        Image(
            painter = composeImage,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial), fontSize = 24.sp,

            modifier = Modifier

                .padding(
                    16.dp
                )
        )
        Text(
            text = stringResource(R.string.introduction),
            modifier = modifier.padding(start = 16.dp,
                end = 16.dp), textAlign = TextAlign.Justify
        )
        Text(text = stringResource(R.string.Description),modifier=modifier.padding(16.dp ), textAlign = TextAlign.Justify)

    }

}

@Preview(showSystemUi = true, name = "ComposeArticle" )
@Composable
fun ComposeArticlePreview() {
    ComposeArticle()

}