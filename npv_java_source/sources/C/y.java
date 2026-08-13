package C;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C.G f1208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C.w f1211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C.J f1212f;

    public y(boolean z6, C.G g6, int i6, int i10, C.w wVar, C.J j6) {
        this.f1207a = z6;
        this.f1208b = g6;
        this.f1209c = i6;
        this.f1210d = i10;
        this.f1211e = wVar;
        this.f1212f = j6;
    }

    public final long a(int i6, int i10) {
        int i11;
        if (i10 == 1) {
            i11 = this.f1208b.b()[i6];
        } else {
            int i12 = (i10 + i6) - 1;
            i11 = (this.f1208b.a()[i12] + this.f1208b.b()[i12]) - this.f1208b.a()[i6];
        }
        int iD = E7.j.d(i11, 0);
        return this.f1207a ? Y0.C1859b.f16201b.e(iD) : Y0.C1859b.f16201b.d(iD);
    }

    public abstract C.x b(int i6, C.v[] vVarArr, java.util.List list, int i10);

    public final C.x c(int i6) {
        C.J.c cVarC = this.f1212f.c(i6);
        int size = cVarC.b().size();
        int i10 = (size == 0 || cVarC.a() + size == this.f1209c) ? 0 : this.f1210d;
        C.v[] vVarArr = new C.v[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int iD = C.C0829c.d(((C.C0829c) cVarC.b().get(i12)).g());
            C.v vVarD = this.f1211e.d(cVarC.a() + i12, a(i11, iD), i11, iD, i10);
            i11 += iD;
            p087i7.M m6 = p087i7.M.f46721a;
            vVarArr[i12] = vVarD;
        }
        return b(i6, vVarArr, cVarC.b(), i10);
    }

    public final int d(int i6) {
        C.J j6 = this.f1212f;
        return j6.i(i6, j6.e());
    }
}
