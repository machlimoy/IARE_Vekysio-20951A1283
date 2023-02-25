#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s;
    getline(cin,s);
    int strt = 0;
    int end = s.size();
    while(strt < end){
        swap(s[strt],s[end]);
        strt++;
        end--;
    }
    cout << s;

    return 0;
}
