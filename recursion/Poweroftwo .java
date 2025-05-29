class Poweroftwo  {
    public static void main(String[] args) {
        int num = 16;  
        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println("Yes, power of 2");
        } else {
            System.out.println("No, not a power of 2");
        }
    }
}
