package M8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k implements M8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f7098a;

    public static final class a extends M8.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final M8.k.a f7099b = new M8.k.a();

        private a() {
            super("must be a member function", null);
        }

        @Override // M8.f
        public boolean a(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
            return interfaceC1443y.m0() != null;
        }
    }

    public static final class b extends M8.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final M8.k.b f7100b = new M8.k.b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // M8.f
        public boolean a(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
            return (interfaceC1443y.m0() == null && interfaceC1443y.v0() == null) ? false : true;
        }
    }

    private k(java.lang.String str) {
        this.f7098a = str;
    }

    public /* synthetic */ k(java.lang.String str, p247y7.AbstractC7342k abstractC7342k) {
        this(str);
    }

    @Override // M8.f
    public java.lang.String b(O7.InterfaceC1443y interfaceC1443y) {
        return M8.f.a.a(this, interfaceC1443y);
    }

    @Override // M8.f
    public java.lang.String getDescription() {
        return this.f7098a;
    }
}
