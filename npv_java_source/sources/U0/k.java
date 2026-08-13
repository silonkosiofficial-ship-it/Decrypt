package U0;

/* JADX INFO: loaded from: classes.dex */
final class k implements U0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V.G1 f14436a;

    public static final class a extends androidx.emoji2.text.f.AbstractC0423f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ V.InterfaceC1753w0 f14437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ U0.k f14438b;

        a(V.InterfaceC1753w0 interfaceC1753w0, U0.k kVar) {
            this.f14437a = interfaceC1753w0;
            this.f14438b = kVar;
        }

        @Override // androidx.emoji2.text.f.AbstractC0423f
        public void a(java.lang.Throwable th) {
            this.f14438b.f14436a = U0.o.f14443a;
        }

        @Override // androidx.emoji2.text.f.AbstractC0423f
        public void b() {
            this.f14437a.setValue(java.lang.Boolean.TRUE);
            this.f14438b.f14436a = new U0.p(true);
        }
    }

    public k() {
        this.f14436a = androidx.emoji2.text.f.k() ? c() : null;
    }

    private final V.G1 c() {
        androidx.emoji2.text.f fVarC = androidx.emoji2.text.f.c();
        if (fVarC.g() == 1) {
            return new U0.p(true);
        }
        V.InterfaceC1753w0 interfaceC1753w0D = V.A1.d(java.lang.Boolean.FALSE, null, 2, null);
        fVarC.v(new U0.k.a(interfaceC1753w0D, this));
        return interfaceC1753w0D;
    }

    @Override // U0.n
    public V.G1 a() {
        V.G1 g1C = this.f14436a;
        if (g1C == null) {
            if (!androidx.emoji2.text.f.k()) {
                return U0.o.f14443a;
            }
            g1C = c();
            this.f14436a = g1C;
        }
        p247y7.AbstractC7350t.c(g1C);
        return g1C;
    }
}
