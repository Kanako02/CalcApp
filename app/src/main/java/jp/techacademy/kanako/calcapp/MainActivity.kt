package jp.techacademy.kanako.calcapp

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.time.temporal.ValueRange

// View.OnClickListener追加
class MainActivity : AppCompatActivity() , View.OnClickListener{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
//button1追加
        button1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {


        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
//secondに移動
        val intent = Intent(this, SecondActivity::class.java)

 //edittextとつなげる
        intent.putExtra("VALUE1", toString())
        intent.putExtra("VALUE2", toString())



        startActivity(intent)

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