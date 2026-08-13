package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h2.F.d f45915e = new h2.F.d(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p073h2.X f45916f = new h2.F.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final p073h2.InterfaceC6638o f45917g = new h2.F.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Z8.InterfaceC1869f f45918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p073h2.X f45919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p073h2.InterfaceC6638o f45920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p237x7.a f45921d;

    static final class a extends p247y7.AbstractC7352v implements p237x7.a {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final h2.F.a f45922D = new h2.F.a();

        a() {
            super(0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final java.lang.Void b() {
            return null;
        }
    }

    public static final class b implements p073h2.InterfaceC6638o {
        b() {
        }

        @Override // p073h2.InterfaceC6638o
        public void a(p073h2.Z z6) {
            p247y7.AbstractC7350t.f(z6, "viewportHint");
        }
    }

    public static final class c implements p073h2.X {
        c() {
        }
    }

    public static final class d {
        private d() {
        }

        public /* synthetic */ d(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public F(Z8.InterfaceC1869f interfaceC1869f, p073h2.X x6, p073h2.InterfaceC6638o interfaceC6638o, p237x7.a aVar) {
        p247y7.AbstractC7350t.f(interfaceC1869f, "flow");
        p247y7.AbstractC7350t.f(x6, "uiReceiver");
        p247y7.AbstractC7350t.f(interfaceC6638o, "hintReceiver");
        p247y7.AbstractC7350t.f(aVar, "cachedPageEvent");
        this.f45918a = interfaceC1869f;
        this.f45919b = x6;
        this.f45920c = interfaceC6638o;
        this.f45921d = aVar;
    }

    public /* synthetic */ F(Z8.InterfaceC1869f interfaceC1869f, p073h2.X x6, p073h2.InterfaceC6638o interfaceC6638o, p237x7.a aVar, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(interfaceC1869f, x6, interfaceC6638o, (i6 & 8) != 0 ? h2.F.a.f45922D : aVar);
    }

    public final p073h2.AbstractC6646x.b a() {
        return (p073h2.AbstractC6646x.b) this.f45921d.b();
    }

    public final Z8.InterfaceC1869f b() {
        return this.f45918a;
    }

    public final p073h2.InterfaceC6638o c() {
        return this.f45920c;
    }

    public final p073h2.X d() {
        return this.f45919b;
    }
}
