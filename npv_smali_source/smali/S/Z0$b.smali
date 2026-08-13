.class final LS/Z0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS/Z0;->b(Lx7/p;Lx7/p;Lx7/p;LM0/P;JJLV/n;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LS/Z0$b;->a:Ljava/lang/String;

    iput-object p2, p0, LS/Z0$b;->b:Ljava/lang/String;

    iput-object p3, p0, LS/Z0$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->b(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public final b(LD0/M;Ljava/util/List;J)LD0/K;
    .locals 21

    .prologue
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p3

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v5

    invoke-static {}, LS/Z0;->g()F

    move-result v6

    invoke-interface {v1, v6}, LY0/e;->S0(F)I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v10

    iget-object v5, v0, LS/Z0$b;->a:Ljava/lang/String;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_0
    const/4 v8, 0x0

    if-ge v7, v6, :cond_1

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, LD0/G;

    invoke-static {v12}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_1
    check-cast v9, LD0/G;

    if-eqz v9, :cond_2

    invoke-interface {v9, v3, v4}, LD0/G;->U(J)LD0/X;

    move-result-object v5

    move-object v15, v5

    goto :goto_2

    :cond_2
    move-object v15, v8

    :goto_2
    iget-object v5, v0, LS/Z0$b;->b:Ljava/lang/String;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_3
    if-ge v7, v6, :cond_4

    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, LD0/G;

    invoke-static {v12}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v12

    invoke-static {v12, v5}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    move-object v9, v8

    :goto_4
    check-cast v9, LD0/G;

    if-eqz v9, :cond_5

    invoke-interface {v9, v3, v4}, LD0/G;->U(J)LD0/X;

    move-result-object v8

    :cond_5
    move-object/from16 v16, v8

    if-eqz v15, :cond_6

    invoke-virtual {v15}, LD0/X;->I0()I

    move-result v5

    move v12, v5

    goto :goto_5

    :cond_6
    const/4 v12, 0x0

    :goto_5
    if-eqz v15, :cond_7

    invoke-virtual {v15}, LD0/X;->w0()I

    move-result v5

    move v13, v5

    goto :goto_6

    :cond_7
    const/4 v13, 0x0

    :goto_6
    if-eqz v16, :cond_8

    invoke-virtual/range {v16 .. v16}, LD0/X;->I0()I

    move-result v5

    move v14, v5

    goto :goto_7

    :cond_8
    const/4 v14, 0x0

    :goto_7
    if-eqz v16, :cond_9

    invoke-virtual/range {v16 .. v16}, LD0/X;->w0()I

    move-result v5

    move v9, v5

    goto :goto_8

    :cond_9
    const/4 v9, 0x0

    :goto_8
    if-nez v14, :cond_a

    invoke-static {}, LS/Z0;->i()F

    move-result v5

    invoke-interface {v1, v5}, LY0/e;->S0(F)I

    move-result v5

    goto :goto_9

    :cond_a
    const/4 v5, 0x0

    :goto_9
    sub-int v6, v10, v12

    sub-int/2addr v6, v14

    sub-int/2addr v6, v5

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v5

    invoke-static {v6, v5}, LE7/j;->d(II)I

    move-result v5

    iget-object v6, v0, LS/Z0$b;->c:Ljava/lang/String;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    :goto_a
    if-ge v8, v7, :cond_14

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v11, v17

    check-cast v11, LD0/G;

    invoke-static {v11}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_13

    const/16 v8, 0x9

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    move-wide/from16 v2, p3

    move v4, v6

    move v6, v7

    move/from16 v7, v17

    move-object/from16 v17, v15

    move v15, v9

    move-object v9, v0

    invoke-static/range {v2 .. v9}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface {v11, v2, v3}, LD0/G;->U(J)LD0/X;

    move-result-object v0

    invoke-static {}, LD0/b;->a()LD0/m;

    move-result-object v2

    invoke-interface {v0, v2}, LD0/O;->Q(LD0/a;)I

    move-result v2

    invoke-static {}, LD0/b;->b()LD0/m;

    move-result-object v3

    invoke-interface {v0, v3}, LD0/O;->Q(LD0/a;)I

    move-result v3

    const/high16 v4, -0x80000000

    const/4 v5, 0x1

    if-eq v2, v4, :cond_b

    if-eq v3, v4, :cond_b

    move v6, v5

    goto :goto_b

    :cond_b
    const/4 v6, 0x0

    :goto_b
    if-eq v2, v3, :cond_d

    if-nez v6, :cond_c

    goto :goto_c

    :cond_c
    const/4 v5, 0x0

    :cond_d
    :goto_c
    sub-int v3, v10, v14

    sub-int v19, v3, v12

    if-eqz v5, :cond_10

    sget-object v5, LU/B;->a:LU/B;

    invoke-virtual {v5}, LU/B;->g()F

    move-result v5

    invoke-interface {v1, v5}, LY0/e;->S0(F)I

    move-result v5

    invoke-static {v13, v15}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {v0}, LD0/X;->w0()I

    move-result v6

    sub-int v6, v5, v6

    div-int/lit8 v6, v6, 0x2

    if-eqz v17, :cond_e

    invoke-static {}, LD0/b;->a()LD0/m;

    move-result-object v7

    move-object/from16 v8, v17

    invoke-interface {v8, v7}, LD0/O;->Q(LD0/a;)I

    move-result v7

    if-eq v7, v4, :cond_f

    add-int/2addr v2, v6

    sub-int/2addr v2, v7

    goto :goto_d

    :cond_e
    move-object/from16 v8, v17

    :cond_f
    const/4 v2, 0x0

    :goto_d
    move/from16 v20, v2

    move v14, v6

    goto :goto_f

    :cond_10
    move-object/from16 v8, v17

    invoke-static {}, LS/Z0;->h()F

    move-result v4

    invoke-interface {v1, v4}, LY0/e;->S0(F)I

    move-result v4

    sub-int/2addr v4, v2

    sget-object v2, LU/B;->a:LU/B;

    invoke-virtual {v2}, LU/B;->j()F

    move-result v2

    invoke-interface {v1, v2}, LY0/e;->S0(F)I

    move-result v2

    invoke-virtual {v0}, LD0/X;->w0()I

    move-result v5

    add-int/2addr v5, v4

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    if-eqz v8, :cond_11

    invoke-virtual {v8}, LD0/X;->w0()I

    move-result v5

    sub-int v5, v2, v5

    div-int/lit8 v5, v5, 0x2

    goto :goto_e

    :cond_11
    const/4 v5, 0x0

    :goto_e
    move v14, v4

    move/from16 v20, v5

    move v5, v2

    :goto_f
    if-eqz v16, :cond_12

    invoke-virtual/range {v16 .. v16}, LD0/X;->w0()I

    move-result v2

    sub-int v2, v5, v2

    div-int/lit8 v11, v2, 0x2

    move/from16 v17, v11

    goto :goto_10

    :cond_12
    const/16 v17, 0x0

    :goto_10
    new-instance v6, LS/Z0$b$a;

    move-object v12, v6

    move-object v13, v0

    move-object v0, v8

    move-object/from16 v15, v16

    move/from16 v16, v3

    move-object/from16 v18, v0

    invoke-direct/range {v12 .. v20}, LS/Z0$b$a;-><init>(LD0/X;ILD0/X;IILD0/X;II)V

    const/4 v0, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move v2, v10

    move v3, v5

    move-object v5, v6

    move v6, v0

    invoke-static/range {v1 .. v7}, LD0/L;->b(LD0/M;IILjava/util/Map;Lx7/l;ILjava/lang/Object;)LD0/K;

    move-result-object v0

    return-object v0

    :cond_13
    move-object v0, v15

    move v15, v9

    add-int/lit8 v8, v8, 0x1

    move-object v15, v0

    move-object/from16 v0, p0

    goto/16 :goto_a

    :cond_14
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public synthetic c(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->d(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic e(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->c(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method

.method public synthetic j(LD0/o;Ljava/util/List;I)I
    .locals 0

    invoke-static {p0, p1, p2, p3}, LD0/H;->a(LD0/I;LD0/o;Ljava/util/List;I)I

    move-result p1

    return p1
.end method
