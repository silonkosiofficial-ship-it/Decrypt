package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Gy0 implements com.google.android.gms.internal.ads.P7 {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final com.google.android.gms.internal.ads.Sy0 f27926J = com.google.android.gms.internal.ads.Sy0.b(com.google.android.gms.internal.ads.Gy0.class);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    protected final java.lang.String f27927C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private java.nio.ByteBuffer f27930F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    long f27931G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    com.google.android.gms.internal.ads.My0 f27933I;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    long f27932H = -1;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    boolean f27929E = true;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    boolean f27928D = true;

    protected Gy0(java.lang.String str) {
        this.f27927C = str;
    }

    private final synchronized void b() {
        try {
            if (this.f27929E) {
                return;
            }
            try {
                com.google.android.gms.internal.ads.Sy0 sy0 = f27926J;
                java.lang.String str = this.f27927C;
                sy0.a(str.length() != 0 ? "mem mapping ".concat(str) : new java.lang.String("mem mapping "));
                this.f27930F = this.f27933I.n1(this.f27931G, this.f27932H);
                this.f27929E = true;
            } catch (java.io.IOException e6) {
                throw new java.lang.RuntimeException(e6);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final java.lang.String a() {
        return this.f27927C;
    }

    protected abstract void c(java.nio.ByteBuffer byteBuffer);

    public final synchronized void d() {
        try {
            b();
            com.google.android.gms.internal.ads.Sy0 sy0 = f27926J;
            java.lang.String str = this.f27927C;
            sy0.a(str.length() != 0 ? "parsing details of ".concat(str) : new java.lang.String("parsing details of "));
            java.nio.ByteBuffer byteBuffer = this.f27930F;
            if (byteBuffer != null) {
                this.f27928D = true;
                byteBuffer.rewind();
                c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    byteBuffer.slice();
                }
                this.f27930F = null;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.P7
    public final void f(com.google.android.gms.internal.ads.My0 my0, java.nio.ByteBuffer byteBuffer, long j6, com.google.android.gms.internal.ads.M7 m10) {
        this.f27931G = my0.b();
        byteBuffer.remaining();
        this.f27932H = j6;
        this.f27933I = my0;
        my0.h(my0.b() + j6);
        this.f27929E = false;
        this.f27928D = false;
        d();
    }
}
