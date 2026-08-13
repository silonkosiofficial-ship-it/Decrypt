package B9;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends androidx.lifecycle.T implements F9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p087i7.InterfaceC6668n f982b = p087i7.AbstractC6669o.b(new p237x7.a() { // from class: B9.e
        @Override // p237x7.a
        public final java.lang.Object b() {
            return B9.f.i();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p040e.w f983c = new B9.f.a();

    public static final class a extends p040e.w {
        a() {
            super(true);
        }

        @Override // p040e.w
        public void c() {
            B9.f.this.c().d();
        }

        @Override // p040e.w
        public void d() {
            B9.f.this.c().e();
        }

        @Override // p040e.w
        public void e(p040e.C6525b c6525b) {
            p247y7.AbstractC7350t.f(c6525b, "backEvent");
            B9.f.this.c().f(c6525b.a());
        }

        @Override // p040e.w
        public void f(p040e.C6525b c6525b) {
            p247y7.AbstractC7350t.f(c6525b, "backEvent");
            B9.f.this.c().h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F9.a i() {
        return new F9.a();
    }

    @Override // F9.b
    public F9.a c() {
        return (F9.a) this.f982b.getValue();
    }

    public final p040e.w j() {
        return this.f983c;
    }
}
