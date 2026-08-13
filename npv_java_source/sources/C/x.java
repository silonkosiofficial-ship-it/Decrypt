package C;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C.v[] f1200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C.G f1201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.List f1202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f1205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f1206h;

    public x(int i6, C.v[] vVarArr, C.G g6, java.util.List list, boolean z6, int i10) {
        this.f1199a = i6;
        this.f1200b = vVarArr;
        this.f1201c = g6;
        this.f1202d = list;
        this.f1203e = z6;
        this.f1204f = i10;
        int iMax = 0;
        for (C.v vVar : vVarArr) {
            iMax = java.lang.Math.max(iMax, vVar.q());
        }
        this.f1205g = iMax;
        this.f1206h = E7.j.d(iMax + this.f1204f, 0);
    }

    public final int a() {
        return this.f1199a;
    }

    public final C.v[] b() {
        return this.f1200b;
    }

    public final int c() {
        return this.f1205g;
    }

    public final int d() {
        return this.f1206h;
    }

    public final boolean e() {
        return this.f1200b.length == 0;
    }

    public final C.v[] f(int i6, int i10, int i11) {
        C.v[] vVarArr = this.f1200b;
        int length = vVarArr.length;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < length) {
            C.v vVar = vVarArr[i12];
            int i15 = i13 + 1;
            int iD = C.C0829c.d(((C.C0829c) this.f1202d.get(i13)).g());
            int i16 = this.f1201c.a()[i14];
            boolean z6 = this.f1203e;
            vVar.u(i6, i16, i10, i11, z6 ? this.f1199a : i14, z6 ? i14 : this.f1199a);
            p087i7.M m6 = p087i7.M.f46721a;
            i14 += iD;
            i12++;
            i13 = i15;
        }
        return this.f1200b;
    }
}
