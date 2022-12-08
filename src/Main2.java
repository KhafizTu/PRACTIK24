import java.util.*;

public class Main2 {
    public static void main(String[] args) {


//Java       Collection: LinkedList Exercises [7 көнүгүү]
//1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dastan");
        linkedList.add("Argen");
        linkedList.add("Bekzat");
        linkedList.add("Ulukbek");
        linkedList.add("Bekjan");
        linkedList.add("Aziza");
        linkedList.add("Baiaman");
        System.out.println("1: " + linkedList.getFirst());

        System.out.println();


//2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз.
        System.out.println("2: " + linkedList.getLast());

        System.out.println();

//3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз.
        System.out.println("3: " + linkedList.contains("Khafiz"));

        System.out.println();

//4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз.
        System.out.println("4: "+linkedList);

        System.out.println();

//5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.
        LinkedList<String> linkedList2 = new LinkedList<>();
        linkedList2.add("Aziza");
        linkedList2.add("Aiana");
        linkedList2.add("Khafiz");

        System.out.println("5: " + linkedList2.equals(linkedList));

        System.out.println();

//6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
        System.out.println("6: " + linkedList.isEmpty());

        System.out.println();

//7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.
        linkedList.set(2, "Davran");
        System.out.println("7: " + linkedList);
//__________________________________________________________________________________________

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

//        Java Collection: HashSet Exercises [12 көнүгүү]

//The Hash Set: [
//           new BankAccount("OPTIMA","41692222" "7000")
//           new BankAccount("KYRGYZSTAN","41691111" "5000")
//           new BankAccount("DEMIR","41693333" "9000")
//           new BankAccount("RSK","41694444" "100000")
//]
        Set<BankAccount> hashSet = new HashSet<>();
        hashSet.add(new BankAccount("OPTIMA", "416922222", "7000"));
        hashSet.add(new BankAccount("KYRGYZCTAN", "416911111", "23000"));
        hashSet.add(new BankAccount("DEMIR", "416933333", "67000"));
        hashSet.add(new BankAccount("RSK", "416944444", "97000"));

        System.out.println(hashSet);
        System.out.println();

//1. Көрсөтүлгөн элементти HashSet топтомунун аягына кошуу үчүн Java программасын жазыңыз.
        hashSet.add(new BankAccount("EKO ISLAMIC ", "4169666666", "1200000"));
        System.out.println("1:  " + hashSet);

        System.out.println();

//2. HashSet тизмедеги бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
        System.out.println("2: ");
        HashSet<String> h_set = new HashSet<String>();

        h_set.add("Khafiz");
        h_set.add("Aziza");
        h_set.add("Bekjan");
        h_set.add("Ulukbek");
        h_set.add("Sabina");
        h_set.add("Argen");

        Iterator<String> p = h_set.iterator();

        while (p.hasNext()) {
            System.out.println(p.next());
        }
        System.out.println();

//3. HashSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
        System.out.println("3: Размер-" + linkedList.size());

        System.out.println();

//4. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.
        linkedList.clear();
        System.out.println("4:  " + linkedList);
        System.out.println();

//5. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
        System.out.println("5: " + linkedList.isEmpty());

        System.out.println();

//6. HashSet топтомун башка хэш топтомуна клондоо үчүн Java программасын жазыңыз.
        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("A");
        hashSet1.add("B");
        hashSet1.add("C");
        hashSet1.add("D");

        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.addAll(hashSet1);
        System.out.println("6: " + hashSet2);

        System.out.println();

//7. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.
        System.out.println("7: ");
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(13);
        set.add(27);
        set.add(87);
        set.add(19);

        System.out.println("Hash Set Contains :" + set);
        int arr[] = new int[set.size()];
        int i = 0;
        for (Integer ele : set) {
            arr[i++] = ele;
        }
        for (int n : arr)
            System.out.println(n);

        System.out.println();

//8. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.
        System.out.println("8: ");
        System.out.println("Original Hash Set: " + h_set);

        Set<String> tree_set = new TreeSet<String>(h_set);
        System.out.println("TreeSet: ");
        for (String element : tree_set) {
            System.out.println(element);
        }
        System.out.println();

//9. HshSet топтомун List/ ArrayListке айландыруу үчүн Java программасын жазыңыз.
        System.out.println("9: ");
        System.out.println("Original Hash Set: " + h_set);

        ArrayList<String> arrayList = new ArrayList<>(h_set);
        System.out.println("ArrayList : ");
        for (String a : arrayList) {
            System.out.println(a);
        }
        System.out.println();
//10. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.
        System.out.println("10: " + h_set.equals(hashSet2));
        System.out.println();

//11. Эки топтомду салыштыруу жана эки топтомдо бирдей элементтерди сактоо үчүн Java программасын жазыңыз.
        System.out.println("11: ");
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Kutman");
        stringHashSet.add("Bekjan");
        stringHashSet.add("Ulukbek");
        stringHashSet.add("Alibek");
        stringHashSet.add("Aziza");
        stringHashSet.add("Salambek");

        System.out.println("Set1:" + h_set);
        System.out.println("Set2: " + stringHashSet);

        stringHashSet.retainAll(h_set);
        System.out.println("HashSet content: " + stringHashSet);
        System.out.println();
//12. HashSet топтомунан бардык элементтерди алып салуу үчүн Java программасын жазыңыз.
        stringHashSet.clear();
        System.out.println("12: " + stringHashSet);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//
//_____________________________________________________________________________________________
//
//      Java Collection: TreeSet Exercises [16 көнүгүүлөр]
//
//1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз, бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз.
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Кызыл");
        treeSet.add("Сары");
        treeSet.add("Жашыл");
        treeSet.add("Фиолетавый");
        treeSet.add("Кара");
        System.out.println("1: " + treeSet);

        System.out.println();

//2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
        System.out.println("2: ");
        for (String d : treeSet) {
            System.out.println(" " + d);
        }

        System.out.println();

//3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet топтомуна кошуу үчүн Java программасын жазыңыз.
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Ак");
        treeSet2.add("Розовый");
        treeSet2.add("Оранжевый");
        treeSet2.addAll(treeSet);
        System.out.println("3: " + treeSet2);
        System.out.println();
//4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн түзүү үчүн Java программасын жазыңыз.
        System.out.println(treeSet2.descendingSet());
        System.out.println();

//5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.
        System.out.println("5: ");
        System.out.println("Биринчи элемент:  " + treeSet2.first());
        System.out.println("Акыркы элемент:  " + treeSet2.last());
        System.out.println();

//6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыз.
        System.out.println("6: ");
        TreeSet<String> treeSet3 = new TreeSet<>();
        treeSet3 = (TreeSet) treeSet2.clone();
        System.out.println(treeSet3);
        System.out.println();

//7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
        System.out.println("7: " + treeSet3.size());
        System.out.println();

//8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жаз.
        if (treeSet2.equals(treeSet3)) {
            System.out.println("8: " + true);
        } else System.out.println("8: " + false);

        System.out.println();

//9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);
        tree_num.add(11);

        treeheadset = (TreeSet) tree_num.headSet(7);

        Iterator iterator;
        iterator = treeheadset.iterator();
        System.out.println("9: ");

        while (iterator.hasNext()) {
            System.out.println("  " + iterator.next() + " ");
        }
        System.out.println();

//10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын элементин алуу үчүн Java программасын жазыңыз.
        System.out.println("10: ");
        TreeSet <Integer>treeSet1 = new TreeSet<Integer>();

        treeSet1.add(1);
        treeSet1.add(2);
        treeSet1.add(3);
        treeSet1.add(4);
        treeSet1.add(5);
        treeSet1.add(6);
        treeSet1.add(7);
        treeSet1.add(8);
        treeSet1.add(9);

        System.out.println("Берилген санга барабар: "+treeSet1.ceiling(6));
        System.out.println("Бурилген санга барабар: "+treeSet1.ceiling(7));
        System.out.println();

//11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы элементти алуу үчүн Java программасын жазыңыз.
        System.out.println("11: " + tree_num.headSet(7));
        System.out.println();

//12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
        System.out.println("12: ");
        System.out.println(tree_num);
        System.out.println("Биринчи элементти алуу: " + tree_num.first());

        tree_num.remove(tree_num.first());
        System.out.println("Биринчи элементти алып салууу: " + tree_num);
        System.out.println();

//13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
        System.out.println("13: ");
        System.out.println("Акыркы элементти алуу: " + tree_num.last());
        tree_num.remove(tree_num.last());
        System.out.println("Акыркы элементти алып салуу: " + tree_num);

        System.out.println();

//14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз.

        System.out.println("14: ");
        System.out.println("До :"+tree_num);
        System.out.println(tree_num.higher(8));
        tree_num.remove(9);
        System.out.println("После: "+tree_num);


    }
}
