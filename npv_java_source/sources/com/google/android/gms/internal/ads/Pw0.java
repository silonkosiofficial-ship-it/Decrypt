package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class Pw0 extends com.google.android.gms.internal.ads.Rw0 {
    Pw0(sun.misc.Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final byte a(long j6) {
        return libcore.io.Memory.peekByte((int) j6);
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final double b(java.lang.Object obj, long j6) {
        return java.lang.Double.longBitsToDouble(this.f31500a.getLong(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final float c(java.lang.Object obj, long j6) {
        return java.lang.Float.intBitsToFloat(this.f31500a.getInt(obj, j6));
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final void d(long j6, byte[] bArr, long j10, long j11) {
        libcore.io.Memory.peekByteArray((int) j6, bArr, (int) j10, (int) j11);
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final void e(java.lang.Object obj, long j6, boolean z6) {
        if (com.google.android.gms.internal.ads.Sw0.f31816i) {
            com.google.android.gms.internal.ads.Sw0.g(obj, j6, z6 ? (byte) 1 : (byte) 0);
        } else {
            com.google.android.gms.internal.ads.Sw0.h(obj, j6, z6 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final void f(java.lang.Object obj, long j6, byte b6) {
        if (com.google.android.gms.internal.ads.Sw0.f31816i) {
            com.google.android.gms.internal.ads.Sw0.g(obj, j6, b6);
        } else {
            com.google.android.gms.internal.ads.Sw0.h(obj, j6, b6);
        }
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final void g(java.lang.Object obj, long j6, double d6) {
        this.f31500a.putLong(obj, j6, java.lang.Double.doubleToLongBits(d6));
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final void h(java.lang.Object obj, long j6, float f6) {
        this.f31500a.putInt(obj, j6, java.lang.Float.floatToIntBits(f6));
    }

    @Override // com.google.android.gms.internal.ads.Rw0
    public final boolean i(java.lang.Object obj, long j6) {
        return com.google.android.gms.internal.ads.Sw0.f31816i ? com.google.android.gms.internal.ads.Sw0.E(obj, j6) : com.google.android.gms.internal.ads.Sw0.F(obj, j6);
    }
}
