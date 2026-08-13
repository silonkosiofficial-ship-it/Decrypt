package D;

/* JADX INFO: renamed from: D.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0870g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f1644a = Y0.i.q(2500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f1645b = Y0.i.q(1500);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f1646c = Y0.i.q(50);

    /* JADX INFO: renamed from: D.g$a */
    static final class a extends p147o7.l implements p237x7.p {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        java.lang.Object f1647G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        java.lang.Object f1648H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        java.lang.Object f1649I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        float f1650J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        float f1651K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        float f1652L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        int f1653M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        int f1654N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f1655O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        final /* synthetic */ int f1656P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        final /* synthetic */ Y0.e f1657Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        final /* synthetic */ D.InterfaceC0871h f1658R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        final /* synthetic */ int f1659S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        final /* synthetic */ int f1660T;

        /* JADX INFO: renamed from: D.g$a$a, reason: collision with other inner class name */
        static final class C0034a extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ D.InterfaceC0871h f1661D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ int f1662E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ float f1663F;

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            final /* synthetic */ p247y7.L f1664G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ p230x.w f1665H;

            /* JADX INFO: renamed from: I, reason: collision with root package name */
            final /* synthetic */ p247y7.K f1666I;

            /* JADX INFO: renamed from: J, reason: collision with root package name */
            final /* synthetic */ boolean f1667J;

            /* JADX INFO: renamed from: K, reason: collision with root package name */
            final /* synthetic */ float f1668K;

            /* JADX INFO: renamed from: L, reason: collision with root package name */
            final /* synthetic */ p247y7.M f1669L;

            /* JADX INFO: renamed from: M, reason: collision with root package name */
            final /* synthetic */ int f1670M;

            /* JADX INFO: renamed from: N, reason: collision with root package name */
            final /* synthetic */ int f1671N;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ p247y7.O f1672O;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0034a(D.InterfaceC0871h interfaceC0871h, int i6, float f6, p247y7.L l6, p230x.w wVar, p247y7.K k6, boolean z6, float f10, p247y7.M m6, int i10, int i11, p247y7.O o6) {
                super(1);
                this.f1661D = interfaceC0871h;
                this.f1662E = i6;
                this.f1663F = f6;
                this.f1664G = l6;
                this.f1665H = wVar;
                this.f1666I = k6;
                this.f1667J = z6;
                this.f1668K = f10;
                this.f1669L = m6;
                this.f1670M = i10;
                this.f1671N = i11;
                this.f1672O = o6;
            }

            public final void a(p200u.C7173i c7173i) {
                if (!D.AbstractC0870g.e(this.f1661D, this.f1662E)) {
                    float f6 = (this.f1663F > 0.0f ? E7.j.f(((java.lang.Number) c7173i.e()).floatValue(), this.f1663F) : E7.j.c(((java.lang.Number) c7173i.e()).floatValue(), this.f1663F)) - this.f1664G.f57251C;
                    float fA = this.f1665H.a(f6);
                    if (!D.AbstractC0870g.e(this.f1661D, this.f1662E) && !D.AbstractC0870g.a.K(this.f1667J, this.f1661D, this.f1662E, this.f1671N)) {
                        if (f6 != fA) {
                            c7173i.a();
                            this.f1666I.f57250C = false;
                            return;
                        }
                        this.f1664G.f57251C += f6;
                        if (!this.f1667J ? ((java.lang.Number) c7173i.e()).floatValue() < (-this.f1668K) : ((java.lang.Number) c7173i.e()).floatValue() > this.f1668K) {
                            c7173i.a();
                        }
                        if (this.f1667J) {
                            if (this.f1669L.f57252C >= 2) {
                                int iB = this.f1662E - this.f1661D.b();
                                int i6 = this.f1670M;
                                if (iB > i6) {
                                    this.f1661D.c(this.f1665H, this.f1662E - i6, 0);
                                }
                            }
                        } else if (this.f1669L.f57252C >= 2) {
                            int iG = this.f1661D.g();
                            int i10 = this.f1662E;
                            int i11 = iG - i10;
                            int i12 = this.f1670M;
                            if (i11 > i12) {
                                this.f1661D.c(this.f1665H, i10 + i12, 0);
                            }
                        }
                    }
                }
                if (!D.AbstractC0870g.a.K(this.f1667J, this.f1661D, this.f1662E, this.f1671N)) {
                    if (D.AbstractC0870g.e(this.f1661D, this.f1662E)) {
                        throw new D.C0869f(A7.a.d(this.f1661D.f(this.f1662E)), (p200u.C7179l) this.f1672O.f57254C);
                    }
                } else {
                    this.f1661D.c(this.f1665H, this.f1662E, this.f1671N);
                    this.f1666I.f57250C = false;
                    c7173i.a();
                }
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p200u.C7173i) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX INFO: renamed from: D.g$a$b */
        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ float f1673D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ p247y7.L f1674E;

            /* JADX INFO: renamed from: F, reason: collision with root package name */
            final /* synthetic */ p230x.w f1675F;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(float f6, p247y7.L l6, p230x.w wVar) {
                super(1);
                this.f1673D = f6;
                this.f1674E = l6;
                this.f1675F = wVar;
            }

            public final void a(p200u.C7173i c7173i) {
                float f6 = this.f1673D;
                float fC = 0.0f;
                if (f6 > 0.0f) {
                    fC = E7.j.f(((java.lang.Number) c7173i.e()).floatValue(), this.f1673D);
                } else if (f6 < 0.0f) {
                    fC = E7.j.c(((java.lang.Number) c7173i.e()).floatValue(), this.f1673D);
                }
                float f10 = fC - this.f1674E.f57251C;
                if (f10 != this.f1675F.a(f10) || fC != ((java.lang.Number) c7173i.e()).floatValue()) {
                    c7173i.a();
                }
                this.f1674E.f57251C += f10;
            }

            @Override // p237x7.l
            public /* bridge */ /* synthetic */ java.lang.Object l(java.lang.Object obj) {
                a((p200u.C7173i) obj);
                return p087i7.M.f46721a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i6, Y0.e eVar, D.InterfaceC0871h interfaceC0871h, int i10, int i11, p127m7.e eVar2) {
            super(2, eVar2);
            this.f1656P = i6;
            this.f1657Q = eVar;
            this.f1658R = interfaceC0871h;
            this.f1659S = i10;
            this.f1660T = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean K(boolean z6, D.InterfaceC0871h interfaceC0871h, int i6, int i10) {
            if (z6) {
                if (interfaceC0871h.g() <= i6 && (interfaceC0871h.g() != i6 || interfaceC0871h.d() <= i10)) {
                    return false;
                }
            } else if (interfaceC0871h.g() >= i6 && (interfaceC0871h.g() != i6 || interfaceC0871h.d() >= i10)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x00ce A[Catch: f -> 0x01bb, TryCatch #7 {f -> 0x01bb, blocks: (B:28:0x00ca, B:30:0x00ce, B:32:0x00d6, B:44:0x0105, B:48:0x0141, B:52:0x014e), top: B:106:0x00ca }] */
        /* JADX WARN: Code duplicated, block: B:41:0x00fe A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x0100  */
        /* JADX WARN: Code duplicated, block: B:43:0x0103  */
        /* JADX WARN: Code duplicated, block: B:46:0x013e  */
        /* JADX WARN: Code duplicated, block: B:47:0x0140  */
        /* JADX WARN: Code duplicated, block: B:50:0x0149  */
        /* JADX WARN: Code duplicated, block: B:51:0x014c  */
        /* JADX WARN: Code duplicated, block: B:59:0x0199 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x019a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x019a -> B:102:0x01a2). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object r35) {
            /*
                Method dump skipped, instruction units count: 615
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0870g.a.B(java.lang.Object):java.lang.Object");
        }

        @Override // p237x7.p
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object u(p230x.w wVar, p127m7.e eVar) {
            return ((D.AbstractC0870g.a) x(wVar, eVar)).B(p087i7.M.f46721a);
        }

        @Override // p147o7.a
        public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
            D.AbstractC0870g.a aVar = new D.AbstractC0870g.a(this.f1656P, this.f1657Q, this.f1658R, this.f1659S, this.f1660T, eVar);
            aVar.f1655O = obj;
            return aVar;
        }
    }

    public static final java.lang.Object d(D.InterfaceC0871h interfaceC0871h, int i6, int i10, int i11, Y0.e eVar, p127m7.e eVar2) {
        java.lang.Object objE = interfaceC0871h.e(new D.AbstractC0870g.a(i6, eVar, interfaceC0871h, i10, i11, null), eVar2);
        return objE == p137n7.b.g() ? objE : p087i7.M.f46721a;
    }

    public static final boolean e(D.InterfaceC0871h interfaceC0871h, int i6) {
        return i6 <= interfaceC0871h.b() && interfaceC0871h.g() <= i6;
    }
}
