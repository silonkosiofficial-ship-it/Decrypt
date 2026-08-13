package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.Object f21474a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f21475b = new java.lang.Object();

    static android.os.Bundle a(androidx.core.app.j.a aVar) {
        android.os.Bundle bundle = new android.os.Bundle();
        androidx.core.graphics.drawable.IconCompat iconCompatD = aVar.d();
        bundle.putInt("icon", iconCompatD != null ? iconCompatD.e() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        android.os.Bundle bundle2 = aVar.c() != null ? new android.os.Bundle(aVar.c()) : new android.os.Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static android.os.Bundle b(androidx.core.app.q qVar) {
        new android.os.Bundle();
        throw null;
    }

    private static android.os.Bundle[] c(androidx.core.app.q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        android.os.Bundle[] bundleArr = new android.os.Bundle[qVarArr.length];
        for (int i6 = 0; i6 < qVarArr.length; i6++) {
            androidx.core.app.q qVar = qVarArr[i6];
            bundleArr[i6] = b(null);
        }
        return bundleArr;
    }
}
