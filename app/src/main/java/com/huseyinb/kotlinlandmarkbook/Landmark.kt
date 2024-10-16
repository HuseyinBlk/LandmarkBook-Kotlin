package com.huseyinb.kotlinlandmarkbook

import java.io.Serializable
//serializable sayesinde bilgiler veriye çevrilir öyle yollanır bu sayede çoklu bilgiler kısaca gönderilir
class Landmark(val name: String, val country: String, val image: Int) : Serializable {

}