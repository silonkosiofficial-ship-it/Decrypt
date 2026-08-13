package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2919Uv implements com.google.android.gms.internal.ads.RO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C2331Ev f32299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.content.Context f32300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.internal.ads.InterfaceC2465Ij f32301c;

    /* synthetic */ C2919Uv(com.google.android.gms.internal.ads.C2331Ev c2331Ev, com.google.android.gms.internal.ads.AbstractC4302kw abstractC4302kw) {
        this.f32299a = c2331Ev;
    }

    @Override // com.google.android.gms.internal.ads.RO
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.RO a(android.content.Context context) {
        context.getClass();
        this.f32300b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.RO
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.RO b(com.google.android.gms.internal.ads.InterfaceC2465Ij interfaceC2465Ij) {
        interfaceC2465Ij.getClass();
        this.f32301c = interfaceC2465Ij;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.RO
    public final com.google.android.gms.internal.ads.SO c() {
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f32300b, android.content.Context.class);
        com.google.android.gms.internal.ads.AbstractC4089iz0.c(this.f32301c, com.google.android.gms.internal.ads.InterfaceC2465Ij.class);
        return new com.google.android.gms.internal.ads.C2955Vv(this.f32299a, this.f32300b, this.f32301c, null);
    }
}
