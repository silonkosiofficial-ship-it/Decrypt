package S;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class P {
    public static /* synthetic */ java.lang.String a(S.Q q6, java.lang.Long l6, java.util.Locale locale, boolean z6, int i6, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: formatDate");
        }
        if ((i6 & 4) != 0) {
            z6 = false;
        }
        return q6.a(l6, locale, z6);
    }
}
