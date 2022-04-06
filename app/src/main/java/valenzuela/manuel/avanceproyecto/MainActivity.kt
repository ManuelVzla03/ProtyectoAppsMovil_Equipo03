package valenzuela.manuel.avanceproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_inicio)

        val botonLogo: ImageView = findViewById(R.id.ivLogo)

        botonLogo.setOnClickListener {
            var intent: Intent = Intent (this, IniciarSesionActivity::class.java)
            startActivity(intent)
        }
    }
}