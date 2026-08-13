package N4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F {
    static java.lang.Object a(java.lang.Object obj, int i6) {
        if (obj != null) {
            return obj;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(20);
        sb.append("at index ");
        sb.append(i6);
        throw new java.lang.NullPointerException(sb.toString());
    }

    static java.lang.Object[] b(java.lang.Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    static java.lang.Object[] c(java.lang.Object[] objArr, int i6) {
        for (int i10 = 0; i10 < i6; i10++) {
            a(objArr[i10], i10);
        }
        return objArr;
    }

    public static java.lang.Object[] d(java.lang.Object[] objArr, int i6) {
        return N4.H.b(objArr, i6);
    }
}
