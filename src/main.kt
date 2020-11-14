fun main(args : Array<String>) {
    val computer : Player = Player()

    val player : Player = Player()

    var isPlaying = true

    var stringInput : String = ""

    while (isPlaying)
    {


        while (stringInput == "") {
            println("1. Rock")
            println("2. Paper")
            println("3. Scissor")

            stringInput = when ((readLine()!!).toInt()) {
                1 -> "rock"
                2 -> "paper"
                3 -> "scissor"
                else -> ""
            }
            if (stringInput == "")
            {
                println("Invalid Input. Please try again!\n\n")
            }
            else
            {
                player.setChoice(stringInput)
            }
        }

        stringInput = ""


        if (player.getChoice().equals(computer.getChoice()))
        {
            println("Tie! Lets Play until there is a winner")
        }
        else if (player.didPlayerWin(computer.getChoice()))
        {
            println("You win")
        }
        else
        {
            println("I win!\n")
        }

        while (stringInput == "") {
            println("Play Again [y/n]?")
            stringInput = when ((readLine()!!)) {
                "y" -> "y"
                "n" -> "n"
                else -> ""
            }
            if (stringInput == "")
            {
                println("Invalid Input. Please try again!\n\n")
            }
            if (stringInput == "y")
            {
                computer.setChoice()
            }
            if (stringInput == "n")
            {
                isPlaying = false
            }

        }

        stringInput = ""

    }
}