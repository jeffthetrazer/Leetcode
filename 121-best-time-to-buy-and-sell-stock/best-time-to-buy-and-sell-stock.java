class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int cp=0;
        int psf=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            cp=prices[i]-min;
            if(cp>psf){
                psf=cp;
            }
        }
        return psf;
            }
        }