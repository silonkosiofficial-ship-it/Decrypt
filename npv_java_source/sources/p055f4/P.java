package p055f4;

/* JADX INFO: loaded from: classes3.dex */
public final class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p055f4.W0 f45069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.concurrent.Executor f45070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f45071c = new java.util.concurrent.atomic.AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicReference f45072d = new java.util.concurrent.atomic.AtomicReference();

    P(p055f4.W0 w6, java.util.concurrent.Executor executor) {
        this.f45069a = w6;
        this.f45070b = executor;
    }

    final /* synthetic */ void a(p055f4.D d6) {
        final java.util.concurrent.atomic.AtomicReference atomicReference = this.f45072d;
        j$.util.Objects.requireNonNull(atomicReference);
        d6.g(new L4.f.b() { // from class: f4.G
            @Override // L4.f.b
            public final void a(L4.b bVar) {
                atomicReference.set(bVar);
            }
        }, new L4.f.a() { // from class: f4.H
            @Override // L4.f.a
            public final void b(L4.e eVar) {
                "Failed to load and cache a form, error=".concat(java.lang.String.valueOf(eVar.a()));
            }
        });
    }

    public final void b(L4.f.b bVar, L4.f.a aVar) {
        p055f4.AbstractC6585v0.a();
        p055f4.S s6 = (p055f4.S) this.f45071c.get();
        if (s6 == null) {
            aVar.b(new p055f4.Z0(3, "No available form can be built.").a());
        } else {
            ((p055f4.InterfaceC6586w) this.f45069a.a()).a(s6).b().a().g(bVar, aVar);
        }
    }

    public final void c() {
        p055f4.S s6 = (p055f4.S) this.f45071c.get();
        if (s6 == null) {
            return;
        }
        final p055f4.D dA = ((p055f4.InterfaceC6586w) this.f45069a.a()).a(s6).b().a();
        dA.f45030l = true;
        p055f4.AbstractC6585v0.f45260a.post(new java.lang.Runnable() { // from class: f4.F
            @Override // java.lang.Runnable
            public final void run() {
                this.f45037C.a(dA);
            }
        });
    }

    public final void d(p055f4.S s6) {
        this.f45071c.set(s6);
    }

    public final void e(android.app.Activity activity, final L4.b.a aVar) {
        p055f4.AbstractC6585v0.a();
        p055f4.c1 c1VarB = p055f4.AbstractC6543a.a(activity).b();
        if (c1VarB == null) {
            p055f4.AbstractC6585v0.f45260a.post(new java.lang.Runnable() { // from class: f4.I
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(new p055f4.Z0(1, "No consentInformation.").a());
                }
            });
            return;
        }
        if (!c1VarB.d() && c1VarB.a() != L4.c.EnumC0153c.NOT_REQUIRED) {
            p055f4.AbstractC6585v0.f45260a.post(new java.lang.Runnable() { // from class: f4.J
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.a(new p055f4.Z0(3, "No valid response received yet.").a());
                }
            });
            c1VarB.e(activity);
        } else {
            if (c1VarB.a() == L4.c.EnumC0153c.NOT_REQUIRED) {
                p055f4.AbstractC6585v0.f45260a.post(new java.lang.Runnable() { // from class: f4.K
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(new p055f4.Z0(3, "Privacy options form is not required.").a());
                    }
                });
                return;
            }
            L4.b bVar = (L4.b) this.f45072d.get();
            if (bVar == null) {
                p055f4.AbstractC6585v0.f45260a.post(new java.lang.Runnable() { // from class: f4.L
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.a(new p055f4.Z0(3, "Privacy options form is being loading. Please try again later.").a());
                    }
                });
            } else {
                bVar.a(activity, aVar);
                this.f45070b.execute(new java.lang.Runnable() { // from class: f4.M
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f45057C.c();
                    }
                });
            }
        }
    }

    public final boolean f() {
        return this.f45071c.get() != null;
    }
}
