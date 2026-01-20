package com.example.pert1
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set data statis
        findViewById<TextView>(R.id.tvNama).text = "Alfian Ilham Kusuma"
        findViewById<TextView>(R.id.tvProfesi).text = "Informatics Engineering Student"
        findViewById<TextView>(R.id.tvTelepon).text = "+62 895-0270-5106"
        findViewById<TextView>(R.id.tvEmail).text = "alfianilham@mhs.ubharajaya.ac.id"
        findViewById<TextView>(R.id.tvAlamat).text = "Bekasi, Indonesia"
        findViewById<TextView>(R.id.tvTentang).text = "Saya adalah seorang mahasiswa aktif jurusan informatika di universitas bhayangkara jakarta raya dengan minat pada pengembangan perangkat lunak, pemrograman dan teknologi informasi"

    }
}