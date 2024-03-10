package DSA.Backtracking;

import java.util.ArrayList;

public class Assignment {
    static boolean subsetsWithEqualSum(int[] arr,int k){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> smallAns=new ArrayList<>();
        subsets(arr,ans,smallAns,0);
        int[] sum=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            sum[i]=add(ans.get(i));
        }
        int[] freq=new int[max(sum)+1];
        for(int i=0;i<sum.length;i++){
            freq[sum[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=k) return true;
        }
        return false;
    }

    static void subsets(int[] arr,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> smallAns,int idx){
        if(idx==arr.length){
            if(smallAns.size()>0){
                ans.add(new ArrayList<>(smallAns));
            }
            return;
        }

        subsets(arr,ans,smallAns,idx+1);
        smallAns.add(arr[idx]);

        subsets(arr,ans,smallAns,idx+1);
        smallAns.remove(smallAns.size()-1);
    }

    static int add(ArrayList<Integer> smallAns){
        int sum=0;
        for(int i=0;i<smallAns.size();i++){
            sum+=smallAns.get(i);
        }
        return sum;
    }

    static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
        }
        return max;
    }

    static void permutations(int[] arr){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        helper(arr,0,ans);
        for(int i=0;i<ans.size();i++){
            System.out.println((ans.get(i)));
        }
    }

    static void helper(int[] arr,int idx,ArrayList<ArrayList<Integer>> ans){
        int n=arr.length;
        if(idx==n){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(arr[i]);
            }
            if(!ans.contains(temp)) ans.add(temp);
        }

        for(int i=idx;i<n;i++){
            swap(i,idx,arr);
            helper(arr, idx+1, ans);
            swap(i,idx,arr);
        }
    }

    static void swap(int a,int b,int[] arr){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static boolean subsetProduct(int[] arr,int k){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> smallAns=new ArrayList<>();
        subsets(arr,ans,smallAns,0);
        int[] product=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            product[i]=multiply(ans.get(i));
        }
        int[] freq=new int[max(product)+1];
        for(int i=0;i<product.length;i++){
            freq[product[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==k) return true;
        }
        return false;
    }

    static int multiply(ArrayList<Integer> smallAns){
        int ans=1;
        for(int i=0;i<smallAns.size();i++){
            ans*=smallAns.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
//      Q:1. Given an integer array arr and an integer k, return true if it is
//        possible to divide the vector into k non-empty subsets with equal
//        sum.
//        Input: arr = [1,3,2,2] k = 2
//        Output: true
//        Explanation :1 + 3 and 2+2 are two subsets with equal sum.
        int[] arr={1,3,2,2};
        int k=2;
        System.out.println(subsetsWithEqualSum(arr,k));
        System.out.println();

//      Q:2. Given a collection of numbers, nums, that might contain
//        duplicates, return all possible unique permutations in any order.
        int[] nums={1,1,2};
        permutations(nums);
        System.out.println();

//      Q:3. Check if the product of some subset of an array is equal to the
//        target value.
        int[] array={2,3,2,5,4};
        int terget=k;
        System.out.println(subsetProduct(array,terget));
        System.out.println();

        System.out.println("\nSpiC AD :)");
    }
}
