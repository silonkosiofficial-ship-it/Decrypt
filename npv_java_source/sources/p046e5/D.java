package p046e5;

/* JADX INFO: loaded from: classes3.dex */
class D implements F5.b, F5.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final F5.a.InterfaceC0063a f44675c = new F5.a.InterfaceC0063a() { // from class: e5.A
        @Override // F5.a.InterfaceC0063a
        public final void a(F5.b bVar) {
            p046e5.D.f(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final F5.b f44676d = new F5.b() { // from class: e5.B
        @Override // F5.b
        public final java.lang.Object get() {
            return p046e5.D.g();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private F5.a.InterfaceC0063a f44677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile F5.b f44678b;

    private D(F5.a.InterfaceC0063a interfaceC0063a, F5.b bVar) {
        this.f44677a = interfaceC0063a;
        this.f44678b = bVar;
    }

    static p046e5.D e() {
        return new p046e5.D(f44675c, f44676d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(F5.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(F5.a.InterfaceC0063a interfaceC0063a, F5.a.InterfaceC0063a interfaceC0063a2, F5.b bVar) {
        interfaceC0063a.a(bVar);
        interfaceC0063a2.a(bVar);
    }

    static p046e5.D i(F5.b bVar) {
        return new p046e5.D(null, bVar);
    }

    @Override // F5.a
    public void a(final F5.a.InterfaceC0063a interfaceC0063a) {
        F5.b bVar;
        F5.b bVar2;
        F5.b bVar3 = this.f44678b;
        F5.b bVar4 = f44676d;
        if (bVar3 != bVar4) {
            interfaceC0063a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f44678b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final F5.a.InterfaceC0063a interfaceC0063a2 = this.f44677a;
                this.f44677a = new F5.a.InterfaceC0063a() { // from class: e5.C
                    @Override // F5.a.InterfaceC0063a
                    public final void a(F5.b bVar5) {
                        p046e5.D.h(interfaceC0063a2, interfaceC0063a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0063a.a(bVar);
        }
    }

    @Override // F5.b
    public java.lang.Object get() {
        return this.f44678b.get();
    }

    void j(F5.b bVar) {
        F5.a.InterfaceC0063a interfaceC0063a;
        if (this.f44678b != f44676d) {
            throw new java.lang.IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0063a = this.f44677a;
            this.f44677a = null;
            this.f44678b = bVar;
        }
        interfaceC0063a.a(bVar);
    }
}
