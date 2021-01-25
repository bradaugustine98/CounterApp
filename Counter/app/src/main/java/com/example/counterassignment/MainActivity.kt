import android.R.attr.name
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.counterassignment.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)



        setContentView(R.layout.activity_main)
        val count : TextView = findViewById(R.id.txt_count)
        val btnUp : Button = findViewById(R.id.btn_up)
       val count = count.text.toInt()
        btnUp.setOnClickListener { view -> count.setText((count + 1)) }
        val btnDown : Button = findViewById(R.id.btn_down)
        btnDown.setOnClickListener{ view -> count.setText(count - 1 ) }


        if(savedInstanceState!=null){
            count = savedInstanceState.getString("count")

            count.setText(count)

        }




    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("count", count.text.toInt())

    }



}
