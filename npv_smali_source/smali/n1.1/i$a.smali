.class public final Ln1/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Ln1/i$a;-><init>()V

    return-void
.end method

.method private final b(Ljava/util/ArrayList;I)Ln1/o;
    .locals 4

    .prologue
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ln1/o;

    invoke-virtual {v2}, Ln1/o;->c()I

    move-result v3

    if-ne p2, v3, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;
    .locals 8

    .prologue
    const-string v0, "constraintWidget"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "list"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lm1/e;->B()I

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lm1/e;->z0()I

    move-result v0

    :goto_0
    const-string v1, "get(...)"

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    if-eqz p4, :cond_1

    invoke-virtual {p4}, Ln1/o;->c()I

    move-result v4

    if-eq v0, v4, :cond_4

    :cond_1
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, v2

    :goto_1
    if-ge v5, v4, :cond_5

    invoke-virtual {p3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ln1/o;

    invoke-virtual {v6}, Ln1/o;->c()I

    move-result v7

    if-ne v7, v0, :cond_3

    if-eqz p4, :cond_2

    invoke-virtual {p4, p2, v6}, Ln1/o;->g(ILn1/o;)V

    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    move-object p4, v6

    goto :goto_2

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    if-eq v0, v3, :cond_5

    return-object p4

    :cond_5
    :goto_2
    if-nez p4, :cond_9

    instance-of v0, p1, Lm1/j;

    if-eqz v0, :cond_7

    move-object v0, p1

    check-cast v0, Lm1/j;

    invoke-virtual {v0, p2}, Lm1/j;->c2(I)I

    move-result v0

    if-eq v0, v3, :cond_7

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v4, v2

    :goto_3
    if-ge v4, v3, :cond_7

    invoke-virtual {p3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ln1/o;

    invoke-virtual {v5}, Ln1/o;->c()I

    move-result v6

    if-ne v6, v0, :cond_6

    move-object p4, v5

    goto :goto_4

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    :goto_4
    if-nez p4, :cond_8

    new-instance p4, Ln1/o;

    invoke-direct {p4, p2}, Ln1/o;-><init>(I)V

    :cond_8
    invoke-virtual {p3, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {p4, p1}, Ln1/o;->a(Lm1/e;)Z

    move-result v0

    if-eqz v0, :cond_d

    instance-of v0, p1, Lm1/h;

    if-eqz v0, :cond_b

    move-object v0, p1

    check-cast v0, Lm1/h;

    invoke-virtual {v0}, Lm1/h;->a2()Lm1/d;

    move-result-object v1

    invoke-virtual {v0}, Lm1/h;->b2()I

    move-result v0

    if-nez v0, :cond_a

    const/4 v2, 0x1

    :cond_a
    invoke-virtual {v1, v2, p3, p4}, Lm1/d;->c(ILjava/util/ArrayList;Ln1/o;)V

    :cond_b
    invoke-virtual {p4}, Ln1/o;->c()I

    move-result v0

    if-nez p2, :cond_c

    invoke-virtual {p1, v0}, Lm1/e;->s1(I)V

    invoke-virtual {p1}, Lm1/e;->L()Lm1/d;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lm1/d;->c(ILjava/util/ArrayList;Ln1/o;)V

    invoke-virtual {p1}, Lm1/e;->b0()Lm1/d;

    move-result-object v0

    :goto_5
    invoke-virtual {v0, p2, p3, p4}, Lm1/d;->c(ILjava/util/ArrayList;Ln1/o;)V

    goto :goto_6

    :cond_c
    invoke-virtual {p1, v0}, Lm1/e;->Q1(I)V

    invoke-virtual {p1}, Lm1/e;->c0()Lm1/d;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lm1/d;->c(ILjava/util/ArrayList;Ln1/o;)V

    invoke-virtual {p1}, Lm1/e;->F()Lm1/d;

    move-result-object v0

    invoke-virtual {v0, p2, p3, p4}, Lm1/d;->c(ILjava/util/ArrayList;Ln1/o;)V

    invoke-virtual {p1}, Lm1/e;->G()Lm1/d;

    move-result-object v0

    goto :goto_5

    :goto_6
    invoke-virtual {p1}, Lm1/e;->H()Lm1/d;

    move-result-object p1

    invoke-virtual {p1, p2, p3, p4}, Lm1/d;->c(ILjava/util/ArrayList;Ln1/o;)V

    :cond_d
    return-object p4
.end method

.method public final c(Lm1/f;Ln1/b$c;)Z
    .locals 23

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "layout"

    invoke-static {v1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lm1/m;->c2()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const-string v6, "get(...)"

    if-ge v5, v3, :cond_2

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/e;

    invoke-virtual/range {p1 .. p1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v8

    invoke-virtual {v7}, Lm1/e;->A()Lm1/e$b;

    move-result-object v9

    invoke-virtual {v7}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v10

    invoke-virtual {v0, v6, v8, v9, v10}, Ln1/i$a;->d(Lm1/e$b;Lm1/e$b;Lm1/e$b;Lm1/e$b;)Z

    move-result v6

    if-nez v6, :cond_0

    return v4

    :cond_0
    instance-of v6, v7, Lm1/g;

    if-eqz v6, :cond_1

    return v4

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lm1/f;->z2()Le1/e;

    move v7, v4

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1
    if-ge v7, v3, :cond_13

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    invoke-static {v15, v6}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v15, Lm1/e;

    invoke-virtual/range {p1 .. p1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v5

    invoke-virtual {v15}, Lm1/e;->A()Lm1/e$b;

    move-result-object v14

    move-object/from16 v22, v6

    invoke-virtual {v15}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v6

    invoke-virtual {v0, v4, v5, v14, v6}, Ln1/i$a;->d(Lm1/e$b;Lm1/e$b;Lm1/e$b;Lm1/e$b;)Z

    move-result v4

    if-nez v4, :cond_3

    sget-object v16, Lm1/f;->h1:Lm1/f$a;

    invoke-virtual/range {p1 .. p1}, Lm1/f;->y2()Ln1/b$b;

    move-result-object v20

    sget-object v4, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v4}, Ln1/b$b$a;->a()I

    move-result v21

    const/16 v17, 0x0

    move-object/from16 v18, v15

    move-object/from16 v19, p2

    invoke-virtual/range {v16 .. v21}, Lm1/f$a;->a(ILm1/e;Ln1/b$c;Ln1/b$b;I)Z

    :cond_3
    instance-of v4, v15, Lm1/h;

    if-eqz v4, :cond_7

    move-object v5, v15

    check-cast v5, Lm1/h;

    invoke-virtual {v5}, Lm1/h;->b2()I

    move-result v6

    if-nez v6, :cond_5

    if-nez v10, :cond_4

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    :cond_4
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {v5}, Lm1/h;->b2()I

    move-result v6

    const/4 v14, 0x1

    if-ne v6, v14, :cond_7

    if-nez v8, :cond_6

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :cond_6
    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    instance-of v5, v15, Lm1/j;

    if-eqz v5, :cond_e

    instance-of v5, v15, Lm1/a;

    if-eqz v5, :cond_b

    move-object v5, v15

    check-cast v5, Lm1/a;

    invoke-virtual {v5}, Lm1/a;->j2()I

    move-result v6

    if-nez v6, :cond_9

    if-nez v9, :cond_8

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_8
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {v5}, Lm1/a;->j2()I

    move-result v6

    const/4 v14, 0x1

    if-ne v6, v14, :cond_e

    if-nez v11, :cond_a

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :cond_a
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_b
    if-nez v9, :cond_c

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_c
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v11, :cond_d

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    :cond_d
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_2
    invoke-virtual {v15}, Lm1/e;->L()Lm1/d;

    move-result-object v5

    invoke-virtual {v5}, Lm1/d;->i()Lm1/d;

    move-result-object v5

    if-nez v5, :cond_10

    invoke-virtual {v15}, Lm1/e;->b0()Lm1/d;

    move-result-object v5

    invoke-virtual {v5}, Lm1/d;->i()Lm1/d;

    move-result-object v5

    if-nez v5, :cond_10

    if-nez v4, :cond_10

    instance-of v5, v15, Lm1/a;

    if-nez v5, :cond_10

    if-nez v12, :cond_f

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    :cond_f
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    invoke-virtual {v15}, Lm1/e;->c0()Lm1/d;

    move-result-object v5

    invoke-virtual {v5}, Lm1/d;->i()Lm1/d;

    move-result-object v5

    if-nez v5, :cond_12

    invoke-virtual {v15}, Lm1/e;->G()Lm1/d;

    move-result-object v5

    invoke-virtual {v5}, Lm1/d;->i()Lm1/d;

    move-result-object v5

    if-nez v5, :cond_12

    invoke-virtual {v15}, Lm1/e;->F()Lm1/d;

    move-result-object v5

    invoke-virtual {v5}, Lm1/d;->i()Lm1/d;

    move-result-object v5

    if-nez v5, :cond_12

    if-nez v4, :cond_12

    instance-of v4, v15, Lm1/a;

    if-nez v4, :cond_12

    if-nez v13, :cond_11

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    :cond_11
    invoke-virtual {v13, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v6, v22

    const/4 v4, 0x0

    goto/16 :goto_1

    :cond_13
    move-object/from16 v22, v6

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    const-string v5, "next(...)"

    if-eqz v8, :cond_14

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/h;

    const/4 v8, 0x0

    const/4 v14, 0x0

    invoke-virtual {v0, v7, v8, v4, v14}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_3

    :cond_14
    if-eqz v9, :cond_15

    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/j;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v0, v7, v8, v4, v9}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    move-result-object v14

    invoke-virtual {v7, v4, v8, v14}, Lm1/j;->b2(Ljava/util/ArrayList;ILn1/o;)V

    invoke-static {v14}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v14, v4}, Ln1/o;->b(Ljava/util/ArrayList;)V

    goto :goto_4

    :cond_15
    sget-object v6, Lm1/d$b;->D:Lm1/d$b;

    invoke-virtual {v1, v6}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v7

    if-eqz v7, :cond_16

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_16

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/d;

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v0, v7, v8, v4, v9}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_5

    :cond_16
    sget-object v6, Lm1/d$b;->F:Lm1/d$b;

    invoke-virtual {v1, v6}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v7

    if-eqz v7, :cond_17

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_6
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_17

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/d;

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v0, v7, v8, v4, v9}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_6

    :cond_17
    sget-object v6, Lm1/d$b;->I:Lm1/d$b;

    invoke-virtual {v1, v6}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v7

    if-eqz v7, :cond_18

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_18

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/d;

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v0, v7, v8, v4, v9}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_7

    :cond_18
    if-eqz v12, :cond_19

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_19

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/e;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual {v0, v7, v8, v4, v9}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_8

    :cond_19
    if-eqz v10, :cond_1a

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm1/h;

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual {v0, v7, v9, v4, v8}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_9

    :cond_1a
    if-eqz v11, :cond_1b

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/j;

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual {v0, v7, v9, v4, v8}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    move-result-object v10

    invoke-virtual {v7, v4, v9, v10}, Lm1/j;->b2(Ljava/util/ArrayList;ILn1/o;)V

    invoke-static {v10}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v10, v4}, Ln1/o;->b(Ljava/util/ArrayList;)V

    goto :goto_a

    :cond_1b
    sget-object v6, Lm1/d$b;->E:Lm1/d$b;

    invoke-virtual {v1, v6}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v7

    if-eqz v7, :cond_1c

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/d;

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual {v0, v7, v9, v4, v8}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_b

    :cond_1c
    sget-object v6, Lm1/d$b;->H:Lm1/d$b;

    invoke-virtual {v1, v6}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v7

    if-eqz v7, :cond_1d

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/d;

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual {v0, v7, v9, v4, v8}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_c

    :cond_1d
    sget-object v6, Lm1/d$b;->G:Lm1/d$b;

    invoke-virtual {v1, v6}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v7

    if-eqz v7, :cond_1e

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1e

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/d;

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual {v0, v7, v9, v4, v8}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_d

    :cond_1e
    sget-object v6, Lm1/d$b;->I:Lm1/d$b;

    invoke-virtual {v1, v6}, Lm1/e;->l(Lm1/d$b;)Lm1/d;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v7

    if-eqz v7, :cond_1f

    invoke-virtual {v6}, Lm1/d;->d()Ljava/util/HashSet;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/d;

    invoke-virtual {v7}, Lm1/d;->g()Lm1/e;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-virtual {v0, v7, v9, v4, v8}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_e

    :cond_1f
    if-eqz v13, :cond_20

    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7, v5}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Lm1/e;

    const/4 v8, 0x1

    const/4 v14, 0x0

    invoke-virtual {v0, v7, v8, v4, v14}, Ln1/i$a;->a(Lm1/e;ILjava/util/ArrayList;Ln1/o;)Ln1/o;

    goto :goto_f

    :cond_20
    const/4 v14, 0x0

    const/4 v5, 0x0

    :goto_10
    if-ge v5, v3, :cond_22

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v7, v22

    invoke-static {v6, v7}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Lm1/e;

    invoke-virtual {v6}, Lm1/e;->V0()Z

    move-result v8

    if-eqz v8, :cond_21

    invoke-virtual {v6}, Lm1/e;->B()I

    move-result v8

    invoke-direct {v0, v4, v8}, Ln1/i$a;->b(Ljava/util/ArrayList;I)Ln1/o;

    move-result-object v8

    invoke-virtual {v6}, Lm1/e;->z0()I

    move-result v6

    invoke-direct {v0, v4, v6}, Ln1/i$a;->b(Ljava/util/ArrayList;I)Ln1/o;

    move-result-object v6

    if-eqz v8, :cond_21

    if-eqz v6, :cond_21

    const/4 v9, 0x0

    invoke-virtual {v8, v9, v6}, Ln1/o;->g(ILn1/o;)V

    const/4 v9, 0x2

    invoke-virtual {v6, v9}, Ln1/o;->i(I)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_21
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v22, v7

    goto :goto_10

    :cond_22
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-gt v2, v3, :cond_23

    const/4 v2, 0x0

    return v2

    :cond_23
    invoke-virtual/range {p1 .. p1}, Lm1/e;->A()Lm1/e$b;

    move-result-object v2

    sget-object v3, Lm1/e$b;->D:Lm1/e$b;

    if-ne v2, v3, :cond_27

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v3, v14

    const/4 v8, 0x0

    :cond_24
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_26

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln1/o;

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ln1/o;->d()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_25

    goto :goto_11

    :cond_25
    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ln1/o;->h(Z)V

    invoke-virtual/range {p1 .. p1}, Lm1/f;->G2()Le1/d;

    move-result-object v7

    invoke-virtual {v5, v7, v6}, Ln1/o;->f(Le1/d;I)I

    move-result v7

    if-le v7, v8, :cond_24

    move-object v3, v5

    move v8, v7

    goto :goto_11

    :cond_26
    if-eqz v3, :cond_27

    sget-object v2, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v1, v2}, Lm1/e;->r1(Lm1/e$b;)V

    invoke-virtual {v1, v8}, Lm1/e;->U1(I)V

    const/4 v2, 0x1

    invoke-virtual {v3, v2}, Ln1/o;->h(Z)V

    goto :goto_12

    :cond_27
    move-object v3, v14

    :goto_12
    invoke-virtual/range {p1 .. p1}, Lm1/e;->y0()Lm1/e$b;

    move-result-object v2

    sget-object v5, Lm1/e$b;->D:Lm1/e$b;

    if-ne v2, v5, :cond_2b

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v4, v14

    const/4 v8, 0x0

    :cond_28
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ln1/o;

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ln1/o;->d()I

    move-result v6

    if-nez v6, :cond_29

    goto :goto_13

    :cond_29
    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ln1/o;->h(Z)V

    invoke-virtual/range {p1 .. p1}, Lm1/f;->G2()Le1/d;

    move-result-object v7

    const/4 v9, 0x1

    invoke-virtual {v5, v7, v9}, Ln1/o;->f(Le1/d;I)I

    move-result v7

    if-le v7, v8, :cond_28

    move-object v4, v5

    move v8, v7

    goto :goto_13

    :cond_2a
    const/4 v6, 0x0

    const/4 v9, 0x1

    if-eqz v4, :cond_2c

    sget-object v2, Lm1/e$b;->C:Lm1/e$b;

    invoke-virtual {v1, v2}, Lm1/e;->P1(Lm1/e$b;)V

    invoke-virtual {v1, v8}, Lm1/e;->m1(I)V

    invoke-virtual {v4, v9}, Ln1/o;->h(Z)V

    move-object v5, v4

    goto :goto_14

    :cond_2b
    const/4 v6, 0x0

    const/4 v9, 0x1

    :cond_2c
    move-object v5, v14

    :goto_14
    if-nez v3, :cond_2e

    if-eqz v5, :cond_2d

    goto :goto_15

    :cond_2d
    move v4, v6

    goto :goto_16

    :cond_2e
    :goto_15
    move v4, v9

    :goto_16
    return v4
