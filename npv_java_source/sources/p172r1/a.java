package p172r1;

/* JADX INFO: loaded from: classes.dex */
public class a extends p172r1.j {

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f53596y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private boolean f53597z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private int f53595A0 = 0;

    public boolean K0() {
        return this.f53597z0;
    }

    public int L0() {
        return this.f53596y0;
    }

    public int M0() {
        return this.f53595A0;
    }

    protected void N0() {
        for (int i6 = 0; i6 < this.f53793x0; i6++) {
            p172r1.e eVar = this.f53792w0[i6];
            int i10 = this.f53596y0;
            if (i10 == 0 || i10 == 1) {
                eVar.o0(0, true);
            } else if (i10 == 2 || i10 == 3) {
                eVar.o0(1, true);
            }
        }
    }

    public void O0(boolean z6) {
        this.f53597z0 = z6;
    }

    public void P0(int i6) {
        this.f53596y0 = i6;
    }

    public void Q0(int i6) {
        this.f53595A0 = i6;
    }

    @Override // p172r1.e
    public void f(p162q1.d dVar) {
        p172r1.d[] dVarArr;
        boolean z6;
        p162q1.i iVar;
        p172r1.d dVar2;
        int i6;
        int i10;
        int i11;
        p172r1.d[] dVarArr2 = this.f53648J;
        dVarArr2[0] = this.f53640B;
        dVarArr2[2] = this.f53641C;
        dVarArr2[1] = this.f53642D;
        dVarArr2[3] = this.f53643E;
        int i12 = 0;
        while (true) {
            dVarArr = this.f53648J;
            if (i12 >= dVarArr.length) {
                break;
            }
            p172r1.d dVar3 = dVarArr[i12];
            dVar3.f53626g = dVar.q(dVar3);
            i12++;
        }
        int i13 = this.f53596y0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        p172r1.d dVar4 = dVarArr[i13];
        int i14 = 0;
        while (true) {
            if (i14 >= this.f53793x0) {
                z6 = false;
                break;
            }
            p172r1.e eVar = this.f53792w0[i14];
            if ((this.f53597z0 || eVar.g()) && ((((i10 = this.f53596y0) == 0 || i10 == 1) && eVar.y() == r1.e.b.MATCH_CONSTRAINT && eVar.f53640B.f53623d != null && eVar.f53642D.f53623d != null) || (((i11 = this.f53596y0) == 2 || i11 == 3) && eVar.M() == r1.e.b.MATCH_CONSTRAINT && eVar.f53641C.f53623d != null && eVar.f53643E.f53623d != null))) {
                z6 = true;
                break;
            }
            i14++;
        }
        boolean z10 = this.f53640B.i() || this.f53642D.i();
        boolean z11 = this.f53641C.i() || this.f53643E.i();
        int i15 = !(!z6 && (((i6 = this.f53596y0) == 0 && z10) || ((i6 == 2 && z11) || ((i6 == 1 && z10) || (i6 == 3 && z11))))) ? 4 : 5;
        for (int i16 = 0; i16 < this.f53793x0; i16++) {
            p172r1.e eVar2 = this.f53792w0[i16];
            if (this.f53597z0 || eVar2.g()) {
                p162q1.i iVarQ = dVar.q(eVar2.f53648J[this.f53596y0]);
                p172r1.d[] dVarArr3 = eVar2.f53648J;
                int i17 = this.f53596y0;
                p172r1.d dVar5 = dVarArr3[i17];
                dVar5.f53626g = iVarQ;
                p172r1.d dVar6 = dVar5.f53623d;
                int i18 = (dVar6 == null || dVar6.f53621b != this) ? 0 : dVar5.f53624e;
                if (i17 == 0 || i17 == 2) {
                    dVar.i(dVar4.f53626g, iVarQ, this.f53595A0 - i18, z6);
                } else {
                    dVar.g(dVar4.f53626g, iVarQ, this.f53595A0 + i18, z6);
                }
                dVar.e(dVar4.f53626g, iVarQ, this.f53595A0 + i18, i15);
            }
        }
        int i19 = this.f53596y0;
        if (i19 == 0) {
            dVar.e(this.f53642D.f53626g, this.f53640B.f53626g, 0, 8);
            dVar.e(this.f53640B.f53626g, this.f53652N.f53642D.f53626g, 0, 4);
            iVar = this.f53640B.f53626g;
            dVar2 = this.f53652N.f53640B;
        } else if (i19 == 1) {
            dVar.e(this.f53640B.f53626g, this.f53642D.f53626g, 0, 8);
            dVar.e(this.f53640B.f53626g, this.f53652N.f53640B.f53626g, 0, 4);
            iVar = this.f53640B.f53626g;
            dVar2 = this.f53652N.f53642D;
        } else if (i19 == 2) {
            dVar.e(this.f53643E.f53626g, this.f53641C.f53626g, 0, 8);
            dVar.e(this.f53641C.f53626g, this.f53652N.f53643E.f53626g, 0, 4);
            iVar = this.f53641C.f53626g;
            dVar2 = this.f53652N.f53641C;
        } else {
            if (i19 != 3) {
                return;
            }
            dVar.e(this.f53641C.f53626g, this.f53643E.f53626g, 0, 8);
            dVar.e(this.f53641C.f53626g, this.f53652N.f53641C.f53626g, 0, 4);
            iVar = this.f53641C.f53626g;
            dVar2 = this.f53652N.f53643E;
        }
        dVar.e(iVar, dVar2.f53626g, 0, 0);
    }

    @Override // p172r1.e
    public boolean g() {
        return true;
    }

    @Override // p172r1.e
    public java.lang.String toString() {
        java.lang.String str = "[Barrier] " + r() + " {";
        for (int i6 = 0; i6 < this.f53793x0; i6++) {
            p172r1.e eVar = this.f53792w0[i6];
            if (i6 > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }
}
