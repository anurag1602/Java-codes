public class paintjob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));



        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
    
    public static int getBucketCount(double width,double height,double areaPerBucket,double extraBuckets){
        if(width<0||height<0||areaPerBucket<0||extraBuckets<0){
            return -1;
        }
        
        double area = width * height;
        double areawecanpaint = areaPerBucket*extraBuckets;
        // System.out.println(areawecanpaint);
        double remainArea = area - areawecanpaint;
        // System.out.println(remainArea);
        double reqbucket = Math.ceil (remainArea/areaPerBucket);
        return (int)reqbucket; 


    }

    public static int getBucketCount(double width,double height,double areaPerBucket){
        if(width<0||height<0||areaPerBucket<0){
            return -1;
        }

        double areaToPaint = width * height;
        double reqbucket = Math.ceil (areaToPaint/areaPerBucket);
        return (int) reqbucket;


    }

    public static int getBucketCount(double area,double areaPerBucket){
        if(area<0||areaPerBucket<0){
            return -1;
        }

        double reqbucket = Math.ceil (area/areaPerBucket);
        return (int) reqbucket;
    }
}