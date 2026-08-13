package androidx.compose.ui.window;

/* JADX INFO: loaded from: classes.dex */
public final class c implements D0.I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final androidx.compose.ui.window.c f20624a = new androidx.compose.ui.window.c();

    public static final class a extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public static final androidx.compose.ui.window.c.a f20625D = new androidx.compose.ui.window.c.a();

        public a() {
            super(1);
        }

        public final void a(D0.X.a aVar) {
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    public static final class b extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ D0.X f20626D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(D0.X x6) {
            super(1);
            this.f20626D = x6;
        }

        public final void a(D0.X.a aVar) {
            D0.X.a.l(aVar, this.f20626D, 0, 0, 0.0f, 4, null);
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.c$c, reason: collision with other inner class name */
    public static final class C0394c extends p247y7.AbstractC7352v implements p237x7.l {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final /* synthetic */ java.util.List f20627D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0394c(java.util.List list) {
            super(1);
            this.f20627D = list;
        }

        public final void a(D0.X.a aVar) {
            int iO = p097j7.AbstractC6879v.o(this.f20627D);
            if (iO < 0) {
                return;
            }
            int i6 = 0;
            while (true) {
                D0.X.a.l(aVar, (D0.X) this.f20627D.get(i6), 0, 0, 0.0f, 4, null);
                if (i6 == iO) {
                    return;
                } else {
                    i6++;
                }
            }
        }

        @Override // p237x7.l
        public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
            a((D0.X.a) obj);
            return p087i7.M.f46721a;
        }
    }

    @Override // D0.I
    public /* synthetic */ int a(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return D0.H.b(this, interfaceC0896o, list, i6);
    }

    @Override // D0.I
    public final D0.K b(D0.M m6, java.util.List list, long j6) {
        p237x7.l bVar;
        int i6;
        java.lang.Object obj;
        int iI0;
        int iW0;
        int i10;
        int i11;
        int size = list.size();
        if (size != 0) {
            int i12 = 0;
            if (size != 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                int size2 = list.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList.add(((D0.G) list.get(i13)).U(j6));
                }
                int iO = p097j7.AbstractC6879v.o(arrayList);
                if (iO >= 0) {
                    int iMax = 0;
                    int iMax2 = 0;
                    while (true) {
                        D0.X x6 = (D0.X) arrayList.get(i12);
                        iMax = java.lang.Math.max(iMax, x6.I0());
                        iMax2 = java.lang.Math.max(iMax2, x6.w0());
                        if (i12 == iO) {
                            break;
                        }
                        i12++;
                    }
                    i10 = iMax;
                    i11 = iMax2;
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                return D0.L.b(m6, i10, i11, null, new androidx.compose.ui.window.c.C0394c(arrayList), 4, null);
            }
            D0.X xU = ((D0.G) list.get(0)).U(j6);
            iI0 = xU.I0();
            iW0 = xU.w0();
            bVar = new androidx.compose.ui.window.c.b(xU);
            i6 = 4;
            obj = null;
        } else {
            bVar = androidx.compose.ui.window.c.a.f20625D;
            i6 = 4;
            obj = null;
            iI0 = 0;
            iW0 = 0;
        }
        return D0.L.b(m6, iI0, iW0, null, bVar, i6, obj);
    }

    @Override // D0.I
    public /* synthetic */ int c(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return D0.H.d(this, interfaceC0896o, list, i6);
    }

    @Override // D0.I
    public /* synthetic */ int e(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return D0.H.c(this, interfaceC0896o, list, i6);
    }

    @Override // D0.I
    public /* synthetic */ int j(D0.InterfaceC0896o interfaceC0896o, java.util.List list, int i6) {
        return D0.H.a(this, interfaceC0896o, list, i6);
    }
}
