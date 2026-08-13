.class final LS/z0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# instance fields
.field private final a:Lx7/l;

.field private final b:Z

.field private final c:F

.field private final d:LA/B;


# direct methods
.method public constructor <init>(Lx7/l;ZFLA/B;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS/z0;->a:Lx7/l;

    iput-boolean p2, p0, LS/z0;->b:Z

    iput p3, p0, LS/z0;->c:F

    iput-object p4, p0, LS/z0;->d:LA/B;

    return-void
.end method

.method public static final synthetic d(LS/z0;)F
    .locals 0

    iget p0, p0, LS/z0;->c:F

    return p0
.end method

.method public static final synthetic f(LS/z0;)LA/B;
    .locals 0

    iget-object p0, p0, LS/z0;->d:LA/B;

    return-object p0
.end method

.method public static final synthetic g(LS/z0;)Z
    .locals 0

    iget-boolean p0, p0, LS/z0;->b:Z

    return p0
.end method

.method private final h(LD0/o;Ljava/util/List;ILx7/p;)I
    .locals 21

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_1

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, LD0/n;

    invoke-static {v9}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "Leading"

    invoke-static {v9, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_1
    check-cast v8, LD0/n;

    const v4, 0x7fffffff

    if-eqz v8, :cond_2

    invoke-interface {v8, v4}, LD0/n;->T(I)I

    move-result v6

    invoke-static {v2, v6}, LS/y0;->h(II)I

    move-result v6

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v3, v8, v9}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    goto :goto_2

    :cond_2
    move v6, v2

    const/4 v8, 0x0

    :goto_2
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v9, :cond_4

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, LD0/n;

    invoke-static {v12}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "Trailing"

    invoke-static {v12, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    :goto_4
    check-cast v11, LD0/n;

    if-eqz v11, :cond_5

    invoke-interface {v11, v4}, LD0/n;->T(I)I

    move-result v9

    invoke-static {v6, v9}, LS/y0;->h(II)I

    move-result v6

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v3, v11, v9}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    :goto_5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v10, :cond_7

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, LD0/n;

    invoke-static {v13}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "Label"

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v11, v11, 0x1

    goto :goto_6

    :cond_7
    const/4 v12, 0x0

    :goto_7
    check-cast v12, LD0/n;

    if-eqz v12, :cond_8

    iget v10, v0, LS/z0;->c:F

    invoke-static {v6, v2, v10}, La1/b;->c(IIF)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v12, v10}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    move v13, v10

    goto :goto_8

    :cond_8
    const/4 v13, 0x0

    :goto_8
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_9
    if-ge v11, v10, :cond_a

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, LD0/n;

    invoke-static {v14}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "Prefix"

    invoke-static {v14, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_9

    goto :goto_a

    :cond_9
    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_a
    const/4 v12, 0x0

    :goto_a
    check-cast v12, LD0/n;

    if-eqz v12, :cond_b

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v12, v10}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-interface {v12, v4}, LD0/n;->T(I)I

    move-result v11

    invoke-static {v6, v11}, LS/y0;->h(II)I

    move-result v6

    goto :goto_b

    :cond_b
    const/4 v10, 0x0

    :goto_b
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_c
    if-ge v12, v11, :cond_d

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, LD0/n;

    invoke-static {v15}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v15

    const-string v5, "Suffix"

    invoke-static {v15, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    goto :goto_d

    :cond_c
    add-int/lit8 v12, v12, 0x1

    goto :goto_c

    :cond_d
    const/4 v14, 0x0

    :goto_d
    check-cast v14, LD0/n;

    if-eqz v14, :cond_e

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v14, v5}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-interface {v14, v4}, LD0/n;->T(I)I

    move-result v4

    invoke-static {v6, v4}, LS/y0;->h(II)I

    move-result v6

    move v11, v5

    goto :goto_e

    :cond_e
    const/4 v11, 0x0

    :goto_e
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v4, :cond_16

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, LD0/n;

    invoke-static {v14}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "TextField"

    invoke-static {v14, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_15

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v12, v4}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v12

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_10
    if-ge v5, v4, :cond_10

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, LD0/n;

    invoke-static {v15}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v15

    const-string v7, "Hint"

    invoke-static {v15, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_11

    :cond_f
    add-int/lit8 v5, v5, 0x1

    goto :goto_10

    :cond_10
    const/4 v14, 0x0

    :goto_11
    check-cast v14, LD0/n;

    if-eqz v14, :cond_11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v14, v4}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    move v14, v4

    goto :goto_12

    :cond_11
    const/4 v14, 0x0

    :goto_12
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_13
    if-ge v5, v4, :cond_13

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, LD0/n;

    invoke-static {v7}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v7

    const-string v15, "Supporting"

    invoke-static {v7, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    move-object v7, v6

    goto :goto_14

    :cond_12
    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_13
    const/4 v7, 0x0

    :goto_14
    check-cast v7, LD0/n;

    if-eqz v7, :cond_14

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v7, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v5

    move v15, v5

    goto :goto_15

    :cond_14
    const/4 v15, 0x0

    :goto_15
    iget v1, v0, LS/z0;->c:F

    invoke-static {}, LT/A;->s()J

    move-result-wide v17

    invoke-interface/range {p1 .. p1}, LY0/e;->getDensity()F

    move-result v19

    iget-object v2, v0, LS/z0;->d:LA/B;

    move/from16 v16, v1

    move-object/from16 v20, v2

    invoke-static/range {v8 .. v20}, LS/y0;->d(IIIIIIIIFJFLA/B;)I

    move-result v1

    return v1

    :cond_15
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_f

    :cond_16
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Collection contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private final i(LD0/o;Ljava/util/List;ILx7/p;)I
    .locals 17

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v3, :cond_13

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, LD0/n;

    invoke-static {v7}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "TextField"

    invoke-static {v7, v8}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_12

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v6, v3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    move v5, v4

    :goto_1
    const/4 v6, 0x0

    if-ge v5, v3, :cond_1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LD0/n;

    invoke-static {v8}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v8

    const-string v10, "Label"

    invoke-static {v8, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    move-object v7, v6

    :goto_2
    check-cast v7, LD0/n;

    if-eqz v7, :cond_2

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v7, v3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    move v10, v3

    goto :goto_3

    :cond_2
    move v10, v4

    :goto_3
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v3

    move v5, v4

    :goto_4
    if-ge v5, v3, :cond_4

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LD0/n;

    invoke-static {v8}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v8

    const-string v11, "Trailing"

    invoke-static {v8, v11}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_4
    move-object v7, v6

    :goto_5
    check-cast v7, LD0/n;

    if-eqz v7, :cond_5

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v7, v3}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    goto :goto_6

    :cond_5
    move v3, v4

    :goto_6
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v5

    move v7, v4

    :goto_7
    if-ge v7, v5, :cond_7

    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, LD0/n;

    invoke-static {v11}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v11

    const-string v12, "Leading"

    invoke-static {v11, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    goto :goto_8

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_7

    :cond_7
    move-object v8, v6

    :goto_8
    check-cast v8, LD0/n;

    if-eqz v8, :cond_8

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v8, v5}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    goto :goto_9

    :cond_8
    move v5, v4

    :goto_9
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v7

    move v8, v4

    :goto_a
    if-ge v8, v7, :cond_a

    invoke-interface {v1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, LD0/n;

    invoke-static {v12}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "Prefix"

    invoke-static {v12, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    goto :goto_b

    :cond_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_a

    :cond_a
    move-object v11, v6

    :goto_b
    check-cast v11, LD0/n;

    if-eqz v11, :cond_b

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v11, v7}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    goto :goto_c

    :cond_b
    move v7, v4

    :goto_c
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v8

    move v11, v4

    :goto_d
    if-ge v11, v8, :cond_d

    invoke-interface {v1, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, LD0/n;

    invoke-static {v13}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v13

    const-string v14, "Suffix"

    invoke-static {v13, v14}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    goto :goto_e

    :cond_c
    add-int/lit8 v11, v11, 0x1

    goto :goto_d

    :cond_d
    move-object v12, v6

    :goto_e
    check-cast v12, LD0/n;

    if-eqz v12, :cond_e

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v12, v8}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    goto :goto_f

    :cond_e
    move v8, v4

    :goto_f
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v11

    move v12, v4

    :goto_10
    if-ge v12, v11, :cond_10

    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, LD0/n;

    invoke-static {v14}, LT/A;->l(LD0/n;)Ljava/lang/Object;

    move-result-object v14

    const-string v15, "Hint"

    invoke-static {v14, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    move-object v6, v13

    goto :goto_11

    :cond_f
    add-int/lit8 v12, v12, 0x1

    goto :goto_10

    :cond_10
    :goto_11
    check-cast v6, LD0/n;

    if-eqz v6, :cond_11

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v6, v1}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v4

    :cond_11
    move v11, v4

    iget v12, v0, LS/z0;->c:F

    invoke-static {}, LT/A;->s()J

    move-result-wide v13

    invoke-interface/range {p1 .. p1}, LY0/e;->getDensity()F

    move-result v15

    iget-object v1, v0, LS/z0;->d:LA/B;

    move v6, v3

    move-object/from16 v16, v1

    invoke-static/range {v5 .. v16}, LS/y0;->e(IIIIIIIFJFLA/B;)I

    move-result v1

    return v1

    :cond_12
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    :cond_13
    new-instance v1, Ljava/util/NoSuchElementException;

    const-string v2, "Collection contains no element matching the predicate."

    invoke-direct {v1, v2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public a(LD0/o;Ljava/util/List;I)I
    .locals 1

    sget-object v0, LS/z0$b;->D:LS/z0$b;

    invoke-direct {p0, p1, p2, p3, v0}, LS/z0;->i(LD0/o;Ljava/util/List;ILx7/p;)I

    move-result p1

    return p1
.end method

.method public b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 48

    .prologue
    move-object/from16 v14, p0

    move-object/from16 v15, p1

    move-object/from16 v0, p2

    iget-object v1, v14, LS/z0;->d:LA/B;

    invoke-interface {v1}, LA/B;->c()F

    move-result v1

    invoke-interface {v15, v1}, LY0/e;->S0(F)I

    move-result v1

    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide/from16 v2, p3

    invoke-static/range {v2 .. v9}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    move v6, v5

    :goto_0
    if-ge v6, v4, :cond_1

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, LD0/G;

    invoke-static {v9}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "Leading"

    invoke-static {v9, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v8, 0x0

    :goto_1
    check-cast v8, LD0/G;

    if-eqz v8, :cond_2

    invoke-interface {v8, v2, v3}, LD0/G;->U(J)LD0/X;

    move-result-object v4

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    invoke-static {v4}, LT/A;->v(LD0/X;)I

    move-result v6

    invoke-static {v4}, LT/A;->t(LD0/X;)I

    move-result v8

    invoke-static {v5, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v9

    move v10, v5

    :goto_3
    if-ge v10, v9, :cond_4

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, LD0/G;

    invoke-static {v12}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "Trailing"

    invoke-static {v12, v13}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    :goto_4
    check-cast v11, LD0/G;

    if-eqz v11, :cond_5

    neg-int v9, v6

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-wide/from16 v16, v2

    move/from16 v18, v9

    invoke-static/range {v16 .. v21}, LY0/c;->o(JIIILjava/lang/Object;)J

    move-result-wide v9

    invoke-interface {v11, v9, v10}, LD0/G;->U(J)LD0/X;

    move-result-object v9

    goto :goto_5

    :cond_5
    const/4 v9, 0x0

    :goto_5
    invoke-static {v9}, LT/A;->v(LD0/X;)I

    move-result v10

    add-int/2addr v6, v10

    invoke-static {v9}, LT/A;->t(LD0/X;)I

    move-result v10

    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    move v11, v5

    :goto_6
    if-ge v11, v10, :cond_7

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, LD0/G;

    invoke-static {v13}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v13

    const-string v5, "Prefix"

    invoke-static {v13, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v11, v11, 0x1

    const/4 v5, 0x0

    goto :goto_6

    :cond_7
    const/4 v12, 0x0

    :goto_7
    check-cast v12, LD0/G;

    if-eqz v12, :cond_8

    neg-int v5, v6

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-wide/from16 v16, v2

    move/from16 v18, v5

    invoke-static/range {v16 .. v21}, LY0/c;->o(JIIILjava/lang/Object;)J

    move-result-wide v10

    invoke-interface {v12, v10, v11}, LD0/G;->U(J)LD0/X;

    move-result-object v5

    goto :goto_8

    :cond_8
    const/4 v5, 0x0

    :goto_8
    invoke-static {v5}, LT/A;->v(LD0/X;)I

    move-result v10

    add-int/2addr v6, v10

    invoke-static {v5}, LT/A;->t(LD0/X;)I

    move-result v10

    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    move-result v8

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_9
    if-ge v11, v10, :cond_a

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, LD0/G;

    invoke-static {v13}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v13

    const-string v7, "Suffix"

    invoke-static {v13, v7}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_a

    :cond_9
    add-int/lit8 v11, v11, 0x1

    goto :goto_9

    :cond_a
    const/4 v12, 0x0

    :goto_a
    check-cast v12, LD0/G;

    if-eqz v12, :cond_b

    neg-int v7, v6

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-wide/from16 v16, v2

    move/from16 v18, v7

    invoke-static/range {v16 .. v21}, LY0/c;->o(JIIILjava/lang/Object;)J

    move-result-wide v10

    invoke-interface {v12, v10, v11}, LD0/G;->U(J)LD0/X;

    move-result-object v7

    goto :goto_b

    :cond_b
    const/4 v7, 0x0

    :goto_b
    invoke-static {v7}, LT/A;->v(LD0/X;)I

    move-result v10

    add-int/2addr v6, v10

    invoke-static {v7}, LT/A;->t(LD0/X;)I

    move-result v10

    invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I

    move-result v8

    iget-object v10, v14, LS/z0;->d:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v11

    invoke-interface {v10, v11}, LA/B;->a(LY0/v;)F

    move-result v10

    invoke-interface {v15, v10}, LY0/e;->S0(F)I

    move-result v10

    iget-object v11, v14, LS/z0;->d:LA/B;

    invoke-interface/range {p1 .. p1}, LD0/o;->getLayoutDirection()LY0/v;

    move-result-object v12

    invoke-interface {v11, v12}, LA/B;->b(LY0/v;)F

    move-result v11

    invoke-interface {v15, v11}, LY0/e;->S0(F)I

    move-result v11

    add-int/2addr v10, v11

    neg-int v6, v6

    sub-int v11, v6, v10

    neg-int v10, v10

    iget v12, v14, LS/z0;->c:F

    invoke-static {v11, v10, v12}, La1/b;->c(IIF)I

    move-result v10

    neg-int v11, v1

    invoke-static {v2, v3, v10, v11}, LY0/c;->n(JII)J

    move-result-wide v12

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v10

    move-wide/from16 v16, v2

    const/4 v2, 0x0

    :goto_c
    if-ge v2, v10, :cond_d

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v18, v3

    check-cast v18, LD0/G;

    move-object/from16 v19, v3

    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v3

    move/from16 v18, v10

    const-string v10, "Label"

    invoke-static {v3, v10}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    move-object/from16 v3, v19

    goto :goto_d

    :cond_c
    add-int/lit8 v2, v2, 0x1

    move/from16 v10, v18

    goto :goto_c

    :cond_d
    const/4 v3, 0x0

    :goto_d
    check-cast v3, LD0/G;

    if-eqz v3, :cond_e

    invoke-interface {v3, v12, v13}, LD0/G;->U(J)LD0/X;

    move-result-object v2

    move-object v10, v2

    goto :goto_e

    :cond_e
    const/4 v10, 0x0

    :goto_e
    if-eqz v10, :cond_f

    invoke-virtual {v10}, LD0/X;->I0()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v10}, LD0/X;->w0()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v2, v3}, Ln0/n;->a(FF)J

    move-result-wide v2

    goto :goto_f

    :cond_f
    sget-object v2, Ln0/m;->b:Ln0/m$a;

    invoke-virtual {v2}, Ln0/m$a;->b()J

    move-result-wide v2

    :goto_f
    iget-object v12, v14, LS/z0;->a:Lx7/l;

    invoke-static {v2, v3}, Ln0/m;->c(J)Ln0/m;

    move-result-object v2

    invoke-interface {v12, v2}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_10
    if-ge v3, v2, :cond_11

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, LD0/G;

    invoke-static {v13}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v13

    move/from16 v18, v2

    const-string v2, "Supporting"

    invoke-static {v13, v2}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_11

    :cond_10
    add-int/lit8 v3, v3, 0x1

    move/from16 v2, v18

    goto :goto_10

    :cond_11
    const/4 v12, 0x0

    :goto_11
    check-cast v12, LD0/G;

    if-eqz v12, :cond_12

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v2

    invoke-interface {v12, v2}, LD0/n;->n0(I)I

    move-result v2

    goto :goto_12

    :cond_12
    const/4 v2, 0x0

    :goto_12
    invoke-static {v10}, LT/A;->t(LD0/X;)I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    iget-object v13, v14, LS/z0;->d:LA/B;

    invoke-interface {v13}, LA/B;->d()F

    move-result v13

    invoke-interface {v15, v13}, LY0/e;->S0(F)I

    move-result v13

    invoke-static {v3, v13}, Ljava/lang/Math;->max(II)I

    move-result v3

    sub-int/2addr v11, v3

    sub-int/2addr v11, v2

    move-object v2, v12

    move-wide/from16 v12, p3

    invoke-static {v12, v13, v6, v11}, LY0/c;->n(JII)J

    move-result-wide v23

    const/16 v29, 0xb

    const/16 v30, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v23 .. v30}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v11

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v13, 0x0

    :goto_13
    const-string v15, "Collection contains no element matching the predicate."

    if-ge v13, v6, :cond_1c

    invoke-interface {v0, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move/from16 v19, v6

    move-object/from16 v6, v18

    check-cast v6, LD0/G;

    move/from16 v18, v13

    invoke-static {v6}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v39, v15

    const-string v15, "TextField"

    invoke-static {v13, v15}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1b

    invoke-interface {v6, v11, v12}, LD0/G;->U(J)LD0/X;

    move-result-object v13

    const/16 v37, 0xe

    const/16 v38, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-wide/from16 v31, v11

    invoke-static/range {v31 .. v38}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v11

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v15, 0x0

    :goto_14
    if-ge v15, v6, :cond_14

    invoke-interface {v0, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v19, v18

    check-cast v19, LD0/G;

    move/from16 v20, v6

    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v6

    const-string v0, "Hint"

    invoke-static {v6, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    goto :goto_15

    :cond_13
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p2

    move/from16 v6, v20

    goto :goto_14

    :cond_14
    const/16 v18, 0x0

    :goto_15
    move-object/from16 v0, v18

    check-cast v0, LD0/G;

    if-eqz v0, :cond_15

    invoke-interface {v0, v11, v12}, LD0/G;->U(J)LD0/X;

    move-result-object v0

    move-object v11, v0

    goto :goto_16

    :cond_15
    const/4 v11, 0x0

    :goto_16
    invoke-static {v13}, LT/A;->t(LD0/X;)I

    move-result v0

    invoke-static {v11}, LT/A;->t(LD0/X;)I

    move-result v6

    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v3

    add-int/2addr v0, v1

    invoke-static {v8, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v4}, LT/A;->v(LD0/X;)I

    move-result v23

    invoke-static {v9}, LT/A;->v(LD0/X;)I

    move-result v24

    invoke-static {v5}, LT/A;->v(LD0/X;)I

    move-result v25

    invoke-static {v7}, LT/A;->v(LD0/X;)I

    move-result v26

    invoke-virtual {v13}, LD0/X;->I0()I

    move-result v27

    invoke-static {v10}, LT/A;->v(LD0/X;)I

    move-result v28

    invoke-static {v11}, LT/A;->v(LD0/X;)I

    move-result v29

    iget v1, v14, LS/z0;->c:F

    invoke-interface/range {p1 .. p1}, LY0/e;->getDensity()F

    move-result v33

    iget-object v3, v14, LS/z0;->d:LA/B;

    move/from16 v30, v1

    move-wide/from16 v31, p3

    move-object/from16 v34, v3

    invoke-static/range {v23 .. v34}, LS/y0;->e(IIIIIIIFJFLA/B;)I

    move-result v15

    neg-int v0, v0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v18, 0x0

    move/from16 v19, v0

    invoke-static/range {v16 .. v21}, LY0/c;->o(JIIILjava/lang/Object;)J

    move-result-wide v40

    const/16 v46, 0x9

    const/16 v47, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    move/from16 v43, v15

    invoke-static/range {v40 .. v47}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v0

    if-eqz v2, :cond_16

    invoke-interface {v2, v0, v1}, LD0/G;->U(J)LD0/X;

    move-result-object v0

    move-object/from16 v22, v0

    goto :goto_17

    :cond_16
    const/16 v22, 0x0

    :goto_17
    invoke-static/range {v22 .. v22}, LT/A;->t(LD0/X;)I

    move-result v0

    invoke-static {v4}, LT/A;->t(LD0/X;)I

    move-result v23

    invoke-static {v9}, LT/A;->t(LD0/X;)I

    move-result v24

    invoke-static {v5}, LT/A;->t(LD0/X;)I

    move-result v25

    invoke-static {v7}, LT/A;->t(LD0/X;)I

    move-result v26

    invoke-virtual {v13}, LD0/X;->w0()I

    move-result v27

    invoke-static {v10}, LT/A;->t(LD0/X;)I

    move-result v28

    invoke-static {v11}, LT/A;->t(LD0/X;)I

    move-result v29

    invoke-static/range {v22 .. v22}, LT/A;->t(LD0/X;)I

    move-result v30

    iget v1, v14, LS/z0;->c:F

    invoke-interface/range {p1 .. p1}, LY0/e;->getDensity()F

    move-result v34

    iget-object v2, v14, LS/z0;->d:LA/B;

    move/from16 v31, v1

    move-wide/from16 v32, p3

    move-object/from16 v35, v2

    invoke-static/range {v23 .. v35}, LS/y0;->d(IIIIIIIIFJFLA/B;)I

    move-result v16

    sub-int v0, v16, v0

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_18
    if-ge v2, v1, :cond_1a

    move-object/from16 v6, p2

    invoke-interface {v6, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD0/G;

    invoke-static {v3}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v8

    const-string v12, "Container"

    invoke-static {v8, v12}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_19

    const v1, 0x7fffffff

    if-eq v15, v1, :cond_17

    move v2, v15

    goto :goto_19

    :cond_17
    const/4 v2, 0x0

    :goto_19
    if-eq v0, v1, :cond_18

    move v1, v0

    goto :goto_1a

    :cond_18
    const/4 v1, 0x0

    :goto_1a
    invoke-static {v2, v15, v1, v0}, LY0/c;->a(IIII)J

    move-result-wide v0

    invoke-interface {v3, v0, v1}, LD0/G;->U(J)LD0/X;

    move-result-object v12

    new-instance v17, LS/z0$c;

    move-object/from16 v0, v17

    move/from16 v1, v16

    move v2, v15

    move-object v3, v4

    move-object v4, v9

    move-object v6, v7

    move-object v7, v13

    move-object v8, v10

    move-object v9, v11

    move-object v10, v12

    move-object/from16 v11, v22

    move-object/from16 v12, p0

    move-object/from16 v13, p1

    invoke-direct/range {v0 .. v13}, LS/z0$c;-><init>(IILD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LD0/X;LS/z0;LD0/M;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move v1, v15

    move/from16 v2, v16

    move-object/from16 v4, v17

    invoke-static/range {v0 .. v6}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0

    :cond_19
    add-int/lit8 v2, v2, 0x1

    goto :goto_18

    :cond_1a
    new-instance v0, Ljava/util/NoSuchElementException;

    move-object/from16 v13, v39

    invoke-direct {v0, v13}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1b
    move-object v6, v0

    add-int/lit8 v13, v18, 0x1

    move/from16 v6, v19

    goto/16 :goto_13

    :cond_1c
    move-object v13, v15

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0, v13}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(LD0/o;Ljava/util/List;I)I
    .locals 1

    sget-object v0, LS/z0$e;->D:LS/z0$e;

    invoke-direct {p0, p1, p2, p3, v0}, LS/z0;->i(LD0/o;Ljava/util/List;ILx7/p;)I

    move-result p1

    return p1
.end method

.method public e(LD0/o;Ljava/util/List;I)I
    .locals 1

    sget-object v0, LS/z0$d;->D:LS/z0$d;

    invoke-direct {p0, p1, p2, p3, v0}, LS/z0;->h(LD0/o;Ljava/util/List;ILx7/p;)I

    move-result p1

    return p1
.end method

.method public j(LD0/o;Ljava/util/List;I)I
    .locals 1

    sget-object v0, LS/z0$a;->D:LS/z0$a;

    invoke-direct {p0, p1, p2, p3, v0}, LS/z0;->h(LD0/o;Ljava/util/List;ILx7/p;)I

    move-result p1

    return p1
.end method
