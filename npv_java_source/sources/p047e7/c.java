package p047e7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final io.ktor.utils.io.d a(java.io.InputStream inputStream, p127m7.i iVar, p057f7.c cVar) {
        p247y7.AbstractC7350t.f(inputStream, "<this>");
        p247y7.AbstractC7350t.f(iVar, "context");
        p247y7.AbstractC7350t.f(cVar, "pool");
        return new p047e7.b(p149o9.e.a(inputStream), iVar);
    }

    public static /* synthetic */ io.ktor.utils.io.d b(java.io.InputStream inputStream, p127m7.i iVar, p057f7.c cVar, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            iVar = W8.C1779d0.b();
        }
        if ((i6 & 2) != 0) {
            cVar = p057f7.a.a();
        }
        return a(inputStream, iVar, cVar);
    }
}
