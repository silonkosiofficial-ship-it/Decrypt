package N0;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N0.j0 f7579a = new N0.j0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final android.text.Layout.Alignment f7580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final android.text.Layout.Alignment f7581c;

    static {
        android.text.Layout.Alignment[] alignmentArrValues = android.text.Layout.Alignment.values();
        android.text.Layout.Alignment alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        android.text.Layout.Alignment alignment2 = alignment;
        for (android.text.Layout.Alignment alignment3 : alignmentArrValues) {
            if (p247y7.AbstractC7350t.b(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (p247y7.AbstractC7350t.b(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f7580b = alignment;
        f7581c = alignment2;
    }

    private j0() {
    }

    public final android.text.Layout.Alignment a(int i6) {
        if (i6 != 0) {
            if (i6 == 1) {
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
            }
            if (i6 == 2) {
                return android.text.Layout.Alignment.ALIGN_CENTER;
            }
            if (i6 == 3) {
                return f7580b;
            }
            if (i6 == 4) {
                return f7581c;
            }
        }
        return android.text.Layout.Alignment.ALIGN_NORMAL;
    }
}
