package S5;

/* JADX INFO: loaded from: classes3.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S5.A f12433a = new S5.A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z5.a f12434b;

    static {
        z5.a aVarI = new B5.d().j(S5.C1620c.f12493a).k(true).i();
        p247y7.AbstractC7350t.e(aVarI, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f12434b = aVarI;
    }

    private A() {
    }

    private final S5.EnumC1621d d(T5.b bVar) {
        if (bVar == null) {
            return S5.EnumC1621d.COLLECTION_SDK_NOT_INSTALLED;
        }
        return bVar.a() ? S5.EnumC1621d.COLLECTION_ENABLED : S5.EnumC1621d.COLLECTION_DISABLED;
    }

    public final S5.z a(Q4.f fVar, S5.y yVar, U5.f fVar2, java.util.Map map, java.lang.String str, java.lang.String str2) {
        p247y7.AbstractC7350t.f(fVar, "firebaseApp");
        p247y7.AbstractC7350t.f(yVar, "sessionDetails");
        p247y7.AbstractC7350t.f(fVar2, "sessionsSettings");
        p247y7.AbstractC7350t.f(map, "subscribers");
        p247y7.AbstractC7350t.f(str, "firebaseInstallationId");
        p247y7.AbstractC7350t.f(str2, "firebaseAuthenticationToken");
        return new S5.z(S5.EnumC1626i.SESSION_START, new S5.C(yVar.b(), yVar.a(), yVar.c(), yVar.d(), new S5.C1622e(d((T5.b) map.get(T5.b.a.PERFORMANCE)), d((T5.b) map.get(T5.b.a.CRASHLYTICS)), fVar2.b()), str, str2), b(fVar));
    }

    public final S5.C1619b b(Q4.f fVar) throws android.content.pm.PackageManager.NameNotFoundException {
        p247y7.AbstractC7350t.f(fVar, "firebaseApp");
        android.content.Context contextK = fVar.k();
        p247y7.AbstractC7350t.e(contextK, "firebaseApp.applicationContext");
        java.lang.String packageName = contextK.getPackageName();
        android.content.pm.PackageInfo packageInfo = contextK.getPackageManager().getPackageInfo(packageName, 0);
        java.lang.String strValueOf = android.os.Build.VERSION.SDK_INT >= 28 ? java.lang.String.valueOf(packageInfo.getLongVersionCode()) : java.lang.String.valueOf(packageInfo.versionCode);
        java.lang.String strC = fVar.n().c();
        p247y7.AbstractC7350t.e(strC, "firebaseApp.options.applicationId");
        java.lang.String str = android.os.Build.MODEL;
        p247y7.AbstractC7350t.e(str, "MODEL");
        java.lang.String str2 = android.os.Build.VERSION.RELEASE;
        p247y7.AbstractC7350t.e(str2, "RELEASE");
        S5.t tVar = S5.t.LOG_ENVIRONMENT_PROD;
        p247y7.AbstractC7350t.e(packageName, "packageName");
        java.lang.String str3 = packageInfo.versionName;
        java.lang.String str4 = str3 == null ? strValueOf : str3;
        java.lang.String str5 = android.os.Build.MANUFACTURER;
        p247y7.AbstractC7350t.e(str5, "MANUFACTURER");
        S5.v vVar = S5.v.f12572a;
        android.content.Context contextK2 = fVar.k();
        p247y7.AbstractC7350t.e(contextK2, "firebaseApp.applicationContext");
        S5.u uVarD = vVar.d(contextK2);
        android.content.Context contextK3 = fVar.k();
        p247y7.AbstractC7350t.e(contextK3, "firebaseApp.applicationContext");
        return new S5.C1619b(strC, str, "2.0.7", str2, tVar, new S5.C1618a(packageName, str4, strValueOf, str5, uVarD, vVar.c(contextK3)));
    }

    public final z5.a c() {
        return f12434b;
    }
}
