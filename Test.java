public class Test {

    public static void main(String[] args) {
        System.out.println("WaitList");

        WaitList<Integer> list = new WaitList<>();

        System.out.println(list);
        System.out.println("Список пуст? " + list.isEmpty());

        list.add(4);
        list.add(67);
        list.add(3);
        list.add(65);

        System.out.println(list);
        System.out.println("Список пуст? " + list.isEmpty());

        list.remove();
        System.out.println(list);

        ////////////////////////////////////////////////////////////////////
        System.out.println("BoundedWaitList");

        BoundedWaitList<Integer> list2 = new BoundedWaitList<>(4);

        System.out.println(list2);
        System.out.println("Список пуст? " + list2.isEmpty());

        list2.add(7);
        list2.add(23);
        list2.add(754);
        list2.add(12);

        System.out.println(list2);
        System.out.println("Список пуст?  " + list2.isEmpty());

        list2.remove();
        System.out.println(list2);

        ////////////////////////////////////////////////////////////////////
        System.out.println("UnfairWaitList");

        UnfairWaitList<Integer> list3 = new UnfairWaitList<>();

        System.out.println(list3);
        System.out.println("Список пуст? " + list3.isEmpty());

        list3.add(5);
        list3.add(4);
        list3.add(3);
        list3.add(2);


        System.out.println(list3);
        System.out.println("Список пуст? " + list3.isEmpty());

        list3.remove(4);
        list3.remove(2);
        System.out.println(list3);
    }
}
