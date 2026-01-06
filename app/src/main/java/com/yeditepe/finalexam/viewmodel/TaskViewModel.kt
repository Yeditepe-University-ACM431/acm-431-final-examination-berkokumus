package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel
import com.yeditepe.finalexam.model.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    private val _tasks = mutableStateListOf<Task>()

    private fun mutableStateListOf() {
        TODO("Not yet implemented")



    }

    val tasks: List<Task> = _tasks


    // Initially add at least 2 tasks

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val task = _tasks.find { it.id == taskId }
        task?.isCompleted = !task?.isCompleted!!
    }
}
