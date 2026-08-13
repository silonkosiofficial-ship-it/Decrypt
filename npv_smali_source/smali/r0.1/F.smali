.class public final Lr0/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr0/F$b;
    }
.end annotation


# static fields
.field public static final J:Lr0/F$b;

.field private static final K:Z

.field private static final L:Landroid/graphics/Canvas;


# instance fields
.field private A:F

.field private B:F

.field private C:F

.field private D:F

.field private E:J

.field private F:J

.field private G:F

.field private H:F

.field private I:F

.field private final b:Ls0/a;

.field private final c:J

.field private final d:Lo0/r0;

.field private final e:Lr0/V;

.field private final f:Landroid/content/res/Resources;

.field private final g:Landroid/graphics/Rect;

.field private h:Landroid/graphics/Paint;

.field private final i:Landroid/graphics/Picture;

.field private final j:Lq0/a;

.field private final k:Lo0/r0;

.field private l:I

.field private m:I

.field private n:J

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private final s:J

.field private t:I

.field private u:Lo0/z0;

.field private v:I

.field private w:F

.field private x:Z

.field private y:J

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr0/F$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr0/F$b;-><init>(Ly7/k;)V

    sput-object v0, Lr0/F;->J:Lr0/F$b;

    sget-object v0, Lr0/U;->a:Lr0/U;

    invoke-virtual {v0}, Lr0/U;->a()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Lr0/F;->K:Z

    new-instance v0, Lr0/F$a;

    invoke-direct {v0}, Lr0/F$a;-><init>()V

    sput-object v0, Lr0/F;->L:Landroid/graphics/Canvas;

    return-void
.end method

.method public constructor <init>(Ls0/a;JLo0/r0;Lq0/a;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/F;->b:Ls0/a;

    iput-wide p2, p0, Lr0/F;->c:J

    iput-object p4, p0, Lr0/F;->d:Lo0/r0;

    new-instance p2, Lr0/V;

    invoke-direct {p2, p1, p4, p5}, Lr0/V;-><init>(Landroid/view/View;Lo0/r0;Lq0/a;)V

    iput-object p2, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    iput-object p3, p0, Lr0/F;->f:Landroid/content/res/Resources;

    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lr0/F;->g:Landroid/graphics/Rect;

    sget-boolean p3, Lr0/F;->K:Z

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    new-instance p5, Landroid/graphics/Picture;

    invoke-direct {p5}, Landroid/graphics/Picture;-><init>()V

    goto :goto_0

    :cond_0
    move-object p5, p4

    :goto_0
    iput-object p5, p0, Lr0/F;->i:Landroid/graphics/Picture;

    if-eqz p3, :cond_1

    new-instance p5, Lq0/a;

    invoke-direct {p5}, Lq0/a;-><init>()V

    goto :goto_1

    :cond_1
    move-object p5, p4

    :goto_1
    iput-object p5, p0, Lr0/F;->j:Lq0/a;

    if-eqz p3, :cond_2

    new-instance p3, Lo0/r0;

    invoke-direct {p3}, Lo0/r0;-><init>()V

    goto :goto_2

    :cond_2
    move-object p3, p4

    :goto_2
    iput-object p3, p0, Lr0/F;->k:Lo0/r0;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, p4}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    sget-object p1, LY0/t;->b:LY0/t$a;

    invoke-virtual {p1}, LY0/t$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lr0/F;->n:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr0/F;->p:Z

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Lr0/F;->s:J

    sget-object p1, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {p1}, Lo0/f0$a;->B()I

    move-result p1

    iput p1, p0, Lr0/F;->t:I

    sget-object p1, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {p1}, Lr0/b$a;->a()I

    move-result p1

    iput p1, p0, Lr0/F;->v:I

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lr0/F;->w:F

    sget-object p2, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {p2}, Ln0/g$a;->c()J

    move-result-wide p2

    iput-wide p2, p0, Lr0/F;->y:J

    iput p1, p0, Lr0/F;->z:F

    iput p1, p0, Lr0/F;->A:F

    sget-object p1, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {p1}, Lo0/y0$a;->a()J

    move-result-wide p2

    iput-wide p2, p0, Lr0/F;->E:J

    invoke-virtual {p1}, Lo0/y0$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lr0/F;->F:J

    return-void
