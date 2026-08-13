package p110l;

/* JADX INFO: loaded from: classes.dex */
public class a extends p110l.d {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private l.a.c f49878Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private l.a.g f49879R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f49880S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f49881T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f49882U;

    private static class b extends l.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.graphics.drawable.Animatable f49883a;

        b(android.graphics.drawable.Animatable animatable) {
            super();
            this.f49883a = animatable;
        }

        @Override // l.a.g
        public void c() {
            this.f49883a.start();
        }

        @Override // l.a.g
        public void d() {
            this.f49883a.stop();
        }
    }

    static class c extends l.d.a {

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        p170r.C7046v f49884K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        p170r.Z f49885L;

        c(l.a.c cVar, p110l.a aVar, android.content.res.Resources resources) {
            p170r.Z z6;
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f49884K = cVar.f49884K;
                z6 = cVar.f49885L;
            } else {
                this.f49884K = new p170r.C7046v();
                z6 = new p170r.Z();
            }
            this.f49885L = z6;
        }

        private static long D(int i6, int i10) {
            return ((long) i10) | (((long) i6) << 32);
        }

        int B(int[] iArr, android.graphics.drawable.Drawable drawable, int i6) {
            int iZ = super.z(iArr, drawable);
            this.f49885L.m(iZ, java.lang.Integer.valueOf(i6));
            return iZ;
        }

        int C(int i6, int i10, android.graphics.drawable.Drawable drawable, boolean z6) {
            int iA = super.a(drawable);
            long jD = D(i6, i10);
            long j6 = z6 ? 8589934592L : 0L;
            long j10 = iA;
            this.f49884K.a(jD, java.lang.Long.valueOf(j10 | j6));
            if (z6) {
                this.f49884K.a(D(i10, i6), java.lang.Long.valueOf(4294967296L | j10 | j6));
            }
            return iA;
        }

        int E(int i6) {
            if (i6 < 0) {
                return 0;
            }
            return ((java.lang.Integer) this.f49885L.h(i6, 0)).intValue();
        }

        int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(android.util.StateSet.WILD_CARD);
        }

        int G(int i6, int i10) {
            return (int) ((java.lang.Long) this.f49884K.h(D(i6, i10), -1L)).longValue();
        }

        boolean H(int i6, int i10) {
            return (((java.lang.Long) this.f49884K.h(D(i6, i10), -1L)).longValue() & 4294967296L) != 0;
        }

        boolean I(int i6, int i10) {
            return (((java.lang.Long) this.f49884K.h(D(i6, i10), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new p110l.a(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return new p110l.a(this, resources);
        }

        @Override // l.d.a, l.b.d
        void r() {
            this.f49884K = this.f49884K.clone();
            this.f49885L = this.f49885L.clone();
        }
    }

    private static class d extends l.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f49886a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f49886a = cVar;
        }

        @Override // l.a.g
        public void c() {
            this.f49886a.start();
        }

        @Override // l.a.g
        public void d() {
            this.f49886a.stop();
        }
    }

    private static class e extends l.a.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.animation.ObjectAnimator f49887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f49888b;

        e(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z6, boolean z10) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i6 = z6 ? numberOfFrames - 1 : 0;
            int i10 = z6 ? 0 : numberOfFrames - 1;
            l.a.f fVar = new l.a.f(animationDrawable, z6);
            android.animation.ObjectAnimator objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(animationDrawable, "currentIndex", i6, i10);
            p120m.b.a(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f49888b = z10;
            this.f49887a = objectAnimatorOfInt;
        }

        @Override // l.a.g
        public boolean a() {
            return this.f49888b;
        }

        @Override // l.a.g
        public void b() {
            this.f49887a.reverse();
        }

        @Override // l.a.g
        public void c() {
            this.f49887a.start();
        }

        @Override // l.a.g
        public void d() {
            this.f49887a.cancel();
        }
    }

    private static class f implements android.animation.TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f49889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f49890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f49891c;

        f(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z6) {
            b(animationDrawable, z6);
        }

        int a() {
            return this.f49891c;
        }

        int b(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z6) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f49890b = numberOfFrames;
            int[] iArr = this.f49889a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f49889a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f49889a;
            int i6 = 0;
            for (int i10 = 0; i10 < numberOfFrames; i10++) {
                int duration = animationDrawable.getDuration(z6 ? (numberOfFrames - i10) - 1 : i10);
                iArr2[i10] = duration;
                i6 += duration;
            }
            this.f49891c = i6;
            return i6;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            int i6 = (int) ((f6 * this.f49891c) + 0.5f);
            int i10 = this.f49890b;
            int[] iArr = this.f49889a;
            int i11 = 0;
            while (i11 < i10) {
                int i12 = iArr[i11];
                if (i6 < i12) {
                    break;
                }
                i6 -= i12;
                i11++;
            }
            return (i11 / i10) + (i11 < i10 ? i6 / this.f49891c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    a(l.a.c cVar, android.content.res.Resources resources) {
        super(null);
        this.f49880S = -1;
        this.f49881T = -1;
        h(new l.a.c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static p110l.a l(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            p110l.a aVar = new p110l.a();
            aVar.m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void n(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void o() {
        onStateChange(getState());
    }

    private int p(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, p120m.e.f50192h);
        int resourceId = typedArrayK.getResourceId(p120m.e.f50193i, 0);
        int resourceId2 = typedArrayK.getResourceId(p120m.e.f50194j, -1);
        android.graphics.drawable.Drawable drawableJ = resourceId2 > 0 ? androidx.appcompat.widget.T.h().j(context, resourceId2) : null;
        typedArrayK.recycle();
        int[] iArrJ = j(attributeSet);
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.h.c(resources, xmlPullParser, attributeSet, theme) : p120m.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ != null) {
            return this.f49878Q.B(iArrJ, drawableJ, resourceId);
        }
        throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int q(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, p120m.e.f50195k);
        int resourceId = typedArrayK.getResourceId(p120m.e.f50198n, -1);
        int resourceId2 = typedArrayK.getResourceId(p120m.e.f50197m, -1);
        int resourceId3 = typedArrayK.getResourceId(p120m.e.f50196l, -1);
        android.graphics.drawable.Drawable drawableJ = resourceId3 > 0 ? androidx.appcompat.widget.T.h().j(context, resourceId3) : null;
        boolean z6 = typedArrayK.getBoolean(p120m.e.f50199o, false);
        typedArrayK.recycle();
        if (drawableJ == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawableJ = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.c.b(context, resources, xmlPullParser, attributeSet, theme) : p120m.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawableJ == null) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f49878Q.C(resourceId, resourceId2, drawableJ, z6);
        }
        throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean r(int i6) {
        int iC;
        int iG;
        l.a.g bVar;
        l.a.g gVar = this.f49879R;
        if (gVar == null) {
            iC = c();
        } else {
            if (i6 == this.f49880S) {
                return true;
            }
            if (i6 == this.f49881T && gVar.a()) {
                gVar.b();
                this.f49880S = this.f49881T;
                this.f49881T = i6;
                return true;
            }
            iC = this.f49880S;
            gVar.d();
        }
        this.f49879R = null;
        this.f49881T = -1;
        this.f49880S = -1;
        l.a.c cVar = this.f49878Q;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i6);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        java.lang.Object current = getCurrent();
        if (current instanceof android.graphics.drawable.AnimationDrawable) {
            bVar = new l.a.e((android.graphics.drawable.AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.c)) {
                if (current instanceof android.graphics.drawable.Animatable) {
                    bVar = new l.a.b((android.graphics.drawable.Animatable) current);
                }
                return false;
            }
            bVar = new l.a.d((androidx.vectordrawable.graphics.drawable.c) current);
        }
        bVar.c();
        this.f49879R = bVar;
        this.f49881T = iC;
        this.f49880S = i6;
        return true;
    }

    private void s(android.content.res.TypedArray typedArray) {
        l.a.c cVar = this.f49878Q;
        cVar.f49918d |= p120m.c.b(typedArray);
        cVar.x(typedArray.getBoolean(p120m.e.f50188d, cVar.f49923i));
        cVar.t(typedArray.getBoolean(p120m.e.f50189e, cVar.f49926l));
        cVar.u(typedArray.getInt(p120m.e.f50190f, cVar.f49906A));
        cVar.v(typedArray.getInt(p120m.e.f50191g, cVar.f49907B));
        setDither(typedArray.getBoolean(p120m.e.f50186b, cVar.f49938x));
    }

    @Override // p110l.d, p110l.b
    void h(l.b.d dVar) {
        super.h(dVar);
        if (dVar instanceof l.a.c) {
            this.f49878Q = (l.a.c) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p110l.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        l.a.g gVar = this.f49879R;
        if (gVar != null) {
            gVar.d();
            this.f49879R = null;
            g(this.f49880S);
            this.f49880S = -1;
            this.f49881T = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p110l.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public l.a.c b() {
        return new l.a.c(this.f49878Q, this, null);
    }

    public void m(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayK = androidx.core.content.res.k.k(resources, theme, attributeSet, p120m.e.f50185a);
        setVisible(typedArrayK.getBoolean(p120m.e.f50187c, true), true);
        s(typedArrayK);
        i(resources);
        typedArrayK.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // p110l.d, p110l.b, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.f49882U && super.mutate() == this) {
            this.f49878Q.r();
            this.f49882U = true;
        }
        return this;
    }

    @Override // p110l.d, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iF = this.f49878Q.F(iArr);
        boolean z6 = iF != c() && (r(iF) || g(iF));
        android.graphics.drawable.Drawable current = getCurrent();
        return current != null ? z6 | current.setState(iArr) : z6;
    }

    @Override // p110l.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z6, boolean z10) {
        boolean visible = super.setVisible(z6, z10);
        l.a.g gVar = this.f49879R;
        if (gVar != null && (visible || z10)) {
            if (z6) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
