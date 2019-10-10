package com.kotlinc.playground

class ConsistentHelper<M : DataTemplate<M>> {

    private val listObserver = object : ListUpdateCallback {
        override fun onRemoved(position: Int, count: Int) {
        }

        override fun onMoved(fromPosition: Int, toPosition: Int) {
        }

        override fun onInserted(position: Int, count: Int) {
        }

        override fun onChanged(position: Int, count: Int, payload: Any?) {
            val model = (payload as DiffPayload<M>).getItem(position) ?: return
            println(model.id())
        }
    }
}
