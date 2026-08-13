package p085i4;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.res.Resources f46670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f46671b;

    public n(android.content.Context context, java.lang.String str) {
        Q3.AbstractC1477p.l(context);
        this.f46670a = context.getResources();
        if (android.text.TextUtils.isEmpty(str)) {
            this.f46671b = a(context);
        } else {
            this.f46671b = str;
        }
    }

    public static java.lang.String a(android.content.Context context) {
        try {
            return context.getResources().getResourcePackageName(N3.AbstractC1400m.f7672a);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final java.lang.String b(java.lang.String str) {
        int identifier = this.f46670a.getIdentifier(str, "string", this.f46671b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f46670a.getString(identifier);
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }
}
