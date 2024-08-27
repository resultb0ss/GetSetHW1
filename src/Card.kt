class Card() {


    var cardNumber: String = "12423234"
        get() {
            return field
        }
        set(value) {
            field = value
        }
    var cardPass: String = "12345"
        get() {
            return field
        }
        set(value) {
            field = value
        }

    fun cardInfo(): String {
        println("Данные карты будут доступны после ввода пароля")
        var access: Boolean = true
        var guess: Int = 3
        var result: String = ""
        while (access == true){
            println("Введите пин код карты")
            println("Попыток осталось $guess")
            var input = readln()
            if (input == cardPass){
                println("Пароль введен верно. Номер карты: $cardNumber")
                result = cardNumber
                break
            } else {
                guess = guess-1
                println("Пароль неверный! Попыток осталось: $guess ")
                if (guess == 0){
                    println("Попытки закончились: карта заблокирована")
                    access = false
                    result = ""
                }
            }
        }
        return result
    }



}