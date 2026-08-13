package N3;

/* JADX INFO: loaded from: classes.dex */
abstract class x extends Q3.v0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final int f7681C;

    protected x(byte[] bArr) {
        Q3.AbstractC1477p.a(bArr.length == 25);
        this.f7681C = java.util.Arrays.hashCode(bArr);
    }

    protected static byte[] L0(java.lang.String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.AssertionError(e6);
        }
    }

    @Override // Q3.S
    public final int c() {
        return this.f7681C;
    }

    abstract byte[] c2();

    public final boolean equals(java.lang.Object obj) {
        X3.a aVarF;
        if (obj != null && (obj instanceof Q3.S)) {
            try {
                Q3.S s6 = (Q3.S) obj;
                if (s6.c() == this.f7681C && (aVarF = s6.f()) != null) {
                    return java.util.Arrays.equals(c2(), (byte[]) X3.b.L0(aVarF));
                }
                return false;
            } catch (android.os.RemoteException e6) {
            }
        }
        return false;
    }

    @Override // Q3.S
    public final X3.a f() {
        return X3.b.c2(c2());
    }

    public final int hashCode() {
        return this.f7681C;
    }
}
