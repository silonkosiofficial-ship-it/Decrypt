package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    android.graphics.drawable.Animatable2.AnimationCallback f23697a;

    class a extends android.graphics.drawable.Animatable2.AnimationCallback {
        a() {
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(android.graphics.drawable.Drawable drawable) {
            androidx.vectordrawable.graphics.drawable.b.this.b(drawable);
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(android.graphics.drawable.Drawable drawable) {
            androidx.vectordrawable.graphics.drawable.b.this.c(drawable);
        }
    }

    android.graphics.drawable.Animatable2.AnimationCallback a() {
        if (this.f23697a == null) {
            this.f23697a = new androidx.vectordrawable.graphics.drawable.b.a();
        }
        return this.f23697a;
    }

    public void b(android.graphics.drawable.Drawable drawable) {
    }

    public void c(android.graphics.drawable.Drawable drawable) {
    }
}
