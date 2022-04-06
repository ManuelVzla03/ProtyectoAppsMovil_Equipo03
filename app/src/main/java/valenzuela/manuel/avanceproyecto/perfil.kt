package valenzuela.manuel.avanceproyecto

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val inicio: ImageButton = findViewById(R.id.btnPInicio)
        val buscar: ImageButton = findViewById(R.id.btnPBuscar)
        val acti: ImageButton = findViewById(R.id.btnPActi)
        val perfil: ImageButton = findViewById(R.id.btnPPerfil)
        val configuracion: ImageButton = findViewById(R.id.btnConfig)

        inicio.setOnClickListener {
            var intent: Intent = Intent (this, PantallaCatalogoActivity::class.java)
            startActivity(intent)
        }

        buscar.setOnClickListener {
            var intent: Intent = Intent (this, valenzuela.manuel.avanceproyecto.buscar::class.java)
            startActivity(intent)
        }

        acti.setOnClickListener {
            var intent: Intent = Intent (this, actividadesdehistorias::class.java)
            startActivity(intent)
        }

        perfil.setOnClickListener {
            var intent: Intent = Intent (this, valenzuela.manuel.avanceproyecto.perfil::class.java)
            startActivity(intent)
        }

        configuracion.setOnClickListener {
            var intent: Intent = Intent (this, valenzuela.manuel.avanceproyecto.configuracion::class.java)
            startActivity(intent)
        }
    }
}