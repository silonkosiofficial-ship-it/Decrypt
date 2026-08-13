package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6121s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.String f41188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final android.net.Uri f41189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.lang.String f41190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final java.lang.String f41191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f41192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f41193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f41194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f41195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final M4.c f41196i;

    public C6121s3(android.net.Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private C6121s3(java.lang.String str, android.net.Uri uri, java.lang.String str2, java.lang.String str3, boolean z6, boolean z10, boolean z11, boolean z12, M4.c cVar) {
        this.f41188a = str;
        this.f41189b = uri;
        this.f41190c = str2;
        this.f41191d = str3;
        this.f41192e = z6;
        this.f41193f = z10;
        this.f41194g = z11;
        this.f41195h = z12;
        this.f41196i = cVar;
    }

    public final com.google.android.gms.internal.measurement.AbstractC6053k3 a(java.lang.String str, double d6) {
        return com.google.android.gms.internal.measurement.AbstractC6053k3.c(this, str, java.lang.Double.valueOf(-3.0d), true);
    }

    public final com.google.android.gms.internal.measurement.AbstractC6053k3 b(java.lang.String str, long j6) {
        return com.google.android.gms.internal.measurement.AbstractC6053k3.d(this, str, java.lang.Long.valueOf(j6), true);
    }

    public final com.google.android.gms.internal.measurement.AbstractC6053k3 c(java.lang.String str, java.lang.String str2) {
        return com.google.android.gms.internal.measurement.AbstractC6053k3.e(this, str, str2, true);
    }

    public final com.google.android.gms.internal.measurement.AbstractC6053k3 d(java.lang.String str, boolean z6) {
        return com.google.android.gms.internal.measurement.AbstractC6053k3.b(this, str, java.lang.Boolean.valueOf(z6), true);
    }

    public final com.google.android.gms.internal.measurement.C6121s3 e() {
        return new com.google.android.gms.internal.measurement.C6121s3(this.f41188a, this.f41189b, this.f41190c, this.f41191d, this.f41192e, this.f41193f, true, this.f41195h, this.f41196i);
    }

    public final com.google.android.gms.internal.measurement.C6121s3 f() {
        if (!this.f41190c.isEmpty()) {
            throw new java.lang.IllegalStateException("Cannot set GServices prefix and skip GServices");
        }
        M4.c cVar = this.f41196i;
        if (cVar == null) {
            return new com.google.android.gms.internal.measurement.C6121s3(this.f41188a, this.f41189b, this.f41190c, this.f41191d, true, this.f41193f, this.f41194g, this.f41195h, cVar);
        }
        throw new java.lang.IllegalStateException("Cannot skip gservices both always and conditionally");
    }
}
