package T1;

/* JADX INFO: loaded from: classes.dex */
final class b extends android.text.Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f12899a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile android.text.Editable.Factory f12900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static java.lang.Class f12901c;

    private b() {
        try {
            f12901c = java.lang.Class.forName("android.text.DynamicLayout$ChangeWatcher", false, T1.b.class.getClassLoader());
        } catch (java.lang.Throwable unused) {
        }
    }

    public static android.text.Editable.Factory getInstance() {
        if (f12900b == null) {
            synchronized (f12899a) {
                try {
                    if (f12900b == null) {
                        f12900b = new T1.b();
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        return f12900b;
    }

    @Override // android.text.Editable.Factory
    public android.text.Editable newEditable(java.lang.CharSequence charSequence) {
        java.lang.Class cls = f12901c;
        return cls != null ? androidx.emoji2.text.o.c(cls, charSequence) : super.newEditable(charSequence);
    }
}
