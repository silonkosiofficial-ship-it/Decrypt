package H4;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f4366a = {android.R.attr.theme, p125m4.a.f50505W};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f4367b = {p125m4.a.f50532z};

    private static int a(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4366a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4367b, i6, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static android.content.Context c(android.content.Context context, android.util.AttributeSet attributeSet, int i6, int i10) {
        int iB = b(context, attributeSet, i6, i10);
        boolean z6 = (context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).b() == iB;
        if (iB == 0 || z6) {
            return context;
        }
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, iB);
        int iA = a(context, attributeSet);
        if (iA != 0) {
            dVar.getTheme().applyStyle(iA, true);
        }
        return dVar;
    }
}
