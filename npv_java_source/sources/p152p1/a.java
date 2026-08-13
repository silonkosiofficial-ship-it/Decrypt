package p152p1;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static java.lang.String a(android.view.View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (java.lang.Exception unused) {
            return "UNKNOWN";
        }
    }
}
