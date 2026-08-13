package p073h2;

/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h2.E.a f45908g = new h2.E.a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f45912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f45914f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    public E(int i6, int i10, boolean z6, int i11, int i12, int i13) {
        this.f45909a = i6;
        this.f45910b = i10;
        this.f45911c = z6;
        this.f45912d = i11;
        this.f45913e = i12;
        this.f45914f = i13;
        if (!z6 && i10 == 0) {
            throw new java.lang.IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in PagingData, so either placeholders must be enabled, or prefetch distance must be > 0.");
        }
        if (i12 == Integer.MAX_VALUE || i12 >= (i10 * 2) + i6) {
            if (i13 != Integer.MIN_VALUE && i13 <= 0) {
                throw new java.lang.IllegalArgumentException("jumpThreshold must be positive to enable jumps or COUNT_UNDEFINED to disable jumping.".toString());
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + i6 + ", prefetchDist=" + i10 + ", maxSize=" + i12);
    }

    public /* synthetic */ E(int i6, int i10, boolean z6, int i11, int i12, int i13, int i14, p247y7.AbstractC7342k abstractC7342k) {
        this(i6, (i14 & 2) != 0 ? i6 : i10, (i14 & 4) != 0 ? true : z6, (i14 & 8) != 0 ? i6 * 3 : i11, (i14 & 16) != 0 ? Integer.MAX_VALUE : i12, (i14 & 32) != 0 ? Integer.MIN_VALUE : i13);
    }
}
