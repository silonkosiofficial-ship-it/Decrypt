package p076h5;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements p076h5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p076h5.h f46492c = new h5.d.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F5.a f46493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f46494b = new java.util.concurrent.atomic.AtomicReference(null);

    private static final class b implements p076h5.h {
        private b() {
        }

        @Override // p076h5.h
        public java.io.File a() {
            return null;
        }

        @Override // p076h5.h
        public java.io.File b() {
            return null;
        }

        @Override // p076h5.h
        public java.io.File c() {
            return null;
        }

        @Override // p076h5.h
        public n5.F.a d() {
            return null;
        }

        @Override // p076h5.h
        public java.io.File e() {
            return null;
        }

        @Override // p076h5.h
        public java.io.File f() {
            return null;
        }

        @Override // p076h5.h
        public java.io.File g() {
            return null;
        }
    }

    public d(F5.a aVar) {
        this.f46493a = aVar;
        aVar.a(new F5.a.InterfaceC0063a() { // from class: h5.b
            @Override // F5.a.InterfaceC0063a
            public final void a(F5.b bVar) {
                this.f46487a.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(F5.b bVar) {
        p076h5.g.f().b("Crashlytics native component now available.");
        this.f46494b.set((p076h5.a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(java.lang.String str, java.lang.String str2, long j6, p136n5.G g6, F5.b bVar) {
        ((p076h5.a) bVar.get()).b(str, str2, j6, g6);
    }

    @Override // p076h5.a
    public p076h5.h a(java.lang.String str) {
        p076h5.a aVar = (p076h5.a) this.f46494b.get();
        return aVar == null ? f46492c : aVar.a(str);
    }

    @Override // p076h5.a
    public void b(final java.lang.String str, final java.lang.String str2, final long j6, final p136n5.G g6) {
        p076h5.g.f().i("Deferring native open session: " + str);
        this.f46493a.a(new F5.a.InterfaceC0063a() { // from class: h5.c
            @Override // F5.a.InterfaceC0063a
            public final void a(F5.b bVar) {
                p076h5.d.h(str, str2, j6, g6, bVar);
            }
        });
    }

    @Override // p076h5.a
    public boolean c() {
        p076h5.a aVar = (p076h5.a) this.f46494b.get();
        return aVar != null && aVar.c();
    }

    @Override // p076h5.a
    public boolean d(java.lang.String str) {
        p076h5.a aVar = (p076h5.a) this.f46494b.get();
        return aVar != null && aVar.d(str);
    }
}
