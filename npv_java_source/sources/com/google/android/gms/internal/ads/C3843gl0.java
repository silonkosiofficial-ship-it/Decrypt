package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.gl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3843gl0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f35674h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.net.Uri f35675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f35676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f35677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f35678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f35679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f35680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f35681g;

    static {
        com.google.android.gms.internal.ads.AbstractC4986r8.b("media3.datasource");
    }

    private C3843gl0(android.net.Uri uri, long j6, int i6, byte[] bArr, java.util.Map map, long j10, long j11, java.lang.String str, int i10, java.lang.Object obj) {
        boolean z6 = false;
        boolean z10 = j10 >= 0;
        com.google.android.gms.internal.ads.LC.d(z10);
        com.google.android.gms.internal.ads.LC.d(z10);
        if (j11 > 0) {
            z6 = true;
        } else if (j11 == -1) {
            j11 = -1;
            z6 = true;
        }
        com.google.android.gms.internal.ads.LC.d(z6);
        uri.getClass();
        this.f35675a = uri;
        this.f35676b = 1;
        this.f35677c = null;
        this.f35678d = j$.util.DesugarCollections.unmodifiableMap(new java.util.HashMap(map));
        this.f35679e = j10;
        this.f35680f = j11;
        this.f35681g = i10;
    }

    public C3843gl0(android.net.Uri uri, long j6, long j10, java.lang.String str) {
        this(uri, 0L, 1, null, java.util.Collections.emptyMap(), j6, j10, null, 0, null);
    }

    public final com.google.android.gms.internal.ads.C3621ek0 a() {
        return new com.google.android.gms.internal.ads.C3621ek0(this, null);
    }

    public final boolean b(int i6) {
        return (this.f35681g & i6) == i6;
    }

    public final java.lang.String toString() {
        return "DataSpec[GET " + this.f35675a.toString() + ", " + this.f35679e + ", " + this.f35680f + ", null, " + this.f35681g + "]";
    }
}
