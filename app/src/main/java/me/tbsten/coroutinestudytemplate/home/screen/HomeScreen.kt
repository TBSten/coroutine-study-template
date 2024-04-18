package me.tbsten.coroutinestudytemplate.home.screen

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.launch

@Composable
internal fun HomeScreen(
    homeViewModel: HomeViewModel = hiltViewModel(),
) {
    val scope = rememberCoroutineScope()

    Button(
        onClick = { scope.launch { homeViewModel.onTestButtonClick() } },
    ) {
        Text("test")
    }
}
