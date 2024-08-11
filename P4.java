class P4 {
    public static void Largest(int n, int m, int k) {
        if (n > m && n > k) {
            System.out.println(n);
        }
        else if (m > k ) {
                System.out.println(m);
            }
            else {
                System.out.println(k);
            }
        }
        public static void main(String[]args) {
            Largest(100,20,3000);
        }
    
    }
