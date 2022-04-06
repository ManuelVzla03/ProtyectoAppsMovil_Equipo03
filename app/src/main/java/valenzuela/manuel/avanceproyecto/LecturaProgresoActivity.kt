package valenzuela.manuel.avanceproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class LecturaProgresoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lectura_progreso)

        val botonAtrasLibroProgreso: ImageButton = findViewById(R.id.btnAtrasLibroProgreso)

        botonAtrasLibroProgreso.setOnClickListener {
            var intent: Intent = Intent (this, lecturaprogresodos::class.java)
            startActivity(intent)
        }

    }
}