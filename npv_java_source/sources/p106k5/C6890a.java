package p106k5;

/* JADX INFO: renamed from: k5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6890a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f49593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f49594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f49595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f49596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f49597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f49598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f49599g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p076h5.f f49600h;

    public C6890a(java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, p076h5.f fVar) {
        this.f49593a = str;
        this.f49594b = str2;
        this.f49595c = list;
        this.f49596d = str3;
        this.f49597e = str4;
        this.f49598f = str5;
        this.f49599g = str6;
        this.f49600h = fVar;
    }

    public static p106k5.C6890a a(android.content.Context context, p106k5.H h6, java.lang.String str, java.lang.String str2, java.util.List list, p076h5.f fVar) throws android.content.pm.PackageManager.NameNotFoundException {
        java.lang.String packageName = context.getPackageName();
        java.lang.String strG = h6.g();
        android.content.pm.PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        java.lang.String strB = b(packageInfo);
        java.lang.String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new p106k5.C6890a(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    private static java.lang.String b(android.content.pm.PackageInfo packageInfo) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? java.lang.Long.toString(packageInfo.getLongVersionCode()) : java.lang.Integer.toString(packageInfo.versionCode);
    }
}
