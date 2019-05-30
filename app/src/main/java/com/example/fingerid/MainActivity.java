package com.example.fingerid;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {
    EditText editTextOut;
    EditText editTextIn;
    Button button0;
    Button button1;
    Button button2;

    Button button3;
    Button button4;
    Button button5;

    Button button6;
    Button button7;
    Button button8;

    Button button9;
    Button button10;
    Button button11;

    Button button12;
    Button button13;
    Button button14;

    Button buttonCon;
    Button buttonDis;


    private Socket socket;
    private DataOutputStream writeSocket;
    private DataInputStream readSocket;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        editTextOut = (EditText) findViewById(R.id.editText1);
//        editTextIn = (EditText) findViewById(R.id.editText2);

        button0 =(Button) findViewById(R.id.button0);
        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);

        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);

        button6 =(Button) findViewById(R.id.button6);
        button7 =(Button) findViewById(R.id.button7);
        button8 =(Button) findViewById(R.id.button8);

        button9 =(Button) findViewById(R.id.button9);
        button10 =(Button) findViewById(R.id.button10);
        button11 =(Button) findViewById(R.id.button11);

        button12 =(Button) findViewById(R.id.button12);
        button13 =(Button) findViewById(R.id.button13);
        button14 =(Button) findViewById(R.id.button14);

        buttonCon =(Button) findViewById(R.id.buttonCon);
//        buttonDis =(Button) findViewById(R.id.buttonDis);

/*        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                *//*Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);*//*
                Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                editTextOut.setText("3");

                sendMessage sender = new sendMessage();
                sender.msg=0;
                sender.start();

            }
        });*/
        button0.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                    if (btnStatus==0){
                    Toast.makeText(getApplicationContext(), "0", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("0");

                    sendMessage sender = new sendMessage();
                    sender.msg=0;
                    sender.start();
                    }

                return true;
            }
        });

        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
                    Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("1");

                    sendMessage sender = new sendMessage();
                    sender.msg=1;
                    sender.start();
                }

                return true;
            }
        });

        button2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
                    Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("2");

                    sendMessage sender = new sendMessage();
                    sender.msg=2;
                    sender.start();
                }

                return true;
            }
        });

        button3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
                    Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("3");

                    sendMessage sender = new sendMessage();
                    sender.msg=3;
                    sender.start();
                }

                return true;
            }
        });

        button4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
                    Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("4");

                    sendMessage sender = new sendMessage();
                    sender.msg=4;
                    sender.start();
                }

                return true;
            }
        });

        button5.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
                    Toast.makeText(getApplicationContext(), "5", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("5");

                    sendMessage sender = new sendMessage();
                    sender.msg=5;
                    sender.start();
                }

                return true;
            }
        });

        button6.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("6");

                    sendMessage sender = new sendMessage();
                    sender.msg=6;
                    sender.start();
                }

                return true;
            }
        });

        button7.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("7");

                    sendMessage sender = new sendMessage();
                    sender.msg=7;
                    sender.start();
                }

                return true;
            }
        });

        button8.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("8");

                    sendMessage sender = new sendMessage();
                    sender.msg=8;
                    sender.start();
                }

                return true;
            }
        });

        button9.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("9");

                    sendMessage sender = new sendMessage();
                    sender.msg=9;
                    sender.start();
                }

                return true;
            }
        });

        button10.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("10");

                    sendMessage sender = new sendMessage();
                    sender.msg=10;
                    sender.start();
                }

                return true;
            }
        });

        button11.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("11");

                    sendMessage sender = new sendMessage();
                    sender.msg=11;
                    sender.start();
                }

                return true;
            }
        });

        button12.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("12");

                    sendMessage sender = new sendMessage();
                    sender.msg=12;
                    sender.start();
                }

                return true;
            }
        });

        button13.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("13");

                    sendMessage sender = new sendMessage();
                    sender.msg=13;
                    sender.start();
                }

                return true;
            }
        });

        button14.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int btnStatus;
                btnStatus =event.getActionMasked();
                Log.d("TouchAction", Integer.toString(btnStatus));
                if (btnStatus==0){
//                    Toast.makeText(getApplicationContext(), "6", Toast.LENGTH_SHORT).show();
                    editTextOut.setText("14");

                    sendMessage sender = new sendMessage();
                    sender.msg=14;
                    sender.start();
                }

                return true;
            }
        });

 /*       button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                editTextOut.setText("1");
//                (new sendMessage()).start();
                sendMessage sender = new sendMessage();
                sender.msg=1;
                sender.start();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                editTextOut.setText("2");
//                (new sendMessage()).start();
                sendMessage sender = new sendMessage();
                sender.msg=2;
                sender.start();
            }
        });*/

    }


    public void OnClick(View v){

        switch (v.getId()){
            case R.id.buttonCon:
                (new Connect()).start();
                break;
//            case R.id.buttonDis:
//                (new Disconnect()).start();
//                break;
        }
    }
    class Connect extends Thread{
            public void run() {
                Log.d("Connect", "Run connect");
                String ip = "192.168.100.100";
                int port = 25000;
                try {

                } catch (Exception e) {
                    final String recvIP = "Wrong IP";
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            setToast(recvIP);
                        }
                });
                }
                try {
                socket = new Socket(ip,port);
                writeSocket = new DataOutputStream(socket.getOutputStream());
                readSocket = new DataInputStream(socket.getInputStream());


                    mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        setToast("Connected!!");
                    }
                });

                } catch (Exception e){
                    final String recvInput ="Fail to Connect";
                    Log.d("Connect", e.getMessage());
                    mHandler.post(new Runnable() {
                        @Override
                        public void run() {
                            setToast(recvInput);
                        }
                    });
                }
             }
    }

    class sendMessage extends Thread{
        public byte msg;

        public void run(){
            try{
//                byte[] b;
//                b="1".getBytes();
//                writeSocket.write(b);

                writeSocket.write(msg);
            } catch (Exception e){
                final String recvFail = "Fail to Send Message";
                Log.d("Message", e.getMessage());
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        setToast(recvFail);
                    }
                });
            }
        }
    }

    void setToast(String msg){
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

}
