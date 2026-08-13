package io.ktor.utils.io;

/* JADX INFO: loaded from: classes3.dex */
public interface d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.ktor.utils.io.d.a f47628a = io.ktor.utils.io.d.a.f47629a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ io.ktor.utils.io.d.a f47629a = new io.ktor.utils.io.d.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final io.ktor.utils.io.d f47630b = new io.ktor.utils.io.d.a.C0608a();

        /* JADX INFO: renamed from: io.ktor.utils.io.d$a$a, reason: collision with other inner class name */
        public static final class C0608a implements io.ktor.utils.io.d {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final java.lang.Throwable f47631b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final p149o9.q f47632c = new p149o9.a();

            C0608a() {
            }

            @Override // io.ktor.utils.io.d
            public java.lang.Throwable a() {
                return this.f47631b;
            }

            @Override // io.ktor.utils.io.d
            public p149o9.q d() {
                return this.f47632c;
            }

            @Override // io.ktor.utils.io.d
            public java.lang.Object f(int i6, p127m7.e eVar) {
                return p147o7.b.a(false);
            }

            @Override // io.ktor.utils.io.d
            public boolean h() {
                return true;
            }

            @Override // io.ktor.utils.io.d
            public void k(java.lang.Throwable th) {
            }
        }

        private a() {
        }

        public final io.ktor.utils.io.d a() {
            return f47630b;
        }
    }

    public static final class b {
        public static /* synthetic */ java.lang.Object a(io.ktor.utils.io.d dVar, int i6, p127m7.e eVar, int i10, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitContent");
            }
            if ((i10 & 1) != 0) {
                i6 = 1;
            }
            return dVar.f(i6, eVar);
        }
    }

    java.lang.Throwable a();

    p149o9.q d();

    java.lang.Object f(int i6, p127m7.e eVar);

    boolean h();

    void k(java.lang.Throwable th);
}
