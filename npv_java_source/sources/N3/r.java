package N3;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    static int a(int i6) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 == 0) {
                throw null;
            }
            if (i12 == i6) {
                return i11;
            }
        }
        return 1;
    }
}
