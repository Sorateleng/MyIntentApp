package stta.gabriel.myintentapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btnmoveactivity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithData : Button = findViewById(R.id.btnmovewithdata)
        btnMoveWithData.setOnClickListener(this)

        val btnDialPhone : Button = findViewById(R.id.btntlpn)
        btnDialPhone.setOnClickListener(this)

    }



    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnmoveactivity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.btnmovewithdata -> {
                val moveWithDataIntent = Intent(this@MainActivity,MoveWithData::class.java)
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_NAME,"GABRIEL NAKA S")
                moveWithDataIntent.putExtra(MoveWithData.EXTRA_AGE,25)

                startActivity(moveWithDataIntent)
            }

            R.id.btntlpn -> {
                val phoneNumber = "082178733897"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}