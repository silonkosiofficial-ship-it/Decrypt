package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5466vZ implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39405c;

    public C5466vZ(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3) {
        this.f39403a = interfaceC5078rz0;
        this.f39404b = interfaceC5078rz1;
        this.f39405c = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.C5246tZ(((com.google.android.gms.internal.ads.C3204av) this.f39403a).a(), (com.google.android.gms.internal.ads.C2914Uq) this.f39404b.b(), (java.util.concurrent.ScheduledExecutorService) this.f39405c.b(), com.google.android.gms.internal.ads.O80.c());
    }
}
