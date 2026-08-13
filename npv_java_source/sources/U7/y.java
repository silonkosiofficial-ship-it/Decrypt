package U7;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends U7.t implements p048e8.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f14615a;

    public y(java.lang.Object obj) {
        p247y7.AbstractC7350t.f(obj, "recordComponent");
        this.f14615a = obj;
    }

    @Override // U7.t
    public java.lang.reflect.Member Y() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method methodC = U7.C1692a.f14565a.c(this.f14615a);
        if (methodC != null) {
            return methodC;
        }
        throw new java.lang.NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // p048e8.w
    public p048e8.x getType() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Class clsD = U7.C1692a.f14565a.d(this.f14615a);
        if (clsD != null) {
            return new U7.n(clsD);
        }
        throw new java.lang.NoSuchMethodError("Can't find `getType` method");
    }

    @Override // p048e8.w
    public boolean m() {
        return false;
    }
}
