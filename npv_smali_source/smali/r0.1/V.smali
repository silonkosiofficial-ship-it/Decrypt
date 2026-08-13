.class public final Lr0/V;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr0/V$b;
    }
.end annotation


# static fields
.field public static final M:Lr0/V$b;

.field private static final N:Landroid/view/ViewOutlineProvider;


# instance fields
.field private final C:Landroid/view/View;

.field private final D:Lo0/r0;

.field private final E:Lq0/a;

.field private F:Z

.field private G:Landroid/graphics/Outline;

.field private H:Z

.field private I:LY0/e;

.field private J:LY0/v;

.field private K:Lx7/l;

.field private L:Lr0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lr0/V$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lr0/V$b;-><init>(Ly7/k;)V

    sput-object v0, Lr0/V;->M:Lr0/V$b;

    new-instance v0, Lr0/V$a;

    invoke-direct {v0}, Lr0/V$a;-><init>()V

    sput-object v0, Lr0/V;->N:Landroid/view/ViewOutlineProvider;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lo0/r0;Lq0/a;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lr0/V;->C:Landroid/view/View;

    iput-object p2, p0, Lr0/V;->D:Lo0/r0;

    iput-object p3, p0, Lr0/V;->E:Lq0/a;

    sget-object p1, Lr0/V;->N:Landroid/view/ViewOutlineProvider;

    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lr0/V;->H:Z

    invoke-static {}, Lq0/e;->a()LY0/e;

    move-result-object p1

    iput-object p1, p0, Lr0/V;->I:LY0/e;

    sget-object p1, LY0/v;->C:LY0/v;

    iput-object p1, p0, Lr0/V;->J:LY0/v;

    sget-object p1, Lr0/e;->a:Lr0/e$a;

    invoke-virtual {p1}, Lr0/e$a;->a()Lx7/l;

    move-result-object p1

    iput-object p1, p0, Lr0/V;->K:Lx7/l;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public static final synthetic a(Lr0/V;)Landroid/graphics/Outline;
    .locals 0

    iget-object p0, p0, Lr0/V;->G:Landroid/graphics/Outline;

    return-object p0
.end method


# virtual methods
.method public final b(LY0/e;LY0/v;Lr0/c;Lx7/l;)V
    .locals 0

    iput-object p1, p0, Lr0/V;->I:LY0/e;

    iput-object p2, p0, Lr0/V;->J:LY0/v;

    iput-object p4, p0, Lr0/V;->K:Lx7/l;

    iput-object p3, p0, Lr0/V;->L:Lr0/c;

    return-void
.end method

.method public final c(Landroid/graphics/Outline;)Z
    .locals 0

    iput-object p1, p0, Lr0/V;->G:Landroid/graphics/Outline;

    sget-object p1, Lr0/L;->a:Lr0/L;

    invoke-virtual {p1, p0}, Lr0/L;->a(Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 17

    .prologue
    move-object/from16 v1, p0

    iget-object v0, v1, Lr0/V;->D:Lo0/r0;

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v2

    invoke-virtual {v2}, Lo0/G;->a()Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v3

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v3

    iget-object v4, v1, Lr0/V;->E:Lq0/a;

    iget-object v5, v1, Lr0/V;->I:LY0/e;

    iget-object v6, v1, Lr0/V;->J:LY0/v;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    invoke-static {v7, v8}, Ln0/n;->a(FF)J

    move-result-wide v7

    iget-object v9, v1, Lr0/V;->L:Lr0/c;

    iget-object v10, v1, Lr0/V;->K:Lx7/l;

    invoke-interface {v4}, Lq0/g;->F0()Lq0/d;

    move-result-object v11

    invoke-interface {v11}, Lq0/d;->getDensity()LY0/e;

    move-result-object v11

    invoke-interface {v4}, Lq0/g;->F0()Lq0/d;

    move-result-object v12

    invoke-interface {v12}, Lq0/d;->getLayoutDirection()LY0/v;

    move-result-object v12

    invoke-interface {v4}, Lq0/g;->F0()Lq0/d;

    move-result-object v13

    invoke-interface {v13}, Lq0/d;->h()Lo0/q0;

    move-result-object v13

    invoke-interface {v4}, Lq0/g;->F0()Lq0/d;

    move-result-object v14

    invoke-interface {v14}, Lq0/d;->i()J

    move-result-wide v14

    invoke-interface {v4}, Lq0/g;->F0()Lq0/d;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Lq0/d;->f()Lr0/c;

    move-result-object v1

    move-object/from16 v16, v2

    invoke-interface {v4}, Lq0/g;->F0()Lq0/d;

    move-result-object v2

    invoke-interface {v2, v5}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v2, v6}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v2, v3}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v2, v7, v8}, Lq0/d;->d(J)V

    invoke-interface {v2, v9}, Lq0/d;->e(Lr0/c;)V

    invoke-interface {v3}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v10, v4}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3}, Lo0/q0;->s()V

    invoke-interface {v4}, Lq0/g;->F0()Lq0/d;

    move-result-object v2

    invoke-interface {v2, v11}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v2, v12}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v2, v13}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v2, v14, v15}, Lq0/d;->d(J)V

    invoke-interface {v2, v1}, Lq0/d;->e(Lr0/c;)V

    invoke-virtual {v0}, Lo0/r0;->a()Lo0/G;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lo0/G;->w(Landroid/graphics/Canvas;)V

    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lr0/V;->F:Z

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v1

    move-object/from16 v1, p0

    move-object v5, v0

    invoke-interface {v3}, Lo0/q0;->s()V

    invoke-interface {v4}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0, v11}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v0, v12}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v0, v13}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v0, v14, v15}, Lq0/d;->d(J)V

    invoke-interface {v0, v2}, Lq0/d;->e(Lr0/c;)V

    throw v5
.end method

.method public forceLayout()V
    .locals 0

    return-void
.end method

.method public final getCanUseCompositingLayer$ui_graphics_release()Z
    .locals 1

    iget-boolean v0, p0, Lr0/V;->H:Z

    return v0
.end method

.method public final getCanvasHolder()Lo0/r0;
    .locals 1

    iget-object v0, p0, Lr0/V;->D:Lo0/r0;

    return-object v0
.end method

.method public final getOwnerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lr0/V;->C:Landroid/view/View;

    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    iget-boolean v0, p0, Lr0/V;->H:Z

    return v0
.end method

.method public invalidate()V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lr0/V;->F:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr0/V;->F:Z

    invoke-super {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final setCanUseCompositingLayer$ui_graphics_release(Z)V
    .locals 1

    .prologue
    iget-boolean v0, p0, Lr0/V;->H:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lr0/V;->H:Z

    invoke-virtual {p0}, Lr0/V;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setInvalidated(Z)V
    .locals 0

    iput-boolean p1, p0, Lr0/V;->F:Z

    return-void
.end method
