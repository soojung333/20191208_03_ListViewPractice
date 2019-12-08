package kr.co.tjoeun.a20191208_03_listviewpractice.datas

class User(inputName:String, inputAddress:String, isWomanOk:Boolean) {



    var name =  inputName
    var address = inputAddress
    var isWoman = isWomanOk


    constructor() : this("미정", "거주지 불명",isWomanOk = false)


}