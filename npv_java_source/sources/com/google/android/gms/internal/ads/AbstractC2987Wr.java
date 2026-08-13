package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Wr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2987Wr {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f32814C = new java.util.concurrent.atomic.AtomicInteger(0);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f32815D = new java.util.concurrent.atomic.AtomicInteger(0);

    public static int O() {
        return f32814C.get();
    }

    public static int Q() {
        return f32815D.get();
    }

    protected static java.util.concurrent.atomic.AtomicInteger u() {
        return f32814C;
    }

    protected static java.util.concurrent.atomic.AtomicInteger v() {
        return f32815D;
    }

    public abstract void A(int i6);

    public abstract void B(int i6);

    public abstract void C(com.google.android.gms.internal.ads.InterfaceC2951Vr interfaceC2951Vr);

    public abstract void D(int i6);

    public abstract void E(int i6);

    public abstract void F(boolean z6);

    public abstract void G(java.lang.Integer num);

    public abstract void H(boolean z6);

    public abstract void I(int i6);

    public abstract void J(android.view.Surface surface, boolean z6);

    public abstract void K(float f6, boolean z6);

    public abstract void L();

    public abstract boolean M();

    public abstract int N();

    public abstract int P();

    public abstract long R();

    public abstract long S();

    public abstract long T();

    public abstract long U();

    public abstract long V();

    public abstract long r();

    public abstract long s();

    public abstract java.lang.Integer t();

    public abstract void w(android.net.Uri[] uriArr, java.lang.String str);

    public abstract void x(android.net.Uri[] uriArr, java.lang.String str, java.nio.ByteBuffer byteBuffer, boolean z6);

    public abstract void y();

    public abstract void z(long j6);
}
