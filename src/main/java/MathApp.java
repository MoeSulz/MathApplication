public class MathApp {
    public static void main(String[] args) {
        // Find Max salary between 2 salaries
        long job1salary = 65000;
        long job2salary = 50000;

        long maxsalary = Math.max(job1salary, job2salary);

        System.out.println("The max salary is " + maxsalary);

        // Find minimum price between car and truck price
        long carprice = 15000;
        long truckprice = 20000;

        long smallestprice = Math.min(carprice, truckprice);
        System.out.println("The lowest price is " + smallestprice);

        //Find area of a circle with a radius that is 7.25
        float radius = 7.25F;
        float area = 165.13F;

        System.out.println("The area of a circle with a radius of 7.25 is " + area);


    }
}
