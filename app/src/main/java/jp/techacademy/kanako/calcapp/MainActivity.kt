package jp.techacademy.kanako.calcapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.content_main.*
import java.time.temporal.ValueRange


// View.OnClickListener追加
class MainActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        //button追加
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

//各ボタンが押された時
    override fun onClick(v: View) {

    val value1 = edittext1.text.toString().toDouble()
    val value2 = edittext2.text.toString().toDouble()

    val intent = Intent(this, SecondActivity::class.java)


    //try {

        if (v.id == R.id.button1) {
            intent.putExtra("answer", value1 + value2)
            startActivity(intent)
        } else if (v.id == R.id.button2) {
            intent.putExtra("answer", value1 - value2)
            startActivity(intent)
        } else if (v.id == R.id.button3) {
            intent.putExtra("answer", value1 * value2)
            startActivity(intent)
        } else if (v.id == R.id.button4) {
            intent.putExtra("answer", value1 / value2)
            startActivity(intent)
        }

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {

        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
//プロジェクトを新規作成し、 CalcApp というプロジェクト名をつけてください
//画面を2つ作成してください
//1つ目の画面では、数値入力用の2つのEditTextと、四則計算それぞれのボタンを4つ作成してください
//4つの四則計算ボタンのどれかをタップすると、2つ目の画面へ移動させてTextViewで対応する計算結果を表示してください
//数値は小数点に対応してください
//EditTextに何も値が入っていない時に四則計算ボタンをタップしてもエラーにならないようにしてください。