package I;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f4933a;

    static {
        f4933a = android.os.Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean a() {
        return f4933a;
    }
}
