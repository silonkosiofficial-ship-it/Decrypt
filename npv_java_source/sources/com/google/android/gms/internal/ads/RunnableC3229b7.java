package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC3229b7 implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ java.lang.String f34230C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ long f34231D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.AbstractC3448d7 f34232E;

    RunnableC3229b7(com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7, java.lang.String str, long j6) {
        this.f34230C = str;
        this.f34231D = j6;
        this.f34232E = abstractC3448d7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f34232E.f34638C.a(this.f34230C, this.f34231D);
        com.google.android.gms.internal.ads.AbstractC3448d7 abstractC3448d7 = this.f34232E;
        abstractC3448d7.f34638C.b(abstractC3448d7.toString());
    }
}
