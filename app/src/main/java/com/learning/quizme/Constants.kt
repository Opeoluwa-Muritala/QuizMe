package com.learning.quizme

object Constants {

    fun getQuestions():ArrayList<Question>{
        val  questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.german_flag,
            "Germany","Georgia","Ghana","Guinea Bissau",
            1

        )
        val que2 = Question(
            1, "What country does this flag belong to?",
            R.drawable.german_flag,
            "Jamaica","Germany","Ghana","Guinea Bissau",
            2
        )

        val que3 = Question(
            1, "What country does this flag belong to?",
            R.drawable.german_flag,
            "Jamaica","Germany","Europe","Africa",
            2
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)


        return questionsList
    }
}