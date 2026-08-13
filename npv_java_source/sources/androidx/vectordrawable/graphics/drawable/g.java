package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
abstract class g extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    android.graphics.drawable.Drawable f23716C;

    g() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.setLevel(i6) : super.onLevelChange(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setChangingConfigurations(i6);
        } else {
            super.setChangingConfigurations(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i6, android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setColorFilter(i6, mode);
        } else {
            super.setColorFilter(i6, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setFilterBitmap(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f6, float f10) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f6, f10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i6, int i10, int i11, int i12) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i6, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
