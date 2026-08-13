package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3425cw implements com.google.android.gms.internal.ads.K60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f34598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f34599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f34600c;

    /* synthetic */ C3425cw(com.google.android.gms.internal.ads.C2331Ev c2331Ev, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f34598a = c2331Ev;
    }

    @Override // com.google.android.gms.internal.ads.K60
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.K60 a(android.content.Context context) {
        context.getClass();
        this.f34599b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.K60
    public final com.google.android.gms.internal.ads.L60 c() {
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f34599b, android.content.Context.class);
        return new com.google.android.gms.internal.ads.C3534dw(this.f34598a, this.f34599b, this.f34600c, null);
    }

    @Override // com.google.android.gms.internal.ads.K60
    public final /* synthetic */ com.google.android.gms.internal.ads.K60 o(java.lang.String str) {
        this.f34600c = str;
        return this;
    }
}
