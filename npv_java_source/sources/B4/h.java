package B4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {
    public static android.graphics.Typeface a(android.content.Context context, android.graphics.Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static android.graphics.Typeface b(android.content.res.Configuration configuration, android.graphics.Typeface typeface) {
        if (android.os.Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return android.graphics.Typeface.create(typeface, p222w1.a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
