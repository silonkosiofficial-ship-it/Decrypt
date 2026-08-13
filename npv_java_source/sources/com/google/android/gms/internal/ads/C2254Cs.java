package com.google.android.gms.internal.ads;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Cs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2254Cs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f26292a;

    public final long a(java.nio.ByteBuffer byteBuffer) {
        com.google.android.gms.internal.ads.T7 t10;
        com.google.android.gms.internal.ads.S7 s10;
        long j6 = this.f26292a;
        if (j6 > 0) {
            return j6;
        }
        try {
            java.nio.ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            java.util.Iterator it = new com.google.android.gms.internal.ads.N7(new com.google.android.gms.internal.ads.C2217Bs(byteBufferDuplicate), com.google.android.gms.internal.ads.C2365Fs.f27467c).o().iterator();
            while (true) {
                t10 = null;
                if (!it.hasNext()) {
                    s10 = null;
                    break;
                }
                com.google.android.gms.internal.ads.P7 p10 = (com.google.android.gms.internal.ads.P7) it.next();
                if (p10 instanceof com.google.android.gms.internal.ads.S7) {
                    s10 = (com.google.android.gms.internal.ads.S7) p10;
                    break;
                }
            }
            for (com.google.android.gms.internal.ads.P7 p11 : s10.o()) {
                if (p11 instanceof com.google.android.gms.internal.ads.T7) {
                    t10 = (com.google.android.gms.internal.ads.T7) p11;
                    break;
                }
            }
            long jH = (t10.h() * 1000) / t10.i();
            this.f26292a = jH;
            return jH;
        } catch (java.io.IOException | java.lang.RuntimeException unused) {
            return 0L;
        }
    }
}
