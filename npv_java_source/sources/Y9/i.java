package Y9;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final X9.Q f16594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.lang.String f16596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f16597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f16598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f16599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f16600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f16601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f16602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f16603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final java.lang.Long f16604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final java.lang.Long f16605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final java.lang.Long f16606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final java.lang.Integer f16607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final java.lang.Integer f16608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final java.lang.Integer f16609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final java.util.List f16610q;

    public i(X9.Q q6, boolean z6, java.lang.String str, long j6, long j10, long j11, int i6, long j12, int i10, int i11, java.lang.Long l6, java.lang.Long l10, java.lang.Long l11, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        p247y7.AbstractC7350t.f(q6, "canonicalPath");
        p247y7.AbstractC7350t.f(str, "comment");
        this.f16594a = q6;
        this.f16595b = z6;
        this.f16596c = str;
        this.f16597d = j6;
        this.f16598e = j10;
        this.f16599f = j11;
        this.f16600g = i6;
        this.f16601h = j12;
        this.f16602i = i10;
        this.f16603j = i11;
        this.f16604k = l6;
        this.f16605l = l10;
        this.f16606m = l11;
        this.f16607n = num;
        this.f16608o = num2;
        this.f16609p = num3;
        this.f16610q = new java.util.ArrayList();
    }

    public /* synthetic */ i(X9.Q q6, boolean z6, java.lang.String str, long j6, long j10, long j11, int i6, long j12, int i10, int i11, java.lang.Long l6, java.lang.Long l10, java.lang.Long l11, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, int i12, p247y7.AbstractC7342k abstractC7342k) {
        this(q6, (i12 & 2) != 0 ? false : z6, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? -1L : j6, (i12 & 16) != 0 ? -1L : j10, (i12 & 32) != 0 ? -1L : j11, (i12 & 64) != 0 ? -1 : i6, (i12 & 128) == 0 ? j12 : -1L, (i12 & 256) != 0 ? -1 : i10, (i12 & 512) == 0 ? i11 : -1, (i12 & 1024) != 0 ? null : l6, (i12 & 2048) != 0 ? null : l10, (i12 & 4096) != 0 ? null : l11, (i12 & 8192) != 0 ? null : num, (i12 & 16384) != 0 ? null : num2, (i12 & 32768) != 0 ? null : num3);
    }

    public final Y9.i a(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3) {
        return new Y9.i(this.f16594a, this.f16595b, this.f16596c, this.f16597d, this.f16598e, this.f16599f, this.f16600g, this.f16601h, this.f16602i, this.f16603j, this.f16604k, this.f16605l, this.f16606m, num, num2, num3);
    }

    public final X9.Q b() {
        return this.f16594a;
    }

    public final java.util.List c() {
        return this.f16610q;
    }

    public final long d() {
        return this.f16598e;
    }

    public final int e() {
        return this.f16600g;
    }

    public final java.lang.Long f() {
        long jIntValue;
        java.lang.Long l6 = this.f16606m;
        if (l6 != null) {
            jIntValue = Y9.j.d(l6.longValue());
        } else {
            java.lang.Integer num = this.f16609p;
            if (num == null) {
                return null;
            }
            jIntValue = ((long) num.intValue()) * 1000;
        }
        return java.lang.Long.valueOf(jIntValue);
    }

    public final java.lang.Long g() {
        long jIntValue;
        java.lang.Long l6 = this.f16605l;
        if (l6 != null) {
            jIntValue = Y9.j.d(l6.longValue());
        } else {
            java.lang.Integer num = this.f16608o;
            if (num == null) {
                return null;
            }
            jIntValue = ((long) num.intValue()) * 1000;
        }
        return java.lang.Long.valueOf(jIntValue);
    }

    public final java.lang.Long h() {
        long jIntValue;
        java.lang.Long l6 = this.f16604k;
        if (l6 != null) {
            jIntValue = Y9.j.d(l6.longValue());
        } else {
            java.lang.Integer num = this.f16607n;
            if (num == null) {
                int i6 = this.f16603j;
                if (i6 != -1) {
                    return Y9.j.c(this.f16602i, i6);
                }
                return null;
            }
            jIntValue = ((long) num.intValue()) * 1000;
        }
        return java.lang.Long.valueOf(jIntValue);
    }

    public final long i() {
        return this.f16601h;
    }

    public final long j() {
        return this.f16599f;
    }

    public final boolean k() {
        return this.f16595b;
    }
}
