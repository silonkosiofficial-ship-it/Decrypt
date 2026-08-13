.class public abstract LU0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LM0/j;Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V
    .locals 15

    .prologue
    move-object/from16 v0, p2

    invoke-interface/range {p1 .. p1}, Lo0/q0;->m()V

    invoke-virtual {p0}, LM0/j;->w()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_1

    :goto_0
    invoke-static/range {p0 .. p7}, LU0/b;->b(LM0/j;Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V

    :cond_0
    move-object/from16 v8, p1

    goto/16 :goto_3

    :cond_1
    instance-of v1, v0, Lo0/f2;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    instance-of v1, v0, Lo0/a2;

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LM0/j;->w()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move v5, v3

    move v6, v4

    move v7, v6

    :goto_1
    if-ge v5, v2, :cond_3

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LM0/q;

    invoke-virtual {v8}, LM0/q;->e()LM0/p;

    move-result-object v9

    invoke-interface {v9}, LM0/p;->getHeight()F

    move-result v9

    add-float/2addr v7, v9

    invoke-virtual {v8}, LM0/q;->e()LM0/p;

    move-result-object v8

    invoke-interface {v8}, LM0/p;->getWidth()F

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    move-result v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    check-cast v0, Lo0/a2;

    invoke-static {v6, v7}, Ln0/n;->a(FF)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo0/a2;->b(J)Landroid/graphics/Shader;

    move-result-object v0

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->getLocalMatrix(Landroid/graphics/Matrix;)Z

    invoke-virtual {p0}, LM0/j;->w()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    :goto_2
    if-ge v3, v5, :cond_0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LM0/q;

    invoke-virtual {v6}, LM0/q;->e()LM0/p;

    move-result-object v7

    invoke-static {v0}, Lo0/o0;->a(Landroid/graphics/Shader;)Lo0/a2;

    move-result-object v9

    move-object/from16 v8, p1

    move/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v12, p5

    move-object/from16 v13, p6

    move/from16 v14, p7

    invoke-interface/range {v7 .. v14}, LM0/p;->n(Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V

    invoke-virtual {v6}, LM0/q;->e()LM0/p;

    move-result-object v7

    invoke-interface {v7}, LM0/p;->getHeight()F

    move-result v7

    invoke-interface {v8, v4, v7}, Lo0/q0;->d(FF)V

    invoke-virtual {v6}, LM0/q;->e()LM0/p;

    move-result-object v6

    invoke-interface {v6}, LM0/p;->getHeight()F

    move-result v6

    neg-float v6, v6

    invoke-virtual {v1, v4, v6}, Landroid/graphics/Matrix;->setTranslate(FF)V

    invoke-virtual {v0, v1}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :goto_3
    invoke-interface/range {p1 .. p1}, Lo0/q0;->s()V

    return-void
.end method

.method private static final b(LM0/j;Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V
    .locals 12

    .prologue
    invoke-virtual {p0}, LM0/j;->w()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LM0/q;

    invoke-virtual {v3}, LM0/q;->e()LM0/p;

    move-result-object v4

    move-object v5, p1

    move-object v6, p2

    move v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move/from16 v11, p7

    invoke-interface/range {v4 .. v11}, LM0/p;->n(Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V

    invoke-virtual {v3}, LM0/q;->e()LM0/p;

    move-result-object v3

    invoke-interface {v3}, LM0/p;->getHeight()F

    move-result v3

    const/4 v4, 0x0

    invoke-interface {p1, v4, v3}, Lo0/q0;->d(FF)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
