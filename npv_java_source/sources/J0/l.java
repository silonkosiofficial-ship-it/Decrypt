package J0;

/* JADX INFO: loaded from: classes.dex */
public final class l implements J0.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final V.InterfaceC1753w0 f5596a = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);

    /* synthetic */ class a extends p247y7.AbstractC7332a implements p237x7.l {
        a(java.lang.Object obj) {
            super(1, obj, X.b.class, "add", "add(Ljava/lang/Object;)Z", 8);
        }

        public final void a(J0.m mVar) {
            ((X.b) this.f57274C).d(mVar);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((J0.m) obj);
            return p087i7.M.f46721a;
        }
    }

    static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final J0.l.b f5597D = new J0.l.b();

        b() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Comparable l(J0.m mVar) {
            return java.lang.Integer.valueOf(mVar.b());
        }
    }

    static final class c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final J0.l.c f5598D = new J0.l.c();

        c() {
            super(1);
        }

        @Override // p237x7.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Comparable l(J0.m mVar) {
            return java.lang.Integer.valueOf(mVar.d().f());
        }
    }

    private final void e(boolean z6) {
        this.f5596a.setValue(java.lang.Boolean.valueOf(z6));
    }

    @Override // J0.d.a
    public void a() {
        e(true);
    }

    @Override // J0.d.a
    public void b() {
        e(false);
    }

    public final boolean c() {
        return ((java.lang.Boolean) this.f5596a.getValue()).booleanValue();
    }

    public final void d(android.view.View view, K0.q qVar, p127m7.i iVar, java.util.function.Consumer<android.view.ScrollCaptureTarget> consumer) {
        X.b bVar = new X.b(new J0.m[16], 0);
        J0.n.e(qVar.a(), 0, new J0.l.a(bVar), 2, null);
        bVar.N(p117l7.a.b(J0.l.b.f5597D, J0.l.c.f5598D));
        J0.m mVar = (J0.m) (bVar.w() ? null : bVar.s()[bVar.t() - 1]);
        if (mVar == null) {
            return;
        }
        J0.d dVar = new J0.d(mVar.c(), mVar.d(), W8.O.a(iVar), this);
        p131n0.i iVarB = D0.AbstractC0901u.b(mVar.a());
        long j6 = mVar.d().j();
        android.view.ScrollCaptureTarget scrollCaptureTargetA = J0.k.a(view, p141o0.X1.a(Y0.s.b(iVarB)), new android.graphics.Point(Y0.p.h(j6), Y0.p.i(j6)), J0.i.a(dVar));
        scrollCaptureTargetA.setScrollBounds(p141o0.X1.a(mVar.d()));
        consumer.o(scrollCaptureTargetA);
    }
}
