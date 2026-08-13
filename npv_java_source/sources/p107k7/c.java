package p107k7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final java.lang.Object[] d(int i6) {
        if (i6 >= 0) {
            return new java.lang.Object[i6];
        }
        throw new java.lang.IllegalArgumentException("capacity must be non-negative.".toString());
    }

    public static final java.lang.Object[] e(java.lang.Object[] objArr, int i6) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, i6);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final void f(java.lang.Object[] objArr, int i6) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        objArr[i6] = null;
    }

    public static final void g(java.lang.Object[] objArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(objArr, "<this>");
        while (i6 < i10) {
            f(objArr, i6);
            i6++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(java.lang.Object[] objArr, int i6, int i10, java.util.List list) {
        if (i10 != list.size()) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!p247y7.AbstractC7350t.b(objArr[i6 + i11], list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(java.lang.Object[] objArr, int i6, int i10) {
        int iHashCode = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            java.lang.Object obj = objArr[i6 + i11];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String j(java.lang.Object[] objArr, int i6, int i10, java.util.Collection collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder((i10 * 3) + 2);
        sb.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb.append(", ");
            }
            java.lang.Object obj = objArr[i6 + i11];
            if (obj == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        return string;
    }
}
