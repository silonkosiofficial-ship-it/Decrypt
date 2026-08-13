package S;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final E7.i f10076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S.P0 f10077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T.k f10078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final S.Q f10079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.String f10080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.String f10081f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.String f10082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.lang.String f10083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.lang.Long f10084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.Long f10085j;

    public L(E7.i iVar, S.P0 p6, T.k kVar, S.Q q6, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l6, java.lang.Long l10) {
        this.f10076a = iVar;
        this.f10077b = p6;
        this.f10078c = kVar;
        this.f10079d = q6;
        this.f10080e = str;
        this.f10081f = str2;
        this.f10082g = str3;
        this.f10083h = str4;
        this.f10084i = l6;
        this.f10085j = l10;
    }

    public /* synthetic */ L(E7.i iVar, S.P0 p6, T.k kVar, S.Q q6, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l6, java.lang.Long l10, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this(iVar, p6, kVar, q6, str, str2, str3, str4, (i6 & 256) != 0 ? null : l6, (i6 & 512) != 0 ? null : l10);
    }

    public final void a(java.lang.Long l6) {
        this.f10084i = l6;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0099  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public final java.lang.String b(T.C1646e c1646e, int i6, java.util.Locale locale) {
        java.lang.String str;
        long jI;
        java.lang.Long l6;
        long jLongValue;
        if (c1646e == null) {
            java.lang.String str2 = this.f10080e;
            java.lang.String upperCase = this.f10078c.b().toUpperCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            str = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{upperCase}, 1));
        } else if (this.f10076a.D(c1646e.m())) {
            S.P0 p6 = this.f10077b;
            if (p6.b(c1646e.m()) && p6.a(c1646e.i())) {
                S.AbstractC1552j0.a aVar = S.AbstractC1552j0.f11204a;
                if (S.AbstractC1552j0.e(i6, aVar.c())) {
                    long jI2 = c1646e.i();
                    java.lang.Long l10 = this.f10085j;
                    if (jI2 < (l10 != null ? l10.longValue() : Long.MAX_VALUE)) {
                        if (S.AbstractC1552j0.e(i6, aVar.a())) {
                            return "";
                        }
                        jI = c1646e.i();
                        l6 = this.f10084i;
                        if (l6 != null) {
                            jLongValue = l6.longValue();
                        } else {
                            jLongValue = Long.MIN_VALUE;
                        }
                        if (jI >= jLongValue) {
                            return "";
                        }
                    }
                } else {
                    if (S.AbstractC1552j0.e(i6, aVar.a())) {
                        return "";
                    }
                    jI = c1646e.i();
                    l6 = this.f10084i;
                    if (l6 != null) {
                        jLongValue = l6.longValue();
                    } else {
                        jLongValue = Long.MIN_VALUE;
                    }
                    if (jI >= jLongValue) {
                        return "";
                    }
                }
                return this.f10083h;
            }
            str = java.lang.String.format(this.f10082g, java.util.Arrays.copyOf(new java.lang.Object[]{S.P.a(this.f10079d, java.lang.Long.valueOf(c1646e.i()), locale, false, 4, null)}, 1));
        } else {
            str = java.lang.String.format(this.f10081f, java.util.Arrays.copyOf(new java.lang.Object[]{S.AbstractC1563p.c(this.f10076a.f(), 0, 0, false, 7, null), S.AbstractC1563p.c(this.f10076a.g(), 0, 0, false, 7, null)}, 2));
        }
        p247y7.AbstractC7350t.e(str, "format(this, *args)");
        return str;
    }
}
