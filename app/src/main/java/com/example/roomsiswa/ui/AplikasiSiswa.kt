package com.example.roomsiswa.ui

import android.app.Application
import com.example.roomsiswa.data.DatabaseSiswa
import com.example.roomsiswa.RepositoriSiswa.ContainerApp
import com.example.roomsiswa.RepositoriSiswa.ContainerDataApp

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}