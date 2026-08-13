package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1910p extends android.widget.ImageButton {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final androidx.appcompat.widget.C1899e f18560C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final androidx.appcompat.widget.C1911q f18561D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f18562E;

    public C1910p(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, p090j.a.f48649z);
    }

    public C1910p(android.content.Context context, android.util.AttributeSet attributeSet, int i6) {
        super(androidx.appcompat.widget.Z.b(context), attributeSet, i6);
        this.f18562E = false;
        androidx.appcompat.widget.Y.a(this, getContext());
        androidx.appcompat.widget.C1899e c1899e = new androidx.appcompat.widget.C1899e(this);
        this.f18560C = c1899e;
        c1899e.e(attributeSet, i6);
        androidx.appcompat.widget.C1911q c1911q = new androidx.appcompat.widget.C1911q(this);
        this.f18561D = c1911q;
        c1911q.g(attributeSet, i6);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.C1899e c1899e = this.f18560C;
        if (c1899e != null) {
            c1899e.b();
        }
        androidx.appcompat.widget.C1911q c1911q = this.f18561D;
        if (c1911q != null) {
            c1911q.c();
        }
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.C1899e c1899e = this.f18560C;
        if (c1899e != null) {
            return c1899e.c();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.C1899e c1899e = this.f18560C;
        if (c1899e != null) {
            return c1899e.d();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
        androidx.appcompat.widget.C1911q c1911q = this.f18561D;
        if (c1911q != null) {
            return c1911q.d();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
        androidx.appcompat.widget.C1911q c1911q = this.f18561D;
        if (c1911q != null) {
            return c1911q.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f18561D.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.C1899e c1899e = this.f18560C;
        if (c1899e != null) {
            c1899e.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i6) {
        super.setBackgroundResource(i6);
        androidx.appcompat.widget.C1899e c1899e = this.f18560C;
        if (c1899e != null) {
            c1899e.g(i6);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        androidx.appcompat.widget.C1911q c1911q = this.f18561D;
        if (c1911q != null) {
            c1911q.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        androidx.appcompat.widget.C1911q c1911q = this.f18561D;
        if (c1911q != null && drawable != null && !this.f18562E) {
            c1911q.h(drawable);
        }
        super.setImageDrawable(drawable);
        androidx.appcompat.widget.C1911q c1911q2 = this.f18561D;
        if (c1911q2 != null) {
            c1911q2.c();
            if (this.f18562E) {
                return;
            }
            this.f18561D.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i6) {
        super.setImageLevel(i6);
        this.f18562E = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i6) {
        this.f18561D.i(i6);
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        androidx.appcompat.widget.C1911q c1911q = this.f18561D;
        if (c1911q != null) {
            c1911q.c();
        }
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1899e c1899e = this.f18560C;
        if (c1899e != null) {
            c1899e.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1899e c1899e = this.f18560C;
        if (c1899e != null) {
            c1899e.j(mode);
        }
    }

    public void setSupportImageTintList(android.content.res.ColorStateList colorStateList) {
        androidx.appcompat.widget.C1911q c1911q = this.f18561D;
        if (c1911q != null) {
            c1911q.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode) {
        androidx.appcompat.widget.C1911q c1911q = this.f18561D;
        if (c1911q != null) {
            c1911q.k(mode);
        }
    }
}
