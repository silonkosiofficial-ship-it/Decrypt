package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class S30 implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f31530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f31531b;

    public S30(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f31530a = interfaceC5078rz1;
        this.f31531b = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.Q30(com.google.android.gms.internal.ads.C2775Qw.a(), (java.util.concurrent.ScheduledExecutorService) this.f31530a.b(), ((com.google.android.gms.internal.ads.C3204av) this.f31531b).a());
    }
}
