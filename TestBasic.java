public class TestBasic {
    public static void main(String[] args) throws Exception {
        
        ABList<Integer> testList = new ABList<Integer>();

        //test add()

        testList.add(3);
        testList.add(5);
        testList.add(6);
        testList.add(12);
        System.out.println(testList.toString()); //should print:  3 5 6 12

        //test remove()
        testList.remove(2);
        System.out.println(testList.toString()); //should print:  3 5 12

        //test contains() 
        System.out.println(testList.contains (5));  //should print:  true
        System.out.println(testList.contains(32));  //should print:  false

        //test get()
        System.out.println(testList.get(2)); //should print: 12

        //test size()
        System.out.println(testList.size()); //should print: 3


    }
}
