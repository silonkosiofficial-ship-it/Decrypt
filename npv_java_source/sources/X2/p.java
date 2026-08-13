package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static abstract class a {
        public abstract X2.p a();

        public abstract X2.p.a b(X2.s sVar);

        public abstract X2.p.a c(X2.p.b bVar);
    }

    public enum b {
        NOT_SET(0),
        EVENT_OVERRIDE(5);


        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private static final android.util.SparseArray f15805F;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final int f15807C;

        static {
            X2.p.b bVar = NOT_SET;
            X2.p.b bVar2 = EVENT_OVERRIDE;
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            f15805F = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(5, bVar2);
        }

        b(int i6) {
            this.f15807C = i6;
        }
    }

    public static X2.p.a a() {
        return new X2.f.b();
    }

    public abstract X2.s b();

    public abstract X2.p.b c();
}
