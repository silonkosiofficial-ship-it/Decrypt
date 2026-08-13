package p210v;

/* JADX INFO: loaded from: classes.dex */
public final class X implements p210v.W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p210v.X f55643b = new p210v.X();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f55644c = false;

    public static class a implements p210v.V {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.widget.Magnifier f55645a;

        public a(android.widget.Magnifier magnifier) {
            this.f55645a = magnifier;
        }

        @Override // p210v.V
        public long a() {
            return Y0.u.a(this.f55645a.getWidth(), this.f55645a.getHeight());
        }

        @Override // p210v.V
        public void b(long j6, long j10, float f6) {
            this.f55645a.show(p131n0.g.m(j6), p131n0.g.n(j6));
        }

        @Override // p210v.V
        public void c() {
            this.f55645a.update();
        }

        public final android.widget.Magnifier d() {
            return this.f55645a;
        }

        @Override // p210v.V
        public void dismiss() {
            this.f55645a.dismiss();
        }
    }

    private X() {
    }

    @Override // p210v.W
    public boolean a() {
        return f55644c;
    }

    @Override // p210v.W
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public v.X.a b(android.view.View view, boolean z6, long j6, float f6, float f10, boolean z10, Y0.e eVar, float f11) {
        return new v.X.a(new android.widget.Magnifier(view));
    }
}
