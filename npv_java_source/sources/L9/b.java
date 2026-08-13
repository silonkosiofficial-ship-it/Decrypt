package L9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final java.lang.String b(long j6) {
        java.lang.StringBuilder sb;
        long j10;
        long j11;
        long j12;
        if (j6 > -999500000) {
            if (j6 > -999500) {
                if (j6 <= 0) {
                    sb = new java.lang.StringBuilder();
                    j12 = j6 - ((long) 500);
                } else if (j6 < 999500) {
                    sb = new java.lang.StringBuilder();
                    j12 = j6 + ((long) 500);
                } else if (j6 < 999500000) {
                    sb = new java.lang.StringBuilder();
                    j11 = j6 + ((long) 500000);
                } else {
                    sb = new java.lang.StringBuilder();
                    j10 = j6 + ((long) 500000000);
                }
                sb.append(j12 / ((long) 1000));
                sb.append(" µs");
                java.lang.String string = sb.toString();
                p247y7.V v6 = p247y7.V.f57259a;
                java.lang.String str = java.lang.String.format("%6s", java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
                p247y7.AbstractC7350t.e(str, "format(format, *args)");
                return str;
            }
            sb = new java.lang.StringBuilder();
            j11 = j6 - ((long) 500000);
            sb.append(j11 / ((long) 1000000));
            sb.append(" ms");
            java.lang.String string2 = sb.toString();
            p247y7.V v10 = p247y7.V.f57259a;
            java.lang.String str2 = java.lang.String.format("%6s", java.util.Arrays.copyOf(new java.lang.Object[]{string2}, 1));
            p247y7.AbstractC7350t.e(str2, "format(format, *args)");
            return str2;
        }
        sb = new java.lang.StringBuilder();
        j10 = j6 - ((long) 500000000);
        sb.append(j10 / ((long) 1000000000));
        sb.append(" s ");
        java.lang.String string3 = sb.toString();
        p247y7.V v11 = p247y7.V.f57259a;
        java.lang.String str3 = java.lang.String.format("%6s", java.util.Arrays.copyOf(new java.lang.Object[]{string3}, 1));
        p247y7.AbstractC7350t.e(str3, "format(format, *args)");
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(L9.a aVar, L9.d dVar, java.lang.String str) {
        java.util.logging.Logger loggerA = L9.e.f6460h.a();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(dVar.f());
        sb.append(' ');
        p247y7.V v6 = p247y7.V.f57259a;
        java.lang.String str2 = java.lang.String.format("%-22s", java.util.Arrays.copyOf(new java.lang.Object[]{str}, 1));
        p247y7.AbstractC7350t.e(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(aVar.b());
        loggerA.fine(sb.toString());
    }
}
