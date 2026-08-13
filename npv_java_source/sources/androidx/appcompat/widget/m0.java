package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends androidx.appcompat.widget.U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f18554c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final java.lang.ref.WeakReference f18555b;

    public m0(android.content.Context context, android.content.res.Resources resources) {
        super(resources);
        this.f18555b = new java.lang.ref.WeakReference(context);
    }

    public static boolean b() {
        return f18554c;
    }

    public static boolean c() {
        b();
        return false;
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getAnimation(int i6) {
        return super.getAnimation(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i6) {
        return super.getBoolean(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i6) {
        return super.getColor(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.ColorStateList getColorStateList(int i6) {
        return super.getColorStateList(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i6) {
        return super.getDimension(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i6) {
        return super.getDimensionPixelOffset(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i6) {
        return super.getDimensionPixelSize(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.util.DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i6) {
        android.content.Context context = (android.content.Context) this.f18555b.get();
        return context != null ? androidx.appcompat.widget.T.h().s(context, this, i6) : a(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawable(int i6, android.content.res.Resources.Theme theme) {
        return super.getDrawable(i6, theme);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawableForDensity(int i6, int i10) {
        return super.getDrawableForDensity(i6, i10);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawableForDensity(int i6, int i10, android.content.res.Resources.Theme theme) {
        return super.getDrawableForDensity(i6, i10, theme);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i6, int i10, int i11) {
        return super.getFraction(i6, i10, i11);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i6) {
        return super.getIntArray(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i6) {
        return super.getInteger(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getLayout(int i6) {
        return super.getLayout(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.graphics.Movie getMovie(int i6) {
        return super.getMovie(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getQuantityString(int i6, int i10) {
        return super.getQuantityString(i6, i10);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getQuantityString(int i6, int i10, java.lang.Object[] objArr) {
        return super.getQuantityString(i6, i10, objArr);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getQuantityText(int i6, int i10) {
        return super.getQuantityText(i6, i10);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceEntryName(int i6) {
        return super.getResourceEntryName(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceName(int i6) {
        return super.getResourceName(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourcePackageName(int i6) {
        return super.getResourcePackageName(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getResourceTypeName(int i6) {
        return super.getResourceTypeName(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getString(int i6) {
        return super.getString(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String getString(int i6, java.lang.Object[] objArr) {
        return super.getString(i6, objArr);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.String[] getStringArray(int i6) {
        return super.getStringArray(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText(int i6) {
        return super.getText(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence getText(int i6, java.lang.CharSequence charSequence) {
        return super.getText(i6, charSequence);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.lang.CharSequence[] getTextArray(int i6) {
        return super.getTextArray(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i6, android.util.TypedValue typedValue, boolean z6) {
        super.getValue(i6, typedValue, z6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z6) {
        super.getValue(str, typedValue, z6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i6, int i10, android.util.TypedValue typedValue, boolean z6) {
        super.getValueForDensity(i6, i10, typedValue, z6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.XmlResourceParser getXml(int i6) {
        return super.getXml(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.TypedArray obtainTypedArray(int i6) {
        return super.obtainTypedArray(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.io.InputStream openRawResource(int i6) {
        return super.openRawResource(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ java.io.InputStream openRawResource(int i6, android.util.TypedValue typedValue) {
        return super.openRawResource(i6, typedValue);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ android.content.res.AssetFileDescriptor openRawResourceFd(int i6) {
        return super.openRawResourceFd(i6);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.U, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }
}
