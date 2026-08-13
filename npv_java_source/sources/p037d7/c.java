package p037d7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final p149o9.p a() {
        return new p149o9.a();
    }

    public static final p149o9.q b(p149o9.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "<this>");
        return pVar.d();
    }

    public static final int c(p149o9.p pVar) {
        p247y7.AbstractC7350t.f(pVar, "<this>");
        return (int) pVar.d().r();
    }

    public static final void d(p149o9.p pVar, byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(pVar, "<this>");
        p247y7.AbstractC7350t.f(bArr, "buffer");
        pVar.write(bArr, i6, i10 + i6);
    }

    public static /* synthetic */ void e(p149o9.p pVar, byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length - i6;
        }
        d(pVar, bArr, i6, i10);
    }

    public static final void f(p149o9.p pVar, p149o9.q qVar) {
        p247y7.AbstractC7350t.f(pVar, "<this>");
        p247y7.AbstractC7350t.f(qVar, "packet");
        pVar.X(qVar);
    }
}
