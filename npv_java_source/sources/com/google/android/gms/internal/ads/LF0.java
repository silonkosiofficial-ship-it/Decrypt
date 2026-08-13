package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class LF0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f29447d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f29448e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.nio.ByteBuffer f29449a = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29451c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29450b = 2;

    private static final void c(java.nio.ByteBuffer byteBuffer, long j6, int i6, int i10, boolean z6) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(true != z6 ? (byte) 0 : (byte) 2);
        byteBuffer.putLong(j6);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i6);
        byteBuffer.putInt(0);
        byteBuffer.put(com.google.android.gms.internal.ads.AbstractC2577Lj0.a(i10));
    }

    public final void a(com.google.android.gms.internal.ads.C5518vz0 c5518vz0, java.util.List list) {
        int length;
        java.nio.ByteBuffer byteBuffer = c5518vz0.f39486d;
        byteBuffer.getClass();
        if (byteBuffer.limit() - c5518vz0.f39486d.position() == 0) {
            return;
        }
        byte[] bArr = null;
        if (this.f29450b == 2 && (list.size() == 1 || list.size() == 3)) {
            bArr = (byte[]) list.get(0);
        }
        java.nio.ByteBuffer byteBuffer2 = c5518vz0.f39486d;
        int iPosition = byteBuffer2.position();
        int iLimit = byteBuffer2.limit();
        int i6 = iLimit - iPosition;
        int i10 = (i6 + 255) / 255;
        int i11 = i10 + 27 + i6;
        if (this.f29450b == 2) {
            length = bArr != null ? bArr.length + 28 : 47;
            i11 += length + 44;
        } else {
            length = 0;
        }
        if (this.f29449a.capacity() < i11) {
            this.f29449a = java.nio.ByteBuffer.allocate(i11).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f29449a.clear();
        }
        java.nio.ByteBuffer byteBuffer3 = this.f29449a;
        if (this.f29450b == 2) {
            if (bArr != null) {
                c(byteBuffer3, 0L, 0, 1, true);
                int length2 = bArr.length;
                byteBuffer3.put(com.google.android.gms.internal.ads.AbstractC2577Lj0.a(length2));
                byteBuffer3.put(bArr);
                int i12 = length2 + 28;
                byteBuffer3.putInt(22, com.google.android.gms.internal.ads.EW.x(byteBuffer3.array(), byteBuffer3.arrayOffset(), i12, 0));
                byteBuffer3.position(i12);
            } else {
                byteBuffer3.put(f29447d);
            }
            byteBuffer3.put(f29448e);
        }
        int iC = this.f29451c + com.google.android.gms.internal.ads.P0.c(byteBuffer2);
        this.f29451c = iC;
        c(byteBuffer3, iC, this.f29450b, i10, false);
        for (int i13 = 0; i13 < i10; i13++) {
            if (i6 >= 255) {
                byteBuffer3.put((byte) -1);
                i6 -= 255;
            } else {
                byteBuffer3.put((byte) i6);
                i6 = 0;
            }
        }
        while (iPosition < iLimit) {
            byteBuffer3.put(byteBuffer2.get(iPosition));
            iPosition++;
        }
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer3.flip();
        if (this.f29450b == 2) {
            byteBuffer3.putInt(length + 66, com.google.android.gms.internal.ads.EW.x(byteBuffer3.array(), byteBuffer3.arrayOffset() + length + 44, byteBuffer3.limit() - byteBuffer3.position(), 0));
        } else {
            byteBuffer3.putInt(22, com.google.android.gms.internal.ads.EW.x(byteBuffer3.array(), byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0));
        }
        this.f29450b++;
        this.f29449a = byteBuffer3;
        c5518vz0.b();
        c5518vz0.j(this.f29449a.remaining());
        c5518vz0.f39486d.put(this.f29449a);
        c5518vz0.k();
    }

    public final void b() {
        this.f29449a = com.google.android.gms.internal.ads.InterfaceC2954Vu.f32607a;
        this.f29451c = 0;
        this.f29450b = 2;
    }
}
