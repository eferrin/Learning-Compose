package com.learning.compose.application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.compose.application.ui.theme.ComposeApplicationTheme
import com.learning.compose.application.view.composable.OnBoardingScreen
import com.learning.compose.application.view.composable.component.Greetings
import com.learning.compose.application.view.composable.component.SearchBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApplicationTheme {
                MyApp()
            }
        }
    }
}

@Composable
private fun MyApp() {
    var shouldShowOnboarding by rememberSaveable { mutableStateOf(true) }

    if (shouldShowOnboarding) {
        OnBoardingScreen(onContinueClicked = { shouldShowOnboarding = false })
    } else {
        Column(Modifier.padding(vertical = 16.dp)) {
            SearchBar(Modifier.padding(horizontal = 16.dp))
            Greetings()
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 480)
@Composable
fun DefaultPreview() {
    ComposeApplicationTheme {
        MyApp()
    }
}
