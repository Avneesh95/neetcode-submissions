class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        helper(nums,0,result,list);

        return result;
    }

    public static void helper(
        int []arr,int index , ArrayList<List<Integer>> result,
        ArrayList<Integer> list
    )
    {
        if(index == arr.length)
        {
            result.add(new ArrayList<>(list));
            return;

        }

        //take

        list.add(arr[index]);
        helper(arr,index+1,result,list);

        //remove

        list.remove(list.size()-1);

         helper(arr,index+1,result,list);

    }
}
