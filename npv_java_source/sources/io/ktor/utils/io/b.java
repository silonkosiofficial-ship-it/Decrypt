package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final io.ktor.utils.io.d a(p149o9.q qVar) {
        p247y7.AbstractC7350t.f(qVar, "source");
        return new io.ktor.utils.io.r(qVar);
    }

    public static final io.ktor.utils.io.d b(byte[] bArr, int i6, int i10) {
        p247y7.AbstractC7350t.f(bArr, "content");
        p149o9.a aVar = new p149o9.a();
        aVar.write(bArr, i6, i10 + i6);
        return a(aVar);
    }

    public static /* synthetic */ io.ktor.utils.io.d c(byte[] bArr, int i6, int i10, int i11, java.lang.Object obj) {
        if ((i11 & 2) != 0) {
            i6 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = bArr.length;
        }
        return b(bArr, i6, i10);
    }
}
