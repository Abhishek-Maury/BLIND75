public class ContainerWithMostWater {
  //Approch --> Two pointer 
  
//   first take two container and finds its width from j-i and we know that where the water store 
//   that is the minimum height of the side so when we need to change the pointer we always change
//   the min height pointer because minimum height pointer control the water.

    public int maxArea(int[] height) {
        int maxWater=0;
        int lp=0;
        int rp=height.length-1;
        while(lp<rp){
            int w=rp-lp;
            int ht=Math.min(height[lp],height[rp]);
            int currWater=w*ht;
            maxWater=Math.max(maxWater,currWater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        
        return maxWater;
    }
    public static void main(String[] args) {
        
    }
}
