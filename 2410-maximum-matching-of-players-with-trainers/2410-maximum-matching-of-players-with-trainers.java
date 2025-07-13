class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i=0;
        int j=0;
        int match =0;

        while(i<players.length && j<trainers.length){
            if(players[i]<=trainers[j]){
                match++;
                i++;
            }
            j++;
            
        }
        return match;
    }
}