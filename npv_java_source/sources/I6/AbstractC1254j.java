package I6;

/* JADX INFO: renamed from: I6.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1254j {

    /* JADX INFO: renamed from: I6.j$a */
    public static final class a extends U6.b.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.Long f5211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T6.C1660h f5212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.Object f5213c;

        a(O6.d dVar, T6.C1660h c1660h, java.lang.Object obj) {
            this.f5213c = obj;
            java.lang.String strK = dVar.a().k(T6.C1673v.f13241a.g());
            this.f5211a = strK != null ? java.lang.Long.valueOf(java.lang.Long.parseLong(strK)) : null;
            this.f5212b = c1660h == null ? T6.C1660h.a.f13133a.a() : c1660h;
        }

        @Override // U6.b
        public java.lang.Long a() {
            return this.f5211a;
        }

        @Override // U6.b
        public T6.C1660h b() {
            return this.f5212b;
        }

        @Override // U6.b.c
        public io.ktor.utils.io.d d() {
            return p047e7.c.b((java.io.InputStream) this.f5213c, null, null, 3, null);
        }
    }

    /* JADX INFO: renamed from: I6.j$b */
    static final class b extends p147o7.l implements p237x7.q {

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        int f5214G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        private /* synthetic */ java.lang.Object f5215H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        /* synthetic */ java.lang.Object f5216I;

        /* JADX INFO: renamed from: I6.j$b$a */
        public static final class a extends java.io.InputStream {

            /* JADX INFO: renamed from: C, reason: collision with root package name */
            final /* synthetic */ java.io.InputStream f5217C;

            a(java.io.InputStream inputStream) {
                this.f5217C = inputStream;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f5217C.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws java.io.IOException {
                super.close();
                this.f5217C.close();
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f5217C.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i6, int i10) {
                p247y7.AbstractC7350t.f(bArr, "b");
                return this.f5217C.read(bArr, i6, i10);
            }
        }

        b(p127m7.e eVar) {
            super(3, eVar);
        }

        @Override // p147o7.a
        public final java.lang.Object B(java.lang.Object obj) {
            java.lang.Object objG = p137n7.b.g();
            int i6 = this.f5214G;
            if (i6 == 0) {
                p087i7.x.b(obj);
                p007a7.e eVar = (p007a7.e) this.f5215H;
                Q6.d dVar = (Q6.d) this.f5216I;
                p017b7.a aVarA = dVar.a();
                java.lang.Object objB = dVar.b();
                if (!(objB instanceof io.ktor.utils.io.d)) {
                    return p087i7.M.f46721a;
                }
                if (p247y7.AbstractC7350t.b(aVarA.a(), p247y7.P.b(java.io.InputStream.class))) {
                    Q6.d dVar2 = new Q6.d(aVarA, new I6.AbstractC1254j.b.a(p047e7.a.a((io.ktor.utils.io.d) objB, (W8.InterfaceC1822z0) ((D6.b) eVar.b()).getCoroutineContext().i(W8.InterfaceC1822z0.f15544h))));
                    this.f5215H = null;
                    this.f5214G = 1;
                    if (eVar.e(dVar2, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i6 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p087i7.x.b(obj);
            }
            return p087i7.M.f46721a;
        }

        @Override // p237x7.q
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object j(p007a7.e eVar, Q6.d dVar, p127m7.e eVar2) {
            I6.AbstractC1254j.b bVar = new I6.AbstractC1254j.b(eVar2);
            bVar.f5215H = eVar;
            bVar.f5216I = dVar;
            return bVar.B(p087i7.M.f46721a);
        }
    }

    public static final U6.b a(T6.C1660h c1660h, O6.d dVar, java.lang.Object obj) {
        p247y7.AbstractC7350t.f(dVar, "context");
        p247y7.AbstractC7350t.f(obj, "body");
        if (obj instanceof java.io.InputStream) {
            return new I6.AbstractC1254j.a(dVar, c1660h, obj);
        }
        return null;
    }

    public static final void b(C6.c cVar) {
        p247y7.AbstractC7350t.f(cVar, "<this>");
        cVar.H().l(Q6.f.f9096g.a(), new I6.AbstractC1254j.b(null));
    }
}
