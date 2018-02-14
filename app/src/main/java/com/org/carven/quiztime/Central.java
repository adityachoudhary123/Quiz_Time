package com.org.carven.quiztime;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.Random;

public class Central extends AppCompatActivity {

    public TextView qstn;
    public Button opt1,opt2,opt3,opt4;
    public int qNumber,end_Number=0;
    public int[] isSeen={0, 0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0 ,0 ,0, 0, 0, 0};
                       //1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18 19 20



    public void screen(){
      qstn=(TextView)findViewById(R.id.qstn);
        opt1=(Button)findViewById(R.id.opt1);
        opt2=(Button)findViewById(R.id.opt2);
        opt3=(Button)findViewById(R.id.opt3);
        opt4=(Button)findViewById(R.id.opt4);
        question_Bank();
    }

    public void question_Bank() {


        String[] questionArray =
                        {"Who is the Present Finance Minister of India",//q1
                        "Who has Written the National Anthem of India",//q2
                        "Upper most layer of Earth is known as",//q3
                        "Largest Mammal on the Earth is",//q4
                        "Who invented computer?",//q5
                        "Who was the first man go to space",//q6
                        "Smallest Country in the world is",//q7
                        "Who was the husband of PM Indira Gandhi",//q8
                        "what is J refers to A.P.J Abdul Kalam",//q9
                        "Where was last Olympics held",//q10
                        "Which of the following was not a avatar of Lord Vishnu",//q11
                        "Who was the first Mughal Emperor",//q12
                        "Which Indian state was formed on 2nd June 2013",//q13
                        "The game in which India won its first gold in Olympics",//q14
                        "Which is the smallest bird in the world",//q15
                        "In which country White Elephants are mostly found",//q16
                        "Which is the nearest star from the Earth",//q17
                        "When was Quit India Movement held",//q18
                        "First animal went to space",//q19
                        "First President of U.S.A"};//q20


        String[] opt1Array =
                        {"Dr. Manmohan Singh",
                        "Rabindra Nath Tagore",//Ans2
                        "Mantle",
                        "Blue Whale",//Ans4
                        "Charles Dickens",
                        "Col J.Aurthur",
                        "Ireland",
                        "Rajiv Gandhi",
                        "Jainulabdeen",//Ans9
                        "Brazil",//Ans10
                        "Buddha",
                        "Akbar",
                        "Utrakhand",
                        "Hockey",//Ans14
                        "Sparrow",
                        "South Africa",
                        "Pole Star",
                        "1942",//Ans18
                        "Dog",//Ans19
                        "Abhram Lincon"};


        String[] opt2Array =
                       {"Shri Narendra Modi",
                        "Bankim Chandra Chatterjee",
                        "Crust",//Ans3
                        "African Elephant",
                        "Charles H Lewis",
                        "Maj Yuri Gagarin",//Ans6
                        "Ukraine",
                        "Sanjay Gandhi",
                        "Jalal",
                        "China",
                        "Mahaveer",//Ans11
                        "Humayun",
                        "New Delhi",
                        "Cricket",
                        "Fisher bird",
                        "Thailand",//Ans16
                        "Virgo",
                        "1945",
                        "Cat",
                        "George Washington"};//Ans20


        String[] opt3Array =
                        {"Shri Arun Jately",//Ans1
                        "Auribondo Ghosh",
                        "Outer Core",
                        "Asian Hippo",
                        "Charles Babbage",//Ans5
                        "Niel ArmStrong",
                        "Vatican City",//Ans7
                        "Rahul R Gandhi",
                        "Jain",
                        "England",
                        "Matsya",
                        "Sher Shah Suri",
                        "Telangana",//Ans13
                        "Kabadi",
                        "Kiwi",
                        "India",
                        "Capricorn",
                        "1919",
                        "Mouse",
                        "D Roosevelt"};


        String[] opt4Array =

                        {"Shri Ram Nath Kovind",
                        "Mathama Gandhi",
                        "Inner Core",
                        "Siberian Lion",
                        "Charles Hendricks",
                        "Buzz Aldrin",
                        "Yemen",
                        "Feroze Gandhi",//Ans8
                        "Javed",
                        "Tokyo",
                        "Kurma",
                        "Babur",//Ans12
                        "Chattisgarh",
                        "kusthi",
                        "Humming Bird",//Ans15
                        "Sri Lanka",
                        "Sun",//Ans17
                        "1939",
                        "Ape",
                        "Benjamin Franklin"};
        get_Question(questionArray,opt1Array,opt2Array,opt3Array,opt4Array);


    }





    public void get_Question(String[] questionArray, String[] opt1Array, String[] opt2Array, String[] opt3Array, String[] opt4Array){





        int index;

        for(index=0;index<10;index++) {
            Random rand = new Random();
            qNumber = rand.nextInt(20);

            if (isSeen[qNumber] == 0) {
                isSeen[qNumber] = 1;

                break;
            }

        }




        String qA=questionArray[qNumber];
         String oA1=opt1Array[qNumber];
         String oA2=opt2Array[qNumber];
         String oA3=opt3Array[qNumber];
         String oA4=opt4Array[qNumber];

        display(qA,oA1,oA2,oA3,oA4);


    }

    public void display(String qA, String oA1, String oA2,String oA3,String oA4){

        qstn.setText(qA);
        opt1.setText(oA1);
        opt2.setText(oA2);
        opt3.setText(oA3);
        opt4.setText(oA4);
      answer_Bank();

    }


    public void answer_Bank(){   // 1    2     3     4     5   6     7    8   9    10   11  12   13   14    15   16   17   18  19   20
        Button[] answer_Button = {opt3, opt1, opt2, opt1,opt3,opt2,opt3,opt4,opt1,opt1,opt2,opt4,opt3,opt1,opt4,opt2,opt4,opt1,opt1,opt2};
        check_Answer(answer_Button);
    }

    public void check_Answer(final Button[] answer_Button) {




        OnClickListener listener=new OnClickListener() {
         @Override
         public void onClick(View v) {

       if(v==answer_Button[qNumber]){
           Toast.makeText(Central.this,"Right Answer",Toast.LENGTH_LONG).show();
           end_Number=end_Number+1;
           if(end_Number==10) {
               Intent intent = new Intent(Central.this, Won_Thankyou.class);
               startActivity(intent);
               finish();
           }
           else
           question_Bank();
       }
             else {

           v.setBackgroundColor(Color.RED);
           Toast.makeText(Central.this,"Wrong Answer",Toast.LENGTH_LONG).show();
           Intent intent1=new Intent(Central.this,Lost_Thankyou.class);
           startActivity(intent1);
           finish();
       }


          }
        };
        opt1.setOnClickListener(listener);
        opt2.setOnClickListener(listener);
        opt3.setOnClickListener(listener);
        opt4.setOnClickListener(listener);





    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);
    screen();

    }
}
