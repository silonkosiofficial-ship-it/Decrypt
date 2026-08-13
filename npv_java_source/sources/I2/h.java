package I2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String f4969a = I2.j.f("InputMerger");

    public static I2.h a(java.lang.String str) {
        try {
            return (I2.h) java.lang.Class.forName(str).newInstance();
        } catch (java.lang.Exception e6) {
            I2.j.c().b(f4969a, "Trouble instantiating + " + str, e6);
            return null;
        }
    }

    public abstract androidx.work.b b(java.util.List list);
}
