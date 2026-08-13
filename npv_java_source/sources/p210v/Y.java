package p210v;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements p210v.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p210v.Y f55646b = new p210v.Y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f55647c = true;

    public static final class a extends v.X.a {
        public a(android.widget.Magnifier magnifier) {
            super(magnifier);
        }

        @Override // v.X.a, p210v.V
        public void b(long j6, long j10, float f6) {
            if (!java.lang.Float.isNaN(f6)) {
                d().setZoom(f6);
            }
            if (p131n0.h.c(j10)) {
                d().show(p131n0.g.m(j6), p131n0.g.n(j6), p131n0.g.m(j10), p131n0.g.n(j10));
            } else {
                d().show(p131n0.g.m(j6), p131n0.g.n(j6));
            }
        }
    }

    private Y() {
    }

    @Override // p210v.W
    public boolean a() {
        return f55647c;
    }

    @Override // p210v.W
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v.Y.a b(android.view.View view, boolean z6, long j6, float f6, float f10, boolean z10, Y0.e eVar, float f11) {
        if (z6) {
            return new v.Y.a(new android.widget.Magnifier(view));
        }
        long jB1 = eVar.b1(j6);
        float fB0 = eVar.B0(f6);
        float fB1 = eVar.B0(f10);
        android.widget.Magnifier.Builder builder = new android.widget.Magnifier.Builder(view);
        if (jB1 != 9205357640488583168L) {
            builder.setSize(A7.a.d(p131n0.m.i(jB1)), A7.a.d(p131n0.m.g(jB1)));
        }
        if (!java.lang.Float.isNaN(fB0)) {
            builder.setCornerRadius(fB0);
        }
        if (!java.lang.Float.isNaN(fB1)) {
            builder.setElevation(fB1);
        }
        if (!java.lang.Float.isNaN(f11)) {
            builder.setInitialZoom(f11);
        }
        builder.setClippingEnabled(z10);
        return new v.Y.a(builder.build());
    }
}
