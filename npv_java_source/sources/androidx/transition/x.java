package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public android.view.View f23678b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f23677a = new java.util.HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final java.util.ArrayList f23679c = new java.util.ArrayList();

    public x(android.view.View view) {
        this.f23678b = view;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof androidx.transition.x)) {
            return false;
        }
        androidx.transition.x xVar = (androidx.transition.x) obj;
        return this.f23678b == xVar.f23678b && this.f23677a.equals(xVar.f23677a);
    }

    public int hashCode() {
        return (this.f23678b.hashCode() * 31) + this.f23677a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str = (("TransitionValues@" + java.lang.Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f23678b + "\n") + "    values:";
        for (java.lang.String str2 : this.f23677a.keySet()) {
            str = str + "    " + str2 + ": " + this.f23677a.get(str2) + "\n";
        }
        return str;
    }
}
