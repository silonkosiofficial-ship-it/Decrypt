package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Jy0 extends com.google.android.gms.internal.ads.Gy0 implements com.google.android.gms.internal.ads.P7 {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private int f28777K;

    protected Jy0(java.lang.String str) {
        super("mvhd");
    }

    public final int e() {
        if (!this.f27928D) {
            d();
        }
        return this.f28777K;
    }

    protected final long g(java.nio.ByteBuffer byteBuffer) {
        this.f28777K = com.google.android.gms.internal.ads.O7.c(byteBuffer.get());
        com.google.android.gms.internal.ads.O7.d(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
