#include <iostream>
#include <vector>
using namespace std;

/* solution starts here */
int largest(vector<int> &arr, int n) {
    int G = arr[0];
    for(int i = 0; i <= n - 1; i++) {
        if(G <= arr[i]) G = arr[i];
    }
    
    return G;
}
/* solution starts here */

int main() {

    return 0;
}