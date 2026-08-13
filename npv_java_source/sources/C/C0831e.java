package C;

/* JADX INFO: renamed from: C.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831e implements D.InterfaceC0871h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C.K f1068a;

    /* JADX INFO: renamed from: C.e$a */
    static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ boolean f1069D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final /* synthetic */ java.util.List f1070E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z6, java.util.List list) {
            super(1);
            this.f1069D = z6;
            this.f1070E = list;
        }

        public final java.lang.Integer a(int i6) {
            return java.lang.Integer.valueOf(this.f1069D ? ((C.InterfaceC0837k) this.f1070E.get(i6)).c() : ((C.InterfaceC0837k) this.f1070E.get(i6)).m());
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            return a(((java.lang.Number) obj).intValue());
        }
    }

    public C0831e(C.K k6) {
        this.f1068a = k6;
    }

    private final int h(C.s sVar) {
        boolean z6 = sVar.e() == p230x.s.Vertical;
        java.util.List listJ = sVar.j();
        C.C0831e.a aVar = new C.C0831e.a(z6, listJ);
        int i6 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i6 < listJ.size()) {
            int iIntValue = ((java.lang.Number) aVar.l(java.lang.Integer.valueOf(i6))).intValue();
            if (iIntValue == -1) {
                i6++;
            } else {
                int iMax = 0;
                while (i6 < listJ.size() && ((java.lang.Number) aVar.l(java.lang.Integer.valueOf(i6))).intValue() == iIntValue) {
                    long jA = ((C.InterfaceC0837k) listJ.get(i6)).a();
                    iMax = java.lang.Math.max(iMax, z6 ? Y0.t.f(jA) : Y0.t.g(jA));
                    i6++;
                }
                i10 += iMax;
                i11++;
            }
        }
        return (i10 / i11) + sVar.h();
    }

    @Override // D.InterfaceC0871h
    public int a() {
        return this.f1068a.r().d();
    }

    @Override // D.InterfaceC0871h
    public int b() {
        C.InterfaceC0837k interfaceC0837k = (C.InterfaceC0837k) p097j7.AbstractC6879v.v0(this.f1068a.r().j());
        if (interfaceC0837k != null) {
            return interfaceC0837k.getIndex();
        }
        return 0;
    }

    @Override // D.InterfaceC0871h
    public void c(p230x.w wVar, int i6, int i10) {
        this.f1068a.H(i6, i10, true);
    }

    @Override // D.InterfaceC0871h
    public int d() {
        return this.f1068a.o();
    }

    @Override // D.InterfaceC0871h
    public java.lang.Object e(p237x7.p pVar, p127m7.e eVar) {
        java.lang.Object objC = p230x.z.c(this.f1068a, null, pVar, eVar, 1, null);
        return objC == p137n7.b.g() ? objC : p087i7.M.f46721a;
    }

    @Override // D.InterfaceC0871h
    public float f(int i6) {
        java.lang.Object obj;
        C.s sVarR = this.f1068a.r();
        if (sVarR.j().isEmpty()) {
            return 0.0f;
        }
        java.util.List listJ = sVarR.j();
        int size = listJ.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listJ.get(i10);
            if (((C.InterfaceC0837k) obj).getIndex() == i6) {
                break;
            }
            i10++;
        }
        C.InterfaceC0837k interfaceC0837k = (C.InterfaceC0837k) obj;
        if (interfaceC0837k != null) {
            return sVarR.e() == p230x.s.Vertical ? Y0.p.i(interfaceC0837k.l()) : Y0.p.h(interfaceC0837k.l());
        }
        int iA = this.f1068a.A();
        return (h(sVarR) * (((i6 - g()) + ((iA - 1) * (i6 < g() ? -1 : 1))) / iA)) - d();
    }

    @Override // D.InterfaceC0871h
    public int g() {
        return this.f1068a.n();
    }
}
