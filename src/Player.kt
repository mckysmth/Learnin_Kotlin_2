class Player {
    private val list: ArrayList<String> = arrayListOf("rock", "paper", "scissors")

    private var choice : String = list.random()

    fun setChoice() {
        choice = list.random()
    }

    fun setChoice(choice : String) {
        this.choice = choice
    }

    fun getChoice() : String {
        return choice
    }

    fun didPlayerWin(otherChoice : String) : Boolean {
        if (choice.equals("rock")  && otherChoice.equals("scissors"))
        {
            return true
        }

        if (choice.equals("paper") && otherChoice.equals("rock"))
        {
            return true
        }

        if (choice.equals("scissors") && otherChoice.equals("paper"))
        {
            return true
        }

        return false
    }



}