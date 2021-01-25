import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.counterassignment.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val count : TextView = findViewById(R.id.txt_count)
        val btnUp : Button = findViewById(R.id.btn_up)
       val count = count.text.toInt()
        btnUp.setOnClickListener { view -> count.setText(() + 1) }
        val btnDown : Button = findViewById(R.id.btn_down)
        btnDown.setOnClickListener{ view -> count.setText() - 1) }







    }



}