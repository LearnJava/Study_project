package konstantin.lesson1

import ru.konstantin.study_project.Counters
import ru.konstantin.study_project.CountersModel

class MainPresenter {

    private val model = CountersModel()

    //Архитектурная ошибка. В качестве практического задания -- исправить
    fun counterClick(id: Counters): String {
        return when (id) {
            Counters.FIRST -> model.next(0).toString()
            Counters.SECOND -> model.next(1).toString()
            Counters.THIRD -> model.next(2).toString()
        }
    }
}