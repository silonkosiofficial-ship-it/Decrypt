package p055f4;

/* JADX INFO: renamed from: f4.r0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6577r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f45241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.util.Map f45242b = new java.util.HashMap();

    public C6577r0(android.content.Context context) {
        this.f45241a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.content.SharedPreferences.Editor d(java.lang.String str) {
        if (!this.f45242b.containsKey(str)) {
            this.f45242b.put(str, this.f45241a.getSharedPreferences(str, 0).edit());
        }
        return (android.content.SharedPreferences.Editor) this.f45242b.get(str);
    }

    public final void b() {
        java.util.Iterator it = this.f45242b.values().iterator();
        while (it.hasNext()) {
            ((android.content.SharedPreferences.Editor) it.next()).apply();
        }
    }

    public final boolean c(java.lang.String str, java.lang.Object obj) {
        java.lang.String str2;
        float fFloatValue;
        p055f4.C6576q0 c6576q0A = p055f4.AbstractC6579s0.a(this.f45241a, str);
        if (c6576q0A == null) {
            return false;
        }
        android.content.SharedPreferences.Editor editorD = d(c6576q0A.f45231a);
        if (obj instanceof java.lang.Integer) {
            editorD.putInt(c6576q0A.f45232b, ((java.lang.Integer) obj).intValue());
            return true;
        }
        if (obj instanceof java.lang.Long) {
            editorD.putLong(c6576q0A.f45232b, ((java.lang.Long) obj).longValue());
            return true;
        }
        if (obj instanceof java.lang.Double) {
            str2 = c6576q0A.f45232b;
            fFloatValue = ((java.lang.Double) obj).floatValue();
        } else {
            if (!(obj instanceof java.lang.Float)) {
                if (obj instanceof java.lang.Boolean) {
                    editorD.putBoolean(c6576q0A.f45232b, ((java.lang.Boolean) obj).booleanValue());
                    return true;
                }
                if (!(obj instanceof java.lang.String)) {
                    return false;
                }
                editorD.putString(c6576q0A.f45232b, (java.lang.String) obj);
                return true;
            }
            str2 = c6576q0A.f45232b;
            fFloatValue = ((java.lang.Float) obj).floatValue();
        }
        editorD.putFloat(str2, fFloatValue);
        return true;
    }
}
