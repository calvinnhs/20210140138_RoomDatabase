package com.example.roomsiswa.model

import com.example.roomsiswa.RepositoriSiswa.RepositoriSiswa

data class EntryViewModel(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)

data class DetailSiswa(
    val id: Int = 0,
    val nama: String = "",
    val alamat: String = "",
    val telpon: String = "",
)