.end method

.method public synthetic constructor <init>(Ls0/a;JLo0/r0;Lq0/a;ILy7/k;)V
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

    invoke-direct/range {v0 .. v5}, Lr0/F;-><init>(Ls0/a;JLo0/r0;Lq0/a;)V

    return-void
.end method

.method private final O(I)V
    .locals 4

    .prologue
    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    sget-object v1, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v1}, Lr0/b$a;->c()I

    move-result v2

    invoke-static {p1, v2}, Lr0/b;->e(II)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget-object p1, p0, Lr0/F;->e:Lr0/V;

    const/4 v1, 0x2

    :goto_0
    iget-object v2, p0, Lr0/F;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lr0/b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lr0/b;->e(II)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lr0/F;->e:Lr0/V;

    iget-object v2, p0, Lr0/F;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    move v3, v1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lr0/F;->e:Lr0/V;

    goto :goto_0

    :goto_1
    invoke-virtual {v0, v3}, Lr0/V;->setCanUseCompositingLayer$ui_graphics_release(Z)V

    return-void
.end method

.method private final Q()V
    .locals 7

    .prologue
    :try_start_0
    iget-object v0, p0, Lr0/F;->d:Lo0/r0;

    sget-object v1, Lr0/F;->L:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v2

    invoke-virtual {v2}, Lo0/G;->a()Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v3

    invoke-virtual {v3, v1}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v1

    iget-object v3, p0, Lr0/F;->b:Ls0/a;

    iget-object v4, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v4}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v5

    invoke-virtual {v3, v1, v4, v5, v6}, Ls0/a;->a(Lo0/q0;Landroid/view/View;J)V

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo0/G;->w(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private final R()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lr0/F;->C()I

    move-result v0

    sget-object v1, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v1}, Lr0/b$a;->c()I

    move-result v1

    invoke-static {v0, v1}, Lr0/b;->e(II)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lr0/F;->S()Z

    move-result v0

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

