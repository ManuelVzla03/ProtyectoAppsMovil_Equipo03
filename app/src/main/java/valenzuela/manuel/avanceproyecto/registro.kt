package valenzuela.manuel.avanceproyecto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

     //  val atras: ImageButton = findViewById(R.id.btnAtrasRegistro)
        val registrarse: Button = findViewById(R.id.btnRegistrarseRegistro)

      // atras.setOnClickListener {
       //     var intent: Intent = Intent (this, PantallaCatalogoActivity::class.java)
      //      startActivity(intent)
      //  }

        registrarse.setOnClickListener {
            var intent: Intent = Intent (this, configurar_perfil::class.java)
            startActivity(intent)
        }

    }
}