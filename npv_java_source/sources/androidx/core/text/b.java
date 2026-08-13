package androidx.core.text;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    static class a {
        static android.text.Spanned a(java.lang.String str, int i6) {
            return android.text.Html.fromHtml(str, i6);
        }

        static android.text.Spanned b(java.lang.String str, int i6, android.text.Html.ImageGetter imageGetter, android.text.Html.TagHandler tagHandler) {
            return android.text.Html.fromHtml(str, i6, imageGetter, tagHandler);
        }

        static java.lang.String c(android.text.Spanned spanned, int i6) {
            return android.text.Html.toHtml(spanned, i6);
        }
    }

    public static android.text.Spanned a(java.lang.String str, int i6) {
        return android.os.Build.VERSION.SDK_INT >= 24 ? androidx.core.text.b.a.a(str, i6) : android.text.Html.fromHtml(str);
    }
}
