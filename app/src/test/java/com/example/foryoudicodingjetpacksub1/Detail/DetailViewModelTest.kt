package com.example.foryoudicodingjetpacksub1.Detail

import com.example.foryoudicodingjetpacksub1.view.detail.DetailViewModel
import com.example.foryoudicodingjetpacksub1.R
import com.example.foryoudicodingjetpacksub1.model.MovieInit
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {

    private lateinit var ViewModeltest: DetailViewModel
    private lateinit var dummyData: MovieInit

    @Before
    fun setUp() {
        ViewModeltest = DetailViewModel()
        dummyData = MovieInit(
            "Pokoknya Beres",
            R.drawable.pokoknya_beres,
            R.drawable.pokoknya_beres_play,
            "Arizal",
            "81",
            "3373",
            "Dedy Armand dan Raam Punjabi",
            "4",
            "1983",
            " Dono, Kasino, Indro, Marina (Eva Arnaz) dan Anita (Lydia Kandau) adalah teman satu kost. Pemilik kost itu adalah Us Us. Pertama-tama diceritakan Dono yang pandai masak dan melamar ke berbagai restoran tetapi ditolak. Sementara Indro dan Kasino kerjanya hanya mengejar cewek dengan segala kibulannya, dan gagal terus. Suatu ketika, Anita menghilang tanpa sepengetahuan kawan-kawannya karena ayahnya datang. Kasino pergi mencari, tetapi justru ditangkap Polwan yang dirayunya. Indro juga tertangkap polisi karena telah merusak telpon umum, saat terjebak akibat pintunya macet"

        )
    }
    @Test
    fun getData() {
        ViewModeltest.setViewModelValue(dummyData)
        Assert.assertEquals(ViewModeltest.filmtitle, dummyData.filmtitle)
        Assert.assertEquals(ViewModeltest.imageplay, dummyData.imageplay)
        Assert.assertEquals(ViewModeltest.imagelist, dummyData.imagelist)
        Assert.assertEquals(ViewModeltest.sutradara, dummyData.sutradara)
        Assert.assertEquals(ViewModeltest.durasi, dummyData.durasi)
        Assert.assertEquals(ViewModeltest.review, dummyData.review)
        Assert.assertEquals(ViewModeltest.penulis, dummyData.penulis)
        Assert.assertEquals(ViewModeltest.rating, dummyData.rating)
        Assert.assertEquals(ViewModeltest.release, dummyData.release)
        Assert.assertEquals(ViewModeltest.deskripsi, dummyData.deskripsi)
    }

}