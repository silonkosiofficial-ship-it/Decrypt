package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Hl0 implements com.google.android.gms.internal.ads.InterfaceC2683Oh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f28106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC2683Oh0 f28107b;

    public Hl0(android.content.Context context) {
        com.google.android.gms.internal.ads.Jm0 jm0 = new com.google.android.gms.internal.ads.Jm0();
        this.f28106a = context.getApplicationContext();
        this.f28107b = jm0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2683Oh0
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.InterfaceC4825pi0 a() {
        return new com.google.android.gms.internal.ads.C4064im0(this.f28106a, this.f28107b.a());
    }
}
