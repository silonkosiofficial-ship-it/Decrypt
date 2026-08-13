package Z2;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static Z2.g a() {
        return new Z2.b(Z2.g.a.FATAL_ERROR, -1L);
    }

    public static Z2.g d() {
        return new Z2.b(Z2.g.a.INVALID_PAYLOAD, -1L);
    }

    public static Z2.g e(long j6) {
        return new Z2.b(Z2.g.a.OK, j6);
    }

    public static Z2.g f() {
        return new Z2.b(Z2.g.a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract Z2.g.a c();
}
