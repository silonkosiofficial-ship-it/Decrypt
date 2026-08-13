package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C5852z1 extends com.google.android.gms.internal.ads.AbstractC3434d0 {
    public C5852z1(final com.google.android.gms.internal.ads.E0 e6, int i6, long j6, long j10) {
        long j11;
        j$.util.Objects.requireNonNull(e6);
        com.google.android.gms.internal.ads.InterfaceC3105a0 interfaceC3105a0 = new com.google.android.gms.internal.ads.InterfaceC3105a0() { // from class: com.google.android.gms.internal.ads.w1
            @Override // com.google.android.gms.internal.ads.InterfaceC3105a0
            public final long b(long j12) {
                return e6.b(j12);
            }
        };
        com.google.android.gms.internal.ads.C5632x1 c5632x1 = new com.google.android.gms.internal.ads.C5632x1(e6, i6, null);
        long jA = e6.a();
        long j12 = e6.f26867j;
        int i10 = e6.f26861d;
        if (i10 > 0) {
            j11 = ((((long) i10) + ((long) e6.f26860c)) / 2) + 1;
        } else {
            int i11 = e6.f26858a;
            long j13 = 4096;
            if (i11 == e6.f26859b && i11 > 0) {
                j13 = i11;
            }
            j11 = (((j13 * ((long) e6.f26864g)) * ((long) e6.f26865h)) / 8) + 64;
        }
        super(interfaceC3105a0, c5632x1, jA, 0L, j12, j6, j10, j11, java.lang.Math.max(6, e6.f26860c));
    }
}
