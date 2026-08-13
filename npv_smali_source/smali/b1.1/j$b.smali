.class final Lb1/j$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/j;->e(LD0/X$a;LD0/X;Lj1/h;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lj1/h;


# direct methods
.method constructor <init>(Lj1/h;)V
    .locals 0

    iput-object p1, p0, Lb1/j$b;->D:Lj1/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/graphics/c;)V
    .locals 3

    .prologue
    const-string v0, "$this$null"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->f()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->g()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->f()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->f()F

    move-result v0

    :goto_0
    iget-object v2, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v2}, Lj1/h;->g()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v1}, Lj1/h;->g()F

    move-result v1

    :goto_1
    invoke-static {v0, v1}, Lo0/m2;->a(FF)J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/c;->T0(J)V

    :cond_3
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->h()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->h()F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->n(F)V

    :cond_4
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->i()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->i()F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->c(F)V

    :cond_5
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->j()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->j()F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->d(F)V

    :cond_6
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->n()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->n()F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->j(F)V

    :cond_7
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->o()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->o()F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->e(F)V

    :cond_8
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->p()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->p()F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->p(F)V

    :cond_9
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->k()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->l()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_a
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->k()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_b

    move v0, v1

    goto :goto_2

    :cond_b
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->k()F

    move-result v0

    :goto_2
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->h(F)V

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->l()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    :cond_c
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->l()F

    move-result v1

    :goto_3
    invoke-interface {p1, v1}, Landroidx/compose/ui/graphics/c;->g(F)V

    :cond_d
    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->c()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lb1/j$b;->D:Lj1/h;

    invoke-virtual {v0}, Lj1/h;->c()F

    move-result v0

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->b(F)V

    :cond_e
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, Lb1/j$b;->a(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
