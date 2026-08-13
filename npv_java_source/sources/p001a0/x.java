package p001a0;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final int f(int i6, int i10) {
        return (i6 >> i10) & 31;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object[] g(java.lang.Object[] objArr, int i6, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 2];
        p097j7.AbstractC6872n.p(objArr, objArr2, 0, 0, i6, 6, null);
        p097j7.AbstractC6872n.l(objArr, objArr2, i6 + 2, i6, objArr.length);
        objArr2[i6] = obj;
        objArr2[i6 + 1] = obj2;
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object[] h(java.lang.Object[] objArr, int i6) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 2];
        p097j7.AbstractC6872n.p(objArr, objArr2, 0, 0, i6, 6, null);
        p097j7.AbstractC6872n.l(objArr, objArr2, i6, i6 + 2, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object[] i(java.lang.Object[] objArr, int i6) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        p097j7.AbstractC6872n.p(objArr, objArr2, 0, 0, i6, 6, null);
        p097j7.AbstractC6872n.l(objArr, objArr2, i6, i6 + 1, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object[] j(java.lang.Object[] objArr, int i6, int i10, p001a0.t tVar) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        p097j7.AbstractC6872n.p(objArr, objArr2, 0, 0, i6, 6, null);
        p097j7.AbstractC6872n.l(objArr, objArr2, i6, i6 + 2, i10);
        objArr2[i10 - 2] = tVar;
        p097j7.AbstractC6872n.l(objArr, objArr2, i10 - 1, i10, objArr.length);
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.Object[] k(java.lang.Object[] objArr, int i6, int i10, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, objArr.length + 1);
        p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(this, newSize)");
        p097j7.AbstractC6872n.l(objArrCopyOf, objArrCopyOf, i6 + 2, i6 + 1, objArr.length);
        p097j7.AbstractC6872n.l(objArrCopyOf, objArrCopyOf, i10 + 2, i10, i6);
        objArrCopyOf[i10] = obj;
        objArrCopyOf[i10 + 1] = obj2;
        return objArrCopyOf;
    }
}
