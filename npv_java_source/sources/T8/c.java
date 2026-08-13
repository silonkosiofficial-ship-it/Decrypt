package T8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long i(long j6, int i6) {
        return T8.a.s((j6 << 1) + ((long) i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long j(long j6) {
        return T8.a.s((j6 << 1) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(long j6) {
        return (-4611686018426L > j6 || j6 >= 4611686018427L) ? j(E7.j.l(j6, -4611686018427387903L, 4611686018427387903L)) : l(n(j6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long l(long j6) {
        return T8.a.s(j6 << 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(long j6) {
        return (-4611686018426999999L > j6 || j6 >= 4611686018427000000L) ? j(o(j6)) : l(j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long n(long j6) {
        return j6 * ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long o(long j6) {
        return j6 / ((long) 1000000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long p(java.lang.String str, boolean z6) {
        char cCharAt;
        char cCharAt2;
        long jT;
        char cCharAt3;
        int length = str.length();
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("The string is empty");
        }
        T8.a.C0279a c0279a = T8.a.f13312D;
        long jC = c0279a.c();
        char cCharAt4 = str.charAt(0);
        boolean z10 = true;
        int length2 = (cCharAt4 == '+' || cCharAt4 == '-') ? 1 : 0;
        boolean z11 = length2 > 0;
        boolean z12 = z11 && S8.r.a1(str, '-', false, 2, null);
        if (length <= length2) {
            throw new java.lang.IllegalArgumentException("No components");
        }
        char c6 = ':';
        char c10 = '0';
        if (str.charAt(length2) == 'P') {
            int i6 = length2 + 1;
            if (i6 == length) {
                throw new java.lang.IllegalArgumentException();
            }
            T8.d dVar = null;
            boolean z13 = false;
            while (i6 < length) {
                if (str.charAt(i6) != 'T') {
                    int i10 = i6;
                    while (i10 < str.length() && ((c10 <= (cCharAt3 = str.charAt(i10)) && cCharAt3 < c6) || S8.r.b0("+-.", cCharAt3, false, 2, null))) {
                        i10++;
                        c6 = ':';
                        c10 = '0';
                    }
                    p247y7.AbstractC7350t.d(str, "null cannot be cast to non-null type java.lang.String");
                    java.lang.String strSubstring = str.substring(i6, i10);
                    p247y7.AbstractC7350t.e(strSubstring, "substring(...)");
                    if (strSubstring.length() == 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    int length3 = i6 + strSubstring.length();
                    if (length3 < 0 || length3 >= str.length()) {
                        throw new java.lang.IllegalArgumentException("Missing unit for value " + strSubstring);
                    }
                    char cCharAt5 = str.charAt(length3);
                    int i11 = length3 + 1;
                    T8.d dVarD = T8.f.d(cCharAt5, z13);
                    if (dVar != null && dVar.compareTo(dVarD) <= 0) {
                        throw new java.lang.IllegalArgumentException("Unexpected order of duration components");
                    }
                    int iO0 = S8.r.o0(strSubstring, '.', 0, false, 6, null);
                    if (dVarD != T8.d.SECONDS || iO0 <= 0) {
                        jT = t(q(strSubstring), dVarD);
                    } else {
                        p247y7.AbstractC7350t.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        java.lang.String strSubstring2 = strSubstring.substring(0, iO0);
                        p247y7.AbstractC7350t.e(strSubstring2, "substring(...)");
                        jC = T8.a.O(jC, t(q(strSubstring2), dVarD));
                        p247y7.AbstractC7350t.d(strSubstring, "null cannot be cast to non-null type java.lang.String");
                        java.lang.String strSubstring3 = strSubstring.substring(iO0);
                        p247y7.AbstractC7350t.e(strSubstring3, "substring(...)");
                        jT = r(java.lang.Double.parseDouble(strSubstring3), dVarD);
                    }
                    jC = T8.a.O(jC, jT);
                    i6 = i11;
                    dVar = dVarD;
                    c6 = ':';
                    c10 = '0';
                    z10 = true;
                } else {
                    if (z13 || (i6 = i6 + 1) == length) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    z13 = z10;
                }
            }
        } else {
            if (z6) {
                throw new java.lang.IllegalArgumentException();
            }
            java.lang.String str2 = "Unexpected order of duration components";
            long jO = jC;
            if (S8.r.M(str, length2, "Infinity", 0, java.lang.Math.max(length - length2, 8), true)) {
                jC = c0279a.a();
            } else {
                boolean z14 = !z11;
                if (z11 && str.charAt(length2) == '(' && S8.r.z1(str) == ')') {
                    length2++;
                    length--;
                    if (length2 == length) {
                        throw new java.lang.IllegalArgumentException("No components");
                    }
                    z14 = true;
                }
                T8.d dVar2 = null;
                boolean z15 = false;
                while (length2 < length) {
                    if (z15 && z14) {
                        while (length2 < str.length() && str.charAt(length2) == ' ') {
                            length2++;
                        }
                    }
                    int i12 = length2;
                    while (i12 < str.length() && (('0' <= (cCharAt2 = str.charAt(i12)) && cCharAt2 < ':') || cCharAt2 == '.')) {
                        i12++;
                    }
                    p247y7.AbstractC7350t.d(str, "null cannot be cast to non-null type java.lang.String");
                    java.lang.String strSubstring4 = str.substring(length2, i12);
                    p247y7.AbstractC7350t.e(strSubstring4, "substring(...)");
                    if (strSubstring4.length() == 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    int length4 = length2 + strSubstring4.length();
                    int i13 = length4;
                    while (i13 < str.length() && 'a' <= (cCharAt = str.charAt(i13)) && cCharAt < '{') {
                        i13++;
                    }
                    p247y7.AbstractC7350t.d(str, "null cannot be cast to non-null type java.lang.String");
                    java.lang.String strSubstring5 = str.substring(length4, i13);
                    p247y7.AbstractC7350t.e(strSubstring5, "substring(...)");
                    length2 = length4 + strSubstring5.length();
                    T8.d dVarE = T8.f.e(strSubstring5);
                    if (dVar2 != null && dVar2.compareTo(dVarE) <= 0) {
                        throw new java.lang.IllegalArgumentException(str2);
                    }
                    java.lang.String str3 = str2;
                    int iO1 = S8.r.o0(strSubstring4, '.', 0, false, 6, null);
                    if (iO1 > 0) {
                        p247y7.AbstractC7350t.d(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        java.lang.String strSubstring6 = strSubstring4.substring(0, iO1);
                        p247y7.AbstractC7350t.e(strSubstring6, "substring(...)");
                        long jO2 = T8.a.O(jO, t(java.lang.Long.parseLong(strSubstring6), dVarE));
                        p247y7.AbstractC7350t.d(strSubstring4, "null cannot be cast to non-null type java.lang.String");
                        java.lang.String strSubstring7 = strSubstring4.substring(iO1);
                        p247y7.AbstractC7350t.e(strSubstring7, "substring(...)");
                        jO = T8.a.O(jO2, r(java.lang.Double.parseDouble(strSubstring7), dVarE));
                        if (length2 < length) {
                            length2 = length2;
                            throw new java.lang.IllegalArgumentException("Fractional component must be last");
                        }
                        length2 = length2;
                    } else {
                        jO = T8.a.O(jO, t(java.lang.Long.parseLong(strSubstring4), dVarE));
                    }
                    str2 = str3;
                    dVar2 = dVarE;
                    z15 = true;
                }
                jC = jO;
            }
        }
        return z12 ? T8.a.S(jC) : jC;
    }

    private static final long q(java.lang.String str) {
        int length = str.length();
        int i6 = (length <= 0 || !S8.r.b0("+-", str.charAt(0), false, 2, null)) ? 0 : 1;
        if (length - i6 > 16) {
            java.lang.Iterable iVar = new E7.i(i6, S8.r.j0(str));
            if (!(iVar instanceof java.util.Collection) || !((java.util.Collection) iVar).isEmpty()) {
                java.util.Iterator it = iVar.iterator();
                while (true) {
                    if (it.hasNext()) {
                        char cCharAt = str.charAt(((p097j7.O) it).b());
                        if ('0' > cCharAt || cCharAt >= ':') {
                        }
                    }
                }
            }
            return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        if (S8.r.V(str, "+", false, 2, null)) {
            str = S8.r.w1(str, 1);
        }
        return java.lang.Long.parseLong(str);
    }

    public static final long r(double d6, T8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "unit");
        double dA = T8.e.a(d6, dVar, T8.d.NANOSECONDS);
        if (!(!java.lang.Double.isNaN(dA))) {
            throw new java.lang.IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long jE = A7.a.e(dA);
        return (-4611686018426999999L > jE || jE >= 4611686018427000000L) ? k(A7.a.e(T8.e.a(d6, dVar, T8.d.MILLISECONDS))) : l(jE);
    }

    public static final long s(int i6, T8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "unit");
        return dVar.compareTo(T8.d.SECONDS) <= 0 ? l(T8.e.c(i6, dVar, T8.d.NANOSECONDS)) : t(i6, dVar);
    }

    public static final long t(long j6, T8.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "unit");
        T8.d dVar2 = T8.d.NANOSECONDS;
        long jC = T8.e.c(4611686018426999999L, dVar2, dVar);
        return ((-jC) > j6 || j6 > jC) ? j(E7.j.l(T8.e.b(j6, dVar, T8.d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : l(T8.e.c(j6, dVar, dVar2));
    }
}
