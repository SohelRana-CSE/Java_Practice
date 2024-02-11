package cw.pkg02;

import cw.pkg02.Marks;

class B extends Marks{
    private float Bangla, English, Math, Physics;
  
    public B(float s1, float s2, float s3, float s4) {
        Bangla = s1;
    	English = s2;
    	Math = s3;
    	Physics = s4;
    }
    double getPercentage() {
    	return (Bangla + English + Math + Physics)/400.0 * 100;
    }
}