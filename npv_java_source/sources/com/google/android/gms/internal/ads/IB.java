package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class IB implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28421b;

    public IB(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f28420a = interfaceC5078rz0;
        this.f28421b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.EG((com.google.android.gms.internal.ads.TE) this.f28420a.b(), (java.util.concurrent.Executor) this.f28421b.b());
    }
}
