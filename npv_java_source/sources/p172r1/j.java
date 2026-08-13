package p172r1;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends p172r1.e implements p172r1.i {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public p172r1.e[] f53792w0 = new p172r1.e[4];

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f53793x0 = 0;

    @Override // p172r1.i
    public void a(p172r1.f fVar) {
    }

    @Override // p172r1.i
    public void b(p172r1.e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i6 = this.f53793x0 + 1;
        p172r1.e[] eVarArr = this.f53792w0;
        if (i6 > eVarArr.length) {
            this.f53792w0 = (p172r1.e[]) java.util.Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        p172r1.e[] eVarArr2 = this.f53792w0;
        int i10 = this.f53793x0;
        eVarArr2[i10] = eVar;
        this.f53793x0 = i10 + 1;
    }

    @Override // p172r1.i
    public void c() {
        this.f53793x0 = 0;
        java.util.Arrays.fill(this.f53792w0, (java.lang.Object) null);
    }
}
