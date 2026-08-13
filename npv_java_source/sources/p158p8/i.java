package p158p8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends p158p8.a implements java.io.Serializable {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f52801a;

        static {
            int[] iArr = new int[p8.y.c.values().length];
            f52801a = iArr;
            try {
                iArr[p8.y.c.MESSAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f52801a[p8.y.c.ENUM.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b extends p158p8.a.AbstractC0680a {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private p158p8.d f52802C = p158p8.d.f52766C;

        protected b() {
        }

        public final p158p8.d k() {
            return this.f52802C;
        }

        public abstract p8.i.b l(p158p8.i iVar);

        public final p8.i.b m(p158p8.d dVar) {
            this.f52802C = dVar;
            return this;
        }
    }

    public static abstract class c extends p8.i.b implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private p158p8.h f52803D = p158p8.h.g();

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f52804E;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public p158p8.h p() {
            this.f52803D.q();
            this.f52804E = false;
            return this.f52803D;
        }

        private void q() {
            if (this.f52804E) {
                return;
            }
            this.f52803D = this.f52803D.clone();
            this.f52804E = true;
        }

        protected final void r(p8.i.d dVar) {
            q();
            this.f52803D.r(dVar.f52805D);
        }
    }

    public static abstract class d extends p158p8.i implements p158p8.q {

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final p158p8.h f52805D;

        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.util.Iterator f52806a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private java.util.Map.Entry f52807b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f52808c;

            private a(boolean z6) {
                java.util.Iterator itP = p8.i.d.this.f52805D.p();
                this.f52806a = itP;
                if (itP.hasNext()) {
                    this.f52807b = (java.util.Map.Entry) itP.next();
                }
                this.f52808c = z6;
            }

            /* synthetic */ a(p8.i.d dVar, boolean z6, p8.i.a aVar) {
                this(z6);
            }

            public void a(int i6, p158p8.f fVar) {
                while (true) {
                    java.util.Map.Entry entry = this.f52807b;
                    if (entry == null || ((p8.i.e) entry.getKey()).c() >= i6) {
                        return;
                    }
                    p8.i.e eVar = (p8.i.e) this.f52807b.getKey();
                    if (this.f52808c && eVar.p() == p8.y.c.MESSAGE && !eVar.h()) {
                        fVar.e0(eVar.c(), (p158p8.p) this.f52807b.getValue());
                    } else {
                        p158p8.h.z(eVar, this.f52807b.getValue(), fVar);
                    }
                    this.f52807b = this.f52806a.hasNext() ? (java.util.Map.Entry) this.f52806a.next() : null;
                }
            }
        }

        protected d() {
            this.f52805D = p158p8.h.t();
        }

        protected d(p8.i.c cVar) {
            this.f52805D = cVar.p();
        }

        private void z(p8.i.f fVar) {
            if (fVar.b() != a()) {
                throw new java.lang.IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // p158p8.i
        protected void m() {
            this.f52805D.q();
        }

        @Override // p158p8.i
        protected boolean p(p158p8.e eVar, p158p8.f fVar, p158p8.g gVar, int i6) {
            return p158p8.i.q(this.f52805D, a(), eVar, fVar, gVar, i6);
        }

        protected boolean s() {
            return this.f52805D.n();
        }

        protected int t() {
            return this.f52805D.k();
        }

        public final java.lang.Object u(p8.i.f fVar) {
            z(fVar);
            java.lang.Object objH = this.f52805D.h(fVar.f52818d);
            return objH == null ? fVar.f52816b : fVar.a(objH);
        }

        public final java.lang.Object v(p8.i.f fVar, int i6) {
            z(fVar);
            return fVar.e(this.f52805D.i(fVar.f52818d, i6));
        }

        public final int w(p8.i.f fVar) {
            z(fVar);
            return this.f52805D.j(fVar.f52818d);
        }

        public final boolean x(p8.i.f fVar) {
            z(fVar);
            return this.f52805D.m(fVar.f52818d);
        }

        protected p8.i.d.a y() {
            return new p8.i.d.a(this, false, null);
        }
    }

    static final class e implements p8.h.b {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final p8.j.b f52810C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        final int f52811D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        final p8.y.b f52812E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        final boolean f52813F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        final boolean f52814G;

        e(p8.j.b bVar, int i6, p8.y.b bVar2, boolean z6, boolean z10) {
            this.f52810C = bVar;
            this.f52811D = i6;
            this.f52812E = bVar2;
            this.f52813F = z6;
            this.f52814G = z10;
        }

        @Override // p8.h.b
        public int c() {
            return this.f52811D;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(p8.i.e eVar) {
            return this.f52811D - eVar.f52811D;
        }

        public p8.j.b g() {
            return this.f52810C;
        }

        @Override // p8.h.b
        public boolean h() {
            return this.f52813F;
        }

        @Override // p8.h.b
        public p8.y.b j() {
            return this.f52812E;
        }

        @Override // p8.h.b
        public boolean k() {
            return this.f52814G;
        }

        @Override // p8.h.b
        public p8.p.a l(p8.p.a aVar, p158p8.p pVar) {
            return ((p8.i.b) aVar).l((p158p8.i) pVar);
        }

        @Override // p8.h.b
        public p8.y.c p() {
            return this.f52812E.e();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p158p8.p f52815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final java.lang.Object f52816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p158p8.p f52817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final p8.i.e f52818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final java.lang.Class f52819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final java.lang.reflect.Method f52820f;

        f(p158p8.p pVar, java.lang.Object obj, p158p8.p pVar2, p8.i.e eVar, java.lang.Class cls) {
            if (pVar == null) {
                throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.j() == p8.y.b.f52882O && pVar2 == null) {
                throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f52815a = pVar;
            this.f52816b = obj;
            this.f52817c = pVar2;
            this.f52818d = eVar;
            this.f52819e = cls;
            this.f52820f = p8.j.a.class.isAssignableFrom(cls) ? p158p8.i.k(cls, "valueOf", java.lang.Integer.TYPE) : null;
        }

        java.lang.Object a(java.lang.Object obj) {
            if (!this.f52818d.h()) {
                return e(obj);
            }
            if (this.f52818d.p() != p8.y.c.ENUM) {
                return obj;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public p158p8.p b() {
            return this.f52815a;
        }

        public p158p8.p c() {
            return this.f52817c;
        }

        public int d() {
            return this.f52818d.c();
        }

        java.lang.Object e(java.lang.Object obj) {
            return this.f52818d.p() == p8.y.c.ENUM ? p158p8.i.l(this.f52820f, null, (java.lang.Integer) obj) : obj;
        }

        java.lang.Object f(java.lang.Object obj) {
            return this.f52818d.p() == p8.y.c.ENUM ? java.lang.Integer.valueOf(((p8.j.a) obj).c()) : obj;
        }
    }

    protected i() {
    }

    protected i(p8.i.b bVar) {
    }

    static java.lang.reflect.Method k(java.lang.Class cls, java.lang.String str, java.lang.Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (java.lang.NoSuchMethodException e6) {
            java.lang.String name = cls.getName();
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            java.lang.StringBuilder sb = new java.lang.StringBuilder(name.length() + 45 + strValueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(strValueOf);
            sb.append("\".");
            throw new java.lang.RuntimeException(sb.toString(), e6);
        }
    }

    static java.lang.Object l(java.lang.reflect.Method method, java.lang.Object obj, java.lang.Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (java.lang.IllegalAccessException e6) {
            throw new java.lang.RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (java.lang.reflect.InvocationTargetException e10) {
            java.lang.Throwable cause = e10.getCause();
            if (cause instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) cause);
            }
            if (cause instanceof java.lang.Error) {
                throw ((java.lang.Error) cause);
            }
            throw new java.lang.RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static p8.i.f n(p158p8.p pVar, p158p8.p pVar2, p8.j.b bVar, int i6, p8.y.b bVar2, boolean z6, java.lang.Class cls) {
        return new p8.i.f(pVar, java.util.Collections.emptyList(), pVar2, new p8.i.e(bVar, i6, bVar2, true, z6), cls);
    }

    public static p8.i.f o(p158p8.p pVar, java.lang.Object obj, p158p8.p pVar2, p8.j.b bVar, int i6, p8.y.b bVar2, java.lang.Class cls) {
        return new p8.i.f(pVar, obj, pVar2, new p8.i.e(bVar, i6, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static boolean q(p158p8.h hVar, p158p8.p pVar, p158p8.e eVar, p158p8.f fVar, p158p8.g gVar, int i6) throws p158p8.k {
        boolean z6;
        boolean z10;
        java.lang.Object objI;
        p158p8.p pVar2;
        int iB = p158p8.y.b(i6);
        p8.i.f fVarB = gVar.b(pVar, p158p8.y.a(i6));
        if (fVarB == null) {
            z10 = true;
            z6 = false;
        } else if (iB == p158p8.h.l(fVarB.f52818d.j(), false)) {
            z10 = false;
            z6 = false;
        } else {
            p8.i.e eVar2 = fVarB.f52818d;
            if (eVar2.f52813F && eVar2.f52812E.i() && iB == p158p8.h.l(fVarB.f52818d.j(), true)) {
                z6 = true;
                z10 = false;
            } else {
                z10 = true;
                z6 = false;
            }
        }
        if (z10) {
            return eVar.O(i6, fVar);
        }
        if (z6) {
            int i10 = eVar.i(eVar.z());
            if (fVarB.f52818d.j() == p8.y.b.f52885R) {
                while (eVar.e() > 0) {
                    p8.j.a aVarA = fVarB.f52818d.g().a(eVar.m());
                    if (aVarA == null) {
                        return true;
                    }
                    hVar.a(fVarB.f52818d, fVarB.f(aVarA));
                }
            } else {
                while (eVar.e() > 0) {
                    hVar.a(fVarB.f52818d, p158p8.h.u(eVar, fVarB.f52818d.j(), false));
                }
            }
            eVar.h(i10);
        } else {
            int i11 = p8.i.a.f52801a[fVarB.f52818d.p().ordinal()];
            if (i11 == 1) {
                p8.p.a aVarE = (fVarB.f52818d.h() || (pVar2 = (p158p8.p) hVar.h(fVarB.f52818d)) == null) ? null : pVar2.e();
                if (aVarE == null) {
                    aVarE = fVarB.c().c();
                }
                if (fVarB.f52818d.j() == p8.y.b.f52881N) {
                    eVar.q(fVarB.d(), aVarE, gVar);
                } else {
                    eVar.u(aVarE, gVar);
                }
                objI = aVarE.i();
            } else if (i11 != 2) {
                objI = p158p8.h.u(eVar, fVarB.f52818d.j(), false);
            } else {
                int iM = eVar.m();
                p8.j.a aVarA2 = fVarB.f52818d.g().a(iM);
                if (aVarA2 == null) {
                    fVar.n0(i6);
                    fVar.x0(iM);
                    return true;
                }
                objI = aVarA2;
            }
            if (fVarB.f52818d.h()) {
                hVar.a(fVarB.f52818d, fVarB.f(objI));
            } else {
                hVar.v(fVarB.f52818d, fVarB.f(objI));
            }
        }
        return true;
    }

    protected void m() {
    }

    protected boolean p(p158p8.e eVar, p158p8.f fVar, p158p8.g gVar, int i6) {
        return eVar.O(i6, fVar);
    }
}
