package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends p007a7.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Q6.f.a f9096g = new Q6.f.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p007a7.i f9097h = new p007a7.i("Receive");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p007a7.i f9098i = new p007a7.i("Parse");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p007a7.i f9099j = new p007a7.i("Transform");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p007a7.i f9100k = new p007a7.i("State");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p007a7.i f9101l = new p007a7.i("After");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9102f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p007a7.i a() {
            return Q6.f.f9098i;
        }

        public final p007a7.i b() {
            return Q6.f.f9097h;
        }

        public final p007a7.i c() {
            return Q6.f.f9099j;
        }
    }

    public f(boolean z6) {
        super(f9097h, f9098i, f9099j, f9100k, f9101l);
        this.f9102f = z6;
    }

    public /* synthetic */ f(boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? true : z6);
    }

    @Override // p007a7.d
    public boolean g() {
        return this.f9102f;
    }
}
