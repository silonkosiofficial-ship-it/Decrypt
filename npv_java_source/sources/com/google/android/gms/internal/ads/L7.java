package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L7 implements com.google.android.gms.internal.ads.M7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.util.logging.Logger f29223b = java.util.logging.Logger.getLogger(com.google.android.gms.internal.ads.L7.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final java.lang.ThreadLocal f29224a = new com.google.android.gms.internal.ads.K7(this);

    @Override // com.google.android.gms.internal.ads.M7
    public final com.google.android.gms.internal.ads.P7 a(com.google.android.gms.internal.ads.My0 my0, com.google.android.gms.internal.ads.R7 r10) throws java.io.EOFException {
        int iI1;
        long jC;
        long jB = my0.b();
        ((java.nio.ByteBuffer) this.f29224a.get()).rewind().limit(8);
        do {
            iI1 = my0.i1((java.nio.ByteBuffer) this.f29224a.get());
            if (iI1 == 8) {
                ((java.nio.ByteBuffer) this.f29224a.get()).rewind();
                long jE = com.google.android.gms.internal.ads.O7.e((java.nio.ByteBuffer) this.f29224a.get());
                byte[] bArr = null;
                if (jE < 8 && jE > 1) {
                    java.util.logging.Logger logger = f29223b;
                    java.util.logging.Level level = java.util.logging.Level.SEVERE;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jE);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((java.nio.ByteBuffer) this.f29224a.get()).get(bArr2);
                try {
                    java.lang.String str = new java.lang.String(bArr2, "ISO-8859-1");
                    if (jE == 1) {
                        ((java.nio.ByteBuffer) this.f29224a.get()).limit(16);
                        my0.i1((java.nio.ByteBuffer) this.f29224a.get());
                        ((java.nio.ByteBuffer) this.f29224a.get()).position(8);
                        jC = com.google.android.gms.internal.ads.O7.f((java.nio.ByteBuffer) this.f29224a.get()) - 16;
                    } else {
                        jC = jE == 0 ? my0.c() - my0.b() : jE - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((java.nio.ByteBuffer) this.f29224a.get()).limit(((java.nio.ByteBuffer) this.f29224a.get()).limit() + 16);
                        my0.i1((java.nio.ByteBuffer) this.f29224a.get());
                        bArr = new byte[16];
                        for (int iPosition = ((java.nio.ByteBuffer) this.f29224a.get()).position() - 16; iPosition < ((java.nio.ByteBuffer) this.f29224a.get()).position(); iPosition++) {
                            bArr[iPosition - (((java.nio.ByteBuffer) this.f29224a.get()).position() - 16)] = ((java.nio.ByteBuffer) this.f29224a.get()).get(iPosition);
                        }
                        jC -= 16;
                    }
                    long j6 = jC;
                    com.google.android.gms.internal.ads.P7 p7B = b(str, bArr, r10 instanceof com.google.android.gms.internal.ads.P7 ? ((com.google.android.gms.internal.ads.P7) r10).a() : "");
                    ((java.nio.ByteBuffer) this.f29224a.get()).rewind();
                    p7B.f(my0, (java.nio.ByteBuffer) this.f29224a.get(), j6, this);
                    return p7B;
                } catch (java.io.UnsupportedEncodingException e6) {
                    throw new java.lang.RuntimeException(e6);
                }
            }
        } while (iI1 >= 0);
        my0.h(jB);
        throw new java.io.EOFException();
    }

    public abstract com.google.android.gms.internal.ads.P7 b(java.lang.String str, byte[] bArr, java.lang.String str2);
}
