package C4;

/* JADX INFO: loaded from: classes3.dex */
public class a extends android.graphics.drawable.Drawable implements E4.n {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private C4.a.b f1287C;

    static final class b extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        E4.g f1288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f1289b;

        public b(C4.a.b bVar) {
            this.f1288a = (E4.g) bVar.f1288a.getConstantState().newDrawable();
            this.f1289b = bVar.f1289b;
        }

        public b(E4.g gVar) {
            this.f1288a = gVar;
            this.f1289b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C4.a newDrawable() {
            return new C4.a(new C4.a.b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    private a(C4.a.b bVar) {
        this.f1287C = bVar;
    }

    public a(E4.k kVar) {
        this(new C4.a.b(new E4.g(kVar)));
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4.a mutate() {
        this.f1287C = new C4.a.b(this.f1287C);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        C4.a.b bVar = this.f1287C;
        if (bVar.f1289b) {
            bVar.f1288a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.f1287C;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f1287C.f1288a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        this.f1287C.f1288a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f1287C.f1288a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = C4.b.b(iArr);
        C4.a.b bVar = this.f1287C;
        if (bVar.f1289b == zB) {
            return zOnStateChange;
        }
        bVar.f1289b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        this.f1287C.f1288a.setAlpha(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        this.f1287C.f1288a.setColorFilter(colorFilter);
    }

    @Override // E4.n
    public void setShapeAppearanceModel(E4.k kVar) {
        this.f1287C.f1288a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        this.f1287C.f1288a.setTint(i6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        this.f1287C.f1288a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        this.f1287C.f1288a.setTintMode(mode);
    }
}
