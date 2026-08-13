.class public final Lj1/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj1/b$a$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly7/k;)V
    .locals 0

    invoke-direct {p0}, Lj1/b$a;-><init>()V

    return-void
.end method

.method private final varargs b(Ljava/lang/String;[Ljava/lang/String;)I
    .locals 3

    .prologue
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p2, v1

    invoke-static {v2, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method private final f(Ljava/lang/String;Lj1/g;Ljava/lang/String;Lj1/b$d;Li1/f;)V
    .locals 20

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p5

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x68

    if-ne v0, v1, :cond_0

    invoke-virtual/range {p2 .. p2}, Lj1/g;->p()Lk1/i;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lj1/g;->B()Lk1/j;

    move-result-object v0

    goto :goto_0

    :goto_1
    invoke-virtual {v5, v8}, Lj1/a;->A0(Ljava/lang/Object;)V

    invoke-virtual/range {p5 .. p5}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :cond_1
    :goto_2
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "next(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v12, v0

    check-cast v12, Ljava/lang/String;

    invoke-virtual {v12}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v0, "style"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v9, v12}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    instance-of v1, v0, Li1/a;

    if-eqz v1, :cond_3

    move-object v1, v0

    check-cast v1, Li1/a;

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v2

    if-le v2, v10, :cond_3

    invoke-virtual {v1, v11}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v10}, Li1/b;->U(I)F

    move-result v1

    invoke-virtual {v5, v1}, Lk1/d;->a1(F)Lk1/d;

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    :goto_3
    const-string v1, "packed"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v0, Lj1/g$a;->H:Lj1/g$a;

    :goto_4
    invoke-virtual {v5, v0}, Lk1/d;->i1(Lj1/g$a;)Lk1/d;

    goto :goto_2

    :cond_4
    const-string v1, "spread_inside"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lj1/g$a;->G:Lj1/g$a;

    goto :goto_4

    :cond_5
    sget-object v0, Lj1/g$a;->F:Lj1/g$a;

    goto :goto_4

    :sswitch_1
    const-string v0, "start"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_2

    :sswitch_2
    const-string v0, "right"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_2

    :sswitch_3
    const-string v0, "left"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_2

    :sswitch_4
    const-string v0, "top"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_2

    :sswitch_5
    const-string v0, "end"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_2

    :sswitch_6
    const-string v0, "contains"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_2

    :cond_6
    invoke-virtual {v9, v12}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    instance-of v1, v0, Li1/a;

    if-eqz v1, :cond_e

    move-object v1, v0

    check-cast v1, Li1/a;

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v2

    if-ge v2, v10, :cond_7

    goto/16 :goto_a

    :cond_7
    move v0, v11

    :goto_5
    invoke-virtual {v1}, Li1/b;->size()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Li1/b;->Q(I)Li1/c;

    move-result-object v2

    instance-of v3, v2, Li1/a;

    if-eqz v3, :cond_c

    check-cast v2, Li1/a;

    invoke-virtual {v2}, Li1/b;->size()I

    move-result v3

    if-lez v3, :cond_d

    invoke-virtual {v2, v11}, Li1/b;->Q(I)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->e()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Li1/b;->size()I

    move-result v3

    const/4 v4, 0x2

    if-eq v3, v4, :cond_b

    const/4 v14, 0x3

    if-eq v3, v14, :cond_a

    const/4 v15, 0x4

    if-eq v3, v15, :cond_9

    const/4 v12, 0x6

    if-eq v3, v12, :cond_8

    const/high16 v14, 0x7fc00000    # Float.NaN

    :goto_6
    const/high16 v15, 0x7fc00000    # Float.NaN

    const/high16 v16, 0x7fc00000    # Float.NaN

    :goto_7
    const/high16 v17, 0x7fc00000    # Float.NaN

    const/high16 v18, 0x7fc00000    # Float.NaN

    goto :goto_8

    :cond_8
    invoke-virtual {v2, v10}, Li1/b;->U(I)F

    move-result v3

    invoke-virtual {v2, v4}, Li1/b;->U(I)F

    move-result v4

    invoke-direct {v6, v7, v4}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v4

    invoke-virtual {v2, v14}, Li1/b;->U(I)F

    move-result v12

    invoke-direct {v6, v7, v12}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v12

    invoke-virtual {v2, v15}, Li1/b;->U(I)F

    move-result v14

    invoke-direct {v6, v7, v14}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v14

    const/4 v15, 0x5

    invoke-virtual {v2, v15}, Li1/b;->U(I)F

    move-result v2

    invoke-direct {v6, v7, v2}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v2

    move/from16 v18, v2

    move v15, v4

    move/from16 v16, v12

    move/from16 v17, v14

    move v14, v3

    goto :goto_8

    :cond_9
    invoke-virtual {v2, v10}, Li1/b;->U(I)F

    move-result v3

    invoke-virtual {v2, v4}, Li1/b;->U(I)F

    move-result v4

    invoke-direct {v6, v7, v4}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v4

    invoke-virtual {v2, v14}, Li1/b;->U(I)F

    move-result v2

    invoke-direct {v6, v7, v2}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v2

    move/from16 v16, v2

    move v14, v3

    move v15, v4

    goto :goto_7

    :cond_a
    invoke-virtual {v2, v10}, Li1/b;->U(I)F

    move-result v3

    invoke-virtual {v2, v4}, Li1/b;->U(I)F

    move-result v2

    invoke-direct {v6, v7, v2}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v2

    move v15, v2

    move/from16 v16, v15

    move v14, v3

    goto :goto_7

    :cond_b
    invoke-virtual {v2, v10}, Li1/b;->U(I)F

    move-result v2

    move v14, v2

    goto :goto_6

    :goto_8
    move-object v12, v5

    invoke-virtual/range {v12 .. v18}, Lk1/d;->Z0(Ljava/lang/Object;FFFFF)V

    goto :goto_9

    :cond_c
    invoke-virtual {v2}, Li1/c;->e()Ljava/lang/String;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    aput-object v2, v3, v11

    invoke-virtual {v5, v3}, Lj1/e;->T0([Ljava/lang/Object;)Lj1/e;

    :cond_d
    :goto_9
    add-int/2addr v0, v10

    goto/16 :goto_5

    :cond_e
    :goto_a
    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " contains should be an array \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void

    :sswitch_7
    const-string v0, "bottom"

    invoke-virtual {v12, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_2

    :cond_f
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object v4, v5

    move-object v13, v5

    move-object v5, v12

    invoke-virtual/range {v0 .. v5}, Lj1/b$a;->h(Lj1/g;Lj1/b$d;Li1/f;Lj1/a;Ljava/lang/String;)V

    move-object v5, v13

    goto/16 :goto_2

    :cond_10
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_7
        -0x21d289e1 -> :sswitch_6
        0x188db -> :sswitch_5
        0x1c155 -> :sswitch_4
        0x32a007 -> :sswitch_3
        0x677c21c -> :sswitch_2
        0x68ac462 -> :sswitch_1
        0x68b1db1 -> :sswitch_0
    .end sparse-switch
.end method

.method private final l(Ljava/lang/String;Lj1/g;Ljava/lang/String;Lj1/b$d;Li1/f;)V
    .locals 16

    .prologue
    move-object/from16 v6, p0

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p5

    const/4 v10, 0x0

    move-object/from16 v0, p1

    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x76

    const/4 v11, 0x1

    if-ne v0, v1, :cond_0

    move v0, v11

    goto :goto_0

    :cond_0
    move v0, v10

    :goto_0
    invoke-virtual {v7, v8, v0}, Lj1/g;->i(Ljava/lang/Object;Z)Lk1/f;

    move-result-object v12

    invoke-virtual/range {p5 .. p5}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :catch_0
    :cond_1
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "next(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, 0x3

    const/high16 v2, 0x3f000000    # 0.5f

    const-string v3, ""

    const/4 v4, 0x2

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_e

    :sswitch_0
    const-string v0, "wrap"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto/16 :goto_e

    :cond_2
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v1, Lj1/g$g;->C:Lj1/g$g$a;

    invoke-virtual {v1, v0}, Lj1/g$g$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v12, v0}, Lk1/f;->u1(I)V

    goto :goto_1

    :sswitch_1
    const-string v0, "vGap"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_e

    :cond_3
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    invoke-virtual {v0}, Li1/c;->o()I

    move-result v0

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v0}, Lk1/f;->s1(I)V

    goto :goto_1

    :sswitch_2
    const-string v0, "type"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto/16 :goto_e

    :cond_4
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "hFlow"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    if-eqz v0, :cond_5

    invoke-virtual {v12, v10}, Lk1/f;->m1(I)V

    goto :goto_1

    :cond_5
    invoke-virtual {v12, v11}, Lk1/f;->m1(I)V

    goto :goto_1

    :sswitch_3
    const-string v0, "hGap"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_e

    :cond_6
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    invoke-virtual {v0}, Li1/c;->o()I

    move-result v0

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v0}, Lk1/f;->f1(I)V

    goto/16 :goto_1

    :sswitch_4
    const-string v0, "maxElement"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_e

    :cond_7
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    invoke-virtual {v0}, Li1/c;->o()I

    move-result v0

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v0}, Lk1/f;->l1(I)V

    goto/16 :goto_1

    :sswitch_5
    const-string v0, "contains"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    goto/16 :goto_e

    :cond_8
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    instance-of v2, v0, Li1/a;

    if-eqz v2, :cond_f

    move-object v2, v0

    check-cast v2, Li1/a;

    invoke-virtual {v2}, Li1/b;->size()I

    move-result v3

    if-ge v3, v11, :cond_9

    goto/16 :goto_5

    :cond_9
    move v0, v10

    :goto_2
    invoke-virtual {v2}, Li1/b;->size()I

    move-result v3

    if-ge v0, v3, :cond_1

    invoke-virtual {v2, v0}, Li1/b;->Q(I)Li1/c;

    move-result-object v3

    instance-of v5, v3, Li1/a;

    if-eqz v5, :cond_d

    check-cast v3, Li1/a;

    invoke-virtual {v3}, Li1/b;->size()I

    move-result v5

    if-lez v5, :cond_e

    invoke-virtual {v3, v10}, Li1/b;->Q(I)Li1/c;

    move-result-object v5

    invoke-virtual {v5}, Li1/c;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Li1/b;->size()I

    move-result v14

    if-eq v14, v4, :cond_c

    if-eq v14, v1, :cond_b

    const/4 v15, 0x4

    if-eq v14, v15, :cond_a

    const/high16 v3, 0x7fc00000    # Float.NaN

    const/high16 v14, 0x7fc00000    # Float.NaN

    const/high16 v15, 0x7fc00000    # Float.NaN

    goto :goto_3

    :cond_a
    invoke-virtual {v3, v11}, Li1/b;->U(I)F

    move-result v15

    invoke-virtual {v3, v4}, Li1/b;->U(I)F

    move-result v14

    invoke-direct {v6, v7, v14}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v14

    invoke-virtual {v3, v1}, Li1/b;->U(I)F

    move-result v3

    invoke-direct {v6, v7, v3}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v3

    goto :goto_3

    :cond_b
    invoke-virtual {v3, v11}, Li1/b;->U(I)F

    move-result v15

    invoke-virtual {v3, v4}, Li1/b;->U(I)F

    move-result v3

    invoke-direct {v6, v7, v3}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v3

    move v14, v3

    goto :goto_3

    :cond_c
    invoke-virtual {v3, v11}, Li1/b;->U(I)F

    move-result v3

    move v15, v3

    const/high16 v3, 0x7fc00000    # Float.NaN

    const/high16 v14, 0x7fc00000    # Float.NaN

    :goto_3
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v5, v15, v14, v3}, Lk1/f;->Z0(Ljava/lang/String;FFF)V

    goto :goto_4

    :cond_d
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Li1/c;->e()Ljava/lang/String;

    move-result-object v3

    new-array v5, v11, [Ljava/lang/Object;

    aput-object v3, v5, v10

    invoke-virtual {v12, v5}, Lj1/e;->T0([Ljava/lang/Object;)Lj1/e;

    :cond_e
    :goto_4
    add-int/2addr v0, v11

    goto :goto_2

    :cond_f
    :goto_5
    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " contains should be an array \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void

    :sswitch_6
    const-string v0, "vFlowBias"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    goto/16 :goto_e

    :cond_10
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    instance-of v1, v0, Li1/a;

    if-eqz v1, :cond_12

    move-object v1, v0

    check-cast v1, Li1/a;

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v3

    if-le v3, v11, :cond_12

    invoke-virtual {v1, v10}, Li1/b;->U(I)F

    move-result v0

    invoke-virtual {v1, v11}, Li1/b;->U(I)F

    move-result v3

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v5

    if-le v5, v4, :cond_11

    invoke-virtual {v1, v4}, Li1/b;->U(I)F

    move-result v1

    goto :goto_6

    :cond_11
    move v1, v2

    goto :goto_6

    :cond_12
    invoke-virtual {v0}, Li1/c;->g()F

    move-result v3

    move v0, v2

    move v1, v0

    :goto_6
    :try_start_0
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Lj1/a;->R0(F)Lj1/a;

    cmpg-float v3, v0, v2

    if-nez v3, :cond_13

    goto :goto_7

    :cond_13
    invoke-virtual {v12, v0}, Lk1/f;->c1(F)V

    :goto_7
    cmpg-float v0, v1, v2

    if-nez v0, :cond_14

    goto/16 :goto_1

    :cond_14
    invoke-virtual {v12, v1}, Lk1/f;->j1(F)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :sswitch_7
    const-string v0, "padding"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_e

    :cond_15
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    instance-of v2, v0, Li1/a;

    if-eqz v2, :cond_17

    move-object v2, v0

    check-cast v2, Li1/a;

    invoke-virtual {v2}, Li1/b;->size()I

    move-result v3

    if-le v3, v11, :cond_17

    invoke-virtual {v2, v10}, Li1/b;->X(I)I

    move-result v3

    invoke-virtual {v2, v11}, Li1/b;->X(I)I

    move-result v5

    invoke-virtual {v2}, Li1/b;->size()I

    move-result v14

    if-le v14, v4, :cond_16

    invoke-virtual {v2, v4}, Li1/b;->X(I)I

    move-result v2

    :try_start_1
    check-cast v0, Li1/a;

    invoke-virtual {v0, v1}, Li1/b;->X(I)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_8

    :catch_1
    move v0, v10

    goto :goto_8

    :cond_16
    move v2, v3

    move v0, v5

    goto :goto_8

    :cond_17
    invoke-virtual {v0}, Li1/c;->o()I

    move-result v3

    move v0, v3

    move v2, v0

    move v5, v2

    :goto_8
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Lk1/f;->o1(I)V

    invoke-virtual {v12, v5}, Lk1/f;->q1(I)V

    invoke-virtual {v12, v2}, Lk1/f;->p1(I)V

    invoke-virtual {v12, v0}, Lk1/f;->n1(I)V

    goto/16 :goto_1

    :sswitch_8
    const-string v0, "vStyle"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_e

    :cond_18
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    instance-of v1, v0, Li1/a;

    if-eqz v1, :cond_1a

    move-object v1, v0

    check-cast v1, Li1/a;

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v2

    if-le v2, v11, :cond_1a

    invoke-virtual {v1, v10}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v11}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v5

    if-le v5, v4, :cond_19

    invoke-virtual {v1, v4}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_19
    move-object v1, v3

    goto :goto_9

    :cond_1a
    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v2

    move-object v0, v3

    move-object v1, v0

    :goto_9
    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v4, Lj1/g$a;->C:Lj1/g$a$a;

    invoke-virtual {v4, v2}, Lj1/g$a$a;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v12, v2}, Lk1/f;->t1(I)V

    :cond_1b
    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1c

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v2, Lj1/g$a;->C:Lj1/g$a$a;

    invoke-virtual {v2, v0}, Lj1/g$a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v12, v0}, Lk1/f;->d1(I)V

    :cond_1c
    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v0, Lj1/g$a;->C:Lj1/g$a$a;

    invoke-virtual {v0, v1}, Lj1/g$a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v12, v0}, Lk1/f;->k1(I)V

    goto/16 :goto_1

    :sswitch_9
    const-string v0, "vAlign"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto/16 :goto_e

    :cond_1d
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x669119bb

    if-eq v2, v3, :cond_22

    const v1, -0x527265d5

    if-eq v2, v1, :cond_20

    const v1, 0x1c155

    if-eq v2, v1, :cond_1e

    goto :goto_a

    :cond_1e
    const-string v1, "top"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_a

    :cond_1f
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v10}, Lk1/f;->r1(I)V

    goto/16 :goto_1

    :cond_20
    const-string v1, "bottom"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    goto :goto_a

    :cond_21
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v11}, Lk1/f;->r1(I)V

    goto/16 :goto_1

    :cond_22
    const-string v2, "baseline"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_23

    :goto_a
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v4}, Lk1/f;->r1(I)V

    goto/16 :goto_1

    :cond_23
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v1}, Lk1/f;->r1(I)V

    goto/16 :goto_1

    :sswitch_a
    const-string v0, "hFlowBias"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    goto/16 :goto_e

    :cond_24
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    instance-of v1, v0, Li1/a;

    if-eqz v1, :cond_26

    move-object v1, v0

    check-cast v1, Li1/a;

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v3

    if-le v3, v11, :cond_26

    invoke-virtual {v1, v10}, Li1/b;->U(I)F

    move-result v0

    invoke-virtual {v1, v11}, Li1/b;->U(I)F

    move-result v3

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v5

    if-le v5, v4, :cond_25

    invoke-virtual {v1, v4}, Li1/b;->U(I)F

    move-result v1

    goto :goto_b

    :cond_25
    move v1, v2

    goto :goto_b

    :cond_26
    invoke-virtual {v0}, Li1/c;->g()F

    move-result v3

    move v0, v2

    move v1, v0

    :goto_b
    :try_start_2
    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Lj1/a;->e0(F)Lj1/a;

    cmpg-float v3, v0, v2

    if-nez v3, :cond_27

    goto :goto_c

    :cond_27
    invoke-virtual {v12, v0}, Lk1/f;->a1(F)V

    :goto_c
    cmpg-float v0, v1, v2

    if-nez v0, :cond_28

    goto/16 :goto_1

    :cond_28
    invoke-virtual {v12, v1}, Lk1/f;->h1(F)V
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_1

    :sswitch_b
    const-string v0, "hStyle"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_29

    goto/16 :goto_e

    :cond_29
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    instance-of v1, v0, Li1/a;

    if-eqz v1, :cond_2b

    move-object v1, v0

    check-cast v1, Li1/a;

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v2

    if-le v2, v11, :cond_2b

    invoke-virtual {v1, v10}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v11}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v5

    if-le v5, v4, :cond_2a

    invoke-virtual {v1, v4}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_d

    :cond_2a
    move-object v1, v3

    goto :goto_d

    :cond_2b
    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v2

    move-object v0, v3

    move-object v1, v0

    :goto_d
    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2c

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v4, Lj1/g$a;->C:Lj1/g$a$a;

    invoke-virtual {v4, v2}, Lj1/g$a$a;->a(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v12, v2}, Lk1/f;->g1(I)V

    :cond_2c
    invoke-static {v0, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2d

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v2, Lj1/g$a;->C:Lj1/g$a$a;

    invoke-virtual {v2, v0}, Lj1/g$a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v12, v0}, Lk1/f;->b1(I)V

    :cond_2d
    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v0, Lj1/g$a;->C:Lj1/g$a$a;

    invoke-virtual {v0, v1}, Lj1/g$a$a;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v12, v0}, Lk1/f;->i1(I)V

    goto/16 :goto_1

    :sswitch_c
    const-string v0, "hAlign"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2e

    :goto_e
    invoke-virtual/range {p2 .. p3}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v4, p5

    invoke-virtual/range {v0 .. v5}, Lj1/b$a;->a(Lj1/g;Lj1/b$d;Lj1/a;Li1/f;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_2e
    invoke-virtual {v9, v5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object v0

    const-string v1, "start"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v12, v10}, Lk1/f;->e1(I)V

    goto/16 :goto_1

    :cond_2f
    const-string v1, "end"

    invoke-static {v0, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v12}, Ly7/t;->c(Ljava/lang/Object;)V

    if-eqz v0, :cond_30

    invoke-virtual {v12, v11}, Lk1/f;->e1(I)V

    goto/16 :goto_1

    :cond_30
    invoke-virtual {v12, v4}, Lk1/f;->e1(I)V

    goto/16 :goto_1

    :cond_31
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x4ac15883 -> :sswitch_c
        -0x49bfd1d7 -> :sswitch_b
        -0x47693271 -> :sswitch_a
        -0x32dd7fd1 -> :sswitch_9
        -0x31dbf925 -> :sswitch_8
        -0x300fc3ef -> :sswitch_7
        -0x2bab2063 -> :sswitch_6
        -0x21d289e1 -> :sswitch_5
        -0x1d240708 -> :sswitch_4
        0x305d4e -> :sswitch_3
        0x368f3a -> :sswitch_2
        0x36ba80 -> :sswitch_1
        0x37d04a -> :sswitch_0
    .end sparse-switch
.end method

.method private final n(Ljava/lang/String;Lj1/g;Ljava/lang/String;Lj1/b$d;Li1/f;)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p2, p3, p1}, Lj1/g;->j(Ljava/lang/Object;Ljava/lang/String;)Lk1/g;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v4, ":"

    const-string v5, ","

    const/4 v6, 0x0

    const/4 v7, 0x2

    sparse-switch v3, :sswitch_data_0

    goto/16 :goto_4

    :sswitch_0
    const-string v3, "columnWeights"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_4

    :cond_1
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3, v5, v0, v7, v6}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v3}, Lk1/g;->Z0(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_1
    const-string v3, "columns"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->o()I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {p1, v3}, Lk1/g;->a1(I)V

    goto :goto_0

    :sswitch_2
    const-string v3, "rowWeights"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_4

    :cond_3
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3, v5, v0, v7, v6}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v3}, Lk1/g;->i1(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_3
    const-string v3, "spans"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto/16 :goto_4

    :cond_4
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3, v4, v0, v7, v6}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v3}, Lk1/g;->l1(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_4
    const-string v3, "skips"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto/16 :goto_4

    :cond_5
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3, v4, v0, v7, v6}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p1, v3}, Lk1/g;->k1(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_5
    const-string v3, "flags"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_4

    :cond_6
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_7

    invoke-virtual {p1, v3}, Lk1/g;->b1(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_7
    invoke-virtual {p5, v9}, Li1/b;->T(Ljava/lang/String;)Li1/a;

    move-result-object v3

    if-eqz v3, :cond_0

    const-string v4, ""

    move v5, v0

    :goto_1
    invoke-virtual {v3}, Li1/b;->size()I

    move-result v6

    if-ge v5, v6, :cond_9

    invoke-virtual {v3, v5}, Li1/b;->Q(I)Li1/c;

    move-result-object v6

    invoke-virtual {v6}, Li1/c;->e()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Li1/b;->size()I

    move-result v6

    sub-int/2addr v6, v1

    if-eq v5, v6, :cond_8

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "|"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_8
    add-int/2addr v5, v1

    goto :goto_1

    :cond_9
    invoke-virtual {p1, v4}, Lk1/g;->b1(Ljava/lang/String;)V

    goto/16 :goto_0

    :sswitch_6
    const-string v3, "vGap"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto/16 :goto_4

    :cond_a
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->g()F

    move-result v3

    invoke-direct {p0, p2, v3}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v3

    invoke-virtual {p1, v3}, Lk1/g;->m1(F)V

    goto/16 :goto_0

    :sswitch_7
    const-string v3, "rows"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_4

    :cond_b
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->o()I

    move-result v3

    if-lez v3, :cond_0

    invoke-virtual {p1, v3}, Lk1/g;->j1(I)V

    goto/16 :goto_0

    :sswitch_8
    const-string v3, "hGap"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto/16 :goto_4

    :cond_c
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->g()F

    move-result v3

    invoke-direct {p0, p2, v3}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v3

    invoke-virtual {p1, v3}, Lk1/g;->c1(F)V

    goto/16 :goto_0

    :sswitch_9
    const-string v3, "contains"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto/16 :goto_4

    :cond_d
    invoke-virtual {p5, v9}, Li1/b;->T(Ljava/lang/String;)Li1/a;

    move-result-object v3

    if-eqz v3, :cond_0

    move v4, v0

    :goto_2
    invoke-virtual {v3}, Li1/b;->size()I

    move-result v5

    if-ge v4, v5, :cond_0

    invoke-virtual {v3, v4}, Li1/b;->Q(I)Li1/c;

    move-result-object v5

    invoke-virtual {v5}, Li1/c;->e()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    new-array v6, v1, [Ljava/lang/Object;

    aput-object v5, v6, v0

    invoke-virtual {p1, v6}, Lj1/e;->T0([Ljava/lang/Object;)Lj1/e;

    add-int/2addr v4, v1

    goto :goto_2

    :sswitch_a
    const-string v3, "padding"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_4

    :cond_e
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    instance-of v4, v3, Li1/a;

    if-eqz v4, :cond_10

    move-object v4, v3

    check-cast v4, Li1/a;

    invoke-virtual {v4}, Li1/b;->size()I

    move-result v5

    if-le v5, v1, :cond_10

    invoke-virtual {v4, v0}, Li1/b;->X(I)I

    move-result v5

    invoke-virtual {v4, v1}, Li1/b;->X(I)I

    move-result v6

    invoke-virtual {v4}, Li1/b;->size()I

    move-result v8

    if-le v8, v7, :cond_f

    invoke-virtual {v4, v7}, Li1/b;->X(I)I

    move-result v4

    :try_start_0
    check-cast v3, Li1/a;

    const/4 v7, 0x3

    invoke-virtual {v3, v7}, Li1/b;->X(I)I

    move-result v3
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move v3, v0

    goto :goto_3

    :cond_f
    move v4, v5

    move v3, v6

    goto :goto_3

    :cond_10
    invoke-virtual {v3}, Li1/c;->o()I

    move-result v5

    move v3, v5

    move v4, v3

    move v6, v4

    :goto_3
    invoke-virtual {p1, v5}, Lk1/g;->g1(I)V

    invoke-virtual {p1, v6}, Lk1/g;->h1(I)V

    invoke-virtual {p1, v4}, Lk1/g;->f1(I)V

    invoke-virtual {p1, v3}, Lk1/g;->e1(I)V

    goto/16 :goto_0

    :sswitch_b
    const-string v3, "orientation"

    invoke-virtual {v9, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :goto_4
    invoke-virtual {p2, p3}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v7

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v4, p0

    move-object v5, p2

    move-object v6, p4

    move-object v8, p5

    invoke-virtual/range {v4 .. v9}, Lj1/b$a;->a(Lj1/g;Lj1/b$d;Lj1/a;Li1/f;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_11
    invoke-static {v9}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p5, v9}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v3

    invoke-virtual {v3}, Li1/c;->o()I

    move-result v3

    invoke-virtual {p1, v3}, Lk1/g;->d1(I)V

    goto/16 :goto_0

    :cond_12
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x55cd0a30 -> :sswitch_b
        -0x300fc3ef -> :sswitch_a
        -0x21d289e1 -> :sswitch_9
        0x305d4e -> :sswitch_8
        0x3581d9 -> :sswitch_7
        0x36ba80 -> :sswitch_6
        0x5cfee87 -> :sswitch_5
        0x686cad4 -> :sswitch_4
        0x688f269 -> :sswitch_3
        0x89c01c1 -> :sswitch_2
        0x389b97dd -> :sswitch_1
        0x793284c5 -> :sswitch_0
    .end sparse-switch
.end method

.method private final r(Li1/c;Lj1/a;)V
    .locals 10

    .prologue
    instance-of v0, p1, Li1/f;

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lh1/a;

    invoke-direct {v0}, Lh1/a;-><init>()V

    move-object v1, p1

    check-cast v1, Li1/f;

    invoke-virtual {v1}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v4, "relativeTo"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x25d

    :goto_1
    invoke-virtual {v0, v4, v3}, Lh1/a;->c(ILjava/lang/String;)V

    goto :goto_0

    :sswitch_1
    const-string v4, "pathArc"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v8, "below"

    const-string v9, "above"

    const-string v4, "none"

    const-string v5, "startVertical"

    const-string v6, "startHorizontal"

    const-string v7, "flip"

    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lj1/b$a;->b(Ljava/lang/String;[Ljava/lang/String;)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_3

    invoke-virtual {p1}, Li1/c;->s()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " pathArc = \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    const/16 v3, 0x25f

    invoke-virtual {v0, v3, v4}, Lh1/a;->b(II)V

    goto :goto_0

    :sswitch_2
    const-string v4, "quantize"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_0

    :cond_4
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v4

    instance-of v5, v4, Li1/a;

    const/16 v6, 0x262

    if-eqz v5, :cond_5

    check-cast v4, Li1/a;

    invoke-virtual {v4}, Li1/b;->size()I

    move-result v3

    if-lez v3, :cond_1

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Li1/b;->X(I)I

    move-result v5

    invoke-virtual {v0, v6, v5}, Lh1/a;->b(II)V

    const/4 v5, 0x1

    if-le v3, v5, :cond_1

    const/16 v6, 0x263

    invoke-virtual {v4, v5}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v6, v5}, Lh1/a;->c(ILjava/lang/String;)V

    const/4 v5, 0x2

    if-le v3, v5, :cond_1

    const/16 v3, 0x25a

    invoke-virtual {v4, v5}, Li1/b;->U(I)F

    move-result v4

    invoke-virtual {v0, v3, v4}, Lh1/a;->a(IF)V

    goto/16 :goto_0

    :cond_5
    invoke-virtual {v1, v3}, Li1/b;->Y(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v6, v3}, Lh1/a;->b(II)V

    goto/16 :goto_0

    :sswitch_3
    const-string v4, "easing"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_0

    :cond_6
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x25b

    goto/16 :goto_1

    :sswitch_4
    const-string v4, "stagger"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_0

    :cond_7
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Li1/b;->V(Ljava/lang/String;)F

    move-result v3

    const/16 v4, 0x258

    invoke-virtual {v0, v4, v3}, Lh1/a;->a(IF)V

    goto/16 :goto_0

    :cond_8
    :goto_2
    invoke-virtual {p2, v0}, Lj1/a;->B0(Lh1/a;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7119f053 -> :sswitch_4
        -0x4e19c2d5 -> :sswitch_3
        -0x4c979acf -> :sswitch_2
        -0x2f2d1013 -> :sswitch_1
        -0xe1f7d99 -> :sswitch_0
    .end sparse-switch
.end method

.method private final s(Lj1/g;Lj1/b$d;Li1/f;)V
    .locals 9

    .prologue
    invoke-virtual {p3}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p3, v3}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v1

    instance-of v2, v1, Li1/e;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Li1/c;->o()I

    move-result v1

    invoke-virtual {p2, v3, v1}, Lj1/b$d;->e(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Li1/f;

    if-eqz v2, :cond_0

    check-cast v1, Li1/f;

    const-string v2, "from"

    invoke-virtual {v1, v2}, Li1/b;->i0(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "to"

    invoke-virtual {v1, v4}, Li1/b;->i0(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v1, v2}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v2

    invoke-virtual {p2, v2}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result v5

    invoke-virtual {v1, v4}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v2

    invoke-virtual {p2, v2}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result v6

    const-string v2, "prefix"

    invoke-virtual {v1, v2}, Li1/b;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v2, "postfix"

    invoke-virtual {v1, v2}, Li1/b;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/high16 v1, 0x3f800000    # 1.0f

    move-object v2, p2

    move v4, v5

    move v5, v6

    move v6, v1

    invoke-virtual/range {v2 .. v8}, Lj1/b$d;->d(Ljava/lang/String;FFFLjava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v1, v2}, Li1/b;->i0(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "step"

    invoke-virtual {v1, v4}, Li1/b;->i0(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1, v2}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v2

    invoke-virtual {p2, v2}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result v2

    invoke-virtual {v1, v4}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v1

    invoke-virtual {p2, v1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result v1

    invoke-virtual {p2, v3, v2, v1}, Lj1/b$d;->c(Ljava/lang/String;FF)V

    goto :goto_0

    :cond_3
    const-string v2, "ids"

    invoke-virtual {v1, v2}, Li1/b;->i0(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v1, v2}, Li1/b;->S(Ljava/lang/String;)Li1/a;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Li1/b;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_4

    invoke-virtual {v1, v5}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {p2, v3, v2}, Lj1/b$d;->f(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    :cond_5
    const-string v2, "tag"

    invoke-virtual {v1, v2}, Li1/b;->i0(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v2}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lj1/g;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p2, v3, v1}, Lj1/b$d;->f(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method private final w(Lj1/g;F)F
    .locals 0

    invoke-virtual {p1}, Lj1/g;->h()Lj1/c;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lj1/c;->a(F)F

    move-result p1

    return p1
.end method


# virtual methods
.method public final a(Lj1/g;Lj1/b$d;Lj1/a;Li1/f;Ljava/lang/String;)V
    .locals 6

    .prologue
    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutVariables"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reference"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p5, :cond_22

    invoke-virtual {p5}, Ljava/lang/String;->hashCode()I

    move-result v0

    const-string v1, "parent"

    const/4 v2, 0x0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    const-string v0, "visibility"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p4, p5}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const p4, -0x715b4053

    if-eq p2, p4, :cond_5

    const p4, 0x30809f

    if-eq p2, p4, :cond_3

    const p4, 0x1bd1f072

    if-eq p2, p4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string p2, "visible"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_3

    :cond_2
    invoke-virtual {p3, v2}, Lj1/a;->S0(I)Lj1/a;

    goto/16 :goto_3

    :cond_3
    const-string p2, "gone"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_3

    :cond_4
    const/16 p1, 0x8

    invoke-virtual {p3, p1}, Lj1/a;->S0(I)Lj1/a;

    goto/16 :goto_3

    :cond_5
    const-string p2, "invisible"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_3

    :cond_6
    const/4 p1, 0x4

    invoke-virtual {p3, p1}, Lj1/a;->S0(I)Lj1/a;

    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p3, p1}, Lj1/a;->f(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_1
    const-string v0, "centerHorizontally"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    goto/16 :goto_2

    :cond_7
    invoke-virtual {p4, p5}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_8
    invoke-virtual {p1, p2}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lj1/a;->J0(Ljava/lang/Object;)Lj1/a;

    invoke-virtual {p3, p1}, Lj1/a;->y(Ljava/lang/Object;)Lj1/a;

    goto/16 :goto_3

    :sswitch_2
    const-string v0, "hWeight"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_2

    :cond_9
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->z0(F)V

    goto/16 :goto_3

    :sswitch_3
    const-string v0, "width"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_2

    :cond_a
    invoke-virtual {p1}, Lj1/g;->h()Lj1/c;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p4, p5, p1, p2}, Lj1/b$a;->j(Li1/f;Ljava/lang/String;Lj1/g;Lj1/c;)Lj1/d;

    move-result-object p1

    invoke-virtual {p3, p1}, Lj1/a;->G0(Lj1/d;)Lj1/a;

    goto/16 :goto_3

    :sswitch_4
    const-string v0, "vBias"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_2

    :cond_b
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->R0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_5
    const-string v0, "hBias"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    goto/16 :goto_2

    :cond_c
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->e0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_6
    const-string v0, "alpha"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    goto/16 :goto_2

    :cond_d
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    goto/16 :goto_0

    :sswitch_7
    const-string v0, "vWeight"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto/16 :goto_2

    :cond_e
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->E0(F)V

    goto/16 :goto_3

    :sswitch_8
    const-string v0, "hRtlBias"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto/16 :goto_2

    :cond_f
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p4

    invoke-virtual {p2, p4}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p2

    invoke-virtual {p1}, Lj1/g;->s()Z

    move-result p1

    if-eqz p1, :cond_10

    const/high16 p1, 0x3f800000    # 1.0f

    sub-float p2, p1, p2

    :cond_10
    invoke-virtual {p3, p2}, Lj1/a;->e0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_9
    const-string v0, "scaleY"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto/16 :goto_2

    :cond_11
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->v0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_a
    const-string v0, "scaleX"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    goto/16 :goto_2

    :cond_12
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->u0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_b
    const-string v0, "pivotY"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_13

    goto/16 :goto_2

    :cond_13
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->n0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_c
    const-string v0, "pivotX"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    goto/16 :goto_2

    :cond_14
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->m0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_d
    const-string v0, "motion"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto/16 :goto_2

    :cond_15
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-direct {p0, p1, p3}, Lj1/b$a;->r(Li1/c;Lj1/a;)V

    goto/16 :goto_3

    :sswitch_e
    const-string v0, "height"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    goto/16 :goto_2

    :cond_16
    invoke-virtual {p1}, Lj1/g;->h()Lj1/c;

    move-result-object p2

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p4, p5, p1, p2}, Lj1/b$a;->j(Li1/f;Ljava/lang/String;Lj1/g;Lj1/c;)Lj1/d;

    move-result-object p1

    invoke-virtual {p3, p1}, Lj1/a;->x0(Lj1/d;)Lj1/a;

    goto/16 :goto_3

    :sswitch_f
    const-string v0, "translationZ"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    goto/16 :goto_2

    :cond_17
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p4

    invoke-virtual {p2, p4}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p2

    invoke-direct {p0, p1, p2}, Lj1/b$a;->w(Lj1/g;F)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->Q0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_10
    const-string v0, "translationY"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    goto/16 :goto_2

    :cond_18
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p4

    invoke-virtual {p2, p4}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p2

    invoke-direct {p0, p1, p2}, Lj1/b$a;->w(Lj1/g;F)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->P0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_11
    const-string v0, "translationX"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    goto/16 :goto_2

    :cond_19
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p4

    invoke-virtual {p2, p4}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p2

    invoke-direct {p0, p1, p2}, Lj1/b$a;->w(Lj1/g;F)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->O0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_12
    const-string v0, "rotationZ"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    goto/16 :goto_2

    :cond_1a
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->t0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_13
    const-string v0, "rotationY"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    goto/16 :goto_2

    :cond_1b
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->s0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_14
    const-string v0, "rotationX"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_2

    :cond_1c
    invoke-virtual {p4, p5}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result p1

    invoke-virtual {p3, p1}, Lj1/a;->r0(F)Lj1/a;

    goto/16 :goto_3

    :sswitch_15
    const-string v0, "custom"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    goto :goto_2

    :cond_1d
    invoke-virtual {p0, p4, p3, p5}, Lj1/b$a;->i(Li1/f;Lj1/a;Ljava/lang/String;)V

    goto :goto_3

    :sswitch_16
    const-string v0, "center"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_2

    :cond_1e
    invoke-virtual {p4, p5}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1f

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_1f
    invoke-virtual {p1, p2}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Lj1/a;->J0(Ljava/lang/Object;)Lj1/a;

    invoke-virtual {p3, p1}, Lj1/a;->y(Ljava/lang/Object;)Lj1/a;

    :goto_1
    invoke-virtual {p3, p1}, Lj1/a;->N0(Ljava/lang/Object;)Lj1/a;

    invoke-virtual {p3, p1}, Lj1/a;->o(Ljava/lang/Object;)Lj1/a;

    goto :goto_3

    :sswitch_17
    const-string v0, "centerVertically"

    invoke-virtual {p5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_2

    :cond_20
    invoke-virtual {p4, p5}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_21

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :cond_21
    invoke-virtual {p1, p2}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object p1

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_22
    :goto_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p4

    move-object v4, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lj1/b$a;->h(Lj1/g;Lj1/b$d;Li1/f;Lj1/a;Ljava/lang/String;)V

    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x565a8e48 -> :sswitch_17
        -0x514d33ab -> :sswitch_16
        -0x5069748f -> :sswitch_15
        -0x4a771f66 -> :sswitch_14
        -0x4a771f65 -> :sswitch_13
        -0x4a771f64 -> :sswitch_12
        -0x490b9c39 -> :sswitch_11
        -0x490b9c38 -> :sswitch_10
        -0x490b9c37 -> :sswitch_f
        -0x48c76ed9 -> :sswitch_e
        -0x3fad404a -> :sswitch_d
        -0x3ae243aa -> :sswitch_c
        -0x3ae243a9 -> :sswitch_b
        -0x3621dfb2 -> :sswitch_a
        -0x3621dfb1 -> :sswitch_9
        -0xec32145 -> :sswitch_8
        -0x3aa8172 -> :sswitch_7
        0x589b15e -> :sswitch_6
        0x5d92341 -> :sswitch_5
        0x69e6c4f -> :sswitch_4
        0x6be2dc6 -> :sswitch_3
        0x17be4100 -> :sswitch_2
        0x53b069a6 -> :sswitch_1
        0x73b66312 -> :sswitch_0
    .end sparse-switch
.end method

.method public final c(Li1/f;)Ljava/lang/String;
    .locals 4

    .prologue
    const-string v0, "element"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, 0x368f3a

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "type"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v2}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final d(Lj1/g;Ljava/lang/String;Li1/f;)V
    .locals 8

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "state"

    invoke-static {p1, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "element"

    invoke-static {p3, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lj1/g;->s()Z

    move-result v2

    xor-int/2addr v2, v1

    sget-object v3, Lj1/g$d;->F:Lj1/g$d;

    invoke-virtual {p1, p2, v3}, Lj1/g;->b(Ljava/lang/Object;Lj1/g$d;)Lk1/c;

    move-result-object p2

    invoke-virtual {p3}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, -0x40737a52

    if-eq v5, v6, :cond_a

    const v6, -0x395ff881

    if-eq v5, v6, :cond_3

    const v6, -0x21d289e1

    if-eq v5, v6, :cond_1

    goto :goto_0

    :cond_1
    const-string v5, "contains"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p3, v4}, Li1/b;->T(Ljava/lang/String;)Li1/a;

    move-result-object v4

    if-eqz v4, :cond_0

    move v5, v0

    :goto_1
    invoke-virtual {v4}, Li1/b;->size()I

    move-result v6

    if-ge v5, v6, :cond_0

    invoke-virtual {v4, v5}, Li1/b;->Q(I)Li1/c;

    move-result-object v6

    invoke-virtual {v6}, Li1/c;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v6

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    new-array v7, v1, [Ljava/lang/Object;

    aput-object v6, v7, v0

    invoke-virtual {p2, v7}, Lj1/e;->T0([Ljava/lang/Object;)Lj1/e;

    add-int/2addr v5, v1

    goto :goto_1

    :cond_3
    const-string v5, "direction"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p3, v4}, Li1/b;->f0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v5, "start"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    if-eqz v2, :cond_6

    :cond_5
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v4, Lj1/g$d;->C:Lj1/g$d;

    :goto_2
    invoke-virtual {p2, v4}, Lk1/c;->Z0(Lj1/g$d;)V

    goto :goto_0

    :cond_6
    :goto_3
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v4, Lj1/g$d;->D:Lj1/g$d;

    goto :goto_2

    :sswitch_1
    const-string v5, "right"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_0

    :sswitch_2
    const-string v5, "left"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_0

    :sswitch_3
    const-string v5, "top"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7

    goto/16 :goto_0

    :cond_7
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v4, Lj1/g$d;->G:Lj1/g$d;

    goto :goto_2

    :sswitch_4
    const-string v5, "end"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    goto/16 :goto_0

    :cond_8
    if-eqz v2, :cond_5

    goto :goto_3

    :sswitch_5
    const-string v5, "bottom"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    goto/16 :goto_0

    :cond_9
    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    sget-object v4, Lj1/g$d;->H:Lj1/g$d;

    goto :goto_2

    :cond_a
    const-string v5, "margin"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p3, v4}, Li1/b;->W(Ljava/lang/String;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_0

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v4}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {p2, v4}, Lk1/c;->j0(Ljava/lang/Object;)Lj1/a;

    goto/16 :goto_0

    :cond_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x527265d5 -> :sswitch_5
        0x188db -> :sswitch_4
        0x1c155 -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch
.end method

.method public final e(ILj1/g;Lj1/b$d;Li1/a;)V
    .locals 9

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "state"

    invoke-static {p2, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "margins"

    invoke-static {p3, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "helper"

    invoke-static {p4, v2}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p1, :cond_0

    invoke-virtual {p2}, Lj1/g;->p()Lk1/i;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lj1/g;->B()Lk1/j;

    move-result-object p1

    :goto_0
    invoke-virtual {p4, v1}, Li1/b;->Q(I)Li1/c;

    move-result-object v2

    instance-of v3, v2, Li1/a;

    if-eqz v3, :cond_a

    check-cast v2, Li1/a;

    invoke-virtual {v2}, Li1/b;->size()I

    move-result v3

    if-ge v3, v1, :cond_1

    goto/16 :goto_7

    :cond_1
    invoke-virtual {v2}, Li1/b;->size()I

    move-result v3

    move v4, v0

    :goto_1
    if-ge v4, v3, :cond_2

    invoke-virtual {v2, v4}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v5

    new-array v6, v1, [Ljava/lang/Object;

    aput-object v5, v6, v0

    invoke-virtual {p1, v6}, Lj1/e;->T0([Ljava/lang/Object;)Lj1/e;

    add-int/2addr v4, v1

    goto :goto_1

    :cond_2
    invoke-virtual {p4}, Li1/b;->size()I

    move-result v2

    const/4 v3, 0x2

    if-le v2, v3, :cond_a

    invoke-virtual {p4, v3}, Li1/b;->Q(I)Li1/c;

    move-result-object p4

    instance-of v2, p4, Li1/f;

    if-eqz v2, :cond_3

    check-cast p4, Li1/f;

    goto :goto_2

    :cond_3
    const/4 p4, 0x0

    :goto_2
    if-nez p4, :cond_4

    return-void

    :cond_4
    invoke-virtual {p4}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, 0x68b1db1

    if-eq v2, v3, :cond_5

    goto :goto_6

    :cond_5
    const-string v2, "style"

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static {v7}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p4, v7}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v2

    instance-of v3, v2, Li1/a;

    if-eqz v3, :cond_6

    move-object v3, v2

    check-cast v3, Li1/a;

    invoke-virtual {v3}, Li1/b;->size()I

    move-result v4

    if-le v4, v1, :cond_6

    invoke-virtual {v3, v0}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v1}, Li1/b;->U(I)F

    move-result v3

    invoke-virtual {p1, v3}, Lk1/d;->a1(F)Lk1/d;

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Li1/c;->e()Ljava/lang/String;

    move-result-object v2

    :goto_4
    const-string v3, "packed"

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v2, Lj1/g$a;->H:Lj1/g$a;

    :goto_5
    invoke-virtual {p1, v2}, Lk1/d;->i1(Lj1/g$a;)Lk1/d;

    goto :goto_3

    :cond_7
    const-string v3, "spread_inside"

    invoke-static {v2, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    sget-object v2, Lj1/g$a;->G:Lj1/g$a;

    goto :goto_5

    :cond_8
    sget-object v2, Lj1/g$a;->F:Lj1/g$a;

    goto :goto_5

    :cond_9
    :goto_6
    const-string v2, "null cannot be cast to non-null type androidx.constraintlayout.core.state.ConstraintReference"

    invoke-static {p1, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p1

    invoke-virtual/range {v2 .. v7}, Lj1/b$a;->h(Lj1/g;Lj1/b$d;Li1/f;Lj1/a;Ljava/lang/String;)V

    goto :goto_3

    :cond_a
    :goto_7
    return-void
.end method

.method public final g(Ljava/lang/String;)J
    .locals 4

    .prologue
    const-string v0, "value"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "#"

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, LS8/r;->V(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FF"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    const/16 v0, 0x10

    invoke-static {v0}, LS8/a;->a(I)I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v0

    goto :goto_0

    :cond_1
    const-wide/16 v0, -0x1

    :goto_0
    return-wide v0
.end method

.method public final h(Lj1/g;Lj1/b$d;Li1/f;Lj1/a;Ljava/lang/String;)V
    .locals 23

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    const-string v6, "state"

    invoke-static {v1, v6}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "layoutVariables"

    invoke-static {v2, v6}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "element"

    invoke-static {v3, v6}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "reference"

    invoke-static {v4, v6}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lj1/g;->s()Z

    move-result v6

    xor-int/lit8 v7, v6, 0x1

    invoke-virtual {v3, v5}, Li1/b;->T(Ljava/lang/String;)Li1/a;

    move-result-object v8

    const-string v9, "parent"

    const-string v10, "end"

    const-string v11, "start"

    const-string v12, "baseline"

    const-string v13, "bottom"

    const-string v14, "top"

    if-eqz v8, :cond_28

    invoke-virtual {v8}, Li1/b;->size()I

    move-result v15

    move/from16 v16, v6

    const/4 v6, 0x1

    if-le v15, v6, :cond_28

    const/4 v15, 0x0

    invoke-virtual {v8, v15}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v8, v6}, Li1/b;->g0(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v8}, Li1/b;->size()I

    move-result v6

    const/16 v18, 0x0

    move/from16 v19, v7

    const/4 v7, 0x2

    if-le v6, v7, :cond_0

    invoke-virtual {v8, v7}, Li1/b;->c0(I)Li1/c;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v6}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result v6

    invoke-direct {v0, v1, v6}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v6

    goto :goto_0

    :cond_0
    move/from16 v6, v18

    :goto_0
    invoke-virtual {v8}, Li1/b;->size()I

    move-result v7

    move/from16 v20, v6

    const/4 v6, 0x3

    if-le v7, v6, :cond_1

    invoke-virtual {v8, v6}, Li1/b;->c0(I)Li1/c;

    move-result-object v6

    invoke-static {v6}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v6}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result v6

    invoke-direct {v0, v1, v6}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v6

    goto :goto_1

    :cond_1
    move/from16 v6, v18

    :goto_1
    invoke-static {v3, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_2
    invoke-virtual {v1, v3}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v3

    const-string v7, "left"

    const-string v9, "right"

    if-eqz v5, :cond_1e

    invoke-virtual/range {p5 .. p5}, Ljava/lang/String;->hashCode()I

    move-result v21

    move/from16 v22, v6

    const v6, -0x669119bb

    sparse-switch v21, :sswitch_data_0

    :cond_3
    :goto_2
    const/4 v2, 0x1

    goto/16 :goto_4

    :sswitch_0
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_2

    :cond_4
    move/from16 v1, v19

    :goto_3
    const/4 v2, 0x1

    const/16 v17, 0x1

    goto/16 :goto_5

    :sswitch_1
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    goto :goto_3

    :sswitch_2
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_2

    :cond_6
    const/4 v1, 0x1

    goto :goto_3

    :sswitch_3
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    if-eqz v15, :cond_3

    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v2

    if-eq v2, v6, :cond_c

    const v5, -0x527265d5

    if-eq v2, v5, :cond_a

    const v1, 0x1c155

    if-eq v2, v1, :cond_8

    goto :goto_2

    :cond_8
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->N0(Ljava/lang/Object;)Lj1/a;

    goto :goto_2

    :cond_a
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_2

    :cond_b
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->M0(Ljava/lang/Object;)Lj1/a;

    goto :goto_2

    :cond_c
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_2

    :cond_d
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lj1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->L0(Ljava/lang/Object;)Lj1/a;

    goto :goto_2

    :sswitch_4
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_2

    :cond_e
    move/from16 v1, v16

    goto :goto_3

    :sswitch_5
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto/16 :goto_2

    :cond_f
    if-eqz v15, :cond_3

    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v2

    if-eq v2, v6, :cond_14

    const v5, -0x527265d5

    if-eq v2, v5, :cond_12

    const v1, 0x1c155

    if-eq v2, v1, :cond_10

    goto/16 :goto_2

    :cond_10
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_2

    :cond_11
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->p(Ljava/lang/Object;)Lj1/a;

    goto/16 :goto_2

    :cond_12
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_2

    :cond_13
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->o(Ljava/lang/Object;)Lj1/a;

    goto/16 :goto_2

    :cond_14
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto/16 :goto_2

    :cond_15
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lj1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->n(Ljava/lang/Object;)Lj1/a;

    goto/16 :goto_2

    :sswitch_6
    const-string v6, "circular"

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    goto/16 :goto_2

    :cond_16
    const/4 v5, 0x1

    invoke-virtual {v8, v5}, Li1/b;->Q(I)Li1/c;

    move-result-object v6

    invoke-virtual {v2, v6}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result v6

    invoke-virtual {v8}, Li1/b;->size()I

    move-result v12

    const/4 v13, 0x2

    if-le v12, v13, :cond_17

    invoke-virtual {v8, v13}, Li1/b;->c0(I)Li1/c;

    move-result-object v8

    invoke-static {v8}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v8}, Lj1/b$d;->a(Ljava/lang/Object;)F

    move-result v2

    invoke-direct {v0, v1, v2}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v18

    :cond_17
    move/from16 v1, v18

    invoke-virtual {v4, v3, v6, v1}, Lj1/a;->q(Ljava/lang/Object;FF)Lj1/a;

    move v2, v5

    goto/16 :goto_4

    :sswitch_7
    const/4 v2, 0x1

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    goto/16 :goto_4

    :cond_18
    if-eqz v15, :cond_1f

    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v5

    if-eq v5, v6, :cond_1d

    const v6, -0x527265d5

    if-eq v5, v6, :cond_1b

    const v6, 0x1c155

    if-eq v5, v6, :cond_19

    goto :goto_4

    :cond_19
    invoke-virtual {v15, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    goto :goto_4

    :cond_1a
    invoke-virtual/range {p4 .. p4}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Lj1/g;->c(Ljava/lang/Object;)V

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->l(Ljava/lang/Object;)Lj1/a;

    goto :goto_4

    :cond_1b
    invoke-virtual {v15, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1c

    goto :goto_4

    :cond_1c
    invoke-virtual/range {p4 .. p4}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Lj1/g;->c(Ljava/lang/Object;)V

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->k(Ljava/lang/Object;)Lj1/a;

    goto :goto_4

    :cond_1d
    invoke-virtual {v15, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1f

    invoke-virtual/range {p4 .. p4}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Lj1/g;->c(Ljava/lang/Object;)V

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v5}, Lj1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lj1/a;->j(Ljava/lang/Object;)Lj1/a;

    goto :goto_4

    :cond_1e
    move/from16 v22, v6

    goto/16 :goto_2

    :cond_1f
    :goto_4
    move v1, v2

    const/16 v17, 0x0

    :goto_5
    if-eqz v17, :cond_27

    if-eqz v15, :cond_22

    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_1

    goto :goto_6

    :sswitch_8
    invoke-virtual {v15, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_20

    goto :goto_6

    :cond_20
    move/from16 v6, v19

    goto :goto_7

    :sswitch_9
    invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_21

    goto :goto_6

    :cond_21
    const/4 v6, 0x0

    goto :goto_7

    :sswitch_a
    invoke-virtual {v15, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    :cond_22
    :goto_6
    move v6, v2

    goto :goto_7

    :sswitch_b
    invoke-virtual {v15, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    goto :goto_6

    :cond_23
    move/from16 v6, v16

    :goto_7
    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    if-eqz v1, :cond_25

    if-eqz v6, :cond_24

    invoke-virtual {v4, v3}, Lj1/a;->g0(Ljava/lang/Object;)Lj1/a;

    goto :goto_8

    :cond_24
    invoke-virtual {v4, v3}, Lj1/a;->h0(Ljava/lang/Object;)Lj1/a;

    goto :goto_8

    :cond_25
    if-eqz v6, :cond_26

    invoke-virtual {v4, v3}, Lj1/a;->p0(Ljava/lang/Object;)Lj1/a;

    goto :goto_8

    :cond_26
    invoke-virtual {v4, v3}, Lj1/a;->q0(Ljava/lang/Object;)Lj1/a;

    :cond_27
    :goto_8
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v4, v1}, Lj1/a;->j0(Ljava/lang/Object;)Lj1/a;

    move-result-object v1

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, Lj1/a;->l0(Ljava/lang/Object;)Lj1/a;

    goto/16 :goto_a

    :cond_28
    move/from16 v19, v7

    invoke-virtual {v3, v5}, Li1/b;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_31

    invoke-static {v2, v9}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_29

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_29
    invoke-virtual {v1, v2}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v2

    if-eqz v5, :cond_31

    invoke-virtual/range {p5 .. p5}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_2

    goto :goto_a

    :sswitch_c
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    goto :goto_a

    :cond_2a
    if-eqz v19, :cond_2c

    :cond_2b
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lj1/a;->g0(Ljava/lang/Object;)Lj1/a;

    goto :goto_a

    :cond_2c
    :goto_9
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lj1/a;->q0(Ljava/lang/Object;)Lj1/a;

    goto :goto_a

    :sswitch_d
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    goto :goto_a

    :cond_2d
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lj1/a;->N0(Ljava/lang/Object;)Lj1/a;

    goto :goto_a

    :sswitch_e
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto :goto_a

    :cond_2e
    if-eqz v19, :cond_2b

    goto :goto_9

    :sswitch_f
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    goto :goto_a

    :cond_2f
    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lj1/a;->o(Ljava/lang/Object;)Lj1/a;

    goto :goto_a

    :sswitch_10
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_30

    goto :goto_a

    :cond_30
    invoke-virtual/range {p4 .. p4}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lj1/g;->c(Ljava/lang/Object;)V

    invoke-static {v2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lj1/a;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lj1/g;->c(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lj1/a;->j(Ljava/lang/Object;)Lj1/a;

    :cond_31
    :goto_a
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_7
        -0x594af961 -> :sswitch_6
        -0x527265d5 -> :sswitch_5
        0x188db -> :sswitch_4
        0x1c155 -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x188db -> :sswitch_b
        0x32a007 -> :sswitch_a
        0x677c21c -> :sswitch_9
        0x68ac462 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x669119bb -> :sswitch_10
        -0x527265d5 -> :sswitch_f
        0x188db -> :sswitch_e
        0x1c155 -> :sswitch_d
        0x68ac462 -> :sswitch_c
    .end sparse-switch
.end method

.method public final i(Li1/f;Lj1/a;Ljava/lang/String;)V
    .locals 5

    .prologue
    const-string v0, "element"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reference"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Li1/b;->b0(Ljava/lang/String;)Li1/f;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_1
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v1

    instance-of v2, v1, Li1/e;

    if-eqz v2, :cond_2

    invoke-virtual {v1}, Li1/c;->g()F

    move-result v1

    invoke-virtual {p2, v0, v1}, Lj1/a;->e(Ljava/lang/String;F)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, Li1/h;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Li1/c;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lj1/b$a;->g(Ljava/lang/String;)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    long-to-int v1, v1

    invoke-virtual {p2, v0, v1}, Lj1/a;->d(Ljava/lang/String;I)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final j(Li1/f;Ljava/lang/String;Lj1/g;Lj1/c;)Lj1/d;
    .locals 4

    .prologue
    const-string v0, "element"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dpToPixels"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v0

    sget-object v1, Lj1/d;->i:Lj1/d$a;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lj1/d$a;->a(I)Lj1/d;

    move-result-object v2

    instance-of v3, v0, Li1/h;

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Li1/c;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lj1/b$a;->k(Ljava/lang/String;)Lj1/d;

    move-result-object v2

    goto/16 :goto_1

    :cond_0
    instance-of v3, v0, Li1/e;

    if-eqz v3, :cond_1

    invoke-virtual {p1, p2}, Li1/b;->V(Ljava/lang/String;)F

    move-result p1

    invoke-interface {p4, p1}, Lj1/c;->a(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p3, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v1, p1}, Lj1/d$a;->a(I)Lj1/d;

    move-result-object v2

    goto :goto_1

    :cond_1
    instance-of p1, v0, Li1/f;

    if-eqz p1, :cond_6

    check-cast v0, Li1/f;

    const-string p1, "value"

    invoke-virtual {v0, p1}, Li1/b;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lj1/b$a;->k(Ljava/lang/String;)Lj1/d;

    move-result-object v2

    :cond_2
    const-string p1, "min"

    invoke-virtual {v0, p1}, Li1/b;->d0(Ljava/lang/String;)Li1/c;

    move-result-object p1

    const-string p2, "WRAP_DIMENSION"

    if-eqz p1, :cond_4

    instance-of v1, p1, Li1/e;

    if-eqz v1, :cond_3

    check-cast p1, Li1/e;

    invoke-virtual {p1}, Li1/e;->g()F

    move-result p1

    invoke-interface {p4, p1}, Lj1/c;->a(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p3, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v2, p1}, Lj1/d;->g(I)Lj1/d;

    goto :goto_0

    :cond_3
    instance-of p1, p1, Li1/h;

    if-eqz p1, :cond_4

    invoke-virtual {v2, p2}, Lj1/d;->h(Ljava/lang/Object;)Lj1/d;

    :cond_4
    :goto_0
    const-string p1, "max"

    invoke-virtual {v0, p1}, Li1/b;->d0(Ljava/lang/String;)Li1/c;

    move-result-object p1

    if-eqz p1, :cond_6

    instance-of v0, p1, Li1/e;

    if-eqz v0, :cond_5

    check-cast p1, Li1/e;

    invoke-virtual {p1}, Li1/e;->g()F

    move-result p1

    invoke-interface {p4, p1}, Lj1/c;->a(F)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p3, p1}, Lj1/g;->e(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {v2, p1}, Lj1/d;->e(I)Lj1/d;

    goto :goto_1

    :cond_5
    instance-of p1, p1, Li1/h;

    if-eqz p1, :cond_6

    invoke-virtual {v2, p2}, Lj1/d;->f(Ljava/lang/Object;)Lj1/d;

    :cond_6
    :goto_1
    return-object v2
.end method

.method public final k(Ljava/lang/String;)Lj1/d;
    .locals 13

    .prologue
    const-string v0, "dimensionString"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lj1/d;->i:Lj1/d$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lj1/d$a;->a(I)Lj1/d;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const-string v4, "SPREAD_DIMENSION"

    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v3, "wrap"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lj1/d$a;->g()Lj1/d;

    move-result-object v2

    goto/16 :goto_1

    :sswitch_1
    const-string v3, "spread"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v4}, Lj1/d$a;->f(Ljava/lang/Object;)Lj1/d;

    move-result-object v2

    goto :goto_1

    :sswitch_2
    const-string v3, "parent"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lj1/d$a;->c()Lj1/d;

    move-result-object v2

    goto :goto_1

    :sswitch_3
    const-string v3, "preferWrap"

    invoke-virtual {p1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    :goto_0
    const-string v3, "%"

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-static {p1, v3, v1, v5, v6}, LS8/r;->J(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 v11, 0x6

    const/4 v12, 0x0

    const/16 v8, 0x25

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v12}, LS8/r;->o0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    move-result v2

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    const-string v2, "substring(...)"

    invoke-static {p1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr p1, v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Lj1/d$a;->d(Ljava/lang/Object;F)Lj1/d;

    move-result-object p1

    invoke-virtual {p1, v1}, Lj1/d;->k(I)Lj1/d;

    move-result-object v2

    goto :goto_1

    :cond_3
    const-string v3, ":"

    invoke-static {p1, v3, v1, v5, v6}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, p1}, Lj1/d$a;->e(Ljava/lang/String;)Lj1/d;

    move-result-object p1

    invoke-virtual {p1, v4}, Lj1/d;->l(Ljava/lang/Object;)Lj1/d;

    move-result-object v2

    goto :goto_1

    :cond_4
    const-string p1, "WRAP_DIMENSION"

    invoke-virtual {v0, p1}, Lj1/d$a;->f(Ljava/lang/Object;)Lj1/d;

    move-result-object v2

    :cond_5
    :goto_1
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x57099186 -> :sswitch_3
        -0x3b54f756 -> :sswitch_2
        -0x35630e8d -> :sswitch_1
        0x37d04a -> :sswitch_0
    .end sparse-switch
.end method

.method public final m(Lj1/g;Lj1/b$d;Li1/f;)V
    .locals 5

    .prologue
    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutVariables"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p3, v1}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v2

    invoke-virtual {p2, v1}, Lj1/b$d;->b(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_0

    instance-of v3, v2, Li1/f;

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    move-object v4, v2

    check-cast v4, Li1/f;

    invoke-virtual {p0, p1, p2, v3, v4}, Lj1/b$a;->u(Lj1/g;Lj1/b$d;Ljava/lang/String;Li1/f;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final o(ILj1/g;Li1/a;)V
    .locals 1

    .prologue
    const-string v0, "state"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helper"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Li1/b;->Q(I)Li1/c;

    move-result-object p3

    instance-of v0, p3, Li1/f;

    if-eqz v0, :cond_0

    check-cast p3, Li1/f;

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    if-nez p3, :cond_1

    return-void

    :cond_1
    const-string v0, "id"

    invoke-virtual {p3, v0}, Li1/b;->h0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0, p1, p2, v0, p3}, Lj1/b$a;->p(ILj1/g;Ljava/lang/String;Li1/f;)V

    return-void
.end method

.method public final p(ILj1/g;Ljava/lang/String;Li1/f;)V
    .locals 16

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    const-string v3, "state"

    invoke-static {v1, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "params"

    invoke-static {v2, v3}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p4 .. p4}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual/range {p2 .. p3}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object v4

    if-nez p1, :cond_0

    invoke-virtual/range {p2 .. p3}, Lj1/g;->q(Ljava/lang/Object;)Lk1/h;

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p3}, Lj1/g;->C(Ljava/lang/Object;)Lk1/h;

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lj1/g;->s()Z

    move-result v5

    const/4 v7, 0x1

    if-eqz v5, :cond_2

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move v5, v7

    :goto_2
    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lj1/a;->c()Lk1/e;

    move-result-object v4

    invoke-static {v4}, Ly7/t;->c(Ljava/lang/Object;)V

    check-cast v4, Lk1/h;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v8, 0x0

    move v10, v7

    const/4 v9, 0x0

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v12

    const-string v13, "end"

    const-string v14, "left"

    const-string v15, "right"

    const-string v6, "start"

    sparse-switch v12, :sswitch_data_0

    const/4 v11, 0x0

    goto :goto_3

    :sswitch_0
    invoke-virtual {v11, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v11}, Li1/b;->V(Ljava/lang/String;)F

    move-result v6

    invoke-direct {v0, v1, v6}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v8

    move v10, v5

    goto :goto_3

    :sswitch_1
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v11}, Li1/b;->V(Ljava/lang/String;)F

    move-result v6

    invoke-direct {v0, v1, v6}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v8

    const/4 v10, 0x0

    goto :goto_3

    :sswitch_2
    invoke-virtual {v11, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v11}, Li1/b;->V(Ljava/lang/String;)F

    move-result v6

    invoke-direct {v0, v1, v6}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v8

    move v10, v7

    goto :goto_3

    :sswitch_3
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v11}, Li1/b;->V(Ljava/lang/String;)F

    move-result v6

    invoke-direct {v0, v1, v6}, Lj1/b$a;->w(Lj1/g;F)F

    move-result v8

    xor-int/lit8 v10, v5, 0x1

    goto :goto_3

    :sswitch_4
    const-string v12, "percent"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v2, v11}, Li1/b;->T(Ljava/lang/String;)Li1/a;

    move-result-object v9

    if-nez v9, :cond_8

    invoke-static {v11}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {v2, v11}, Li1/b;->V(Ljava/lang/String;)F

    move-result v8

    move v9, v7

    move v10, v9

    goto/16 :goto_3

    :cond_8
    invoke-virtual {v9}, Li1/b;->size()I

    move-result v11

    if-le v11, v7, :cond_a

    const/4 v11, 0x0

    invoke-virtual {v9, v11}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v7}, Li1/b;->U(I)F

    move-result v9

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_1

    goto :goto_6

    :sswitch_5
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_6

    :cond_9
    move v10, v5

    :goto_4
    move v8, v9

    :cond_a
    :goto_5
    move v9, v7

    goto/16 :goto_3

    :sswitch_6
    invoke-virtual {v8, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_6

    :cond_b
    move v8, v9

    move v10, v11

    goto :goto_5

    :sswitch_7
    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    goto :goto_6

    :cond_c
    move v10, v7

    move v8, v9

    move v9, v10

    goto/16 :goto_3

    :sswitch_8
    invoke-virtual {v8, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_d

    :goto_6
    goto :goto_4

    :cond_d
    xor-int/lit8 v6, v5, 0x1

    move v10, v6

    goto :goto_4

    :cond_e
    if-eqz v9, :cond_10

    if-eqz v10, :cond_f

    invoke-virtual {v4, v8}, Lk1/h;->e(F)Lk1/h;

    goto :goto_7

    :cond_f
    const/high16 v1, 0x3f800000    # 1.0f

    sub-float/2addr v1, v8

    invoke-virtual {v4, v1}, Lk1/h;->e(F)Lk1/h;

    goto :goto_7

    :cond_10
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    if-eqz v10, :cond_11

    invoke-virtual {v4, v1}, Lk1/h;->h(Ljava/lang/Object;)Lk1/h;

    goto :goto_7

    :cond_11
    invoke-virtual {v4, v1}, Lk1/h;->d(Ljava/lang/Object;)Lk1/h;

    :goto_7
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x28779bbb -> :sswitch_4
        0x188db -> :sswitch_3
        0x32a007 -> :sswitch_2
        0x677c21c -> :sswitch_1
        0x68ac462 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x188db -> :sswitch_8
        0x32a007 -> :sswitch_7
        0x677c21c -> :sswitch_6
        0x68ac462 -> :sswitch_5
    .end sparse-switch
.end method

.method public final q(Lj1/g;Lj1/b$d;Li1/a;)V
    .locals 7

    .prologue
    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutVariables"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Li1/b;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_5

    invoke-virtual {p3, v2}, Li1/b;->Q(I)Li1/c;

    move-result-object v3

    instance-of v4, v3, Li1/a;

    if-eqz v4, :cond_4

    check-cast v3, Li1/a;

    invoke-virtual {v3}, Li1/b;->size()I

    move-result v4

    const/4 v5, 0x1

    if-le v4, v5, :cond_4

    invoke-virtual {v3, v1}, Li1/b;->e0(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v5, "hGuideline"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1, p1, v3}, Lj1/b$a;->o(ILj1/g;Li1/a;)V

    goto :goto_1

    :sswitch_1
    const-string v6, "vChain"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v5, p1, p2, v3}, Lj1/b$a;->e(ILj1/g;Lj1/b$d;Li1/a;)V

    goto :goto_1

    :sswitch_2
    const-string v5, "hChain"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1, p1, p2, v3}, Lj1/b$a;->e(ILj1/g;Lj1/b$d;Li1/a;)V

    goto :goto_1

    :sswitch_3
    const-string v6, "vGuideline"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0, v5, p1, v3}, Lj1/b$a;->o(ILj1/g;Li1/a;)V

    :cond_4
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6a6caee6 -> :sswitch_3
        -0x4aa718c7 -> :sswitch_2
        -0x32c34015 -> :sswitch_1
        0x398f2168 -> :sswitch_0
    .end sparse-switch
.end method

.method public final t(Lj1/g;Lj1/b$d;Lj1/a;Li1/f;)V
    .locals 8

    .prologue
    const-string v0, "reference"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lj1/a;->d0()Lj1/d;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lj1/d;->i:Lj1/d$a;

    invoke-virtual {v0}, Lj1/d$a;->g()Lj1/d;

    move-result-object v0

    invoke-virtual {p3, v0}, Lj1/a;->G0(Lj1/d;)Lj1/a;

    :cond_0
    invoke-virtual {p3}, Lj1/a;->B()Lj1/d;

    move-result-object v0

    if-nez v0, :cond_1

    sget-object v0, Lj1/d;->i:Lj1/d$a;

    invoke-virtual {v0}, Lj1/d$a;->g()Lj1/d;

    move-result-object v0

    invoke-virtual {p3, v0}, Lj1/a;->x0(Lj1/d;)Lj1/a;

    :cond_1
    invoke-virtual {p4}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v7, v1

    check-cast v7, Ljava/lang/String;

    invoke-static {p1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {p2}, Ly7/t;->c(Ljava/lang/Object;)V

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v7}, Lj1/b$a;->a(Lj1/g;Lj1/b$d;Lj1/a;Li1/f;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final u(Lj1/g;Lj1/b$d;Ljava/lang/String;Li1/f;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "element"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p3}, Lj1/g;->d(Ljava/lang/Object;)Lj1/a;

    move-result-object p3

    invoke-static {p3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-virtual {p0, p1, p2, p3, p4}, Lj1/b$a;->t(Lj1/g;Lj1/b$d;Lj1/a;Li1/f;)V

    return-void
.end method

.method public final v(Li1/f;Lj1/g;Lj1/b$d;)V
    .locals 9

    .prologue
    const-string v0, "parsedJson"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutVariables"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li1/b;->j0()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "next(...)"

    invoke-static {v1, v2}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    invoke-virtual {p1, v6}, Li1/b;->R(Ljava/lang/String;)Li1/c;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, -0x6cbf819b

    if-eq v2, v3, :cond_5

    const v3, 0x6fc27995

    if-eq v2, v3, :cond_3

    const v3, 0x72879d57

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "Variables"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    instance-of v2, v1, Li1/f;

    if-eqz v2, :cond_0

    check-cast v1, Li1/f;

    invoke-direct {p0, p2, p3, v1}, Lj1/b$a;->s(Lj1/g;Lj1/b$d;Li1/f;)V

    goto :goto_0

    :cond_3
    const-string v2, "Generate"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    instance-of v2, v1, Li1/f;

    if-eqz v2, :cond_0

    check-cast v1, Li1/f;

    invoke-virtual {p0, p2, p3, v1}, Lj1/b$a;->m(Lj1/g;Lj1/b$d;Li1/f;)V

    goto :goto_0

    :cond_5
    const-string v2, "Helpers"

    invoke-virtual {v6, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :goto_1
    instance-of v2, v1, Li1/f;

    if-eqz v2, :cond_d

    move-object v8, v1

    check-cast v8, Li1/f;

    invoke-virtual {p0, v8}, Lj1/b$a;->c(Li1/f;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_c

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v1, "hGuideline"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p0, v1, p2, v6, v8}, Lj1/b$a;->p(ILj1/g;Ljava/lang/String;Li1/f;)V

    goto :goto_0

    :sswitch_1
    const-string v1, "vFlow"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_0

    :sswitch_2
    const-string v1, "hFlow"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto/16 :goto_0

    :cond_7
    move-object v3, p0

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, Lj1/b$a;->l(Ljava/lang/String;Lj1/g;Ljava/lang/String;Lj1/b$d;Li1/f;)V

    goto/16 :goto_0

    :sswitch_3
    const-string v1, "grid"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :sswitch_4
    const-string v1, "row"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :sswitch_5
    const-string v1, "barrier"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto/16 :goto_0

    :cond_8
    invoke-virtual {p0, p2, v6, v8}, Lj1/b$a;->d(Lj1/g;Ljava/lang/String;Li1/f;)V

    goto/16 :goto_0

    :sswitch_6
    const-string v1, "vChain"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_0

    :sswitch_7
    const-string v1, "hChain"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_0

    :cond_9
    move-object v3, p0

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, Lj1/b$a;->f(Ljava/lang/String;Lj1/g;Ljava/lang/String;Lj1/b$d;Li1/f;)V

    goto/16 :goto_0

    :sswitch_8
    const-string v1, "column"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto/16 :goto_0

    :cond_a
    move-object v3, p0

    move-object v5, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v8}, Lj1/b$a;->n(Ljava/lang/String;Lj1/g;Ljava/lang/String;Lj1/b$d;Li1/f;)V

    goto/16 :goto_0

    :sswitch_9
    const-string v1, "vGuideline"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_0

    :cond_b
    const/4 v1, 0x1

    goto :goto_2

    :cond_c
    invoke-virtual {p0, p2, p3, v6, v8}, Lj1/b$a;->u(Lj1/g;Lj1/b$d;Ljava/lang/String;Li1/f;)V

    goto/16 :goto_0

    :cond_d
    instance-of v2, v1, Li1/e;

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Li1/c;->o()I

    move-result v1

    invoke-virtual {p3, v6, v1}, Lj1/b$d;->e(Ljava/lang/String;I)V

    goto/16 :goto_0

    :cond_e
    instance-of v2, v1, Li1/a;

    if-eqz v2, :cond_0

    check-cast v1, Li1/a;

    invoke-virtual {p0, p2, p3, v1}, Lj1/b$a;->q(Lj1/g;Lj1/b$d;Li1/a;)V

    goto/16 :goto_0

    :cond_f
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6a6caee6 -> :sswitch_9
        -0x50c12caa -> :sswitch_8
        -0x4aa718c7 -> :sswitch_7
        -0x32c34015 -> :sswitch_6
        -0x13db5c49 -> :sswitch_5
        0x1b9da -> :sswitch_4
        0x308b46 -> :sswitch_3
        0x5db01b6 -> :sswitch_2
        0x6a04ac4 -> :sswitch_1
        0x398f2168 -> :sswitch_0
    .end sparse-switch
.end method
