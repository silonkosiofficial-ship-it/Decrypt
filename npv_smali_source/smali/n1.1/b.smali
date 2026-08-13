.class public final Ln1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/b$a;,
        Ln1/b$b;,
        Ln1/b$c;
    }
.end annotation


# static fields
.field public static final d:Ln1/b$a;

.field public static final e:I


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private final b:Ln1/b$b;

.field private c:Lm1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/b$a;-><init>(Ly7/k;)V

    sput-object v0, Ln1/b;->d:Ln1/b$a;

    const/16 v0, 0x8

    sput v0, Ln1/b;->e:I

    return-void
.end method

.method public constructor <init>(Lm1/f;)V
    .locals 1

    const-string v0, "constraintWidgetContainer"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln1/b;->a:Ljava/util/ArrayList;

    new-instance v0, Ln1/b$b;

    invoke-direct {v0}, Ln1/b$b;-><init>()V

    iput-object v0, p0, Ln1/b;->b:Ln1/b$b;

    iput-object p1, p0, Ln1/b;->c:Lm1/f;

    return-void
.end method

.method private final a(Ln1/b$c;Lm1/e;I)Z
    .locals 4

    .prologue
    iget-object v0, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p2}, Lm1/e;->A()Lm1/e$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/b$b;->n(Lm1/e$b;)V

    iget-object v0, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p2}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln1/b$b;->v(Lm1/e$b;)V

    iget-object v0, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p2}, Lm1/e;->B0()I

    move-result v1

    invoke-virtual {v0, v1}, Ln1/b$b;->o(I)V

    iget-object v0, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p2}, Lm1/e;->w()I

    move-result v1

    invoke-virtual {v0, v1}, Ln1/b$b;->w(I)V

    iget-object v0, p0, Ln1/b;->b:Ln1/b$b;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ln1/b$b;->t(Z)V

    iget-object v0, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {v0, p3}, Ln1/b$b;->p(I)V

    iget-object p3, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p3}, Ln1/b$b;->d()Lm1/e$b;

    move-result-object p3

    sget-object v0, Lm1/e$b;->E:Lm1/e$b;

    const/4 v2, 0x1

    if-ne p3, v0, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iget-object v3, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {v3}, Ln1/b$b;->l()Lm1/e$b;

    move-result-object v3

    if-ne v3, v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const/4 v3, 0x0

    if-eqz p3, :cond_2

    invoke-virtual {p2}, Lm1/e;->I()F

    move-result p3

    cmpl-float p3, p3, v3

    if-lez p3, :cond_2

    move p3, v2

    goto :goto_2

    :cond_2
    move p3, v1

    :goto_2
    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lm1/e;->I()F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    const/4 v3, 0x4

    if-eqz p3, :cond_4

    invoke-virtual {p2}, Lm1/e;->a0()[I

    move-result-object p3

    aget p3, p3, v1

    if-ne p3, v3, :cond_4

    iget-object p3, p0, Ln1/b;->b:Ln1/b$b;

    sget-object v1, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p3, v1}, Ln1/b$b;->n(Lm1/e$b;)V

    :cond_4
    if-eqz v0, :cond_5

    invoke-virtual {p2}, Lm1/e;->a0()[I

    move-result-object p3

    aget p3, p3, v2

    if-ne p3, v3, :cond_5

    iget-object p3, p0, Ln1/b;->b:Ln1/b$b;

    sget-object v0, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {p3, v0}, Ln1/b$b;->v(Lm1/e$b;)V

    :cond_5
    iget-object p3, p0, Ln1/b;->b:Ln1/b$b;

    invoke-interface {p1, p2, p3}, Ln1/b$c;->b(Lm1/e;Ln1/b$b;)V

    iget-object p1, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p1}, Ln1/b$b;->k()I

    move-result p1

    invoke-virtual {p2, p1}, Lm1/e;->U1(I)V

    iget-object p1, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p1}, Ln1/b$b;->i()I

    move-result p1

    invoke-virtual {p2, p1}, Lm1/e;->m1(I)V

    iget-object p1, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p1}, Ln1/b$b;->h()Z

    move-result p1

    invoke-virtual {p2, p1}, Lm1/e;->l1(Z)V

    iget-object p1, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p1}, Ln1/b$b;->g()I

    move-result p1

    invoke-virtual {p2, p1}, Lm1/e;->a1(I)V

    iget-object p1, p0, Ln1/b;->b:Ln1/b$b;

    sget-object p2, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {p2}, Ln1/b$b$a;->a()I

    move-result p2

    invoke-virtual {p1, p2}, Ln1/b$b;->p(I)V

    iget-object p1, p0, Ln1/b;->b:Ln1/b$b;

    invoke-virtual {p1}, Ln1/b$b;->j()Z

    move-result p1

    return p1
