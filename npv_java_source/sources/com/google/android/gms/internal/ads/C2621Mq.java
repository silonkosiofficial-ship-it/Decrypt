package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Mq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C2621Mq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f29835a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f29836b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C2658Nq f29837c;

    public C2621Mq(com.google.android.gms.internal.ads.C2658Nq c2658Nq) {
        this.f29837c = c2658Nq;
    }

    public final long a() {
        return this.f29836b;
    }

    public final android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("topen", this.f29835a);
        bundle.putLong("tclose", this.f29836b);
        return bundle;
    }

    public final void c() {
        this.f29836b = this.f29837c.f30381a.c();
    }

    public final void d() {
        this.f29835a = this.f29837c.f30381a.c();
    }
}
