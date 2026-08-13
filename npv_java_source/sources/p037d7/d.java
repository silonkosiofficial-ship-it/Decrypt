package p037d7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p149o9.q f44298a = new p149o9.a();

    public static final p149o9.q a(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "array");
        p149o9.a aVar = new p149o9.a();
        aVar.write(bArr, i6, i10 + i6);
        return aVar;
    }

    public static /* synthetic */ p149o9.q b(byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return a(bArr, i6, i10);
    }

    public static final p149o9.q c(p149o9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        return qVar.d().g();
    }

    public static final long d(p149o9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        return qVar.d().r();
    }

    public static final void e(p149o9.q qVar, p237x7.l lVar) {
        p247y7.AbstractC7350t.f(qVar, "<this>");
        p247y7.AbstractC7350t.f(lVar, "block");
        while (!qVar.j() && ((java.lang.Boolean) lVar.l(qVar.d())).booleanValue()) {
        }
    }
}
