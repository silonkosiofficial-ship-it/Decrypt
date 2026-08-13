package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Aa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2152Aa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p224w3.y f25190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p224w3.v f25191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.Zk0 f25192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2189Ba0 f25193d;

    public C2152Aa0(p224w3.y yVar, p224w3.v vVar, com.google.android.gms.internal.ads.Zk0 zk0, com.google.android.gms.internal.ads.C2189Ba0 c2189Ba0) {
        this.f25190a = yVar;
        this.f25191b = vVar;
        this.f25192c = zk0;
        this.f25193d = c2189Ba0;
    }

    private final P4.d e(final java.lang.String str, final long j6, final int i6) {
        final java.lang.String str2;
        p224w3.u uVar;
        p224w3.y yVar = this.f25190a;
        if (i6 > yVar.c()) {
            com.google.android.gms.internal.ads.C2189Ba0 c2189Ba0 = this.f25193d;
            if (c2189Ba0 == null || !yVar.d()) {
                uVar = p224w3.u.RETRIABLE_FAILURE;
            } else {
                c2189Ba0.a(str, "", 2);
                uVar = p224w3.u.BUFFERED;
            }
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(uVar);
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25729w8)).booleanValue()) {
            android.net.Uri uri = android.net.Uri.parse(str);
            java.lang.String encodedQuery = uri.getEncodedQuery();
            android.net.Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", java.lang.Integer.toString(i6));
            str2 = java.lang.String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
        } else {
            str2 = str;
        }
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.n(j6 == 0 ? this.f25192c.H0(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.ya0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f40104a.a(str2);
            }
        }) : this.f25192c.schedule(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.xa0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return this.f39889a.b(str2);
            }
        }, j6, java.util.concurrent.TimeUnit.MILLISECONDS), new com.google.android.gms.internal.ads.InterfaceC5268tk0() { // from class: com.google.android.gms.internal.ads.za0
            @Override // com.google.android.gms.internal.ads.InterfaceC5268tk0
            public final P4.d b(java.lang.Object obj) {
                return this.f40332a.c(i6, j6, str, (p224w3.u) obj);
            }
        }, this.f25192c);
    }

    final /* synthetic */ p224w3.u a(java.lang.String str) {
        return this.f25191b.o(str);
    }

    final /* synthetic */ p224w3.u b(java.lang.String str) {
        return this.f25191b.o(str);
    }

    final /* synthetic */ P4.d c(int i6, long j6, java.lang.String str, p224w3.u uVar) {
        if (uVar != p224w3.u.RETRIABLE_FAILURE) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(uVar);
        }
        p224w3.y yVar = this.f25190a;
        long jB = yVar.b();
        if (i6 != 1) {
            jB = (long) (yVar.a() * j6);
        }
        return e(str, jB, i6 + 1);
    }

    public final P4.d d(java.lang.String str) {
        try {
            return e(str, 0L, 1);
        } catch (java.lang.NullPointerException | java.util.concurrent.RejectedExecutionException unused) {
            return com.google.android.gms.internal.ads.AbstractC2652Nk0.h(p224w3.u.PERMANENT_FAILURE);
        }
    }
}
