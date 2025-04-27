void bfs(int src,vector<int> & dist,vector<int> edge,int n){
    queue<int>q;
    for(int i=0;i<n;i++){
        dist[i] =INT_MAX;
    }

    q.push(src);
    dist[src]=0;

    while(q.size()>0){
        int x = q.front();
        q.pop();
        int y = edge[x];
        if(dist[y]==INT_MAX){
            dist[y] = dist[x]+1;
        q.push(y);
        }
    }
}

int main(){
    int n;cin>>n;
    vector<int>edge(n);
    for(int i=0;i<n;i++){
        cin>>edge[i];
    }
    int c1,c2;
    cin>>c1>>c2;
    vector<int>dist(n),dist2(n);
    bfs(c1,dist1,edge,n);
    bfs(c2,dist2,edge,n);
    int minDist =INT_MAX,ans =-1;

    for(int i=0;i<n;i++){
if(dist[i]!= INT_MAX && dist2[i]!=INT_MAX){
    IF(minDist>dist1[i]+dist2[i]){
        minDist = dist[i]+dist2[i];
        ans =i;
    }
}
    }
    cout<<ans<endl;
}