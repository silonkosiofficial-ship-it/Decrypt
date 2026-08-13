package androidx.compose.ui.platform;

/* JADX INFO: renamed from: androidx.compose.ui.platform.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1921a0 implements androidx.compose.ui.platform.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.Context f20080a;

    public C1921a0(android.content.Context context) {
        this.f20080a = context;
    }

    @Override // androidx.compose.ui.platform.w1
    public void a(java.lang.String str) {
        try {
            this.f20080a.startActivity(new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
        } catch (android.content.ActivityNotFoundException e6) {
            throw new java.lang.IllegalArgumentException("Can't open " + str + '.', e6);
        }
    }
}
