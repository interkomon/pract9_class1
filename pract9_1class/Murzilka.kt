import Newspapers.*

class Murzilka( var quantity : Int, var size : Int, name: String, number: Int, date: Int) : Newspaper(name,number,date) {

        public fun Info() {

            println("$name  советский русскоязычный общесоюзный массовый ежемесячный литературно-художественный журнал")
        }
        public fun DateMurzilka(){
                println("$name -  издается с 1924 года")
        }
        override fun GetInfo(){
                println("Название газеты: $name")
                println("Год выпуска: $date")
                println("Номер газеты: $number")

        }


}