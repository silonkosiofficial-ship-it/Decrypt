package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.dq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3522dq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p214v3.InterfaceC7268s0 f34794a;

    C3522dq(V3.f fVar, p214v3.InterfaceC7268s0 interfaceC7268s0, com.google.android.gms.internal.ads.C4840pq c4840pq) {
        this.f34794a = interfaceC7268s0;
    }

    public final void a(int i6, long j6) {
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25240D0)).booleanValue()) {
            return;
        }
        if (j6 - this.f34794a.e() < 0) {
            p214v3.AbstractC7265q0.k("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25251E0)).booleanValue()) {
            this.f34794a.G(i6);
            this.f34794a.y(j6);
        } else {
            this.f34794a.G(-1);
            this.f34794a.y(j6);
        }
    }
}
