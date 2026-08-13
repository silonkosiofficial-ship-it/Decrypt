package M8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t implements M8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f7176a;

    public static final class a extends M8.t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7177b;

        public a(int i6) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append("must have at least ");
            sb.append(i6);
            sb.append(" value parameter");
            sb.append(i6 > 1 ? "s" : "");
            super(sb.toString(), null);
            this.f7177b = i6;
        }

        @Override // M8.f
        public boolean a(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
            return interfaceC1443y.n().size() >= this.f7177b;
        }
    }

    public static final class b extends M8.t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7178b;

        public b(int i6) {
            super("must have exactly " + i6 + " value parameters", null);
            this.f7178b = i6;
        }

        @Override // M8.f
        public boolean a(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
            return interfaceC1443y.n().size() == this.f7178b;
        }
    }

    public static final class c extends M8.t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final M8.t.c f7179b = new M8.t.c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // M8.f
        public boolean a(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
            return interfaceC1443y.n().isEmpty();
        }
    }

    public static final class d extends M8.t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final M8.t.d f7180b = new M8.t.d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // M8.f
        public boolean a(O7.InterfaceC1443y interfaceC1443y) {
            p247y7.AbstractC7350t.f(interfaceC1443y, "functionDescriptor");
            return interfaceC1443y.n().size() == 1;
        }
    }

    private t(java.lang.String str) {
        this.f7176a = str;
    }

    public /* synthetic */ t(java.lang.String str, p247y7.AbstractC7342k abstractC7342k) {
        this(str);
    }

    @Override // M8.f
    public java.lang.String b(O7.InterfaceC1443y interfaceC1443y) {
        return M8.f.a.a(this, interfaceC1443y);
    }

    @Override // M8.f
    public java.lang.String getDescription() {
        return this.f7176a;
    }
}
