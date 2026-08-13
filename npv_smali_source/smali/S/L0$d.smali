.class final LS/L0$d;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/L0;->b(ILx7/p;Lx7/q;Lx7/p;Lx7/p;LA/S;Lx7/p;LV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/p;

.field final synthetic E:Lx7/p;

.field final synthetic F:Lx7/p;

.field final synthetic G:I

.field final synthetic H:LA/S;

.field final synthetic I:Lx7/p;

.field final synthetic J:Lx7/q;


# direct methods
.method constructor <init>(Lx7/p;Lx7/p;Lx7/p;ILA/S;Lx7/p;Lx7/q;)V
    .locals 0

    iput-object p1, p0, LS/L0$d;->D:Lx7/p;

    iput-object p2, p0, LS/L0$d;->E:Lx7/p;

    iput-object p3, p0, LS/L0$d;->F:Lx7/p;

    iput p4, p0, LS/L0$d;->G:I

    iput-object p5, p0, LS/L0$d;->H:LA/S;

    iput-object p6, p0, LS/L0$d;->I:Lx7/p;

    iput-object p7, p0, LS/L0$d;->J:Lx7/q;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LD0/j0;J)LD0/K;
    .locals 26

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v15, p1

    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v16

    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v17

    const/16 v7, 0xa

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-wide/from16 v1, p2

    invoke-static/range {v1 .. v8}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v9

    sget-object v1, LS/M0;->C:LS/M0;

    iget-object v2, v0, LS/L0$d;->D:Lx7/p;

    invoke-interface {v15, v1, v2}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v1

    new-instance v11, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-direct {v11, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v12, 0x0

    move v3, v12

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD0/G;

    invoke-interface {v4, v9, v10}, LD0/G;->U(J)LD0/X;

    move-result-object v4

    invoke-interface {v11, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v13, 0x1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_2

    :cond_1
    invoke-interface {v11, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, LD0/X;

    invoke-virtual {v3}, LD0/X;->w0()I

    move-result v3

    invoke-static {v11}, Lj7/v;->o(Ljava/util/List;)I

    move-result v4

    if-gt v13, v4, :cond_3

    move v5, v13

    :goto_1
    invoke-interface {v11, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, LD0/X;

    invoke-virtual {v7}, LD0/X;->w0()I

    move-result v7

    if-ge v3, v7, :cond_2

    move-object v1, v6

    move v3, v7

    :cond_2
    if-eq v5, v4, :cond_3

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    check-cast v1, LD0/X;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v1

    move v5, v1

    goto :goto_3

    :cond_4
    move v5, v12

    :goto_3
    sget-object v1, LS/M0;->E:LS/M0;

    iget-object v3, v0, LS/L0$d;->E:Lx7/p;

    invoke-interface {v15, v1, v3}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v1

    iget-object v3, v0, LS/L0$d;->H:LA/S;

    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v4

    move v6, v12

    :goto_4
    if-ge v6, v4, :cond_5

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LD0/G;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v8

    invoke-interface {v3, v15, v8}, LA/S;->d(LY0/e;LY0/v;)I

    move-result v8

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-interface {v3, v15, v2}, LA/S;->a(LY0/e;LY0/v;)I

    move-result v2

    invoke-interface {v3, v15}, LA/S;->b(LY0/e;)I

    move-result v13

    neg-int v8, v8

    sub-int/2addr v8, v2

    neg-int v2, v13

    invoke-static {v9, v10, v8, v2}, LY0/c;->n(JII)J

    move-result-wide v12

    invoke-interface {v7, v12, v13}, LD0/G;->U(J)LD0/X;

    move-result-object v2

    invoke-interface {v14, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x1

    goto :goto_4

    :cond_5
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v2, 0x0

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v1, v2

    check-cast v1, LD0/X;

    invoke-virtual {v1}, LD0/X;->w0()I

    move-result v1

    invoke-static {v14}, Lj7/v;->o(Ljava/util/List;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_9

    move-object v4, v2

    move v2, v1

    const/4 v1, 0x1

    :goto_5
    invoke-interface {v14, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, LD0/X;

    invoke-virtual {v7}, LD0/X;->w0()I

    move-result v7

    if-ge v2, v7, :cond_7

    move-object v4, v6

    move v2, v7

    :cond_7
    if-eq v1, v3, :cond_8

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_8
    move-object v2, v4

    :cond_9
    :goto_6
    check-cast v2, LD0/X;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v1

    goto :goto_7

    :cond_a
    const/4 v1, 0x0

    :goto_7
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v3, 0x0

    goto :goto_9

    :cond_b
    const/4 v2, 0x0

    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v2, v3

    check-cast v2, LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    invoke-static {v14}, Lj7/v;->o(Ljava/util/List;)I

    move-result v4

    const/4 v6, 0x1

    if-gt v6, v4, :cond_e

    move-object v6, v3

    move v3, v2

    const/4 v2, 0x1

    :goto_8
    invoke-interface {v14, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LD0/X;

    invoke-virtual {v8}, LD0/X;->I0()I

    move-result v8

    if-ge v3, v8, :cond_c

    move-object v6, v7

    move v3, v8

    :cond_c
    if-eq v2, v4, :cond_d

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_d
    move-object v3, v6

    :cond_e
    :goto_9
    check-cast v3, LD0/X;

    if-eqz v3, :cond_f

    invoke-virtual {v3}, LD0/X;->I0()I

    move-result v2

    move v12, v2

    goto :goto_a

    :cond_f
    const/4 v12, 0x0

    :goto_a
    sget-object v2, LS/M0;->F:LS/M0;

    iget-object v3, v0, LS/L0$d;->F:Lx7/p;

    invoke-interface {v15, v2, v3}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v0, LS/L0$d;->H:LA/S;

    new-instance v13, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v13, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_b
    if-ge v6, v4, :cond_12

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LD0/G;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v8

    invoke-interface {v3, v15, v8}, LA/S;->d(LY0/e;LY0/v;)I

    move-result v8

    move-object/from16 v19, v2

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v2

    invoke-interface {v3, v15, v2}, LA/S;->a(LY0/e;LY0/v;)I

    move-result v2

    move/from16 v20, v4

    invoke-interface {v3, v15}, LA/S;->b(LY0/e;)I

    move-result v4

    neg-int v8, v8

    sub-int/2addr v8, v2

    neg-int v2, v4

    move-object v4, v3

    invoke-static {v9, v10, v8, v2}, LY0/c;->n(JII)J

    move-result-wide v2

    invoke-interface {v7, v2, v3}, LD0/G;->U(J)LD0/X;

    move-result-object v2

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v3

    if-eqz v3, :cond_10

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_c

    :cond_10
    const/4 v2, 0x0

    :goto_c
    if-eqz v2, :cond_11

    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_11
    add-int/lit8 v6, v6, 0x1

    move-object v3, v4

    move-object/from16 v2, v19

    move/from16 v4, v20

    goto :goto_b

    :cond_12
    invoke-interface {v13}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_1f

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_13

    const/4 v4, 0x0

    goto :goto_e

    :cond_13
    const/4 v2, 0x0

    invoke-interface {v13, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v2, v4

    check-cast v2, LD0/X;

    invoke-virtual {v2}, LD0/X;->I0()I

    move-result v2

    invoke-static {v13}, Lj7/v;->o(Ljava/util/List;)I

    move-result v6

    if-gt v3, v6, :cond_15

    move v3, v2

    const/4 v2, 0x1

    :goto_d
    invoke-interface {v13, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LD0/X;

    invoke-virtual {v8}, LD0/X;->I0()I

    move-result v8

    if-ge v3, v8, :cond_14

    move-object v4, v7

    move v3, v8

    :cond_14
    if-eq v2, v6, :cond_15

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_15
    :goto_e
    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v4, LD0/X;

    invoke-virtual {v4}, LD0/X;->I0()I

    move-result v2

    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_16

    const/4 v4, 0x0

    goto :goto_11

    :cond_16
    const/4 v3, 0x0

    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v3, v4

    check-cast v3, LD0/X;

    invoke-virtual {v3}, LD0/X;->w0()I

    move-result v3

    invoke-static {v13}, Lj7/v;->o(Ljava/util/List;)I

    move-result v6

    const/4 v7, 0x1

    if-gt v7, v6, :cond_19

    move-object v7, v4

    move v4, v3

    const/4 v3, 0x1

    :goto_f
    invoke-interface {v13, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v19, v8

    check-cast v19, LD0/X;

    move-object/from16 v20, v7

    invoke-virtual/range {v19 .. v19}, LD0/X;->w0()I

    move-result v7

    if-ge v4, v7, :cond_17

    move v4, v7

    move-object v7, v8

    goto :goto_10

    :cond_17
    move-object/from16 v7, v20

    :goto_10
    if-eq v3, v6, :cond_18

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_18
    move-object v4, v7

    :cond_19
    :goto_11
    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v4, LD0/X;

    invoke-virtual {v4}, LD0/X;->w0()I

    move-result v3

    iget v4, v0, LS/L0$d;->G:I

    sget-object v6, LS/c0;->a:LS/c0$a;

    invoke-virtual {v6}, LS/c0$a;->c()I

    move-result v7

    invoke-static {v4, v7}, LS/c0;->e(II)Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v4

    sget-object v6, LY0/v;->C:LY0/v;

    if-ne v4, v6, :cond_1b

    :cond_1a
    invoke-static {}, LS/L0;->d()F

    move-result v4

    invoke-interface {v15, v4}, LY0/e;->S0(F)I

    move-result v4

    goto :goto_14

    :cond_1b
    :goto_12
    invoke-static {}, LS/L0;->d()F

    move-result v4

    invoke-interface {v15, v4}, LY0/e;->S0(F)I

    move-result v4

    sub-int v4, v16, v4

    sub-int/2addr v4, v2

    goto :goto_14

    :cond_1c
    invoke-virtual {v6}, LS/c0$a;->a()I

    move-result v7

    invoke-static {v4, v7}, LS/c0;->e(II)Z

    move-result v7

    if-eqz v7, :cond_1d

    const/4 v4, 0x1

    goto :goto_13

    :cond_1d
    invoke-virtual {v6}, LS/c0$a;->b()I

    move-result v6

    invoke-static {v4, v6}, LS/c0;->e(II)Z

    move-result v4

    :goto_13
    if-eqz v4, :cond_1e

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v4

    sget-object v6, LY0/v;->C:LY0/v;

    if-ne v4, v6, :cond_1a

    goto :goto_12

    :cond_1e
    sub-int v4, v16, v2

    div-int/lit8 v4, v4, 0x2

    :goto_14
    new-instance v6, LS/b0;

    invoke-direct {v6, v4, v2, v3}, LS/b0;-><init>(III)V

    move-object/from16 v19, v6

    goto :goto_15

    :cond_1f
    const/16 v19, 0x0

    :goto_15
    sget-object v2, LS/M0;->G:LS/M0;

    new-instance v3, LS/L0$d$c;

    iget-object v4, v0, LS/L0$d;->I:Lx7/p;

    invoke-direct {v3, v4}, LS/L0$d$c;-><init>(Lx7/p;)V

    const v4, -0x7ff00d2f

    const/4 v6, 0x1

    invoke-static {v4, v6, v3}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v3

    invoke-interface {v15, v2, v3}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v2

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_16
    if-ge v4, v3, :cond_20

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LD0/G;

    invoke-interface {v6, v9, v10}, LD0/G;->U(J)LD0/X;

    move-result-object v6

    invoke-interface {v8, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_16

    :cond_20
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_21

    const/4 v2, 0x0

    goto :goto_18

    :cond_21
    const/4 v7, 0x0

    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LD0/X;

    invoke-virtual {v3}, LD0/X;->w0()I

    move-result v3

    invoke-static {v8}, Lj7/v;->o(Ljava/util/List;)I

    move-result v4

    const/4 v6, 0x1

    if-gt v6, v4, :cond_23

    const/4 v6, 0x1

    :goto_17
    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v20, v18

    check-cast v20, LD0/X;

    invoke-virtual/range {v20 .. v20}, LD0/X;->w0()I

    move-result v7

    if-ge v3, v7, :cond_22

    move v3, v7

    move-object/from16 v2, v18

    :cond_22
    if-eq v6, v4, :cond_23

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x0

    goto :goto_17

    :cond_23
    :goto_18
    check-cast v2, LD0/X;

    if-eqz v2, :cond_24

    invoke-virtual {v2}, LD0/X;->w0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v18, v2

    goto :goto_19

    :cond_24
    const/16 v18, 0x0

    :goto_19
    if-eqz v19, :cond_27

    iget v2, v0, LS/L0$d;->G:I

    iget-object v3, v0, LS/L0$d;->H:LA/S;

    if-eqz v18, :cond_26

    sget-object v4, LS/c0;->a:LS/c0$a;

    invoke-virtual {v4}, LS/c0$a;->b()I

    move-result v4

    invoke-static {v2, v4}, LS/c0;->e(II)Z

    move-result v2

    if-eqz v2, :cond_25

    goto :goto_1b

    :cond_25
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual/range {v19 .. v19}, LS/b0;->a()I

    move-result v3

    add-int/2addr v2, v3

    invoke-static {}, LS/L0;->d()F

    move-result v3

    invoke-interface {v15, v3}, LY0/e;->S0(F)I

    move-result v3

    :goto_1a
    add-int/2addr v2, v3

    goto :goto_1c

    :cond_26
    :goto_1b
    invoke-virtual/range {v19 .. v19}, LS/b0;->a()I

    move-result v2

    invoke-static {}, LS/L0;->d()F

    move-result v4

    invoke-interface {v15, v4}, LY0/e;->S0(F)I

    move-result v4

    add-int/2addr v2, v4

    invoke-interface {v3, v15}, LA/S;->b(LY0/e;)I

    move-result v3

    goto :goto_1a

    :goto_1c
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_1d

    :cond_27
    const/16 v20, 0x0

    :goto_1d
    if-eqz v1, :cond_2a

    if-eqz v20, :cond_28

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1e

    :cond_28
    if-eqz v18, :cond_29

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1e

    :cond_29
    iget-object v2, v0, LS/L0$d;->H:LA/S;

    invoke-interface {v2, v15}, LA/S;->b(LY0/e;)I

    move-result v2

    :goto_1e
    add-int/2addr v1, v2

    move/from16 v22, v1

    goto :goto_1f

    :cond_2a
    const/16 v22, 0x0

    :goto_1f
    sget-object v7, LS/M0;->D:LS/M0;

    new-instance v6, LS/L0$d$b;

    iget-object v2, v0, LS/L0$d;->H:LA/S;

    iget-object v4, v0, LS/L0$d;->J:Lx7/q;

    move-object v1, v6

    move-object/from16 v3, p1

    move-object/from16 v23, v4

    move-object v4, v11

    move-object/from16 p2, v13

    move-object v13, v6

    move-object v6, v8

    move/from16 v24, v12

    const/16 v21, 0x0

    move-object v12, v7

    move-object/from16 v7, v18

    move-object/from16 v25, v8

    move-object/from16 v8, v23

    invoke-direct/range {v1 .. v8}, LS/L0$d$b;-><init>(LA/S;LD0/j0;Ljava/util/List;ILjava/util/List;Ljava/lang/Integer;Lx7/q;)V

    const v1, -0x48526920

    const/4 v2, 0x1

    invoke-static {v1, v2, v13}, Ld0/c;->c(IZLjava/lang/Object;)Ld0/a;

    move-result-object v1

    invoke-interface {v15, v12, v1}, LD0/j0;->c1(Ljava/lang/Object;Lx7/p;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v12, v21

    :goto_20
    if-ge v12, v3, :cond_2b

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LD0/G;

    invoke-interface {v4, v9, v10}, LD0/G;->U(J)LD0/X;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_20

    :cond_2b
    new-instance v21, LS/L0$d$a;

    iget-object v9, v0, LS/L0$d;->H:LA/S;

    move-object/from16 v1, v21

    move-object v3, v11

    move-object v4, v14

    move-object/from16 v5, v25

    move-object/from16 v6, v19

    move/from16 v7, v16

    move/from16 v8, v24

    move-object/from16 v10, p1

    move/from16 v11, v17

    move/from16 v12, v22

    move-object/from16 v14, p2

    move-object/from16 v13, v18

    move-object/from16 v15, v20

    invoke-direct/range {v1 .. v15}, LS/L0$d$a;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LS/b0;IILA/S;LD0/j0;IILjava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move/from16 v2, v16

    move/from16 v3, v17

    move-object/from16 v5, v21

    invoke-static/range {v1 .. v7}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LD0/j0;

    check-cast p2, LY0/b;

    invoke-virtual {p2}, LY0/b;->r()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LS/L0$d;->a(LD0/j0;J)LD0/K;

    move-result-object p1

    return-object p1
.end method
