package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract X2.o a();

        public abstract X2.o.a b(X2.a aVar);

        public abstract X2.o.a c(X2.o.b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f15802C;

        b(int i6) {
            this.f15802C = i6;
        }
    }

    public static X2.o.a a() {
        return new X2.e.b();
    }

    public abstract X2.a b();

    public abstract X2.o.b c();
}
