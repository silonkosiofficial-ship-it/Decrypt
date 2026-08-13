package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
abstract class U extends android.content.res.Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.content.res.Resources f18362a;

    public U(android.content.res.Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f18362a = resources;
    }

    final android.graphics.drawable.Drawable a(int i6) {
        return super.getDrawable(i6);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getAnimation(int i6) {
        return this.f18362a.getAnimation(i6);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i6) {
        return this.f18362a.getBoolean(i6);
    }

    @Override // android.content.res.Resources
    public int getColor(int i6) {
        return this.f18362a.getColor(i6);
    }

    @Override // android.content.res.Resources
    public android.content.res.ColorStateList getColorStateList(int i6) {
        return this.f18362a.getColorStateList(i6);
    }

    @Override // android.content.res.Resources
    public android.content.res.Configuration getConfiguration() {
        return this.f18362a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i6) {
        return this.f18362a.getDimension(i6);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i6) {
        return this.f18362a.getDimensionPixelOffset(i6);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i6) {
        return this.f18362a.getDimensionPixelSize(i6);
    }

    @Override // android.content.res.Resources
    public android.util.DisplayMetrics getDisplayMetrics() {
        return this.f18362a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i6, android.content.res.Resources.Theme theme) {
        return androidx.core.content.res.h.e(this.f18362a, i6, theme);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i6, int i10) {
        return androidx.core.content.res.h.f(this.f18362a, i6, i10, null);
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawableForDensity(int i6, int i10, android.content.res.Resources.Theme theme) {
        return androidx.core.content.res.h.f(this.f18362a, i6, i10, theme);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i6, int i10, int i11) {
        return this.f18362a.getFraction(i6, i10, i11);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return this.f18362a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i6) {
        return this.f18362a.getIntArray(i6);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i6) {
        return this.f18362a.getInteger(i6);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getLayout(int i6) {
        return this.f18362a.getLayout(i6);
    }

    @Override // android.content.res.Resources
    public android.graphics.Movie getMovie(int i6) {
        return this.f18362a.getMovie(i6);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i6, int i10) {
        return this.f18362a.getQuantityString(i6, i10);
    }

    @Override // android.content.res.Resources
    public java.lang.String getQuantityString(int i6, int i10, java.lang.Object... objArr) {
        return this.f18362a.getQuantityString(i6, i10, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getQuantityText(int i6, int i10) {
        return this.f18362a.getQuantityText(i6, i10);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceEntryName(int i6) {
        return this.f18362a.getResourceEntryName(i6);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceName(int i6) {
        return this.f18362a.getResourceName(i6);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourcePackageName(int i6) {
        return this.f18362a.getResourcePackageName(i6);
    }

    @Override // android.content.res.Resources
    public java.lang.String getResourceTypeName(int i6) {
        return this.f18362a.getResourceTypeName(i6);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i6) {
        return this.f18362a.getString(i6);
    }

    @Override // android.content.res.Resources
    public java.lang.String getString(int i6, java.lang.Object... objArr) {
        return this.f18362a.getString(i6, objArr);
    }

    @Override // android.content.res.Resources
    public java.lang.String[] getStringArray(int i6) {
        return this.f18362a.getStringArray(i6);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i6) {
        return this.f18362a.getText(i6);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence getText(int i6, java.lang.CharSequence charSequence) {
        return this.f18362a.getText(i6, charSequence);
    }

    @Override // android.content.res.Resources
    public java.lang.CharSequence[] getTextArray(int i6) {
        return this.f18362a.getTextArray(i6);
    }

    @Override // android.content.res.Resources
    public void getValue(int i6, android.util.TypedValue typedValue, boolean z6) {
        this.f18362a.getValue(i6, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public void getValue(java.lang.String str, android.util.TypedValue typedValue, boolean z6) {
        this.f18362a.getValue(str, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i6, int i10, android.util.TypedValue typedValue, boolean z6) {
        p120m.a.a(this.f18362a, i6, i10, typedValue, z6);
    }

    @Override // android.content.res.Resources
    public android.content.res.XmlResourceParser getXml(int i6) {
        return this.f18362a.getXml(i6);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainAttributes(android.util.AttributeSet attributeSet, int[] iArr) {
        return this.f18362a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public android.content.res.TypedArray obtainTypedArray(int i6) {
        return this.f18362a.obtainTypedArray(i6);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i6) {
        return this.f18362a.openRawResource(i6);
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i6, android.util.TypedValue typedValue) {
        return this.f18362a.openRawResource(i6, typedValue);
    }

    @Override // android.content.res.Resources
    public android.content.res.AssetFileDescriptor openRawResourceFd(int i6) {
        return this.f18362a.openRawResourceFd(i6);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(java.lang.String str, android.util.AttributeSet attributeSet, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException {
        this.f18362a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(android.content.res.XmlResourceParser xmlResourceParser, android.os.Bundle bundle) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        this.f18362a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(android.content.res.Configuration configuration, android.util.DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        android.content.res.Resources resources = this.f18362a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
