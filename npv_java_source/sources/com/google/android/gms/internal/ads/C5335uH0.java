package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5335uH0 implements com.google.android.gms.internal.ads.HI0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.AbstractC3398ci0 f39137C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f39138D;

    public C5335uH0(java.util.List list, java.util.List list2) {
        com.google.android.gms.internal.ads.C3083Zh0 c3083Zh0 = new com.google.android.gms.internal.ads.C3083Zh0();
        com.google.android.gms.internal.ads.LC.d(list.size() == list2.size());
        for (int i6 = 0; i6 < list.size(); i6++) {
            c3083Zh0.g(new com.google.android.gms.internal.ads.C5225tH0((com.google.android.gms.internal.ads.HI0) list.get(i6), (java.util.List) list2.get(i6)));
        }
        this.f39137C = c3083Zh0.j();
        this.f39138D = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.HI0
    public final void a(long j6) {
        for (int i6 = 0; i6 < this.f39137C.size(); i6++) {
            ((com.google.android.gms.internal.ads.C5225tH0) this.f39137C.get(i6)).a(j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.HI0
    public final long b() {
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        for (int i6 = 0; i6 < this.f39137C.size(); i6++) {
            com.google.android.gms.internal.ads.C5225tH0 c5225tH0 = (com.google.android.gms.internal.ads.C5225tH0) this.f39137C.get(i6);
            long jB = c5225tH0.b();
            if ((c5225tH0.e().contains(1) || c5225tH0.e().contains(2) || c5225tH0.e().contains(4)) && jB != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, jB);
            }
            if (jB != Long.MIN_VALUE) {
                jMin2 = java.lang.Math.min(jMin2, jB);
            }
        }
        if (jMin != Long.MAX_VALUE) {
            this.f39138D = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j6 = this.f39138D;
        return j6 != -9223372036854775807L ? j6 : jMin2;
    }

    @Override // com.google.android.gms.internal.ads.HI0
    public final long c() {
        long jMin = Long.MAX_VALUE;
        for (int i6 = 0; i6 < this.f39137C.size(); i6++) {
            long jC = ((com.google.android.gms.internal.ads.C5225tH0) this.f39137C.get(i6)).c();
            if (jC != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, jC);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.HI0
    public final boolean d(com.google.android.gms.internal.ads.ZA0 za0) {
        boolean zD;
        boolean z6 = false;
        do {
            long jC = c();
            if (jC == Long.MIN_VALUE) {
                break;
            }
            zD = false;
            for (int i6 = 0; i6 < this.f39137C.size(); i6++) {
                long jC2 = ((com.google.android.gms.internal.ads.C5225tH0) this.f39137C.get(i6)).c();
                boolean z10 = jC2 != Long.MIN_VALUE && jC2 <= za0.f33511a;
                if (jC2 == jC || z10) {
                    zD |= ((com.google.android.gms.internal.ads.C5225tH0) this.f39137C.get(i6)).d(za0);
                }
            }
            z6 |= zD;
        } while (zD);
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.HI0
    public final boolean q() {
        for (int i6 = 0; i6 < this.f39137C.size(); i6++) {
            if (((com.google.android.gms.internal.ads.C5225tH0) this.f39137C.get(i6)).q()) {
                return true;
            }
        }
        return false;
    }
}
