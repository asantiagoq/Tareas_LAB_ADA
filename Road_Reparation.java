import java.io.*;
import java.util.*;

public class CSES1675 {
    static class E {
        int i, j, w;
        E(int i, int j, int w) {
            this.i = i; this.j = j; this.w = w;
        }
    }
    static int[] dsu;
    static int find(int i) {
        return dsu[i] < 0 ? i : (dsu[i] = find(dsu[i]));
    }
    static boolean join(int i, int j) {
        i = find(i);
        j = find(j);
        if (i == j)
            return false;
        if (dsu[i] > dsu[j])
            dsu[i] = j;
        else {
            if (dsu[i] == dsu[j])
                dsu[i]--;
            dsu[j] = i;
        }
        return true;
    }
}
