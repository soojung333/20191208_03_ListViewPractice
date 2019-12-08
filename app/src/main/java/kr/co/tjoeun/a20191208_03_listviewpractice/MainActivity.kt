package kr.co.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tempUser = User(inputName = "이수정", inputAddress = "경기도 고양시", isWomanOk = true)

        Log.d("사용자주소", tempUser.address)


        val tempUser2 = User()
        Log.d("사용자주소", tempUser2.address)

        val tempUser3 = User("아이유")
        Log.d("사용자주소", tempUser3.address)

    }
}
