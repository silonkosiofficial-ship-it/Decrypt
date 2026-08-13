.class public final LM0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:LM0/k;

.field private final b:I

.field private final c:Z

.field private final d:F

.field private final e:F

.field private final f:I

.field private final g:Ljava/util/List;

.field private final h:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(LM0/k;JIZ)V
    .locals 19

    .prologue
    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    iput-object v1, v0, LM0/j;->a:LM0/k;

    move/from16 v2, p4

    iput v2, v0, LM0/j;->b:I

    invoke-static/range {p2 .. p3}, LY0/b;->n(J)I

    move-result v2

    if-nez v2, :cond_9

    invoke-static/range {p2 .. p3}, LY0/b;->m(J)I

    move-result v2

    if-nez v2, :cond_9

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, LM0/k;->f()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v10, v4

    move v12, v5

    move v5, v10

    :goto_0
    if-ge v5, v3, :cond_3

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LM0/r;

    invoke-virtual {v6}, LM0/r;->b()LM0/s;

    move-result-object v7

    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v14

    invoke-static/range {p2 .. p3}, LY0/b;->g(J)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v8

    invoke-static {v12}, LM0/u;->d(F)I

    move-result v9

    sub-int/2addr v8, v9

    invoke-static {v8, v4}, LE7/j;->d(II)I

    move-result v8

    :goto_1
    move/from16 v16, v8

    goto :goto_2

    :cond_0
    invoke-static/range {p2 .. p3}, LY0/b;->k(J)I

    move-result v8

    goto :goto_1

    :goto_2
    const/16 v17, 0x5

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v13 .. v18}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v8

    iget v11, v0, LM0/j;->b:I

    sub-int/2addr v11, v10

    move/from16 v14, p5

    invoke-static {v7, v8, v9, v11, v14}, LM0/u;->c(LM0/s;JIZ)LM0/p;

    move-result-object v15

    invoke-interface {v15}, LM0/p;->getHeight()F

    move-result v7

    add-float v16, v12, v7

    invoke-interface {v15}, LM0/p;->u()I

    move-result v7

    add-int v13, v10, v7

    new-instance v11, LM0/q;

    invoke-virtual {v6}, LM0/r;->c()I

    move-result v8

    invoke-virtual {v6}, LM0/r;->a()I

    move-result v9

    move-object v6, v11

    move-object v7, v15

    move-object v4, v11

    move v11, v13

    move-object/from16 p4, v1

    move v1, v13

    move/from16 v13, v16

    invoke-direct/range {v6 .. v13}, LM0/q;-><init>(LM0/p;IIIIFF)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v15}, LM0/p;->w()Z

    move-result v4

    if-nez v4, :cond_2

    iget v4, v0, LM0/j;->b:I

    if-ne v1, v4, :cond_1

    iget-object v4, v0, LM0/j;->a:LM0/k;

    invoke-virtual {v4}, LM0/k;->f()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lj7/v;->o(Ljava/util/List;)I

    move-result v4

    if-eq v5, v4, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v5, v5, 0x1

    move v10, v1

    move/from16 v12, v16

    const/4 v4, 0x0

    move-object/from16 v1, p4

    goto/16 :goto_0

    :cond_2
    :goto_3
    const/4 v3, 0x1

    move v10, v1

    move/from16 v12, v16

    goto :goto_4

    :cond_3
    const/4 v3, 0x0

    :goto_4
    iput v12, v0, LM0/j;->e:F

    iput v10, v0, LM0/j;->f:I

    iput-boolean v3, v0, LM0/j;->c:Z

    iput-object v2, v0, LM0/j;->h:Ljava/util/List;

    invoke-static/range {p2 .. p3}, LY0/b;->l(J)I

    move-result v1

    int-to-float v1, v1

    iput v1, v0, LM0/j;->d:F

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_5
    const/4 v5, 0x0

    if-ge v4, v3, :cond_6

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LM0/q;

    invoke-virtual {v6}, LM0/q;->e()LM0/p;

    move-result-object v7

    invoke-interface {v7}, LM0/p;->r()Ljava/util/List;

    move-result-object v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v9, :cond_5

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ln0/i;

    if-eqz v11, :cond_4

    invoke-virtual {v6, v11}, LM0/q;->i(Ln0/i;)Ln0/i;

    move-result-object v11

    goto :goto_7

    :cond_4
    move-object v11, v5

    :goto_7
    invoke-interface {v8, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_5
    invoke-static {v1, v8}, Lj7/v;->C(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    :cond_6
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    iget-object v3, v0, LM0/j;->a:LM0/k;

    invoke-virtual {v3}, LM0/k;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_8

    iget-object v2, v0, LM0/j;->a:LM0/k;

    invoke-virtual {v2}, LM0/k;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v2, v3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    :goto_8
    if-ge v4, v2, :cond_7

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_7
    invoke-static {v1, v3}, Lj7/v;->C0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    :cond_8
    iput-object v1, v0, LM0/j;->g:Ljava/util/List;

    return-void

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public synthetic constructor <init>(LM0/k;JIZLy7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, LM0/j;-><init>(LM0/k;JIZ)V

    return-void
.end method

.method public static synthetic D(LM0/j;Lo0/q0;JLo0/c2;LX0/k;Lq0/h;IILjava/lang/Object;)V
    .locals 6

    .prologue
    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    sget-object v0, Lo0/y0;->b:Lo0/y0$a;

    invoke-virtual {v0}, Lo0/y0$a;->g()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    move-wide v0, p2

    :goto_0
    and-int/lit8 v2, p8, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object v2, p4

    :goto_1
    and-int/lit8 v4, p8, 0x8

    if-eqz v4, :cond_2

    move-object v4, v3

    goto :goto_2

    :cond_2
    move-object v4, p5

    :goto_2
    and-int/lit8 v5, p8, 0x10

    if-eqz v5, :cond_3

    goto :goto_3

    :cond_3
    move-object v3, p6

    :goto_3
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_4

    sget-object v5, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {v5}, Lq0/g$a;->a()I

    move-result v5

    goto :goto_4

    :cond_4
    move v5, p7

    :goto_4
    move-object p2, p0

    move-object p3, p1

    move-wide p4, v0

    move-object p6, v2

    move-object p7, v4

    move-object p8, v3

    move p9, v5

    invoke-virtual/range {p2 .. p9}, LM0/j;->C(Lo0/q0;JLo0/c2;LX0/k;Lq0/h;I)V

    return-void
.end method

.method public static synthetic F(LM0/j;Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;IILjava/lang/Object;)V
    .locals 9

    .prologue
    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    const/high16 v0, 0x7fc00000    # Float.NaN

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object v6, p5

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    move-object v7, v1

    goto :goto_3

    :cond_3
    move-object v7, p6

    :goto_3
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_4

    sget-object v0, Lq0/g;->B:Lq0/g$a;

    invoke-virtual {v0}, Lq0/g$a;->a()I

    move-result v0

    move v8, v0

    goto :goto_4

    :cond_4
    move/from16 v8, p7

    :goto_4
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v8}, LM0/j;->E(Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V

    return-void
.end method

.method private final G(I)V
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "offset("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bounds [0, "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object p1

    invoke-virtual {p1}, LM0/d;->length()I

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

.method private final H(I)V
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "offset("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bounds [0, "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object p1

    invoke-virtual {p1}, LM0/d;->length()I

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

.method private final I(I)V
    .locals 2

    .prologue
    if-ltz p1, :cond_0

    iget v0, p0, LM0/j;->f:I

    if-ge p1, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "lineIndex("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of bounds [0, "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, LM0/j;->f:I

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

.method private final b()LM0/d;
    .locals 1

    iget-object v0, p0, LM0/j;->a:LM0/k;

    invoke-virtual {v0}, LM0/k;->e()LM0/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final A()F
    .locals 1

    iget v0, p0, LM0/j;->d:F

    return v0
.end method

.method public final B(I)J
    .locals 3

    .prologue
    invoke-direct {p0, p1}, LM0/j;->H(I)V

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->a(Ljava/util/List;I)I

    move-result v0

    :goto_0
    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->r(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->j(I)J

    move-result-wide v1

    const/4 p1, 0x0

    invoke-virtual {v0, v1, v2, p1}, LM0/q;->k(JZ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final C(Lo0/q0;JLo0/c2;LX0/k;Lq0/h;I)V
    .locals 13

    .prologue
    invoke-interface {p1}, Lo0/q0;->m()V

    move-object v0, p0

    iget-object v1, v0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LM0/q;

    invoke-virtual {v4}, LM0/q;->e()LM0/p;

    move-result-object v5

    move-object v6, p1

    move-wide v7, p2

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move/from16 v12, p7

    invoke-interface/range {v5 .. v12}, LM0/p;->c(Lo0/q0;JLo0/c2;LX0/k;Lq0/h;I)V

    invoke-virtual {v4}, LM0/q;->e()LM0/p;

    move-result-object v4

    invoke-interface {v4}, LM0/p;->getHeight()F

    move-result v4

    const/4 v5, 0x0

    invoke-interface {p1, v5, v4}, Lo0/q0;->d(FF)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    move-object v6, p1

    invoke-interface {p1}, Lo0/q0;->s()V

    return-void
.end method

.method public final E(Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V
    .locals 0

    invoke-static/range {p0 .. p7}, LU0/b;->a(LM0/j;Lo0/q0;Lo0/n0;FLo0/c2;LX0/k;Lq0/h;I)V

    return-void
.end method

.method public final a(J[FI)[F
    .locals 7

    invoke-static {p1, p2}, LM0/N;->l(J)I

    move-result v0

    invoke-direct {p0, v0}, LM0/j;->G(I)V

    invoke-static {p1, p2}, LM0/N;->k(J)I

    move-result v0

    invoke-direct {p0, v0}, LM0/j;->H(I)V

    new-instance v5, Ly7/M;

    invoke-direct {v5}, Ly7/M;-><init>()V

    iput p4, v5, Ly7/M;->C:I

    new-instance v6, Ly7/L;

    invoke-direct {v6}, Ly7/L;-><init>()V

    iget-object p4, p0, LM0/j;->h:Ljava/util/List;

    new-instance v0, LM0/j$a;

    move-object v1, v0

    move-wide v2, p1

    move-object v4, p3

    invoke-direct/range {v1 .. v6}, LM0/j$a;-><init>(J[FLy7/M;Ly7/L;)V

    invoke-static {p4, p1, p2, v0}, LM0/m;->d(Ljava/util/List;JLx7/l;)V

    return-object p3
.end method

.method public final c(I)LX0/i;
    .locals 2

    .prologue
    invoke-direct {p0, p1}, LM0/j;->H(I)V

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->a(Ljava/util/List;I)I

    move-result v0

    :goto_0
    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->r(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->m(I)LX0/i;

    move-result-object p1

    return-object p1
.end method

.method public final d(I)Ln0/i;
    .locals 2

    invoke-direct {p0, p1}, LM0/j;->G(I)V

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->a(Ljava/util/List;I)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->r(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->q(I)Ln0/i;

    move-result-object p1

    invoke-virtual {v0, p1}, LM0/q;->i(Ln0/i;)Ln0/i;

    move-result-object p1

    return-object p1
.end method

.method public final e(I)Ln0/i;
    .locals 2

    .prologue
    invoke-direct {p0, p1}, LM0/j;->H(I)V

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->a(Ljava/util/List;I)I

    move-result v0

    :goto_0
    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->r(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->i(I)Ln0/i;

    move-result-object p1

    invoke-virtual {v0, p1}, LM0/q;->i(Ln0/i;)Ln0/i;

    move-result-object p1

    return-object p1
.end method

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, LM0/j;->c:Z

    return v0
.end method

.method public final g()F
    .locals 2

    .prologue
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v0

    invoke-interface {v0}, LM0/p;->l()F

    move-result v0

    :goto_0
    return v0
.end method

.method public final h()F
    .locals 1

    iget v0, p0, LM0/j;->e:F

    return v0
.end method

.method public final i(IZ)F
    .locals 2

    .prologue
    invoke-direct {p0, p1}, LM0/j;->H(I)V

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->a(Ljava/util/List;I)I

    move-result v0

    :goto_0
    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->r(I)I

    move-result p1

    invoke-interface {v1, p1, p2}, LM0/p;->z(IZ)F

    move-result p1

    return p1
.end method

.method public final j()LM0/k;
    .locals 1

    iget-object v0, p0, LM0/j;->a:LM0/k;

    return-object v0
.end method

.method public final k()F
    .locals 2

    .prologue
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->t0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-interface {v1}, LM0/p;->h()F

    move-result v1

    invoke-virtual {v0, v1}, LM0/q;->o(F)F

    move-result v0

    :goto_0
    return v0
.end method

.method public final l(I)F
    .locals 2

    invoke-direct {p0, p1}, LM0/j;->I(I)V

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->b(Ljava/util/List;I)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->s(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->o(I)F

    move-result p1

    invoke-virtual {v0, p1}, LM0/q;->o(F)F

    move-result p1

    return p1
.end method

.method public final m()I
    .locals 1

    iget v0, p0, LM0/j;->f:I

    return v0
.end method

.method public final n(IZ)I
    .locals 2

    invoke-direct {p0, p1}, LM0/j;->I(I)V

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->b(Ljava/util/List;I)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->s(I)I

    move-result p1

    invoke-interface {v1, p1, p2}, LM0/p;->t(IZ)I

    move-result p1

    invoke-virtual {v0, p1}, LM0/q;->m(I)I

    move-result p1

    return p1
.end method

.method public final o(I)I
    .locals 2

    .prologue
    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->length()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->a(Ljava/util/List;I)I

    move-result v0

    :goto_0
    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->r(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->k(I)I

    move-result p1

    invoke-virtual {v0, p1}, LM0/q;->n(I)I

    move-result p1

    return p1
.end method

.method public final p(F)I
    .locals 2

    .prologue
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->c(Ljava/util/List;F)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->d()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LM0/q;->g()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->t(F)F

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->x(F)I

    move-result p1

    invoke-virtual {v0, p1}, LM0/q;->n(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final q(I)F
    .locals 2

    invoke-direct {p0, p1}, LM0/j;->I(I)V

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->b(Ljava/util/List;I)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->s(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->A(I)F

    move-result p1

    return p1
.end method

.method public final r(I)F
    .locals 2

    invoke-direct {p0, p1}, LM0/j;->I(I)V

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->b(Ljava/util/List;I)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->s(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->v(I)F

    move-result p1

    return p1
.end method

.method public final s(I)I
    .locals 2

    invoke-direct {p0, p1}, LM0/j;->I(I)V

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->b(Ljava/util/List;I)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->s(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->s(I)I

    move-result p1

    invoke-virtual {v0, p1}, LM0/q;->m(I)I

    move-result p1

    return p1
.end method

.method public final t(I)F
    .locals 2

    invoke-direct {p0, p1}, LM0/j;->I(I)V

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->b(Ljava/util/List;I)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->s(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->g(I)F

    move-result p1

    invoke-virtual {v0, p1}, LM0/q;->o(F)F

    move-result p1

    return p1
.end method

.method public final u(J)I
    .locals 2

    .prologue
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    invoke-static {v0, v1}, LM0/m;->c(Ljava/util/List;F)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->d()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, LM0/q;->f()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1, p2}, LM0/q;->q(J)J

    move-result-wide p1

    invoke-interface {v1, p1, p2}, LM0/p;->p(J)I

    move-result p1

    invoke-virtual {v0, p1}, LM0/q;->m(I)I

    move-result p1

    :goto_0
    return p1
.end method

.method public final v(I)LX0/i;
    .locals 2

    .prologue
    invoke-direct {p0, p1}, LM0/j;->H(I)V

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->length()I

    move-result v0

    if-ne p1, v0, :cond_0

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0}, Lj7/v;->o(Ljava/util/List;)I

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v0, p1}, LM0/m;->a(Ljava/util/List;I)I

    move-result v0

    :goto_0
    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LM0/q;

    invoke-virtual {v0}, LM0/q;->e()LM0/p;

    move-result-object v1

    invoke-virtual {v0, p1}, LM0/q;->r(I)I

    move-result p1

    invoke-interface {v1, p1}, LM0/p;->f(I)LX0/i;

    move-result-object p1

    return-object p1
.end method

.method public final w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    return-object v0
.end method

.method public final x(II)Lo0/Q1;
    .locals 5

    .prologue
    if-ltz p1, :cond_1

    if-gt p1, p2, :cond_1

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object v0

    invoke-virtual {v0}, LM0/d;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt p2, v0, :cond_1

    if-ne p1, p2, :cond_0

    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lo0/Y;->a()Lo0/Q1;

    move-result-object v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {p1, p2}, LM0/O;->b(II)J

    move-result-wide v2

    new-instance v4, LM0/j$b;

    invoke-direct {v4, v0, p1, p2}, LM0/j$b;-><init>(Lo0/Q1;II)V

    invoke-static {v1, v2, v3, v4}, LM0/m;->d(Ljava/util/List;JLx7/l;)V

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Start("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") or End("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is out of range [0.."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, LM0/j;->b()LM0/d;

    move-result-object p1

    invoke-virtual {p1}, LM0/d;->i()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "), or start > end!"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final y()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LM0/j;->g:Ljava/util/List;

    return-object v0
.end method

.method public final z(Ln0/i;ILM0/I;)J
    .locals 11

    .prologue
    iget-object v0, p0, LM0/j;->h:Ljava/util/List;

    invoke-virtual {p1}, Ln0/i;->l()F

    move-result v1

    invoke-static {v0, v1}, LM0/m;->c(Ljava/util/List;F)I

    move-result v0

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LM0/q;

    invoke-virtual {v1}, LM0/q;->a()F

    move-result v1

    invoke-virtual {p1}, Ln0/i;->e()F

    move-result v2

    cmpl-float v1, v1, v2

    if-gez v1, :cond_5

    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-static {v1}, Lj7/v;->o(Ljava/util/List;)I

    move-result v1

    if-ne v0, v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-virtual {p1}, Ln0/i;->e()F

    move-result v2

    invoke-static {v1, v2}, LM0/m;->c(Ljava/util/List;F)I

    move-result v1

    sget-object v2, LM0/N;->b:LM0/N$a;

    invoke-virtual {v2}, LM0/N$a;->a()J

    move-result-wide v2

    :goto_0
    sget-object v4, LM0/N;->b:LM0/N$a;

    invoke-virtual {v4}, LM0/N$a;->a()J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, LM0/N;->g(JJ)Z

    move-result v5

    if-eqz v5, :cond_1

    if-gt v0, v1, :cond_1

    iget-object v2, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LM0/q;

    invoke-virtual {v3}, LM0/q;->e()LM0/p;

    move-result-object v2

    invoke-virtual {v3, p1}, LM0/q;->p(Ln0/i;)Ln0/i;

    move-result-object v4

    invoke-interface {v2, v4, p2, p3}, LM0/p;->d(Ln0/i;ILM0/I;)J

    move-result-wide v4

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, LM0/q;->l(LM0/q;JZILjava/lang/Object;)J

    move-result-wide v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, LM0/N$a;->a()J

    move-result-wide v5

    invoke-static {v2, v3, v5, v6}, LM0/N;->g(JJ)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-virtual {v4}, LM0/N$a;->a()J

    move-result-wide p1

    return-wide p1

    :cond_2
    invoke-virtual {v4}, LM0/N$a;->a()J

    move-result-wide v4

    :goto_1
    sget-object v6, LM0/N;->b:LM0/N$a;

    invoke-virtual {v6}, LM0/N$a;->a()J

    move-result-wide v7

    invoke-static {v4, v5, v7, v8}, LM0/N;->g(JJ)Z

    move-result v7

    if-eqz v7, :cond_3

    if-gt v0, v1, :cond_3

    iget-object v4, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LM0/q;

    invoke-virtual {v5}, LM0/q;->e()LM0/p;

    move-result-object v4

    invoke-virtual {v5, p1}, LM0/q;->p(Ln0/i;)Ln0/i;

    move-result-object v6

    invoke-interface {v4, v6, p2, p3}, LM0/p;->d(Ln0/i;ILM0/I;)J

    move-result-wide v6

    const/4 v9, 0x1

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, LM0/q;->l(LM0/q;JZILjava/lang/Object;)J

    move-result-wide v4

    add-int/lit8 v1, v1, -0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v6}, LM0/N$a;->a()J

    move-result-wide p1

    invoke-static {v4, v5, p1, p2}, LM0/N;->g(JJ)Z

    move-result p1

    if-eqz p1, :cond_4

    return-wide v2

    :cond_4
    invoke-static {v2, v3}, LM0/N;->n(J)I

    move-result p1

    invoke-static {v4, v5}, LM0/N;->i(J)I

    move-result p2

    invoke-static {p1, p2}, LM0/O;->b(II)J

    move-result-wide p1

    return-wide p1

    :cond_5
    :goto_2
    iget-object v1, p0, LM0/j;->h:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LM0/q;

    invoke-virtual {v1}, LM0/q;->e()LM0/p;

    move-result-object v0

    invoke-virtual {v1, p1}, LM0/q;->p(Ln0/i;)Ln0/i;

    move-result-object p1

    invoke-interface {v0, p1, p2, p3}, LM0/p;->d(Ln0/i;ILM0/I;)J

    move-result-wide v2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LM0/q;->l(LM0/q;JZILjava/lang/Object;)J

    move-result-wide p1

    return-wide p1
.end method
