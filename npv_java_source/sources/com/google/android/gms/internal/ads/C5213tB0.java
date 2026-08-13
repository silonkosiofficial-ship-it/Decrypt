package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.tB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5213tB0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f38900a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private android.os.Looper f38901b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private android.os.HandlerThread f38902c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f38903d = 0;

    public C5213tB0(android.os.Looper looper) {
    }

    public final android.os.Looper a() {
        android.os.Looper looper;
        synchronized (this.f38900a) {
            try {
                if (this.f38901b == null) {
                    boolean z6 = false;
                    if (this.f38903d == 0 && this.f38902c == null) {
                        z6 = true;
                    }
                    com.google.android.gms.internal.ads.LC.f(z6);
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:Playback", -16);
                    this.f38902c = handlerThread;
                    handlerThread.start();
                    this.f38901b = this.f38902c.getLooper();
                }
                this.f38903d++;
                looper = this.f38901b;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final void b() {
        android.os.HandlerThread handlerThread;
        synchronized (this.f38900a) {
            try {
                com.google.android.gms.internal.ads.LC.f(this.f38903d > 0);
                int i6 = this.f38903d - 1;
                this.f38903d = i6;
                if (i6 == 0 && (handlerThread = this.f38902c) != null) {
                    handlerThread.quit();
                    this.f38902c = null;
                    this.f38901b = null;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
