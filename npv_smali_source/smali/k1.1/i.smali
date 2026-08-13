.class public final Lk1/i;
.super Lk1/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk1/i$a;
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj1/g;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/g$e;->C:Lj1/g$e;

    invoke-direct {p0, p1, v0}, Lk1/d;-><init>(Lj1/g;Lj1/g$e;)V

    return-void
.end method


# virtual methods
.method public apply()V
    .locals 9

    .prologue
    invoke-virtual {p0}, Lj1/e;->X0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0}, Lj1/e;->W0()Lj1/g;

    move-result-object v2

    invoke-virtual {v2, v1}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lj1/a;->t()Lj1/a;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj1/e;->X0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0}, Lj1/e;->W0()Lj1/g;

    move-result-object v5

    invoke-virtual {v5, v3}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v5

    if-nez v2, :cond_5

    invoke-virtual {p0}, Lj1/a;->Y()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj1/a;->Y()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lj1/a;->J0(Ljava/lang/Object;)Lj1/a;

    move-result-object v2

    :goto_2
    invoke-virtual {p0}, Lj1/a;->R()I

    move-result v4

    invoke-virtual {v2, v4}, Lj1/a;->i0(I)Lj1/a;

    move-result-object v2

    invoke-virtual {p0}, Lj1/a;->S()I

    move-result v4

    :goto_3
    invoke-virtual {v2, v4}, Lj1/a;->k0(I)Lj1/a;

    goto/16 :goto_5

    :cond_1
    invoke-virtual {p0}, Lj1/a;->X()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj1/a;->X()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lj1/a;->I0(Ljava/lang/Object;)Lj1/a;

    move-result-object v2

    goto :goto_2

    :cond_2
    invoke-virtual {p0}, Lj1/a;->H()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lj1/a;->H()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lj1/a;->J0(Ljava/lang/Object;)Lj1/a;

    move-result-object v2

    :goto_4
    invoke-virtual {p0}, Lj1/a;->N()I

    move-result v4

    invoke-virtual {v2, v4}, Lj1/a;->i0(I)Lj1/a;

    move-result-object v2

    invoke-virtual {p0}, Lj1/a;->O()I

    move-result v4

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lj1/a;->I()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lj1/a;->I()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lj1/a;->I0(Ljava/lang/Object;)Lj1/a;

    move-result-object v2

    goto :goto_4

    :cond_4
    invoke-virtual {v5}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v5, v4}, Lj1/a;->J0(Ljava/lang/Object;)Lj1/a;

    move-result-object v4

    invoke-virtual {p0, v2}, Lk1/d;->g1(Ljava/lang/String;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v4, v6}, Lj1/a;->j0(Ljava/lang/Object;)Lj1/a;

    move-result-object v4

    invoke-virtual {p0, v2}, Lk1/d;->f1(Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v4, v2}, Lj1/a;->l0(Ljava/lang/Object;)Lj1/a;

    :goto_5
    move-object v2, v5

    :cond_5
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v7}, Lj1/a;->z(Ljava/lang/Object;)Lj1/a;

    move-result-object v7

    invoke-virtual {p0, v4}, Lk1/d;->e1(Ljava/lang/String;)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v7, v8}, Lj1/a;->j0(Ljava/lang/Object;)Lj1/a;

    move-result-object v7

    invoke-virtual {p0, v4}, Lk1/d;->d1(Ljava/lang/String;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v7, v4}, Lj1/a;->l0(Ljava/lang/Object;)Lj1/a;

    invoke-virtual {v1}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v1}, Lj1/a;->I0(Ljava/lang/Object;)Lj1/a;

    move-result-object v1

    invoke-virtual {p0, v6}, Lk1/d;->g1(Ljava/lang/String;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v1, v4}, Lj1/a;->j0(Ljava/lang/Object;)Lj1/a;

    move-result-object v1

    invoke-virtual {p0, v6}, Lk1/d;->f1(Ljava/lang/String;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v1, v4}, Lj1/a;->l0(Ljava/lang/Object;)Lj1/a;

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lk1/d;->h1(Ljava/lang/String;)F

    move-result v1

    const/high16 v3, -0x40800000    # -1.0f

    cmpg-float v3, v1, v3

    if-nez v3, :cond_7

    goto :goto_6

    :cond_7
    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5, v1}, Lj1/a;->z0(F)V

    :goto_6
    move-object v1, v5

    goto/16 :goto_1

    :cond_8
    if-eqz v1, :cond_d

    invoke-virtual {p0}, Lj1/a;->F()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {p0}, Lj1/a;->F()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lj1/a;->z(Ljava/lang/Object;)Lj1/a;

    move-result-object v0

    :goto_7
    invoke-virtual {p0}, Lj1/a;->L()I

    move-result v1

    invoke-virtual {v0, v1}, Lj1/a;->i0(I)Lj1/a;

    move-result-object v0

    invoke-virtual {p0}, Lj1/a;->M()I

    move-result v1

    :goto_8
    invoke-virtual {v0, v1}, Lj1/a;->k0(I)Lj1/a;

    goto :goto_a

    :cond_9
    invoke-virtual {p0}, Lj1/a;->E()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p0}, Lj1/a;->E()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lj1/a;->y(Ljava/lang/Object;)Lj1/a;

    move-result-object v0

    goto :goto_7

    :cond_a
    invoke-virtual {p0}, Lj1/a;->V()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lj1/a;->V()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lj1/a;->z(Ljava/lang/Object;)Lj1/a;

    move-result-object v0

    :goto_9
    invoke-virtual {p0}, Lj1/a;->P()I

    move-result v1

    invoke-virtual {v0, v1}, Lj1/a;->i0(I)Lj1/a;

    move-result-object v0

    invoke-virtual {p0}, Lj1/a;->Q()I

    move-result v1

    goto :goto_8

    :cond_b
    invoke-virtual {p0}, Lj1/a;->W()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {p0}, Lj1/a;->W()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Lj1/a;->y(Ljava/lang/Object;)Lj1/a;

    move-result-object v0

    goto :goto_9

    :cond_c
    invoke-virtual {v1}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj1/a;->y(Ljava/lang/Object;)Lj1/a;

    move-result-object v1

    invoke-virtual {p0, v0}, Lk1/d;->e1(Ljava/lang/String;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Lj1/a;->j0(Ljava/lang/Object;)Lj1/a;

    move-result-object v1

    invoke-virtual {p0, v0}, Lk1/d;->d1(Ljava/lang/String;)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v1, v0}, Lj1/a;->l0(Ljava/lang/Object;)Lj1/a;

    :cond_d
    :goto_a
    if-nez v2, :cond_e

    return-void

    :cond_e
    invoke-virtual {p0}, Lk1/d;->b1()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    cmpg-float v0, v0, v1

    if-nez v0, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {p0}, Lk1/d;->b1()F

    move-result v0

    invoke-virtual {v2, v0}, Lj1/a;->e0(F)Lj1/a;

    :goto_b
    invoke-virtual {p0}, Lk1/d;->c1()Lj1/g$a;

    move-result-object v0

    sget-object v1, Lk1/i$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_12

    const/4 v3, 0x2

    if-eq v0, v3, :cond_11

    const/4 v1, 0x3

    if-eq v0, v1, :cond_10

    goto :goto_c

    :cond_10
    invoke-virtual {v2, v3}, Lj1/a;->y0(I)V

    goto :goto_c

    :cond_11
    invoke-virtual {v2, v1}, Lj1/a;->y0(I)V

    goto :goto_c

    :cond_12
    invoke-virtual {v2, v4}, Lj1/a;->y0(I)V

    :goto_c
    return-void
.end method
