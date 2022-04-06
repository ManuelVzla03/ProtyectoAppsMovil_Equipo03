package valenzuela.manuel.avanceproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        val atras: ImageButton = findViewById(R.id.btnAtrasbien)
        val listo: Button = findViewById(R.id.btnListoBien)

        atras.setOnClickListener {
            var intent: Intent = Intent (this, configurar_perfil::class.java)
            startActivity(intent)
        }

        listo.setOnClickListener {
            var intent: Intent = Intent (this, PantallaCatalogoActivity::class.java)
            startActivity(intent)
        }
    }
}