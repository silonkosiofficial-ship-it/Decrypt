package O6;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends p007a7.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O6.g.a f8084g = new O6.g.a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final p007a7.i f8085h = new p007a7.i("Before");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final p007a7.i f8086i = new p007a7.i("State");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final p007a7.i f8087j = new p007a7.i("Transform");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final p007a7.i f8088k = new p007a7.i("Render");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final p007a7.i f8089l = new p007a7.i("Send");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f8090f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p007a7.i a() {
            return O6.g.f8085h;
        }

        public final p007a7.i b() {
            return O6.g.f8088k;
        }

        public final p007a7.i c() {
            return O6.g.f8089l;
        }
    }

    public g(boolean z6) {
        super(f8085h, f8086i, f8087j, f8088k, f8089l);
        this.f8090f = z6;
    }

    public /* synthetic */ g(boolean z6, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? true : z6);
    }

    @Override // p007a7.d
    public boolean g() {
        return this.f8090f;
    }
}
