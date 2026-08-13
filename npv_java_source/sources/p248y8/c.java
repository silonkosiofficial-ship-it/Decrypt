package p248y8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    public static final class a extends p248y8.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y8.c.a f57312a = new y8.c.a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f57313b;

        static {
            y8.d.a aVar = p248y8.d.f57315c;
            f57313b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // p248y8.c
        public int a() {
            return f57313b;
        }
    }

    public static final class b extends p248y8.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final y8.c.b f57314a = new y8.c.b();

        private b() {
        }

        @Override // p248y8.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public java.lang.String toString() {
        return getClass().getSimpleName();
    }
}
