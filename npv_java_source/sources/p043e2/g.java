package p043e2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p043e2.g f44643a = new p043e2.g();

    public static final class a implements c2.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e2.g.a f44644a = new e2.g.a();

        private a() {
        }
    }

    private g() {
    }

    public final androidx.lifecycle.V.c a(java.util.Collection collection) {
        p247y7.AbstractC7350t.f(collection, "initializers");
        p023c2.f[] fVarArr = (p023c2.f[]) collection.toArray(new p023c2.f[0]);
        return new p023c2.b((p023c2.f[]) java.util.Arrays.copyOf(fVarArr, fVarArr.length));
    }

    public final androidx.lifecycle.T b(F7.c cVar, p023c2.a aVar, p023c2.f... fVarArr) {
        androidx.lifecycle.T t6;
        p023c2.f fVar;
        p237x7.l lVarB;
        p247y7.AbstractC7350t.f(cVar, "modelClass");
        p247y7.AbstractC7350t.f(aVar, "extras");
        p247y7.AbstractC7350t.f(fVarArr, "initializers");
        int length = fVarArr.length;
        int i6 = 0;
        while (true) {
            t6 = null;
            if (i6 >= length) {
                fVar = null;
                break;
            }
            fVar = fVarArr[i6];
            if (p247y7.AbstractC7350t.b(fVar.a(), cVar)) {
                break;
            }
            i6++;
        }
        if (fVar != null && (lVarB = fVar.b()) != null) {
            t6 = (androidx.lifecycle.T) lVarB.l(aVar);
        }
        if (t6 != null) {
            return t6;
        }
        throw new java.lang.IllegalArgumentException(("No initializer set for given class " + p043e2.h.a(cVar)).toString());
    }

    public final p023c2.a c(androidx.lifecycle.Y y6) {
        p247y7.AbstractC7350t.f(y6, "owner");
        return y6 instanceof androidx.lifecycle.InterfaceC2077i ? ((androidx.lifecycle.InterfaceC2077i) y6).k() : p023c2.a.C0466a.f24405b;
    }

    public final androidx.lifecycle.V.c d(androidx.lifecycle.Y y6) {
        p247y7.AbstractC7350t.f(y6, "owner");
        return y6 instanceof androidx.lifecycle.InterfaceC2077i ? ((androidx.lifecycle.InterfaceC2077i) y6).j() : p043e2.c.f44637a;
    }

    public final java.lang.String e(F7.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "modelClass");
        java.lang.String strA = p043e2.h.a(cVar);
        if (strA == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final androidx.lifecycle.T f() {
        throw new java.lang.UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
