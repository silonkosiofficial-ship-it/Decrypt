package p239x9;

/* JADX INFO: renamed from: x9.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7290a implements p199t9.b {
    private AbstractC7290a() {
    }

    public /* synthetic */ AbstractC7290a(p247y7.AbstractC7342k abstractC7342k) {
        this();
    }

    public static /* synthetic */ void n(p239x9.AbstractC7290a abstractC7290a, p229w9.d dVar, int i6, java.lang.Object obj, boolean z6, int i10, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i10 & 8) != 0) {
            z6 = true;
        }
        abstractC7290a.m(dVar, i6, obj, z6);
    }

    private final int o(p229w9.d dVar, java.lang.Object obj) {
        int iW = dVar.w(a());
        h(obj, iW);
        return iW;
    }

    @Override // p199t9.a
    public java.lang.Object b(p229w9.h hVar) {
        p247y7.AbstractC7350t.f(hVar, "decoder");
        return k(hVar, null);
    }

    protected abstract java.lang.Object f();

    protected abstract int g(java.lang.Object obj);

    protected abstract void h(java.lang.Object obj, int i6);

    protected abstract java.util.Iterator i(java.lang.Object obj);

    protected abstract int j(java.lang.Object obj);

    public final java.lang.Object k(p229w9.h hVar, java.lang.Object obj) {
        java.lang.Object objF;
        p247y7.AbstractC7350t.f(hVar, "decoder");
        if (obj == null || (objF = p(obj)) == null) {
            objF = f();
        }
        int iG = g(objF);
        p229w9.d dVarA = hVar.a(a());
        if (!dVarA.v()) {
            while (true) {
                int iR = dVarA.r(a());
                if (iR == -1) {
                    break;
                }
                n(this, dVarA, iG + iR, objF, false, 8, null);
            }
        } else {
            l(dVarA, objF, iG, o(dVarA, objF));
        }
        dVarA.b(a());
        return q(objF);
    }

    protected abstract void l(p229w9.d dVar, java.lang.Object obj, int i6, int i10);

    protected abstract void m(p229w9.d dVar, int i6, java.lang.Object obj, boolean z6);

    protected abstract java.lang.Object p(java.lang.Object obj);

    protected abstract java.lang.Object q(java.lang.Object obj);
}
