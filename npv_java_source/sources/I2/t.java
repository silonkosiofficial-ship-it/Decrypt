package I2;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    protected t() {
    }

    public static I2.t d(android.content.Context context) {
        return J2.j.k(context);
    }

    public static void e(android.content.Context context, androidx.work.a aVar) {
        J2.j.e(context, aVar);
    }

    public abstract I2.m a(java.lang.String str);

    public final I2.m b(I2.u uVar) {
        return c(java.util.Collections.singletonList(uVar));
    }

    public abstract I2.m c(java.util.List list);
}
