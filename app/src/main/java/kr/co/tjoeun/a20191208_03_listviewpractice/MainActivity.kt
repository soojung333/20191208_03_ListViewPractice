package kr.co.tjoeun.a20191208_03_listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.co.tjoeun.a20191208_03_listviewpractice.datas.User

class MainActivity : AppCompatActivity() {

    val studentList = ArrayList<User>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생목록 추가
        addStudents()

    }

    fun  addStudents()  {

        studentList.add(User("계석준","서울시 도봉구", false))
        studentList.add(User("김미현", "경기도 군포시", true))
        studentList.add(User("김영호","서울시 은평구", false))
        studentList.add(User("노혜진", "경기도 강동구", true))
        studentList.add(User("류찬울","서울시 어딘가", false))
        studentList.add(User("양성심", "서울시 관악구", true))
        studentList.add(User("이규현", "서울시 도봉구", false))
        studentList.add(User("이수정", "경기도 고양시", true))
        studentList.add(User("차순혁", "서울시 구로구", false))
        studentList.add(User("황연하", "서울시 성남시", true))
        studentList.add(User("조경진","서울시 은평구", false))

    }

}
