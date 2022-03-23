package tw.edu.pu.csim.tcyang.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener, View.OnLongClickListener,
    View.OnTouchListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //img.setOnClickListener(this)
        //img.setOnLongClickListener(this)
        img.setOnTouchListener(this)
    }

    override fun onClick(p0: View?) {
        var counter = (1..6).random()
        txv.text = counter.toString()

        when (counter){
            1 -> img.setImageResource(R.drawable.dice1)
            2 -> img.setImageResource(R.drawable.dice2)
            3 -> img.setImageResource(R.drawable.dice3)
            4 -> img.setImageResource(R.drawable.dice4)
            5 -> img.setImageResource(R.drawable.dice5)
            6 -> img.setImageResource(R.drawable.dice6)
        }
    }

    override fun onLongClick(p0: View?): Boolean {
        img.setImageResource(R.drawable.dice)
        txv.text = "歡迎來到擲骰子遊戲世界"
        return true
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {

        if (event?.action == MotionEvent.ACTION_DOWN) {
            img.setImageResource(R.drawable.dice)
            txv.text = "歡迎來到擲骰子遊戲世界"
        }
        else if (event?.action == MotionEvent.ACTION_UP){
            var counter = (1..6).random()
            txv.text = counter.toString()

            when (counter) {
                1 -> img.setImageResource(R.drawable.dice1)
                2 -> img.setImageResource(R.drawable.dice2)
                3 -> img.setImageResource(R.drawable.dice3)
                4 -> img.setImageResource(R.drawable.dice4)
                5 -> img.setImageResource(R.drawable.dice5)
                6 -> img.setImageResource(R.drawable.dice6)
            }
            txv.text = "手指彈開"
        }

        return true
    }
}