package p028c8;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends F8.AbstractC0960v {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24455a;

        static {
            int[] iArr = new int[p028c8.c.values().length];
            try {
                iArr[p028c8.c.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[p028c8.c.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[p028c8.c.INFLEXIBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f24455a = iArr;
        }
    }

    @Override // F8.AbstractC0960v
    public F8.i0 a(O7.f0 f0Var, F8.AbstractC0961w abstractC0961w, F8.h0 h0Var, F8.E e6) {
        F8.i0 k0Var;
        p247y7.AbstractC7350t.f(f0Var, "parameter");
        p247y7.AbstractC7350t.f(abstractC0961w, "typeAttr");
        p247y7.AbstractC7350t.f(h0Var, "typeParameterUpperBoundEraser");
        p247y7.AbstractC7350t.f(e6, "erasedUpperBound");
        if (!(abstractC0961w instanceof p028c8.a)) {
            return super.a(f0Var, abstractC0961w, h0Var, e6);
        }
        p028c8.a aVarL = (p028c8.a) abstractC0961w;
        if (!aVarL.i()) {
            aVarL = aVarL.l(p028c8.c.INFLEXIBLE);
        }
        int i6 = c8.f.a.f24455a[aVarL.g().ordinal()];
        if (i6 == 1) {
            return new F8.k0(F8.u0.INVARIANT, e6);
        }
        if (i6 != 2 && i6 != 3) {
            throw new p087i7.s();
        }
        if (f0Var.s().g()) {
            java.util.List listX = e6.W0().x();
            p247y7.AbstractC7350t.e(listX, "getParameters(...)");
            k0Var = listX.isEmpty() ^ true ? new F8.k0(F8.u0.OUT_VARIANCE, e6) : F8.q0.t(f0Var, aVarL);
        } else {
            k0Var = new F8.k0(F8.u0.INVARIANT, p218v8.c.j(f0Var).H());
        }
        p247y7.AbstractC7350t.c(k0Var);
        return k0Var;
    }
}
