package V3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static boolean a(int[] iArr, int i6) {
        if (iArr != null) {
            for (int i10 : iArr) {
                if (i10 == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(java.lang.Object[] objArr, java.lang.Object obj) {
        int length = objArr != null ? objArr.length : 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (Q3.AbstractC1475n.a(objArr[i6], obj)) {
                if (i6 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
