package com.example.number_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    ImageButton Submit;
    EditText Number;
    CheckBox CDecimal, COctal, CHexa, CBinary;
    RadioButton inType;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                rg = findViewById(R.id.rg);
                CDecimal = findViewById(R.id.CDecimal);
                CBinary = findViewById(R.id.CBinary);
                CHexa = findViewById(R.id.CHexa);
                COctal = findViewById(R.id.COctal);
                Submit = findViewById(R.id.Submit);
                Number = findViewById(R.id.Number);


                Submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        inType = (RadioButton)findViewById(rg.getCheckedRadioButtonId());
                        String type = inType.getText().toString();
                        String number = Number.getText().toString();

                        if (type.matches("Decimal")){
                            if(CDecimal.isChecked()){
                                Toast.makeText(MainActivity.this,"Decimal conversion = " + number + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (CBinary.isChecked()){
                                String ans = Integer.toBinaryString(Integer.parseInt(number));
                                Toast.makeText(MainActivity.this,"Binary conversion = " + ans + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (COctal.isChecked()){
                                String ans = Integer.toOctalString(Integer.parseInt(number));
                                Toast.makeText(MainActivity.this,"Octal conversion = " + ans + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (CHexa.isChecked()){
                                String ans = Integer.toHexString(Integer.parseInt(number));
                                Toast.makeText(MainActivity.this,"Hexadecimal conversion = " + ans + "\n",Toast.LENGTH_LONG).show();
                            }
                        } else if(type.matches("Binary")){
                            if(CDecimal.isChecked()){
                                String ans = Integer.toString(Integer.parseInt(number,2));
                                Toast.makeText(MainActivity.this,"Decimal conversion = " + ans + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (CBinary.isChecked()){
                                Toast.makeText(MainActivity.this,"Binary conversion = " + number + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (COctal.isChecked()){
                                String ans = Integer.toString(Integer.parseInt(number,2));
                                String integer = Integer.toOctalString(Integer.parseInt(ans));
                                Toast.makeText(MainActivity.this,"Octal conversion = " + integer + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (CHexa.isChecked()){
                                String ans = Integer.toString(Integer.parseInt(number,2));
                                String integer = Integer.toHexString(Integer.parseInt(ans));
                                Toast.makeText(MainActivity.this, "Octal conversion = " + integer + "\n",Toast.LENGTH_LONG).show();
                            }
                        } else if(type.matches("Hexa")){
                            if(CDecimal.isChecked()){
                                String integer = Integer.toString(Integer.parseInt(number,16));
                                Toast.makeText(MainActivity.this,"Decimal conversion = " + integer + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (CBinary.isChecked()){
                                String integer = Integer.toString(Integer.parseInt(number,16));
                                String ans = Integer.toBinaryString(Integer.parseInt(integer));
                                Toast.makeText(MainActivity.this,"Binary conversion = " + ans + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (COctal.isChecked()){
                                String integer = Integer.toString(Integer.parseInt(number,16));
                                String ans = Integer.toOctalString(Integer.parseInt(integer));
                                Toast.makeText(MainActivity.this,"Octal conversion = " + ans + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (CHexa.isChecked()){
                                Toast.makeText(MainActivity.this,"Hexadecimal conversion = " + number + "\n",Toast.LENGTH_LONG).show();
                            }
                        } else if(type.matches("Octal")){
                            if(CDecimal.isChecked()){
                                String integer = Integer.toString(Integer.parseInt(number,8));
                                Toast.makeText(MainActivity.this,"Decimal conversion = " + integer + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (CBinary.isChecked()){
                                String integer = Integer.toString(Integer.parseInt(number,8));
                                String ans = Integer.toBinaryString(Integer.parseInt(integer));
                                Toast.makeText(MainActivity.this,"Binary conversion = " + ans + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (COctal.isChecked()){
                                Toast.makeText(MainActivity.this,"Octal conversion = " + number + "\n",Toast.LENGTH_LONG).show();
                            }
                            if (CHexa.isChecked()){
                                String integer = Integer.toString(Integer.parseInt(number,8));
                                String ans = Integer.toHexString(Integer.parseInt(integer));
                                Toast.makeText(MainActivity.this,"Hexadecimal conversion = " + ans + "\n",Toast.LENGTH_LONG).show();
                            }
                        }
                    }
                });
            }
        }