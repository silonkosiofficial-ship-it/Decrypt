.class public final Landroidx/compose/foundation/text/modifiers/a;
.super LF0/m;
.source "SourceFile"

# interfaces
.implements LF0/E;
.implements LF0/s;
.implements LF0/u;


# instance fields
.field private R:LM/g;

.field private S:Lx7/l;

.field private final T:Landroidx/compose/foundation/text/modifiers/b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;)V
    .locals 18

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, LF0/m;-><init>()V

    move-object/from16 v1, p13

    iput-object v1, v0, Landroidx/compose/foundation/text/modifiers/a;->S:Lx7/l;

    new-instance v15, Landroidx/compose/foundation/text/modifiers/b;

    iget-object v12, v0, Landroidx/compose/foundation/text/modifiers/a;->R:LM/g;

    iget-object v14, v0, Landroidx/compose/foundation/text/modifiers/a;->S:Lx7/l;

    const/16 v16, 0x0

    move-object v1, v15

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v17, v15

    move-object/from16 v15, v16

    invoke-direct/range {v1 .. v15}, Landroidx/compose/foundation/text/modifiers/b;-><init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;Ly7/k;)V

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, LF0/m;->T1(LF0/j;)LF0/j;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/text/modifiers/b;

    iput-object v1, v0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Do not use SelectionCapableStaticTextModifier unless selectionController != null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public synthetic constructor <init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;ILy7/k;)V
    .locals 18

    .prologue
    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    sget-object v1, LX0/u;->a:LX0/u$a;

    invoke-virtual {v1}, LX0/u$a;->a()I

    move-result v1

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    move v9, v3

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    const v1, 0x7fffffff

    move v10, v1

    goto :goto_3

    :cond_3
    move/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move v11, v3

    goto :goto_4

    :cond_4
    move/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v2

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v2

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move-object v15, v2

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_9

    move-object/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object/from16 v16, p13

    :goto_9
    const/16 v17, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    invoke-direct/range {v3 .. v17}, Landroidx/compose/foundation/text/modifiers/a;-><init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p13}, Landroidx/compose/foundation/text/modifiers/a;-><init>(LM0/d;LM0/P;LR0/h$b;Lx7/l;IZIILjava/util/List;Lx7/l;LM/g;Lo0/B0;Lx7/l;)V

    return-void
.end method


# virtual methods
.method public C(LD0/o;LD0/n;I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->k2(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public F(LD0/o;LD0/n;I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->h2(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public final Z1(LM0/d;LM0/P;Ljava/util/List;IIZLR0/h$b;ILx7/l;Lx7/l;LM/g;Lo0/B0;)V
    .locals 12

    move-object v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    move-object v3, p2

    move-object/from16 v2, p12

    invoke-virtual {v1, v2, p2}, Landroidx/compose/foundation/text/modifiers/b;->n2(Lo0/B0;LM0/P;)Z

    move-result v10

    iget-object v2, v0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    move-object v4, p1

    invoke-virtual {v2, p1}, Landroidx/compose/foundation/text/modifiers/b;->p2(LM0/d;)Z

    move-result v11

    iget-object v2, v0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    move-object v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    invoke-virtual/range {v2 .. v9}, Landroidx/compose/foundation/text/modifiers/b;->o2(LM0/P;Ljava/util/List;IIZLR0/h$b;I)Z

    move-result v2

    iget-object v3, v0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    iget-object v4, v0, Landroidx/compose/foundation/text/modifiers/a;->S:Lx7/l;

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    move-object/from16 v7, p11

    invoke-virtual {v3, v5, v6, v7, v4}, Landroidx/compose/foundation/text/modifiers/b;->m2(Lx7/l;Lx7/l;LM/g;Lx7/l;)Z

    move-result v3

    invoke-virtual {v1, v10, v11, v2, v3}, Landroidx/compose/foundation/text/modifiers/b;->a2(ZZZZ)V

    invoke-static {p0}, LF0/H;->b(LF0/E;)V

    return-void
.end method

.method public f(LD0/M;LD0/G;J)LD0/K;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/compose/foundation/text/modifiers/b;->i2(LD0/M;LD0/G;J)LD0/K;

    move-result-object p1

    return-object p1
.end method

.method public k(LD0/o;LD0/n;I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->g2(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public synthetic m0()V
    .locals 0

    invoke-static {p0}, LF0/r;->a(LF0/s;)V

    return-void
.end method

.method public s(LD0/t;)V
    .locals 0

    return-void
.end method

.method public t(LD0/o;LD0/n;I)I
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/compose/foundation/text/modifiers/b;->j2(LD0/o;LD0/n;I)I

    move-result p1

    return p1
.end method

.method public y(Lq0/c;)V
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/a;->T:Landroidx/compose/foundation/text/modifiers/b;

    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/modifiers/b;->b2(Lq0/c;)V

    return-void
.end method
