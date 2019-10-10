package com.kotlinc.playground.uncheckcast

private inline fun <reified T> genericCastOrNull(anything: Any?): T? {
    return anything as? T
}

class ConsistentHelper<M : DataTemplate<M>> {

    private val listObserver = object : ListUpdateCallback {
        override fun onRemoved(position: Int, count: Int) {
        }

        override fun onMoved(fromPosition: Int, toPosition: Int) {
        }

        override fun onInserted(position: Int, count: Int) {
        }

        override fun onChanged(position: Int, count: Int, payload: Any?) {
            val model = genericCastOrNull<DiffPayload<M>>(payload)?.getItem(position) ?: return
            println(model.id())
        }
    }
}
