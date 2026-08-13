package X0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final X0.o b(X0.o oVar, X0.o oVar2, float f6) {
        boolean z6 = oVar instanceof X0.c;
        if (z6 || (oVar2 instanceof X0.c)) {
            return (z6 && (oVar2 instanceof X0.c)) ? X0.o.f15646a.a((p141o0.AbstractC6984n0) M0.D.d(((X0.c) oVar).f(), ((X0.c) oVar2).f(), f6), p002a1.b.b(oVar.a(), oVar2.a(), f6)) : (X0.o) M0.D.d(oVar, oVar2, f6);
        }
        return X0.o.f15646a.b(p141o0.A0.i(oVar.c(), oVar2.c(), f6));
    }

    public static final long c(long j6, float f6) {
        return (java.lang.Float.isNaN(f6) || f6 >= 1.0f) ? j6 : p141o0.C7016y0.m(j6, p141o0.C7016y0.p(j6) * f6, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(float f6, p237x7.a aVar) {
        return java.lang.Float.isNaN(f6) ? ((java.lang.Number) aVar.b()).floatValue() : f6;
    }
}
