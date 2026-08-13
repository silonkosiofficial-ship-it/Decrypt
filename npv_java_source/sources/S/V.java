package S;

/* JADX INFO: loaded from: classes.dex */
final class V extends S.AbstractC1547h implements S.U {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S.V.a f10546g = new S.V.a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private V.InterfaceC1753w0 f10547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private V.InterfaceC1753w0 f10548f;

    public static final class a {

        /* JADX INFO: renamed from: S.V$a$a, reason: collision with other inner class name */
        static final class C0235a extends p247y7.AbstractC7352v implements p237x7.p {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            public static final S.V.a.C0235a f10549D = new S.V.a.C0235a();

            C0235a() {
                super(2);
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final java.util.List u(p041e0.l lVar, S.V v6) {
                return p097j7.AbstractC6879v.p(v6.f(), java.lang.Long.valueOf(v6.e()), java.lang.Integer.valueOf(v6.g().f()), java.lang.Integer.valueOf(v6.g().g()), java.lang.Integer.valueOf(v6.b()));
            }
        }

        static final class b extends p247y7.AbstractC7352v implements p237x7.l {

            /* JADX INFO: renamed from: D, reason: collision with root package name */
            final /* synthetic */ S.P0 f10550D;

            /* JADX INFO: renamed from: E, reason: collision with root package name */
            final /* synthetic */ java.util.Locale f10551E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(S.P0 p6, java.util.Locale locale) {
                super(1);
                this.f10550D = p6;
                this.f10551E = locale;
            }

            @Override // p237x7.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final S.V l(java.util.List list) {
                java.lang.Long l6 = (java.lang.Long) list.get(0);
                java.lang.Long l10 = (java.lang.Long) list.get(1);
                java.lang.Object obj = list.get(2);
                p247y7.AbstractC7350t.d(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj2 = list.get(3);
                p247y7.AbstractC7350t.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                E7.i iVar = new E7.i(iIntValue, ((java.lang.Integer) obj2).intValue());
                java.lang.Object obj3 = list.get(4);
                p247y7.AbstractC7350t.d(obj3, "null cannot be cast to non-null type kotlin.Int");
                return new S.V(l6, l10, iVar, S.Y.d(((java.lang.Integer) obj3).intValue()), this.f10550D, this.f10551E, null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p041e0.j a(S.P0 p6, java.util.Locale locale) {
            return p041e0.a.a(S.V.a.C0235a.f10549D, new S.V.a.b(p6, locale));
        }
    }

    private V(java.lang.Long l6, java.lang.Long l10, E7.i iVar, int i6, S.P0 p6, java.util.Locale locale) {
        T.C1646e c1646eB;
        super(l10, iVar, p6, locale);
        if (l6 != null) {
            c1646eB = i().b(l6.longValue());
            if (!iVar.D(c1646eB.m())) {
                throw new java.lang.IllegalArgumentException(("The provided initial date's year (" + c1646eB.m() + ") is out of the years range of " + iVar + '.').toString());
            }
        } else {
            c1646eB = null;
        }
        this.f10547e = V.A1.d(c1646eB, null, 2, null);
        this.f10548f = V.A1.d(S.Y.c(i6), null, 2, null);
    }

    public /* synthetic */ V(java.lang.Long l6, java.lang.Long l10, E7.i iVar, int i6, S.P0 p6, java.util.Locale locale, p247y7.AbstractC7342k abstractC7342k) {
        this(l6, l10, iVar, i6, p6, locale);
    }

    @Override // S.U
    public void a(int i6) {
        java.lang.Long lF = f();
        if (lF != null) {
            c(i().g(lF.longValue()).d());
        }
        this.f10548f.setValue(S.Y.c(i6));
    }

    @Override // S.U
    public int b() {
        return ((S.Y) this.f10548f.getValue()).i();
    }

    @Override // S.U
    public java.lang.Long f() {
        T.C1646e c1646e = (T.C1646e) this.f10547e.getValue();
        if (c1646e != null) {
            return java.lang.Long.valueOf(c1646e.i());
        }
        return null;
    }

    @Override // S.U
    public void h(java.lang.Long l6) {
        if (l6 == null) {
            this.f10547e.setValue(null);
            return;
        }
        T.C1646e c1646eB = i().b(l6.longValue());
        if (g().D(c1646eB.m())) {
            this.f10547e.setValue(c1646eB);
            return;
        }
        throw new java.lang.IllegalArgumentException(("The provided date's year (" + c1646eB.m() + ") is out of the years range of " + g() + '.').toString());
    }
}
