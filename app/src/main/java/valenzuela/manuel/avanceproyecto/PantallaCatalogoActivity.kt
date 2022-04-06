package valenzuela.manuel.avanceproyecto

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class PantallaCatalogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_catalogo)

        val botonClick: ImageButton = findViewById(R.id.btnClick)
        val botonInicio: ImageButton = findViewById(R.id.btnInicio)
        val botonBuscar: ImageButton = findViewById(R.id.btnBuscar)
        val botonBiblioteca: ImageButton = findViewById(R.id.btnBiblioteca)
        val botonActividades: ImageButton = findViewById(R.id.btnActividades)
        val botonPerfil: ImageButton = findViewById(R.id.btnPerfil)


        botonClick.setOnClickListener {
            var intent: Intent = Intent (this, PresentacionLibroActivity::class.java)
            startActivity(intent)
        }

        botonInicio.setOnClickListener {
            var intent: Intent = Intent (this, PantallaCatalogoActivity::class.java)
            startActivity(intent)
        }

        botonBuscar.setOnClickListener {
            var intent: Intent = Intent (this, buscar::class.java)
            startActivity(intent)
        }

        botonBiblioteca.setOnClickListener {
            var intent: Intent = Intent (this, biblioteca::class.java)
            startActivity(intent)
        }

        botonActividades.setOnClickListener {
            var intent: Intent = Intent (this, actividadesdehistorias::class.java)
            startActivity(intent)
        }

        botonPerfil.setOnClickListener {
            var intent: Intent = Intent (this, perfil::class.java)
            startActivity(intent)
        }

    }
}