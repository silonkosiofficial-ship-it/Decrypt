package C4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f1290a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1291b = {android.R.attr.state_pressed};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f1292c = {android.R.attr.state_hovered, android.R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f1293d = {android.R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f1294e = {android.R.attr.state_hovered};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f1295f = {android.R.attr.state_selected, android.R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f1296g = {android.R.attr.state_selected, android.R.attr.state_hovered, android.R.attr.state_focused};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f1297h = {android.R.attr.state_selected, android.R.attr.state_focused};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[] f1298i = {android.R.attr.state_selected, android.R.attr.state_hovered};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[] f1299j = {android.R.attr.state_selected};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f1300k = {android.R.attr.state_enabled, android.R.attr.state_pressed};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final java.lang.String f1301l = C4.b.class.getSimpleName();

    public static android.content.res.ColorStateList a(android.content.res.ColorStateList colorStateList) {
        if (colorStateList == null) {
            return android.content.res.ColorStateList.valueOf(0);
        }
        if (android.os.Build.VERSION.SDK_INT <= 27 && android.graphics.Color.alpha(colorStateList.getDefaultColor()) == 0 && android.graphics.Color.alpha(colorStateList.getColorForState(f1300k, 0)) != 0) {
            java.lang.String str = f1301l;
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z6 = false;
        boolean z10 = false;
        for (int i6 : iArr) {
            if (i6 == 16842910) {
                z6 = true;
            } else if (i6 == 16842908 || i6 == 16842919 || i6 == 16843623) {
                z10 = true;
            }
        }
        return z6 && z10;
    }
}
