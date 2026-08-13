package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class ZT implements com.google.android.gms.internal.ads.InterfaceC5666xI {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.List f33588b = new java.util.ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.os.Handler f33589a;

    public ZT(android.os.Handler handler) {
        this.f33589a = handler;
    }

    static /* bridge */ /* synthetic */ void b(com.google.android.gms.internal.ads.XS xs) {
        java.util.List list = f33588b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(xs);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    private static com.google.android.gms.internal.ads.XS c() {
        com.google.android.gms.internal.ads.XS xs;
        java.util.List list = f33588b;
        synchronized (list) {
            try {
                xs = list.isEmpty() ? new com.google.android.gms.internal.ads.XS(null) : (com.google.android.gms.internal.ads.XS) list.remove(list.size() - 1);
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return xs;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final com.google.android.gms.internal.ads.WH B(int i6) {
        android.os.Handler handler = this.f33589a;
        com.google.android.gms.internal.ads.XS xsC = c();
        xsC.b(handler.obtainMessage(i6), this);
        return xsC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final boolean D(int i6) {
        return this.f33589a.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final boolean K(int i6) {
        return this.f33589a.sendEmptyMessage(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final android.os.Looper a() {
        return this.f33589a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final void d(java.lang.Object obj) {
        this.f33589a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final void k(int i6) {
        this.f33589a.removeMessages(i6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final com.google.android.gms.internal.ads.WH l(int i6, java.lang.Object obj) {
        android.os.Handler handler = this.f33589a;
        com.google.android.gms.internal.ads.XS xsC = c();
        xsC.b(handler.obtainMessage(i6, obj), this);
        return xsC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final boolean m(int i6, long j6) {
        return this.f33589a.sendEmptyMessageAtTime(2, j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final boolean n(java.lang.Runnable runnable) {
        return this.f33589a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final com.google.android.gms.internal.ads.WH o(int i6, int i10, int i11) {
        android.os.Handler handler = this.f33589a;
        com.google.android.gms.internal.ads.XS xsC = c();
        xsC.b(handler.obtainMessage(1, i10, i11), this);
        return xsC;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5666xI
    public final boolean p(com.google.android.gms.internal.ads.WH wh) {
        return ((com.google.android.gms.internal.ads.XS) wh).c(this.f33589a);
    }
}
