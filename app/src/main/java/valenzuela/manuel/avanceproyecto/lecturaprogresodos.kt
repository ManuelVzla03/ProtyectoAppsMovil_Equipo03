package valenzuela.manuel.avanceproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class lecturaprogresodos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecturaprogresodos)

        val botonAceptar: ImageButton = findViewById(R.id.btnAceptar)
        val botonRechazar: ImageButton = findViewById(R.id.btnRechazar)

        botonRechazar.setOnClickListener {
            var intent: Intent = Intent (this, PantallaCatalogoActivity::class.java)
            startActivity(intent)
        }

        botonAceptar.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
            startActivity(intent)
        }
    }
}