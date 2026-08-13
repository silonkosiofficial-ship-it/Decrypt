package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static final byte[] a(p149o9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        return c(qVar, -1);
    }

    public static final byte[] b(p149o9.q qVar, int i6) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        long j6 = i6;
        if (j6 >= 0) {
            return c(qVar, i6);
        }
        throw new java.lang.IllegalArgumentException(("byteCount (" + j6 + ") < 0").toString());
    }

    private static final byte[] c(p149o9.q qVar, int i6) throws java.io.EOFException {
        if (i6 == -1) {
            for (long j6 = 2147483647L; qVar.d().r() < 2147483647L && qVar.G0(j6); j6 *= (long) 2) {
            }
            if (qVar.d().r() >= 2147483647L) {
                throw new java.lang.IllegalStateException(("Can't create an array of size " + qVar.d().r()).toString());
            }
            i6 = (int) qVar.d().r();
        } else {
            qVar.q(i6);
        }
        byte[] bArr = new byte[i6];
        e(qVar.d(), bArr, 0, 0, 6, null);
        return bArr;
    }

    public static final void d(p149o9.q qVar, byte[] bArr, int i6, int i10) throws java.io.EOFException {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        p247y7.AbstractC7350t.f(bArr, "sink");
        p149o9.t.a(bArr.length, i6, i10);
        int i11 = i6;
        while (i11 < i10) {
            int iV = qVar.V(bArr, i11, i10);
            if (iV == -1) {
                throw new java.io.EOFException("Source exhausted before reading " + (i10 - i6) + " bytes. Only " + iV + " bytes were read.");
            }
            i11 += iV;
        }
    }

    public static /* synthetic */ void e(p149o9.q qVar, byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) throws java.io.EOFException {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        d(qVar, bArr, i6, i10);
    }
}
