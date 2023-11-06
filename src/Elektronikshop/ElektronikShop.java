package Elektronikshop;

public class ElektronikShop {
    public int cheapKeyboard(int[] list){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list.length; i++){
            if(list[i] < min)
                min = list[i];
        }
        return min;
    }

    public int expensiveProduct(int[] list1, int[] list2){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < list1.length; i++)
            if(list1[i] > max)
                max = list1[i];
        for(int i = 0; i < list2.length; i++)
            if(list2[i] > max)
                max = list2[i];
        return max;
    }

    public int inBudgetUSB(int[] list, int budget){
        int productPrice = -1;
        for(int i = 0; i < list.length; i++)
            if(list[i] > productPrice && list[i] <= budget)
                productPrice = list[i];
        return productPrice;
    }

    public int receipt(int[] keyboards, int[] USBs, int budget){
        int receipt = -1;
        for(int i = 0; i < keyboards.length; i++){
            for(int j = 0; j < USBs.length; j++){
                if(keyboards[i] + USBs[j] <= budget && keyboards[i] + USBs[j] > receipt)
                    receipt = keyboards[i] + USBs[j];
            }
        }
        return receipt;
    }
}