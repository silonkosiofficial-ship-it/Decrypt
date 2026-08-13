package p172r1;

/* JADX INFO: loaded from: classes.dex */
public class f extends p172r1.m {

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    int f53721C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    int f53722D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    int f53723E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    int f53724F0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    p182s1.b f53739x0 = new p182s1.b(this);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public p182s1.e f53740y0 = new p182s1.e(this);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    protected p182s1.b.InterfaceC0704b f53741z0 = null;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private boolean f53719A0 = false;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    protected p162q1.d f53720B0 = new p162q1.d();

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    int f53725G0 = 0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    int f53726H0 = 0;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    p172r1.c[] f53727I0 = new p172r1.c[4];

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    p172r1.c[] f53728J0 = new p172r1.c[4];

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public boolean f53729K0 = false;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public boolean f53730L0 = false;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public boolean f53731M0 = false;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public int f53732N0 = 0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public int f53733O0 = 0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    private int f53734P0 = 263;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public boolean f53735Q0 = false;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    private boolean f53736R0 = false;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    private boolean f53737S0 = false;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    int f53738T0 = 0;

    private void P0(p172r1.e eVar) {
        int i6 = this.f53725G0 + 1;
        p172r1.c[] cVarArr = this.f53728J0;
        if (i6 >= cVarArr.length) {
            this.f53728J0 = (p172r1.c[]) java.util.Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f53728J0[this.f53725G0] = new p172r1.c(eVar, 0, a1());
        this.f53725G0++;
    }

    private void Q0(p172r1.e eVar) {
        int i6 = this.f53726H0 + 1;
        p172r1.c[] cVarArr = this.f53727I0;
        if (i6 >= cVarArr.length) {
            this.f53727I0 = (p172r1.c[]) java.util.Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f53727I0[this.f53726H0] = new p172r1.c(eVar, 1, a1());
        this.f53726H0++;
    }

    private void e1() {
        this.f53725G0 = 0;
        this.f53726H0 = 0;
    }

    @Override // p172r1.e
    public void I0(boolean z6, boolean z10) {
        super.I0(z6, z10);
        int size = this.f53808w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((p172r1.e) this.f53808w0.get(i6)).I0(z6, z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01c6 A[PHI: r0 r5
  0x01c6: PHI (r0v26 ??) = (r0v25 ??), (r0v28 ??), (r0v28 ??), (r0v28 ??) binds: [B:71:0x018b, B:79:0x01ae, B:80:0x01b0, B:82:0x01b6] A[DONT_GENERATE, DONT_INLINE]
  0x01c6: PHI (r5v11 boolean) = (r5v10 boolean), (r5v13 boolean), (r5v13 boolean), (r5v13 boolean) binds: [B:71:0x018b, B:79:0x01ae, B:80:0x01b0, B:82:0x01b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [boolean] */
    @Override // p172r1.m
    public void K0() {
        ?? r11;
        boolean z6;
        ?? r12;
        boolean z10;
        ?? r6;
        ?? r13;
        boolean z11;
        this.f53657S = 0;
        this.f53658T = 0;
        int iMax = java.lang.Math.max(0, P());
        int iMax2 = java.lang.Math.max(0, v());
        this.f53736R0 = false;
        this.f53737S0 = false;
        boolean z12 = d1(64) || d1(128);
        p162q1.d dVar = this.f53720B0;
        dVar.f52968g = false;
        dVar.f52969h = false;
        if (this.f53734P0 != 0 && z12) {
            dVar.f52969h = true;
        }
        r1.e.b[] bVarArr = this.f53651M;
        r1.e.b bVar = bVarArr[1];
        r1.e.b bVar2 = bVarArr[0];
        java.util.ArrayList arrayList = this.f53808w0;
        r1.e.b bVarY = y();
        r1.e.b bVar3 = r1.e.b.WRAP_CONTENT;
        boolean z13 = bVarY == bVar3 || M() == bVar3;
        e1();
        int size = this.f53808w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            p172r1.e eVar = (p172r1.e) this.f53808w0.get(i6);
            if (eVar instanceof p172r1.m) {
                ((p172r1.m) eVar).K0();
            }
        }
        int i10 = 0;
        boolean z14 = false;
        ?? r14 = 1;
        while (r14 != 0) {
            int i11 = i10 + 1;
            try {
                this.f53720B0.D();
                e1();
                l(this.f53720B0);
                for (int i12 = 0; i12 < size; i12++) {
                    ((p172r1.e) this.f53808w0.get(i12)).l(this.f53720B0);
                }
                boolean zO0 = O0(this.f53720B0);
                r11 = zO0;
                if (zO0) {
                    this.f53720B0.z();
                    r11 = zO0;
                }
            } catch (java.lang.Exception e6) {
                e6.printStackTrace();
                java.lang.System.out.println("EXCEPTION : " + e6);
                r11 = r14;
            }
            p162q1.d dVar2 = this.f53720B0;
            if (r11 != 0) {
                i1(dVar2, p172r1.k.f53794a);
            } else {
                J0(dVar2);
                for (int i13 = 0; i13 < size; i13++) {
                    ((p172r1.e) this.f53808w0.get(i13)).J0(this.f53720B0);
                }
            }
            if (z13 && i11 < 8 && p172r1.k.f53794a[2]) {
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    p172r1.e eVar2 = (p172r1.e) this.f53808w0.get(i14);
                    iMax3 = java.lang.Math.max(iMax3, eVar2.f53657S + eVar2.P());
                    iMax4 = java.lang.Math.max(iMax4, eVar2.f53658T + eVar2.v());
                }
                int iMax5 = java.lang.Math.max(this.f53664Z, iMax3);
                int iMax6 = java.lang.Math.max(this.f53666a0, iMax4);
                r1.e.b bVar4 = r1.e.b.WRAP_CONTENT;
                if (bVar2 != bVar4 || P() >= iMax5) {
                    z6 = false;
                    z14 = z14;
                } else {
                    E0(iMax5);
                    this.f53651M[0] = bVar4;
                    z6 = true;
                    z14 = true;
                }
                if (bVar == bVar4 && v() < iMax6) {
                    h0(iMax6);
                    this.f53651M[1] = bVar4;
                    z6 = true;
                    z14 = true;
                }
            } else {
                z6 = false;
            }
            int iMax7 = java.lang.Math.max(this.f53664Z, P());
            boolean z15 = z6;
            boolean z16 = z14;
            if (iMax7 > P()) {
                E0(iMax7);
                this.f53651M[0] = r1.e.b.FIXED;
                z15 = true;
                z16 = true;
            }
            int iMax8 = java.lang.Math.max(this.f53666a0, v());
            if (iMax8 > v()) {
                h0(iMax8);
                r12 = 1;
                this.f53651M[1] = r1.e.b.FIXED;
                r6 = 1;
                z10 = true;
            } else {
                r12 = 1;
                z10 = z16;
            }
            if (z10) {
                r6 = z15;
                r13 = r6;
                z11 = z10;
            } else {
                r6 = z15;
                r1.e.b bVar5 = this.f53651M[0];
                r1.e.b bVar6 = r1.e.b.WRAP_CONTENT;
                if (bVar5 == bVar6 && iMax > 0) {
                    r6 = r6;
                    z10 = z10;
                    if (P() > iMax) {
                        this.f53736R0 = r12;
                        this.f53651M[0] = r1.e.b.FIXED;
                        E0(iMax);
                        ?? r10 = r12;
                        z10 = r10 == true ? 1 : 0;
                        r6 = r10;
                    }
                }
                r6 = r6;
                r6 = r6;
                z10 = z10;
                z10 = z10;
                if (this.f53651M[r12] != bVar6 || iMax2 <= 0 || v() <= iMax2) {
                    r6 = z15;
                    r13 = r6;
                    z11 = z10;
                } else {
                    this.f53737S0 = r12;
                    this.f53651M[r12] = r1.e.b.FIXED;
                    h0(iMax2);
                    r13 = 1;
                    z11 = true;
                }
            }
            i10 = i11;
            r14 = r13;
            z14 = z11;
        }
        this.f53808w0 = arrayList;
        if (z14) {
            r1.e.b[] bVarArr2 = this.f53651M;
            bVarArr2[0] = bVar2;
            bVarArr2[1] = bVar;
        }
        a0(this.f53720B0.v());
    }

    void N0(p172r1.e eVar, int i6) {
        if (i6 == 0) {
            P0(eVar);
        } else if (i6 == 1) {
            Q0(eVar);
        }
    }

    public boolean O0(p162q1.d dVar) {
        f(dVar);
        int size = this.f53808w0.size();
        boolean z6 = false;
        for (int i6 = 0; i6 < size; i6++) {
            p172r1.e eVar = (p172r1.e) this.f53808w0.get(i6);
            eVar.o0(0, false);
            eVar.o0(1, false);
            if (eVar instanceof p172r1.a) {
                z6 = true;
            }
        }
        if (z6) {
            for (int i10 = 0; i10 < size; i10++) {
                p172r1.e eVar2 = (p172r1.e) this.f53808w0.get(i10);
                if (eVar2 instanceof p172r1.a) {
                    ((p172r1.a) eVar2).N0();
                }
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            p172r1.e eVar3 = (p172r1.e) this.f53808w0.get(i11);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            p172r1.e eVar4 = (p172r1.e) this.f53808w0.get(i12);
            if (eVar4 instanceof p172r1.f) {
                r1.e.b[] bVarArr = eVar4.f53651M;
                r1.e.b bVar = bVarArr[0];
                r1.e.b bVar2 = bVarArr[1];
                r1.e.b bVar3 = r1.e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.l0(r1.e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(r1.e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(bVar2);
                }
            } else {
                p172r1.k.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.f53725G0 > 0) {
            p172r1.b.a(this, dVar, 0);
        }
        if (this.f53726H0 > 0) {
            p172r1.b.a(this, dVar, 1);
        }
        return true;
    }

    public boolean R0(boolean z6) {
        return this.f53740y0.f(z6);
    }

    public boolean S0(boolean z6) {
        return this.f53740y0.g(z6);
    }

    public boolean T0(boolean z6, int i6) {
        return this.f53740y0.h(z6, i6);
    }

    public p182s1.b.InterfaceC0704b U0() {
        return this.f53741z0;
    }

    public int V0() {
        return this.f53734P0;
    }

    public boolean W0() {
        return false;
    }

    public void X0() {
        this.f53740y0.j();
    }

    @Override // p172r1.m, p172r1.e
    public void Y() {
        this.f53720B0.D();
        this.f53721C0 = 0;
        this.f53723E0 = 0;
        this.f53722D0 = 0;
        this.f53724F0 = 0;
        this.f53735Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.f53740y0.k();
    }

    public boolean Z0() {
        return this.f53737S0;
    }

    public boolean a1() {
        return this.f53719A0;
    }

    public boolean b1() {
        return this.f53736R0;
    }

    public long c1(int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f53721C0 = i16;
        this.f53722D0 = i17;
        return this.f53739x0.d(this, i6, i16, i17, i10, i11, i12, i13, i14, i15);
    }

    public boolean d1(int i6) {
        return (this.f53734P0 & i6) == i6;
    }

    public void f1(p182s1.b.InterfaceC0704b interfaceC0704b) {
        this.f53741z0 = interfaceC0704b;
        this.f53740y0.n(interfaceC0704b);
    }

    public void g1(int i6) {
        this.f53734P0 = i6;
        p162q1.d.f52959r = p172r1.k.b(i6, 256);
    }

    public void h1(boolean z6) {
        this.f53719A0 = z6;
    }

    public void i1(p162q1.d dVar, boolean[] zArr) {
        zArr[2] = false;
        J0(dVar);
        int size = this.f53808w0.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((p172r1.e) this.f53808w0.get(i6)).J0(dVar);
        }
    }

    public void j1() {
        this.f53739x0.e(this);
    }
}
