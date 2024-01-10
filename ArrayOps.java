public class ArrayOps {
    public static void main(String[] args) {
    }
    
    public static int findMissingInt (int [] array) {
        boolean missingIntFound = false; 
        boolean found=false;
        int missingInt=1;
        // Write your code here:
        for (int i = 0; missingIntFound==false; i++) {
            for (int j = 0; j < array.length && found== false; j++) {
                if(i==array[j]){
                    found =true;
                }
            }
            if (found==false){
                missingIntFound= true;
                missingInt=i;
            }
            found = false;
        }
        return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        // Write your code here:
        int max;
        int secondMax;
        if(array[0]>array[1]){
            max=array[0];
            secondMax=array[1];
        }
        else{
            max=array[1];
            secondMax=array[0];
        }
        
        for (int i = 2; i < array.length; i++) {
            if(secondMax<array[i]){
                if(max<array[i]){
                    secondMax=max;
                    max=array[i];
                }
                else{
                    secondMax=array[i];
                }
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // Write your code here:
        boolean sameElement = false;
        boolean allSameElements = true;
        int[] biggerArr;
        int[] smallerArr;
        if(array1.length>array2.length){
            biggerArr=array1;
            smallerArr=array2;
        }
        else{
            biggerArr=array2;
            smallerArr=array1;
        }
        for (int i = 0; i < biggerArr.length && allSameElements==true; i++) {
            for (int j = 0; j < smallerArr.length && sameElement==false; j++) {
                if(biggerArr[i]==smallerArr[j]){
                    sameElement=true;
                }
            }
            if(sameElement==false){
                allSameElements=false;
            }
            else{
                sameElement=false;
            }
        }
        return allSameElements;
    }

    public static boolean isSorted(int [] array) {
        boolean minToMax = true;
        boolean maxToMin = true;
        // Write your code here:
        for (int i = 0; i < array.length-1 && minToMax==true; i++) {
            if(array[i]>array[i+1]){
                minToMax= false;
            }
        }  
        for (int i = 0; i < array.length-1 && maxToMin==true && minToMax==false; i++) {
            if(array[i]<array[i+1]){
                maxToMin= false;
            }
        }
        return minToMax || maxToMin;
    }

}
