package I4;

/* JADX INFO: loaded from: classes3.dex */
final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K4.x f5038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.String f5039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final K4.C1307d f5040c;

    k(android.content.Context context, K4.x xVar) {
        this.f5039b = context.getPackageName();
        this.f5038a = xVar;
        if (K4.h.a(context)) {
            this.f5040c = new K4.C1307d(context, xVar, "IntegrityService", I4.l.f5041a, new K4.E() { // from class: I4.g
                @Override // K4.E
                public final java.lang.Object a(android.os.IBinder iBinder) {
                    return K4.t.y0(iBinder);
                }
            }, null);
        } else {
            xVar.a("Phonesky is not installed.", new java.lang.Object[0]);
            this.f5040c = null;
        }
    }

    static /* bridge */ /* synthetic */ android.os.Bundle a(I4.k kVar, byte[] bArr, java.lang.Long l6, android.os.Parcelable parcelable) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("package.name", kVar.f5039b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 2);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l6 != null) {
            bundle.putLong("cloud.prj", l6.longValue());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        K4.p.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new java.util.ArrayList<>(K4.p.a(arrayList)));
        return bundle;
    }

    public final p115l4.AbstractC6931l b(I4.d dVar) {
        if (this.f5040c == null) {
            return p115l4.AbstractC6934o.d(new I4.C1244c(-2, null));
        }
        try {
            byte[] bArrDecode = android.util.Base64.decode(dVar.d(), 10);
            java.lang.Long lC = dVar.c();
            dVar.a();
            this.f5038a.c("requestIntegrityToken(%s)", dVar);
            p115l4.C6932m c6932m = new p115l4.C6932m();
            this.f5040c.t(new I4.h(this, c6932m, bArrDecode, lC, null, c6932m, dVar), c6932m);
            return c6932m.a();
        } catch (java.lang.IllegalArgumentException e6) {
            return p115l4.AbstractC6934o.d(new I4.C1244c(-13, e6));
        }
    }
}
