package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
abstract class g {
    public static int[] a(int[] iArr, int i6, int i10) {
        if (i6 + 1 > iArr.length) {
            int[] iArr2 = new int[c(i6)];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i6);
            iArr = iArr2;
        }
        iArr[i6] = i10;
        return iArr;
    }

    public static java.lang.Object[] b(java.lang.Object[] objArr, int i6, java.lang.Object obj) {
        if (i6 + 1 > objArr.length) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), c(i6));
            java.lang.System.arraycopy(objArr, 0, objArr2, 0, i6);
            objArr = objArr2;
        }
        objArr[i6] = obj;
        return objArr;
    }

    public static int c(int i6) {
        if (i6 <= 4) {
            return 8;
        }
        return i6 * 2;
    }
}
