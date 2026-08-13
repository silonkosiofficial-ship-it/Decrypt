package p058f8;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f8.e.a f45310e = new f8.e.a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p058f8.e f45311f = new p058f8.e(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p058f8.h f45312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p058f8.f f45313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f45314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f45315d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p058f8.e a() {
            return p058f8.e.f45311f;
        }
    }

    public e(p058f8.h hVar, p058f8.f fVar, boolean z6, boolean z10) {
        this.f45312a = hVar;
        this.f45313b = fVar;
        this.f45314c = z6;
        this.f45315d = z10;
    }

    public /* synthetic */ e(p058f8.h hVar, p058f8.f fVar, boolean z6, boolean z10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(hVar, fVar, z6, (i6 & 8) != 0 ? false : z10);
    }

    public final boolean b() {
        return this.f45314c;
    }

    public final p058f8.f c() {
        return this.f45313b;
    }

    public final p058f8.h d() {
        return this.f45312a;
    }

    public final boolean e() {
        return this.f45315d;
    }
}
