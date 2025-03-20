class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0,0};
        if(denom1>denom2){
            if(denom1%denom2==0){
                answer[0]=numer1+(numer2*(denom1/denom2));
                answer[1]=denom1;
        } else {
            answer[0]=(numer1*denom2)+(numer2*denom1);
            answer[1]=denom1*denom2;
        }
        }else if(denom1<denom2){
            if(denom2%denom1==0){
                answer[0]=numer2+(numer1*(denom2/denom1));
                answer[1]=denom2;
            } else {
                answer[0]=(numer1*denom2)+(numer2*denom1);
                answer[1]=denom1*denom2;
            }
    }else{
        answer[0]=numer1+numer2;
        answer[1]=denom1;
    }

    int j=(answer[0]>=answer[1])?answer[0]:answer[1];
    for(int i=j; i>=1; i--){
        if(answer[0]%i==0 && answer[1]%i==0){
            answer[0]/=i;
            answer[1]/=i;
            break;
        }
    }
        if (answer[0] == 1 && answer[1] == 1) {
            return new int[]{1, 1};
        }

        return answer;
    }
}