package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1896b extends android.graphics.drawable.Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final androidx.appcompat.widget.ActionBarContainer f18423a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.b$a */
    private static class a {
        public static void a(android.graphics.drawable.Drawable drawable, android.graphics.Outline outline) {
            drawable.getOutline(outline);
        }
    }

    public C1896b(androidx.appcompat.widget.ActionBarContainer actionBarContainer) {
        this.f18423a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f18423a;
        if (actionBarContainer.f17993J) {
            android.graphics.drawable.Drawable drawable = actionBarContainer.f17992I;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        android.graphics.drawable.Drawable drawable2 = actionBarContainer.f17990G;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        androidx.appcompat.widget.ActionBarContainer actionBarContainer2 = this.f18423a;
        android.graphics.drawable.Drawable drawable3 = actionBarContainer2.f17991H;
        if (drawable3 == null || !actionBarContainer2.f17994K) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline outline) {
        android.graphics.drawable.Drawable drawable;
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f18423a;
        if (!actionBarContainer.f17993J) {
            drawable = actionBarContainer.f17990G;
            if (drawable == null) {
                return;
            }
        } else if (actionBarContainer.f17992I == null) {
            return;
        } else {
            drawable = actionBarContainer.f17990G;
        }
        androidx.appcompat.widget.C1896b.a.a(drawable, outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
    }
}
