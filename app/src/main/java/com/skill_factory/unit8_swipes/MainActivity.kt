package com.skill_factory.unit8_swipes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.skill_factory.unit8_swipes.adapter.MyAdapter
import com.skill_factory.unit8_swipes.model.Fruit
import com.skill_factory.unit8_swipes.touch_helper.SimpleItemTouchHelperCallback

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView1 = findViewById<RecyclerView>(R.id.recycler_view1)
        fun data(): ArrayList<Fruit> = arrayListOf(
            Fruit(R.drawable.ic_apple, "Apple"),
            Fruit(R.drawable.ic_banana, "Banana"),
            Fruit(R.drawable.ic_lemon, "Lemon"),
            Fruit(R.drawable.ic_orange, "Orange"),
            Fruit(R.drawable.ic_pear, "Pear"),
            Fruit(R.drawable.ic_pear, "Pear1"),
            Fruit(R.drawable.ic_pear, "Pear2"),
            Fruit(R.drawable.ic_pear, "Pear3"),
            Fruit(R.drawable.ic_strawberry, "Strawberry"),
        )
        recyclerView1.adapter = MyAdapter(data())
        val callback = SimpleItemTouchHelperCallback(recyclerView1.adapter as MyAdapter)
        val touchHelper = ItemTouchHelper(callback)
        touchHelper.attachToRecyclerView(recyclerView1)
    }
}
