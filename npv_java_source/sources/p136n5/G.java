package p136n5;

/* JADX INFO: loaded from: classes3.dex */
public abstract class G {

    public static abstract class a {
        public static n5.G.a b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i6, p076h5.f fVar) {
            return new p136n5.C(str, str2, str3, str4, i6, fVar);
        }

        public abstract java.lang.String a();

        public abstract int c();

        public abstract p076h5.f d();

        public abstract java.lang.String e();

        public abstract java.lang.String f();

        public abstract java.lang.String g();
    }

    public static abstract class b {
        public static n5.G.b c(int i6, java.lang.String str, int i10, long j6, long j10, boolean z6, int i11, java.lang.String str2, java.lang.String str3) {
            return new p136n5.D(i6, str, i10, j6, j10, z6, i11, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract java.lang.String f();

        public abstract java.lang.String g();

        public abstract java.lang.String h();

        public abstract int i();

        public abstract long j();
    }

    public static abstract class c {
        public static n5.G.c a(java.lang.String str, java.lang.String str2, boolean z6) {
            return new p136n5.E(str, str2, z6);
        }

        public abstract boolean b();

        public abstract java.lang.String c();

        public abstract java.lang.String d();
    }

    public static p136n5.G b(n5.G.a aVar, n5.G.c cVar, n5.G.b bVar) {
        return new p136n5.B(aVar, cVar, bVar);
    }

    public abstract n5.G.a a();

    public abstract n5.G.b c();

    public abstract n5.G.c d();
}
