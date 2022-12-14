class A0Paper {
    public static void main(String[] args) {
        int[] test = {0, 2, 1};
        System.out.println(canBuild(test));
    }
    
    public static String canBuild(int[] A) {
        String result = "";
        Integer lest = 10000;
        for(Integer i = 0; i < A.length; i ++) {
            if (lest - (2^(i+1) * A[i+1]) <= 0) {
                result = "Possible";
                break;
            }
            else {
                lest = lest - (2^(i+1) * A[i+1]);
            }
        }        
        result = "Impossible";
        return result;
    }
}