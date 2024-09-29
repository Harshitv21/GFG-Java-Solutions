#include <iostream>
using namespace std;

/* solution starts here */
void triangle(int s) {
    for(int i = 1; i < s; i++) {
        cout << "*";
        for(int j = 1; j < i; j++) {
            cout << "  ";
        }
        if (i > 1) {
            cout << "*";
        }
        cout << endl;
    }
    for(int i = 1; i <= s; i++) {
        cout << "* ";
    }
    cout << endl;
}
/* solution ends here */

int main() {

    return 0;
}