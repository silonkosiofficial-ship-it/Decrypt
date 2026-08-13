package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class JU implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f28695b;

    public JU(com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz1) {
        this.f28694a = interfaceC5078rz0;
        this.f28695b = interfaceC5078rz1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.ads.IU b() {
        return new com.google.android.gms.internal.ads.IU((android.content.Context) this.f28694a.b(), (com.google.android.gms.internal.ads.AbstractC5517vz) this.f28695b.b());
    }
}
