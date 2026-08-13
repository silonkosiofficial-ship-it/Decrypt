package F8;

/* JADX INFO: renamed from: F8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0960v {
    public static /* synthetic */ F8.i0 b(F8.AbstractC0960v abstractC0960v, O7.f0 f0Var, F8.AbstractC0961w abstractC0961w, F8.h0 h0Var, F8.E e6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: computeProjection");
        }
        if ((i6 & 8) != 0) {
            e6 = h0Var.c(f0Var, abstractC0961w);
        }
        return abstractC0960v.a(f0Var, abstractC0961w, h0Var, e6);
    }

    public F8.i0 a(O7.f0 f0Var, F8.AbstractC0961w abstractC0961w, F8.h0 h0Var, F8.E e6) {
        p247y7.AbstractC7350t.f(f0Var, "parameter");
        p247y7.AbstractC7350t.f(abstractC0961w, "typeAttr");
        p247y7.AbstractC7350t.f(h0Var, "typeParameterUpperBoundEraser");
        p247y7.AbstractC7350t.f(e6, "erasedUpperBound");
        return new F8.k0(F8.u0.OUT_VARIANCE, e6);
    }
}
