package p098j8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static final p087i7.u a(java.io.InputStream inputStream) throws java.io.IOException {
        p088i8.m mVarW;
        p247y7.AbstractC7350t.f(inputStream, "<this>");
        try {
            p098j8.a aVarA = p098j8.a.f49319g.a(inputStream);
            if (aVarA.h()) {
                p158p8.g gVarD = p158p8.g.d();
                p098j8.b.a(gVarD);
                mVarW = p088i8.m.W(inputStream, gVarD);
            } else {
                mVarW = null;
            }
            p087i7.u uVarA = p087i7.B.a(mVarW, aVarA);
            p197t7.b.a(inputStream, null);
            return uVarA;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                p197t7.b.a(inputStream, th);
                throw th2;
            }
        }
    }
}
