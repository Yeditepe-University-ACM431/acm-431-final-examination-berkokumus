package com.yeditepe.finalexam.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.yeditepe.finalexam.model.Task

private val List<Task>.value: Any

@Composable
fun TaskListScreen(viewModel: NavHostController = viewModel(), navController: NavController) {

    // TODO 3: Read task list from ViewModel
    val tasks = viewModel.tasks.value


    Column {
        // TODO 4: Display task titles and completion status
        // Use a simple Column or LazyColumn

        tasks.forEach { task ->
            TaskRow(task = task, navController = navController)
        }
    }
}

private fun Any.forEach(function: Any) {
    TODO("Not yet implemented")
}

@Composable
fun TaskRow(task: Task, navController: NavController) {

    Text(
        text = task.title,
        modifier = Modifier.clickable {
            // TODO 3: Navigate to detail screen with task title
            navController.navigate("taskDetail/${task.title}")
        }
    )
}
