package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.pC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4775pC implements com.google.android.gms.internal.ads.InterfaceC3213az0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C4555nC f37950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.InterfaceC5078rz0 f37951b;

    public C4775pC(com.google.android.gms.internal.ads.C4555nC c4555nC, com.google.android.gms.internal.ads.InterfaceC5078rz0 interfaceC5078rz0) {
        this.f37950a = c4555nC;
        this.f37951b = interfaceC5078rz0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078rz0
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        android.content.Context contextB = this.f37950a.b(((com.google.android.gms.internal.ads.C3204av) this.f37951b).a());
        com.google.android.gms.internal.ads.AbstractC4089iz0.b(contextB);
        return contextB;
    }
}
