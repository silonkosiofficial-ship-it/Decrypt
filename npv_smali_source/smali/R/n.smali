.class public final LR/n;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR/n$a;
    }
.end annotation


# static fields
.field public static final H:LR/n$a;

.field public static final I:I

.field private static final J:[I

.field private static final K:[I


# instance fields
.field private C:LR/v;

.field private D:Ljava/lang/Boolean;

.field private E:Ljava/lang/Long;

.field private F:Ljava/lang/Runnable;

.field private G:Lx7/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR/n$a;-><init>(Ly7/k;)V

    sput-object v0, LR/n;->H:LR/n$a;

    const/16 v0, 0x8

    sput v0, LR/n;->I:I

    const v0, 0x10100a7

    const v1, 0x101009e

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, LR/n;->J:[I

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, LR/n;->K:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic a(LR/n;)V
    .locals 0

    invoke-static {p0}, LR/n;->setRippleState$lambda$2(LR/n;)V

    return-void
.end method

.method private final c(Z)V
    .locals 1

    new-instance v0, LR/v;

    invoke-direct {v0, p1}, LR/v;-><init>(Z)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, LR/n;->C:LR/v;

    return-void
.end method

.method private final setRippleState(Z)V
    .locals 6

    .prologue
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, LR/n;->F:Ljava/lang/Runnable;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    :cond_0
    iget-object v2, p0, LR/n;->E:Ljava/lang/Long;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    const-wide/16 v2, 0x0

    :goto_0
    sub-long v2, v0, v2

    if-nez p1, :cond_2

    const-wide/16 v4, 0x5

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    new-instance p1, LR/m;

    invoke-direct {p1, p0}, LR/m;-><init>(LR/n;)V

    iput-object p1, p0, LR/n;->F:Ljava/lang/Runnable;

    const-wide/16 v2, 0x32

    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    sget-object p1, LR/n;->J:[I

    goto :goto_1

    :cond_3
    sget-object p1, LR/n;->K:[I

    :goto_1
    iget-object v2, p0, LR/n;->C:LR/v;

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, LR/n;->E:Ljava/lang/Long;

    return-void
.end method

.method private static final setRippleState$lambda$2(LR/n;)V
    .locals 2

    .prologue
    iget-object v0, p0, LR/n;->C:LR/v;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, LR/n;->K:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, LR/n;->F:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final b(Lz/n$b;ZJIJFLx7/a;)V
    .locals 9

    .prologue
    move-object v6, p0

    move v7, p2

    iget-object v0, v6, LR/n;->C:LR/v;

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, v6, LR/n;->D:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0, p2}, LR/n;->c(Z)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, v6, LR/n;->D:Ljava/lang/Boolean;

    :cond_1
    iget-object v8, v6, LR/n;->C:LR/v;

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v0, p9

    iput-object v0, v6, LR/n;->G:Lx7/a;

    move v0, p5

    invoke-virtual {v8, p5}, LR/v;->c(I)V

    move-object v0, p0

    move-wide v1, p3

    move-wide v3, p6

    move/from16 v5, p8

    invoke-virtual/range {v0 .. v5}, LR/n;->f(JJF)V

    if-eqz v7, :cond_2

    invoke-virtual {p1}, Lz/n$b;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->m(J)F

    move-result v0

    invoke-virtual {p1}, Lz/n$b;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/g;->n(J)F

    move-result v1

    :goto_0
    invoke-virtual {v8, v0, v1}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    goto :goto_1

    :cond_2
    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->centerX()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->centerY()I

    move-result v1

    int-to-float v1, v1

    goto :goto_0

    :goto_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, LR/n;->setRippleState(Z)V

    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    iput-object v0, p0, LR/n;->G:Lx7/a;

    iget-object v0, p0, LR/n;->F:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, LR/n;->F:Ljava/lang/Runnable;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LR/n;->C:LR/v;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object v1, LR/n;->K:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :goto_0
    iget-object v0, p0, LR/n;->C:LR/v;

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final e()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LR/n;->setRippleState(Z)V

    return-void
.end method

.method public final f(JJF)V
    .locals 1

    .prologue
    iget-object v0, p0, LR/n;->C:LR/v;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p3, p4, p5}, LR/v;->b(JF)V

    new-instance p3, Landroid/graphics/Rect;

    invoke-static {p1, p2}, Ln0/m;->i(J)F

    move-result p4

    invoke-static {p4}, LA7/a;->d(F)I

    move-result p4

    invoke-static {p1, p2}, Ln0/m;->g(J)F

    move-result p1

    invoke-static {p1}, LA7/a;->d(F)I

    move-result p1

    const/4 p2, 0x0

    invoke-direct {p3, p2, p2, p4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iget p1, p3, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setLeft(I)V

    iget p1, p3, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setTop(I)V

    iget p1, p3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setRight(I)V

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setBottom(I)V

    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    iget-object p1, p0, LR/n;->G:Lx7/a;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method protected onMeasure(II)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public refreshDrawableState()V
    .locals 0

    return-void
.end method
