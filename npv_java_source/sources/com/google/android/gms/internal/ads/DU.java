package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class DU implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26707c;

    public DU(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz2) {
        this.f26705a = interfaceC5078rz0;
        this.f26706b = interfaceC5078rz1;
        this.f26707c = interfaceC5078rz2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        return new com.google.android.gms.internal.ads.CU((android.content.Context) this.f26705a.b(), (com.google.android.gms.internal.ads.AbstractC5517vz) this.f26706b.b(), (java.util.concurrent.Executor) this.f26707c.b());
    }
}
