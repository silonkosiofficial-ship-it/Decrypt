package p149o9;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ void a(p149o9.p pVar, byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
        }
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        pVar.write(bArr, i6, i10);
    }
}
