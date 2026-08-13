package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.v20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5415v20 implements com.google.android.gms.internal.ads.L20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4840pq f39311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Yk0 f39312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.Context f39313c;

    public C5415v20(com.google.android.gms.internal.ads.C4840pq c4840pq, com.google.android.gms.internal.ads.Yk0 yk0, android.content.Context context) {
        this.f39311a = c4840pq;
        this.f39312b = yk0;
        this.f39313c = context;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final int a() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.L20
    public final P4.d b() {
        return this.f39312b.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.u20
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f39081a.c();
            }
        });
    }

    final /* synthetic */ com.google.android.gms.internal.ads.C5525w20 c() {
        if (!this.f39311a.p(this.f39313c)) {
            return new com.google.android.gms.internal.ads.C5525w20(null, null, null, null, null);
        }
        java.lang.String strD = this.f39311a.d(this.f39313c);
        java.lang.String str = strD == null ? "" : strD;
        java.lang.String strB = this.f39311a.b(this.f39313c);
        java.lang.String str2 = strB == null ? "" : strB;
        java.lang.String strA = this.f39311a.a(this.f39313c);
        java.lang.String str3 = strA == null ? "" : strA;
        java.lang.Long l6 = null;
        java.lang.String str4 = true != this.f39311a.p(this.f39313c) ? null : "fa";
        if ("TIME_OUT".equals(str2)) {
            l6 = (java.lang.Long) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25692t0);
        }
        return new com.google.android.gms.internal.ads.C5525w20(str, str2, str3, str4 == null ? "" : str4, l6);
    }
}
