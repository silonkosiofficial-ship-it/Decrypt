package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    /* JADX WARN: Code duplicated, block: B:4:0x002a  */
    public static final java.lang.Object a(io.ktor.utils.io.g gVar, int i6, p237x7.l lVar, p127m7.e eVar) {
        p189s9.d dVar = p189s9.d.f54410a;
        p149o9.a aVarD = gVar.c().d();
        p149o9.k kVarN0 = aVarD.n0(i6);
        byte[] bArrB = kVarN0.b(false);
        int iD = kVarN0.d();
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(bArrB, iD, bArrB.length - iD);
        p247y7.AbstractC7350t.c(byteBufferWrap);
        lVar.l(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - iD;
        if (iPosition == i6) {
            kVarN0.B(bArrB, iPosition);
            kVarN0.q(kVarN0.d() + iPosition);
            aVarD.R(aVarD.s() + ((long) iPosition));
        } else {
            if (iPosition < 0 || iPosition > kVarN0.h()) {
                throw new java.lang.IllegalStateException(("Invalid number of bytes written: " + iPosition + ". Should be in 0.." + kVarN0.h()).toString());
            }
            if (iPosition != 0) {
                kVarN0.B(bArrB, iPosition);
                kVarN0.q(kVarN0.d() + iPosition);
                aVarD.R(aVarD.s() + ((long) iPosition));
            } else if (p149o9.m.a(kVarN0)) {
                aVarD.H();
            }
        }
        java.lang.Object objG = gVar.g(eVar);
        return objG == p137n7.b.g() ? objG : p087i7.M.f46721a;
    }

    public static /* synthetic */ java.lang.Object b(io.ktor.utils.io.g gVar, int i6, p237x7.l lVar, p127m7.e eVar, int i10, java.lang.Object obj) {
        if ((i10 & 1) != 0) {
            i6 = 1;
        }
        return a(gVar, i6, lVar, eVar);
    }
}
