package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C4154jd implements Q3.AbstractC1464c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4512mr f36707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4264kd f36708b;

    C4154jd(com.google.android.gms.internal.ads.C4264kd c4264kd, com.google.android.gms.internal.ads.C4512mr c4512mr) {
        this.f36707a = c4512mr;
        this.f36708b = c4264kd;
    }

    @Override // Q3.AbstractC1464c.b
    public final void q0(N3.C1389b c1389b) {
        synchronized (this.f36708b.f36993d) {
            this.f36707a.d(new java.lang.RuntimeException("Connection failed."));
        }
    }
}
