.class public final Ln1/j;
.super Ln1/p;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lm1/e;)V
    .locals 1

    const-string v0, "widget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Ln1/p;-><init>(Lm1/e;)V

    invoke-virtual {p1}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/l;->f()V

    invoke-virtual {p1}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/n;->f()V

    check-cast p1, Lm1/h;

    invoke-virtual {p1}, Lm1/h;->b2()I

    move-result p1

    invoke-virtual {p0, p1}, Ln1/p;->C(I)V

    return-void
.end method

.method private final H(Ln1/f;)V
    .locals 1

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public D()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(Ln1/d;)V
    .locals 2

    .prologue
    const-string v0, "node"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->h()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->i()Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object p1

    invoke-virtual {p1}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ln1/f;

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {p1}, Ln1/f;->j()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0}, Lm1/h;->e2()F

    move-result v0

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0, p1}, Ln1/f;->k(I)V

    return-void
.end method

.method public d()V
    .locals 6

    .prologue
    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/h;->c2()I

    move-result v2

    invoke-virtual {v0}, Lm1/h;->d2()I

    move-result v3

    invoke-virtual {v0}, Lm1/h;->e2()F

    invoke-virtual {v0}, Lm1/h;->b2()I

    move-result v0

    const/4 v4, -0x1

    const/4 v5, 0x1

    if-ne v0, v5, :cond_2

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    if-eq v2, v4, :cond_0

    invoke-virtual {v0}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v3

    invoke-static {v3, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lm1/h;

    invoke-virtual {v3}, Lm1/e;->o0()Lm1/e;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/e;->K()Ln1/l;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ln1/p;->q()Ln1/f;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    :goto_0
    invoke-virtual {v0, v2}, Ln1/f;->m(I)V

    goto/16 :goto_1

    :cond_0
    if-eq v3, v4, :cond_1

    invoke-virtual {v0}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/h;

    invoke-virtual {v2}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->g()Ln1/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    neg-int v2, v3

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v5}, Ln1/f;->l(Z)V

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/h;

    invoke-virtual {v2}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->K()Ln1/l;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->g()Ln1/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-direct {p0, v0}, Ln1/j;->H(Ln1/f;)V

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->K()Ln1/l;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-direct {p0, v0}, Ln1/j;->H(Ln1/f;)V

    goto/16 :goto_5

    :cond_2
    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    if-eq v2, v4, :cond_3

    invoke-virtual {v0}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v3

    invoke-static {v3, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lm1/h;

    invoke-virtual {v3}, Lm1/e;->o0()Lm1/e;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/e;->e0()Ln1/n;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ln1/p;->q()Ln1/f;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    :goto_3
    invoke-virtual {v0, v2}, Ln1/f;->m(I)V

    goto/16 :goto_4

    :cond_3
    if-eq v3, v4, :cond_4

    invoke-virtual {v0}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/h;

    invoke-virtual {v2}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->g()Ln1/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    neg-int v2, v3

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v5}, Ln1/f;->l(Z)V

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->g()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v2

    invoke-static {v2, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/h;

    invoke-virtual {v2}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->e0()Ln1/n;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln1/p;->g()Ln1/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->g()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-direct {p0, v0}, Ln1/j;->H(Ln1/f;)V

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/e;->e0()Ln1/n;

    move-result-object v0

    goto/16 :goto_2

    :goto_5
    return-void
.end method

.method public e()V
    .locals 3

    .prologue
    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.Guideline"

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/h;->b2()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Lm1/e;->V1(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ln1/p;->n()Lm1/e;

    move-result-object v0

    invoke-static {v0, v1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lm1/h;

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Lm1/e;->W1(I)V

    :goto_0
    return-void
.end method

.method public f()V
    .locals 1

    invoke-virtual {p0}, Ln1/p;->q()Ln1/f;

    move-result-object v0

    invoke-virtual {v0}, Ln1/f;->c()V

    return-void
.end method