.end method

.method public final d(Lm1/e$b;Lm1/e$b;Lm1/e$b;Lm1/e$b;)Z
    .locals 5

    .prologue
    const-string v0, "layoutHorizontal"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutVertical"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widgetHorizontal"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widgetVertical"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lm1/e$b;->C:Lm1/e$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p3, v0, :cond_1

    sget-object v3, Lm1/e$b;->D:Lm1/e$b;

    if-eq p3, v3, :cond_1

    sget-object v4, Lm1/e$b;->F:Lm1/e$b;

    if-ne p3, v4, :cond_0

    if-eq p1, v3, :cond_0

    goto :goto_0

    :cond_0
    move p1, v2

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v1

    :goto_1
    if-eq p4, v0, :cond_3

    sget-object p3, Lm1/e$b;->D:Lm1/e$b;

    if-eq p4, p3, :cond_3

    sget-object v0, Lm1/e$b;->F:Lm1/e$b;

    if-ne p4, v0, :cond_2

    if-eq p2, p3, :cond_2

    goto :goto_2

    :cond_2
    move p2, v2

    goto :goto_3

    :cond_3
    :goto_2
    move p2, v1

    :goto_3
    if-nez p1, :cond_5

    if-eqz p2, :cond_4

    goto :goto_4

    :cond_4
    move v1, v2

    :cond_5
    :goto_4
    return v1
.end method
