.class final Lv/o;
.super Landroidx/compose/ui/platform/H0;
.source "SourceFile"

# interfaces
.implements Ll0/g;


# instance fields
.field private final c:Lv/a;

.field private final d:Lv/w;

.field private final e:Lv/Q;


# direct methods
.method public constructor <init>(Lv/a;Lv/w;Lv/Q;Lx7/l;)V
    .locals 0

    invoke-direct {p0, p4}, Landroidx/compose/ui/platform/H0;-><init>(Lx7/l;)V

    iput-object p1, p0, Lv/o;->c:Lv/a;

    iput-object p2, p0, Lv/o;->d:Lv/w;

    iput-object p3, p0, Lv/o;->e:Lv/Q;

    return-void
.end method

.method private final g(Lq0/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 8

    iget-object v0, p0, Lv/o;->e:Lv/Q;

    invoke-virtual {v0}, Lv/Q;->a()LA/B;

    move-result-object v0

    invoke-interface {v0}, LA/B;->c()F

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->B0(F)F

    move-result v0

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ln0/m;->i(J)F

    move-result v1

    neg-float v1, v1

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v2

    invoke-static {v2, v3}, Ln0/m;->g(J)F

    move-result p1

    neg-float p1, p1

    add-float/2addr p1, v0

    invoke-static {v1, p1}, Ln0/h;->a(FF)J

    move-result-wide v4

    const/high16 v3, 0x43340000    # 180.0f

    move-object v2, p0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v7}, Lv/o;->n(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final j(Lq0/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 7

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->g(J)F

    move-result v0

    neg-float v0, v0

    iget-object v1, p0, Lv/o;->e:Lv/Q;

    invoke-virtual {v1}, Lv/Q;->a()LA/B;

    move-result-object v1

    invoke-interface {p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-interface {v1, v2}, LA/B;->a(LY0/v;)F

    move-result v1

    invoke-interface {p1, v1}, LY0/e;->B0(F)F

    move-result p1

    invoke-static {v0, p1}, Ln0/h;->a(FF)J

    move-result-wide v3

    const/high16 v2, 0x43870000    # 270.0f

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lv/o;->n(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final l(Lq0/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 7

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->i(J)F

    move-result v0

    invoke-static {v0}, LA7/a;->d(F)I

    move-result v0

    iget-object v1, p0, Lv/o;->e:Lv/Q;

    invoke-virtual {v1}, Lv/Q;->a()LA/B;

    move-result-object v1

    invoke-interface {p1}, Lq0/g;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-interface {v1, v2}, LA/B;->b(LY0/v;)F

    move-result v1

    int-to-float v0, v0

    neg-float v0, v0

    invoke-interface {p1, v1}, LY0/e;->B0(F)F

    move-result p1

    add-float/2addr v0, p1

    const/4 p1, 0x0

    invoke-static {p1, v0}, Ln0/h;->a(FF)J

    move-result-wide v3

    const/high16 v2, 0x42b40000    # 90.0f

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lv/o;->n(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final m(Lq0/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 7

    iget-object v0, p0, Lv/o;->e:Lv/Q;

    invoke-virtual {v0}, Lv/Q;->a()LA/B;

    move-result-object v0

    invoke-interface {v0}, LA/B;->d()F

    move-result v0

    invoke-interface {p1, v0}, LY0/e;->B0(F)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ln0/h;->a(FF)J

    move-result-wide v3

    const/4 v2, 0x0

    move-object v1, p0

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lv/o;->n(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    return p1
.end method

.method private final n(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    invoke-virtual {p5}, Landroid/graphics/Canvas;->save()I

    move-result v0

    invoke-virtual {p5, p1}, Landroid/graphics/Canvas;->rotate(F)V

    invoke-static {p2, p3}, Ln0/g;->m(J)F

    move-result p1

    invoke-static {p2, p3}, Ln0/g;->n(J)F

    move-result p2

    invoke-virtual {p5, p1, p2}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p4, p5}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result p1

    invoke-virtual {p5, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return p1
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
    .locals 6

    .prologue
    iget-object v0, p0, Lv/o;->c:Lv/a;

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lv/a;->r(J)V

    invoke-interface {p1}, Lq0/g;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/m;->k(J)Z

    move-result v0

    invoke-interface {p1}, Lq0/c;->l1()V

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lv/o;->c:Lv/a;

    invoke-virtual {v0}, Lv/a;->j()LV/w0;

    move-result-object v0

    invoke-interface {v0}, LV/w0;->getValue()Ljava/lang/Object;

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v0

    invoke-interface {v0}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-static {v0}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object v0

    iget-object v1, p0, Lv/o;->d:Lv/w;

    invoke-virtual {v1}, Lv/w;->r()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lv/w;->h()Landroid/widget/EdgeEffect;

    move-result-object v2

    invoke-direct {p0, p1, v2, v0}, Lv/o;->j(Lq0/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v2

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-virtual {v1}, Lv/w;->y()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_4

    invoke-virtual {v1}, Lv/w;->l()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-direct {p0, p1, v4, v0}, Lv/o;->m(Lq0/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v4

    if-nez v4, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v5

    :cond_4
    :goto_2
    invoke-virtual {v1}, Lv/w;->u()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {v1}, Lv/w;->j()Landroid/widget/EdgeEffect;

    move-result-object v4

    invoke-direct {p0, p1, v4, v0}, Lv/o;->l(Lq0/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result v4

    if-nez v4, :cond_6

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    move v2, v3

    goto :goto_4

    :cond_6
    :goto_3
    move v2, v5

    :cond_7
    :goto_4
    invoke-virtual {v1}, Lv/w;->o()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v1}, Lv/w;->f()Landroid/widget/EdgeEffect;

    move-result-object v1

    invoke-direct {p0, p1, v1, v0}, Lv/o;->g(Lq0/g;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    move-result p1

    if-nez p1, :cond_8

    if-eqz v2, :cond_9

    :cond_8
    move v3, v5

    :cond_9
    move v2, v3

    :cond_a
    if-eqz v2, :cond_b

    iget-object p1, p0, Lv/o;->c:Lv/a;

    invoke-virtual {p1}, Lv/a;->k()V

    :cond_b
    return-void
.end method
