package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class CH implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4785pH f26181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f26182b;

    public CH(com.google.android.gms.internal.ads.C4785pH c4785pH, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f26181a = c4785pH;
        this.f26182b = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        java.util.Set setF = this.f26181a.f((com.google.android.gms.internal.ads.YB) this.f26182b.b());
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(setF);
        return setF;
    }
}
