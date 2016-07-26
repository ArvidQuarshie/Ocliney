package com.example.user.ocliney;



//import android.content.Intent;
//import android.os.Bundle;
//
//import com.daimajia.androidanimations.library.Techniques;
//import com.viksaa.sssplash.lib.activity.AwesomeSplash;
//import com.viksaa.sssplash.lib.cnst.Flags;
//import com.viksaa.sssplash.lib.model.ConfigSplash;
//
//public class SplashScreen  extends AwesomeSplash {
//
//
//
//
//    @Override
//    public void initSplash(ConfigSplash configSplash) {
//
//        //Customize Circular Reveal
//        configSplash.setBackgroundColor(R.color.colorAccent); //any color you want form colors.xml
//        configSplash.setAnimCircularRevealDuration(2000); //int ms
//        configSplash.setRevealFlagX(Flags.REVEAL_RIGHT);  //or Flags.REVEAL_LEFT
//        configSplash.setRevealFlagY(Flags.REVEAL_BOTTOM); //or Flags.REVEAL_TOP
//
//        //Choose LOGO OR PATH; if you don't provide String value for path it's logo by default
//
//        //Customize Logo
//        configSplash.setLogoSplash(R.mipmap.ic_launcher); //or any other drawable
//        configSplash.setAnimLogoSplashDuration(2000); //int ms
//        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce); //choose one form Techniques (ref: https://github.com/daimajia/AndroidViewAnimations)
//
//        //Customize Title
//        configSplash.setTitleSplash("My Awesome App");
//        configSplash.setTitleTextColor(R.color.colorPrimary);
//        configSplash.setTitleTextSize(30f); //float value
//        configSplash.setAnimTitleDuration(3000);
//        configSplash.setAnimTitleTechnique(Techniques.FlipInX);
//        configSplash.setTitleFont("fonts/myfont.ttf"); //provide string to your font located in assets/fonts/
//    }
//
//    @Override
//    public void animationsFinished() {
//
//        Intent intent = new Intent(SplashScreen.this,IntroActivity.class);
//        startActivity(intent);
//    }
//}


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashScreenActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// METHOD 1

        /****** Create Thread that will sleep for 5 seconds *************/
        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds
                    sleep(5*1000);

                    // After 5 seconds redirect to another intent
                    Intent i=new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();

//METHOD 2

        /*
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                Intent i = new Intent(MainSplashScreen.this, FirstScreen.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, 5*1000); // wait for 5 seconds
        */
    }

    @Override
    protected void onDestroy() {

        super.onDestroy();

    }
}