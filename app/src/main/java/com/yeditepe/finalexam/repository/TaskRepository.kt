package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task

class TaskRepository(private val api: TaskApi) {

    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        val taskDtoList = TODO("Provide the return value")


        // TODO 2: Convert TaskDto list to Task list
        val tasks = TODO("Provide the return value")

        return TODO("Provide the return value")
    }
}
