package p097j7;

/* JADX INFO: renamed from: j7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6873o {
    public static final java.lang.Object[] a(java.lang.Object[] objArr, int i6) {
        p247y7.AbstractC7350t.f(objArr, "reference");
        java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i6);
        p247y7.AbstractC7350t.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (java.lang.Object[]) objNewInstance;
    }

    public static final void b(int i6, int i10) {
        if (i6 <= i10) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i6 + ") is greater than size (" + i10 + ").");
    }
}
