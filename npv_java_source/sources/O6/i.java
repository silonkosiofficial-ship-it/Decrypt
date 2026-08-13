package O6;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends p007a7.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O6.i.a f8098g = new O6.i.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p007a7.i f8099h = new p007a7.i("Before");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p007a7.i f8100i = new p007a7.i("State");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p007a7.i f8101j = new p007a7.i("Monitoring");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p007a7.i f8102k = new p007a7.i("Engine");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p007a7.i f8103l = new p007a7.i("Receive");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8104f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p007a7.i a() {
            return O6.i.f8102k;
        }

        public final p007a7.i b() {
            return O6.i.f8103l;
        }
    }

    public i(boolean z6) {
        super(f8099h, f8100i, f8101j, f8102k, f8103l);
        this.f8104f = z6;
    }

    public /* synthetic */ i(boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? true : z6);
    }

    @Override // p007a7.d
    public boolean g() {
        return this.f8104f;
    }
}
