package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC2548Kq implements java.lang.Runnable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    final /* synthetic */ android.content.Context f29012C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f29013D;

    RunnableC2548Kq(com.google.android.gms.internal.ads.C2585Lq c2585Lq, android.content.Context context, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f29012C = context;
        this.f29013D = c4512mr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f29013D.c(p144o3.a.a(this.f29012C));
        } catch (N3.C1396i | java.io.IOException | java.lang.IllegalStateException e6) {
            this.f29013D.d(e6);
            p224w3.p.e("Exception while getting advertising Id info", e6);
        }
    }
}
