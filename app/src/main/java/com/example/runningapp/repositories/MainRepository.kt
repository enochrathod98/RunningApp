package com.example.runningapp.repositories

import com.example.runningapp.db.Run
import com.example.runningapp.db.RunDAO
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunSortedByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunsSortedByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurned()

    fun getAllRunsSortedByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByDistance() = runDao.getAllRunsSortedByDistance()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()
}