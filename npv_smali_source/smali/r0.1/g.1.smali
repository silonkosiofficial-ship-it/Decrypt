.class public final Lr0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr0/g$a;
    }
.end annotation


# static fields
.field public static final F:Lr0/g$a;

.field private static G:Z

.field private static final H:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field private A:F

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private final b:J

.field private final c:Lo0/r0;

.field private final d:Lq0/a;

.field private final e:Landroid/view/RenderNode;

.field private f:J

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Matrix;

.field private i:Z

.field private j:J

.field private k:I

.field private l:I

.field private m:Lo0/z0;

.field private n:F

.field private o:Z

.field private p:J

.field private q:F

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field private v:J

.field private w:J

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr0/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr0/g$a;-><init>(Ly7/k;)V

    sput-object v0, Lr0/g;->F:Lr0/g$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lr0/g;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;JLo0/r0;Lq0/a;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, Lr0/g;->b:J

    iput-object p4, p0, Lr0/g;->c:Lo0/r0;

    iput-object p5, p0, Lr0/g;->d:Lq0/a;

    const-string p2, "Compose"

    invoke-static {p2, p1}, Landroid/view/RenderNode;->create(Ljava/lang/String;Landroid/view/View;)Landroid/view/RenderNode;

    move-result-object p1

    iput-object p1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    sget-object p2, LY0/t;->b:LY0/t$a;

    invoke-virtual {p2}, LY0/t$a;->a()J

    move-result-wide p3

    iput-wide p3, p0, Lr0/g;->f:J

    invoke-virtual {p2}, LY0/t$a;->a()J

    move-result-wide p2

    iput-wide p2, p0, Lr0/g;->j:J

    sget-object p2, Lr0/g;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setScaleX(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setScaleY(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setTranslationX(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setTranslationY(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getElevation()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setElevation(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotation()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotation(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotationX(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotationY(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getCameraDistance()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getClipToOutline()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->getAlpha()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setAlpha(F)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->isValid()Z

    invoke-virtual {p1, p3, p3, p3, p3}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->offsetLeftAndRight(I)Z

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->offsetTopAndBottom(I)Z

    invoke-direct {p0, p1}, Lr0/g;->U(Landroid/view/RenderNode;)V

    invoke-virtual {p0}, Lr0/g;->Q()V

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setLayerType(I)Z

    invoke-virtual {p1}, Landroid/view/RenderNode;->hasOverlappingRendering()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    :cond_0
    sget-boolean p2, Lr0/g;->G:Z

    if-nez p2, :cond_1

    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    sget-object p1, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {p1}, Lr0/b$a;->a()I

    move-result p2

    invoke-direct {p0, p2}, Lr0/g;->P(I)V

    invoke-virtual {p1}, Lr0/b$a;->a()I

    move-result p1

    iput p1, p0, Lr0/g;->k:I

    sget-object p1, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {p1}, Lo0/f0$a;->B()I

    move-result p1

    iput p1, p0, Lr0/g;->l:I

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lr0/g;->n:F

    sget-object p2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p2}, Ln0/g$a;->b()J

    move-result-wide p2

    iput-wide p2, p0, Lr0/g;->p:J

    iput p1, p0, Lr0/g;->q:F

    iput p1, p0, Lr0/g;->r:F

    sget-object p1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p1}, Lo0/y0$a;->a()J

    move-result-wide p2

    iput-wide p2, p0, Lr0/g;->v:J

    invoke-virtual {p1}, Lo0/y0$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lr0/g;->w:J

    const/high16 p1, 0x41000000    # 8.0f

    iput p1, p0, Lr0/g;->A:F

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr0/g;->E:Z

    return-void

    :cond_1
    new-instance p1, Ljava/lang/NoClassDefFoundError;

    invoke-direct {p1}, Ljava/lang/NoClassDefFoundError;-><init>()V

    throw p1
.end method

.method public synthetic constructor <init>(Landroid/view/View;JLo0/r0;Lq0/a;ILy7/k;)V
    .locals 6

    .prologue
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    new-instance p4, Lo0/r0;

    invoke-direct {p4}, Lo0/r0;-><init>()V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    new-instance p5, Lq0/a;

    invoke-direct {p5}, Lq0/a;-><init>()V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-direct/range {v0 .. v5}, Lr0/g;-><init>(Landroid/view/View;JLo0/r0;Lq0/a;)V

    return-void
.end method

.method private final O()V
    .locals 4

    .prologue
    invoke-virtual {p0}, Lr0/g;->R()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lr0/g;->i:Z

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lr0/g;->R()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v3, p0, Lr0/g;->i:Z

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v2, p0, Lr0/g;->C:Z

    if-eq v0, v2, :cond_2

    iput-boolean v0, p0, Lr0/g;->C:Z

    iget-object v2, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v2, v0}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    :cond_2
    iget-boolean v0, p0, Lr0/g;->D:Z

    if-eq v1, v0, :cond_3

    iput-boolean v1, p0, Lr0/g;->D:Z

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    :cond_3
    return-void
.end method

.method private final P(I)V
    .locals 4

    .prologue
    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    sget-object v1, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v1}, Lr0/b$a;->c()I

    move-result v2

    invoke-static {p1, v2}, Lr0/b;->e(II)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const/4 p1, 0x2

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerType(I)Z

    :cond_0
    iget-object p1, p0, Lr0/g;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lr0/b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lr0/b;->e(II)Z

    move-result p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setLayerType(I)Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lr0/g;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    :goto_0
    return-void
.end method

.method private final S()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lr0/g;->C()I

    move-result v0

    sget-object v1, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v1}, Lr0/b$a;->c()I

    move-result v1

    invoke-static {v0, v1}, Lr0/b;->e(II)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lr0/g;->q()I

    move-result v0

    sget-object v1, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v1}, Lo0/f0$a;->B()I

    move-result v1

    invoke-static {v0, v1}, Lo0/f0;->E(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lr0/g;->f()Lo0/z0;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final T()V
    .locals 1

    .prologue
    invoke-direct {p0}, Lr0/g;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v0}, Lr0/b$a;->c()I

    move-result v0

    :goto_0
    invoke-direct {p0, v0}, Lr0/g;->P(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lr0/g;->C()I

    move-result v0

    goto :goto_0

    :goto_1
    return-void
.end method

.method private final U(Landroid/view/RenderNode;)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    sget-object v0, Lr0/S;->a:Lr0/S;

    invoke-virtual {v0, p1}, Lr0/S;->a(Landroid/view/RenderNode;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lr0/S;->c(Landroid/view/RenderNode;I)V

    invoke-virtual {v0, p1}, Lr0/S;->b(Landroid/view/RenderNode;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lr0/S;->d(Landroid/view/RenderNode;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 0

    iput-boolean p1, p0, Lr0/g;->B:Z

    invoke-direct {p0}, Lr0/g;->O()V

    return-void
.end method

.method public B()F
    .locals 1

    iget v0, p0, Lr0/g;->x:F

    return v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lr0/g;->k:I

    return v0
.end method

.method public D(J)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, Lr0/g;->w:J

    sget-object v0, Lr0/S;->a:Lr0/S;

    iget-object v1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lr0/S;->d(Landroid/view/RenderNode;I)V

    :cond_0
    return-void
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lr0/g;->r:F

    return v0
.end method

.method public F(IIJ)V
    .locals 3

    .prologue
    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result v1

    add-int/2addr v1, p1

    invoke-static {p3, p4}, LY0/t;->f(J)I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {v0, p1, p2, v1, v2}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    iget-wide p1, p0, Lr0/g;->f:J

    invoke-static {p1, p2, p3, p4}, LY0/t;->e(JJ)Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lr0/g;->o:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object p1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-static {p3, p4}, LY0/t;->f(J)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    :cond_0
    iput-wide p3, p0, Lr0/g;->f:J

    :cond_1
    return-void
.end method

.method public G(J)V
    .locals 3

    .prologue
    iput-wide p1, p0, Lr0/g;->p:J

    invoke-static {p1, p2}, Ln0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr0/g;->o:Z

    iget-object p1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    iget-wide v0, p0, Lr0/g;->f:J

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object p1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    iget-wide v1, p0, Lr0/g;->f:J

    invoke-static {v1, v2}, LY0/t;->f(J)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lr0/g;->o:Z

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setPivotY(F)Z

    :goto_0
    return-void
.end method

.method public H()J
    .locals 2

    iget-wide v0, p0, Lr0/g;->v:J

    return-wide v0
.end method

.method public I(LY0/e;LY0/v;Lr0/c;Lx7/l;)V
    .locals 16

    .prologue
    move-object/from16 v1, p0

    iget-object v0, v1, Lr0/g;->e:Landroid/view/RenderNode;

    iget-wide v2, v1, Lr0/g;->f:J

    invoke-static {v2, v3}, LY0/t;->g(J)I

    move-result v2

    iget-wide v3, v1, Lr0/g;->j:J

    invoke-static {v3, v4}, LY0/t;->g(J)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-wide v3, v1, Lr0/g;->f:J

    invoke-static {v3, v4}, LY0/t;->f(J)I

    move-result v3

    iget-wide v4, v1, Lr0/g;->j:J

    invoke-static {v4, v5}, LY0/t;->f(J)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/view/RenderNode;->start(II)Landroid/view/DisplayListCanvas;

    move-result-object v2

    :try_start_0
    iget-object v0, v1, Lr0/g;->c:Lo0/r0;

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v3

    invoke-virtual {v3}, Lo0/G;->a()Landroid/graphics/Canvas;

    move-result-object v3

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v4

    move-object v5, v2

    check-cast v5, Landroid/graphics/Canvas;

    invoke-virtual {v4, v5}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v4

    iget-object v5, v1, Lr0/g;->d:Lq0/a;

    iget-wide v6, v1, Lr0/g;->f:J

    invoke-static {v6, v7}, LY0/u;->d(J)J

    move-result-wide v6

    invoke-interface {v5}, Lq0/g;->F0()Lq0/d;

    move-result-object v8

    invoke-interface {v8}, Lq0/d;->getDensity()LY0/e;

    move-result-object v8

    invoke-interface {v5}, Lq0/g;->F0()Lq0/d;

    move-result-object v9

    invoke-interface {v9}, Lq0/d;->getLayoutDirection()LY0/v;

    move-result-object v9

    invoke-interface {v5}, Lq0/g;->F0()Lq0/d;

    move-result-object v10

    invoke-interface {v10}, Lq0/d;->h()Lo0/q0;

    move-result-object v10

    invoke-interface {v5}, Lq0/g;->F0()Lq0/d;

    move-result-object v11

    invoke-interface {v11}, Lq0/d;->i()J

    move-result-wide v11

    invoke-interface {v5}, Lq0/g;->F0()Lq0/d;

    move-result-object v13

    invoke-interface {v13}, Lq0/d;->f()Lr0/c;

    move-result-object v13

    invoke-interface {v5}, Lq0/g;->F0()Lq0/d;

    move-result-object v14

    move-object/from16 v15, p1

    invoke-interface {v14, v15}, Lq0/d;->a(LY0/e;)V

    move-object/from16 v15, p2

    invoke-interface {v14, v15}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v14, v4}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v14, v6, v7}, Lq0/d;->d(J)V

    move-object/from16 v6, p3

    invoke-interface {v14, v6}, Lq0/d;->e(Lr0/c;)V

    invoke-interface {v4}, Lo0/q0;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v6, p4

    :try_start_1
    invoke-interface {v6, v5}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v4}, Lo0/q0;->s()V

    invoke-interface {v5}, Lq0/g;->F0()Lq0/d;

    move-result-object v4

    invoke-interface {v4, v8}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v4, v9}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v4, v10}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v4, v11, v12}, Lq0/d;->d(J)V

    invoke-interface {v4, v13}, Lq0/d;->e(Lr0/c;)V

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo0/G;->w(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v1, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lr0/g;->s(Z)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_3
    invoke-interface {v4}, Lo0/q0;->s()V

    invoke-interface {v5}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0, v8}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v0, v9}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v0, v10}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v0, v11, v12}, Lq0/d;->d(J)V

    invoke-interface {v0, v13}, Lq0/d;->e(Lr0/c;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v3, v1, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v3, v2}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    throw v0
