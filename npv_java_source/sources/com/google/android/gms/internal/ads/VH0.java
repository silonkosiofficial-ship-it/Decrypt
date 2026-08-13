package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class VH0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.LH0 f32481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f32482c;

    public VH0() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
    }

    private VH0(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        this.f32482c = copyOnWriteArrayList;
        this.f32480a = 0;
        this.f32481b = lh0;
    }

    public final com.google.android.gms.internal.ads.VH0 a(int i6, com.google.android.gms.internal.ads.LH0 lh0) {
        return new com.google.android.gms.internal.ads.VH0(this.f32482c, 0, lh0);
    }

    public final void b(android.os.Handler handler, com.google.android.gms.internal.ads.WH0 wh0) {
        this.f32482c.add(new com.google.android.gms.internal.ads.UH0(handler, wh0));
    }

    public final void c(final com.google.android.gms.internal.ads.InterfaceC5000rF interfaceC5000rF) {
        for (com.google.android.gms.internal.ads.UH0 uh0 : this.f32482c) {
            final com.google.android.gms.internal.ads.WH0 wh0 = uh0.f32179b;
            android.os.Handler handler = uh0.f32178a;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.TH0
                @Override // java.lang.Runnable
                public final void run() {
                    interfaceC5000rF.b(wh0);
                }
            };
            int i6 = com.google.android.gms.internal.ads.EW.f27061a;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == android.os.Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }
    }

    public final void d(final com.google.android.gms.internal.ads.HH0 hh0) {
        c(new com.google.android.gms.internal.ads.InterfaceC5000rF() { // from class: com.google.android.gms.internal.ads.OH0
            @Override // com.google.android.gms.internal.ads.InterfaceC5000rF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.WH0) obj).B(0, this.f30476a.f32481b, hh0);
            }
        });
    }

    public final void e(final com.google.android.gms.internal.ads.BH0 bh0, final com.google.android.gms.internal.ads.HH0 hh0) {
        c(new com.google.android.gms.internal.ads.InterfaceC5000rF() { // from class: com.google.android.gms.internal.ads.SH0
            @Override // com.google.android.gms.internal.ads.InterfaceC5000rF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.WH0) obj).i(0, this.f31660a.f32481b, bh0, hh0);
            }
        });
    }

    public final void f(final com.google.android.gms.internal.ads.BH0 bh0, final com.google.android.gms.internal.ads.HH0 hh0) {
        c(new com.google.android.gms.internal.ads.InterfaceC5000rF() { // from class: com.google.android.gms.internal.ads.QH0
            @Override // com.google.android.gms.internal.ads.InterfaceC5000rF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.WH0) obj).y(0, this.f30958a.f32481b, bh0, hh0);
            }
        });
    }

    public final void g(final com.google.android.gms.internal.ads.BH0 bh0, final com.google.android.gms.internal.ads.HH0 hh0, final java.io.IOException iOException, final boolean z6) {
        c(new com.google.android.gms.internal.ads.InterfaceC5000rF() { // from class: com.google.android.gms.internal.ads.RH0
            @Override // com.google.android.gms.internal.ads.InterfaceC5000rF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.WH0) obj).F(0, this.f31222a.f32481b, bh0, hh0, iOException, z6);
            }
        });
    }

    public final void h(final com.google.android.gms.internal.ads.BH0 bh0, final com.google.android.gms.internal.ads.HH0 hh0) {
        c(new com.google.android.gms.internal.ads.InterfaceC5000rF() { // from class: com.google.android.gms.internal.ads.PH0
            @Override // com.google.android.gms.internal.ads.InterfaceC5000rF
            public final void b(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.WH0) obj).t(0, this.f30681a.f32481b, bh0, hh0);
            }
        });
    }

    public final void i(com.google.android.gms.internal.ads.WH0 wh0) {
        for (com.google.android.gms.internal.ads.UH0 uh0 : this.f32482c) {
            if (uh0.f32179b == wh0) {
                this.f32482c.remove(uh0);
            }
        }
    }
}
