package cw.pkg02;

import cw.pkg02.Marks;


class A extends Marks{
    private float Bangla, English, Math;
  
    public A(float s1, float s2, float s3) {
        Bangla = s1;
    	English = s2;
    	Math = s3;
    }
    double getPercentage() {
    	return (Bangla + English + Math)/300.0 * 100;
    }
}
