package Q6;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends p007a7.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Q6.b.a f9086g = new Q6.b.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p007a7.i f9087h = new p007a7.i("Before");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p007a7.i f9088i = new p007a7.i("State");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p007a7.i f9089j = new p007a7.i("After");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9090f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p007a7.i a() {
            return Q6.b.f9089j;
        }

        public final p007a7.i b() {
            return Q6.b.f9087h;
        }
    }

    public b(boolean z6) {
        super(f9087h, f9088i, f9089j);
        this.f9090f = z6;
    }

    public /* synthetic */ b(boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? true : z6);
    }

    @Override // p007a7.d
    public boolean g() {
        return this.f9090f;
    }
}
