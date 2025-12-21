class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        boolean[] visited = new boolean[n]; 
        int i = 0, j = n-1;
        int cnt = 0;
        while (i <= j){
            if (visited[i]){
                ++i;
                continue;
            }
            if (visited[j]){
                --j;
                continue;
            }
            int sum = people[i] + people[j];
            if (sum <= limit){
                ++cnt;
                visited[i] = true;
                visited[j] = true;
                ++i;
                --j;
            }
            else if (people[j] > people[i] && people[j] <= limit){
                ++cnt;
                visited[j] =true;
                --j;
            }
            else if (people[i] <= limit){
                ++cnt;
                visited[i] =true;
                ++i;
            }
            
        }
        return cnt;
    }  
}