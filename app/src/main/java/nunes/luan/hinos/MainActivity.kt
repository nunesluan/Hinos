package nunes.luan.hinos

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var imageButtonGre: ImageButton
    private lateinit var imageButtonInt: ImageButton
    private lateinit var imageButtonCec: ImageButton
    private lateinit var imageButtonCam: ImageButton
    private lateinit var imageButtonCor: ImageButton
    private lateinit var imageButtonSpfc: ImageButton
    private lateinit var imageButtonSan: ImageButton
    private lateinit var buttonStopGre: Button
    private lateinit var buttonStopInt: Button
    private lateinit var buttonStopCec: Button
    private lateinit var buttonStopCam: Button
    private lateinit var buttonStopCor: Button
    private lateinit var buttonStopSpfc: Button
    private lateinit var buttonStopSan: Button
    private lateinit var mediaPlayer: MediaPlayer



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializing()


        imageButtonGre.setOnClickListener {
            play(R.raw.hino_gre)
            snackTextMessage("Grêmio")
        }
        buttonStopGre.setOnClickListener {
            stop()
        }
        imageButtonGre.setOnLongClickListener {
            alert(R.string.titulo_alert, R.string.gremio_hist, R.string.button_alert)
            true
        }

        imageButtonInt.setOnClickListener {
            play(R.raw.hino_sci)
            snackTextMessage("Internacional")
        }
        buttonStopInt.setOnClickListener {
            stop()
        }
        imageButtonInt.setOnLongClickListener {
            alert(R.string.titulo_alert, R.string.inter_hist, R.string.button_alert)
            true
        }
        imageButtonCec.setOnClickListener {
            play(R.raw.hino_cec)
            snackTextMessage("Cruzeiro")
        }
        buttonStopCec.setOnClickListener {
            stop()
        }
        imageButtonCec.setOnLongClickListener {
            alert(R.string.titulo_alert, R.string.cec_hist, R.string.button_alert)
            true
        }
        imageButtonCam.setOnClickListener {
            play(R.raw.hino_cam)
            snackTextMessage("Atlético Mineiro")
        }
        buttonStopCam.setOnClickListener {
            stop()
        }
        imageButtonCam.setOnLongClickListener {
            alert(R.string.titulo_alert, R.string.cam_hist, R.string.button_alert)
            true
        }
        imageButtonCor.setOnClickListener {
            play(R.raw.hino_cor)
            snackTextMessage("Corinthians")
        }
        buttonStopCor.setOnClickListener {
            stop()
        }
        imageButtonCor.setOnLongClickListener {
            alert(R.string.titulo_alert, R.string.cor_hist, R.string.button_alert)
            true
        }
        imageButtonSpfc.setOnClickListener {
            play(R.raw.hino_spfc)
            snackTextMessage("São Paulo")
        }
        buttonStopSpfc.setOnClickListener {
            stop()
        }
        imageButtonSpfc.setOnLongClickListener {
            alert(R.string.titulo_alert, R.string.spfc_hist, R.string.button_alert)
            true
        }
        imageButtonSan.setOnClickListener {
            play(R.raw.hino_san)
            snackTextMessage("Santos")
        }
        buttonStopSan.setOnClickListener {
            stop()
        }
        imageButtonSan.setOnLongClickListener {
            alert(R.string.titulo_alert, R.string.san_hist, R.string.button_alert)
            true
        }

    }

    fun snackTextMessage(message: String) {
        Snackbar.make(
            findViewById(android.R.id.content),
            message,
            Snackbar.LENGTH_LONG
        ).show()
    }

    fun alert(title: Int, message: Int, neutralButton: Int){
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle(title)
        alert.setMessage(message)
        alert.setNeutralButton(neutralButton, null)
        alert.show()
    }

    fun play (sound: Int) {
        mediaPlayer = MediaPlayer.create(this@MainActivity, sound)
        mediaPlayer.start()
    }

    fun stop() {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
    }

    fun initializing() {
        imageButtonGre = findViewById(R.id.imageButtonGre)
        imageButtonInt = findViewById(R.id.imageButtonInt)
        imageButtonCec = findViewById(R.id.imageButtonCec)
        imageButtonCam = findViewById(R.id.imageButtonCam)
        imageButtonCor = findViewById(R.id.imageButtonCor)
        imageButtonSpfc = findViewById(R.id.imageButtonSpfc)
        imageButtonSan = findViewById(R.id.imageButtonSan)
        buttonStopGre = findViewById(R.id.StopGre)
        buttonStopInt = findViewById(R.id.stopInt)
        buttonStopCec = findViewById(R.id.stopCru)
        buttonStopCam = findViewById(R.id.stopCam)
        buttonStopCor = findViewById(R.id.stopCor)
        buttonStopSpfc = findViewById(R.id.stopSpfc)
        buttonStopSan = findViewById(R.id.stopSan)
    }


    }

