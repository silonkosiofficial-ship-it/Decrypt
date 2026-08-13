package L1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final java.io.File a(android.content.Context context, java.lang.String str) {
        p247y7.AbstractC7350t.f(context, "<this>");
        p247y7.AbstractC7350t.f(str, "fileName");
        return new java.io.File(context.getApplicationContext().getFilesDir(), "datastore/" + str);
    }
}
