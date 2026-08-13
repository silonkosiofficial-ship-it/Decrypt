package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class FW implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f27374c;

    public FW(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f27372a = interfaceC5078rz0;
        this.f27373b = interfaceC5078rz1;
        this.f27374c = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.DW((android.content.Context) this.f27372a.b(), (java.util.concurrent.Executor) this.f27373b.b(), (com.google.android.gms.internal.ads.AbstractC4244kM) this.f27374c.b());
    }
}
