package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class Mz0 implements com.google.android.gms.internal.ads.WA0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.YJ0 f30122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f30124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f30125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f30126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f30127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final java.util.HashMap f30128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f30129h;

    public Mz0() {
        com.google.android.gms.internal.ads.YJ0 yj0 = new com.google.android.gms.internal.ads.YJ0(true, 65536);
        l(2500, 0, "bufferForPlaybackMs", "0");
        l(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        l(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        l(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        l(50000, 50000, "maxBufferMs", "minBufferMs");
        l(0, 0, "backBufferDurationMs", "0");
        this.f30122a = yj0;
        this.f30123b = com.google.android.gms.internal.ads.EW.K(50000L);
        this.f30124c = com.google.android.gms.internal.ads.EW.K(50000L);
        this.f30125d = com.google.android.gms.internal.ads.EW.K(2500L);
        this.f30126e = com.google.android.gms.internal.ads.EW.K(5000L);
        this.f30127f = com.google.android.gms.internal.ads.EW.K(0L);
        this.f30128g = new java.util.HashMap();
        this.f30129h = -1L;
    }

    private static void l(int i6, int i10, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.LC.e(i6 >= i10, str + " cannot be less than " + str2);
    }

    private final void m(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        if (this.f30128g.remove(c3244bE0) != null) {
            n();
        }
    }

    private final void n() {
        if (this.f30128g.isEmpty()) {
            this.f30122a.e();
        } else {
            this.f30122a.f(j());
        }
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final boolean a(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final boolean b(com.google.android.gms.internal.ads.AbstractC4942qm abstractC4942qm, com.google.android.gms.internal.ads.LH0 lh0, long j6) {
        java.util.Iterator it = this.f30128g.values().iterator();
        while (it.hasNext()) {
            if (((com.google.android.gms.internal.ads.Kz0) it.next()).f29176a) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final void c(com.google.android.gms.internal.ads.VA0 va0, com.google.android.gms.internal.ads.PI0 pi0, com.google.android.gms.internal.ads.IJ0[] ij0Arr) {
        com.google.android.gms.internal.ads.Kz0 kz0 = (com.google.android.gms.internal.ads.Kz0) this.f30128g.get(va0.f32432a);
        kz0.getClass();
        int length = ij0Arr.length;
        int i6 = 0;
        int i10 = 0;
        while (true) {
            int i11 = 13107200;
            if (i6 >= length) {
                kz0.f29177b = java.lang.Math.max(13107200, i10);
                n();
                return;
            }
            com.google.android.gms.internal.ads.IJ0 ij0 = ij0Arr[i6];
            if (ij0 != null) {
                switch (ij0.i().f30779c) {
                    case -1:
                    case 1:
                        break;
                    case 0:
                        i11 = 144310272;
                        break;
                    case 2:
                        i11 = 131072000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    default:
                        i11 = 131072;
                        break;
                }
                i10 += i11;
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final boolean d(com.google.android.gms.internal.ads.VA0 va0) {
        com.google.android.gms.internal.ads.Kz0 kz0 = (com.google.android.gms.internal.ads.Kz0) this.f30128g.get(va0.f32432a);
        kz0.getClass();
        int iA = this.f30122a.a();
        int iJ = j();
        long jMin = this.f30123b;
        float f6 = va0.f32434c;
        if (f6 > 1.0f) {
            jMin = java.lang.Math.min(com.google.android.gms.internal.ads.EW.I(jMin, f6), this.f30124c);
        }
        long j6 = va0.f32433b;
        if (j6 < java.lang.Math.max(jMin, 500000L)) {
            boolean z6 = iA < iJ;
            kz0.f29176a = z6;
            if (!z6 && j6 < 500000) {
                com.google.android.gms.internal.ads.AbstractC3586eM.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j6 >= this.f30124c || iA >= iJ) {
            kz0.f29176a = false;
        }
        return kz0.f29176a;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final void e(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        long id = java.lang.Thread.currentThread().getId();
        long j6 = this.f30129h;
        boolean z6 = true;
        if (j6 != -1 && j6 != id) {
            z6 = false;
        }
        com.google.android.gms.internal.ads.LC.g(z6, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f30129h = id;
        if (!this.f30128g.containsKey(c3244bE0)) {
            this.f30128g.put(c3244bE0, new com.google.android.gms.internal.ads.Kz0(null));
        }
        com.google.android.gms.internal.ads.Kz0 kz0 = (com.google.android.gms.internal.ads.Kz0) this.f30128g.get(c3244bE0);
        kz0.getClass();
        kz0.f29177b = 13107200;
        kz0.f29176a = false;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final long f(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        return this.f30127f;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final void g(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        m(c3244bE0);
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final boolean h(com.google.android.gms.internal.ads.VA0 va0) {
        boolean z6 = va0.f32435d;
        long J10 = com.google.android.gms.internal.ads.EW.J(va0.f32433b, va0.f32434c);
        long jMin = z6 ? this.f30126e : this.f30125d;
        long j6 = va0.f32436e;
        if (j6 != -9223372036854775807L) {
            jMin = java.lang.Math.min(j6 / 2, jMin);
        }
        return jMin <= 0 || J10 >= jMin || this.f30122a.a() >= j();
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final void i(com.google.android.gms.internal.ads.C3244bE0 c3244bE0) {
        m(c3244bE0);
        if (this.f30128g.isEmpty()) {
            this.f30129h = -1L;
        }
    }

    final int j() {
        java.util.Iterator it = this.f30128g.values().iterator();
        int i6 = 0;
        while (it.hasNext()) {
            i6 += ((com.google.android.gms.internal.ads.Kz0) it.next()).f29177b;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.WA0
    public final com.google.android.gms.internal.ads.YJ0 k() {
        return this.f30122a;
    }
}