.end method

.method public J()J
    .locals 2

    iget-wide v0, p0, Lr0/g;->w:J

    return-wide v0
.end method

.method public K(I)V
    .locals 0

    iput p1, p0, Lr0/g;->k:I

    invoke-direct {p0}, Lr0/g;->T()V

    return-void
.end method

.method public L()Landroid/graphics/Matrix;
    .locals 2

    .prologue
    iget-object v0, p0, Lr0/g;->h:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lr0/g;->h:Landroid/graphics/Matrix;

    :cond_0
    iget-object v1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v1, v0}, Landroid/view/RenderNode;->getMatrix(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public M()F
    .locals 1

    iget v0, p0, Lr0/g;->u:F

    return v0
.end method

.method public N(Lo0/q0;)V
    .locals 1

    invoke-static {p1}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.DisplayListCanvas"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/DisplayListCanvas;

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {p1, v0}, Landroid/view/DisplayListCanvas;->drawRenderNode(Landroid/view/RenderNode;)V

    return-void
.end method

.method public final Q()V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    sget-object v0, Lr0/Q;->a:Lr0/Q;

    iget-object v1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, Lr0/Q;->a(Landroid/view/RenderNode;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lr0/P;->a:Lr0/P;

    iget-object v1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, Lr0/P;->a(Landroid/view/RenderNode;)V

    :goto_0
    return-void
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, Lr0/g;->B:Z

    return v0
.end method

.method public a()F
    .locals 1

    iget v0, p0, Lr0/g;->n:F

    return v0
.end method

.method public b(F)V
    .locals 1

    iput p1, p0, Lr0/g;->n:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setAlpha(F)Z

    return-void
.end method

.method public c(F)V
    .locals 1

    iput p1, p0, Lr0/g;->y:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationY(F)Z

    return-void
.end method

.method public d(F)V
    .locals 1

    iput p1, p0, Lr0/g;->z:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotation(F)Z

    return-void
.end method

.method public e(F)V
    .locals 1

    iput p1, p0, Lr0/g;->t:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationY(F)Z

    return-void
.end method

.method public f()Lo0/z0;
    .locals 1

    iget-object v0, p0, Lr0/g;->m:Lo0/z0;

    return-object v0
.end method

.method public g(F)V
    .locals 1

    iput p1, p0, Lr0/g;->r:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleY(F)Z

    return-void
.end method

.method public h(F)V
    .locals 1

    iput p1, p0, Lr0/g;->q:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleX(F)Z

    return-void
.end method

.method public i()V
    .locals 0

    invoke-virtual {p0}, Lr0/g;->Q()V

    return-void
.end method

.method public j(F)V
    .locals 1

    iput p1, p0, Lr0/g;->s:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationX(F)Z

    return-void
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->isValid()Z

    move-result v0

    return v0
.end method

.method public l(Lo0/Z1;)V
    .locals 0

    return-void
.end method

.method public m(F)V
    .locals 1

    iput p1, p0, Lr0/g;->A:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    neg-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    return-void
.end method

.method public n(F)V
    .locals 1

    iput p1, p0, Lr0/g;->x:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationX(F)Z

    return-void
.end method

.method public o()F
    .locals 1

    iget v0, p0, Lr0/g;->q:F

    return v0
.end method

.method public p(F)V
    .locals 1

    iput p1, p0, Lr0/g;->u:F

    iget-object v0, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setElevation(F)Z

    return-void
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lr0/g;->l:I

    return v0
.end method

.method public r()F
    .locals 1

    iget v0, p0, Lr0/g;->y:F

    return v0
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lr0/g;->E:Z

    return-void
.end method

.method public t()Lo0/Z1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Lr0/g;->z:F

    return v0
.end method

.method public v()F
    .locals 1

    iget v0, p0, Lr0/g;->t:F

    return v0
.end method

.method public w(J)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, Lr0/g;->v:J

    sget-object v0, Lr0/S;->a:Lr0/S;

    iget-object v1, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lr0/S;->c(Landroid/view/RenderNode;I)V

    :cond_0
    return-void
.end method

.method public x()F
    .locals 1

    iget v0, p0, Lr0/g;->A:F

    return v0
.end method

.method public y(Landroid/graphics/Outline;J)V
    .locals 0

    .prologue
    iput-wide p2, p0, Lr0/g;->j:J

    iget-object p2, p0, Lr0/g;->e:Landroid/view/RenderNode;

    invoke-virtual {p2, p1}, Landroid/view/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lr0/g;->i:Z

    invoke-direct {p0}, Lr0/g;->O()V

    return-void
.end method

.method public z()F
    .locals 1

    iget v0, p0, Lr0/g;->s:F

    return v0
.end method
