package p009a9;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e implements p009a9.q {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final p127m7.i f17161C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f17162D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Y8.EnumC1863d f17163E;

    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17164G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f17165H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        final /* synthetic */ Z8.InterfaceC1870g f17166I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ p009a9.e f17167J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z8.InterfaceC1870g interfaceC1870g, p009a9.e eVar, p127m7.e eVar2) {
            super(2, eVar2);
            this.f17166I = interfaceC1870g;
            this.f17167J = eVar;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17164G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                W8.N n6 = (W8.N) this.f17165H;
                Z8.InterfaceC1870g interfaceC1870g = this.f17166I;
                Y8.B bO = this.f17167J.o(n6);
                this.f17164G = 1;
                if (Z8.AbstractC1871h.q(interfaceC1870g, bO, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
            return ((a9.e.a) x(n6, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            a9.e.a aVar = new a9.e.a(this.f17166I, this.f17167J, eVar);
            aVar.f17165H = obj;
            return aVar;
        }
    }

    static final class b extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f17168G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f17169H;

        b(p127m7.e eVar) {
            super(2, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f17168G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Y8.z zVar = (Y8.z) this.f17169H;
                p009a9.e eVar = p009a9.e.this;
                this.f17168G = 1;
                if (eVar.h(zVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(Y8.z zVar, p127m7.e eVar) {
            return ((a9.e.b) x(zVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            a9.e.b bVar = p009a9.e.this.new b(eVar);
            bVar.f17169H = obj;
            return bVar;
        }
    }

    public e(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        this.f17161C = iVar;
        this.f17162D = i6;
        this.f17163E = enumC1863d;
    }

    static /* synthetic */ java.lang.Object f(p009a9.e eVar, Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar2) {
        java.lang.Object objF = W8.O.f(new a9.e.a(interfaceC1870g, eVar, null), eVar2);
        return objF == p137n7.b.g() ? objF : p087i7.M.f46721a;
    }

    @Override // Z8.InterfaceC1869f
    public java.lang.Object b(Z8.InterfaceC1870g interfaceC1870g, p127m7.e eVar) {
        return f(this, interfaceC1870g, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // p009a9.q
    public Z8.InterfaceC1869f d(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d) {
        p127m7.i iVarO0 = iVar.o0(this.f17161C);
        if (enumC1863d == Y8.EnumC1863d.SUSPEND) {
            int i10 = this.f17162D;
            if (i10 != -3) {
                if (i6 == -3) {
                    i6 = i10;
                } else if (i10 != -2) {
                    if (i6 == -2) {
                        i6 = i10;
                    } else {
                        i6 += i10;
                        if (i6 < 0) {
                            i6 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            enumC1863d = this.f17163E;
        }
        return (p247y7.AbstractC7350t.b(iVarO0, this.f17161C) && i6 == this.f17162D && enumC1863d == this.f17163E) ? this : i(iVarO0, i6, enumC1863d);
    }

    protected java.lang.String e() {
        return null;
    }

    protected abstract java.lang.Object h(Y8.z zVar, p127m7.e eVar);

    protected abstract p009a9.e i(p127m7.i iVar, int i6, Y8.EnumC1863d enumC1863d);

    public Z8.InterfaceC1869f j() {
        return null;
    }

    public final p237x7.p k() {
        return new a9.e.b(null);
    }

    public final int l() {
        int i6 = this.f17162D;
        if (i6 == -3) {
            return -2;
        }
        return i6;
    }

    public Y8.B o(W8.N n6) {
        return Y8.x.d(n6, this.f17161C, l(), this.f17163E, W8.P.ATOMIC, null, k(), 16, null);
    }

    public java.lang.String toString() {
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        java.lang.String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        if (this.f17161C != p127m7.j.f51198C) {
            arrayList.add("context=" + this.f17161C);
        }
        if (this.f17162D != -3) {
            arrayList.add("capacity=" + this.f17162D);
        }
        if (this.f17163E != Y8.EnumC1863d.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f17163E);
        }
        return W8.S.a(this) + '[' + p097j7.AbstractC6879v.r0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
