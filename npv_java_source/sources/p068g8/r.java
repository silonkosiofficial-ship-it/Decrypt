package p068g8;

/* JADX INFO: loaded from: classes2.dex */
public interface r extends B8.v {

    public static abstract class a {

        /* JADX INFO: renamed from: g8.r$a$a, reason: collision with other inner class name */
        public static final class C0522a extends g8.r.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p068g8.t f45701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final byte[] f45702b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0522a(p068g8.t tVar, byte[] bArr) {
                super(null);
                p247y7.AbstractC7350t.f(tVar, "kotlinJvmBinaryClass");
                this.f45701a = tVar;
                this.f45702b = bArr;
            }

            public /* synthetic */ C0522a(p068g8.t tVar, byte[] bArr, int i6, p247y7.AbstractC7342k abstractC7342k) {
                this(tVar, (i6 & 2) != 0 ? null : bArr);
            }

            public final p068g8.t b() {
                return this.f45701a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(p247y7.AbstractC7342k abstractC7342k) {
            this();
        }

        public final p068g8.t a() {
            g8.r.a.C0522a c0522a = this instanceof g8.r.a.C0522a ? (g8.r.a.C0522a) this : null;
            if (c0522a != null) {
                return c0522a.b();
            }
            return null;
        }
    }

    g8.r.a a(p138n8.b bVar, p128m8.e eVar);

    g8.r.a b(p048e8.g gVar, p128m8.e eVar);
}
