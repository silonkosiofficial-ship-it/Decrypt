package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hy0 extends com.google.android.gms.internal.ads.Ly0 implements com.google.android.gms.internal.ads.P7 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected final java.lang.String f28352J = "moov";

    public Hy0(java.lang.String str) {
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final java.lang.String a() {
        return this.f28352J;
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void f(com.google.android.gms.internal.ads.My0 my0, java.nio.ByteBuffer byteBuffer, long j6, com.google.android.gms.internal.ads.M7 m10) {
        my0.b();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.f29613D = my0;
        this.f29615F = my0.b();
        my0.h(my0.b() + j6);
        this.f29616G = my0.b();
        this.f29612C = m10;
    }
}
