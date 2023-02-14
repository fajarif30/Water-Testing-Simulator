/* 
Names: Farhan Jarif, Boidurjo Das, Alok Ghosh
Program Name: Water Testing 
Program Description: A manual or simulated survey to see the preference between tapwater and bottle water.
Creation Date: Feb 24, 2021
Last Edit Date: March 7, 2021
Ethics Declaration: "This code is the work of ours."
*/


//Imports
import java.util.*;

class Main {
//Method that will calculate the final results
  public static int results (int[] gender, int[] grade, int[] course, int[] background, int[] athlete, int[] preference, int[] samplePref, int[] agreeDisagree){
    
//Declaring all local variables
  int grNine=0;
  int grNinePref=0;
  int grTen=0;
  int grTenPref=0;
  int grEleven=0;
  int grElevenPref=0;
  int grTwelve=0;
  int grTwelvePref=0;

  int male=0;
  int malePref=0;
  int female=0;
  int femalePref=0;
  int otherGender=0;
  int otherGenderPref=0;

  int math=0;
  int mathPref=0;
  int science=0;
  int sciencePref=0;
  int english=0;
  int englishPref=0;
  int gym=0;
  int gymPref=0;
  int technology=0;
  int technologyPref=0;

  int black=0;
  int blackPref=0;
  int white=0;
  int whitePref;
  int hispanic=0;
  int hispanicPref=0;
  int asian=0;
  int asianPref=0;

  int athleteY=0;
  int athleteN=0;
  int athleteBottled=0;
  int athleteTapSample=0;

  int bottled=0;
  int tap=0;

  int tapSample=0;
  int bottledSample=0;

  int agree=0;
  int disagree=0;

//Printing number of total submissions
  System.out.println("\n-------------------------------------------------------------------------------------------------------");
  System.out.println("There are " + samplePref.length + " total submissions for this survey.");

//Through each iteration of the loop, storing data to all the variables
    for (int i=0;i<samplePref.length;i++){

//Gender counter
        switch(gender[i]){
          case 1:
          male++;
          break;
          case 2:
          female++;
          break;
          case 3:
          otherGender++;
        }
        
//Grade counter
        switch(grade[i]){
          case 1:
          grNine++;
          break;
          case 2:
          grTen++;
          break;
          case 3:
          grEleven++;
          break;
          case 4:
          grTwelve++;
          break;
        }

//couse counter
        switch(course[i]){
          case 1:
          math++;
          break;
          case 2:
          english++;
          break;
          case 3:
          science++;
          break;
          case 4:
          gym++;
          break;
          case 5:
          technology++;
        }
//Background counter
        switch(background[i]){
          case 1:
          black++;
          break;
          case 2:
          white++;
          break;
          case 3:
          hispanic++;
          break;
          case 4:
          asian++;
        }

//Athlete (Y or N) counter
        switch(athlete[i]){
          case 1:
          athleteY++;
          break;
          case 2:
          athleteN++;
          break;
        }

//Preference counter (BEFORE taste test)
        switch(preference[i]){
          case 1:
          bottled++;
          break;
          case 2:
          tap++;
          break;
        }

//Sample counter (taste test)
        switch (samplePref[i]){
          case 1:
          tapSample++;
          break;
          case 2:
          bottledSample++;
          break;
        }

//Agree/disagree?
        switch (agreeDisagree[i]){
          case 1:
          agree++;
          break;
          case 2:
          disagree++;
          break;
        }

//Incrementing relationship between being athlete and preference
        if ((athlete[i]==1) && (preference[i]==1)){
          athleteBottled++;
        }
//Calculating if athletes who prefer bottled water switched after taste test
        if ((athlete[i]==1) && (preference[i]==1) && (samplePref[i]==1)){
          athleteTapSample++;
        }

//If parallel arrays for preference are "bottled" only, then switch will occur
//The program is "bottled" based
        if (preference[i]==1){

//Students who prefer bottled water counter:
          switch(course[i]){
            case 1:
            gymPref++;
            break;
            case 2:
            englishPref++;
            break;
            case 3:
            sciencePref++;
            break;
            case 4:
            mathPref++;
            break;
            case 5:
            technologyPref++;
            break;
          }

//Bottled water preference in each grade
          switch(grade[i]){
            case 1:
            grNinePref++;
            break;
            case 2:
            grTenPref++;
            break;
            case 3:
            grElevenPref++;
            break;
            case 4:
            grTwelvePref++;
            break;
          }

//Bottled water preference for each gender
          switch(gender[i]){
            case 1:
            malePref++;
            break;
            case 2:
            femalePref++;
            break;
            case 3:
            otherGenderPref++;
          }
        }
      }

//Printing results of each category

//genders:
      System.out.println("\n"+(int)((male*100)/gender.length)+"% ("+male+") of students are male.");
      System.out.println((int)((female*100)/gender.length)+"% ("+female+") of students are female.");
      System.out.println((int)((otherGender*100)/gender.length)+"% ("+otherGender+") of students are other.");
      System.out.println("-------------------------------------------------------------------------------------------------------");


//grades
      System.out.println((int)((grNine*100)/grade.length)+"% ("+grNine+") of students are in grade 9.");
      System.out.println((int)((grTen*100)/grade.length)+"% ("+grTen+") of students are in grade 10.");
      System.out.println((int)((grEleven*100)/grade.length)+"% ("+grEleven+") of are in grade 11.");
      System.out.println((int)((grTwelve*100)/grade.length)+"% ("+grTwelve+") of students are in grade 12.");
     System.out.println("-------------------------------------------------------------------------------------------------------");


//courses
      System.out.println((int)((math*100)/course.length)+"% ("+math+") of students like math.");
      System.out.println((int)((english*100)/course.length)+"% ("+english+") of students like english.");
      System.out.println((int)((science*100)/course.length)+"% ("+science+") of students like science.");
      System.out.println((int)((gym*100)/course.length)+"% ("+gym+") of students like gym.");
      System.out.println((int)((technology*100)/course.length)+"% ("+technology+") of students like technology.");
     System.out.println("-------------------------------------------------------------------------------------------------------");


//ethnic background
      System.out.println((int)((black*100)/background.length)+"% ("+black+") of students are black.");
      System.out.println((int)((white*100)/background.length)+"% ("+white+") of students are white.");
      System.out.println((int)((hispanic*100)/background.length)+"% ("+hispanic+") of students are hispanic.");
      System.out.println((int)((asian*100)/background.length)+"% ("+asian+")of students are asian.");
      System.out.println("-------------------------------------------------------------------------------------------------------");


//athletes
      System.out.println((int)((athleteY*100)/athlete.length)+"% ("+athleteY+") of students are athletes.");
      System.out.println((int)((athleteN*100)/athlete.length)+"% ("+athleteN+") of students are not athletes.");
      System.out.println("-------------------------------------------------------------------------------------------------------");


//preference
      System.out.println((int)((tap*100)/preference.length)+"% ("+tap+") of students said they prefer tap water.");
      System.out.println((int)((bottled*100)/preference.length)+"% ("+bottled+") of students said they prefer bottled water.");
     System.out.println("-------------------------------------------------------------------------------------------------------");


//samples test
      System.out.println((int)((tapSample*100)/samplePref.length)+"% ("+tapSample+") of students preferred the tap sample.");
      System.out.println((int)((bottledSample*100)/samplePref.length)+"% ("+bottledSample+") of students preferred the bottled sample.");
     System.out.println("-------------------------------------------------------------------------------------------------------");


//Agree/Disagree
      System.out.println((int)((agree*100)/agreeDisagree.length)+"% ("+agree+") of students agree with their decision.");
      System.out.println((int)((disagree*100)/agreeDisagree.length)+"% ("+disagree+") of students disagree with their decision.");
     System.out.println("-------------------------------------------------------------------------------------------------------");

//------------------------------------------------------------------------------------------------------------------------------------------------------
System.out.println("\nStatistics:");
//Gender statistics
      System.out.println("\nIn the gender category, here is how many students prefer bottled water over tap water: \nMale: "+malePref+" of "+male+"\nFemale: "+femalePref+" of "+female+"\nOther Gender: "+otherGenderPref+" of "+otherGender);

//Grade statistics
      System.out.println("\nIn the grades category, here is how many students prefer bottled water over tap water:\nGrade 9: "+grNinePref+" of "+grNine+"\nGrade 10: "+grTenPref+" of "+grTen+"\nGrade 11: "+grElevenPref+" of "+grEleven+"\nGrade 12: "+grTwelvePref+" of "+grTwelve);

//Favourite course statistics
      System.out.println("\nIn the favourite course category, here is how many students prefer bottled water over tap water:\nEnglish:"+englishPref+" of "+english+"\nMath: "+mathPref+" of "+math+"\nScience:"+sciencePref+" of "+science+"\nGym:"+gymPref+" of "+gym+"\nTechnology:"+technologyPref+" of "+technology);

//Printing stats for athletes and how many switched after sampling
      System.out.println("\n"+athleteBottled+" or " +(int)((athleteBottled*100)/grade.length)+ "% of students that preferred bottled water were athletes.");

      System.out.println(athleteTapSample+" of athletes that preferred bottled water, said they preferred the tap water sample after conducting the taste test. In other words, "+(int)((athleteTapSample*100)/athleteBottled)+"% of athletes changed their mind, and chose tap water instead.");

      return(1);
  }

//Method that generates random numbers (dataFaker)
  public static int random(){
    return(0 +(int)(Math.random()*((100 - 0) + 1)));
  }

//Main method
  public static void main(String[] args) {

//Variable that holds total number of surveys
  int totalSurveys=0;

//Askes user to choose between manual/simulated survey 
  Scanner kbReader=new Scanner(System.in);
  int check=0;
  int options=0;

  System.out.println("-------------------------------------------------------------------------------------------------------");
  System.out.println("██     ██  █████  ████████ ███████ ██████      ████████ ███████ ███████ ████████ ██ ███    ██  ██████  ");
  System.out.println("██     ██ ██   ██    ██    ██      ██   ██        ██    ██      ██         ██    ██ ████   ██ ██       ");
  System.out.println("██  █  ██ ███████    ██    █████   ██████         ██    █████   ███████    ██    ██ ██ ██  ██ ██   ███ ");
  System.out.println("██ ███ ██ ██   ██    ██    ██      ██   ██        ██    ██           ██    ██    ██ ██  ██ ██ ██    ██ ");
  System.out.println(" ███ ███  ██   ██    ██    ███████ ██   ██        ██    ███████ ███████    ██    ██ ██   ████  ██████  ");
  System.out.println("-------------------------------------------------------------------------------------------------------");
  System.out.println("                     .-~-~-.                                          .-~-~-.");
  System.out.println("                     |~---~|                                          |~---~|");
  System.out.println("                     |     |   Welcome to the water testing survey!   |     |");
  System.out.println("                     |  A  |                                          |  B  |");
  System.out.println("                     |     |                                          |     |");
  System.out.println("                     `.___.'                                          `.___.'");
  System.out.println("-------------------------------------------------------------------------------------------------------");

  while (check==0){
    System.out.println("Would you like to manually input survey or simulate it? \n1: manual \n2: simulate");
    options=Integer.parseInt(kbReader.nextLine());
    if ( (options==1)||(options==2) ){
      check=1;
    }else{
      System.out.println("Please enter a valid option.");
    }
  }

//Asks user for number of participants. User must fill in each survey

  if (options==1){
    System.out.println("\nHow many students will be participating in the survey?");
    totalSurveys=Integer.parseInt(kbReader.nextLine());
    check=1;
  }else if (options==2){
    System.out.println("\nHow many students would you like to simulate?");
    totalSurveys=Integer.parseInt(kbReader.nextLine());
    check=1;
  }else {
     System.out.println("Please enter a valid option.");
     totalSurveys=Integer.parseInt(kbReader.nextLine());
  }
  
//Arrays to store info
  int[] gender = new int[totalSurveys];
  int[] grade = new int[totalSurveys];
  int[] course = new int[totalSurveys];
  int[] background = new int[totalSurveys];
  int[] athlete = new int[totalSurveys];
  int[] preference = new int[totalSurveys];
  int[] samplePref = new int[totalSurveys];
  int[] agreeDisagree = new int[totalSurveys];

  int count=0; //number of cycles
  int random=0;  //store random num from dataFaker

//once the counter reaches the limit, loop will stop
  int loop=0;
  while (loop==0){

  if (options==1){
    System.out.println("Survey #"+(count+1));

    System.out.println("\nWhat grade are you in?\n1: grade 9 \n2: grade 10 \n3: grade 11 \n4: grade 12");
    grade[count]=Integer.parseInt(kbReader.nextLine());

    System.out.println("\nWhat is your gender?\n1: male \n2: female \n3: other");
    gender[count]=Integer.parseInt(kbReader.nextLine());

    System.out.println("\nWhat is your favourite course? \n1: math \n2: science \n3: english \n4: technology \n5: gym");
    course[count]=Integer.parseInt(kbReader.nextLine());

    System.out.println("\nWhat is your ethnic background? \n1: Black \n2: White \n3: Hispanic \n4: Asian");
    background[count]=Integer.parseInt(kbReader.nextLine());

    System.out.println("\nDo you play sports often? \n1: yes \n2: no");
    athlete[count]=Integer.parseInt(kbReader.nextLine());

    System.out.println("\nDo you prefer tap or bottled water? \n1: bottled \n2: tap");
    preference[count]=Integer.parseInt(kbReader.nextLine());

    System.out.println("\nWhich sample did you prefer?\n1: sample one \n2: sample two");
    samplePref[count]=Integer.parseInt(kbReader.nextLine());

    System.out.println("\nDo you agree or disagree with your decision? \n1: I agree \n2: I disagree");
    agreeDisagree[count]=Integer.parseInt(kbReader.nextLine());
    
  }else if (options==2){

/*
This is where we call in the dataFaker. It will use the dataFaker method to generate random numbers for each category. However, the data will be slightly biased. If the student's 
favourite subject is gym or they're an athlete, the program will be more likely to choose the "bottled water" option when gym or athlete is selected by the user.
*/

//Random gender (98% male or female, 2% other)
    random=random();
    if (random<=49){
      gender[count]=1;
    }else if (random<=98){
      gender[count]=2;
    }else{
      gender[count]=3;
    }

    random=random();

//Random grade
    if (random<=25){
     grade[count]=1;
    }else if(random<=50){
     grade[count]=2;
    }else if (random<=75){
     grade[count]=3;
    }else {
      grade[count]=4;
    }

//Random favourite courses
    random=random();
    if (random<=30){
      course[count]=1;
    } else if (random<=50){
      course[count]=2;
    }else if (random<=70){
      course[count]=3;
    }else if (random<=85){
      course[count]=4;
    }else{
      course[count]=5;
    }

//Random ethnicity
    random=random();
    if (random<=25){
     background[count]=1;
    }else if(random<=50){
     background[count]=2;
    }else if (random<=75){
     background[count]=3;
    }else {
      background[count]=4;
    }

//BIAS: program makes it more likely for a student to be an athlete if their favorite course is gym
    random=random();
    if (((course[count]==5) && (random<80))||(random>80)){
      athlete[count]=1;
    }else{
      athlete[count]=2;
    }

//BIAS: program makes it more likely for student to drink bottled water if they are an athlete
    random=random();    
    if (((athlete[count]==1) && (random<80))||(random>60)){
      preference[count]=1;
    }else {
      preference[count]=2;
    }

//the bias shown above makes it a 70% chance of preferring the tap sample
    random=random();
    if (random<=70){
      samplePref[count]=1;
    }else{
      samplePref[count]=2;
    }

    random=random();
    if (random<=90){
      agreeDisagree[count]=1;
    }else{
      agreeDisagree[count]=2;
    }
     }
//Increases the survey counter until the totalSurvey limit is reached. Then it prints all survey results.
     count++;
    if (count==totalSurveys){
      loop=1;
      results(gender,grade,course,background,athlete,preference,samplePref,agreeDisagree);
    }

  }
 }
}

