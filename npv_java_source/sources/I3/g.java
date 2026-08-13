package I3;

/* JADX INFO: loaded from: classes.dex */
public final class g implements O3.a.d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final I3.g f5019F = new I3.g(new I3.f());

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final java.lang.String f5020C = null;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final boolean f5021D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final java.lang.String f5022E;

    public g(I3.f fVar) {
        this.f5021D = fVar.f5017a.booleanValue();
        this.f5022E = fVar.f5018b;
    }

    static /* bridge */ /* synthetic */ java.lang.String b(I3.g gVar) {
        java.lang.String str = gVar.f5020C;
        return null;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f5021D);
        bundle.putString("log_session_id", this.f5022E);
        return bundle;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I3.g)) {
            return false;
        }
        I3.g gVar = (I3.g) obj;
        java.lang.String str = gVar.f5020C;
        return Q3.AbstractC1475n.a(null, null) && this.f5021D == gVar.f5021D && Q3.AbstractC1475n.a(this.f5022E, gVar.f5022E);
    }

    public final int hashCode() {
        return Q3.AbstractC1475n.b(null, java.lang.Boolean.valueOf(this.f5021D), this.f5022E);
    }
}
