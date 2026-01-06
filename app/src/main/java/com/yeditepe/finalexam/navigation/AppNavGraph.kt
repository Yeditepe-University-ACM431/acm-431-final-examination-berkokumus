package com.yeditepe.finalexam.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yeditepe.finalexam.repository.TaskRepository
import com.yeditepe.finalexam.ui.TaskDetailScreen
import com.yeditepe.finalexam.ui.TaskItemScreen
import com.yeditepe.finalexam.ui.TaskListScreen
import com.yeditepe.finalexam.viewmodel.TaskViewModel

@Composable
fun AppNavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "tasks"
    ) {

        // TODO 1: Add composable for "tasks"
        composable("tasks") {
            TaskListScreen(navController)
            TaskItemScreen()
            TaskDetailScreen()
            TaskViewModel()
            TaskRepository()
            TaskApi()

        }


        // TODO 2: Add composable for "taskDetail/{title}"
        composable("taskDetail/{title}") {
            TaskDetailScreen(it.arguments?.getString("title") ?: "")
            TaskViewModel()
            TaskRepository()
            com.yeditepe.finalexam.api.TaskApi()

        }
    }
}

private fun AnimatedContentScope.TaskRepository() {
    TODO("Not yet implemented")
}

@Composable
fun TaskApi() {
    TODO("Not yet implemented")
}
