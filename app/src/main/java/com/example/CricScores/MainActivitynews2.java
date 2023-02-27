package com.example.CricScores;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivitynews2 extends AppCompatActivity {

TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitynews2);
        TextView t1 = findViewById(R.id.textView2);
        t1.setText(" ");

        Intent intent = getIntent();
        String dataType = intent.getStringExtra("dataType");
        if (dataType.equals("N1")) {
            t1.setText("Nicholas Pooran might have won the Player-of-the-Match award for his unbeaten 39-ball 74 in the third T20I against Bangladesh, but he feels Kyle Mayers' 55 off 38 balls at the top of the West Indies chase made his job simpler than it might have been otherwise.\n" +
                    "\n" +
                    "Set 170 to win the three-match series, West Indies were 43 for 3 just after the powerplay, and Mayers, who had opened the batting, was on 18 from 16 at that stage. But with Pooran for company, Mayers opened up, and the next 22 balls he faced went for 37 in an 85-run stand for the fourth wicket.\n" +
                    "\n" +
                    "\"I was telling Kyle how well he was batting out there,\" Pooran said afterwards. \"It was a top innings. He was putting away the loose balls. The bowlers were under pressure even though they were on top of the game. We want to continue to do that as a batting unit. He made my job easier, to build the partnership with him.");


            // parseXML();
        } else if (dataType.equals("N2")) {
            t1.setText("The post mortem into India's group-stage exit from last year's T20 World Cup was long and gruesome, but perhaps the diagnosis was simple: they are a different team with a fully-fit Hardik Pandya in their middle order.\n" +
                    "\n" +
                    "\n" +
                    "Hardik was a bit-part player at the World Cup following back and shoulder injuries, facing 45 balls and bowling only four overs across five games, but at the Ageas Bowl on Thursday night, he was the driving force behind India's 50-run win. He top-scored with 51 off 33 as India racked up 198 for 8, playing with plenty of attacking intent, then took three wickets with the new ball to dismantle England's top order, before finishing with 4 for 33.\n" +
                    "\n" +
                    "RELATED\n" +
                    "Story Image\n" +
                    "Rohit Sharma, returning to competitive cricket after contracting Covid-19, chose to bat first on an excellent pitch, and set the tone with 24 off 14 before edging Moeen Ali's arm ball through to Jos Buttler, in his first game as England's full-time limited-overs captain after Eoin Morgan's international retirement.\n" +
                    "\n" +
                    "Deepak Hooda and Suryakumar Yadav both contributed with fast-scoring cameos, putting England's attack under pressure, though Chris Jordan's impressive spell of 2 for 23 in four overs, eschewing his usual yorker plan for hard lengths, kept India below 200.\n" +
                    "\n" +
                    "England needed a fast start but slumped to 33 for 4 against the new, swinging ball. Arshdeep Singh, on debut, and Bhuvneshwar Kumar both found prodigious movement as the sun went down, Bhuvneshwar bowling Buttler for a first-ball duck with a hooping inswinger.\n" +
                    "\n" +
                    "Hardik struck twice in his first over, removing Dawid Malan and Liam Livingstone, then removed Jason Roy with the first ball after the powerplay for an uncharacteristically scratchy 4 off 16 balls. Moeen and Harry Brook added 61 for the fifth wicket in six overs to keep England's hopes alive, but Yuzvendra Chahal removed both of them in the space of five balls to end the game as a contest.");


            // parseJSON();
        } else if (dataType.equals("N3")) {
            t1.setText("\"It's been the most fun five weeks I've had in my career so far,\" Stokes said © Getty\n" +
                    "Following a sensational Test victory in Edgbaston - England's highest ever run chase - captain Ben Stokes hailed his team's efforts to secure series parity against India in such emphatic fashion, and reckoned this new approach to the long form cricket from his team was here to stay. England didn't just do the unthinkable - chasing 378 - but did it with the sort of nonchalance that dwarfed the enormity of their achievement [This was 19 runs more than how much England chased in the famous Leeds Test against Australia in 2019].\n" +
                    "\n" +
                    "\"We are trying to rewrite how Test cricket is being played, in England especially,\" Stokes told Sky Sports. \"All the different plans that we put together over the last four or five weeks, for every different situations is something we'll look to carry forward.\"\n" +
                    "\n" +
                    "England arrived for this rescheduled fifth Test 1-2 down in the rubber, needing a victory to deny India an away series win to add to their recent conquests of Australia. Stokes & Co. though carried confidence and much of the momentum they gathered in thecomprehensive home series victory over New Zealand in June, into this solitary Test. The New Zealand series brought a shift in the way they went about approaching the format - with a shake-up in their leadership group. Ben Stokes took over from Joe Root at the end of April and the swashbuckling former New Zealand captain Brendon McCullum came in as the head coach. Together they concocted three successive fourth innings chases against New Zealand, and spearheaded the fourth - and the best of them all - in Edgbaston todown India emphatically.\n" +
                    "\n" +
                    "\"It's been the most fun five weeks I've had in my career so far,\" Stokes said. \"I don't think everyone can understand what's happened here. When you get clarity in what you want to do and what you want to achieve, and think about bigger than results, it makes everything a lot easier. It takes away the external pressure of what international sport can throw at you. When you know what you want to go out there and do, it makes everything a lot more simple.\"\n" +
                    "\n" +
                    "After an absorbing third day's play where the control for the game oscillated between both sides, England laid strong foundations for a win on Day 4. Though India made a brisk start and added 104 runs in the morning session to their overnight lead of 257, they lost four wickets. Stokes spearheaded the wrapping up of the tail quickly after the break, ensuring India didn't get to the 400-run mark.");
        } else if (dataType.equals("N4")){
            t1.setText("Shikhar Dhawan will lead India in the three-match ODI series on their tour of West Indies later this month, the BCCI announced on Wednesday (July 6). Ravindra Jadeja will serve as Dhawan's deputy in a 16-member squad that has notable absentees in Rohit Sharma, Virat Kohli, Jasprit Bumrah, Rishabh Pant, Hardik Pandya, Mohammed Shami as well as the injured KL Rahul.\n" +
                    "\n" +
                    "Squad:Shikhar Dhawan (C), Ruturaj Gaikwad, Shubman Gill, Deepak Hooda, Suryakumar Yadav, Shreyas Iyer, Ishan Kishan (wk), Sanju Samson (wk), Ravindra Jadeja (VC), Shardul Thakur, Yuzvendra Chahal, Axar Patel, Avesh Khan, Prasidh Krishna, Mohammed Siraj, Arshdeep Singh\n" +
                    "Dhawan led India thrice in ODIs last year on the tour of Sri Lanka when other senior players were involved with the Test side in England. Like in that series, he'll have Ruturaj Gaikwad as a possible opening partner with the national selectors also bringing Shubman Gill back into the ODI setup for the first time since the tour of Australia in 2020.\n" +
                    "\n");
        }


    }
}