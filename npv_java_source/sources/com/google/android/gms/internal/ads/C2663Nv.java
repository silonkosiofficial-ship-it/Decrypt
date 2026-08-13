package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2663Nv implements com.google.android.gms.internal.ads.InterfaceC3226b50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f30409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f30410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f30411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private p184s3.c2 f30412d;

    /* synthetic */ C2663Nv(com.google.android.gms.internal.ads.C2331Ev c2331Ev, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f30409a = c2331Ev;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3226b50
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3226b50 a(android.content.Context context) {
        context.getClass();
        this.f30410b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3226b50
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3226b50 b(p184s3.c2 c2Var) {
        c2Var.getClass();
        this.f30412d = c2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3226b50
    public final com.google.android.gms.internal.ads.InterfaceC3335c50 f() {
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f30410b, android.content.Context.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f30411c, java.lang.String.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f30412d, p184s3.c2.class);
        return new com.google.android.gms.internal.ads.C2700Ov(this.f30409a, this.f30410b, this.f30411c, this.f30412d, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3226b50
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.InterfaceC3226b50 y(java.lang.String str) {
        str.getClass();
        this.f30411c = str;
        return this;
    }
}
