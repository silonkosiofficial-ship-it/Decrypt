package N4;

/* JADX INFO: loaded from: classes3.dex */
abstract class H {
    static java.lang.Object[] a(java.lang.Object[] objArr, int i6, int i10, java.lang.Object[] objArr2) {
        return java.util.Arrays.copyOfRange(objArr, i6, i10, objArr2.getClass());
    }

    static java.lang.Object[] b(java.lang.Object[] objArr, int i6) {
        return (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i6);
    }

    static java.util.Map c() {
        return N4.C1409i.t();
    }
}
