package p066g5;

/* JADX INFO: loaded from: classes3.dex */
class e implements T4.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p086i5.b f45545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p086i5.b f45546b;

    e() {
    }

    private static void b(p086i5.b bVar, java.lang.String str, android.os.Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.b(str, bundle);
    }

    private void c(java.lang.String str, android.os.Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.f45545a : this.f45546b, str, bundle);
    }

    @Override // T4.a.b
    public void a(int i6, android.os.Bundle bundle) {
        java.lang.String string;
        p076h5.g.f().i(java.lang.String.format(java.util.Locale.US, "Analytics listener received message. ID: %d, Extras: %s", java.lang.Integer.valueOf(i6), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        android.os.Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new android.os.Bundle();
        }
        c(string, bundle2);
    }

    public void d(p086i5.b bVar) {
        this.f45546b = bVar;
    }

    public void e(p086i5.b bVar) {
        this.f45545a = bVar;
    }
}
