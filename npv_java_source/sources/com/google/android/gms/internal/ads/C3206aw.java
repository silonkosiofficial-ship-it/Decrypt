package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3206aw implements com.google.android.gms.internal.ads.T50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f34174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f34175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f34176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p184s3.c2 f34177d;

    /* synthetic */ C3206aw(com.google.android.gms.internal.ads.C2331Ev c2331Ev, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f34174a = c2331Ev;
    }

    @Override // com.google.android.gms.internal.ads.T50
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.T50 a(android.content.Context context) {
        context.getClass();
        this.f34175b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.T50
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.T50 b(p184s3.c2 c2Var) {
        c2Var.getClass();
        this.f34177d = c2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.T50
    public final com.google.android.gms.internal.ads.U50 f() {
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f34175b, android.content.Context.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f34176c, java.lang.String.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f34177d, p184s3.c2.class);
        return new com.google.android.gms.internal.ads.C3316bw(this.f34174a, this.f34175b, this.f34176c, this.f34177d, null);
    }

    @Override // com.google.android.gms.internal.ads.T50
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.T50 y(java.lang.String str) {
        str.getClass();
        this.f34176c = str;
        return this;
    }
}
