package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.uK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5340uK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p214v3.Q f39141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V3.f f39142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.concurrent.Executor f39143c;

    public C5340uK(p214v3.Q q6, V3.f fVar, java.util.concurrent.Executor executor) {
        this.f39141a = q6;
        this.f39142b = fVar;
        this.f39143c = executor;
    }

    private final android.graphics.Bitmap c(byte[] bArr, android.graphics.BitmapFactory.Options options) {
        long jC = this.f39142b.c();
        android.graphics.Bitmap bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long jC2 = this.f39142b.c();
        if (bitmapDecodeByteArray != null) {
            long j6 = jC2 - jC;
            p214v3.AbstractC7265q0.k("Decoded image w: " + bitmapDecodeByteArray.getWidth() + " h:" + bitmapDecodeByteArray.getHeight() + " bytes: " + bitmapDecodeByteArray.getAllocationByteCount() + " time: " + j6 + " on ui thread: " + (android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread()));
        }
        return bitmapDecodeByteArray;
    }

    final /* synthetic */ android.graphics.Bitmap a(double d6, boolean z6, com.google.android.gms.internal.ads.Z6 z10) {
        byte[] bArr = z10.f33501b;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inDensity = (int) (d6 * 160.0d);
        if (!z6) {
            options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        if (((java.lang.Boolean) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.f25476Y5)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i6 = options.outWidth * options.outHeight;
            if (i6 > 0) {
                options.inSampleSize = 1 << ((33 - java.lang.Integer.numberOfLeadingZeros((i6 - 1) / ((java.lang.Integer) p184s3.A.c().a(com.google.android.gms.internal.ads.AbstractC2161Af.Z5)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }

    public final P4.d b(java.lang.String str, final double d6, final boolean z6) {
        return com.google.android.gms.internal.ads.AbstractC2652Nk0.m(this.f39141a.a(str), new com.google.android.gms.internal.ads.InterfaceC4821pg0() { // from class: com.google.android.gms.internal.ads.tK
            @Override // com.google.android.gms.internal.ads.InterfaceC4821pg0
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.f38933a.a(d6, z6, (com.google.android.gms.internal.ads.Z6) obj);
            }
        }, this.f39143c);
    }
}
