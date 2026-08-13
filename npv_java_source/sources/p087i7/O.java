package p087i7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O {
    public static final int a(int i6, int i10) {
        return p247y7.AbstractC7350t.g(i6 ^ Integer.MIN_VALUE, i10 ^ Integer.MIN_VALUE);
    }

    public static final int b(long j6, long j10) {
        return p247y7.AbstractC7350t.h(j6 ^ Long.MIN_VALUE, j10 ^ Long.MIN_VALUE);
    }

    public static final double c(long j6) {
        return ((j6 >>> 11) * ((double) 2048)) + (j6 & 2047);
    }

    public static final java.lang.String d(long j6, int i6) {
        if (j6 >= 0) {
            java.lang.String string = java.lang.Long.toString(j6, S8.AbstractC1628a.a(i6));
            p247y7.AbstractC7350t.e(string, "toString(...)");
            return string;
        }
        long j10 = i6;
        long j11 = ((j6 >>> 1) / j10) << 1;
        long j12 = j6 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String string2 = java.lang.Long.toString(j11, S8.AbstractC1628a.a(i6));
        p247y7.AbstractC7350t.e(string2, "toString(...)");
        sb.append(string2);
        java.lang.String string3 = java.lang.Long.toString(j12, S8.AbstractC1628a.a(i6));
        p247y7.AbstractC7350t.e(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
