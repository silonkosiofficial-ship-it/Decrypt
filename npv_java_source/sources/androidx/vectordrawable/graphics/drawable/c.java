package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.vectordrawable.graphics.drawable.g implements android.graphics.drawable.Animatable {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.c.C0450c f23699D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private android.content.Context f23700E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private android.animation.ArgbEvaluator f23701F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.c.d f23702G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private android.animation.Animator.AnimatorListener f23703H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    java.util.ArrayList f23704I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    final android.graphics.drawable.Drawable.Callback f23705J;

    class a implements android.graphics.drawable.Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
            androidx.vectordrawable.graphics.drawable.c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j6) {
            androidx.vectordrawable.graphics.drawable.c.this.scheduleSelf(runnable, j6);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
            androidx.vectordrawable.graphics.drawable.c.this.unscheduleSelf(runnable);
        }
    }

    class b extends android.animation.AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator animator) {
            java.util.ArrayList arrayList = new java.util.ArrayList(androidx.vectordrawable.graphics.drawable.c.this.f23704I);
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i6)).b(androidx.vectordrawable.graphics.drawable.c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator animator) {
            java.util.ArrayList arrayList = new java.util.ArrayList(androidx.vectordrawable.graphics.drawable.c.this.f23704I);
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i6)).c(androidx.vectordrawable.graphics.drawable.c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0450c extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.vectordrawable.graphics.drawable.h f23709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        android.animation.AnimatorSet f23710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        java.util.ArrayList f23711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        p170r.C7026a f23712e;

        public C0450c(android.content.Context context, androidx.vectordrawable.graphics.drawable.c.C0450c c0450c, android.graphics.drawable.Drawable.Callback callback, android.content.res.Resources resources) {
            if (c0450c != null) {
                this.f23708a = c0450c.f23708a;
                androidx.vectordrawable.graphics.drawable.h hVar = c0450c.f23709b;
                if (hVar != null) {
                    android.graphics.drawable.Drawable.ConstantState constantState = hVar.getConstantState();
                    this.f23709b = (androidx.vectordrawable.graphics.drawable.h) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    androidx.vectordrawable.graphics.drawable.h hVar2 = (androidx.vectordrawable.graphics.drawable.h) this.f23709b.mutate();
                    this.f23709b = hVar2;
                    hVar2.setCallback(callback);
                    this.f23709b.setBounds(c0450c.f23709b.getBounds());
                    this.f23709b.h(false);
                }
                java.util.ArrayList arrayList = c0450c.f23711d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f23711d = new java.util.ArrayList(size);
                    this.f23712e = new p170r.C7026a(size);
                    for (int i6 = 0; i6 < size; i6++) {
                        android.animation.Animator animator = (android.animation.Animator) c0450c.f23711d.get(i6);
                        android.animation.Animator animatorClone = animator.clone();
                        java.lang.String str = (java.lang.String) c0450c.f23712e.get(animator);
                        animatorClone.setTarget(this.f23709b.d(str));
                        this.f23711d.add(animatorClone);
                        this.f23712e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f23710c == null) {
                this.f23710c = new android.animation.AnimatorSet();
            }
            this.f23710c.playTogether(this.f23711d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23708a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class d extends android.graphics.drawable.Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.drawable.Drawable.ConstantState f23713a;

        public d(android.graphics.drawable.Drawable.ConstantState constantState) {
            this.f23713a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f23713a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f23713a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            androidx.vectordrawable.graphics.drawable.c cVar = new androidx.vectordrawable.graphics.drawable.c();
            android.graphics.drawable.Drawable drawableNewDrawable = this.f23713a.newDrawable();
            cVar.f23716C = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f23705J);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            androidx.vectordrawable.graphics.drawable.c cVar = new androidx.vectordrawable.graphics.drawable.c();
            android.graphics.drawable.Drawable drawableNewDrawable = this.f23713a.newDrawable(resources);
            cVar.f23716C = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f23705J);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            androidx.vectordrawable.graphics.drawable.c cVar = new androidx.vectordrawable.graphics.drawable.c();
            android.graphics.drawable.Drawable drawableNewDrawable = this.f23713a.newDrawable(resources, theme);
            cVar.f23716C = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f23705J);
            return cVar;
        }
    }

    c() {
        this(null, null, null);
    }

    private c(android.content.Context context) {
        this(context, null, null);
    }

    private c(android.content.Context context, androidx.vectordrawable.graphics.drawable.c.C0450c c0450c, android.content.res.Resources resources) {
        this.f23701F = null;
        this.f23703H = null;
        this.f23704I = null;
        androidx.vectordrawable.graphics.drawable.c.a aVar = new androidx.vectordrawable.graphics.drawable.c.a();
        this.f23705J = aVar;
        this.f23700E = context;
        if (c0450c != null) {
            this.f23699D = c0450c;
        } else {
            this.f23699D = new androidx.vectordrawable.graphics.drawable.c.C0450c(context, c0450c, aVar, resources);
        }
    }

    public static androidx.vectordrawable.graphics.drawable.c a(android.content.Context context, int i6) {
        int next;
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.vectordrawable.graphics.drawable.c cVar = new androidx.vectordrawable.graphics.drawable.c(context);
            android.graphics.drawable.Drawable drawableE = androidx.core.content.res.h.e(context.getResources(), i6, context.getTheme());
            cVar.f23716C = drawableE;
            drawableE.setCallback(cVar.f23705J);
            cVar.f23702G = new androidx.vectordrawable.graphics.drawable.c.d(cVar.f23716C.getConstantState());
            return cVar;
        }
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(i6);
            android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return b(context, context.getResources(), xml, attributeSetAsAttributeSet, context.getTheme());
            }
            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
        } catch (java.io.IOException e6) {
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e10) {
            return null;
        }
    }

    public static androidx.vectordrawable.graphics.drawable.c b(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.vectordrawable.graphics.drawable.c cVar = new androidx.vectordrawable.graphics.drawable.c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }

    private static void d(android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void e() {
        android.animation.Animator.AnimatorListener animatorListener = this.f23703H;
        if (animatorListener != null) {
            this.f23699D.f23710c.removeListener(animatorListener);
            this.f23703H = null;
        }
    }

    private void f(java.lang.String str, android.animation.Animator animator) {
        animator.setTarget(this.f23699D.f23709b.d(str));
        androidx.vectordrawable.graphics.drawable.c.C0450c c0450c = this.f23699D;
        if (c0450c.f23711d == null) {
            c0450c.f23711d = new java.util.ArrayList();
            this.f23699D.f23712e = new p170r.C7026a();
        }
        this.f23699D.f23711d.add(animator);
        this.f23699D.f23712e.put(animator, str);
    }

    private static boolean h(android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    public void c(androidx.vectordrawable.graphics.drawable.b bVar) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            d((android.graphics.drawable.AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f23704I == null) {
            this.f23704I = new java.util.ArrayList();
        }
        if (this.f23704I.contains(bVar)) {
            return;
        }
        this.f23704I.add(bVar);
        if (this.f23703H == null) {
            this.f23703H = new androidx.vectordrawable.graphics.drawable.c.b();
        }
        this.f23699D.f23710c.addListener(this.f23703H);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f23699D.f23709b.draw(canvas);
        if (this.f23699D.f23710c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean g(androidx.vectordrawable.graphics.drawable.b bVar) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            h((android.graphics.drawable.AnimatedVectorDrawable) drawable, bVar);
        }
        java.util.ArrayList arrayList = this.f23704I;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f23704I.size() == 0) {
            e();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f23699D.f23709b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f23699D.f23708a;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? androidx.core.graphics.drawable.a.e(drawable) : this.f23699D.f23709b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.f23716C == null || android.os.Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new androidx.vectordrawable.graphics.drawable.c.d(this.f23716C.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f23699D.f23709b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f23699D.f23709b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.getOpacity() : this.f23699D.f23709b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayObtainAttributes;
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    typedArrayObtainAttributes = androidx.core.content.res.k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f23689e);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        androidx.vectordrawable.graphics.drawable.h hVarB = androidx.vectordrawable.graphics.drawable.h.b(resources, resourceId, theme);
                        hVarB.h(false);
                        hVarB.setCallback(this.f23705J);
                        androidx.vectordrawable.graphics.drawable.h hVar = this.f23699D.f23709b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f23699D.f23709b = hVarB;
                    }
                } else if ("target".equals(name)) {
                    typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f23690f);
                    java.lang.String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        android.content.Context context = this.f23700E;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new java.lang.IllegalStateException("Context can't be null when inflating animators");
                        }
                        f(string, androidx.vectordrawable.graphics.drawable.e.i(context, resourceId2));
                    }
                } else {
                    continue;
                }
                typedArrayObtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        this.f23699D.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? androidx.core.graphics.drawable.a.h(drawable) : this.f23699D.f23709b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? ((android.graphics.drawable.AnimatedVectorDrawable) drawable).isRunning() : this.f23699D.f23710c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.isStateful() : this.f23699D.f23709b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f23699D.f23709b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.setLevel(i6) : this.f23699D.f23709b.setLevel(i6);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        return drawable != null ? drawable.setState(iArr) : this.f23699D.f23709b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else {
            this.f23699D.f23709b.setAlpha(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z6);
        } else {
            this.f23699D.f23709b.setAutoMirrored(z6);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i6) {
        super.setChangingConfigurations(i6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i6, android.graphics.PorterDuff.Mode mode) {
        super.setColorFilter(i6, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f23699D.f23709b.setColorFilter(colorFilter);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z6) {
        super.setFilterBitmap(z6);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f6, float f10) {
        super.setHotspot(f6, f10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i6, int i10, int i11, int i12) {
        super.setHotspotBounds(i6, i10, i11, i12);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i6);
        } else {
            this.f23699D.f23709b.setTint(i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        } else {
            this.f23699D.f23709b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
        } else {
            this.f23699D.f23709b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z10) {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            return drawable.setVisible(z6, z10);
        }
        this.f23699D.f23709b.setVisible(z6, z10);
        return super.setVisible(z6, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f23699D.f23710c.isStarted()) {
                return;
            }
            this.f23699D.f23710c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        android.graphics.drawable.Drawable drawable = this.f23716C;
        if (drawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f23699D.f23710c.end();
        }
    }
}
