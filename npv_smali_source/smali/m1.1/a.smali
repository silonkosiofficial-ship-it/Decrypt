.class public final Lm1/a;
.super Lm1/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/a$a;
    }
.end annotation


# static fields
.field public static final M0:Lm1/a$a;

.field public static final N0:I


# instance fields
.field private I0:I

.field private J0:Z

.field private K0:I

.field private L0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm1/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm1/a$a;-><init>(Ly7/k;)V

    sput-object v0, Lm1/a;->M0:Lm1/a$a;

    const/16 v0, 0x8

    sput v0, Lm1/a;->N0:I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lm1/j;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lm1/a;->J0:Z

    return-void
.end method


# virtual methods
.method public Q0()Z
    .locals 1

    iget-boolean v0, p0, Lm1/a;->L0:Z

    return v0
.end method

.method public R0()Z
    .locals 1

    iget-boolean v0, p0, Lm1/a;->L0:Z

    return v0
.end method

.method public d(Le1/d;Z)V
    .locals 13

    .prologue
    const-string p2, "system"

    invoke-static {p1, p2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object p2

    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p2, v1

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object p2

    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v0

    const/4 v2, 0x2

    aput-object v0, p2, v2

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object p2

    invoke-virtual {p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    const/4 v3, 0x1

    aput-object v0, p2, v3

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object p2

    invoke-virtual {p0}, Lm1/e;->G()Lm1/d;

    move-result-object v0

    const/4 v4, 0x3

    aput-object v0, p2, v4

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object p2

    array-length p2, p2

    move v0, v1

    :goto_0
    if-ge v0, p2, :cond_0

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object v5

    aget-object v5, v5, v0

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object v6

    aget-object v6, v6, v0

    invoke-virtual {p1, v6}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v6

    invoke-virtual {v5, v6}, Lm1/d;->B(Le1/i;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget p2, p0, Lm1/a;->I0:I

    if-ltz p2, :cond_20

    const/4 v0, 0x4

    if-ge p2, v0, :cond_20

    invoke-virtual {p0}, Lm1/e;->M()[Lm1/d;

    move-result-object p2

    iget v5, p0, Lm1/a;->I0:I

    aget-object p2, p2, v5

    iget-boolean v5, p0, Lm1/a;->L0:Z

    if-nez v5, :cond_1

    invoke-virtual {p0}, Lm1/a;->f2()Z

    :cond_1
    iget-boolean v5, p0, Lm1/a;->L0:Z

    if-eqz v5, :cond_6

    iput-boolean v1, p0, Lm1/a;->L0:Z

    iget p2, p0, Lm1/a;->I0:I

    if-eqz p2, :cond_4

    if-ne p2, v3, :cond_2

    goto :goto_2

    :cond_2
    if-eq p2, v2, :cond_3

    if-ne p2, v4, :cond_5

    :cond_3
    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->h0()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Le1/d;->j(Le1/i;I)V

    invoke-virtual {p0}, Lm1/e;->G()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->h0()I

    move-result v0

    :goto_1
    invoke-virtual {p1, p2, v0}, Le1/d;->j(Le1/i;I)V

    goto :goto_3

    :cond_4
    :goto_2
    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->g0()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Le1/d;->j(Le1/i;I)V

    invoke-virtual {p0}, Lm1/e;->b0()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->g0()I

    move-result v0

    goto :goto_1

    :cond_5
    :goto_3
    return-void

    :cond_6
    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v5

    move v6, v1

    :goto_4
    if-ge v6, v5, :cond_c

    invoke-virtual {p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v7

    aget-object v7, v7, v6

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v8, p0, Lm1/a;->J0:Z

    if-nez v8, :cond_7

    invoke-virtual {v7}, Lm1/e;->e()Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_6

    :cond_7
    iget v8, p0, Lm1/a;->I0:I

    if-eqz v8, :cond_8

    if-ne v8, v3, :cond_9

    :cond_8
    invoke-virtual {v7}, Lm1/e;->A()Lm1/e$b;

    move-result-object v8

    sget-object v9, Lm1/e$b;->E:Lm1/e$b;

    if-ne v8, v9, :cond_9

    invoke-virtual {v7}, Lm1/e;->L()Lm1/d;

    move-result-object v8

    invoke-virtual {v8}, Lm1/d;->i()Lm1/d;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v7}, Lm1/e;->b0()Lm1/d;

    move-result-object v8

    invoke-virtual {v8}, Lm1/d;->i()Lm1/d;

    move-result-object v8

    if-eqz v8, :cond_9

    :goto_5
    move v5, v3

    goto :goto_7

    :cond_9
    iget v8, p0, Lm1/a;->I0:I

    if-eq v8, v2, :cond_a

    if-ne v8, v4, :cond_b

    :cond_a
    invoke-virtual {v7}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v8

    sget-object v9, Lm1/e$b;->E:Lm1/e$b;

    if-ne v8, v9, :cond_b

    invoke-virtual {v7}, Lm1/e;->c0()Lm1/d;

    move-result-object v8

    invoke-virtual {v8}, Lm1/d;->i()Lm1/d;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v7}, Lm1/e;->G()Lm1/d;

    move-result-object v7

    invoke-virtual {v7}, Lm1/d;->i()Lm1/d;

    move-result-object v7

    if-eqz v7, :cond_b

    goto :goto_5

    :cond_b
    :goto_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_c
    move v5, v1

    :goto_7
    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object v6

    invoke-virtual {v6}, Lm1/d;->q()Z

    move-result v6

    if-nez v6, :cond_e

    invoke-virtual {p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v6

    invoke-virtual {v6}, Lm1/d;->q()Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_8

    :cond_d
    move v6, v1

    goto :goto_9

    :cond_e
    :goto_8
    move v6, v3

    :goto_9
    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v7

    invoke-virtual {v7}, Lm1/d;->q()Z

    move-result v7

    if-nez v7, :cond_10

    invoke-virtual {p0}, Lm1/e;->G()Lm1/d;

    move-result-object v7

    invoke-virtual {v7}, Lm1/d;->q()Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_a

    :cond_f
    move v7, v1

    goto :goto_b

    :cond_10
    :goto_a
    move v7, v3

    :goto_b
    if-nez v5, :cond_15

    iget v8, p0, Lm1/a;->I0:I

    if-nez v8, :cond_11

    if-nez v6, :cond_14

    :cond_11
    if-ne v8, v2, :cond_12

    if-nez v7, :cond_14

    :cond_12
    if-ne v8, v3, :cond_13

    if-nez v6, :cond_14

    :cond_13
    if-ne v8, v4, :cond_15

    if-eqz v7, :cond_15

    :cond_14
    move v6, v3

    goto :goto_c

    :cond_15
    move v6, v1

    :goto_c
    if-nez v6, :cond_16

    move v6, v0

    goto :goto_d

    :cond_16
    const/4 v6, 0x5

    :goto_d
    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v7

    move v8, v1

    :goto_e
    if-ge v8, v7, :cond_1b

    invoke-virtual {p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v9

    aget-object v9, v9, v8

    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v10, p0, Lm1/a;->J0:Z

    if-nez v10, :cond_17

    invoke-virtual {v9}, Lm1/e;->e()Z

    move-result v10

    if-nez v10, :cond_17

    goto/16 :goto_12

    :cond_17
    invoke-virtual {v9}, Lm1/e;->M()[Lm1/d;

    move-result-object v10

    iget v11, p0, Lm1/a;->I0:I

    aget-object v10, v10, v11

    invoke-virtual {p1, v10}, Le1/d;->u(Ljava/lang/Object;)Le1/i;

    move-result-object v10

    invoke-virtual {v9}, Lm1/e;->M()[Lm1/d;

    move-result-object v11

    iget v12, p0, Lm1/a;->I0:I

    aget-object v11, v11, v12

    invoke-virtual {v11, v10}, Lm1/d;->B(Le1/i;)V

    invoke-virtual {v9}, Lm1/e;->M()[Lm1/d;

    move-result-object v11

    iget v12, p0, Lm1/a;->I0:I

    aget-object v11, v11, v12

    invoke-virtual {v11}, Lm1/d;->i()Lm1/d;

    move-result-object v11

    if-eqz v11, :cond_18

    invoke-virtual {v9}, Lm1/e;->M()[Lm1/d;

    move-result-object v11

    iget v12, p0, Lm1/a;->I0:I

    aget-object v11, v11, v12

    invoke-virtual {v11}, Lm1/d;->i()Lm1/d;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v11}, Lm1/d;->g()Lm1/e;

    move-result-object v11

    invoke-static {v11, p0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-virtual {v9}, Lm1/e;->M()[Lm1/d;

    move-result-object v9

    iget v11, p0, Lm1/a;->I0:I

    aget-object v9, v9, v11

    invoke-virtual {v9}, Lm1/d;->f()I

    move-result v9

    goto :goto_f

    :cond_18
    move v9, v1

    :goto_f
    iget v11, p0, Lm1/a;->I0:I

    if-eqz v11, :cond_1a

    if-ne v11, v2, :cond_19

    goto :goto_10

    :cond_19
    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v12, p0, Lm1/a;->K0:I

    add-int/2addr v12, v9

    invoke-virtual {p1, v11, v10, v12, v5}, Le1/d;->k(Le1/i;Le1/i;IZ)V

    goto :goto_11

    :cond_1a
    :goto_10
    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v12, p0, Lm1/a;->K0:I

    sub-int/2addr v12, v9

    invoke-virtual {p1, v11, v10, v12, v5}, Le1/d;->m(Le1/i;Le1/i;IZ)V

    :goto_11
    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object v11

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    iget v12, p0, Lm1/a;->K0:I

    add-int/2addr v12, v9

    invoke-virtual {p1, v11, v10, v12, v6}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    :goto_12
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_e

    :cond_1b
    iget p2, p0, Lm1/a;->I0:I

    const/16 v5, 0x8

    if-eqz p2, :cond_1f

    if-eq p2, v3, :cond_1e

    if-eq p2, v2, :cond_1d

    if-eq p2, v4, :cond_1c

    goto/16 :goto_14

    :cond_1c
    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v2, v1, v5}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v2, v1, v0}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->G()Lm1/d;

    move-result-object v0

    :goto_13
    invoke-virtual {v0}, Lm1/d;->h()Le1/i;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v0, v1, v1}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    goto/16 :goto_14

    :cond_1d
    invoke-virtual {p0}, Lm1/e;->G()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v2, v1, v5}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->G()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v2, v1, v0}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    invoke-virtual {p0}, Lm1/e;->c0()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->c0()Lm1/d;

    move-result-object v0

    goto :goto_13

    :cond_1e
    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->b0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v2, v1, v5}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->L()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v2, v1, v0}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    goto/16 :goto_13

    :cond_1f
    invoke-virtual {p0}, Lm1/e;->b0()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v2, v1, v5}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lm1/e;->b0()Lm1/d;

    move-result-object v2

    invoke-virtual {v2}, Lm1/d;->h()Le1/i;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2, v2, v1, v0}, Le1/d;->i(Le1/i;Le1/i;II)Le1/b;

    invoke-virtual {p0}, Lm1/e;->L()Lm1/d;

    move-result-object p2

    invoke-virtual {p2}, Lm1/d;->h()Le1/i;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lm1/e;->o0()Lm1/e;

    move-result-object v0

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    goto/16 :goto_13

    :cond_20
    :goto_14
    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final f2()Z
    .locals 9

    .prologue
    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    move v4, v1

    move v3, v2

    :goto_0
    const/4 v5, 0x3

    const/4 v6, 0x2

    if-ge v3, v0, :cond_5

    invoke-virtual {p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v7

    aget-object v7, v7, v3

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v8, p0, Lm1/a;->J0:Z

    if-nez v8, :cond_0

    invoke-virtual {v7}, Lm1/e;->e()Z

    move-result v8

    if-nez v8, :cond_0

    goto :goto_2

    :cond_0
    iget v8, p0, Lm1/a;->I0:I

    if-eqz v8, :cond_1

    if-ne v8, v1, :cond_2

    :cond_1
    invoke-virtual {v7}, Lm1/e;->Q0()Z

    move-result v8

    if-nez v8, :cond_2

    :goto_1
    move v4, v2

    goto :goto_2

    :cond_2
    iget v8, p0, Lm1/a;->I0:I

    if-eq v8, v6, :cond_3

    if-ne v8, v5, :cond_4

    :cond_3
    invoke-virtual {v7}, Lm1/e;->R0()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-eqz v4, :cond_13

    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v0

    if-lez v0, :cond_13

    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v0

    move v3, v2

    move v4, v3

    :goto_3
    if-ge v2, v0, :cond_10

    invoke-virtual {p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v7

    aget-object v7, v7, v2

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v8, p0, Lm1/a;->J0:Z

    if-nez v8, :cond_6

    invoke-virtual {v7}, Lm1/e;->e()Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_8

    :cond_6
    if-nez v4, :cond_b

    iget v4, p0, Lm1/a;->I0:I

    if-eqz v4, :cond_a

    if-eq v4, v1, :cond_9

    if-eq v4, v6, :cond_8

    if-eq v4, v5, :cond_7

    goto :goto_5

    :cond_7
    sget-object v3, Lm1/d$b;->G:Lm1/d$b;

    :goto_4
    invoke-virtual {v7, v3}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/d;->e()I

    move-result v3

    goto :goto_5

    :cond_8
    sget-object v3, Lm1/d$b;->E:Lm1/d$b;

    goto :goto_4

    :cond_9
    sget-object v3, Lm1/d$b;->F:Lm1/d$b;

    goto :goto_4

    :cond_a
    sget-object v3, Lm1/d$b;->D:Lm1/d$b;

    goto :goto_4

    :goto_5
    move v4, v1

    :cond_b
    iget v8, p0, Lm1/a;->I0:I

    if-eqz v8, :cond_f

    if-eq v8, v1, :cond_e

    if-eq v8, v6, :cond_d

    if-eq v8, v5, :cond_c

    goto :goto_8

    :cond_c
    sget-object v8, Lm1/d$b;->G:Lm1/d$b;

    :goto_6
    invoke-virtual {v7, v8}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/d;->e()I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->max(II)I

    move-result v3

    goto :goto_8

    :cond_d
    sget-object v8, Lm1/d$b;->E:Lm1/d$b;

    :goto_7
    invoke-virtual {v7, v8}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v7}, Lm1/d;->e()I

    move-result v7

    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v3

    goto :goto_8

    :cond_e
    sget-object v8, Lm1/d$b;->F:Lm1/d$b;

    goto :goto_6

    :cond_f
    sget-object v8, Lm1/d$b;->D:Lm1/d$b;

    goto :goto_7

    :goto_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_10
    iget v0, p0, Lm1/a;->K0:I

    add-int/2addr v3, v0

    iget v0, p0, Lm1/a;->I0:I

    if-eqz v0, :cond_12

    if-ne v0, v1, :cond_11

    goto :goto_9

    :cond_11
    invoke-virtual {p0, v3, v3}, Lm1/e;->j1(II)V

    goto :goto_a

    :cond_12
    :goto_9
    invoke-virtual {p0, v3, v3}, Lm1/e;->g1(II)V

    :goto_a
    iput-boolean v1, p0, Lm1/a;->L0:Z

    return v1

    :cond_13
    return v2
.end method

.method public final g2()Z
    .locals 1

    iget-boolean v0, p0, Lm1/a;->J0:Z

    return v0
.end method

.method public final h2()I
    .locals 1

    iget v0, p0, Lm1/a;->I0:I

    return v0
.end method

.method public final i2()I
    .locals 1

    iget v0, p0, Lm1/a;->K0:I

    return v0
.end method

.method public final j2()I
    .locals 3

    .prologue
    iget v0, p0, Lm1/a;->I0:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/4 v2, 0x3

    if-eq v0, v2, :cond_0

    const/4 v0, -0x1

    return v0

    :cond_0
    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final k2()V
    .locals 7

    .prologue
    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    invoke-virtual {p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    iget-boolean v4, p0, Lm1/a;->J0:Z

    if-nez v4, :cond_0

    invoke-virtual {v3}, Lm1/e;->e()Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    iget v4, p0, Lm1/a;->I0:I

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    if-ne v4, v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v6, 0x2

    if-eq v4, v6, :cond_2

    const/4 v6, 0x3

    if-ne v4, v6, :cond_4

    :cond_2
    invoke-virtual {v3, v5, v5}, Lm1/e;->v1(IZ)V

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v3, v1, v5}, Lm1/e;->v1(IZ)V

    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-void
.end method

.method public final l2(I)V
    .locals 0

    iput p1, p0, Lm1/a;->I0:I

    return-void
.end method

.method public final m2(I)V
    .locals 0

    iput p1, p0, Lm1/a;->K0:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    invoke-virtual {p0}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "[Barrier] "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " {"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lm1/j;->e2()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0}, Lm1/j;->d2()[Lm1/e;

    move-result-object v3

    aget-object v3, v3, v2

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    if-lez v2, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-virtual {v3}, Lm1/e;->q()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
