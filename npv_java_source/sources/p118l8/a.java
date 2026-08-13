package p118l8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p8.i.f f50072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p8.i.f f50073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p8.i.f f50074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p8.i.f f50075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p8.i.f f50076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p8.i.f f50077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p8.i.f f50078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p8.i.f f50079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p8.i.f f50080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p8.i.f f50081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p8.i.f f50082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p8.i.f f50083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p8.i.f f50084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p8.i.f f50085n;

    public static final class b extends p158p8.i implements p158p8.q {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private static final l8.a.b f50086J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static p158p8.r f50087K = new l8.a.b.C0637a();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p158p8.d f50088D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f50089E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f50090F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f50091G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private byte f50092H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f50093I;

        /* JADX INFO: renamed from: l8.a$b$a, reason: collision with other inner class name */
        static class C0637a extends p158p8.b {
            C0637a() {
            }

            @Override // p158p8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public l8.a.b a(p158p8.e eVar, p158p8.g gVar) {
                return new l8.a.b(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: l8.a$b$b, reason: collision with other inner class name */
        public static final class C0638b extends p8.i.b implements p158p8.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private int f50094D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private int f50095E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private int f50096F;

            private C0638b() {
                u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static l8.a.b.C0638b t() {
                return new l8.a.b.C0638b();
            }

            private void u() {
            }

            @Override // p8.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public l8.a.b i() {
                l8.a.b bVarQ = q();
                if (bVarQ.d()) {
                    return bVarQ;
                }
                throw p158p8.a.AbstractC0680a.j(bVarQ);
            }

            public l8.a.b q() {
                l8.a.b bVar = new l8.a.b(this);
                int i6 = this.f50094D;
                int i10 = (i6 & 1) != 1 ? 0 : 1;
                bVar.f50090F = this.f50095E;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                bVar.f50091G = this.f50096F;
                bVar.f50089E = i10;
                return bVar;
            }

            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public l8.a.b.C0638b clone() {
                return t().l(q());
            }

            @Override // p8.i.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public l8.a.b.C0638b l(l8.a.b bVar) {
                if (bVar == l8.a.b.v()) {
                    return this;
                }
                if (bVar.z()) {
                    y(bVar.x());
                }
                if (bVar.y()) {
                    x(bVar.w());
                }
                m(k().e(bVar.f50088D));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p8.p.a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public l8.a.b.C0638b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                l8.a.b bVar = null;
                try {
                    try {
                        l8.a.b bVar2 = (l8.a.b) l8.a.b.f50087K.a(eVar, gVar);
                        if (bVar2 != null) {
                            l(bVar2);
                        }
                        return this;
                    } catch (p158p8.k e6) {
                        l8.a.b bVar3 = (l8.a.b) e6.a();
                        try {
                            throw e6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            bVar = bVar3;
                            if (bVar != null) {
                                l(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        l(bVar);
                    }
                    throw th;
                }
            }

            public l8.a.b.C0638b x(int i6) {
                this.f50094D |= 2;
                this.f50096F = i6;
                return this;
            }

            public l8.a.b.C0638b y(int i6) {
                this.f50094D |= 1;
                this.f50095E = i6;
                return this;
            }
        }

        static {
            l8.a.b bVar = new l8.a.b(true);
            f50086J = bVar;
            bVar.A();
        }

        private b(p158p8.e eVar, p158p8.g gVar) {
            this.f50092H = (byte) -1;
            this.f50093I = -1;
            A();
            p8.d.b bVarM = p158p8.d.M();
            p158p8.f fVarI = p158p8.f.I(bVarM, 1);
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f50089E |= 1;
                                this.f50090F = eVar.r();
                            } else if (iJ == 16) {
                                this.f50089E |= 2;
                                this.f50091G = eVar.r();
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        }
                        z6 = true;
                    } catch (java.lang.Throwable th) {
                        try {
                            fVarI.H();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.f50088D = bVarM.o();
                        }
                        m();
                        throw th;
                    }
                } catch (p158p8.k e6) {
                    throw e6.i(this);
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            }
            try {
                fVarI.H();
            } catch (java.io.IOException unused2) {
            } finally {
                this.f50088D = bVarM.o();
            }
            m();
        }

        private b(p8.i.b bVar) {
            super(bVar);
            this.f50092H = (byte) -1;
            this.f50093I = -1;
            this.f50088D = bVar.k();
        }

        private b(boolean z6) {
            this.f50092H = (byte) -1;
            this.f50093I = -1;
            this.f50088D = p158p8.d.f52766C;
        }

        private void A() {
            this.f50090F = 0;
            this.f50091G = 0;
        }

        public static l8.a.b.C0638b B() {
            return l8.a.b.C0638b.t();
        }

        public static l8.a.b.C0638b C(l8.a.b bVar) {
            return B().l(bVar);
        }

        public static l8.a.b v() {
            return f50086J;
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public l8.a.b.C0638b c() {
            return B();
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public l8.a.b.C0638b e() {
            return C(this);
        }

        @Override // p158p8.p
        public int b() {
            int i6 = this.f50093I;
            if (i6 != -1) {
                return i6;
            }
            int iO = (this.f50089E & 1) == 1 ? p158p8.f.o(1, this.f50090F) : 0;
            if ((this.f50089E & 2) == 2) {
                iO += p158p8.f.o(2, this.f50091G);
            }
            int size = iO + this.f50088D.size();
            this.f50093I = size;
            return size;
        }

        @Override // p158p8.q
        public final boolean d() {
            byte b6 = this.f50092H;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f50092H = (byte) 1;
            return true;
        }

        @Override // p158p8.p
        public void h(p158p8.f fVar) throws java.io.IOException {
            b();
            if ((this.f50089E & 1) == 1) {
                fVar.Z(1, this.f50090F);
            }
            if ((this.f50089E & 2) == 2) {
                fVar.Z(2, this.f50091G);
            }
            fVar.h0(this.f50088D);
        }

        public int w() {
            return this.f50091G;
        }

        public int x() {
            return this.f50090F;
        }

        public boolean y() {
            return (this.f50089E & 2) == 2;
        }

        public boolean z() {
            return (this.f50089E & 1) == 1;
        }
    }

    public static final class c extends p158p8.i implements p158p8.q {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private static final l8.a.c f50097J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static p158p8.r f50098K = new l8.a.c.C0639a();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p158p8.d f50099D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f50100E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f50101F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f50102G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private byte f50103H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f50104I;

        /* JADX INFO: renamed from: l8.a$c$a, reason: collision with other inner class name */
        static class C0639a extends p158p8.b {
            C0639a() {
            }

            @Override // p158p8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public l8.a.c a(p158p8.e eVar, p158p8.g gVar) {
                return new l8.a.c(eVar, gVar);
            }
        }

        public static final class b extends p8.i.b implements p158p8.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private int f50105D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private int f50106E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private int f50107F;

            private b() {
                u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static l8.a.c.b t() {
                return new l8.a.c.b();
            }

            private void u() {
            }

            @Override // p8.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public l8.a.c i() {
                l8.a.c cVarQ = q();
                if (cVarQ.d()) {
                    return cVarQ;
                }
                throw p158p8.a.AbstractC0680a.j(cVarQ);
            }

            public l8.a.c q() {
                l8.a.c cVar = new l8.a.c(this);
                int i6 = this.f50105D;
                int i10 = (i6 & 1) != 1 ? 0 : 1;
                cVar.f50101F = this.f50106E;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                cVar.f50102G = this.f50107F;
                cVar.f50100E = i10;
                return cVar;
            }

            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public l8.a.c.b clone() {
                return t().l(q());
            }

            @Override // p8.i.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public l8.a.c.b l(l8.a.c cVar) {
                if (cVar == l8.a.c.v()) {
                    return this;
                }
                if (cVar.z()) {
                    y(cVar.x());
                }
                if (cVar.y()) {
                    x(cVar.w());
                }
                m(k().e(cVar.f50099D));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p8.p.a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public l8.a.c.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                l8.a.c cVar = null;
                try {
                    try {
                        l8.a.c cVar2 = (l8.a.c) l8.a.c.f50098K.a(eVar, gVar);
                        if (cVar2 != null) {
                            l(cVar2);
                        }
                        return this;
                    } catch (p158p8.k e6) {
                        l8.a.c cVar3 = (l8.a.c) e6.a();
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

            public l8.a.c.b x(int i6) {
                this.f50105D |= 2;
                this.f50107F = i6;
                return this;
            }

            public l8.a.c.b y(int i6) {
                this.f50105D |= 1;
                this.f50106E = i6;
                return this;
            }
        }

        static {
            l8.a.c cVar = new l8.a.c(true);
            f50097J = cVar;
            cVar.A();
        }

        private c(p158p8.e eVar, p158p8.g gVar) {
            this.f50103H = (byte) -1;
            this.f50104I = -1;
            A();
            p8.d.b bVarM = p158p8.d.M();
            p158p8.f fVarI = p158p8.f.I(bVarM, 1);
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 8) {
                                this.f50100E |= 1;
                                this.f50101F = eVar.r();
                            } else if (iJ == 16) {
                                this.f50100E |= 2;
                                this.f50102G = eVar.r();
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        }
                        z6 = true;
                    } catch (java.lang.Throwable th) {
                        try {
                            fVarI.H();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.f50099D = bVarM.o();
                        }
                        m();
                        throw th;
                    }
                } catch (p158p8.k e6) {
                    throw e6.i(this);
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            }
            try {
                fVarI.H();
            } catch (java.io.IOException unused2) {
            } finally {
                this.f50099D = bVarM.o();
            }
            m();
        }

        private c(p8.i.b bVar) {
            super(bVar);
            this.f50103H = (byte) -1;
            this.f50104I = -1;
            this.f50099D = bVar.k();
        }

        private c(boolean z6) {
            this.f50103H = (byte) -1;
            this.f50104I = -1;
            this.f50099D = p158p8.d.f52766C;
        }

        private void A() {
            this.f50101F = 0;
            this.f50102G = 0;
        }

        public static l8.a.c.b B() {
            return l8.a.c.b.t();
        }

        public static l8.a.c.b C(l8.a.c cVar) {
            return B().l(cVar);
        }

        public static l8.a.c v() {
            return f50097J;
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public l8.a.c.b c() {
            return B();
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public l8.a.c.b e() {
            return C(this);
        }

        @Override // p158p8.p
        public int b() {
            int i6 = this.f50104I;
            if (i6 != -1) {
                return i6;
            }
            int iO = (this.f50100E & 1) == 1 ? p158p8.f.o(1, this.f50101F) : 0;
            if ((this.f50100E & 2) == 2) {
                iO += p158p8.f.o(2, this.f50102G);
            }
            int size = iO + this.f50099D.size();
            this.f50104I = size;
            return size;
        }

        @Override // p158p8.q
        public final boolean d() {
            byte b6 = this.f50103H;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f50103H = (byte) 1;
            return true;
        }

        @Override // p158p8.p
        public void h(p158p8.f fVar) throws java.io.IOException {
            b();
            if ((this.f50100E & 1) == 1) {
                fVar.Z(1, this.f50101F);
            }
            if ((this.f50100E & 2) == 2) {
                fVar.Z(2, this.f50102G);
            }
            fVar.h0(this.f50099D);
        }

        public int w() {
            return this.f50102G;
        }

        public int x() {
            return this.f50101F;
        }

        public boolean y() {
            return (this.f50100E & 2) == 2;
        }

        public boolean z() {
            return (this.f50100E & 1) == 1;
        }
    }

    public static final class d extends p158p8.i implements p158p8.q {

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        private static final l8.a.d f50108M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static p158p8.r f50109N = new l8.a.d.C0640a();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p158p8.d f50110D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f50111E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private l8.a.b f50112F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private l8.a.c f50113G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private l8.a.c f50114H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private l8.a.c f50115I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private l8.a.c f50116J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        private byte f50117K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        private int f50118L;

        /* JADX INFO: renamed from: l8.a$d$a, reason: collision with other inner class name */
        static class C0640a extends p158p8.b {
            C0640a() {
            }

            @Override // p158p8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public l8.a.d a(p158p8.e eVar, p158p8.g gVar) {
                return new l8.a.d(eVar, gVar);
            }
        }

        public static final class b extends p8.i.b implements p158p8.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private int f50119D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private l8.a.b f50120E = l8.a.b.v();

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private l8.a.c f50121F = l8.a.c.v();

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            private l8.a.c f50122G = l8.a.c.v();

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private l8.a.c f50123H = l8.a.c.v();

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            private l8.a.c f50124I = l8.a.c.v();

            private b() {
                u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static l8.a.d.b t() {
                return new l8.a.d.b();
            }

            private void u() {
            }

            public l8.a.d.b A(l8.a.c cVar) {
                if ((this.f50119D & 8) == 8 && this.f50123H != l8.a.c.v()) {
                    cVar = l8.a.c.C(this.f50123H).l(cVar).q();
                }
                this.f50123H = cVar;
                this.f50119D |= 8;
                return this;
            }

            public l8.a.d.b B(l8.a.c cVar) {
                if ((this.f50119D & 2) == 2 && this.f50121F != l8.a.c.v()) {
                    cVar = l8.a.c.C(this.f50121F).l(cVar).q();
                }
                this.f50121F = cVar;
                this.f50119D |= 2;
                return this;
            }

            @Override // p8.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public l8.a.d i() {
                l8.a.d dVarQ = q();
                if (dVarQ.d()) {
                    return dVarQ;
                }
                throw p158p8.a.AbstractC0680a.j(dVarQ);
            }

            public l8.a.d q() {
                l8.a.d dVar = new l8.a.d(this);
                int i6 = this.f50119D;
                int i10 = (i6 & 1) != 1 ? 0 : 1;
                dVar.f50112F = this.f50120E;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                dVar.f50113G = this.f50121F;
                if ((i6 & 4) == 4) {
                    i10 |= 4;
                }
                dVar.f50114H = this.f50122G;
                if ((i6 & 8) == 8) {
                    i10 |= 8;
                }
                dVar.f50115I = this.f50123H;
                if ((i6 & 16) == 16) {
                    i10 |= 16;
                }
                dVar.f50116J = this.f50124I;
                dVar.f50111E = i10;
                return dVar;
            }

            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public l8.a.d.b clone() {
                return t().l(q());
            }

            public l8.a.d.b v(l8.a.c cVar) {
                if ((this.f50119D & 16) == 16 && this.f50124I != l8.a.c.v()) {
                    cVar = l8.a.c.C(this.f50124I).l(cVar).q();
                }
                this.f50124I = cVar;
                this.f50119D |= 16;
                return this;
            }

            public l8.a.d.b w(l8.a.b bVar) {
                if ((this.f50119D & 1) == 1 && this.f50120E != l8.a.b.v()) {
                    bVar = l8.a.b.C(this.f50120E).l(bVar).q();
                }
                this.f50120E = bVar;
                this.f50119D |= 1;
                return this;
            }

            @Override // p8.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public l8.a.d.b l(l8.a.d dVar) {
                if (dVar == l8.a.d.y()) {
                    return this;
                }
                if (dVar.F()) {
                    w(dVar.A());
                }
                if (dVar.I()) {
                    B(dVar.D());
                }
                if (dVar.G()) {
                    z(dVar.B());
                }
                if (dVar.H()) {
                    A(dVar.C());
                }
                if (dVar.E()) {
                    v(dVar.z());
                }
                m(k().e(dVar.f50110D));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p8.p.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public l8.a.d.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                l8.a.d dVar = null;
                try {
                    try {
                        l8.a.d dVar2 = (l8.a.d) l8.a.d.f50109N.a(eVar, gVar);
                        if (dVar2 != null) {
                            l(dVar2);
                        }
                        return this;
                    } catch (p158p8.k e6) {
                        l8.a.d dVar3 = (l8.a.d) e6.a();
                        try {
                            throw e6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            dVar = dVar3;
                            if (dVar != null) {
                                l(dVar);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (dVar != null) {
                        l(dVar);
                    }
                    throw th;
                }
            }

            public l8.a.d.b z(l8.a.c cVar) {
                if ((this.f50119D & 4) == 4 && this.f50122G != l8.a.c.v()) {
                    cVar = l8.a.c.C(this.f50122G).l(cVar).q();
                }
                this.f50122G = cVar;
                this.f50119D |= 4;
                return this;
            }
        }

        static {
            l8.a.d dVar = new l8.a.d(true);
            f50108M = dVar;
            dVar.J();
        }

        private d(p158p8.e eVar, p158p8.g gVar) {
            int i6;
            int i10;
            this.f50117K = (byte) -1;
            this.f50118L = -1;
            J();
            p8.d.b bVarM = p158p8.d.M();
            p158p8.f fVarI = p158p8.f.I(bVarM, 1);
            boolean z6 = false;
            while (!z6) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ != 10) {
                                if (iJ == 18) {
                                    i6 = 2;
                                    l8.a.c.b bVarE = (this.f50111E & 2) == 2 ? this.f50113G.e() : null;
                                    l8.a.c cVar = (l8.a.c) eVar.t(l8.a.c.f50098K, gVar);
                                    this.f50113G = cVar;
                                    if (bVarE != null) {
                                        bVarE.l(cVar);
                                        this.f50113G = bVarE.q();
                                    }
                                    i10 = this.f50111E;
                                } else if (iJ == 26) {
                                    i6 = 4;
                                    l8.a.c.b bVarE2 = (this.f50111E & 4) == 4 ? this.f50114H.e() : null;
                                    l8.a.c cVar2 = (l8.a.c) eVar.t(l8.a.c.f50098K, gVar);
                                    this.f50114H = cVar2;
                                    if (bVarE2 != null) {
                                        bVarE2.l(cVar2);
                                        this.f50114H = bVarE2.q();
                                    }
                                    i10 = this.f50111E;
                                } else if (iJ == 34) {
                                    i6 = 8;
                                    l8.a.c.b bVarE3 = (this.f50111E & 8) == 8 ? this.f50115I.e() : null;
                                    l8.a.c cVar3 = (l8.a.c) eVar.t(l8.a.c.f50098K, gVar);
                                    this.f50115I = cVar3;
                                    if (bVarE3 != null) {
                                        bVarE3.l(cVar3);
                                        this.f50115I = bVarE3.q();
                                    }
                                    i10 = this.f50111E;
                                } else if (iJ == 42) {
                                    i6 = 16;
                                    l8.a.c.b bVarE4 = (this.f50111E & 16) == 16 ? this.f50116J.e() : null;
                                    l8.a.c cVar4 = (l8.a.c) eVar.t(l8.a.c.f50098K, gVar);
                                    this.f50116J = cVar4;
                                    if (bVarE4 != null) {
                                        bVarE4.l(cVar4);
                                        this.f50116J = bVarE4.q();
                                    }
                                    i10 = this.f50111E;
                                } else if (!p(eVar, fVarI, gVar, iJ)) {
                                }
                                this.f50111E = i10 | i6;
                            } else {
                                l8.a.b.C0638b c0638bE = (this.f50111E & 1) == 1 ? this.f50112F.e() : null;
                                l8.a.b bVar = (l8.a.b) eVar.t(l8.a.b.f50087K, gVar);
                                this.f50112F = bVar;
                                if (c0638bE != null) {
                                    c0638bE.l(bVar);
                                    this.f50112F = c0638bE.q();
                                }
                                this.f50111E |= 1;
                            }
                        }
                        z6 = true;
                    } catch (java.lang.Throwable th) {
                        try {
                            fVarI.H();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.f50110D = bVarM.o();
                        }
                        m();
                        throw th;
                    }
                } catch (p158p8.k e6) {
                    throw e6.i(this);
                } catch (java.io.IOException e10) {
                    throw new p158p8.k(e10.getMessage()).i(this);
                }
            }
            try {
                fVarI.H();
            } catch (java.io.IOException unused2) {
            } finally {
                this.f50110D = bVarM.o();
            }
            m();
        }

        private d(p8.i.b bVar) {
            super(bVar);
            this.f50117K = (byte) -1;
            this.f50118L = -1;
            this.f50110D = bVar.k();
        }

        private d(boolean z6) {
            this.f50117K = (byte) -1;
            this.f50118L = -1;
            this.f50110D = p158p8.d.f52766C;
        }

        private void J() {
            this.f50112F = l8.a.b.v();
            this.f50113G = l8.a.c.v();
            this.f50114H = l8.a.c.v();
            this.f50115I = l8.a.c.v();
            this.f50116J = l8.a.c.v();
        }

        public static l8.a.d.b K() {
            return l8.a.d.b.t();
        }

        public static l8.a.d.b L(l8.a.d dVar) {
            return K().l(dVar);
        }

        public static l8.a.d y() {
            return f50108M;
        }

        public l8.a.b A() {
            return this.f50112F;
        }

        public l8.a.c B() {
            return this.f50114H;
        }

        public l8.a.c C() {
            return this.f50115I;
        }

        public l8.a.c D() {
            return this.f50113G;
        }

        public boolean E() {
            return (this.f50111E & 16) == 16;
        }

        public boolean F() {
            return (this.f50111E & 1) == 1;
        }

        public boolean G() {
            return (this.f50111E & 4) == 4;
        }

        public boolean H() {
            return (this.f50111E & 8) == 8;
        }

        public boolean I() {
            return (this.f50111E & 2) == 2;
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public l8.a.d.b c() {
            return K();
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public l8.a.d.b e() {
            return L(this);
        }

        @Override // p158p8.p
        public int b() {
            int i6 = this.f50118L;
            if (i6 != -1) {
                return i6;
            }
            int iR = (this.f50111E & 1) == 1 ? p158p8.f.r(1, this.f50112F) : 0;
            if ((this.f50111E & 2) == 2) {
                iR += p158p8.f.r(2, this.f50113G);
            }
            if ((this.f50111E & 4) == 4) {
                iR += p158p8.f.r(3, this.f50114H);
            }
            if ((this.f50111E & 8) == 8) {
                iR += p158p8.f.r(4, this.f50115I);
            }
            if ((this.f50111E & 16) == 16) {
                iR += p158p8.f.r(5, this.f50116J);
            }
            int size = iR + this.f50110D.size();
            this.f50118L = size;
            return size;
        }

        @Override // p158p8.q
        public final boolean d() {
            byte b6 = this.f50117K;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f50117K = (byte) 1;
            return true;
        }

        @Override // p158p8.p
        public void h(p158p8.f fVar) throws java.io.IOException {
            b();
            if ((this.f50111E & 1) == 1) {
                fVar.c0(1, this.f50112F);
            }
            if ((this.f50111E & 2) == 2) {
                fVar.c0(2, this.f50113G);
            }
            if ((this.f50111E & 4) == 4) {
                fVar.c0(3, this.f50114H);
            }
            if ((this.f50111E & 8) == 8) {
                fVar.c0(4, this.f50115I);
            }
            if ((this.f50111E & 16) == 16) {
                fVar.c0(5, this.f50116J);
            }
            fVar.h0(this.f50110D);
        }

        public l8.a.c z() {
            return this.f50116J;
        }
    }

    public static final class e extends p158p8.i implements p158p8.q {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private static final l8.a.e f50125J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static p158p8.r f50126K = new l8.a.e.C0641a();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p158p8.d f50127D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private java.util.List f50128E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private java.util.List f50129F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private int f50130G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private byte f50131H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f50132I;

        /* JADX INFO: renamed from: l8.a$e$a, reason: collision with other inner class name */
        static class C0641a extends p158p8.b {
            C0641a() {
            }

            @Override // p158p8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public l8.a.e a(p158p8.e eVar, p158p8.g gVar) {
                return new l8.a.e(eVar, gVar);
            }
        }

        public static final class b extends p8.i.b implements p158p8.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private int f50133D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private java.util.List f50134E = java.util.Collections.emptyList();

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private java.util.List f50135F = java.util.Collections.emptyList();

            private b() {
                w();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static l8.a.e.b t() {
                return new l8.a.e.b();
            }

            private void u() {
                if ((this.f50133D & 2) != 2) {
                    this.f50135F = new java.util.ArrayList(this.f50135F);
                    this.f50133D |= 2;
                }
            }

            private void v() {
                if ((this.f50133D & 1) != 1) {
                    this.f50134E = new java.util.ArrayList(this.f50134E);
                    this.f50133D |= 1;
                }
            }

            private void w() {
            }

            @Override // p8.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public l8.a.e i() {
                l8.a.e eVarQ = q();
                if (eVarQ.d()) {
                    return eVarQ;
                }
                throw p158p8.a.AbstractC0680a.j(eVarQ);
            }

            public l8.a.e q() {
                l8.a.e eVar = new l8.a.e(this);
                if ((this.f50133D & 1) == 1) {
                    this.f50134E = j$.util.DesugarCollections.unmodifiableList(this.f50134E);
                    this.f50133D &= -2;
                }
                eVar.f50128E = this.f50134E;
                if ((this.f50133D & 2) == 2) {
                    this.f50135F = j$.util.DesugarCollections.unmodifiableList(this.f50135F);
                    this.f50133D &= -3;
                }
                eVar.f50129F = this.f50135F;
                return eVar;
            }

            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public l8.a.e.b clone() {
                return t().l(q());
            }

            @Override // p8.i.b
            /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
            public l8.a.e.b l(l8.a.e eVar) {
                if (eVar == l8.a.e.w()) {
                    return this;
                }
                if (!eVar.f50128E.isEmpty()) {
                    if (this.f50134E.isEmpty()) {
                        this.f50134E = eVar.f50128E;
                        this.f50133D &= -2;
                    } else {
                        v();
                        this.f50134E.addAll(eVar.f50128E);
                    }
                }
                if (!eVar.f50129F.isEmpty()) {
                    if (this.f50135F.isEmpty()) {
                        this.f50135F = eVar.f50129F;
                        this.f50133D &= -3;
                    } else {
                        u();
                        this.f50135F.addAll(eVar.f50129F);
                    }
                }
                m(k().e(eVar.f50127D));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p8.p.a
            /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
            public l8.a.e.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                l8.a.e eVar2 = null;
                try {
                    try {
                        l8.a.e eVar3 = (l8.a.e) l8.a.e.f50126K.a(eVar, gVar);
                        if (eVar3 != null) {
                            l(eVar3);
                        }
                        return this;
                    } catch (p158p8.k e6) {
                        l8.a.e eVar4 = (l8.a.e) e6.a();
                        try {
                            throw e6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            eVar2 = eVar4;
                            if (eVar2 != null) {
                                l(eVar2);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (eVar2 != null) {
                        l(eVar2);
                    }
                    throw th;
                }
            }
        }

        public static final class c extends p158p8.i implements p158p8.q {

            /* JADX INFO: renamed from: P, reason: collision with root package name */
            private static final l8.a.e.c f50136P;

            /* JADX INFO: renamed from: Q, reason: collision with root package name */
            public static p158p8.r f50137Q = new l8.a.e.c.C0642a();

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private final p158p8.d f50138D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private int f50139E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private int f50140F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            private int f50141G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private java.lang.Object f50142H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            private l8.a.e.c.EnumC0643c f50143I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            private java.util.List f50144J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            private int f50145K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            private java.util.List f50146L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            private int f50147M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            private byte f50148N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private int f50149O;

            /* JADX INFO: renamed from: l8.a$e$c$a, reason: collision with other inner class name */
            static class C0642a extends p158p8.b {
                C0642a() {
                }

                @Override // p158p8.r
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public l8.a.e.c a(p158p8.e eVar, p158p8.g gVar) {
                    return new l8.a.e.c(eVar, gVar);
                }
            }

            public static final class b extends p8.i.b implements p158p8.q {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                private int f50150D;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                private int f50152F;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                private int f50151E = 1;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                private java.lang.Object f50153G = "";

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                private l8.a.e.c.EnumC0643c f50154H = l8.a.e.c.EnumC0643c.NONE;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                private java.util.List f50155I = java.util.Collections.emptyList();

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                private java.util.List f50156J = java.util.Collections.emptyList();

                private b() {
                    w();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static l8.a.e.c.b t() {
                    return new l8.a.e.c.b();
                }

                private void u() {
                    if ((this.f50150D & 32) != 32) {
                        this.f50156J = new java.util.ArrayList(this.f50156J);
                        this.f50150D |= 32;
                    }
                }

                private void v() {
                    if ((this.f50150D & 16) != 16) {
                        this.f50155I = new java.util.ArrayList(this.f50155I);
                        this.f50150D |= 16;
                    }
                }

                private void w() {
                }

                public l8.a.e.c.b A(int i6) {
                    this.f50150D |= 2;
                    this.f50152F = i6;
                    return this;
                }

                public l8.a.e.c.b B(int i6) {
                    this.f50150D |= 1;
                    this.f50151E = i6;
                    return this;
                }

                @Override // p8.p.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public l8.a.e.c i() {
                    l8.a.e.c cVarQ = q();
                    if (cVarQ.d()) {
                        return cVarQ;
                    }
                    throw p158p8.a.AbstractC0680a.j(cVarQ);
                }

                public l8.a.e.c q() {
                    l8.a.e.c cVar = new l8.a.e.c(this);
                    int i6 = this.f50150D;
                    int i10 = (i6 & 1) != 1 ? 0 : 1;
                    cVar.f50140F = this.f50151E;
                    if ((i6 & 2) == 2) {
                        i10 |= 2;
                    }
                    cVar.f50141G = this.f50152F;
                    if ((i6 & 4) == 4) {
                        i10 |= 4;
                    }
                    cVar.f50142H = this.f50153G;
                    if ((i6 & 8) == 8) {
                        i10 |= 8;
                    }
                    cVar.f50143I = this.f50154H;
                    if ((this.f50150D & 16) == 16) {
                        this.f50155I = j$.util.DesugarCollections.unmodifiableList(this.f50155I);
                        this.f50150D &= -17;
                    }
                    cVar.f50144J = this.f50155I;
                    if ((this.f50150D & 32) == 32) {
                        this.f50156J = j$.util.DesugarCollections.unmodifiableList(this.f50156J);
                        this.f50150D &= -33;
                    }
                    cVar.f50146L = this.f50156J;
                    cVar.f50139E = i10;
                    return cVar;
                }

                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public l8.a.e.c.b clone() {
                    return t().l(q());
                }

                @Override // p8.i.b
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public l8.a.e.c.b l(l8.a.e.c cVar) {
                    if (cVar == l8.a.e.c.C()) {
                        return this;
                    }
                    if (cVar.O()) {
                        B(cVar.F());
                    }
                    if (cVar.N()) {
                        A(cVar.E());
                    }
                    if (cVar.P()) {
                        this.f50150D |= 4;
                        this.f50153G = cVar.f50142H;
                    }
                    if (cVar.M()) {
                        z(cVar.D());
                    }
                    if (!cVar.f50144J.isEmpty()) {
                        if (this.f50155I.isEmpty()) {
                            this.f50155I = cVar.f50144J;
                            this.f50150D &= -17;
                        } else {
                            v();
                            this.f50155I.addAll(cVar.f50144J);
                        }
                    }
                    if (!cVar.f50146L.isEmpty()) {
                        if (this.f50156J.isEmpty()) {
                            this.f50156J = cVar.f50146L;
                            this.f50150D &= -33;
                        } else {
                            u();
                            this.f50156J.addAll(cVar.f50146L);
                        }
                    }
                    m(k().e(cVar.f50138D));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // p8.p.a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public l8.a.e.c.b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                    l8.a.e.c cVar = null;
                    try {
                        try {
                            l8.a.e.c cVar2 = (l8.a.e.c) l8.a.e.c.f50137Q.a(eVar, gVar);
                            if (cVar2 != null) {
                                l(cVar2);
                            }
                            return this;
                        } catch (p158p8.k e6) {
                            l8.a.e.c cVar3 = (l8.a.e.c) e6.a();
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

                public l8.a.e.c.b z(l8.a.e.c.EnumC0643c enumC0643c) {
                    enumC0643c.getClass();
                    this.f50150D |= 8;
                    this.f50154H = enumC0643c;
                    return this;
                }
            }

            /* JADX INFO: renamed from: l8.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC0643c implements p8.j.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* JADX INFO: renamed from: G, reason: collision with root package name */
                private static p8.j.b f50160G = new l8.a.e.c.EnumC0643c.C0644a();

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                private final int f50162C;

                /* JADX INFO: renamed from: l8.a$e$c$c$a, reason: collision with other inner class name */
                static class C0644a implements p8.j.b {
                    C0644a() {
                    }

                    @Override // p8.j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public l8.a.e.c.EnumC0643c a(int i6) {
                        return l8.a.e.c.EnumC0643c.e(i6);
                    }
                }

                EnumC0643c(int i6, int i10) {
                    this.f50162C = i10;
                }

                public static l8.a.e.c.EnumC0643c e(int i6) {
                    if (i6 == 0) {
                        return NONE;
                    }
                    if (i6 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i6 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // p8.j.a
                public final int c() {
                    return this.f50162C;
                }
            }

            static {
                l8.a.e.c cVar = new l8.a.e.c(true);
                f50136P = cVar;
                cVar.Q();
            }

            private c(p158p8.e eVar, p158p8.g gVar) {
                java.util.List list;
                java.lang.Integer numValueOf;
                int i6;
                this.f50145K = -1;
                this.f50147M = -1;
                this.f50148N = (byte) -1;
                this.f50149O = -1;
                Q();
                p8.d.b bVarM = p158p8.d.M();
                p158p8.f fVarI = p158p8.f.I(bVarM, 1);
                boolean z6 = false;
                int i10 = 0;
                while (!z6) {
                    try {
                        try {
                            int iJ = eVar.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    this.f50139E |= 1;
                                    this.f50140F = eVar.r();
                                } else if (iJ == 16) {
                                    this.f50139E |= 2;
                                    this.f50141G = eVar.r();
                                } else if (iJ != 24) {
                                    if (iJ != 32) {
                                        if (iJ == 34) {
                                            i6 = eVar.i(eVar.z());
                                            if ((i10 & 16) != 16 && eVar.e() > 0) {
                                                this.f50144J = new java.util.ArrayList();
                                                i10 |= 16;
                                            }
                                            while (eVar.e() > 0) {
                                                this.f50144J.add(java.lang.Integer.valueOf(eVar.r()));
                                            }
                                        } else if (iJ == 40) {
                                            if ((i10 & 32) != 32) {
                                                this.f50146L = new java.util.ArrayList();
                                                i10 |= 32;
                                            }
                                            list = this.f50146L;
                                            numValueOf = java.lang.Integer.valueOf(eVar.r());
                                        } else if (iJ == 42) {
                                            i6 = eVar.i(eVar.z());
                                            if ((i10 & 32) != 32 && eVar.e() > 0) {
                                                this.f50146L = new java.util.ArrayList();
                                                i10 |= 32;
                                            }
                                            while (eVar.e() > 0) {
                                                this.f50146L.add(java.lang.Integer.valueOf(eVar.r()));
                                            }
                                        } else if (iJ == 50) {
                                            p158p8.d dVarK = eVar.k();
                                            this.f50139E |= 4;
                                            this.f50142H = dVarK;
                                        } else if (!p(eVar, fVarI, gVar, iJ)) {
                                        }
                                        eVar.h(i6);
                                    } else {
                                        if ((i10 & 16) != 16) {
                                            this.f50144J = new java.util.ArrayList();
                                            i10 |= 16;
                                        }
                                        list = this.f50144J;
                                        numValueOf = java.lang.Integer.valueOf(eVar.r());
                                    }
                                    list.add(numValueOf);
                                } else {
                                    int iM = eVar.m();
                                    l8.a.e.c.EnumC0643c enumC0643cE = l8.a.e.c.EnumC0643c.e(iM);
                                    if (enumC0643cE == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f50139E |= 8;
                                        this.f50143I = enumC0643cE;
                                    }
                                }
                            }
                            z6 = true;
                        } catch (java.lang.Throwable th) {
                            if ((i10 & 16) == 16) {
                                this.f50144J = j$.util.DesugarCollections.unmodifiableList(this.f50144J);
                            }
                            if ((i10 & 32) == 32) {
                                this.f50146L = j$.util.DesugarCollections.unmodifiableList(this.f50146L);
                            }
                            try {
                                fVarI.H();
                            } catch (java.io.IOException unused) {
                            } finally {
                                this.f50138D = bVarM.o();
                            }
                            m();
                            throw th;
                        }
                    } catch (p158p8.k e6) {
                        throw e6.i(this);
                    } catch (java.io.IOException e10) {
                        throw new p158p8.k(e10.getMessage()).i(this);
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f50144J = j$.util.DesugarCollections.unmodifiableList(this.f50144J);
                }
                if ((i10 & 32) == 32) {
                    this.f50146L = j$.util.DesugarCollections.unmodifiableList(this.f50146L);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused2) {
                } finally {
                    this.f50138D = bVarM.o();
                }
                m();
            }

            private c(p8.i.b bVar) {
                super(bVar);
                this.f50145K = -1;
                this.f50147M = -1;
                this.f50148N = (byte) -1;
                this.f50149O = -1;
                this.f50138D = bVar.k();
            }

            private c(boolean z6) {
                this.f50145K = -1;
                this.f50147M = -1;
                this.f50148N = (byte) -1;
                this.f50149O = -1;
                this.f50138D = p158p8.d.f52766C;
            }

            public static l8.a.e.c C() {
                return f50136P;
            }

            private void Q() {
                this.f50140F = 1;
                this.f50141G = 0;
                this.f50142H = "";
                this.f50143I = l8.a.e.c.EnumC0643c.NONE;
                this.f50144J = java.util.Collections.emptyList();
                this.f50146L = java.util.Collections.emptyList();
            }

            public static l8.a.e.c.b R() {
                return l8.a.e.c.b.t();
            }

            public static l8.a.e.c.b S(l8.a.e.c cVar) {
                return R().l(cVar);
            }

            public l8.a.e.c.EnumC0643c D() {
                return this.f50143I;
            }

            public int E() {
                return this.f50141G;
            }

            public int F() {
                return this.f50140F;
            }

            public int G() {
                return this.f50146L.size();
            }

            public java.util.List H() {
                return this.f50146L;
            }

            public java.lang.String I() {
                java.lang.Object obj = this.f50142H;
                if (obj instanceof java.lang.String) {
                    return (java.lang.String) obj;
                }
                p158p8.d dVar = (p158p8.d) obj;
                java.lang.String strS = dVar.S();
                if (dVar.E()) {
                    this.f50142H = strS;
                }
                return strS;
            }

            public p158p8.d J() {
                java.lang.Object obj = this.f50142H;
                if (!(obj instanceof java.lang.String)) {
                    return (p158p8.d) obj;
                }
                p158p8.d dVarO = p158p8.d.o((java.lang.String) obj);
                this.f50142H = dVarO;
                return dVarO;
            }

            public int K() {
                return this.f50144J.size();
            }

            public java.util.List L() {
                return this.f50144J;
            }

            public boolean M() {
                return (this.f50139E & 8) == 8;
            }

            public boolean N() {
                return (this.f50139E & 2) == 2;
            }

            public boolean O() {
                return (this.f50139E & 1) == 1;
            }

            public boolean P() {
                return (this.f50139E & 4) == 4;
            }

            @Override // p158p8.p
            /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
            public l8.a.e.c.b c() {
                return R();
            }

            @Override // p158p8.p
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public l8.a.e.c.b e() {
                return S(this);
            }

            @Override // p158p8.p
            public int b() {
                int i6 = this.f50149O;
                if (i6 != -1) {
                    return i6;
                }
                int iO = (this.f50139E & 1) == 1 ? p158p8.f.o(1, this.f50140F) : 0;
                if ((this.f50139E & 2) == 2) {
                    iO += p158p8.f.o(2, this.f50141G);
                }
                if ((this.f50139E & 8) == 8) {
                    iO += p158p8.f.h(3, this.f50143I.c());
                }
                int iP = 0;
                for (int i10 = 0; i10 < this.f50144J.size(); i10++) {
                    iP += p158p8.f.p(((java.lang.Integer) this.f50144J.get(i10)).intValue());
                }
                int iP2 = iO + iP;
                if (!L().isEmpty()) {
                    iP2 = iP2 + 1 + p158p8.f.p(iP);
                }
                this.f50145K = iP;
                int iP3 = 0;
                for (int i11 = 0; i11 < this.f50146L.size(); i11++) {
                    iP3 += p158p8.f.p(((java.lang.Integer) this.f50146L.get(i11)).intValue());
                }
                int iD = iP2 + iP3;
                if (!H().isEmpty()) {
                    iD = iD + 1 + p158p8.f.p(iP3);
                }
                this.f50147M = iP3;
                if ((this.f50139E & 4) == 4) {
                    iD += p158p8.f.d(6, J());
                }
                int size = iD + this.f50138D.size();
                this.f50149O = size;
                return size;
            }

            @Override // p158p8.q
            public final boolean d() {
                byte b6 = this.f50148N;
                if (b6 == 1) {
                    return true;
                }
                if (b6 == 0) {
                    return false;
                }
                this.f50148N = (byte) 1;
                return true;
            }

            @Override // p158p8.p
            public void h(p158p8.f fVar) throws java.io.IOException {
                b();
                if ((this.f50139E & 1) == 1) {
                    fVar.Z(1, this.f50140F);
                }
                if ((this.f50139E & 2) == 2) {
                    fVar.Z(2, this.f50141G);
                }
                if ((this.f50139E & 8) == 8) {
                    fVar.R(3, this.f50143I.c());
                }
                if (L().size() > 0) {
                    fVar.n0(34);
                    fVar.n0(this.f50145K);
                }
                for (int i6 = 0; i6 < this.f50144J.size(); i6++) {
                    fVar.a0(((java.lang.Integer) this.f50144J.get(i6)).intValue());
                }
                if (H().size() > 0) {
                    fVar.n0(42);
                    fVar.n0(this.f50147M);
                }
                for (int i10 = 0; i10 < this.f50146L.size(); i10++) {
                    fVar.a0(((java.lang.Integer) this.f50146L.get(i10)).intValue());
                }
                if ((this.f50139E & 4) == 4) {
                    fVar.N(6, J());
                }
                fVar.h0(this.f50138D);
            }
        }

        static {
            l8.a.e eVar = new l8.a.e(true);
            f50125J = eVar;
            eVar.z();
        }

        private e(p158p8.e eVar, p158p8.g gVar) {
            java.util.List list;
            java.lang.Object objT;
            this.f50130G = -1;
            this.f50131H = (byte) -1;
            this.f50132I = -1;
            z();
            p8.d.b bVarM = p158p8.d.M();
            p158p8.f fVarI = p158p8.f.I(bVarM, 1);
            boolean z6 = false;
            int i6 = 0;
            while (!z6) {
                try {
                    try {
                        int iJ = eVar.J();
                        if (iJ != 0) {
                            if (iJ == 10) {
                                if ((i6 & 1) != 1) {
                                    this.f50128E = new java.util.ArrayList();
                                    i6 |= 1;
                                }
                                list = this.f50128E;
                                objT = eVar.t(l8.a.e.c.f50137Q, gVar);
                            } else if (iJ == 40) {
                                if ((i6 & 2) != 2) {
                                    this.f50129F = new java.util.ArrayList();
                                    i6 |= 2;
                                }
                                list = this.f50129F;
                                objT = java.lang.Integer.valueOf(eVar.r());
                            } else if (iJ == 42) {
                                int i10 = eVar.i(eVar.z());
                                if ((i6 & 2) != 2 && eVar.e() > 0) {
                                    this.f50129F = new java.util.ArrayList();
                                    i6 |= 2;
                                }
                                while (eVar.e() > 0) {
                                    this.f50129F.add(java.lang.Integer.valueOf(eVar.r()));
                                }
                                eVar.h(i10);
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                            list.add(objT);
                        }
                        z6 = true;
                    } catch (p158p8.k e6) {
                        throw e6.i(this);
                    } catch (java.io.IOException e10) {
                        throw new p158p8.k(e10.getMessage()).i(this);
                    }
                } catch (java.lang.Throwable th) {
                    if ((i6 & 1) == 1) {
                        this.f50128E = j$.util.DesugarCollections.unmodifiableList(this.f50128E);
                    }
                    if ((i6 & 2) == 2) {
                        this.f50129F = j$.util.DesugarCollections.unmodifiableList(this.f50129F);
                    }
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f50127D = bVarM.o();
                    }
                    m();
                    throw th;
                }
            }
            if ((i6 & 1) == 1) {
                this.f50128E = j$.util.DesugarCollections.unmodifiableList(this.f50128E);
            }
            if ((i6 & 2) == 2) {
                this.f50129F = j$.util.DesugarCollections.unmodifiableList(this.f50129F);
            }
            try {
                fVarI.H();
            } catch (java.io.IOException unused2) {
            } finally {
                this.f50127D = bVarM.o();
            }
            m();
        }

        private e(p8.i.b bVar) {
            super(bVar);
            this.f50130G = -1;
            this.f50131H = (byte) -1;
            this.f50132I = -1;
            this.f50127D = bVar.k();
        }

        private e(boolean z6) {
            this.f50130G = -1;
            this.f50131H = (byte) -1;
            this.f50132I = -1;
            this.f50127D = p158p8.d.f52766C;
        }

        public static l8.a.e.b A() {
            return l8.a.e.b.t();
        }

        public static l8.a.e.b B(l8.a.e eVar) {
            return A().l(eVar);
        }

        public static l8.a.e D(java.io.InputStream inputStream, p158p8.g gVar) {
            return (l8.a.e) f50126K.b(inputStream, gVar);
        }

        public static l8.a.e w() {
            return f50125J;
        }

        private void z() {
            this.f50128E = java.util.Collections.emptyList();
            this.f50129F = java.util.Collections.emptyList();
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
        public l8.a.e.b c() {
            return A();
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public l8.a.e.b e() {
            return B(this);
        }

        @Override // p158p8.p
        public int b() {
            int i6 = this.f50132I;
            if (i6 != -1) {
                return i6;
            }
            int iR = 0;
            for (int i10 = 0; i10 < this.f50128E.size(); i10++) {
                iR += p158p8.f.r(1, (p158p8.p) this.f50128E.get(i10));
            }
            int iP = 0;
            for (int i11 = 0; i11 < this.f50129F.size(); i11++) {
                iP += p158p8.f.p(((java.lang.Integer) this.f50129F.get(i11)).intValue());
            }
            int iP2 = iR + iP;
            if (!x().isEmpty()) {
                iP2 = iP2 + 1 + p158p8.f.p(iP);
            }
            this.f50130G = iP;
            int size = iP2 + this.f50127D.size();
            this.f50132I = size;
            return size;
        }

        @Override // p158p8.q
        public final boolean d() {
            byte b6 = this.f50131H;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            this.f50131H = (byte) 1;
            return true;
        }

        @Override // p158p8.p
        public void h(p158p8.f fVar) throws java.io.IOException {
            b();
            for (int i6 = 0; i6 < this.f50128E.size(); i6++) {
                fVar.c0(1, (p158p8.p) this.f50128E.get(i6));
            }
            if (x().size() > 0) {
                fVar.n0(42);
                fVar.n0(this.f50130G);
            }
            for (int i10 = 0; i10 < this.f50129F.size(); i10++) {
                fVar.a0(((java.lang.Integer) this.f50129F.get(i10)).intValue());
            }
            fVar.h0(this.f50127D);
        }

        public java.util.List x() {
            return this.f50129F;
        }

        public java.util.List y() {
            return this.f50128E;
        }
    }

    static {
        p088i8.d dVarH = p088i8.d.H();
        l8.a.c cVarV = l8.a.c.v();
        l8.a.c cVarV2 = l8.a.c.v();
        p8.y.b bVar = p8.y.b.f52882O;
        f50072a = p158p8.i.o(dVarH, cVarV, cVarV2, null, 100, bVar, l8.a.c.class);
        f50073b = p158p8.i.o(p088i8.i.a0(), l8.a.c.v(), l8.a.c.v(), null, 100, bVar, l8.a.c.class);
        p088i8.i iVarA0 = p088i8.i.a0();
        p8.y.b bVar2 = p8.y.b.f52876I;
        f50074c = p158p8.i.o(iVarA0, 0, null, null, 101, bVar2, java.lang.Integer.class);
        f50075d = p158p8.i.o(p088i8.n.Y(), l8.a.d.y(), l8.a.d.y(), null, 100, bVar, l8.a.d.class);
        f50076e = p158p8.i.o(p088i8.n.Y(), 0, null, null, 101, bVar2, java.lang.Integer.class);
        f50077f = p158p8.i.n(p088i8.q.X(), p088i8.b.z(), null, 100, bVar, false, p088i8.b.class);
        f50078g = p158p8.i.o(p088i8.q.X(), java.lang.Boolean.FALSE, null, null, 101, p8.y.b.f52879L, java.lang.Boolean.class);
        f50079h = p158p8.i.n(p088i8.s.K(), p088i8.b.z(), null, 100, bVar, false, p088i8.b.class);
        f50080i = p158p8.i.o(p088i8.c.z0(), 0, null, null, 101, bVar2, java.lang.Integer.class);
        f50081j = p158p8.i.n(p088i8.c.z0(), p088i8.n.Y(), null, 102, bVar, false, p088i8.n.class);
        f50082k = p158p8.i.o(p088i8.c.z0(), 0, null, null, 103, bVar2, java.lang.Integer.class);
        f50083l = p158p8.i.o(p088i8.c.z0(), 0, null, null, 104, bVar2, java.lang.Integer.class);
        f50084m = p158p8.i.o(p088i8.l.K(), 0, null, null, 101, bVar2, java.lang.Integer.class);
        f50085n = p158p8.i.n(p088i8.l.K(), p088i8.n.Y(), null, 102, bVar, false, p088i8.n.class);
    }

    public static void a(p158p8.g gVar) {
        gVar.a(f50072a);
        gVar.a(f50073b);
        gVar.a(f50074c);
        gVar.a(f50075d);
        gVar.a(f50076e);
        gVar.a(f50077f);
        gVar.a(f50078g);
        gVar.a(f50079h);
        gVar.a(f50080i);
        gVar.a(f50081j);
        gVar.a(f50082k);
        gVar.a(f50083l);
        gVar.a(f50084m);
        gVar.a(f50085n);
    }
}
