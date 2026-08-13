package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class VJ0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.CopyOnWriteArrayList f32486a = new java.util.concurrent.CopyOnWriteArrayList();

    public final void a(android.os.Handler handler, com.google.android.gms.internal.ads.WJ0 wj0) {
        c(wj0);
        this.f32486a.add(new com.google.android.gms.internal.ads.UJ0(handler, wj0));
    }

    public final void b(final int i6, final long j6, final long j10) {
        for (final com.google.android.gms.internal.ads.UJ0 uj0 : this.f32486a) {
            if (!uj0.f32189c) {
                uj0.f32187a.post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.TJ0
                    @Override // java.lang.Runnable
                    public final void run() {
                        uj0.f32188b.x(i6, j6, j10);
                    }
                });
            }
        }
    }

    public final void c(com.google.android.gms.internal.ads.WJ0 wj0) {
        for (com.google.android.gms.internal.ads.UJ0 uj0 : this.f32486a) {
            if (uj0.f32188b == wj0) {
                uj0.c();
                this.f32486a.remove(uj0);
            }
        }
    }
}
