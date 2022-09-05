package com.learning.compose.application.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.compose.application.ui.theme.ComposeApplicationTheme
import com.learning.compose.application.ui.shared.Greetings
import com.learning.compose.application.ui.shared.SearchBar

@Composable
fun GreetingsScreen() {
    Column(Modifier.padding(vertical = 16.dp)) {
        SearchBar(Modifier.padding(horizontal = 16.dp))
        Greetings()
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 480)
@Composable
fun GreetingsScreenPreview() {
    ComposeApplicationTheme {
        GreetingsScreen()
    }
}
