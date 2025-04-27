int main(){
    int  q;
    map<pair<int,int>,int>cost;
    cin>>q;
    int ans =0;
    while(q--){
        int t;
        cin>>t;
        int x,y,toll;
        cin>>x>>y>>toll;
        vector<int>px ,py;
        while(x!=0){
            px.push_back(x);
            x=x/2;

        }

        reverse(px.begin(),px.end());
        while(y!=0){
            py.push_back(y);
            y =y/2;

        }

        reverse(py.begin(),py.end());
        int j=0;
        while(px[j]==py[j]){
            j++;
        }
        j--;
        if(t==1){
            for(int k=j;k<px.size()-1;k++){
                cost[{px[k],py[k+1]}]+=toll;
                  cost[{px[k+1],py[k]}]+=toll;


            }

        }else{
            int sum =0;
            for(int k=j;k<px.size()-1;k++){
                sum += cost[{px[k,px[k+1]]}];
            }
            for(int k=j;k<py.size()-1;k++){
                sum += cost[{px[k],py[k+1]}];
            }
            ans += sum;
        }
    }
}
cout<<ans<<endl;