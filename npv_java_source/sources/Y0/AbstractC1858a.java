package Y0;

/* JADX INFO: renamed from: Y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1858a {
    public static final Y0.e a(android.content.Context context) {
        float f6 = context.getResources().getConfiguration().fontScale;
        float f10 = context.getResources().getDisplayMetrics().density;
        Z0.a aVarB = Z0.b.f16660a.b(f6);
        if (aVarB == null) {
            aVarB = new Y0.w(f6);
        }
        return new Y0.h(f10, f6, aVarB);
    }
}
