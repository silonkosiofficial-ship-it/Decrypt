package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s {
    private static final java.lang.String a(p149o9.a aVar, long j6) throws java.io.EOFException {
        if (j6 == 0) {
            return "";
        }
        p189s9.d dVar = p189s9.d.f54410a;
        p149o9.k kVarO = aVar.o();
        if (kVarO == null) {
            throw new java.lang.IllegalStateException("Unreacheable".toString());
        }
        p189s9.b unused = p189s9.e.f54411a;
        if (kVarO.j() < j6) {
            return p179r9.a.b(p149o9.r.b(aVar, (int) j6), 0, 0, 3, null);
        }
        byte[] bArrB = kVarO.b(true);
        int iF = kVarO.f();
        java.lang.String strA = p179r9.a.a(bArrB, iF, java.lang.Math.min(kVarO.d(), ((int) j6) + iF));
        aVar.skip(j6);
        return strA;
    }

    public static final java.lang.String b(p149o9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        qVar.G0(Long.MAX_VALUE);
        return a(qVar.d(), qVar.d().r());
    }

    public static final java.lang.String c(p149o9.q qVar, long j6) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        qVar.q(j6);
        return a(qVar.d(), j6);
    }

    public static final void d(p149o9.p pVar, java.lang.String str, int i6, int i10) {
        p247y7.AbstractC7350t.f(pVar, "<this>");
        p247y7.AbstractC7350t.f(str, "string");
        int i11 = i6;
        p149o9.t.a(str.length(), i11, i10);
        p149o9.a aVarD = pVar.d();
        while (i11 < i10) {
            p247y7.M m6 = new p247y7.M();
            char cCharAt = str.charAt(i11);
            m6.f57252C = cCharAt;
            if (cCharAt < 128) {
                p189s9.d dVar = p189s9.d.f54410a;
                p149o9.k kVarN0 = aVarD.n0(1);
                p189s9.c cVar = p189s9.e.f54412b;
                int i12 = -i11;
                int iMin = java.lang.Math.min(i10, kVarN0.h() + i11);
                cVar.c(kVarN0, i11 + i12, (byte) m6.f57252C);
                i11++;
                while (i11 < iMin) {
                    char cCharAt2 = str.charAt(i11);
                    m6.f57252C = cCharAt2;
                    if (cCharAt2 >= 128) {
                        break;
                    }
                    cVar.c(kVarN0, i11 + i12, (byte) cCharAt2);
                    i11++;
                }
                int i13 = i12 + i11;
                if (i13 != 1) {
                    if (i13 < 0 || i13 > kVarN0.h()) {
                        throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + i13 + ". Should be in 0.." + kVarN0.h()).toString());
                    }
                    if (i13 == 0) {
                        if (p149o9.m.a(kVarN0)) {
                            aVarD.H();
                        }
                    }
                }
                kVarN0.q(kVarN0.d() + i13);
                aVarD.R(aVarD.s() + ((long) i13));
            } else {
                if (cCharAt < 2048) {
                    p189s9.d dVar2 = p189s9.d.f54410a;
                    p149o9.k kVarN1 = aVarD.n0(2);
                    p189s9.c cVar2 = p189s9.e.f54412b;
                    int i14 = m6.f57252C;
                    cVar2.a(kVarN1, 0, (byte) ((i14 >> 6) | 192), (byte) ((i14 & 63) | 128));
                    kVarN1.q(kVarN1.d() + 2);
                    aVarD.R(aVarD.s() + ((long) 2));
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    p189s9.d dVar3 = p189s9.d.f54410a;
                    p149o9.k kVarN2 = aVarD.n0(3);
                    p189s9.c cVar3 = p189s9.e.f54412b;
                    int i15 = m6.f57252C;
                    cVar3.d(kVarN2, 0, (byte) ((i15 >> 12) | 224), (byte) (((i15 >> 6) & 63) | 128), (byte) ((i15 & 63) | 128));
                    kVarN2.q(kVarN2.d() + 3);
                    aVarD.R(aVarD.s() + ((long) 3));
                } else {
                    int i16 = i11 + 1;
                    char cCharAt3 = i16 < i10 ? str.charAt(i16) : (char) 0;
                    int i17 = m6.f57252C;
                    if (i17 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        aVarD.o0((byte) 63);
                        i11 = i16;
                    } else {
                        int i18 = (((i17 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        p189s9.d dVar4 = p189s9.d.f54410a;
                        p149o9.k kVarN3 = aVarD.n0(4);
                        p189s9.e.f54412b.b(kVarN3, 0, (byte) ((i18 >> 18) | 240), (byte) (((i18 >> 12) & 63) | 128), (byte) (((i18 >> 6) & 63) | 128), (byte) ((i18 & 63) | 128));
                        kVarN3.q(kVarN3.d() + 4);
                        aVarD.R(aVarD.s() + ((long) 4));
                        i11 += 2;
                    }
                }
                i11++;
            }
        }
        pVar.J0();
    }
}