.end method

.method private final b(Lm1/f;)V
    .locals 12

    .prologue
    invoke-virtual {p1}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x40

    invoke-virtual {p1, v1}, Lm1/f;->L2(I)Z

    move-result v1

    invoke-virtual {p1}, Lm1/f;->E2()Ln1/b$c;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v0, :cond_a

    invoke-virtual {p1}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    const-string v6, "get(...)"

    invoke-static {v5, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lm1/e;

    instance-of v6, v5, Lm1/h;

    if-eqz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    instance-of v6, v5, Lm1/a;

    if-eqz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {v5}, Lm1/e;->O0()Z

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    if-eqz v1, :cond_3

    invoke-virtual {v5}, Lm1/e;->K()Ln1/l;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Lm1/e;->e0()Ln1/n;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Lm1/e;->K()Ln1/l;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ln1/p;->i()Ln1/g;

    move-result-object v6

    invoke-virtual {v6}, Ln1/f;->i()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Lm1/e;->e0()Ln1/n;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ln1/p;->i()Ln1/g;

    move-result-object v6

    invoke-virtual {v6}, Ln1/f;->i()Z

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {v5, v3}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v6

    const/4 v7, 0x1

    invoke-virtual {v5, v7}, Lm1/e;->r(I)Lm1/e$b;

    move-result-object v8

    sget-object v9, Lm1/e$b;->E:Lm1/e$b;

    if-ne v6, v9, :cond_4

    invoke-virtual {v5}, Lm1/e;->Q()I

    move-result v10

    if-eq v10, v7, :cond_4

    if-ne v8, v9, :cond_4

    invoke-virtual {v5}, Lm1/e;->P()I

    move-result v10

    if-eq v10, v7, :cond_4

    move v10, v7

    goto :goto_1

    :cond_4
    move v10, v3

    :goto_1
    if-nez v10, :cond_8

    invoke-virtual {p1, v7}, Lm1/f;->L2(I)Z

    move-result v11

    if-eqz v11, :cond_8

    instance-of v11, v5, Lm1/l;

    if-nez v11, :cond_8

    if-ne v6, v9, :cond_5

    invoke-virtual {v5}, Lm1/e;->Q()I

    move-result v11

    if-nez v11, :cond_5

    if-eq v8, v9, :cond_5

    invoke-virtual {v5}, Lm1/e;->M0()Z

    move-result v11

    if-nez v11, :cond_5

    move v10, v7

    :cond_5
    if-ne v8, v9, :cond_6

    invoke-virtual {v5}, Lm1/e;->P()I

    move-result v11

    if-nez v11, :cond_6

    if-eq v6, v9, :cond_6

    invoke-virtual {v5}, Lm1/e;->M0()Z

    move-result v11

    if-nez v11, :cond_6

    move v10, v7

    :cond_6
    if-eq v6, v9, :cond_7

    if-ne v8, v9, :cond_8

    :cond_7
    invoke-virtual {v5}, Lm1/e;->I()F

    move-result v6

    const/4 v8, 0x0

    cmpl-float v6, v6, v8

    if-lez v6, :cond_8

    goto :goto_2

    :cond_8
    move v7, v10

    :goto_2
    if-eqz v7, :cond_9

    goto :goto_3

    :cond_9
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v6, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v6}, Ln1/b$b$a;->a()I

    move-result v6

    invoke-direct {p0, v2, v5, v6}, Ln1/b;->a(Ln1/b$c;Lm1/e;I)Z

    invoke-virtual {p1}, Lm1/f;->z2()Le1/e;

    :goto_3
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_a
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {v2}, Ln1/b$c;->a()V

    return-void
.end method

