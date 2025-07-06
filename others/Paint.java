public class Paint {
    public static void main(String[] args) {
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    }
    public static int getBucketCount (double width, double height,double areaPerBucket, int extraBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBucket < 0)
        {
	        return -1;
        }
        
        double areaToPaint = width * height;
        double areaWeCanPaint = areaPerBucket * extraBucket;
        double areaLeftToPaint = areaToPaint - areaWeCanPaint;
        
        if(areaLeftToPaint < 0)
        {
	        return 0;
        }
        else
        {
	        return ((int) Math.ceil (areaLeftToPaint / areaPerBucket));
        }
    }
    
    public static int getBucketCount (double width, double height,double areaPerBucket)
    {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0.0)
        {
	        return -1;
        }
        double areaToPaint = width * height;
        return ((int) Math.ceil (areaToPaint / areaPerBucket));
    }
  
    public static int getBucketCount (double area, double areaPerBucket)
    {
        if (area <= 0 || areaPerBucket <= 0.0)
        {
    	    return -1;
        }
        return ((int) Math.ceil (area / areaPerBucket));
    }
}


