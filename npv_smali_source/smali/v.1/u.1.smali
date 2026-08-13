.class final Lv/u;
.super Landroidx/compose/ui/platform/H0;
.source "SourceFile"

# interfaces
.implements Ll0/g;


# instance fields
.field private final c:Lv/a;

.field private final d:Lv/w;

.field private e:Landroid/graphics/RenderNode;


# direct methods
.method public constructor <init>(Lv/a;Lv/w;Lx7/l;)V
    .locals 0

    invoke-direct {p0, p3}, Landroidx/compose/ui/platform/H0;-><init>(Lx7/l;)V

    iput-object p1, p0, Lv/u;->c:Lv/a;

    iput-object p2, p0, Lv/u;->d:Lv/w;

    return-void
.end method

.method private final g(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    const/high16 v0, 0x43340000    # 180.0f

    invoke-direct {p0, v0, p1, p2}, Lv/u;->n(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final j(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    const/high16 v0, 0x43870000    # 270.0f

    invoke-direct {p0, v0, p1, p2}, Lv/u;->n(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final l(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    const/high16 v0, 0x42b40000    # 90.0f

    invoke-direct {p0, v0, p1, p2}, Lv/u;->n(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final m(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lv/u;->n(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final n(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    .prologue
    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p3}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p3, p1}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-virtual {p2, p3}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p1

    invoke-virtual {p3, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p1
.end method

.method private final o()Landroid/graphics/RenderNode;
    .locals 1

    .prologue
    iget-object v0, p0, Lv/u;->e:Landroid/graphics/RenderNode;

    if-nez v0, :cond_0

    const-string v0, "AndroidEdgeEffectOverscrollEffect"

    invoke-static {v0}, Lv/p;->a(Ljava/lang/String;)Landroid/graphics/RenderNode;

    move-result-object v0

    iput-object v0, p0, Lv/u;->e:Landroid/graphics/RenderNode;

    :cond_0
    return-object v0
.end method

.method private final p()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lv/u;->d:Lv/w;

    invoke-virtual {v0}, Lv/w;->r()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lv/w;->s()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lv/w;->u()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lv/w;->v()Z

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

.method private final q()Z
    .locals 2

    .prologue
    iget-object v0, p0, Lv/u;->d:Lv/w;

    invoke-virtual {v0}, Lv/w;->y()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lv/w;->z()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lv/w;->o()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lv/w;->p()Z

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


# virtual methods
.method public synthetic b(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;
    .locals 0

    invoke-static {p0, p1}, Lh0/f;->a(Landroidx/compose/ui/d;Landroidx/compose/ui/d;)Landroidx/compose/ui/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c(Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lh0/g;->b(Landroidx/compose/ui/d$b;Ljava/lang/Object;Lx7/p;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic d(Lx7/l;)Z
    .locals 0

    invoke-static {p0, p1}, Lh0/g;->a(Landroidx/compose/ui/d$b;Lx7/l;)Z

    move-result p1

    return p1
.end method

.method public y(Lq0/c;)V
    .locals 14

    .prologue
    iget-object v0, p0, Lv/u;->c:Lv/a;

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lv/a;->r(J)V

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->k(J)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lq0/c;->l1()V

    return-void

    :cond_0
    iget-object v0, p0, Lv/u;->c:Lv/a;

    invoke-virtual {v0}, Lv/a;->j()LV/w0;

    move-result-object v0

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    invoke-static {}, Lv/l;->b()F

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->B0(F)F

    move-result v0

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v1

    invoke-interface {v1}, Lq0/d;->h()Lo0/q0;

    move-result-object v1

    invoke-static {v1}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object v1

    iget-object v2, p0, Lv/u;->d:Lv/w;

    invoke-direct {p0}, Lv/u;->q()Z

    move-result v3

    invoke-direct {p0}, Lv/u;->p()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    if-eqz v4, :cond_1

    invoke-direct {p0}, Lv/u;->o()Landroid/graphics/RenderNode;

    move-result-object v6

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v7

    :goto_0
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v8

    :goto_1
    invoke-static {v6, v5, v5, v7, v8}, Lv/q;->a(Landroid/graphics/RenderNode;IIII)Z

    goto :goto_2

    :cond_1
    if-eqz v3, :cond_2

    invoke-direct {p0}, Lv/u;->o()Landroid/graphics/RenderNode;

    move-result-object v6

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v7

    invoke-static {v0}, LA7/a;->d(F)I

    move-result v8

    mul-int/lit8 v8, v8, 0x2

    add-int/2addr v7, v8

    goto :goto_0

    :cond_2
    if-eqz v4, :cond_16

    invoke-direct {p0}, Lv/u;->o()Landroid/graphics/RenderNode;

    move-result-object v6

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v7

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v8

    invoke-static {v0}, LA7/a;->d(F)I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    add-int/2addr v8, v9

    goto :goto_1

    :goto_2
    invoke-direct {p0}, Lv/u;->o()Landroid/graphics/RenderNode;

    move-result-object v6

    invoke-static {v6}, Lv/r;->a(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    move-result-object v6

    invoke-virtual {v2}, Lv/w;->s()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v2}, Lv/w;->i()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-direct {p0, v7, v6}, Lv/u;->l(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v7}, Landroid/widget/EdgeEffect;->finish()V

    :cond_3
    invoke-virtual {v2}, Lv/w;->r()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_4

    invoke-virtual {v2}, Lv/w;->h()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-direct {p0, v7, v6}, Lv/u;->j(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v9

    invoke-virtual {v2}, Lv/w;->t()Z

    move-result v10

    if-eqz v10, :cond_5

    iget-object v10, p0, Lv/u;->c:Lv/a;

    invoke-virtual {v10}, Lv/a;->i()J

    move-result-wide v10

    invoke-static {v10, v11}, Ln0/g;->n(J)F

    move-result v10

    sget-object v11, Lv/v;->a:Lv/v;

    invoke-virtual {v2}, Lv/w;->i()Landroid/widget/EdgeEffect;

    move-result-object v12

    invoke-virtual {v11, v7}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v7

    int-to-float v13, v8

    sub-float/2addr v13, v10

    invoke-virtual {v11, v12, v7, v13}, Lv/v;->d(Landroid/widget/EdgeEffect;FF)F

    goto :goto_3

    :cond_4
    move v9, v5

    :cond_5
    :goto_3
    invoke-virtual {v2}, Lv/w;->z()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-virtual {v2}, Lv/w;->m()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-direct {p0, v7, v6}, Lv/u;->g(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v7}, Landroid/widget/EdgeEffect;->finish()V

    :cond_6
    invoke-virtual {v2}, Lv/w;->y()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v2}, Lv/w;->l()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-direct {p0, v7, v6}, Lv/u;->m(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v10

    if-nez v10, :cond_8

    if-eqz v9, :cond_7

    goto :goto_4

    :cond_7
    move v9, v5

    goto :goto_5

    :cond_8
    :goto_4
    move v9, v8

    :goto_5
    invoke-virtual {v2}, Lv/w;->A()Z

    move-result v10

    if-eqz v10, :cond_9

    iget-object v10, p0, Lv/u;->c:Lv/a;

    invoke-virtual {v10}, Lv/a;->i()J

    move-result-wide v10

    invoke-static {v10, v11}, Ln0/g;->m(J)F

    move-result v10

    sget-object v11, Lv/v;->a:Lv/v;

    invoke-virtual {v2}, Lv/w;->m()Landroid/widget/EdgeEffect;

    move-result-object v12

    invoke-virtual {v11, v7}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v7

    invoke-virtual {v11, v12, v7, v10}, Lv/v;->d(Landroid/widget/EdgeEffect;FF)F

    :cond_9
    invoke-virtual {v2}, Lv/w;->v()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v2}, Lv/w;->k()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-direct {p0, v7, v6}, Lv/u;->j(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v7}, Landroid/widget/EdgeEffect;->finish()V

    :cond_a
    invoke-virtual {v2}, Lv/w;->u()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-virtual {v2}, Lv/w;->j()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-direct {p0, v7, v6}, Lv/u;->l(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v10

    if-nez v10, :cond_c

    if-eqz v9, :cond_b

    goto :goto_6

    :cond_b
    move v9, v5

    goto :goto_7

    :cond_c
    :goto_6
    move v9, v8

    :goto_7
    invoke-virtual {v2}, Lv/w;->w()Z

    move-result v10

    if-eqz v10, :cond_d

    iget-object v10, p0, Lv/u;->c:Lv/a;

    invoke-virtual {v10}, Lv/a;->i()J

    move-result-wide v10

    invoke-static {v10, v11}, Ln0/g;->n(J)F

    move-result v10

    sget-object v11, Lv/v;->a:Lv/v;

    invoke-virtual {v2}, Lv/w;->k()Landroid/widget/EdgeEffect;

    move-result-object v12

    invoke-virtual {v11, v7}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v7

    invoke-virtual {v11, v12, v7, v10}, Lv/v;->d(Landroid/widget/EdgeEffect;FF)F

    :cond_d
    invoke-virtual {v2}, Lv/w;->p()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-virtual {v2}, Lv/w;->g()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-direct {p0, v7, v6}, Lv/u;->m(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    invoke-virtual {v7}, Landroid/widget/EdgeEffect;->finish()V

    :cond_e
    invoke-virtual {v2}, Lv/w;->o()Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-virtual {v2}, Lv/w;->f()Landroid/widget/EdgeEffect;

    move-result-object v7

    invoke-direct {p0, v7, v6}, Lv/u;->g(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v10

    if-nez v10, :cond_f

    if-eqz v9, :cond_10

    :cond_f
    move v5, v8

    :cond_10
    invoke-virtual {v2}, Lv/w;->q()Z

    move-result v9

    if-eqz v9, :cond_11

    iget-object v9, p0, Lv/u;->c:Lv/a;

    invoke-virtual {v9}, Lv/a;->i()J

    move-result-wide v9

    invoke-static {v9, v10}, Ln0/g;->m(J)F

    move-result v9

    sget-object v10, Lv/v;->a:Lv/v;

    invoke-virtual {v2}, Lv/w;->g()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-virtual {v10, v7}, Lv/v;->b(Landroid/widget/EdgeEffect;)F

    move-result v7

    int-to-float v8, v8

    sub-float/2addr v8, v9

    invoke-virtual {v10, v2, v7, v8}, Lv/v;->d(Landroid/widget/EdgeEffect;FF)F

    :cond_11
    move v9, v5

    :cond_12
    if-eqz v9, :cond_13

    iget-object v2, p0, Lv/u;->c:Lv/a;

    invoke-virtual {v2}, Lv/a;->k()V

    :cond_13
    const/4 v2, 0x0

    if-eqz v4, :cond_14

    move v4, v2

    goto :goto_8

    :cond_14
    move v4, v0

    :goto_8
    if-eqz v3, :cond_15

    move v0, v2

    :cond_15
    invoke-interface {p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-static {v6}, Lo0/H;->b(Landroid/graphics/Canvas;)Lo0/q0;

    move-result-object v3

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v5

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v7

    invoke-interface {v7}, Lq0/d;->getDensity()LY0/e;

    move-result-object v7

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v8

    invoke-interface {v8}, Lq0/d;->getLayoutDirection()LY0/v;

    move-result-object v8

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v9

    invoke-interface {v9}, Lq0/d;->h()Lo0/q0;

    move-result-object v9

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v10

    invoke-interface {v10}, Lq0/d;->i()J

    move-result-wide v10

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v12

    invoke-interface {v12}, Lq0/d;->f()Lr0/c;

    move-result-object v12

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v13

    invoke-interface {v13, p1}, Lq0/d;->a(LY0/e;)V

    invoke-interface {v13, v2}, Lq0/d;->b(LY0/v;)V

    invoke-interface {v13, v3}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {v13, v5, v6}, Lq0/d;->d(J)V

    const/4 v2, 0x0

    invoke-interface {v13, v2}, Lq0/d;->e(Lr0/c;)V

    invoke-interface {v3}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v2

    invoke-interface {v2}, Lq0/d;->c()Lq0/j;

    move-result-object v2

    invoke-interface {v2, v4, v0}, Lq0/j;->d(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p1}, Lq0/c;->l1()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v2

    invoke-interface {v2}, Lq0/d;->c()Lq0/j;

    move-result-object v2

    neg-float v4, v4

    neg-float v0, v0

    invoke-interface {v2, v4, v0}, Lq0/j;->d(FF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v3}, Lo0/q0;->s()V

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p1

    invoke-interface {p1, v7}, Lq0/d;->a(LY0/e;)V

    invoke-interface {p1, v8}, Lq0/d;->b(LY0/v;)V

    invoke-interface {p1, v9}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {p1, v10, v11}, Lq0/d;->d(J)V

    invoke-interface {p1, v12}, Lq0/d;->e(Lr0/c;)V

    invoke-direct {p0}, Lv/u;->o()Landroid/graphics/RenderNode;

    move-result-object p1

    invoke-static {p1}, Lv/s;->a(Landroid/graphics/RenderNode;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    move-result p1

    invoke-virtual {v1, v4, v0}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-direct {p0}, Lv/u;->o()Landroid/graphics/RenderNode;

    move-result-object v0

    invoke-static {v1, v0}, Lv/t;->a(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    invoke-virtual {v1, p1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_9

    :catchall_1
    move-exception v1

    :try_start_3
    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v2

    invoke-interface {v2}, Lq0/d;->c()Lq0/j;

    move-result-object v2

    neg-float v4, v4

    neg-float v0, v0

    invoke-interface {v2, v4, v0}, Lq0/j;->d(FF)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_9
    invoke-interface {v3}, Lo0/q0;->s()V

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object p1

    invoke-interface {p1, v7}, Lq0/d;->a(LY0/e;)V

    invoke-interface {p1, v8}, Lq0/d;->b(LY0/v;)V

    invoke-interface {p1, v9}, Lq0/d;->g(Lo0/q0;)V

    invoke-interface {p1, v10, v11}, Lq0/d;->d(J)V

    invoke-interface {p1, v12}, Lq0/d;->e(Lr0/c;)V

    throw v0

    :cond_16
    invoke-interface {p1}, Lq0/c;->l1()V

    return-void
.end method
