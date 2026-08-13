package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3497dd extends com.google.android.gms.internal.ads.C4512mr {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4264kd f34761D;

    C3497dd(com.google.android.gms.internal.ads.C4264kd c4264kd) {
        this.f34761D = c4264kd;
    }

    @Override // com.google.android.gms.internal.ads.C4512mr, java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        com.google.android.gms.internal.ads.C4264kd.e(this.f34761D);
        return super.cancel(z6);
    }
}
