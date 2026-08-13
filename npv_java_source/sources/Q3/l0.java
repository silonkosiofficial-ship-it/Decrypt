package Q3;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final android.net.Uri f8977f = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f8978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f8979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final android.content.ComponentName f8980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8982e;

    public l0(java.lang.String str, java.lang.String str2, int i6, boolean z6) {
        Q3.AbstractC1477p.f(str);
        this.f8978a = str;
        Q3.AbstractC1477p.f(str2);
        this.f8979b = str2;
        this.f8980c = null;
        this.f8981d = 4225;
        this.f8982e = z6;
    }

    public final android.content.ComponentName a() {
        return this.f8980c;
    }

    public final android.content.Intent b(android.content.Context context) {
        android.os.Bundle bundleCall;
        if (this.f8978a == null) {
            return new android.content.Intent().setComponent(this.f8980c);
        }
        android.content.Intent intent = null;
        if (this.f8982e) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("serviceActionBundleKey", this.f8978a);
            try {
                bundleCall = context.getContentResolver().call(f8977f, "serviceIntentCall", (java.lang.String) null, bundle);
            } catch (java.lang.IllegalArgumentException e6) {
                "Dynamic intent resolution failed: ".concat(e6.toString());
                bundleCall = null;
            }
            intent = bundleCall != null ? (android.content.Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(java.lang.String.valueOf(this.f8978a));
            }
        }
        return intent == null ? new android.content.Intent(this.f8978a).setPackage(this.f8979b) : intent;
    }

    public final java.lang.String c() {
        return this.f8979b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q3.l0)) {
            return false;
        }
        Q3.l0 l0Var = (Q3.l0) obj;
        return Q3.AbstractC1475n.a(this.f8978a, l0Var.f8978a) && Q3.AbstractC1475n.a(this.f8979b, l0Var.f8979b) && Q3.AbstractC1475n.a(this.f8980c, l0Var.f8980c) && this.f8982e == l0Var.f8982e;
    }

    public final int hashCode() {
        return Q3.AbstractC1475n.b(this.f8978a, this.f8979b, this.f8980c, 4225, java.lang.Boolean.valueOf(this.f8982e));
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f8978a;
        if (str != null) {
            return str;
        }
        Q3.AbstractC1477p.l(this.f8980c);
        return this.f8980c.flattenToString();
    }
}
