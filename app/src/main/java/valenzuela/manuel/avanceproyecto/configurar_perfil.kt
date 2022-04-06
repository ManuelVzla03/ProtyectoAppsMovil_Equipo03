package valenzuela.manuel.avanceproyecto

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class configurar_perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configurar_perfil)

        val atras: ImageButton = findViewById(R.id.btnAtrasConfigPerfil)
        val siguiente: Button = findViewById(R.id.btnSigConfigPerfil)

        atras.setOnClickListener {
            var intent: Intent = Intent (this, registro::class.java)
            startActivity(intent)
        }

        siguiente.setOnClickListener {
            var intent: Intent = Intent (this, bienvenida::class.java)
            startActivity(intent)
        }
    }
}