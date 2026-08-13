package p122m1;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends p122m1.e implements p122m1.i {

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private p122m1.e[] f50456G0 = new p122m1.e[4];

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private int f50457H0;

    public void a2(p122m1.e eVar) {
        if (p247y7.AbstractC7350t.b(eVar, this) || eVar == null) {
            return;
        }
        int i6 = this.f50457H0 + 1;
        p122m1.e[] eVarArr = this.f50456G0;
        if (i6 > eVarArr.length) {
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(eVarArr, eVarArr.length * 2);
            p247y7.AbstractC7350t.e(objArrCopyOf, "copyOf(...)");
            this.f50456G0 = (p122m1.e[]) objArrCopyOf;
        }
        p122m1.e[] eVarArr2 = this.f50456G0;
        int i10 = this.f50457H0;
        eVarArr2[i10] = eVar;
        this.f50457H0 = i10 + 1;
    }

    public void b2(java.util.ArrayList arrayList, int i6, p132n1.o oVar) {
        p247y7.AbstractC7350t.f(arrayList, "dependencyLists");
        int i10 = this.f50457H0;
        for (int i11 = 0; i11 < i10; i11++) {
            p122m1.e eVar = this.f50456G0[i11];
            p247y7.AbstractC7350t.c(eVar);
            p247y7.AbstractC7350t.c(oVar);
            oVar.a(eVar);
        }
        int i12 = this.f50457H0;
        for (int i13 = 0; i13 < i12; i13++) {
            p122m1.e eVar2 = this.f50456G0[i13];
            p247y7.AbstractC7350t.c(eVar2);
            p132n1.i.f51397a.a(eVar2, i6, arrayList, oVar);
        }
    }

    public int c2(int i6) {
        int i10 = this.f50457H0;
        for (int i11 = 0; i11 < i10; i11++) {
            p122m1.e eVar = this.f50456G0[i11];
            p247y7.AbstractC7350t.c(eVar);
            if (i6 == 0 && eVar.B() != -1) {
                return eVar.B();
            }
            if (i6 == 1 && eVar.z0() != -1) {
                return eVar.z0();
            }
        }
        return -1;
    }

    public final p122m1.e[] d2() {
        return this.f50456G0;
    }

    public final int e2() {
        return this.f50457H0;
    }
}
