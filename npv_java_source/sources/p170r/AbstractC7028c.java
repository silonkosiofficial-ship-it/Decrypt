package p170r;

/* JADX INFO: renamed from: r.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC7028c {
    static java.lang.Object[] a(java.lang.Object[] objArr, int i6) {
        if (objArr.length < i6) {
            return (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i6);
        }
        if (objArr.length > i6) {
            objArr[i6] = null;
        }
        return objArr;
    }
}
