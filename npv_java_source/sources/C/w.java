package C;

/* JADX INFO: loaded from: classes.dex */
public abstract class w implements D.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.InterfaceC0838l f1196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D.w f1197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1198c;

    public w(C.InterfaceC0838l interfaceC0838l, D.w wVar, int i6) {
        this.f1196a = interfaceC0838l;
        this.f1197b = wVar;
        this.f1198c = i6;
    }

    public abstract C.v b(int i6, java.lang.Object obj, java.lang.Object obj2, int i10, int i11, java.util.List list, long j6, int i12, int i13);

    @Override // D.z
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C.v a(int i6, int i10, int i11, long j6) {
        return d(i6, j6, i10, i11, this.f1198c);
    }

    public final C.v d(int i6, long j6, int i10, int i11, int i12) {
        int iM;
        java.lang.Object objB = this.f1196a.b(i6);
        java.lang.Object objE = this.f1196a.e(i6);
        java.util.List listP0 = this.f1197b.p0(i6, j6);
        if (Y0.C1859b.j(j6)) {
            iM = Y0.C1859b.n(j6);
        } else {
            if (!Y0.C1859b.i(j6)) {
                throw new java.lang.IllegalArgumentException("does not have fixed height".toString());
            }
            iM = Y0.C1859b.m(j6);
        }
        return b(i6, objB, objE, iM, i12, listP0, j6, i10, i11);
    }

    public final androidx.compose.foundation.lazy.layout.c e() {
        return this.f1196a.c();
    }
}
