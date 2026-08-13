package p131n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final long a(float f6, float f10) {
        return p131n0.m.d((((long) java.lang.Float.floatToRawIntBits(f10)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f6) << 32));
    }

    public static final long b(long j6) {
        if (j6 == 9205357640488583168L) {
            p131n0.d.a("Size is unspecified");
        }
        return p131n0.h.a(java.lang.Float.intBitsToFloat((int) (j6 >> 32)) / 2.0f, java.lang.Float.intBitsToFloat((int) (j6 & 4294967295L)) / 2.0f);
    }

    public static final p131n0.i c(long j6) {
        return p131n0.j.b(p131n0.g.f51312b.c(), j6);
    }
}
