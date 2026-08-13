.class public final LM0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM0/a$a;
    }
.end annotation


# instance fields
.field private final a:LU0/d;

.field private final b:I

.field private final c:Z

.field private final d:J

.field private final e:LN0/l0;

.field private final f:Ljava/lang/CharSequence;

.field private final g:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LU0/d;IZJ)V
    .locals 24

    .prologue
    move-object/from16 v9, p0

    move/from16 v10, p2

    move/from16 v11, p3

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p1

    iput-object v0, v9, LM0/a;->a:LU0/d;

    iput v10, v9, LM0/a;->b:I

    iput-boolean v11, v9, LM0/a;->c:Z

    move-wide/from16 v12, p4

    iput-wide v12, v9, LM0/a;->d:J

    invoke-static/range {p4 .. p5}, LY0/b;->m(J)I

    move-result v1

    if-nez v1, :cond_e

    invoke-static/range {p4 .. p5}, LY0/b;->n(J)I

    move-result v1

    if-nez v1, :cond_e

    const/4 v14, 0x1

    if-lt v10, v14, :cond_d

    invoke-virtual/range {p1 .. p1}, LU0/d;->i()LM0/P;

    move-result-object v15

    invoke-static {v15, v11}, LM0/b;->c(LM0/P;Z)Z

    move-result v1

    invoke-virtual/range {p1 .. p1}, LU0/d;->f()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v1, :cond_0

    invoke-static {v0}, LM0/b;->a(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    :cond_0
    iput-object v0, v9, LM0/a;->f:Ljava/lang/CharSequence;

    invoke-virtual {v15}, LM0/P;->z()I

    move-result v0

    invoke-static {v0}, LM0/b;->d(I)I

    move-result v16

    invoke-virtual {v15}, LM0/P;->z()I

    move-result v0

    sget-object v1, LX0/j;->b:LX0/j$a;

    invoke-virtual {v1}, LX0/j$a;->c()I

    move-result v1

    invoke-static {v0, v1}, LX0/j;->k(II)Z

    move-result v17

    invoke-virtual {v15}, LM0/P;->v()LM0/v;

    move-result-object v0

    invoke-virtual {v0}, LM0/v;->c()I

    move-result v0

    invoke-static {v0}, LM0/b;->f(I)I

    move-result v18

    invoke-virtual {v15}, LM0/P;->r()I

    move-result v0

    invoke-static {v0}, LX0/f;->g(I)I

    move-result v0

    invoke-static {v0}, LM0/b;->e(I)I

    move-result v19

    invoke-virtual {v15}, LM0/P;->r()I

    move-result v0

    invoke-static {v0}, LX0/f;->h(I)I

    move-result v0

    invoke-static {v0}, LM0/b;->g(I)I

    move-result v20

    invoke-virtual {v15}, LM0/P;->r()I

    move-result v0

    invoke-static {v0}, LX0/f;->i(I)I

    move-result v0

    invoke-static {v0}, LM0/b;->h(I)I

    move-result v21

    const/16 v22, 0x0

    if-eqz v11, :cond_1

    sget-object v0, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    move-object/from16 v23, v0

    goto :goto_0

    :cond_1
    move-object/from16 v23, v22

    :goto_0
    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    move-object/from16 v3, v23

    move/from16 v4, p2

    move/from16 v5, v18

    move/from16 v6, v19

    move/from16 v7, v20

    move/from16 v8, v21

    invoke-direct/range {v0 .. v8}, LM0/a;->B(IILandroid/text/TextUtils$TruncateAt;IIIII)LN0/l0;

    move-result-object v0

    if-eqz v11, :cond_2

    invoke-virtual {v0}, LN0/l0;->f()I

    move-result v1

    invoke-static/range {p4 .. p5}, LY0/b;->k(J)I

    move-result v2

    if-le v1, v2, :cond_2

    if-le v10, v14, :cond_2

    invoke-static/range {p4 .. p5}, LY0/b;->k(J)I

    move-result v1

    invoke-static {v0, v1}, LM0/b;->b(LN0/l0;I)I

    move-result v1

    if-ltz v1, :cond_2

    if-eq v1, v10, :cond_2

    invoke-static {v1, v14}, LE7/j;->d(II)I

    move-result v4

    move-object/from16 v0, p0

    move/from16 v1, v16

    move/from16 v2, v17

    move-object/from16 v3, v23

    move/from16 v5, v18

    move/from16 v6, v19

    move/from16 v7, v20

    move/from16 v8, v21

    invoke-direct/range {v0 .. v8}, LM0/a;->B(IILandroid/text/TextUtils$TruncateAt;IIIII)LN0/l0;

    move-result-object v0

    :cond_2
    iput-object v0, v9, LM0/a;->e:LN0/l0;

    invoke-virtual/range {p0 .. p0}, LM0/a;->E()LU0/g;

    move-result-object v0

    invoke-virtual {v15}, LM0/P;->g()Lo0/n0;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, LM0/a;->getWidth()F

    move-result v2

    invoke-virtual/range {p0 .. p0}, LM0/a;->getHeight()F

    move-result v3

    invoke-static {v2, v3}, Ln0/n;->a(FF)J

    move-result-wide v2

    invoke-virtual {v15}, LM0/P;->d()F

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, LU0/g;->e(Lo0/n0;JF)V

    iget-object v0, v9, LM0/a;->e:LN0/l0;

    invoke-direct {v9, v0}, LM0/a;->D(LN0/l0;)[LW0/b;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Ly7/c;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LW0/b;

    invoke-virtual/range {p0 .. p0}, LM0/a;->getWidth()F

    move-result v2

    invoke-virtual/range {p0 .. p0}, LM0/a;->getHeight()F

    move-result v3

    invoke-static {v2, v3}, Ln0/n;->a(FF)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, LW0/b;->c(J)V

    goto :goto_1

    :cond_3
    iget-object v0, v9, LM0/a;->f:Ljava/lang/CharSequence;

    instance-of v1, v0, Landroid/text/Spanned;

    if-nez v1, :cond_4

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    goto/16 :goto_c

    :cond_4
    move-object v1, v0

    check-cast v1, Landroid/text/Spanned;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v2, LP0/j;

    const/4 v3, 0x0

    invoke-interface {v1, v3, v0, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    array-length v4, v0

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, v0

    move v5, v3

    :goto_2
    if-ge v5, v4, :cond_c

    aget-object v6, v0, v5

    check-cast v6, LP0/j;

    invoke-interface {v1, v6}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v7

    invoke-interface {v1, v6}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v8

    iget-object v10, v9, LM0/a;->e:LN0/l0;

    invoke-virtual {v10, v7}, LN0/l0;->q(I)I

    move-result v10

    iget v11, v9, LM0/a;->b:I

    if-lt v10, v11, :cond_5

    move v11, v14

    goto :goto_3

    :cond_5
    move v11, v3

    :goto_3
    iget-object v12, v9, LM0/a;->e:LN0/l0;

    invoke-virtual {v12, v10}, LN0/l0;->n(I)I

    move-result v12

    if-lez v12, :cond_6

    iget-object v12, v9, LM0/a;->e:LN0/l0;

    invoke-virtual {v12, v10}, LN0/l0;->o(I)I

    move-result v12

    if-le v8, v12, :cond_6

    move v12, v14

    goto :goto_4

    :cond_6
    move v12, v3

    :goto_4
    iget-object v13, v9, LM0/a;->e:LN0/l0;

    invoke-virtual {v13, v10}, LN0/l0;->p(I)I

    move-result v13

    if-le v8, v13, :cond_7

    move v8, v14

    goto :goto_5

    :cond_7
    move v8, v3

    :goto_5
    if-nez v12, :cond_b

    if-nez v8, :cond_b

    if-eqz v11, :cond_8

    goto/16 :goto_a

    :cond_8
    invoke-virtual {v9, v7}, LM0/a;->m(I)LX0/i;

    move-result-object v8

    sget-object v11, LM0/a$a;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v11, v8

    const/4 v11, 0x2

    if-eq v8, v14, :cond_a

    if-ne v8, v11, :cond_9

    invoke-virtual {v9, v7, v14}, LM0/a;->z(IZ)F

    move-result v7

    invoke-virtual {v6}, LP0/j;->d()I

    move-result v8

    int-to-float v8, v8

    sub-float/2addr v7, v8

    goto :goto_6

    :cond_9
    new-instance v0, Li7/s;

    invoke-direct {v0}, Li7/s;-><init>()V

    throw v0

    :cond_a
    invoke-virtual {v9, v7, v14}, LM0/a;->z(IZ)F

    move-result v7

    :goto_6
    invoke-virtual {v6}, LP0/j;->d()I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v8, v7

    iget-object v12, v9, LM0/a;->e:LN0/l0;

    invoke-virtual {v6}, LP0/j;->c()I

    move-result v13

    packed-switch v13, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unexpected verticalAlignment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-virtual {v6}, LP0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v13

    iget v15, v13, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget v13, v13, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr v15, v13

    invoke-virtual {v6}, LP0/j;->b()I

    move-result v13

    sub-int/2addr v15, v13

    div-int/2addr v15, v11

    int-to-float v11, v15

    :goto_7
    invoke-virtual {v12, v10}, LN0/l0;->k(I)F

    move-result v10

    add-float/2addr v11, v10

    goto :goto_9

    :pswitch_1
    invoke-virtual {v6}, LP0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v11

    iget v11, v11, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    int-to-float v11, v11

    invoke-virtual {v12, v10}, LN0/l0;->k(I)F

    move-result v10

    add-float/2addr v11, v10

    invoke-virtual {v6}, LP0/j;->b()I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v11, v10

    goto :goto_9

    :pswitch_2
    invoke-virtual {v6}, LP0/j;->a()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v11

    iget v11, v11, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    int-to-float v11, v11

    goto :goto_7

    :pswitch_3
    invoke-virtual {v12, v10}, LN0/l0;->w(I)F

    move-result v13

    invoke-virtual {v12, v10}, LN0/l0;->l(I)F

    move-result v10

    add-float/2addr v13, v10

    invoke-virtual {v6}, LP0/j;->b()I

    move-result v10

    int-to-float v10, v10

    sub-float/2addr v13, v10

    int-to-float v10, v11

    div-float v11, v13, v10

    goto :goto_9

    :pswitch_4
    invoke-virtual {v12, v10}, LN0/l0;->l(I)F

    move-result v10

    :goto_8
    invoke-virtual {v6}, LP0/j;->b()I

    move-result v11

    int-to-float v11, v11

    sub-float v11, v10, v11

    goto :goto_9

    :pswitch_5
    invoke-virtual {v12, v10}, LN0/l0;->w(I)F

    move-result v11

    goto :goto_9

    :pswitch_6
    invoke-virtual {v12, v10}, LN0/l0;->k(I)F

    move-result v10

    goto :goto_8

    :goto_9
    invoke-virtual {v6}, LP0/j;->b()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v6, v11

    new-instance v10, Ln0/i;

    invoke-direct {v10, v7, v11, v8, v6}, Ln0/i;-><init>(FFFF)V

    goto :goto_b

    :cond_b
    :goto_a
    move-object/from16 v10, v22

    :goto_b
    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_2

    :cond_c
    move-object v0, v2

    :goto_c
    iput-object v0, v9, LM0/a;->g:Ljava/util/List;

    return-void

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "maxLines should be greater than 0"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(LU0/d;IZJLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LM0/a;-><init>(LU0/d;IZJ)V

    return-void
.end method

.method private final B(IILandroid/text/TextUtils$TruncateAt;IIIII)LN0/l0;
    .locals 24

    move-object/from16 v0, p0

    move/from16 v5, p1

    move/from16 v17, p2

    move-object/from16 v6, p3

    move/from16 v12, p4

    move/from16 v16, p5

    move/from16 v13, p6

    move/from16 v14, p7

    move/from16 v15, p8

    iget-object v2, v0, LM0/a;->f:Ljava/lang/CharSequence;

    invoke-virtual/range {p0 .. p0}, LM0/a;->getWidth()F

    move-result v3

    invoke-virtual/range {p0 .. p0}, LM0/a;->E()LU0/g;

    move-result-object v4

    iget-object v1, v0, LM0/a;->a:LU0/d;

    invoke-virtual {v1}, LU0/d;->j()I

    move-result v7

    iget-object v1, v0, LM0/a;->a:LU0/d;

    invoke-virtual {v1}, LU0/d;->h()LN0/M;

    move-result-object v20

    iget-object v1, v0, LM0/a;->a:LU0/d;

    invoke-virtual {v1}, LU0/d;->i()LM0/P;

    move-result-object v1

    invoke-static {v1}, LU0/c;->b(LM0/P;)Z

    move-result v10

    new-instance v23, LN0/l0;

    move-object/from16 v1, v23

    const v21, 0x30080

    const/16 v22, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    const/4 v11, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v1 .. v22}, LN0/l0;-><init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILN0/M;ILy7/k;)V

    return-object v23
.end method

.method private final D(LN0/l0;)[LW0/b;
    .locals 4

    .prologue
    invoke-virtual {p1}, LN0/l0;->G()Ljava/lang/CharSequence;

    move-result-object v0

    instance-of v0, v0, Landroid/text/Spanned;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, LN0/l0;->G()Ljava/lang/CharSequence;

    move-result-object v0

    const-string v2, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v0, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/text/Spanned;

    const-class v3, LW0/b;

    invoke-direct {p0, v0, v3}, LM0/a;->F(Landroid/text/Spanned;Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, LN0/l0;->G()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0, v2}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/text/Spanned;

    invoke-virtual {p1}, LN0/l0;->G()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [LW0/b;

    return-object p1
.end method

.method private final F(Landroid/text/Spanned;Ljava/lang/Class;)Z
    .locals 2

    .prologue
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, -0x1

    invoke-interface {p1, v1, v0, p2}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    move-result p2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final G(Lo0/q0;)V
    .locals 3

    .prologue
    invoke-static {p1}, Lo0/H;->d(Lo0/q0;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {p0}, LM0/a;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p0}, LM0/a;->getWidth()F

    move-result v0

    invoke-virtual {p0}, LM0/a;->getHeight()F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    :cond_0
    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->L(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, LM0/a;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_1
    return-void
.end method


# virtual methods
.method public A(I)F
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->t(I)F

    move-result p1

    return p1
.end method

.method public C(I)F
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->k(I)F

    move-result p1

    return p1
.end method

.method public final E()LU0/g;
    .locals 1

    iget-object v0, p0, LM0/a;->a:LU0/d;

    invoke-virtual {v0}, LU0/d;->k()LU0/g;

    move-result-object v0

    return-object v0
.end method

.method public a()F
    .locals 1

    iget-object v0, p0, LM0/a;->a:LU0/d;

    invoke-virtual {v0}, LU0/d;->a()F

    move-result v0

    return v0
.end method

.method public b()F
    .locals 1

    iget-object v0, p0, LM0/a;->a:LU0/d;

    invoke-virtual {v0}, LU0/d;->b()F

    move-result v0

    return v0
.end method

.method public c(Lo0/q0;JLo0/c2;LX0/k;Lq0/h;I)V
    .locals 2

    invoke-virtual {p0}, LM0/a;->E()LU0/g;

    move-result-object v0

    invoke-virtual {v0}, LU0/g;->b()I

    move-result v0

    invoke-virtual {p0}, LM0/a;->E()LU0/g;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, LU0/g;->f(J)V

    invoke-virtual {v1, p4}, LU0/g;->h(Lo0/c2;)V

    invoke-virtual {v1, p5}, LU0/g;->i(LX0/k;)V

    invoke-virtual {v1, p6}, LU0/g;->g(Lq0/h;)V

    invoke-virtual {v1, p7}, LU0/g;->d(I)V

    invoke-direct {p0, p1}, LM0/a;->G(Lo0/q0;)V

    invoke-virtual {p0}, LM0/a;->E()LU0/g;

    move-result-object p1

    invoke-virtual {p1, v0}, LU0/g;->d(I)V

    return-void
.end method

.method public d(Ln0/i;ILM0/I;)J
    .locals 2

    .prologue
    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-static {p1}, Lo0/X1;->c(Ln0/i;)Landroid/graphics/RectF;

    move-result-object p1

    invoke-static {p2}, LM0/b;->i(I)I

    move-result p2

    new-instance v1, LM0/a$b;

    invoke-direct {v1, p3}, LM0/a$b;-><init>(LM0/I;)V

    invoke-virtual {v0, p1, p2, v1}, LN0/l0;->C(Landroid/graphics/RectF;ILx7/p;)[I

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, LM0/N;->b:LM0/N$a;

    invoke-virtual {p1}, LM0/N$a;->a()J

    move-result-wide p1

    return-wide p1

    :cond_0
    const/4 p2, 0x0

    aget p2, p1, p2

    const/4 p3, 0x1

    aget p1, p1, p3

    invoke-static {p2, p1}, LM0/O;->b(II)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(J[FI)V
    .locals 2

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-static {p1, p2}, LM0/N;->l(J)I

    move-result v1

    invoke-static {p1, p2}, LM0/N;->k(J)I

    move-result p1

    invoke-virtual {v0, v1, p1, p3, p4}, LN0/l0;->a(II[FI)V

    return-void
.end method

.method public f(I)LX0/i;
    .locals 1

    .prologue
    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->q(I)I

    move-result p1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->z(I)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    sget-object p1, LX0/i;->C:LX0/i;

    goto :goto_0

    :cond_0
    sget-object p1, LX0/i;->D:LX0/i;

    :goto_0
    return-object p1
.end method

.method public g(I)F
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->w(I)F

    move-result p1

    return p1
.end method

.method public getHeight()F
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0}, LN0/l0;->f()I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method public getWidth()F
    .locals 2

    iget-wide v0, p0, LM0/a;->d:J

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method public h()F
    .locals 1

    invoke-virtual {p0}, LM0/a;->u()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v0}, LM0/a;->C(I)F

    move-result v0

    return v0
.end method

.method public i(I)Ln0/i;
    .locals 4

    .prologue
    if-ltz p1, :cond_0

    iget-object v0, p0, LM0/a;->f:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p1, v0, :cond_0

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LN0/l0;->B(LN0/l0;IZILjava/lang/Object;)F

    move-result v0

    iget-object v1, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v1, p1}, LN0/l0;->q(I)I

    move-result p1

    new-instance v1, Ln0/i;

    iget-object v2, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v2, p1}, LN0/l0;->w(I)F

    move-result v2

    iget-object v3, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v3, p1}, LN0/l0;->l(I)F

    move-result p1

    invoke-direct {v1, v0, v2, v0, p1}, Ln0/i;-><init>(FFFF)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "offset("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bounds [0,"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LM0/a;->f:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x5d

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(I)J
    .locals 2

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0}, LN0/l0;->I()LO0/i;

    move-result-object v0

    invoke-static {v0, p1}, LO0/h;->b(LO0/i;I)I

    move-result v1

    invoke-static {v0, p1}, LO0/h;->a(LO0/i;I)I

    move-result p1

    invoke-static {v1, p1}, LM0/O;->b(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public k(I)I
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->q(I)I

    move-result p1

    return p1
.end method

.method public l()F
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LM0/a;->C(I)F

    move-result v0

    return v0
.end method

.method public m(I)LX0/i;
    .locals 1

    .prologue
    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->K(I)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LX0/i;->D:LX0/i;

    goto :goto_0

    :cond_0
    sget-object p1, LX0/i;->C:LX0/i;

    :goto_0
    return-object p1
.end method

.method public n(Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V
    .locals 4

    invoke-virtual {p0}, LM0/a;->E()LU0/g;

    move-result-object v0

    invoke-virtual {v0}, LU0/g;->b()I

    move-result v0

    invoke-virtual {p0}, LM0/a;->E()LU0/g;

    move-result-object v1

    invoke-virtual {p0}, LM0/a;->getWidth()F

    move-result v2

    invoke-virtual {p0}, LM0/a;->getHeight()F

    move-result v3

    invoke-static {v2, v3}, Ln0/n;->a(FF)J

    move-result-wide v2

    invoke-virtual {v1, p2, v2, v3, p3}, LU0/g;->e(Lo0/n0;JF)V

    invoke-virtual {v1, p4}, LU0/g;->h(Lo0/c2;)V

    invoke-virtual {v1, p5}, LU0/g;->i(LX0/k;)V

    invoke-virtual {v1, p6}, LU0/g;->g(Lq0/h;)V

    invoke-virtual {v1, p7}, LU0/g;->d(I)V

    invoke-direct {p0, p1}, LM0/a;->G(Lo0/q0;)V

    invoke-virtual {p0}, LM0/a;->E()LU0/g;

    move-result-object p1

    invoke-virtual {p1, v0}, LU0/g;->d(I)V

    return-void
.end method

.method public o(I)F
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->l(I)F

    move-result p1

    return p1
.end method

.method public p(J)I
    .locals 2

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v1}, LN0/l0;->r(I)I

    move-result v0

    iget-object v1, p0, LM0/a;->e:LN0/l0;

    invoke-static {p1, p2}, Ln0/g;->m(J)F

    move-result p1

    invoke-virtual {v1, v0, p1}, LN0/l0;->y(IF)I

    move-result p1

    return p1
.end method

.method public q(I)Ln0/i;
    .locals 4

    .prologue
    if-ltz p1, :cond_0

    iget-object v0, p0, LM0/a;->f:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->c(I)Landroid/graphics/RectF;

    move-result-object p1

    new-instance v0, Ln0/i;

    iget v1, p1, Landroid/graphics/RectF;->left:F

    iget v2, p1, Landroid/graphics/RectF;->top:F

    iget v3, p1, Landroid/graphics/RectF;->right:F

    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v0, v1, v2, v3, p1}, Ln0/i;-><init>(FFFF)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "offset("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bounds [0,"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LM0/a;->f:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public r()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM0/a;->g:Ljava/util/List;

    return-object v0
.end method

.method public s(I)I
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->v(I)I

    move-result p1

    return p1
.end method

.method public t(IZ)I
    .locals 0

    .prologue
    if-eqz p2, :cond_0

    iget-object p2, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {p2, p1}, LN0/l0;->x(I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {p2, p1}, LN0/l0;->p(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public u()I
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0}, LN0/l0;->m()I

    move-result v0

    return v0
.end method

.method public v(I)F
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0, p1}, LN0/l0;->u(I)F

    move-result p1

    return p1
.end method

.method public w()Z
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v0}, LN0/l0;->d()Z

    move-result v0

    return v0
.end method

.method public x(F)I
    .locals 1

    iget-object v0, p0, LM0/a;->e:LN0/l0;

    float-to-int p1, p1

    invoke-virtual {v0, p1}, LN0/l0;->r(I)I

    move-result p1

    return p1
.end method

.method public y(II)Lo0/Q1;
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    iget-object v0, p0, LM0/a;->f:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iget-object v1, p0, LM0/a;->e:LN0/l0;

    invoke-virtual {v1, p1, p2, v0}, LN0/l0;->F(IILandroid/graphics/Path;)V

    invoke-static {v0}, Lo0/Y;->c(Landroid/graphics/Path;)Lo0/Q1;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "start("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") or end("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of range [0.."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LM0/a;->f:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "], or start > end!"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public z(IZ)F
    .locals 3

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    iget-object p2, p0, LM0/a;->e:LN0/l0;

    invoke-static {p2, p1, v2, v1, v0}, LN0/l0;->B(LN0/l0;IZILjava/lang/Object;)F

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p2, p0, LM0/a;->e:LN0/l0;

    invoke-static {p2, p1, v2, v1, v0}, LN0/l0;->E(LN0/l0;IZILjava/lang/Object;)F

    move-result p1

    :goto_0
    return p1
.end method
