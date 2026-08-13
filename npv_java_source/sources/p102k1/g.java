package p102k1;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p092j1.e {

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public static final k1.g.a f49398H0 = new k1.g.a(null);

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public static final int f49399I0 = 8;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private float f49400A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private float f49401B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private java.lang.String f49402C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private java.lang.String f49403D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private java.lang.String f49404E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private java.lang.String f49405F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private int[] f49406G0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private p112l1.b f49407s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f49408t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f49409u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private int f49410v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private int f49411w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f49412x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f49413y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f49414z0;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p092j1.g gVar, j1.g.e eVar) {
        super(gVar, eVar);
        p247y7.AbstractC7350t.f(gVar, "state");
        p247y7.AbstractC7350t.f(eVar, "type");
        if (eVar == j1.g.e.ROW) {
            this.f49413y0 = 1;
        } else if (eVar == j1.g.e.COLUMN) {
            this.f49414z0 = 1;
        }
    }

    @Override // p092j1.e
    public p122m1.j V0() {
        if (this.f49407s0 == null) {
            this.f49407s0 = new p112l1.b();
        }
        p112l1.b bVar = this.f49407s0;
        p247y7.AbstractC7350t.c(bVar);
        return bVar;
    }

    public final void Z0(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "columnWeights");
        this.f49403D0 = str;
    }

    public final void a1(int i6) {
        if (super.Y0() == j1.g.e.ROW) {
            return;
        }
        this.f49414z0 = i6;
    }

    @Override // p092j1.e, p092j1.a, p092j1.f
    public void apply() {
        V0();
        p112l1.b bVar = this.f49407s0;
        p247y7.AbstractC7350t.c(bVar);
        bVar.X2(this.f49412x0);
        if (this.f49413y0 != 0) {
            p112l1.b bVar2 = this.f49407s0;
            p247y7.AbstractC7350t.c(bVar2);
            bVar2.Z2(this.f49413y0);
        }
        if (this.f49414z0 != 0) {
            p112l1.b bVar3 = this.f49407s0;
            p247y7.AbstractC7350t.c(bVar3);
            bVar3.U2(this.f49414z0);
        }
        if (this.f49400A0 != 0.0f) {
            p112l1.b bVar4 = this.f49407s0;
            p247y7.AbstractC7350t.c(bVar4);
            bVar4.W2(this.f49400A0);
        }
        if (this.f49401B0 != 0.0f) {
            p112l1.b bVar5 = this.f49407s0;
            p247y7.AbstractC7350t.c(bVar5);
            bVar5.c3(this.f49401B0);
        }
        java.lang.String str = this.f49402C0;
        if (str != null && !p247y7.AbstractC7350t.b(str, "")) {
            p112l1.b bVar6 = this.f49407s0;
            p247y7.AbstractC7350t.c(bVar6);
            java.lang.String str2 = this.f49402C0;
            p247y7.AbstractC7350t.c(str2);
            bVar6.Y2(str2);
        }
        java.lang.String str3 = this.f49403D0;
        if (str3 != null && !p247y7.AbstractC7350t.b(str3, "")) {
            p112l1.b bVar7 = this.f49407s0;
            p247y7.AbstractC7350t.c(bVar7);
            java.lang.String str4 = this.f49403D0;
            p247y7.AbstractC7350t.c(str4);
            bVar7.T2(str4);
        }
        java.lang.String str5 = this.f49404E0;
        if (str5 != null && !p247y7.AbstractC7350t.b(str5, "")) {
            p112l1.b bVar8 = this.f49407s0;
            p247y7.AbstractC7350t.c(bVar8);
            java.lang.String str6 = this.f49404E0;
            p247y7.AbstractC7350t.c(str6);
            bVar8.b3(str6);
        }
        java.lang.String str7 = this.f49405F0;
        if (str7 != null && !p247y7.AbstractC7350t.b(str7, "")) {
            p112l1.b bVar9 = this.f49407s0;
            p247y7.AbstractC7350t.c(bVar9);
            java.lang.String str8 = this.f49405F0;
            p247y7.AbstractC7350t.c(str8);
            bVar9.a3(str8);
        }
        int[] iArr = this.f49406G0;
        if (iArr != null) {
            p247y7.AbstractC7350t.c(iArr);
            if (!(iArr.length == 0)) {
                p112l1.b bVar10 = this.f49407s0;
                p247y7.AbstractC7350t.c(bVar10);
                int[] iArr2 = this.f49406G0;
                p247y7.AbstractC7350t.c(iArr2);
                bVar10.V2(iArr2);
            }
        }
        U0();
    }

    public final void b1(java.lang.String str) {
        java.util.List listM;
        int i6;
        p247y7.AbstractC7350t.f(str, "flags");
        if (str.length() == 0) {
            return;
        }
        int i10 = 0;
        java.util.List listG = new S8.o("\\|").g(str, 0);
        if (listG.isEmpty()) {
            listM = p097j7.AbstractC6879v.m();
            break;
        }
        java.util.ListIterator listIterator = listG.listIterator(listG.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (((java.lang.String) listIterator.previous()).length() != 0) {
                    listM = p097j7.AbstractC6879v.M0(listG, listIterator.nextIndex() + 1);
                    break;
                }
            } else {
                listM = p097j7.AbstractC6879v.m();
                break;
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) listM.toArray(new java.lang.String[0]);
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : strArr) {
            java.lang.String lowerCase = str2.toLowerCase(java.util.Locale.ROOT);
            p247y7.AbstractC7350t.e(lowerCase, "toLowerCase(...)");
            if (p247y7.AbstractC7350t.b(lowerCase, "subgridbycolrow")) {
                i6 = 0;
            } else {
                if (p247y7.AbstractC7350t.b(lowerCase, "spansrespectwidgetorder")) {
                    i6 = 1;
                }
            }
            arrayList.add(i6);
        }
        int[] iArr = new int[arrayList.size()];
        for (java.lang.Integer num : arrayList) {
            p247y7.AbstractC7350t.c(num);
            iArr[i10] = num.intValue();
            i10++;
        }
        this.f49406G0 = iArr;
    }

    public final void c1(float f6) {
        this.f49400A0 = f6;
    }

    public final void d1(int i6) {
        this.f49412x0 = i6;
    }

    public final void e1(int i6) {
        this.f49411w0 = i6;
    }

    public final void f1(int i6) {
        this.f49409u0 = i6;
    }

    public final void g1(int i6) {
        this.f49408t0 = i6;
    }

    public final void h1(int i6) {
        this.f49410v0 = i6;
    }

    public final void i1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "rowWeights");
        this.f49402C0 = str;
    }

    public final void j1(int i6) {
        if (super.Y0() == j1.g.e.COLUMN) {
            return;
        }
        this.f49413y0 = i6;
    }

    public final void k1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "skips");
        this.f49405F0 = str;
    }

    public final void l1(java.lang.String str) {
        p247y7.AbstractC7350t.f(str, "spans");
        this.f49404E0 = str;
    }

    public final void m1(float f6) {
        this.f49401B0 = f6;
    }
}
