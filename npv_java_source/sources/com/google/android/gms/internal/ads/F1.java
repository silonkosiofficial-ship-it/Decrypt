package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
abstract class F1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.google.android.gms.internal.ads.InterfaceC3107a1 f27269a;

    protected F1(com.google.android.gms.internal.ads.InterfaceC3107a1 interfaceC3107a1) {
        this.f27269a = interfaceC3107a1;
    }

    protected abstract boolean a(com.google.android.gms.internal.ads.C5128sR c5128sR);

    protected abstract boolean b(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6);

    public final boolean c(com.google.android.gms.internal.ads.C5128sR c5128sR, long j6) {
        return a(c5128sR) && b(c5128sR, j6);
    }
}
