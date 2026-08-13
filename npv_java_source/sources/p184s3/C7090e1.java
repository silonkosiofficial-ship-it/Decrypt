package p184s3;

/* JADX INFO: renamed from: s3.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7090e1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private java.lang.String f54221g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private java.lang.String f54223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private java.lang.String f54224j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f54226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private java.lang.String f54227m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.HashSet f54215a = new java.util.HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final android.os.Bundle f54216b = new android.os.Bundle();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final java.util.HashMap f54217c = new java.util.HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final java.util.HashSet f54218d = new java.util.HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final android.os.Bundle f54219e = new android.os.Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final java.util.HashSet f54220f = new java.util.HashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final java.util.List f54222h = new java.util.ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54225k = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f54228n = 60000;

    public final void a(boolean z6) {
        this.f54225k = z6 ? 1 : 0;
    }

    public final void p(java.lang.String str) {
        this.f54215a.add(str);
    }

    public final void q(java.lang.Class cls, android.os.Bundle bundle) {
        this.f54216b.putBundle(cls.getName(), bundle);
    }

    public final void r(java.lang.String str) {
        this.f54218d.add(str);
    }

    public final void s(java.lang.String str) {
        this.f54218d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    public final void t(boolean z6) {
        this.f54226l = z6;
    }
}
