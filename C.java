
package cw.pkg02;

    import cw.pkg02.Marks;

class C extends Marks{
    private float Bangla, English, Math, Physics, Chemistry;
  
    public B(float s1, float s2, float s3, float s4,float s5) {
        Bangla = s1;
    	English = s2;
    	Math = s3;
    	Physics = s4;
        Chemistry = s5;
    }
    double getPercentage() {
    	return (Bangla + English + Math + Physics,Chemistry)/400.0 * 100;
    }
}
