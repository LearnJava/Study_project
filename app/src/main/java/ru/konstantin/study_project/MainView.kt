package konstantin.lesson1

import ru.konstantin.study_project.Counters

interface MainView {
    fun setButtonText(buttonNumber: Counters, text: String)
}