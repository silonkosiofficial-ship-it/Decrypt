package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Iv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2479Iv implements com.google.android.gms.internal.ads.InterfaceC4320l40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f28526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f28527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private java.lang.String f28528c;

    /* synthetic */ C2479Iv(com.google.android.gms.internal.ads.C2331Ev c2331Ev, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f28526a = c2331Ev;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4320l40
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4320l40 a(android.content.Context context) {
        context.getClass();
        this.f28527b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4320l40
    public final com.google.android.gms.internal.ads.InterfaceC4430m40 c() {
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f28527b, android.content.Context.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f28528c, java.lang.String.class);
        return new com.google.android.gms.internal.ads.C2516Jv(this.f28526a, this.f28527b, this.f28528c, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4320l40
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4320l40 o(java.lang.String str) {
        str.getClass();
        this.f28528c = str;
        return this;
    }
}
