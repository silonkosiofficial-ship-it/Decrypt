package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class SQ implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f31691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f31692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f31693c;

    public SQ(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz3, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz4) {
        this.f31691a = interfaceC5078rz0;
        this.f31692b = interfaceC5078rz3;
        this.f31693c = interfaceC5078rz4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.QQ b() {
        return new com.google.android.gms.internal.ads.QQ((java.util.concurrent.ScheduledExecutorService) this.f31691a.b(), com.google.android.gms.internal.ads.O80.c(), com.google.android.gms.internal.ads.U80.c(), ((com.google.android.gms.internal.ads.C4579nR) this.f31692b).b(), com.google.android.gms.internal.ads.Zy0.a(com.google.android.gms.internal.ads.AbstractC4529mz0.a(this.f31693c)));
    }
}
