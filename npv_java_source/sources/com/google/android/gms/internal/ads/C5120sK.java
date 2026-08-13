package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.sK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5120sK implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f38717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f38718b;

    public C5120sK(com.google.android.gms.internal.ads.C4351lK c4351lK, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f38717a = interfaceC5078rz0;
        this.f38718b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.EG(((com.google.android.gms.internal.ads.C3148aM) this.f38717a).b(), (java.util.concurrent.Executor) this.f38718b.b());
    }
}
