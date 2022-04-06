package valenzuela.manuel.avanceproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PresentacionLibroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentacion_libro)
        val botonPlay: ImageButton = findViewById(R.id.btnPlay)

        botonPlay.setOnClickListener {
            var intent: Intent = Intent (this, LecturaProgresoActivity::class.java)
            startActivity(intent)
        }

    }
}