.class public abstract Landroidx/compose/ui/viewinterop/c;
.super Landroid/view/ViewGroup;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/E;
.implements LV/l;
.implements LF0/p0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/viewinterop/c$b;
    }
.end annotation


# static fields
.field public static final c0:Landroidx/compose/ui/viewinterop/c$b;

.field public static final d0:I

.field private static final e0:Lx7/l;


# instance fields
.field private final C:I

.field private final D:Ly0/c;

.field private final E:Landroid/view/View;

.field private final F:LF0/o0;

.field private G:Lx7/a;

.field private H:Z

.field private I:Lx7/a;

.field private J:Lx7/a;

.field private K:Landroidx/compose/ui/d;

.field private L:Lx7/l;

.field private M:LY0/e;

.field private N:Lx7/l;

.field private O:Landroidx/lifecycle/r;

.field private P:Lx2/f;

.field private final Q:Lx7/a;

.field private final R:Lx7/a;

.field private S:Lx7/l;

.field private final T:[I

.field private U:I

.field private V:I

.field private final W:Landroidx/core/view/F;

.field private a0:Z

.field private final b0:LF0/J;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/viewinterop/c$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/viewinterop/c$b;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/ui/viewinterop/c;->c0:Landroidx/compose/ui/viewinterop/c$b;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/viewinterop/c;->d0:I

    sget-object v0, Landroidx/compose/ui/viewinterop/c$a;->D:Landroidx/compose/ui/viewinterop/c$a;

    sput-object v0, Landroidx/compose/ui/viewinterop/c;->e0:Lx7/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LV/s;ILy0/c;Landroid/view/View;LF0/o0;)V
    .locals 2

    .prologue
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    iput p3, p0, Landroidx/compose/ui/viewinterop/c;->C:I

    iput-object p4, p0, Landroidx/compose/ui/viewinterop/c;->D:Ly0/c;

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    iput-object p6, p0, Landroidx/compose/ui/viewinterop/c;->F:LF0/o0;

    if-eqz p2, :cond_0

    invoke-static {p0, p2}, Landroidx/compose/ui/platform/O1;->i(Landroid/view/View;LV/s;)V

    :cond_0
    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object p2, Landroidx/compose/ui/viewinterop/c$q;->D:Landroidx/compose/ui/viewinterop/c$q;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->G:Lx7/a;

    sget-object p2, Landroidx/compose/ui/viewinterop/c$n;->D:Landroidx/compose/ui/viewinterop/c$n;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->I:Lx7/a;

    sget-object p2, Landroidx/compose/ui/viewinterop/c$m;->D:Landroidx/compose/ui/viewinterop/c$m;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->J:Lx7/a;

    sget-object p2, Landroidx/compose/ui/d;->a:Landroidx/compose/ui/d$a;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->K:Landroidx/compose/ui/d;

    const/high16 p5, 0x3f800000    # 1.0f

    const/4 p6, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p5, p6, v0, v1}, LY0/g;->b(FFILjava/lang/Object;)LY0/e;

    move-result-object p5

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->M:LY0/e;

    new-instance p5, Landroidx/compose/ui/viewinterop/c$p;

    invoke-direct {p5, p0}, Landroidx/compose/ui/viewinterop/c$p;-><init>(Landroidx/compose/ui/viewinterop/c;)V

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->Q:Lx7/a;

    new-instance p5, Landroidx/compose/ui/viewinterop/c$o;

    invoke-direct {p5, p0}, Landroidx/compose/ui/viewinterop/c$o;-><init>(Landroidx/compose/ui/viewinterop/c;)V

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->R:Lx7/a;

    new-array p5, v0, [I

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->T:[I

    const/high16 p5, -0x80000000

    iput p5, p0, Landroidx/compose/ui/viewinterop/c;->U:I

    iput p5, p0, Landroidx/compose/ui/viewinterop/c;->V:I

    new-instance p5, Landroidx/core/view/F;

    invoke-direct {p5, p0}, Landroidx/core/view/F;-><init>(Landroid/view/ViewGroup;)V

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->W:Landroidx/core/view/F;

    new-instance p5, LF0/J;

    const/4 p6, 0x3

    invoke-direct {p5, p1, p1, p6, v1}, LF0/J;-><init>(ZIILy7/k;)V

    invoke-virtual {p5, p0}, LF0/J;->C1(Landroidx/compose/ui/viewinterop/c;)V

    invoke-static {}, Landroidx/compose/ui/viewinterop/d;->a()Landroidx/compose/ui/viewinterop/d$a;

    move-result-object p1

    invoke-static {p2, p1, p4}, Landroidx/compose/ui/input/nestedscroll/a;->a(Landroidx/compose/ui/d;Ly0/b;Ly0/c;)Landroidx/compose/ui/d;

    move-result-object p1

    const/4 p2, 0x1

    sget-object p4, Landroidx/compose/ui/viewinterop/c$h;->D:Landroidx/compose/ui/viewinterop/c$h;

    invoke-static {p1, p2, p4}, LK0/n;->c(Landroidx/compose/ui/d;ZLx7/l;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-static {p1, p0}, Lz0/M;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/viewinterop/c;)Landroidx/compose/ui/d;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/viewinterop/c$i;

    invoke-direct {p2, p0, p5, p0}, Landroidx/compose/ui/viewinterop/c$i;-><init>(Landroidx/compose/ui/viewinterop/c;LF0/J;Landroidx/compose/ui/viewinterop/c;)V

    invoke-static {p1, p2}, Landroidx/compose/ui/draw/b;->b(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p1

    new-instance p2, Landroidx/compose/ui/viewinterop/c$j;

    invoke-direct {p2, p0, p5}, Landroidx/compose/ui/viewinterop/c$j;-><init>(Landroidx/compose/ui/viewinterop/c;LF0/J;)V

    invoke-static {p1, p2}, Landroidx/compose/ui/layout/c;->a(Landroidx/compose/ui/d;Lx7/l;)Landroidx/compose/ui/d;

    move-result-object p1

    invoke-virtual {p5, p3}, LF0/J;->d(I)V

    iget-object p2, p0, Landroidx/compose/ui/viewinterop/c;->K:Landroidx/compose/ui/d;

    invoke-interface {p2, p1}, Landroidx/compose/ui/d;->b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p2

    invoke-virtual {p5, p2}, LF0/J;->g(Landroidx/compose/ui/d;)V

    new-instance p2, Landroidx/compose/ui/viewinterop/c$c;

    invoke-direct {p2, p5, p1}, Landroidx/compose/ui/viewinterop/c$c;-><init>(LF0/J;Landroidx/compose/ui/d;)V

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c;->L:Lx7/l;

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c;->M:LY0/e;

    invoke-virtual {p5, p1}, LF0/J;->a(LY0/e;)V

    new-instance p1, Landroidx/compose/ui/viewinterop/c$d;

    invoke-direct {p1, p5}, Landroidx/compose/ui/viewinterop/c$d;-><init>(LF0/J;)V

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->N:Lx7/l;

    new-instance p1, Landroidx/compose/ui/viewinterop/c$e;

    invoke-direct {p1, p0, p5}, Landroidx/compose/ui/viewinterop/c$e;-><init>(Landroidx/compose/ui/viewinterop/c;LF0/J;)V

    invoke-virtual {p5, p1}, LF0/J;->G1(Lx7/l;)V

    new-instance p1, Landroidx/compose/ui/viewinterop/c$f;

    invoke-direct {p1, p0}, Landroidx/compose/ui/viewinterop/c$f;-><init>(Landroidx/compose/ui/viewinterop/c;)V

    invoke-virtual {p5, p1}, LF0/J;->H1(Lx7/l;)V

    new-instance p1, Landroidx/compose/ui/viewinterop/c$g;

    invoke-direct {p1, p0, p5}, Landroidx/compose/ui/viewinterop/c$g;-><init>(Landroidx/compose/ui/viewinterop/c;LF0/J;)V

    invoke-virtual {p5, p1}, LF0/J;->e(LD0/I;)V

    iput-object p5, p0, Landroidx/compose/ui/viewinterop/c;->b0:LF0/J;

    return-void
.end method

.method public static synthetic a(Lx7/a;)V
    .locals 0

    invoke-static {p0}, Landroidx/compose/ui/viewinterop/c;->t(Lx7/a;)V

    return-void
.end method

.method public static final synthetic b(Landroidx/compose/ui/viewinterop/c;)Ly0/c;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/c;->D:Ly0/c;

    return-object p0
.end method

.method public static final synthetic c(Landroidx/compose/ui/viewinterop/c;)Z
    .locals 0

    iget-boolean p0, p0, Landroidx/compose/ui/viewinterop/c;->H:Z

    return p0
.end method

.method public static final synthetic d()Lx7/l;
    .locals 1

    sget-object v0, Landroidx/compose/ui/viewinterop/c;->e0:Lx7/l;

    return-object v0
.end method

.method public static final synthetic e(Landroidx/compose/ui/viewinterop/c;)LF0/o0;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/c;->F:LF0/o0;

    return-object p0
.end method

.method public static final synthetic g(Landroidx/compose/ui/viewinterop/c;)Lx7/a;
    .locals 0

    iget-object p0, p0, Landroidx/compose/ui/viewinterop/c;->Q:Lx7/a;

    return-object p0
.end method

.method private final getSnapshotObserver()LF0/q0;
    .locals 1

    .prologue
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Expected AndroidViewHolder to be attached when observing reads."

    invoke-static {v0}, LC0/a;->b(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->F:LF0/o0;

    invoke-interface {v0}, LF0/o0;->getSnapshotObserver()LF0/q0;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic h(Landroidx/compose/ui/viewinterop/c;)LF0/q0;
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/c;->getSnapshotObserver()LF0/q0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q(Landroidx/compose/ui/viewinterop/c;III)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/c;->u(III)I

    move-result p0

    return p0
.end method

.method public static final synthetic r(Landroidx/compose/ui/viewinterop/c;Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/c;->a0:Z

    return-void
.end method

.method private static final t(Lx7/a;)V
    .locals 0

    invoke-interface {p0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method private final u(III)I
    .locals 2

    .prologue
    const/high16 v0, 0x40000000    # 2.0f

    if-gez p3, :cond_3

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, -0x2

    const v1, 0x7fffffff

    if-ne p3, p1, :cond_1

    if-eq p2, v1, :cond_1

    const/high16 p1, -0x80000000

    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, -0x1

    if-ne p3, p1, :cond_2

    if-eq p2, v1, :cond_2

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    invoke-static {p1, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {p3, p1, p2}, LE7/j;->k(III)I

    move-result p1

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    :goto_1
    return p1
.end method


# virtual methods
.method public R()Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    return v0
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->J:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public gatherTransparentRegion(Landroid/graphics/Region;)Z
    .locals 9

    .prologue
    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->T:[I

    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationInWindow([I)V

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->T:[I

    const/4 v2, 0x0

    aget v4, v1, v2

    aget v5, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int v6, v4, v1

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->T:[I

    aget v1, v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int v7, v1, v2

    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    return v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getDensity()LY0/e;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->M:LY0/e;

    return-object v0
.end method

.method public final getInteropView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    return-object v0
.end method

.method public final getLayoutNode()LF0/J;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->b0:LF0/J;

    return-object v0
.end method

.method public getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_0
    return-object v0
.end method

.method public final getLifecycleOwner()Landroidx/lifecycle/r;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->O:Landroidx/lifecycle/r;

    return-object v0
.end method

.method public final getModifier()Landroidx/compose/ui/d;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->K:Landroidx/compose/ui/d;

    return-object v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->W:Landroidx/core/view/F;

    invoke-virtual {v0}, Landroidx/core/view/F;->a()I

    move-result v0

    return v0
.end method

.method public final getOnDensityChanged$ui_release()Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->N:Lx7/l;

    return-object v0
.end method

.method public final getOnModifierChanged$ui_release()Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->L:Lx7/l;

    return-object v0
.end method

.method public final getOnRequestDisallowInterceptTouchEvent$ui_release()Lx7/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->S:Lx7/l;

    return-object v0
.end method

.method public final getRelease()Lx7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/a;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->J:Lx7/a;

    return-object v0
.end method

.method public final getReset()Lx7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/a;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->I:Lx7/a;

    return-object v0
.end method

.method public final getSavedStateRegistryOwner()Lx2/f;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->P:Lx2/f;

    return-object v0
.end method

.method public final getUpdate()Lx7/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/a;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->G:Lx7/a;

    return-object v0
.end method

.method public final getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    return-object v0
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->I:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViewsInLayout()V

    return-void
.end method

.method public invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->invalidateChildInParent([ILandroid/graphics/Rect;)Landroid/view/ViewParent;

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->s()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method public j(Landroid/view/View;IIIII[I)V
    .locals 6

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->D:Ly0/c;

    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p1

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p1, p2}, Ln0/h;->a(FF)J

    move-result-wide v1

    invoke-static {p4}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p1

    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p1, p2}, Ln0/h;->a(FF)J

    move-result-wide v3

    invoke-static {p6}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Ly0/c;->b(JJI)J

    move-result-wide p1

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p3

    invoke-static {p3}, Landroidx/compose/ui/platform/O0;->b(F)I

    move-result p3

    const/4 p4, 0x0

    aput p3, p7, p4

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/platform/O0;->b(F)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p7, p2

    return-void
.end method

.method public k(Landroid/view/View;IIIII)V
    .locals 6

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->D:Ly0/c;

    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p1

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p1, p2}, Ln0/h;->a(FF)J

    move-result-wide v1

    invoke-static {p4}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p1

    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p1, p2}, Ln0/h;->a(FF)J

    move-result-wide v3

    invoke-static {p6}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Ly0/c;->b(JJI)J

    return-void
.end method

.method public l(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    .prologue
    and-int/lit8 p1, p3, 0x2

    const/4 p2, 0x1

    if-nez p1, :cond_1

    and-int/lit8 p1, p3, 0x1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :cond_1
    :goto_0
    return p2
.end method

.method public m(Landroid/view/View;Landroid/view/View;II)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->W:Landroidx/core/view/F;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/F;->c(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public n(Landroid/view/View;I)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->W:Landroidx/core/view/F;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/F;->d(Landroid/view/View;I)V

    return-void
.end method

.method public o(Landroid/view/View;II[II)V
    .locals 0

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c;->D:Ly0/c;

    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p2

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->c(I)F

    move-result p3

    invoke-static {p2, p3}, Ln0/h;->a(FF)J

    move-result-wide p2

    invoke-static {p5}, Landroidx/compose/ui/viewinterop/d;->e(I)I

    move-result p5

    invoke-virtual {p1, p2, p3, p5}, Ly0/c;->d(JI)J

    move-result-wide p1

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p3

    invoke-static {p3}, Landroidx/compose/ui/platform/O0;->b(F)I

    move-result p3

    const/4 p5, 0x0

    aput p3, p4, p5

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    invoke-static {p1}, Landroidx/compose/ui/platform/O0;->b(F)I

    move-result p1

    const/4 p2, 0x1

    aput p1, p4, p2

    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->Q:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onDescendantInvalidated(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->s()V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    invoke-direct {p0}, Landroidx/compose/ui/viewinterop/c;->getSnapshotObserver()LF0/q0;

    move-result-object v0

    invoke-virtual {v0, p0}, LF0/q0;->a(Ljava/lang/Object;)V

    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {p1, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Landroid/view/View;->measure(II)V

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    iput p1, p0, Landroidx/compose/ui/viewinterop/c;->U:I

    iput p2, p0, Landroidx/compose/ui/viewinterop/c;->V:I

    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 14

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static/range {p2 .. p2}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    move-result v0

    invoke-static/range {p3 .. p3}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    move-result v2

    invoke-static {v0, v2}, LY0/B;->a(FF)J

    move-result-wide v6

    move-object v0, p0

    iget-object v2, v0, Landroidx/compose/ui/viewinterop/c;->D:Ly0/c;

    invoke-virtual {v2}, Ly0/c;->e()LW8/N;

    move-result-object v2

    new-instance v11, Landroidx/compose/ui/viewinterop/c$k;

    const/4 v8, 0x0

    move-object v3, v11

    move/from16 v4, p4

    move-object v5, p0

    invoke-direct/range {v3 .. v8}, Landroidx/compose/ui/viewinterop/c$k;-><init>(ZLandroidx/compose/ui/viewinterop/c;JLm7/e;)V

    const/4 v12, 0x3

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, v2

    invoke-static/range {v8 .. v13}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return v1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 7

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/c;->isNestedScrollingEnabled()Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p2}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    move-result p1

    invoke-static {p3}, Landroidx/compose/ui/viewinterop/d;->d(F)F

    move-result p2

    invoke-static {p1, p2}, LY0/B;->a(FF)J

    move-result-wide p1

    iget-object p3, p0, Landroidx/compose/ui/viewinterop/c;->D:Ly0/c;

    invoke-virtual {p3}, Ly0/c;->e()LW8/N;

    move-result-object v1

    new-instance v4, Landroidx/compose/ui/viewinterop/c$l;

    const/4 p3, 0x0

    invoke-direct {v4, p0, p1, p2, p3}, Landroidx/compose/ui/viewinterop/c$l;-><init>(Landroidx/compose/ui/viewinterop/c;JLm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return v0
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onWindowVisibilityChanged(I)V

    return-void
.end method

.method public p()V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eq v0, p0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->I:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->S:Lx7/l;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public final s()V
    .locals 3

    .prologue
    iget-boolean v0, p0, Landroidx/compose/ui/viewinterop/c;->a0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->E:Landroid/view/View;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c;->R:Lx7/a;

    new-instance v2, Landroidx/compose/ui/viewinterop/a;

    invoke-direct {v2, v1}, Landroidx/compose/ui/viewinterop/a;-><init>(Lx7/a;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->b0:LF0/J;

    invoke-virtual {v0}, LF0/J;->D0()V

    :goto_0
    return-void
.end method

.method public final setDensity(LY0/e;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->M:LY0/e;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->M:LY0/e;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->N:Lx7/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setLifecycleOwner(Landroidx/lifecycle/r;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->O:Landroidx/lifecycle/r;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->O:Landroidx/lifecycle/r;

    invoke-static {p0, p1}, Landroidx/lifecycle/Z;->b(Landroid/view/View;Landroidx/lifecycle/r;)V

    :cond_0
    return-void
.end method

.method public final setModifier(Landroidx/compose/ui/d;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->K:Landroidx/compose/ui/d;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->K:Landroidx/compose/ui/d;

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->L:Lx7/l;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final setOnDensityChanged$ui_release(Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->N:Lx7/l;

    return-void
.end method

.method public final setOnModifierChanged$ui_release(Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->L:Lx7/l;

    return-void
.end method

.method public final setOnRequestDisallowInterceptTouchEvent$ui_release(Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->S:Lx7/l;

    return-void
.end method

.method protected final setRelease(Lx7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->J:Lx7/a;

    return-void
.end method

.method protected final setReset(Lx7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->I:Lx7/a;

    return-void
.end method

.method public final setSavedStateRegistryOwner(Lx2/f;)V
    .locals 1

    .prologue
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c;->P:Lx2/f;

    if-eq p1, v0, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->P:Lx2/f;

    invoke-static {p0, p1}, Lx2/g;->b(Landroid/view/View;Lx2/f;)V

    :cond_0
    return-void
.end method

.method protected final setUpdate(Lx7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c;->G:Lx7/a;

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/ui/viewinterop/c;->H:Z

    iget-object p1, p0, Landroidx/compose/ui/viewinterop/c;->Q:Lx7/a;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final v()V
    .locals 3

    .prologue
    iget v0, p0, Landroidx/compose/ui/viewinterop/c;->U:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    iget v2, p0, Landroidx/compose/ui/viewinterop/c;->V:I

    if-ne v2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->measure(II)V

    :cond_1
    :goto_0
    return-void
.end method
