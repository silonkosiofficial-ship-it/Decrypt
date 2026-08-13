package p134n3;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f51472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f51473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f51474c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f51475d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f51476e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p104k3.x f51477f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f51478g;

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p104k3.x f51483e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f51479a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f51480b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51481c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f51482d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f51484f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f51485g = false;

        public p134n3.e a() {
            return new p134n3.e(this, null);
        }

        public n3.e.a b(int i6) {
            this.f51484f = i6;
            return this;
        }

        public n3.e.a c(int i6) {
            this.f51480b = i6;
            return this;
        }

        public n3.e.a d(int i6) {
            this.f51481c = i6;
            return this;
        }

        public n3.e.a e(boolean z6) {
            this.f51485g = z6;
            return this;
        }

        public n3.e.a f(boolean z6) {
            this.f51482d = z6;
            return this;
        }

        public n3.e.a g(boolean z6) {
            this.f51479a = z6;
            return this;
        }

        public n3.e.a h(p104k3.x xVar) {
            this.f51483e = xVar;
            return this;
        }
    }

    /* synthetic */ e(n3.e.a aVar, p134n3.j jVar) {
        this.f51472a = aVar.f51479a;
        this.f51473b = aVar.f51480b;
        this.f51474c = aVar.f51481c;
        this.f51475d = aVar.f51482d;
        this.f51476e = aVar.f51484f;
        this.f51477f = aVar.f51483e;
        this.f51478g = aVar.f51485g;
    }

    public int a() {
        return this.f51476e;
    }

    public int b() {
        return this.f51473b;
    }

    public int c() {
        return this.f51474c;
    }

    public p104k3.x d() {
        return this.f51477f;
    }

    public boolean e() {
        return this.f51475d;
    }

    public boolean f() {
        return this.f51472a;
    }

    public final boolean g() {
        return this.f51478g;
    }
}
