.class public abstract Lt/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    move-result v0

    sput v0, Lt/B;->a:F

    return-void
.end method

.method public static final a()F
    .locals 1

    sget v0, Lt/B;->a:F

    return v0
.end method

.method public static final b(LV/n;I)Lu/B;
    .locals 3

    .prologue
    invoke-static {}, LV/q;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)"

    const v2, 0x35e8bf9b

    invoke-static {v2, p1, v0, v1}, LV/q;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/p0;->e()LV/O0;

    move-result-object p1

    invoke-interface {p0, p1}, LV/n;->n(LV/w;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LY0/e;

    invoke-interface {p1}, LY0/e;->getDensity()F

    move-result v0

    invoke-interface {p0, v0}, LV/n;->h(F)Z

    move-result v0

    invoke-interface {p0}, LV/n;->g()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1

    sget-object v0, LV/n;->a:LV/n$a;

    invoke-virtual {v0}, LV/n$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_2

    :cond_1
    new-instance v0, Lt/A;

    invoke-direct {v0, p1}, Lt/A;-><init>(LY0/e;)V

    invoke-static {v0}, Lu/D;->d(Lu/L;)Lu/B;

    move-result-object v1

    invoke-interface {p0, v1}, LV/n;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lu/B;

    invoke-static {}, LV/q;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LV/q;->P()V

    :cond_3
    return-object v1
.end method
