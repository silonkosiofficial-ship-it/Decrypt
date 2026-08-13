package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class o extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final p088i8.o f47102H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static p158p8.r f47103I = new i8.o.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f47104D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private java.util.List f47105E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private byte f47106F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private int f47107G;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.o a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.o(eVar, gVar);
        }
    }

    public static final class b extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f47108D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.util.List f47109E = java.util.Collections.emptyList();

        private b() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.o.b t() {
            return new i8.o.b();
        }

        private void u() {
            if ((this.f47108D & 1) != 1) {
                this.f47109E = new java.util.ArrayList(this.f47109E);
                this.f47108D |= 1;
            }
        }

        private void v() {
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.o i() {
            p088i8.o oVarQ = q();
            if (oVarQ.d()) {
                return oVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(oVarQ);
        }

        public p088i8.o q() {
            p088i8.o oVar = new p088i8.o(this);
            if ((this.f47108D & 1) == 1) {
                this.f47109E = j$.util.DesugarCollections.unmodifiableList(this.f47109E);
                this.f47108D &= -2;
            }
            oVar.f47105E = this.f47109E;
            return oVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.o.b clone() {
            return t().l(q());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.o.b l(p088i8.o oVar) {
            if (oVar == p088i8.o.u()) {
                return this;
            }
            if (!oVar.f47105E.isEmpty()) {
                if (this.f47109E.isEmpty()) {
                    this.f47109E = oVar.f47105E;
                    this.f47108D &= -2;
                } else {
                    u();
                    this.f47109E.addAll(oVar.f47105E);
                }
            }
            m(k().e(oVar.f47104D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public i8.o.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.o oVar = null;
            try {
                try {
                    p088i8.o oVar2 = (p088i8.o) p088i8.o.f47103I.a(eVar, gVar);
                    if (oVar2 != null) {
                        l(oVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.o oVar3 = (p088i8.o) e6.a();
                    try {
                        throw e6;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        oVar = oVar3;
                        if (oVar != null) {
                            l(oVar);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (oVar != null) {
                    l(oVar);
                }
                throw th;
            }
        }
    }

    public static final class c extends p158p8.i implements p158p8.q {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private static final i8.o.c f47110K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static p158p8.r f47111L = new i8.o.c.a();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p158p8.d f47112D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f47113E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f47114F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f47115G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private i8.o.c.EnumC0573c f47116H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private byte f47117I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private int f47118J;

        static class a extends p158p8.b {
            a() {
            }

            @Override // p158p8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public i8.o.c a(p158p8.e eVar, p158p8.g gVar) {
                return new i8.o.c(eVar, gVar);
            }
        }

        public static final class b extends p8.i.b implements p158p8.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private int f47119D;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private int f47121F;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private int f47120E = -1;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            private i8.o.c.EnumC0573c f47122G = i8.o.c.EnumC0573c.PACKAGE;

            private b() {
                u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static i8.o.c.b t() {
                return new i8.o.c.b();
            }

            private void u() {
            }

            @Override // p8.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public i8.o.c i() {
                i8.o.c cVarQ = q();
                if (cVarQ.d()) {
                    return cVarQ;
                }
                throw p158p8.a.AbstractC0680a.j(cVarQ);
            }

            public i8.o.c q() {
                i8.o.c cVar = new i8.o.c(this);
                int i6 = this.f47119D;
                int i10 = (i6 & 1) != 1 ? 0 : 1;
                cVar.f47114F = this.f47120E;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                cVar.f47115G = this.f47121F;
                if ((i6 & 4) == 4) {
                    i10 |= 4;
                }
                cVar.f47116H = this.f47122G;
                cVar.f47113E = i10;
                return cVar;
            }

            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public i8.o.c.b clone() {
                return t().l(q());
            }

            @Override // p8.i.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public i8.o.c.b l(i8.o.c cVar) {
                if (cVar == i8.o.c.w()) {
                    return this;
                }
                if (cVar.B()) {
                    y(cVar.y());
                }
                if (cVar.C()) {
                    z(cVar.z());
                }
                if (cVar.A()) {
                    x(cVar.x());
                }
                m(k().e(cVar.f47112D));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p8.p.a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public i8.o.c.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                i8.o.c cVar = null;
                try {
                    try {
                        i8.o.c cVar2 = (i8.o.c) i8.o.c.f47111L.a(eVar, gVar);
                        if (cVar2 != null) {
                            l(cVar2);
                        }
                        return this;
                    } catch (p158p8.k e6) {
                        i8.o.c cVar3 = (i8.o.c) e6.a();
                        try {
                            throw e6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            cVar = cVar3;
                            if (cVar != null) {
                                l(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (cVar != null) {
                        l(cVar);
                    }
                    throw th;
                }
            }

            public i8.o.c.b x(i8.o.c.EnumC0573c enumC0573c) {
                enumC0573c.getClass();
                this.f47119D |= 4;
                this.f47122G = enumC0573c;
                return this;
            }

            public i8.o.c.b y(int i6) {
                this.f47119D |= 1;
                this.f47120E = i6;
                return this;
            }

            public i8.o.c.b z(int i6) {
                this.f47119D |= 2;
                this.f47121F = i6;
                return this;
            }
        }

        /* JADX INFO: renamed from: i8.o$c$c, reason: collision with other inner class name */
        public enum EnumC0573c implements p8.j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* JADX INFO: renamed from: G, reason: collision with root package name */
            private static p8.j.b f47126G = new i8.o.c.EnumC0573c.a();

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            private final int f47128C;

            /* JADX INFO: renamed from: i8.o$c$c$a */
            static class a implements p8.j.b {
                a() {
                }

                @Override // p8.j.b
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public i8.o.c.EnumC0573c a(int i6) {
                    return i8.o.c.EnumC0573c.e(i6);
                }
            }

            EnumC0573c(int i6, int i10) {
                this.f47128C = i10;
            }

            public static i8.o.c.EnumC0573c e(int i6) {
                if (i6 == 0) {
                    return CLASS;
                }
                if (i6 == 1) {
                    return PACKAGE;
                }
                if (i6 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // p8.j.a
            public final int c() {
                return this.f47128C;
            }
        }

        static {
            i8.o.c cVar = new i8.o.c(true);
            f47110K = cVar;
            cVar.D();
        }

        private c(p158p8.e eVar, p158p8.g gVar) {
            this.f47117I = (byte) -1;
            this.f47118J = -1;
            D();
            p8.d.b bVarM = p158p8.d.M();
            p158p8.f fVarI = p158p8.f.I(bVarM, 1);
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f47113E |= 1;
                                    this.f47114F = eVar.r();
                                } else if (iJ == 16) {
                                    this.f47113E |= 2;
                                    this.f47115G = eVar.r();
                                } else if (iJ == 24) {
                                    int iM = eVar.m();
                                    i8.o.c.EnumC0573c enumC0573cE = i8.o.c.EnumC0573c.e(iM);
                                    if (enumC0573cE == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f47113E |= 4;
                                        this.f47116H = enumC0573cE;
                                    }
                                } else if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                            }
                            z6 = true;
                        } catch (p158p8.k e6) {
                            throw e6.i(this);
                        }
                    } catch (java.io.IOException e10) {
                        throw new p158p8.k(e10.getMessage()).i(this);
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f47112D = bVarM.o();
                    }
                    m();
                    throw th;
                }
            }
            try {
                fVarI.H();
            } catch (java.io.IOException unused2) {
            } finally {
                this.f47112D = bVarM.o();
            }
            m();
        }

        private c(p8.i.b bVar) {
            super(bVar);
            this.f47117I = (byte) -1;
            this.f47118J = -1;
            this.f47112D = bVar.k();
        }

        private c(boolean z6) {
            this.f47117I = (byte) -1;
            this.f47118J = -1;
            this.f47112D = p158p8.d.f52766C;
        }

        private void D() {
            this.f47114F = -1;
            this.f47115G = 0;
            this.f47116H = i8.o.c.EnumC0573c.PACKAGE;
        }

        public static i8.o.c.b E() {
            return i8.o.c.b.t();
        }

        public static i8.o.c.b F(i8.o.c cVar) {
            return E().l(cVar);
        }

        public static i8.o.c w() {
            return f47110K;
        }

        public boolean A() {
            return (this.f47113E & 4) == 4;
        }

        public boolean B() {
            return (this.f47113E & 1) == 1;
        }

        public boolean C() {
            return (this.f47113E & 2) == 2;
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public i8.o.c.b c() {
            return E();
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public i8.o.c.b e() {
            return F(this);
        }

        @Override // p158p8.p
        public int b() {
            int i6 = this.f47118J;
            if (i6 != -1) {
                return i6;
            }
            int iO = (this.f47113E & 1) == 1 ? p158p8.f.o(1, this.f47114F) : 0;
            if ((this.f47113E & 2) == 2) {
                iO += p158p8.f.o(2, this.f47115G);
            }
            if ((this.f47113E & 4) == 4) {
                iO += p158p8.f.h(3, this.f47116H.c());
            }
            int size = iO + this.f47112D.size();
            this.f47118J = size;
            return size;
        }

        @Override // p158p8.q
        public final boolean d() {
            byte b6 = this.f47117I;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (C()) {
                this.f47117I = (byte) 1;
                return true;
            }
            this.f47117I = (byte) 0;
            return false;
        }

        @Override // p158p8.p
        public void h(p158p8.f fVar) throws java.io.IOException {
            b();
            if ((this.f47113E & 1) == 1) {
                fVar.Z(1, this.f47114F);
            }
            if ((this.f47113E & 2) == 2) {
                fVar.Z(2, this.f47115G);
            }
            if ((this.f47113E & 4) == 4) {
                fVar.R(3, this.f47116H.c());
            }
            fVar.h0(this.f47112D);
        }

        public i8.o.c.EnumC0573c x() {
            return this.f47116H;
        }

        public int y() {
            return this.f47114F;
        }

        public int z() {
            return this.f47115G;
        }
    }

    static {
        p088i8.o oVar = new p088i8.o(true);
        f47102H = oVar;
        oVar.x();
    }

    private o(p158p8.e eVar, p158p8.g gVar) {
        this.f47106F = (byte) -1;
        this.f47107G = -1;
        x();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        boolean z10 = false;
        while (!z6) {
            try {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if (!z10) {
                                    this.f47105E = new java.util.ArrayList();
                                    z10 = true;
                                }
                                this.f47105E.add(eVar.t(i8.o.c.f47111L, gVar));
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        }
                        z6 = true;
                    } catch (p158p8.k e6) {
                        throw e6.i(this);
                    }
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            } catch (java.lang.Throwable th) {
                if (z10) {
                    this.f47105E = j$.util.DesugarCollections.unmodifiableList(this.f47105E);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused) {
                } finally {
                    this.f47104D = bVarM.o();
                }
                m();
                throw th;
            }
        }
        if (z10) {
            this.f47105E = j$.util.DesugarCollections.unmodifiableList(this.f47105E);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f47104D = bVarM.o();
        }
        m();
    }

    private o(p8.i.b bVar) {
        super(bVar);
        this.f47106F = (byte) -1;
        this.f47107G = -1;
        this.f47104D = bVar.k();
    }

    private o(boolean z6) {
        this.f47106F = (byte) -1;
        this.f47107G = -1;
        this.f47104D = p158p8.d.f52766C;
    }

    public static p088i8.o u() {
        return f47102H;
    }

    private void x() {
        this.f47105E = java.util.Collections.emptyList();
    }

    public static i8.o.b y() {
        return i8.o.b.t();
    }

    public static i8.o.b z(p088i8.o oVar) {
        return y().l(oVar);
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public i8.o.b c() {
        return y();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public i8.o.b e() {
        return z(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f47107G;
        if (i6 != -1) {
            return i6;
        }
        int iR = 0;
        for (int i10 = 0; i10 < this.f47105E.size(); i10++) {
            iR += p158p8.f.r(1, (p158p8.p) this.f47105E.get(i10));
        }
        int size = iR + this.f47104D.size();
        this.f47107G = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f47106F;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        for (int i6 = 0; i6 < w(); i6++) {
            if (!v(i6).d()) {
                this.f47106F = (byte) 0;
                return false;
            }
        }
        this.f47106F = (byte) 1;
        return true;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        for (int i6 = 0; i6 < this.f47105E.size(); i6++) {
            fVar.c0(1, (p158p8.p) this.f47105E.get(i6));
        }
        fVar.h0(this.f47104D);
    }

    public i8.o.c v(int i6) {
        return (i8.o.c) this.f47105E.get(i6);
    }

    public int w() {
        return this.f47105E.size();
    }
}
