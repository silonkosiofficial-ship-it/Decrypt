package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class PK0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.google.android.gms.internal.ads.D f30693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.ads.C4090j f30694b;

    /* synthetic */ PK0(com.google.android.gms.internal.ads.C4090j c4090j, com.google.android.gms.internal.ads.AbstractC3982i abstractC3982i) {
        this.f30694b = c4090j;
    }

    public final void a(com.google.android.gms.internal.ads.C2697Os c2697Os) {
        com.google.android.gms.internal.ads.C4682oK0 c4682oK0 = new com.google.android.gms.internal.ads.C4682oK0();
        c4682oK0.G(c2697Os.f30583a);
        c4682oK0.k(c2697Os.f30584b);
        c4682oK0.B("video/raw");
        this.f30693a = c4682oK0.H();
        java.util.Iterator it = this.f30694b.f36525i.iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.InterfaceC3542e) it.next()).f(this.f30694b, c2697Os);
        }
    }

    public final void b(long j6, long j10, boolean z6) {
        if (z6) {
            com.google.android.gms.internal.ads.C4090j c4090j = this.f30694b;
            if (c4090j.f36528l != null) {
                java.util.Iterator it = c4090j.f36525i.iterator();
                while (it.hasNext()) {
                    ((com.google.android.gms.internal.ads.InterfaceC3542e) it.next()).e(this.f30694b);
                }
            }
        }
        if (this.f30694b.f36526j != null) {
            com.google.android.gms.internal.ads.D dH = this.f30693a;
            if (dH == null) {
                dH = new com.google.android.gms.internal.ads.C4682oK0().H();
            }
            com.google.android.gms.internal.ads.D d6 = dH;
            com.google.android.gms.internal.ads.C4090j c4090j2 = this.f30694b;
            c4090j2.f36526j.a(j10, c4090j2.f36524h.c(), d6, null);
        }
        com.google.android.gms.internal.ads.LC.b(null);
        throw null;
    }
}
