package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5432vB implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f39358b;

    public C5432vB(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f39357a = interfaceC5078rz0;
        this.f39358b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.EG((com.google.android.gms.internal.ads.TE) this.f39357a.b(), (java.util.concurrent.Executor) this.f39358b.b());
    }
}
