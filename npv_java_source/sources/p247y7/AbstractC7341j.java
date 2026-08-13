package p247y7;

/* JADX INFO: renamed from: y7.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7341j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object[] f57301a = new java.lang.Object[0];

    public static final java.lang.Object[] a(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            java.util.Iterator it = collection.iterator();
            if (it.hasNext()) {
                java.lang.Object[] objArrCopyOf = new java.lang.Object[size];
                int i6 = 0;
                while (true) {
                    int i10 = i6 + 1;
                    objArrCopyOf[i6] = it.next();
                    if (i10 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new java.lang.OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i11);
                    } else if (!it.hasNext()) {
                        java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i10);
                        p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i6 = i10;
                }
            }
        }
        return f57301a;
    }

    public static final java.lang.Object[] b(java.util.Collection collection, java.lang.Object[] objArr) {
        java.lang.Object[] objArrCopyOf;
        p247y7.AbstractC7350t.f(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i6 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        java.util.Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), size);
            p247y7.AbstractC7350t.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (java.lang.Object[]) objNewInstance;
        }
        while (true) {
            int i10 = i6 + 1;
            objArrCopyOf[i6] = it.next();
            if (i10 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i11 = ((i10 * 3) + 1) >>> 1;
                if (i11 <= i10) {
                    i11 = 2147483645;
                    if (i10 >= 2147483645) {
                        throw new java.lang.OutOfMemoryError();
                    }
                }
                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i11);
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i10] = null;
                    return objArr;
                }
                java.lang.Object[] objArrCopyOf2 = java.util.Arrays.copyOf(objArrCopyOf, i10);
                p247y7.AbstractC7350t.e(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i6 = i10;
        }
    }
}