.method private final S()Z
    .locals 2

    .prologue
    invoke-virtual {p0}, Lr0/F;->q()I

    move-result v0

    sget-object v1, Lo0/f0;->a:Lo0/f0$a;

    invoke-virtual {v1}, Lo0/f0$a;->B()I

    move-result v1

    invoke-static {v0, v1}, Lo0/f0;->E(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lr0/F;->f()Lo0/z0;

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
    .locals 3

    .prologue
    iget-boolean v0, p0, Lr0/F;->o:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {p0}, Lr0/F;->P()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lr0/F;->q:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lr0/F;->g:Landroid/graphics/Rect;

    const/4 v2, 0x0

    iput v2, v1, Landroid/graphics/Rect;->left:I

    iput v2, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    iput v2, v1, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method private final U()V
    .locals 1

    .prologue
    invoke-direct {p0}, Lr0/F;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lr0/b;->a:Lr0/b$a;

    invoke-virtual {v0}, Lr0/b$a;->c()I

    move-result v0

    :goto_0
    invoke-direct {p0, v0}, Lr0/F;->O(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lr0/F;->C()I

    move-result v0

    goto :goto_0

    :goto_1
    return-void
.end method


# virtual methods
.method public A(Z)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Lr0/F;->q:Z

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iput-boolean v2, p0, Lr0/F;->r:Z

    iput-boolean v1, p0, Lr0/F;->o:Z

    iget-object v2, p0, Lr0/F;->e:Lr0/V;

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lr0/F;->q:Z

    if-eqz p1, :cond_1

    move v0, v1

    :cond_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setClipToOutline(Z)V

    return-void
.end method

.method public B()F
    .locals 1

    iget v0, p0, Lr0/F;->G:F

    return v0
.end method

.method public C()I
    .locals 1

    iget v0, p0, Lr0/F;->v:I

    return v0
.end method

.method public D(J)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, Lr0/F;->F:J

    sget-object v0, Lr0/Z;->a:Lr0/Z;

    iget-object v1, p0, Lr0/F;->e:Lr0/V;

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lr0/Z;->c(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lr0/F;->A:F

    return v0
.end method

.method public F(IIJ)V
    .locals 3

    .prologue
    iget-wide v0, p0, Lr0/F;->n:J

    invoke-static {v0, v1, p3, p4}, LY0/t;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lr0/F;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr0/F;->o:Z

    :cond_0
    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result v1

    add-int/2addr v1, p1

    invoke-static {p3, p4}, LY0/t;->f(J)I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {v0, p1, p2, v1, v2}, Landroid/view/View;->layout(IIII)V

    iput-wide p3, p0, Lr0/F;->n:J

    iget-boolean v0, p0, Lr0/F;->x:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-static {p3, p4}, LY0/t;->g(J)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-static {p3, p4}, LY0/t;->f(J)I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p3, v2

    invoke-virtual {v0, p3}, Landroid/view/View;->setPivotY(F)V

    goto :goto_0

    :cond_1
    iget p3, p0, Lr0/F;->l:I

    if-eq p3, p1, :cond_2

    iget-object p4, p0, Lr0/F;->e:Lr0/V;

    sub-int p3, p1, p3

    invoke-virtual {p4, p3}, Landroid/view/View;->offsetLeftAndRight(I)V

    :cond_2
    iget p3, p0, Lr0/F;->m:I

    if-eq p3, p2, :cond_3

    iget-object p4, p0, Lr0/F;->e:Lr0/V;

    sub-int p3, p2, p3

    invoke-virtual {p4, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    :cond_3
    :goto_0
    iput p1, p0, Lr0/F;->l:I

    iput p2, p0, Lr0/F;->m:I

    return-void
.end method

.method public G(J)V
    .locals 3

    .prologue
    iput-wide p1, p0, Lr0/F;->y:J

    invoke-static {p1, p2}, Ln0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-lt p1, p2, :cond_0

    sget-object p1, Lr0/Z;->a:Lr0/Z;

    iget-object p2, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {p1, p2}, Lr0/Z;->a(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lr0/F;->x:Z

    iget-object p1, p0, Lr0/F;->e:Lr0/V;

    iget-wide v0, p0, Lr0/F;->n:J

    invoke-static {v0, v1}, LY0/t;->g(J)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/View;->setPivotX(F)V

    iget-object p1, p0, Lr0/F;->e:Lr0/V;

    iget-wide v1, p0, Lr0/F;->n:J

    invoke-static {v1, v2}, LY0/t;->f(J)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/View;->setPivotY(F)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lr0/F;->x:Z

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setPivotY(F)V

    :goto_0
    return-void
.end method

.method public H()J
    .locals 2

    iget-wide v0, p0, Lr0/F;->E:J

    return-wide v0
.end method

.method public I(LY0/e;LY0/v;Lr0/c;Lx7/l;)V
    .locals 16

    .prologue
    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    iget-object v4, v1, Lr0/F;->e:Lr0/V;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-nez v4, :cond_0

    iget-object v4, v1, Lr0/F;->b:Ls0/a;

    iget-object v5, v1, Lr0/F;->e:Lr0/V;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    iget-object v4, v1, Lr0/F;->e:Lr0/V;

    move-object/from16 v5, p3

    invoke-virtual {v4, v0, v2, v5, v3}, Lr0/V;->b(LY0/e;LY0/v;Lr0/c;Lx7/l;)V

    iget-object v4, v1, Lr0/F;->e:Lr0/V;

    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v1, Lr0/F;->e:Lr0/V;

    const/4 v5, 0x4

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v4, v1, Lr0/F;->e:Lr0/V;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-direct/range {p0 .. p0}, Lr0/F;->Q()V

    iget-object v4, v1, Lr0/F;->i:Landroid/graphics/Picture;

    if-eqz v4, :cond_3

    iget-wide v5, v1, Lr0/F;->n:J

    invoke-static {v5, v6}, LY0/t;->g(J)I

    move-result v5

    iget-wide v6, v1, Lr0/F;->n:J

    invoke-static {v6, v7}, LY0/t;->f(J)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v5

    :try_start_0
    iget-object v6, v1, Lr0/F;->k:Lo0/r0;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lo0/r0;->a()Lo0/G;

    move-result-object v7

    invoke-virtual {v7}, Lo0/G;->a()Landroid/graphics/Canvas;

    move-result-object v7

    invoke-virtual {v6}, Lo0/r0;->a()Lo0/G;

    move-result-object v8

    invoke-virtual {v8, v5}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    invoke-virtual {v6}, Lo0/r0;->a()Lo0/G;

    move-result-object v5

    iget-object v8, v1, Lr0/F;->j:Lq0/a;

    if-eqz v8, :cond_1

    iget-wide v9, v1, Lr0/F;->n:J

    invoke-static {v9, v10}, LY0/u;->d(J)J

    move-result-wide v9

    invoke-virtual {v8}, Lq0/a;->H()Lq0/a$a;

    move-result-object v11

    invoke-virtual {v11}, Lq0/a$a;->a()LY0/e;

    move-result-object v12

    invoke-virtual {v11}, Lq0/a$a;->b()LY0/v;

    move-result-object v13

    invoke-virtual {v11}, Lq0/a$a;->c()Lo0/q0;

    move-result-object v14

    move-object/from16 p3, v6

    move-object v15, v7

    invoke-virtual {v11}, Lq0/a$a;->d()J

    move-result-wide v6

    invoke-virtual {v8}, Lq0/a;->H()Lq0/a$a;

    move-result-object v11

    invoke-virtual {v11, v0}, Lq0/a$a;->j(LY0/e;)V

    invoke-virtual {v11, v2}, Lq0/a$a;->k(LY0/v;)V

    invoke-virtual {v11, v5}, Lq0/a$a;->i(Lo0/q0;)V

    invoke-virtual {v11, v9, v10}, Lq0/a$a;->l(J)V

    invoke-interface {v5}, Lo0/q0;->m()V

    invoke-interface {v3, v8}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5}, Lo0/q0;->s()V

    invoke-virtual {v8}, Lq0/a;->H()Lq0/a$a;

    move-result-object v0

    invoke-virtual {v0, v12}, Lq0/a$a;->j(LY0/e;)V

    invoke-virtual {v0, v13}, Lq0/a$a;->k(LY0/v;)V

    invoke-virtual {v0, v14}, Lq0/a$a;->i(Lo0/q0;)V

    invoke-virtual {v0, v6, v7}, Lq0/a$a;->l(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object/from16 p3, v6

    move-object v15, v7

    :goto_0
    invoke-virtual/range {p3 .. p3}, Lo0/r0;->a()Lo0/G;

    move-result-object v0

    move-object v2, v15

    invoke-virtual {v0, v2}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    sget-object v0, Li7/M;->a:Li7/M;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v4}, Landroid/graphics/Picture;->endRecording()V

    goto :goto_2

    :goto_1
    invoke-virtual {v4}, Landroid/graphics/Picture;->endRecording()V

    throw v0

    :cond_3
    :goto_2
    return-void
.end method

.method public J()J
    .locals 2

    iget-wide v0, p0, Lr0/F;->F:J

    return-wide v0
.end method

.method public K(I)V
    .locals 0

    iput p1, p0, Lr0/F;->v:I

    invoke-direct {p0}, Lr0/F;->U()V

    return-void
.end method

.method public L()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public M()F
    .locals 1

    iget v0, p0, Lr0/F;->D:F

    return v0
.end method

.method public N(Lo0/q0;)V
    .locals 4

    .prologue
    invoke-direct {p0}, Lr0/F;->T()V

    invoke-static {p1}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lr0/F;->b:Ls0/a;

    iget-object v1, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v1}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1, v2, v3}, Ls0/a;->a(Lo0/q0;Landroid/view/View;J)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lr0/F;->i:Landroid/graphics/Picture;

    if-eqz p1, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public P()Z
    .locals 1

    .prologue
    iget-boolean v0, p0, Lr0/F;->r:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

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

.method public a()F
    .locals 1

    iget v0, p0, Lr0/F;->w:F

    return v0
.end method

.method public b(F)V
    .locals 1

    iput p1, p0, Lr0/F;->w:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public c(F)V
    .locals 1

    iput p1, p0, Lr0/F;->H:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationY(F)V

    return-void
.end method

.method public d(F)V
    .locals 1

    iput p1, p0, Lr0/F;->I:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

.method public e(F)V
    .locals 1

    iput p1, p0, Lr0/F;->C:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public f()Lo0/z0;
    .locals 1

    iget-object v0, p0, Lr0/F;->u:Lo0/z0;

    return-object v0
.end method

.method public g(F)V
    .locals 1

    iput p1, p0, Lr0/F;->A:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public h(F)V
    .locals 1

    iput p1, p0, Lr0/F;->z:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Lr0/F;->b:Ls0/a;

    iget-object v1, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public j(F)V
    .locals 1

    iput p1, p0, Lr0/F;->B:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method public synthetic k()Z
    .locals 1

    invoke-static {p0}, Lr0/d;->a(Lr0/e;)Z

    move-result v0

    return v0
.end method

.method public l(Lo0/Z1;)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, Lr0/b0;->a:Lr0/b0;

    iget-object v1, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, v1, p1}, Lr0/b0;->a(Landroid/view/View;Lo0/Z1;)V

    :cond_0
    return-void
.end method

.method public m(F)V
    .locals 2

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    iget-object v1, p0, Lr0/F;->f:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setCameraDistance(F)V

    return-void
.end method

.method public n(F)V
    .locals 1

    iput p1, p0, Lr0/F;->G:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationX(F)V

    return-void
.end method

.method public o()F
    .locals 1

    iget v0, p0, Lr0/F;->z:F

    return v0
.end method

.method public p(F)V
    .locals 1

    iput p1, p0, Lr0/F;->D:F

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lr0/F;->t:I

    return v0
.end method

.method public r()F
    .locals 1

    iget v0, p0, Lr0/F;->H:F

    return v0
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lr0/F;->p:Z

    return-void
.end method

.method public t()Lo0/Z1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Lr0/F;->I:F

    return v0
.end method

.method public v()F
    .locals 1

    iget v0, p0, Lr0/F;->C:F

    return v0
.end method

.method public w(J)V
    .locals 2

    .prologue
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, Lr0/F;->E:J

    sget-object v0, Lr0/Z;->a:Lr0/Z;

    iget-object v1, p0, Lr0/F;->e:Lr0/V;

    invoke-static {p1, p2}, Lo0/A0;->k(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lr0/Z;->b(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public x()F
    .locals 2

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0}, Landroid/view/View;->getCameraDistance()F

    move-result v0

    iget-object v1, p0, Lr0/F;->f:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public y(Landroid/graphics/Outline;J)V
    .locals 2

    .prologue
    iget-object p2, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {p2, p1}, Lr0/V;->c(Landroid/graphics/Outline;)Z

    move-result p2

    const/4 p3, 0x1

    xor-int/2addr p2, p3

    invoke-virtual {p0}, Lr0/F;->P()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    iget-object v0, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {v0, p3}, Landroid/view/View;->setClipToOutline(Z)V

    iget-boolean v0, p0, Lr0/F;->r:Z

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lr0/F;->r:Z

    iput-boolean p3, p0, Lr0/F;->o:Z

    :cond_0
    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    move p3, v1

    :goto_0
    iput-boolean p3, p0, Lr0/F;->q:Z

    if-eqz p2, :cond_2

    iget-object p1, p0, Lr0/F;->e:Lr0/V;

    invoke-virtual {p1}, Lr0/V;->invalidate()V

    invoke-direct {p0}, Lr0/F;->Q()V

    :cond_2
    return-void
.end method

.method public z()F
    .locals 1

    iget v0, p0, Lr0/F;->B:F

    return v0
.end method
