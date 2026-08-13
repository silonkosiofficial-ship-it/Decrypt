package X9;

/* JADX INFO: renamed from: X9.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1842j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X9.Q f16169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.lang.Long f16170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final java.lang.Long f16171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.lang.Long f16172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.lang.Long f16173g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.Map f16174h;

    public C1842j(boolean z6, boolean z10, X9.Q q6, java.lang.Long l6, java.lang.Long l10, java.lang.Long l11, java.lang.Long l12, java.util.Map map) {
        p247y7.AbstractC7350t.f(map, "extras");
        this.f16167a = z6;
        this.f16168b = z10;
        this.f16169c = q6;
        this.f16170d = l6;
        this.f16171e = l10;
        this.f16172f = l11;
        this.f16173g = l12;
        this.f16174h = p097j7.S.s(map);
    }

    public /* synthetic */ C1842j(boolean z6, boolean z10, X9.Q q6, java.lang.Long l6, java.lang.Long l10, java.lang.Long l11, java.lang.Long l12, java.util.Map map, int i6, p247y7.AbstractC7342k abstractC7342k) {
        this((i6 & 1) != 0 ? false : z6, (i6 & 2) == 0 ? z10 : false, (i6 & 4) != 0 ? null : q6, (i6 & 8) != 0 ? null : l6, (i6 & 16) != 0 ? null : l10, (i6 & 32) != 0 ? null : l11, (i6 & 64) == 0 ? l12 : null, (i6 & 128) != 0 ? p097j7.S.h() : map);
    }

    public final boolean a() {
        return this.f16168b;
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.f16167a) {
            arrayList.add("isRegularFile");
        }
        if (this.f16168b) {
            arrayList.add("isDirectory");
        }
        if (this.f16170d != null) {
            arrayList.add("byteCount=" + this.f16170d);
        }
        if (this.f16171e != null) {
            arrayList.add("createdAt=" + this.f16171e);
        }
        if (this.f16172f != null) {
            arrayList.add("lastModifiedAt=" + this.f16172f);
        }
        if (this.f16173g != null) {
            arrayList.add("lastAccessedAt=" + this.f16173g);
        }
        if (!this.f16174h.isEmpty()) {
            arrayList.add("extras=" + this.f16174h);
        }
        return p097j7.AbstractC6879v.r0(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }
}
