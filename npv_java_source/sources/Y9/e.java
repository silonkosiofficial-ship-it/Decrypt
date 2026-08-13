package Y9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final int a(int[] iArr, int i6, int i10, int i11) {
        p247y7.AbstractC7350t.f(iArr, "<this>");
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i6) {
                i10 = i13 + 1;
            } else {
                if (i14 <= i6) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return (-i10) - 1;
    }

    public static final int b(X9.W w6, int i6) {
        p247y7.AbstractC7350t.f(w6, "<this>");
        int iA = a(w6.Q(), i6 + 1, 0, w6.R().length);
        return iA >= 0 ? iA : ~iA;
    }
}
