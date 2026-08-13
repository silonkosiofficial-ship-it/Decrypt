package p047e7;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: e7.a$a, reason: collision with other inner class name */
    public static final class C0497a extends java.io.InputStream {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.d f44749C;

        /* JADX INFO: renamed from: e7.a$a$a, reason: collision with other inner class name */
        static final class C0498a extends p147o7.l implements p237x7.p {

            /* JADX INFO: renamed from: G, reason: collision with root package name */
            int f44750G;

            /* JADX INFO: renamed from: H, reason: collision with root package name */
            final /* synthetic */ io.ktor.utils.io.d f44751H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0498a(io.ktor.utils.io.d dVar, p127m7.e eVar) {
                super(2, eVar);
                this.f44751H = dVar;
            }

            @Override // p147o7.a
            public final java.lang.Object B(java.lang.Object obj) {
                java.lang.Object objG = p137n7.b.g();
                int i6 = this.f44750G;
                if (i6 == 0) {
                    p087i7.x.b(obj);
                    io.ktor.utils.io.d dVar = this.f44751H;
                    this.f44750G = 1;
                    obj = io.ktor.utils.io.d.b.a(dVar, 0, this, 1, null);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i6 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p087i7.x.b(obj);
                }
                return obj;
            }

            @Override // p237x7.p
            /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
            public final java.lang.Object u(W8.N n6, p127m7.e eVar) {
                return ((p047e7.a.C0497a.C0498a) x(n6, eVar)).B(p087i7.M.f46721a);
            }

            @Override // p147o7.a
            public final p127m7.e x(java.lang.Object obj, p127m7.e eVar) {
                return new p047e7.a.C0497a.C0498a(this.f44751H, eVar);
            }
        }

        C0497a(io.ktor.utils.io.d dVar) {
            this.f44749C = dVar;
        }

        private final void a() {
            W8.AbstractC1786h.b(null, new p047e7.a.C0497a.C0498a(this.f44749C, null), 1, null);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            io.ktor.utils.io.e.a(this.f44749C);
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f44749C.h()) {
                return -1;
            }
            if (this.f44749C.d().j()) {
                a();
            }
            if (this.f44749C.h()) {
                return -1;
            }
            return this.f44749C.d().m() & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i10) {
            p247y7.AbstractC7350t.f(bArr, "b");
            if (this.f44749C.h()) {
                return -1;
            }
            if (this.f44749C.d().j()) {
                a();
            }
            int iV = this.f44749C.d().V(bArr, i6, java.lang.Math.min(io.ktor.utils.io.f.c(this.f44749C), i10) + i6);
            if (iV >= 0) {
                return iV;
            }
            return this.f44749C.h() ? -1 : 0;
        }
    }

    public static final java.io.InputStream a(io.ktor.utils.io.d dVar, W8.InterfaceC1822z0 interfaceC1822z0) {
        p247y7.AbstractC7350t.f(dVar, "<this>");
        return new p047e7.a.C0497a(dVar);
    }

    public static /* synthetic */ java.io.InputStream b(io.ktor.utils.io.d dVar, W8.InterfaceC1822z0 interfaceC1822z0, int i6, java.lang.Object obj) {
        if ((i6 & 1) != 0) {
            interfaceC1822z0 = null;
        }
        return a(dVar, interfaceC1822z0);
    }
}
