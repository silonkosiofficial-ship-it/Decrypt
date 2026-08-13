package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
abstract class h {

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.animation.Animation f22556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final android.animation.Animator f22557b;

        a(android.animation.Animator animator) {
            this.f22556a = null;
            this.f22557b = animator;
            if (animator == null) {
                throw new java.lang.IllegalStateException("Animator cannot be null");
            }
        }

        a(android.view.animation.Animation animation) {
            this.f22556a = animation;
            this.f22557b = null;
            if (animation == null) {
                throw new java.lang.IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class b extends android.view.animation.AnimationSet implements java.lang.Runnable {

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private final android.view.ViewGroup f22558C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private final android.view.View f22559D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        private boolean f22560E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        private boolean f22561F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private boolean f22562G;

        b(android.view.animation.Animation animation, android.view.ViewGroup viewGroup, android.view.View view) {
            super(false);
            this.f22562G = true;
            this.f22558C = viewGroup;
            this.f22559D = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j6, android.view.animation.Transformation transformation) {
            this.f22562G = true;
            if (this.f22560E) {
                return !this.f22561F;
            }
            if (!super.getTransformation(j6, transformation)) {
                this.f22560E = true;
                androidx.core.view.J.a(this.f22558C, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j6, android.view.animation.Transformation transformation, float f6) {
            this.f22562G = true;
            if (this.f22560E) {
                return !this.f22561F;
            }
            if (!super.getTransformation(j6, transformation, f6)) {
                this.f22560E = true;
                androidx.core.view.J.a(this.f22558C, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f22560E || !this.f22562G) {
                this.f22558C.endViewTransition(this.f22559D);
                this.f22561F = true;
            } else {
                this.f22562G = false;
                this.f22558C.post(this);
            }
        }
    }

    private static int a(androidx.fragment.app.f fVar, boolean z6, boolean z10) {
        if (z10) {
            return z6 ? fVar.J() : fVar.K();
        }
        return z6 ? fVar.v() : fVar.y();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    static androidx.fragment.app.h.a b(android.content.Context context, androidx.fragment.app.f fVar, boolean z6, boolean z10) {
        android.animation.Animator animatorLoadAnimator;
        int iF = fVar.F();
        int iA = a(fVar, z6, z10);
        fVar.u1(0, 0, 0, 0);
        android.view.ViewGroup viewGroup = fVar.f22506j0;
        if (viewGroup != null && viewGroup.getTag(U1.b.f14459c) != null) {
            fVar.f22506j0.setTag(U1.b.f14459c, null);
        }
        android.view.ViewGroup viewGroup2 = fVar.f22506j0;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        android.view.animation.Animation animationP0 = fVar.p0(iF, z6, iA);
        if (animationP0 != null) {
            return new androidx.fragment.app.h.a(animationP0);
        }
        android.animation.Animator animatorQ0 = fVar.q0(iF, z6, iA);
        if (animatorQ0 != null) {
            return new androidx.fragment.app.h.a(animatorQ0);
        }
        if (iA == 0 && iF != 0) {
            iA = d(context, iF, z6);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    android.view.animation.Animation animationLoadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new androidx.fragment.app.h.a(animationLoadAnimation);
                    }
                } catch (android.content.res.Resources.NotFoundException e6) {
                    throw e6;
                } catch (java.lang.RuntimeException unused) {
                    try {
                        animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new androidx.fragment.app.h.a(animatorLoadAnimator);
                        }
                    } catch (java.lang.RuntimeException e10) {
                        if (zEquals) {
                            throw e10;
                        }
                        android.view.animation.Animation animationLoadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new androidx.fragment.app.h.a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new androidx.fragment.app.h.a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    private static int c(android.content.Context context, int i6) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i6});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(android.content.Context context, int i6, boolean z6) {
        int i10;
        if (i6 == 4097) {
            return z6 ? U1.a.f14455e : U1.a.f14456f;
        }
        if (i6 == 8194) {
            return z6 ? U1.a.f14451a : U1.a.f14452b;
        }
        if (i6 == 8197) {
            i10 = z6 ? android.R.attr.activityCloseEnterAnimation : android.R.attr.activityCloseExitAnimation;
        } else {
            if (i6 == 4099) {
                return z6 ? U1.a.f14453c : U1.a.f14454d;
            }
            if (i6 != 4100) {
                return -1;
            }
            i10 = z6 ? android.R.attr.activityOpenEnterAnimation : android.R.attr.activityOpenExitAnimation;
        }
        return c(context, i10);
    }
}
