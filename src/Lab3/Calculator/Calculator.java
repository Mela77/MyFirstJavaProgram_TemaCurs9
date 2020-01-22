package Lab3.Calculator;

public class Calculator {

    public int sum(int x, int y){
        return x+y;
    }
    public float beta (float x, float y){
        return x/y;
    }
    public int alpha (int x, int y, int z){
        return x+ y*z;
    }
    public float gamma (float x, float y, float z){
        return (x+y) %z;
    }
    public float delta (float x, float y, float z, float v){
        return x+((y*z)/v);
    }
    public float omega (float a, float b, float c, float d, float e){
        return (a+(b/c *d)-e) %c;
    }
    public int dif (int x, int y){
        return x-y;
    }
    public int mult (int x, int y){
        return x*y;
    }
    public float div(float x, float y){
        return x/y;
    }
    public float mean(float x, float y, float z){
        return (x+y+z)/3;
    }
    public int rem(int x, int y) {
        return x % y;
    }
    public double degree (double f){
        return ((5 *(f-32.0)) /9.0);
    }
    public float inch(float x){
        return x*0.0254f;
    }
    public float speedMps(float dist, float hr,float min, float sec ){
        float timeSeconds = (hr*3600)+(min*60)+sec;
        return dist/timeSeconds;
    }
    public float speedKph(float dist, float hr,float min, float sec ) {
        float timeSeconds = (hr * 3600) + (min * 60) + sec;
        return (dist / 1000.0f) / (timeSeconds / 3600.0f);
    }
    public float speedMph(float dist, float hr,float min, float sec ) {
        float timeSeconds = (hr * 3600) + (min * 60) + sec;
        float kph = (dist / 1000.0f) / (timeSeconds / 3600.0f);
        return kph / 1.609f;
    }
}
