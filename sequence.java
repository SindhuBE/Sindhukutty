public class LongestSequence {

    public static int getMaxSequence(ArrayList<Integer> list) {
        int sequence = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();

        for (int i = 0; i < list.size() - 1; i++) {
            //this is where things go wrong. I think.
            if (list.get(i + 1) >= list.get(i)) {
                sequence++;
            } else {
                //record the number in your arraylist
                temp.add(sequence);
                //reset count to 0
                 sequence = 0;
            }
         }

        int greatestnum = 0;

        for (int i = 0; i < temp.size() - 1; i++) {
            if (temp.get(i) < temp.get(i + 1)) {
                greatestnum = temp.get(i + 1);
            } else {
                greatestnum = temp.get(i);
            }
        }
        return greatestnum;
    }

ja
