package hendershakkon.proyecto004;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText et1,et2 ;
    private TextView tv3 ;
    private CheckBox checkBox1,checkBox2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv3=(TextView)findViewById(R.id.tv3);
        checkBox1=(CheckBox)findViewById(R.id.checkBox1);
        checkBox2=(CheckBox)findViewById(R.id.checkBox2);
    }

    //@Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main, menu);
    //    return true;
    //}

    // este método se ejecutarà cuando se presione el botòn operar
    public void operar(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int nro1=Integer.parseInt(valor1);
        int nro2=Integer.parseInt(valor2);
        String resu="";
        if (checkBox1.isChecked()==true) {
            int suma=nro1+nro2;
            resu = "La suma es : "+suma;
        }
        if (checkBox2.isChecked()==true) {
            int resta=nro1-nro2;
            resu = "La resta es : "+resta;
        }
        tv3.setText(resu);

    }

    // este método se ejecutarà cuando se presione el botòn borrar
    public void borrar(View view){
        et1.setText("");
        et2.setText("");
        tv3.setText("");
        et1.requestFocus();
    }


}
