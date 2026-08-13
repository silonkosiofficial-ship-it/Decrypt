package Q3;

/* JADX INFO: renamed from: Q3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1479s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.res.Resources f9019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f9020b;

    public C1479s(android.content.Context context) {
        Q3.AbstractC1477p.l(context);
        android.content.res.Resources resources = context.getResources();
        this.f9019a = resources;
        this.f9020b = resources.getResourcePackageName(N3.AbstractC1400m.f7672a);
    }

    public java.lang.String a(java.lang.String str) {
        int identifier = this.f9019a.getIdentifier(str, "string", this.f9020b);
        if (identifier == 0) {
            return null;
        }
        return this.f9019a.getString(identifier);
    }
}
