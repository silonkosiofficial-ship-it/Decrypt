package N0;

/* JADX INFO: loaded from: classes.dex */
public abstract class T {
    public static final boolean a(android.text.Spanned spanned, java.lang.Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean b(android.text.Spanned spanned, java.lang.Class cls, int i6, int i10) {
        return spanned.nextSpanTransition(i6 - 1, i10, cls) != i10;
    }
}
