package edu.fullerton.ecs.cpsc411.kotlinsimplelistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

import kotlinx.android.synthetic.main.activity_main.*

// Courtesy of <https://www.fakenamegenerator.com/>
val people = arrayOf(
    "Victor S. Balch",
    "Robert S. Morgan",
    "Corine J. Day",
    "David P. Craig",
    "Stella R. Kingsley",
    "Leonor C. Coleman",
    "Gregory B. Peck",
    "Alex R. Brady",
    "Patrice S. Ponce",
    "Eva D. Simmons",
    "David V. Higgins",
    "Beatrice J. Hernadez"
)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, people)

        listView.adapter = adapter
        listView.setOnItemClickListener{ _, _, position, _ ->
            textView.text = people[position]
        }
    }
}
