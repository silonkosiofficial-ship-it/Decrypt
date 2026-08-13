package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class G7 extends java.io.ByteArrayOutputStream {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final com.google.android.gms.internal.ads.C5204t7 f27680C;

    public G7(com.google.android.gms.internal.ads.C5204t7 c5204t7, int i6) {
        this.f27680C = c5204t7;
        ((java.io.ByteArrayOutputStream) this).buf = c5204t7.b(java.lang.Math.max(i6, 256));
    }

    private final void a(int i6) {
        int i10 = ((java.io.ByteArrayOutputStream) this).count;
        if (i10 + i6 <= ((java.io.ByteArrayOutputStream) this).buf.length) {
            return;
        }
        int i11 = i10 + i6;
        byte[] bArrB = this.f27680C.b(i11 + i11);
        java.lang.System.arraycopy(((java.io.ByteArrayOutputStream) this).buf, 0, bArrB, 0, ((java.io.ByteArrayOutputStream) this).count);
        this.f27680C.a(((java.io.ByteArrayOutputStream) this).buf);
        ((java.io.ByteArrayOutputStream) this).buf = bArrB;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.f27680C.a(((java.io.ByteArrayOutputStream) this).buf);
        ((java.io.ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f27680C.a(((java.io.ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i6) {
        a(1);
        super.write(i6);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i6, int i10) {
        a(i10);
        super.write(bArr, i6, i10);
    }
}
