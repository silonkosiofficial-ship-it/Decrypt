package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C5518vz0 extends com.google.android.gms.internal.ads.AbstractC3428cx0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.android.gms.internal.ads.D f39484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.Iy0 f39485c = new com.google.android.gms.internal.ads.Iy0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.nio.ByteBuffer f39486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f39488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f39489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f39490h;

    static {
        com.google.android.gms.internal.ads.AbstractC4986r8.b("media3.decoder");
    }

    public C5518vz0(int i6, int i10) {
        this.f39490h = i6;
    }

    private final java.nio.ByteBuffer m(int i6) {
        int i10 = this.f39490h;
        if (i10 == 1) {
            return java.nio.ByteBuffer.allocate(i6);
        }
        if (i10 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i6);
        }
        java.nio.ByteBuffer byteBuffer = this.f39486d;
        throw new com.google.android.gms.internal.ads.C5408uz0(byteBuffer == null ? 0 : byteBuffer.capacity(), i6);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3428cx0
    public void b() {
        super.b();
        java.nio.ByteBuffer byteBuffer = this.f39486d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        java.nio.ByteBuffer byteBuffer2 = this.f39489g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f39487e = false;
    }

    public final void j(int i6) {
        java.nio.ByteBuffer byteBuffer = this.f39486d;
        if (byteBuffer == null) {
            this.f39486d = m(i6);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i6 + iPosition;
        if (iCapacity >= i10) {
            this.f39486d = byteBuffer;
            return;
        }
        java.nio.ByteBuffer byteBufferM = m(i10);
        byteBufferM.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM.put(byteBuffer);
        }
        this.f39486d = byteBufferM;
    }

    public final void k() {
        java.nio.ByteBuffer byteBuffer = this.f39486d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        java.nio.ByteBuffer byteBuffer2 = this.f39489g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean l() {
        return d(1073741824);
    }
}
