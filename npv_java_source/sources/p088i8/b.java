package p088i8;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends p158p8.i implements p158p8.q {

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final p088i8.b f46762J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static p158p8.r f46763K = new i8.b.a();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final p158p8.d f46764D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f46765E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private int f46766F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private java.util.List f46767G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private byte f46768H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f46769I;

    static class a extends p158p8.b {
        a() {
        }

        @Override // p158p8.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public p088i8.b a(p158p8.e eVar, p158p8.g gVar) {
            return new p088i8.b(eVar, gVar);
        }
    }

    /* JADX INFO: renamed from: i8.b$b, reason: collision with other inner class name */
    public static final class C0568b extends p158p8.i implements p158p8.q {

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        private static final p088i8.b.C0568b f46770J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public static p158p8.r f46771K = new p088i8.b.C0568b.a();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p158p8.d f46772D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f46773E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private int f46774F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private p088i8.b.C0568b.c f46775G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private byte f46776H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        private int f46777I;

        /* JADX INFO: renamed from: i8.b$b$a */
        static class a extends p158p8.b {
            a() {
            }

            @Override // p158p8.r
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public p088i8.b.C0568b a(p158p8.e eVar, p158p8.g gVar) {
                return new p088i8.b.C0568b(eVar, gVar);
            }
        }

        /* JADX INFO: renamed from: i8.b$b$b, reason: collision with other inner class name */
        public static final class C0569b extends p8.i.b implements p158p8.q {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private int f46778D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private int f46779E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private p088i8.b.C0568b.c f46780F = p088i8.b.C0568b.c.L();

            private C0569b() {
                u();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static p088i8.b.C0568b.C0569b t() {
                return new p088i8.b.C0568b.C0569b();
            }

            private void u() {
            }

            @Override // p8.p.a
            /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
            public p088i8.b.C0568b i() {
                p088i8.b.C0568b c0568bQ = q();
                if (c0568bQ.d()) {
                    return c0568bQ;
                }
                throw p158p8.a.AbstractC0680a.j(c0568bQ);
            }

            public p088i8.b.C0568b q() {
                p088i8.b.C0568b c0568b = new p088i8.b.C0568b(this);
                int i6 = this.f46778D;
                int i10 = (i6 & 1) != 1 ? 0 : 1;
                c0568b.f46774F = this.f46779E;
                if ((i6 & 2) == 2) {
                    i10 |= 2;
                }
                c0568b.f46775G = this.f46780F;
                c0568b.f46773E = i10;
                return c0568b;
            }

            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public p088i8.b.C0568b.C0569b clone() {
                return t().l(q());
            }

            @Override // p8.i.b
            /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
            public p088i8.b.C0568b.C0569b l(p088i8.b.C0568b c0568b) {
                if (c0568b == p088i8.b.C0568b.v()) {
                    return this;
                }
                if (c0568b.y()) {
                    y(c0568b.w());
                }
                if (c0568b.z()) {
                    x(c0568b.x());
                }
                m(k().e(c0568b.f46772D));
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001d  */
            @Override // p8.p.a
            /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
            public p088i8.b.C0568b.C0569b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                p088i8.b.C0568b c0568b = null;
                try {
                    try {
                        p088i8.b.C0568b c0568b2 = (p088i8.b.C0568b) p088i8.b.C0568b.f46771K.a(eVar, gVar);
                        if (c0568b2 != null) {
                            l(c0568b2);
                        }
                        return this;
                    } catch (p158p8.k e6) {
                        p088i8.b.C0568b c0568b3 = (p088i8.b.C0568b) e6.a();
                        try {
                            throw e6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            c0568b = c0568b3;
                            if (c0568b != null) {
                                l(c0568b);
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (c0568b != null) {
                        l(c0568b);
                    }
                    throw th;
                }
            }

            public p088i8.b.C0568b.C0569b x(p088i8.b.C0568b.c cVar) {
                if ((this.f46778D & 2) == 2 && this.f46780F != p088i8.b.C0568b.c.L()) {
                    cVar = p088i8.b.C0568b.c.f0(this.f46780F).l(cVar).q();
                }
                this.f46780F = cVar;
                this.f46778D |= 2;
                return this;
            }

            public p088i8.b.C0568b.C0569b y(int i6) {
                this.f46778D |= 1;
                this.f46779E = i6;
                return this;
            }
        }

        /* JADX INFO: renamed from: i8.b$b$c */
        public static final class c extends p158p8.i implements p158p8.q {

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            private static final p088i8.b.C0568b.c f46781S;

            /* JADX INFO: renamed from: T, reason: collision with root package name */
            public static p158p8.r f46782T = new p088i8.b.C0568b.c.a();

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            private final p158p8.d f46783D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            private int f46784E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            private p088i8.b.C0568b.c.EnumC0571c f46785F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            private long f46786G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            private float f46787H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            private double f46788I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            private int f46789J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            private int f46790K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            private int f46791L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            private p088i8.b f46792M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            private java.util.List f46793N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            private int f46794O;

            /* JADX INFO: renamed from: P, reason: collision with root package name */
            private int f46795P;

            /* JADX INFO: renamed from: Q, reason: collision with root package name */
            private byte f46796Q;

            /* JADX INFO: renamed from: R, reason: collision with root package name */
            private int f46797R;

            /* JADX INFO: renamed from: i8.b$b$c$a */
            static class a extends p158p8.b {
                a() {
                }

                @Override // p158p8.r
                /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
                public p088i8.b.C0568b.c a(p158p8.e eVar, p158p8.g gVar) {
                    return new p088i8.b.C0568b.c(eVar, gVar);
                }
            }

            /* JADX INFO: renamed from: i8.b$b$c$b, reason: collision with other inner class name */
            public static final class C0570b extends p8.i.b implements p158p8.q {

                /* JADX INFO: renamed from: D, reason: collision with root package name */
                private int f46798D;

                /* JADX INFO: renamed from: F, reason: collision with root package name */
                private long f46800F;

                /* JADX INFO: renamed from: G, reason: collision with root package name */
                private float f46801G;

                /* JADX INFO: renamed from: H, reason: collision with root package name */
                private double f46802H;

                /* JADX INFO: renamed from: I, reason: collision with root package name */
                private int f46803I;

                /* JADX INFO: renamed from: J, reason: collision with root package name */
                private int f46804J;

                /* JADX INFO: renamed from: K, reason: collision with root package name */
                private int f46805K;

                /* JADX INFO: renamed from: N, reason: collision with root package name */
                private int f46808N;

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                private int f46809O;

                /* JADX INFO: renamed from: E, reason: collision with root package name */
                private p088i8.b.C0568b.c.EnumC0571c f46799E = p088i8.b.C0568b.c.EnumC0571c.BYTE;

                /* JADX INFO: renamed from: L, reason: collision with root package name */
                private p088i8.b f46806L = p088i8.b.z();

                /* JADX INFO: renamed from: M, reason: collision with root package name */
                private java.util.List f46807M = java.util.Collections.emptyList();

                private C0570b() {
                    v();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static p088i8.b.C0568b.c.C0570b t() {
                    return new p088i8.b.C0568b.c.C0570b();
                }

                private void u() {
                    if ((this.f46798D & 256) != 256) {
                        this.f46807M = new java.util.ArrayList(this.f46807M);
                        this.f46798D |= 256;
                    }
                }

                private void v() {
                }

                public p088i8.b.C0568b.c.C0570b A(int i6) {
                    this.f46798D |= 32;
                    this.f46804J = i6;
                    return this;
                }

                public p088i8.b.C0568b.c.C0570b B(double d6) {
                    this.f46798D |= 8;
                    this.f46802H = d6;
                    return this;
                }

                public p088i8.b.C0568b.c.C0570b C(int i6) {
                    this.f46798D |= 64;
                    this.f46805K = i6;
                    return this;
                }

                public p088i8.b.C0568b.c.C0570b E(int i6) {
                    this.f46798D |= 1024;
                    this.f46809O = i6;
                    return this;
                }

                public p088i8.b.C0568b.c.C0570b F(float f6) {
                    this.f46798D |= 4;
                    this.f46801G = f6;
                    return this;
                }

                public p088i8.b.C0568b.c.C0570b G(long j6) {
                    this.f46798D |= 2;
                    this.f46800F = j6;
                    return this;
                }

                public p088i8.b.C0568b.c.C0570b H(int i6) {
                    this.f46798D |= 16;
                    this.f46803I = i6;
                    return this;
                }

                public p088i8.b.C0568b.c.C0570b I(p088i8.b.C0568b.c.EnumC0571c enumC0571c) {
                    enumC0571c.getClass();
                    this.f46798D |= 1;
                    this.f46799E = enumC0571c;
                    return this;
                }

                @Override // p8.p.a
                /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
                public p088i8.b.C0568b.c i() {
                    p088i8.b.C0568b.c cVarQ = q();
                    if (cVarQ.d()) {
                        return cVarQ;
                    }
                    throw p158p8.a.AbstractC0680a.j(cVarQ);
                }

                public p088i8.b.C0568b.c q() {
                    p088i8.b.C0568b.c cVar = new p088i8.b.C0568b.c(this);
                    int i6 = this.f46798D;
                    int i10 = (i6 & 1) != 1 ? 0 : 1;
                    cVar.f46785F = this.f46799E;
                    if ((i6 & 2) == 2) {
                        i10 |= 2;
                    }
                    cVar.f46786G = this.f46800F;
                    if ((i6 & 4) == 4) {
                        i10 |= 4;
                    }
                    cVar.f46787H = this.f46801G;
                    if ((i6 & 8) == 8) {
                        i10 |= 8;
                    }
                    cVar.f46788I = this.f46802H;
                    if ((i6 & 16) == 16) {
                        i10 |= 16;
                    }
                    cVar.f46789J = this.f46803I;
                    if ((i6 & 32) == 32) {
                        i10 |= 32;
                    }
                    cVar.f46790K = this.f46804J;
                    if ((i6 & 64) == 64) {
                        i10 |= 64;
                    }
                    cVar.f46791L = this.f46805K;
                    if ((i6 & 128) == 128) {
                        i10 |= 128;
                    }
                    cVar.f46792M = this.f46806L;
                    if ((this.f46798D & 256) == 256) {
                        this.f46807M = j$.util.DesugarCollections.unmodifiableList(this.f46807M);
                        this.f46798D &= -257;
                    }
                    cVar.f46793N = this.f46807M;
                    if ((i6 & 512) == 512) {
                        i10 |= 256;
                    }
                    cVar.f46794O = this.f46808N;
                    if ((i6 & 1024) == 1024) {
                        i10 |= 512;
                    }
                    cVar.f46795P = this.f46809O;
                    cVar.f46784E = i10;
                    return cVar;
                }

                /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
                public p088i8.b.C0568b.c.C0570b clone() {
                    return t().l(q());
                }

                public p088i8.b.C0568b.c.C0570b w(p088i8.b bVar) {
                    if ((this.f46798D & 128) == 128 && this.f46806L != p088i8.b.z()) {
                        bVar = p088i8.b.E(this.f46806L).l(bVar).q();
                    }
                    this.f46806L = bVar;
                    this.f46798D |= 128;
                    return this;
                }

                @Override // p8.i.b
                /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
                public p088i8.b.C0568b.c.C0570b l(p088i8.b.C0568b.c cVar) {
                    if (cVar == p088i8.b.C0568b.c.L()) {
                        return this;
                    }
                    if (cVar.c0()) {
                        I(cVar.S());
                    }
                    if (cVar.a0()) {
                        G(cVar.Q());
                    }
                    if (cVar.Z()) {
                        F(cVar.P());
                    }
                    if (cVar.W()) {
                        B(cVar.M());
                    }
                    if (cVar.b0()) {
                        H(cVar.R());
                    }
                    if (cVar.V()) {
                        A(cVar.K());
                    }
                    if (cVar.X()) {
                        C(cVar.N());
                    }
                    if (cVar.T()) {
                        w(cVar.F());
                    }
                    if (!cVar.f46793N.isEmpty()) {
                        if (this.f46807M.isEmpty()) {
                            this.f46807M = cVar.f46793N;
                            this.f46798D &= -257;
                        } else {
                            u();
                            this.f46807M.addAll(cVar.f46793N);
                        }
                    }
                    if (cVar.U()) {
                        z(cVar.G());
                    }
                    if (cVar.Y()) {
                        E(cVar.O());
                    }
                    m(k().e(cVar.f46783D));
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:15:0x001d  */
                @Override // p8.p.a
                /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
                public p088i8.b.C0568b.c.C0570b g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
                    p088i8.b.C0568b.c cVar = null;
                    try {
                        try {
                            p088i8.b.C0568b.c cVar2 = (p088i8.b.C0568b.c) p088i8.b.C0568b.c.f46782T.a(eVar, gVar);
                            if (cVar2 != null) {
                                l(cVar2);
                            }
                            return this;
                        } catch (p158p8.k e6) {
                            p088i8.b.C0568b.c cVar3 = (p088i8.b.C0568b.c) e6.a();
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

                public p088i8.b.C0568b.c.C0570b z(int i6) {
                    this.f46798D |= 512;
                    this.f46808N = i6;
                    return this;
                }
            }

            /* JADX INFO: renamed from: i8.b$b$c$c, reason: collision with other inner class name */
            public enum EnumC0571c implements p8.j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);


                /* JADX INFO: renamed from: Q, reason: collision with root package name */
                private static p8.j.b f46823Q = new p088i8.b.C0568b.c.EnumC0571c.a();

                /* JADX INFO: renamed from: C, reason: collision with root package name */
                private final int f46825C;

                /* JADX INFO: renamed from: i8.b$b$c$c$a */
                static class a implements p8.j.b {
                    a() {
                    }

                    @Override // p8.j.b
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public p088i8.b.C0568b.c.EnumC0571c a(int i6) {
                        return p088i8.b.C0568b.c.EnumC0571c.e(i6);
                    }
                }

                EnumC0571c(int i6, int i10) {
                    this.f46825C = i10;
                }

                public static p088i8.b.C0568b.c.EnumC0571c e(int i6) {
                    switch (i6) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                @Override // p8.j.a
                public final int c() {
                    return this.f46825C;
                }
            }

            static {
                p088i8.b.C0568b.c cVar = new p088i8.b.C0568b.c(true);
                f46781S = cVar;
                cVar.d0();
            }

            private c(p158p8.e eVar, p158p8.g gVar) {
                this.f46796Q = (byte) -1;
                this.f46797R = -1;
                d0();
                p8.d.b bVarM = p158p8.d.M();
                p158p8.f fVarI = p158p8.f.I(bVarM, 1);
                boolean z6 = false;
                char c6 = 0;
                while (!z6) {
                    try {
                        try {
                            int iJ = eVar.J();
                            switch (iJ) {
                                case 0:
                                    break;
                                case 8:
                                    int iM = eVar.m();
                                    p088i8.b.C0568b.c.EnumC0571c enumC0571cE = p088i8.b.C0568b.c.EnumC0571c.e(iM);
                                    if (enumC0571cE == null) {
                                        fVarI.n0(iJ);
                                        fVarI.n0(iM);
                                    } else {
                                        this.f46784E |= 1;
                                        this.f46785F = enumC0571cE;
                                        continue;
                                    }
                                    break;
                                case 16:
                                    this.f46784E |= 2;
                                    this.f46786G = eVar.G();
                                    continue;
                                case 29:
                                    this.f46784E |= 4;
                                    this.f46787H = eVar.p();
                                    continue;
                                case com.mohamedrejeb.ksoup.html.tokenizer.KsoupTokenizer.LONGEST_HTML_ENTITY_LENGTH /* 33 */:
                                    this.f46784E |= 8;
                                    this.f46788I = eVar.l();
                                    continue;
                                case 40:
                                    this.f46784E |= 16;
                                    this.f46789J = eVar.r();
                                    continue;
                                case 48:
                                    this.f46784E |= 32;
                                    this.f46790K = eVar.r();
                                    continue;
                                case 56:
                                    this.f46784E |= 64;
                                    this.f46791L = eVar.r();
                                    continue;
                                case 66:
                                    i8.b.c cVarE = (this.f46784E & 128) == 128 ? this.f46792M.e() : null;
                                    p088i8.b bVar = (p088i8.b) eVar.t(p088i8.b.f46763K, gVar);
                                    this.f46792M = bVar;
                                    if (cVarE != null) {
                                        cVarE.l(bVar);
                                        this.f46792M = cVarE.q();
                                    }
                                    this.f46784E |= 128;
                                    continue;
                                case 74:
                                    if ((c6 & 256) != 256) {
                                        this.f46793N = new java.util.ArrayList();
                                        c6 = 256;
                                    }
                                    this.f46793N.add(eVar.t(f46782T, gVar));
                                    continue;
                                case 80:
                                    this.f46784E |= 512;
                                    this.f46795P = eVar.r();
                                    continue;
                                case 88:
                                    this.f46784E |= 256;
                                    this.f46794O = eVar.r();
                                    continue;
                                default:
                                    if (!p(eVar, fVarI, gVar, iJ)) {
                                        break;
                                    }
                                    break;
                            }
                            z6 = true;
                        } catch (java.lang.Throwable th) {
                            if ((c6 & 256) == 256) {
                                this.f46793N = j$.util.DesugarCollections.unmodifiableList(this.f46793N);
                            }
                            try {
                                fVarI.H();
                            } catch (java.io.IOException unused) {
                            } finally {
                                this.f46783D = bVarM.o();
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
                if ((c6 & 256) == 256) {
                    this.f46793N = j$.util.DesugarCollections.unmodifiableList(this.f46793N);
                }
                try {
                    fVarI.H();
                } catch (java.io.IOException unused2) {
                } finally {
                    this.f46783D = bVarM.o();
                }
                m();
            }

            private c(p8.i.b bVar) {
                super(bVar);
                this.f46796Q = (byte) -1;
                this.f46797R = -1;
                this.f46783D = bVar.k();
            }

            private c(boolean z6) {
                this.f46796Q = (byte) -1;
                this.f46797R = -1;
                this.f46783D = p158p8.d.f52766C;
            }

            public static p088i8.b.C0568b.c L() {
                return f46781S;
            }

            private void d0() {
                this.f46785F = p088i8.b.C0568b.c.EnumC0571c.BYTE;
                this.f46786G = 0L;
                this.f46787H = 0.0f;
                this.f46788I = 0.0d;
                this.f46789J = 0;
                this.f46790K = 0;
                this.f46791L = 0;
                this.f46792M = p088i8.b.z();
                this.f46793N = java.util.Collections.emptyList();
                this.f46794O = 0;
                this.f46795P = 0;
            }

            public static p088i8.b.C0568b.c.C0570b e0() {
                return p088i8.b.C0568b.c.C0570b.t();
            }

            public static p088i8.b.C0568b.c.C0570b f0(p088i8.b.C0568b.c cVar) {
                return e0().l(cVar);
            }

            public p088i8.b F() {
                return this.f46792M;
            }

            public int G() {
                return this.f46794O;
            }

            public p088i8.b.C0568b.c H(int i6) {
                return (p088i8.b.C0568b.c) this.f46793N.get(i6);
            }

            public int I() {
                return this.f46793N.size();
            }

            public java.util.List J() {
                return this.f46793N;
            }

            public int K() {
                return this.f46790K;
            }

            public double M() {
                return this.f46788I;
            }

            public int N() {
                return this.f46791L;
            }

            public int O() {
                return this.f46795P;
            }

            public float P() {
                return this.f46787H;
            }

            public long Q() {
                return this.f46786G;
            }

            public int R() {
                return this.f46789J;
            }

            public p088i8.b.C0568b.c.EnumC0571c S() {
                return this.f46785F;
            }

            public boolean T() {
                return (this.f46784E & 128) == 128;
            }

            public boolean U() {
                return (this.f46784E & 256) == 256;
            }

            public boolean V() {
                return (this.f46784E & 32) == 32;
            }

            public boolean W() {
                return (this.f46784E & 8) == 8;
            }

            public boolean X() {
                return (this.f46784E & 64) == 64;
            }

            public boolean Y() {
                return (this.f46784E & 512) == 512;
            }

            public boolean Z() {
                return (this.f46784E & 4) == 4;
            }

            public boolean a0() {
                return (this.f46784E & 2) == 2;
            }

            @Override // p158p8.p
            public int b() {
                int i6 = this.f46797R;
                if (i6 != -1) {
                    return i6;
                }
                int iH = (this.f46784E & 1) == 1 ? p158p8.f.h(1, this.f46785F.c()) : 0;
                if ((this.f46784E & 2) == 2) {
                    iH += p158p8.f.z(2, this.f46786G);
                }
                if ((this.f46784E & 4) == 4) {
                    iH += p158p8.f.l(3, this.f46787H);
                }
                if ((this.f46784E & 8) == 8) {
                    iH += p158p8.f.f(4, this.f46788I);
                }
                if ((this.f46784E & 16) == 16) {
                    iH += p158p8.f.o(5, this.f46789J);
                }
                if ((this.f46784E & 32) == 32) {
                    iH += p158p8.f.o(6, this.f46790K);
                }
                if ((this.f46784E & 64) == 64) {
                    iH += p158p8.f.o(7, this.f46791L);
                }
                if ((this.f46784E & 128) == 128) {
                    iH += p158p8.f.r(8, this.f46792M);
                }
                for (int i10 = 0; i10 < this.f46793N.size(); i10++) {
                    iH += p158p8.f.r(9, (p158p8.p) this.f46793N.get(i10));
                }
                if ((this.f46784E & 512) == 512) {
                    iH += p158p8.f.o(10, this.f46795P);
                }
                if ((this.f46784E & 256) == 256) {
                    iH += p158p8.f.o(11, this.f46794O);
                }
                int size = iH + this.f46783D.size();
                this.f46797R = size;
                return size;
            }

            public boolean b0() {
                return (this.f46784E & 16) == 16;
            }

            public boolean c0() {
                return (this.f46784E & 1) == 1;
            }

            @Override // p158p8.q
            public final boolean d() {
                byte b6 = this.f46796Q;
                if (b6 == 1) {
                    return true;
                }
                if (b6 == 0) {
                    return false;
                }
                if (T() && !F().d()) {
                    this.f46796Q = (byte) 0;
                    return false;
                }
                for (int i6 = 0; i6 < I(); i6++) {
                    if (!H(i6).d()) {
                        this.f46796Q = (byte) 0;
                        return false;
                    }
                }
                this.f46796Q = (byte) 1;
                return true;
            }

            @Override // p158p8.p
            public void h(p158p8.f fVar) throws java.io.IOException {
                b();
                if ((this.f46784E & 1) == 1) {
                    fVar.R(1, this.f46785F.c());
                }
                if ((this.f46784E & 2) == 2) {
                    fVar.s0(2, this.f46786G);
                }
                if ((this.f46784E & 4) == 4) {
                    fVar.V(3, this.f46787H);
                }
                if ((this.f46784E & 8) == 8) {
                    fVar.P(4, this.f46788I);
                }
                if ((this.f46784E & 16) == 16) {
                    fVar.Z(5, this.f46789J);
                }
                if ((this.f46784E & 32) == 32) {
                    fVar.Z(6, this.f46790K);
                }
                if ((this.f46784E & 64) == 64) {
                    fVar.Z(7, this.f46791L);
                }
                if ((this.f46784E & 128) == 128) {
                    fVar.c0(8, this.f46792M);
                }
                for (int i6 = 0; i6 < this.f46793N.size(); i6++) {
                    fVar.c0(9, (p158p8.p) this.f46793N.get(i6));
                }
                if ((this.f46784E & 512) == 512) {
                    fVar.Z(10, this.f46795P);
                }
                if ((this.f46784E & 256) == 256) {
                    fVar.Z(11, this.f46794O);
                }
                fVar.h0(this.f46783D);
            }

            @Override // p158p8.p
            /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
            public p088i8.b.C0568b.c.C0570b c() {
                return e0();
            }

            @Override // p158p8.p
            /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
            public p088i8.b.C0568b.c.C0570b e() {
                return f0(this);
            }
        }

        static {
            p088i8.b.C0568b c0568b = new p088i8.b.C0568b(true);
            f46770J = c0568b;
            c0568b.A();
        }

        private C0568b(p158p8.e eVar, p158p8.g gVar) {
            this.f46776H = (byte) -1;
            this.f46777I = -1;
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
                                this.f46773E |= 1;
                                this.f46774F = eVar.r();
                            } else if (iJ == 18) {
                                p088i8.b.C0568b.c.C0570b c0570bE = (this.f46773E & 2) == 2 ? this.f46775G.e() : null;
                                p088i8.b.C0568b.c cVar = (p088i8.b.C0568b.c) eVar.t(p088i8.b.C0568b.c.f46782T, gVar);
                                this.f46775G = cVar;
                                if (c0570bE != null) {
                                    c0570bE.l(cVar);
                                    this.f46775G = c0570bE.q();
                                }
                                this.f46773E |= 2;
                            } else if (!p(eVar, fVarI, gVar, iJ)) {
                            }
                        }
                        z6 = true;
                    } catch (java.lang.Throwable th) {
                        try {
                            fVarI.H();
                        } catch (java.io.IOException unused) {
                        } finally {
                            this.f46772D = bVarM.o();
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
                this.f46772D = bVarM.o();
            }
            m();
        }

        private C0568b(p8.i.b bVar) {
            super(bVar);
            this.f46776H = (byte) -1;
            this.f46777I = -1;
            this.f46772D = bVar.k();
        }

        private C0568b(boolean z6) {
            this.f46776H = (byte) -1;
            this.f46777I = -1;
            this.f46772D = p158p8.d.f52766C;
        }

        private void A() {
            this.f46774F = 0;
            this.f46775G = p088i8.b.C0568b.c.L();
        }

        public static p088i8.b.C0568b.C0569b B() {
            return p088i8.b.C0568b.C0569b.t();
        }

        public static p088i8.b.C0568b.C0569b C(p088i8.b.C0568b c0568b) {
            return B().l(c0568b);
        }

        public static p088i8.b.C0568b v() {
            return f46770J;
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public p088i8.b.C0568b.C0569b c() {
            return B();
        }

        @Override // p158p8.p
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public p088i8.b.C0568b.C0569b e() {
            return C(this);
        }

        @Override // p158p8.p
        public int b() {
            int i6 = this.f46777I;
            if (i6 != -1) {
                return i6;
            }
            int iO = (this.f46773E & 1) == 1 ? p158p8.f.o(1, this.f46774F) : 0;
            if ((this.f46773E & 2) == 2) {
                iO += p158p8.f.r(2, this.f46775G);
            }
            int size = iO + this.f46772D.size();
            this.f46777I = size;
            return size;
        }

        @Override // p158p8.q
        public final boolean d() {
            byte b6 = this.f46776H;
            if (b6 == 1) {
                return true;
            }
            if (b6 == 0) {
                return false;
            }
            if (!y()) {
                this.f46776H = (byte) 0;
                return false;
            }
            if (!z()) {
                this.f46776H = (byte) 0;
                return false;
            }
            if (x().d()) {
                this.f46776H = (byte) 1;
                return true;
            }
            this.f46776H = (byte) 0;
            return false;
        }

        @Override // p158p8.p
        public void h(p158p8.f fVar) throws java.io.IOException {
            b();
            if ((this.f46773E & 1) == 1) {
                fVar.Z(1, this.f46774F);
            }
            if ((this.f46773E & 2) == 2) {
                fVar.c0(2, this.f46775G);
            }
            fVar.h0(this.f46772D);
        }

        public int w() {
            return this.f46774F;
        }

        public p088i8.b.C0568b.c x() {
            return this.f46775G;
        }

        public boolean y() {
            return (this.f46773E & 1) == 1;
        }

        public boolean z() {
            return (this.f46773E & 2) == 2;
        }
    }

    public static final class c extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private int f46826D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private int f46827E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private java.util.List f46828F = java.util.Collections.emptyList();

        private c() {
            v();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static i8.b.c t() {
            return new i8.b.c();
        }

        private void u() {
            if ((this.f46826D & 2) != 2) {
                this.f46828F = new java.util.ArrayList(this.f46828F);
                this.f46826D |= 2;
            }
        }

        private void v() {
        }

        @Override // p8.p.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public p088i8.b i() {
            p088i8.b bVarQ = q();
            if (bVarQ.d()) {
                return bVarQ;
            }
            throw p158p8.a.AbstractC0680a.j(bVarQ);
        }

        public p088i8.b q() {
            p088i8.b bVar = new p088i8.b(this);
            int i6 = (this.f46826D & 1) != 1 ? 0 : 1;
            bVar.f46766F = this.f46827E;
            if ((this.f46826D & 2) == 2) {
                this.f46828F = j$.util.DesugarCollections.unmodifiableList(this.f46828F);
                this.f46826D &= -3;
            }
            bVar.f46767G = this.f46828F;
            bVar.f46765E = i6;
            return bVar;
        }

        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public i8.b.c clone() {
            return t().l(q());
        }

        @Override // p8.i.b
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public i8.b.c l(p088i8.b bVar) {
            if (bVar == p088i8.b.z()) {
                return this;
            }
            if (bVar.B()) {
                y(bVar.A());
            }
            if (!bVar.f46767G.isEmpty()) {
                if (this.f46828F.isEmpty()) {
                    this.f46828F = bVar.f46767G;
                    this.f46826D &= -3;
                } else {
                    u();
                    this.f46828F.addAll(bVar.f46767G);
                }
            }
            m(k().e(bVar.f46764D));
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d  */
        @Override // p8.p.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public i8.b.c g0(p158p8.e eVar, p158p8.g gVar) throws java.lang.Throwable {
            p088i8.b bVar = null;
            try {
                try {
                    p088i8.b bVar2 = (p088i8.b) p088i8.b.f46763K.a(eVar, gVar);
                    if (bVar2 != null) {
                        l(bVar2);
                    }
                    return this;
                } catch (p158p8.k e6) {
                    p088i8.b bVar3 = (p088i8.b) e6.a();
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

        public i8.b.c y(int i6) {
            this.f46826D |= 1;
            this.f46827E = i6;
            return this;
        }
    }

    static {
        p088i8.b bVar = new p088i8.b(true);
        f46762J = bVar;
        bVar.C();
    }

    private b(p158p8.e eVar, p158p8.g gVar) {
        this.f46768H = (byte) -1;
        this.f46769I = -1;
        C();
        p8.d.b bVarM = p158p8.d.M();
        p158p8.f fVarI = p158p8.f.I(bVarM, 1);
        boolean z6 = false;
        char c6 = 0;
        while (!z6) {
            try {
                try {
                    int iJ = eVar.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.f46765E |= 1;
                            this.f46766F = eVar.r();
                        } else if (iJ == 18) {
                            if ((c6 & 2) != 2) {
                                this.f46767G = new java.util.ArrayList();
                                c6 = 2;
                            }
                            this.f46767G.add(eVar.t(p088i8.b.C0568b.f46771K, gVar));
                        } else if (!p(eVar, fVarI, gVar, iJ)) {
                        }
                    }
                    z6 = true;
                } catch (java.lang.Throwable th) {
                    if ((c6 & 2) == 2) {
                        this.f46767G = j$.util.DesugarCollections.unmodifiableList(this.f46767G);
                    }
                    try {
                        fVarI.H();
                    } catch (java.io.IOException unused) {
                    } finally {
                        this.f46764D = bVarM.o();
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
        if ((c6 & 2) == 2) {
            this.f46767G = j$.util.DesugarCollections.unmodifiableList(this.f46767G);
        }
        try {
            fVarI.H();
        } catch (java.io.IOException unused2) {
        } finally {
            this.f46764D = bVarM.o();
        }
        m();
    }

    private b(p8.i.b bVar) {
        super(bVar);
        this.f46768H = (byte) -1;
        this.f46769I = -1;
        this.f46764D = bVar.k();
    }

    private b(boolean z6) {
        this.f46768H = (byte) -1;
        this.f46769I = -1;
        this.f46764D = p158p8.d.f52766C;
    }

    private void C() {
        this.f46766F = 0;
        this.f46767G = java.util.Collections.emptyList();
    }

    public static i8.b.c D() {
        return i8.b.c.t();
    }

    public static i8.b.c E(p088i8.b bVar) {
        return D().l(bVar);
    }

    public static p088i8.b z() {
        return f46762J;
    }

    public int A() {
        return this.f46766F;
    }

    public boolean B() {
        return (this.f46765E & 1) == 1;
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public i8.b.c c() {
        return D();
    }

    @Override // p158p8.p
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public i8.b.c e() {
        return E(this);
    }

    @Override // p158p8.p
    public int b() {
        int i6 = this.f46769I;
        if (i6 != -1) {
            return i6;
        }
        int iO = (this.f46765E & 1) == 1 ? p158p8.f.o(1, this.f46766F) : 0;
        for (int i10 = 0; i10 < this.f46767G.size(); i10++) {
            iO += p158p8.f.r(2, (p158p8.p) this.f46767G.get(i10));
        }
        int size = iO + this.f46764D.size();
        this.f46769I = size;
        return size;
    }

    @Override // p158p8.q
    public final boolean d() {
        byte b6 = this.f46768H;
        if (b6 == 1) {
            return true;
        }
        if (b6 == 0) {
            return false;
        }
        if (!B()) {
            this.f46768H = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < x(); i6++) {
            if (!w(i6).d()) {
                this.f46768H = (byte) 0;
                return false;
            }
        }
        this.f46768H = (byte) 1;
        return true;
    }

    @Override // p158p8.p
    public void h(p158p8.f fVar) throws java.io.IOException {
        b();
        if ((this.f46765E & 1) == 1) {
            fVar.Z(1, this.f46766F);
        }
        for (int i6 = 0; i6 < this.f46767G.size(); i6++) {
            fVar.c0(2, (p158p8.p) this.f46767G.get(i6));
        }
        fVar.h0(this.f46764D);
    }

    public p088i8.b.C0568b w(int i6) {
        return (p088i8.b.C0568b) this.f46767G.get(i6);
    }

    public int x() {
        return this.f46767G.size();
    }

    public java.util.List y() {
        return this.f46767G;
    }
}