.method private final c(Lm1/f;Ljava/lang/String;III)V
    .locals 2

    invoke-virtual {p1}, Lm1/f;->z2()Le1/e;

    invoke-virtual {p1}, Lm1/e;->m0()I

    move-result p2

    invoke-virtual {p1}, Lm1/e;->l0()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lm1/e;->H1(I)V

    invoke-virtual {p1, v1}, Lm1/e;->G1(I)V

    invoke-virtual {p1, p4}, Lm1/e;->U1(I)V

    invoke-virtual {p1, p5}, Lm1/e;->m1(I)V

    invoke-virtual {p1, p2}, Lm1/e;->H1(I)V

    invoke-virtual {p1, v0}, Lm1/e;->G1(I)V

    iget-object p2, p0, Ln1/b;->c:Lm1/f;

    invoke-virtual {p2, p3}, Lm1/f;->P2(I)V

    iget-object p2, p0, Ln1/b;->c:Lm1/f;

    invoke-virtual {p2}, Lm1/f;->e2()V

    invoke-virtual {p1}, Lm1/f;->z2()Le1/e;

    return-void
.end method


# virtual methods
.method public final d(Lm1/f;IIIIIIIII)J
    .locals 21

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p5

    move/from16 v4, p7

    const-string v5, "layout"

    invoke-static {v1, v5}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lm1/f;->E2()Ln1/b$c;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lm1/e;->B0()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lm1/e;->w()I

    move-result v8

    sget-object v9, Lm1/k;->a:Lm1/k$a;

    const/16 v10, 0x80

    invoke-virtual {v9, v2, v10}, Lm1/k$a;->b(II)Z

    move-result v10

    if-nez v10, :cond_1

    const/16 v13, 0x40

    invoke-virtual {v9, v2, v13}, Lm1/k$a;->b(II)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    :goto_1
    const-string v9, "get(...)"

    if-eqz v2, :cond_a

    const/4 v13, 0x0

    :goto_2
    if-ge v13, v6, :cond_a

    invoke-virtual/range {p1 .. p1}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v14

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    invoke-static {v14, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v14, Lm1/e;

    invoke-virtual {v14}, Lm1/e;->A()Lm1/e$b;

    move-result-object v15

    sget-object v11, Lm1/e$b;->E:Lm1/e$b;

    if-ne v15, v11, :cond_2

    const/4 v15, 0x1

    goto :goto_3

    :cond_2
    const/4 v15, 0x0

    :goto_3
    invoke-virtual {v14}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v12

    if-ne v12, v11, :cond_3

    const/4 v11, 0x1

    goto :goto_4

    :cond_3
    const/4 v11, 0x0

    :goto_4
    if-eqz v15, :cond_4

    if-eqz v11, :cond_4

    invoke-virtual {v14}, Lm1/e;->s()F

    move-result v11

    const/4 v12, 0x0

    cmpl-float v11, v11, v12

    if-lez v11, :cond_4

    const/4 v11, 0x1

    goto :goto_5

    :cond_4
    const/4 v11, 0x0

    :goto_5
    invoke-virtual {v14}, Lm1/e;->M0()Z

    move-result v12

    if-eqz v12, :cond_6

    if-eqz v11, :cond_6

    :cond_5
    :goto_6
    const/4 v2, 0x0

    goto :goto_7

    :cond_6
    invoke-virtual {v14}, Lm1/e;->N0()Z

    move-result v12

    if-eqz v12, :cond_7

    if-eqz v11, :cond_7

    goto :goto_6

    :cond_7
    instance-of v11, v14, Lm1/l;

    if-eqz v11, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v14}, Lm1/e;->M0()Z

    move-result v11

    if-nez v11, :cond_5

    invoke-virtual {v14}, Lm1/e;->N0()Z

    move-result v11

    if-eqz v11, :cond_9

    goto :goto_6

    :cond_9
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_a
    :goto_7
    if-eqz v2, :cond_b

    sget-object v11, Le1/d;->s:Le1/d$a;

    invoke-virtual {v11}, Le1/d$a;->d()Le1/e;

    :cond_b
    const/high16 v11, 0x40000000    # 2.0f

    if-ne v3, v11, :cond_c

    if-eq v4, v11, :cond_d

    :cond_c
    if-eqz v10, :cond_e

    :cond_d
    const/4 v12, 0x1

    goto :goto_8

    :cond_e
    const/4 v12, 0x0

    :goto_8
    and-int/2addr v2, v12

    const/4 v12, 0x2

    if-eqz v2, :cond_16

    invoke-virtual/range {p1 .. p1}, Lm1/e;->j0()I

    move-result v13

    move/from16 v14, p6

    invoke-static {v13, v14}, Ljava/lang/Math;->min(II)I

    move-result v13

    invoke-virtual/range {p1 .. p1}, Lm1/e;->i0()I

    move-result v14

    move/from16 v15, p8

    invoke-static {v14, v15}, Ljava/lang/Math;->min(II)I

    move-result v14

    if-ne v3, v11, :cond_f

    invoke-virtual/range {p1 .. p1}, Lm1/e;->B0()I

    move-result v15

    if-eq v15, v13, :cond_f

    invoke-virtual {v1, v13}, Lm1/e;->U1(I)V

    invoke-virtual/range {p1 .. p1}, Lm1/f;->I2()V

    :cond_f
    if-ne v4, v11, :cond_10

    invoke-virtual/range {p1 .. p1}, Lm1/e;->w()I

    move-result v13

    if-eq v13, v14, :cond_10

    invoke-virtual {v1, v14}, Lm1/e;->m1(I)V

    invoke-virtual/range {p1 .. p1}, Lm1/f;->I2()V

    :cond_10
    if-ne v3, v11, :cond_11

    if-ne v4, v11, :cond_11

    invoke-virtual {v1, v10}, Lm1/f;->t2(Z)Z

    move-result v10

    move v15, v12

    goto :goto_a

    :cond_11
    invoke-virtual {v1, v10}, Lm1/f;->u2(Z)Z

    move-result v13

    const/4 v14, 0x0

    if-ne v3, v11, :cond_12

    invoke-virtual {v1, v10, v14}, Lm1/f;->v2(ZI)Z

    move-result v15

    and-int/2addr v13, v15

    const/4 v15, 0x1

    goto :goto_9

    :cond_12
    move v15, v14

    :goto_9
    if-ne v4, v11, :cond_13

    const/4 v14, 0x1

    invoke-virtual {v1, v10, v14}, Lm1/f;->v2(ZI)Z

    move-result v10

    and-int/2addr v10, v13

    add-int/lit8 v15, v15, 0x1

    goto :goto_a

    :cond_13
    move v10, v13

    :goto_a
    if-eqz v10, :cond_17

    if-ne v3, v11, :cond_14

    const/4 v14, 0x1

    goto :goto_b

    :cond_14
    const/4 v14, 0x0

    :goto_b
    if-ne v4, v11, :cond_15

    const/4 v3, 0x1

    goto :goto_c

    :cond_15
    const/4 v3, 0x0

    :goto_c
    invoke-virtual {v1, v14, v3}, Lm1/f;->Y1(ZZ)V

    goto :goto_d

    :cond_16
    const/4 v10, 0x0

    const/4 v15, 0x0

    :cond_17
    :goto_d
    if-eqz v10, :cond_19

    if-eq v15, v12, :cond_18

    goto :goto_e

    :cond_18
    move-object v0, v1

    goto/16 :goto_19

    :cond_19
    :goto_e
    invoke-virtual/range {p1 .. p1}, Lm1/f;->F2()I

    move-result v3

    if-lez v6, :cond_1a

    invoke-direct/range {p0 .. p1}, Ln1/b;->b(Lm1/f;)V

    :cond_1a
    invoke-virtual/range {p1 .. p1}, Lm1/f;->z2()Le1/e;

    invoke-virtual/range {p0 .. p1}, Ln1/b;->e(Lm1/f;)V

    iget-object v4, v0, Ln1/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lez v6, :cond_1b

    const-string v6, "First pass"

    const/4 v10, 0x0

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v6

    move/from16 p5, v10

    move/from16 p6, v7

    move/from16 p7, v8

    invoke-direct/range {p2 .. p7}, Ln1/b;->c(Lm1/f;Ljava/lang/String;III)V

    :cond_1b
    if-lez v4, :cond_32

    invoke-virtual/range {p1 .. p1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v6

    sget-object v10, Lm1/e$b;->D:Lm1/e$b;

    if-ne v6, v10, :cond_1c

    const/4 v14, 0x1

    goto :goto_f

    :cond_1c
    const/4 v14, 0x0

    :goto_f
    invoke-virtual/range {p1 .. p1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v6

    if-ne v6, v10, :cond_1d

    const/4 v6, 0x1

    goto :goto_10

    :cond_1d
    const/4 v6, 0x0

    :goto_10
    invoke-virtual/range {p1 .. p1}, Lm1/e;->B0()I

    move-result v10

    iget-object v11, v0, Ln1/b;->c:Lm1/f;

    invoke-virtual {v11}, Lm1/e;->m0()I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lm1/e;->w()I

    move-result v11

    iget-object v13, v0, Ln1/b;->c:Lm1/f;

    invoke-virtual {v13}, Lm1/e;->l0()I

    move-result v13

    invoke-static {v11, v13}, Ljava/lang/Math;->max(II)I

    move-result v11

    const/4 v13, 0x0

    const/4 v15, 0x0

    :goto_11
    if-ge v13, v4, :cond_23

    iget-object v12, v0, Ln1/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lm1/e;

    instance-of v1, v12, Lm1/l;

    if-nez v1, :cond_1e

    move/from16 p8, v3

    move/from16 v17, v8

    goto/16 :goto_13

    :cond_1e
    invoke-virtual {v12}, Lm1/e;->B0()I

    move-result v1

    move/from16 p8, v3

    invoke-virtual {v12}, Lm1/e;->w()I

    move-result v3

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v16, Ln1/b$b;->k:Ln1/b$b$a;

    move/from16 v17, v8

    invoke-virtual/range {v16 .. v16}, Ln1/b$b$a;->b()I

    move-result v8

    invoke-direct {v0, v5, v12, v8}, Ln1/b;->a(Ln1/b$c;Lm1/e;I)Z

    move-result v8

    or-int/2addr v8, v15

    invoke-virtual/range {p1 .. p1}, Lm1/f;->z2()Le1/e;

    invoke-virtual {v12}, Lm1/e;->B0()I

    move-result v15

    move/from16 p2, v8

    invoke-virtual {v12}, Lm1/e;->w()I

    move-result v8

    if-eq v15, v1, :cond_20

    invoke-virtual {v12, v15}, Lm1/e;->U1(I)V

    if-eqz v14, :cond_1f

    invoke-virtual {v12}, Lm1/e;->q0()I

    move-result v1

    if-le v1, v10, :cond_1f

    invoke-virtual {v12}, Lm1/e;->q0()I

    move-result v1

    sget-object v15, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {v12, v15}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v15

    invoke-static {v15}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v15}, Lm1/d;->k()I

    move-result v15

    add-int/2addr v1, v15

    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v10

    :cond_1f
    const/4 v1, 0x1

    goto :goto_12

    :cond_20
    move/from16 v1, p2

    :goto_12
    if-eq v8, v3, :cond_22

    invoke-virtual {v12, v8}, Lm1/e;->m1(I)V

    if-eqz v6, :cond_21

    invoke-virtual {v12}, Lm1/e;->o()I

    move-result v1

    if-le v1, v11, :cond_21

    invoke-virtual {v12}, Lm1/e;->o()I

    move-result v1

    sget-object v3, Lm1/d$b;->G:Lm1/d$b;

    invoke-virtual {v12, v3}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lm1/d;->k()I

    move-result v3

    add-int/2addr v1, v3

    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v11

    :cond_21
    const/4 v1, 0x1

    :cond_22
    check-cast v12, Lm1/l;

    invoke-virtual {v12}, Lm1/l;->p2()Z

    move-result v3

    or-int v15, v1, v3

    :goto_13
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v1, p1

    move/from16 v3, p8

    move/from16 v8, v17

    const/4 v12, 0x2

    goto/16 :goto_11

    :cond_23
    move/from16 p8, v3

    move/from16 v17, v8

    move v1, v12

    const/4 v3, 0x0

    :goto_14
    if-ge v3, v1, :cond_31

    const/4 v8, 0x0

    :goto_15
    if-ge v8, v4, :cond_30

    iget-object v12, v0, Ln1/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v9}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Lm1/e;

    instance-of v13, v12, Lm1/i;

    if-eqz v13, :cond_24

    instance-of v13, v12, Lm1/l;

    if-eqz v13, :cond_28

    :cond_24
    instance-of v13, v12, Lm1/h;

    if-eqz v13, :cond_25

    goto :goto_16

    :cond_25
    invoke-virtual {v12}, Lm1/e;->A0()I

    move-result v13

    const/16 v1, 0x8

    if-ne v13, v1, :cond_26

    goto :goto_16

    :cond_26
    if-eqz v2, :cond_27

    invoke-virtual {v12}, Lm1/e;->K()Ln1/l;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln1/p;->i()Ln1/g;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->i()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-virtual {v12}, Lm1/e;->e0()Ln1/n;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln1/p;->i()Ln1/g;

    move-result-object v1

    invoke-virtual {v1}, Ln1/f;->i()Z

    move-result v1

    if-eqz v1, :cond_27

    goto :goto_16

    :cond_27
    instance-of v1, v12, Lm1/l;

    if-eqz v1, :cond_29

    :cond_28
    :goto_16
    move/from16 v16, v2

    move/from16 v20, v4

    goto/16 :goto_17

    :cond_29
    invoke-virtual {v12}, Lm1/e;->B0()I

    move-result v1

    invoke-virtual {v12}, Lm1/e;->w()I

    move-result v13

    move/from16 v16, v2

    invoke-virtual {v12}, Lm1/e;->m()I

    move-result v2

    sget-object v18, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual/range {v18 .. v18}, Ln1/b$b$a;->b()I

    move-result v19

    move/from16 v20, v4

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2a

    invoke-virtual/range {v18 .. v18}, Ln1/b$b$a;->c()I

    move-result v19

    :cond_2a
    move/from16 v4, v19

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {v0, v5, v12, v4}, Ln1/b;->a(Ln1/b$c;Lm1/e;I)Z

    move-result v4

    or-int/2addr v4, v15

    invoke-virtual/range {p1 .. p1}, Lm1/f;->z2()Le1/e;

    invoke-virtual {v12}, Lm1/e;->B0()I

    move-result v15

    invoke-virtual {v12}, Lm1/e;->w()I

    move-result v0

    if-eq v15, v1, :cond_2c

    invoke-virtual {v12, v15}, Lm1/e;->U1(I)V

    if-eqz v14, :cond_2b

    invoke-virtual {v12}, Lm1/e;->q0()I

    move-result v1

    if-le v1, v10, :cond_2b

    invoke-virtual {v12}, Lm1/e;->q0()I

    move-result v1

    sget-object v4, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {v12, v4}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lm1/d;->k()I

    move-result v4

    add-int/2addr v1, v4

    invoke-static {v10, v1}, Ljava/lang/Math;->max(II)I

    move-result v10

    :cond_2b
    const/4 v4, 0x1

    :cond_2c
    if-eq v0, v13, :cond_2e

    invoke-virtual {v12, v0}, Lm1/e;->m1(I)V

    if-eqz v6, :cond_2d

    invoke-virtual {v12}, Lm1/e;->o()I

    move-result v0

    if-le v0, v11, :cond_2d

    invoke-virtual {v12}, Lm1/e;->o()I

    move-result v0

    sget-object v1, Lm1/d$b;->G:Lm1/d$b;

    invoke-virtual {v12, v1}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm1/d;->k()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v11, v0}, Ljava/lang/Math;->max(II)I

    move-result v11

    :cond_2d
    const/4 v4, 0x1

    :cond_2e
    invoke-virtual {v12}, Lm1/e;->v()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-virtual {v12}, Lm1/e;->m()I

    move-result v0

    if-eq v2, v0, :cond_2f

    const/4 v15, 0x1

    goto :goto_17

    :cond_2f
    move v15, v4

    :goto_17
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p0

    move/from16 v2, v16

    move/from16 v4, v20

    const/4 v1, 0x2

    goto/16 :goto_15

    :cond_30
    move/from16 v16, v2

    move/from16 v20, v4

    if-eqz v15, :cond_31

    add-int/lit8 v3, v3, 0x1

    const-string v0, "intermediate pass"

    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v0

    move/from16 p5, v3

    move/from16 p6, v7

    move/from16 p7, v17

    invoke-direct/range {p2 .. p7}, Ln1/b;->c(Lm1/f;Ljava/lang/String;III)V

    move-object/from16 v0, p0

    move/from16 v2, v16

    move/from16 v4, v20

    const/4 v1, 0x2

    const/4 v15, 0x0

    goto/16 :goto_14

    :cond_31
    move-object/from16 v0, p1

    move/from16 v1, p8

    goto :goto_18

    :cond_32
    move-object/from16 v0, p1

    move v1, v3

    :goto_18
    invoke-virtual {v0, v1}, Lm1/f;->O2(I)V

    :goto_19
    invoke-virtual/range {p1 .. p1}, Lm1/f;->z2()Le1/e;

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final e(Lm1/f;)V
    .locals 5

    .prologue
    const-string v0, "layout"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln1/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p1}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1}, Lm1/m;->d2()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lm1/e;

    invoke-virtual {v2}, Lm1/e;->A()Lm1/e$b;

    move-result-object v3

    sget-object v4, Lm1/e$b;->E:Lm1/e$b;

    if-eq v3, v4, :cond_0

    invoke-virtual {v2}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v3

    if-ne v3, v4, :cond_1

    :cond_0
    iget-object v3, p0, Ln1/b;->a:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lm1/f;->I2()V

    return-void
.end method
