package I6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final fa.d f5269a = Z6.a.a("io.ktor.client.plugins.HttpPlainText");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final J6.b f5270b = J6.i.b("HttpPlainText", I6.v.a.f5271L, new p237x7.l() { // from class: I6.u
        @Override // p237x7.l
        public final java.lang.Object l(java.lang.Object obj) {
            return I6.v.b((J6.d) obj);
        }
    });

    /* synthetic */ class a extends p247y7.C7348q implements p237x7.a {

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public static final I6.v.a f5271L = new I6.v.a();

        a() {
            super(0, I6.C1263t.class, "<init>", "<init>()V", 0);
        }

        @Override // p237x7.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public final I6.C1263t b() {
            return new I6.C1263t();
        }
    }

    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5272G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5273H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5274I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        final /* synthetic */ java.lang.String f5275J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ java.nio.charset.Charset f5276K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(java.lang.String str, java.nio.charset.Charset charset, p127m7.e eVar) {
            super(3, eVar);
            this.f5275J = str;
            this.f5276K = charset;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            p137n7.b.g();
            if (this.f5272G != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p087i7.x.b(obj);
            O6.d dVar = (O6.d) this.f5273H;
            java.lang.Object obj2 = this.f5274I;
            I6.v.c(this.f5275J, dVar);
            if (!(obj2 instanceof java.lang.String)) {
                return null;
            }
            T6.C1660h c1660hD = T6.AbstractC1677z.d(dVar);
            if (c1660hD == null || p247y7.AbstractC7350t.b(c1660hD.e(), T6.C1660h.d.f13165a.b().e())) {
                return I6.v.e(this.f5276K, dVar, (java.lang.String) obj2, c1660hD);
            }
            return null;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(O6.d dVar, java.lang.Object obj, p127m7.e eVar) {
            I6.v.b bVar = new I6.v.b(this.f5275J, this.f5276K, eVar);
            bVar.f5273H = dVar;
            bVar.f5274I = obj;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    static final class c extends p147o7.l implements p237x7.s {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5277G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5278H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5279I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5280J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        final /* synthetic */ java.nio.charset.Charset f5281K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(java.nio.charset.Charset charset, p127m7.e eVar) {
            super(5, eVar);
            this.f5281K = charset;
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            Q6.c cVar;
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5277G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                Q6.c cVar2 = (Q6.c) this.f5278H;
                io.ktor.utils.io.d dVar = (io.ktor.utils.io.d) this.f5279I;
                if (!p247y7.AbstractC7350t.b(((p017b7.a) this.f5280J).a(), p247y7.P.b(java.lang.String.class))) {
                    return null;
                }
                this.f5278H = cVar2;
                this.f5279I = null;
                this.f5277G = 1;
                java.lang.Object objF = io.ktor.utils.io.f.f(dVar, this);
                if (objF == objG) {
                    return objG;
                }
                cVar = cVar2;
                obj = objF;
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar = (Q6.c) this.f5278H;
                p087i7.x.b(obj);
            }
            return I6.v.d(this.f5281K, cVar.H0(), (p149o9.q) obj);
        }

        @Override // p237x7.s
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object v(J6.m mVar, Q6.c cVar, io.ktor.utils.io.d dVar, p017b7.a aVar, p127m7.e eVar) {
            I6.v.c cVar2 = new I6.v.c(this.f5281K, eVar);
            cVar2.f5278H = cVar;
            cVar2.f5279I = dVar;
            cVar2.f5280J = aVar;
            return cVar2.B(p087i7.M.f46721a);
        }
    }

    public static final class d implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d(p027c7.a.g((java.nio.charset.Charset) obj), p027c7.a.g((java.nio.charset.Charset) obj2));
        }
    }

    public static final class e implements java.util.Comparator {
        @Override // java.util.Comparator
        public final int compare(java.lang.Object obj, java.lang.Object obj2) {
            return p117l7.a.d((java.lang.Float) ((p087i7.u) obj2).d(), (java.lang.Float) ((p087i7.u) obj).d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p087i7.M b(J6.d dVar) {
        p247y7.AbstractC7350t.f(dVar, "$this$createClientPlugin");
        java.util.List<p087i7.u> listL0 = p097j7.AbstractC6879v.L0(p097j7.S.v(((I6.C1263t) dVar.e()).a()), new I6.v.e());
        java.nio.charset.Charset charsetC = ((I6.C1263t) dVar.e()).c();
        java.util.Set setB = ((I6.C1263t) dVar.e()).b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setB) {
            if (!((I6.C1263t) dVar.e()).a().containsKey((java.nio.charset.Charset) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.List<java.nio.charset.Charset> listL1 = p097j7.AbstractC6879v.L0(arrayList, new I6.v.d());
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.nio.charset.Charset charset : listL1) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(p027c7.a.g(charset));
        }
        for (p087i7.u uVar : listL0) {
            java.nio.charset.Charset charset2 = (java.nio.charset.Charset) uVar.a();
            float fFloatValue = ((java.lang.Number) uVar.b()).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d6 = fFloatValue;
            if (0.0d > d6 || d6 > 1.0d) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            sb.append(p027c7.a.g(charset2) + ";q=" + (((double) A7.a.d(100 * fFloatValue)) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(p027c7.a.g(charsetC));
        }
        java.lang.String string = sb.toString();
        p247y7.AbstractC7350t.e(string, "toString(...)");
        java.nio.charset.Charset charsetD = ((I6.C1263t) dVar.e()).d();
        if (charsetD == null && (charsetD = (java.nio.charset.Charset) p097j7.AbstractC6879v.k0(listL1)) == null) {
            p087i7.u uVar2 = (p087i7.u) p097j7.AbstractC6879v.k0(listL0);
            charsetD = uVar2 != null ? (java.nio.charset.Charset) uVar2.c() : null;
            if (charsetD == null) {
                charsetD = S8.C1631d.f12624b;
            }
        }
        dVar.f(I6.M.f5148a, new I6.v.b(string, charsetD, null));
        dVar.h(new I6.v.c(charsetC, null));
        return p087i7.M.f46721a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(java.lang.String str, O6.d dVar) {
        T6.C1669q c1669qA = dVar.a();
        T6.C1673v c1673v = T6.C1673v.f13241a;
        if (c1669qA.k(c1673v.d()) != null) {
            return;
        }
        f5269a.g("Adding Accept-Charset=" + str + " to " + dVar.j());
        dVar.a().n(c1673v.d(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String d(java.nio.charset.Charset charset, D6.b bVar, p149o9.q qVar) {
        java.nio.charset.Charset charsetA = T6.AbstractC1677z.a(bVar.e());
        if (charsetA != null) {
            charset = charsetA;
        }
        f5269a.g("Reading response body for " + bVar.d().r() + " as String with charset " + charset);
        return p037d7.e.b(qVar, charset, 0, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U6.b e(java.nio.charset.Charset charset, O6.d dVar, java.lang.String str, T6.C1660h c1660h) {
        java.nio.charset.Charset charsetA;
        T6.C1660h c1660hB = c1660h == null ? T6.C1660h.d.f13165a.b() : c1660h;
        if (c1660h != null && (charsetA = T6.AbstractC1661i.a(c1660h)) != null) {
            charset = charsetA;
        }
        f5269a.g("Sending request body to " + dVar.j() + " as text/plain with charset " + charset);
        return new U6.f(str, T6.AbstractC1661i.b(c1660hB, charset), null, 4, null);
    }

    public static final J6.b i() {
        return f5270b;
    }
}
