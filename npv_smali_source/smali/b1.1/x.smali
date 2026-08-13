.class public Lb1/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/b$c;
.implements Lb1/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/x$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private final b:Lm1/f;

.field private final c:Ljava/util/Map;

.field private final d:Ljava/util/Map;

.field private final e:Ljava/util/Map;

.field private final f:Lb1/z;

.field private final g:[I

.field private final h:[I

.field private i:F

.field private j:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY0/e;)V
    .locals 2

    const-string v0, "density"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lb1/x;->a:Ljava/lang/String;

    new-instance v0, Lm1/f;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lm1/f;-><init>(II)V

    invoke-virtual {v0, p0}, Lm1/f;->N2(Ln1/b$c;)V

    iput-object v0, p0, Lb1/x;->b:Lm1/f;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lb1/x;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lb1/x;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lb1/x;->e:Ljava/util/Map;

    new-instance v0, Lb1/z;

    invoke-direct {v0, p1}, Lb1/z;-><init>(LY0/e;)V

    iput-object v0, p0, Lb1/x;->f:Lb1/z;

    const/4 p1, 0x2

    new-array v0, p1, [I

    iput-object v0, p0, Lb1/x;->g:[I

    new-array p1, p1, [I

    iput-object p1, p0, Lb1/x;->h:[I

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lb1/x;->i:F

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lb1/x;->j:Ljava/util/ArrayList;

    return-void
.end method

.method private final e([Ljava/lang/Integer;Ln1/b$b;)V
    .locals 2

    invoke-virtual {p2}, Ln1/b$b;->k()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    invoke-virtual {p2}, Ln1/b$b;->i()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p1, v1

    invoke-virtual {p2}, Ln1/b$b;->g()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v0, 0x2

    aput-object p2, p1, v0

    return-void
.end method

.method private final f(Lm1/e;J)J
    .locals 5

    .prologue
    invoke-virtual {p1}, Lm1/e;->p()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1}, Lm1/e;->s0()Ljava/lang/String;

    move-result-object v1

    instance-of v2, p1, Lm1/l;

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    invoke-static {p2, p3}, LY0/b;->j(J)Z

    move-result v0

    const/high16 v1, -0x80000000

    const/high16 v2, 0x40000000    # 2.0f

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-static {p2, p3}, LY0/b;->h(J)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v3

    :goto_0
    invoke-static {p2, p3}, LY0/b;->i(J)Z

    move-result v4

    if-eqz v4, :cond_2

    move v3, v2

    goto :goto_1

    :cond_2
    invoke-static {p2, p3}, LY0/b;->g(J)Z

    move-result v2

    if-eqz v2, :cond_3

    move v3, v1

    :cond_3
    :goto_1
    check-cast p1, Lm1/l;

    invoke-static {p2, p3}, LY0/b;->l(J)I

    move-result v1

    invoke-static {p2, p3}, LY0/b;->k(J)I

    move-result p2

    invoke-virtual {p1, v0, v1, v3, p2}, Lm1/l;->m2(IIII)V

    invoke-virtual {p1}, Lm1/l;->h2()I

    move-result p2

    invoke-virtual {p1}, Lm1/l;->g2()I

    move-result p1

    :goto_2
    invoke-static {p2, p1}, Lc1/b;->a(II)J

    move-result-wide p1

    goto :goto_3

    :cond_4
    instance-of p1, v0, LD0/G;

    if-eqz p1, :cond_5

    move-object p1, v0

    check-cast p1, LD0/G;

    invoke-interface {p1, p2, p3}, LD0/G;->U(J)LD0/X;

    move-result-object p1

    iget-object p2, p0, Lb1/x;->c:Ljava/util/Map;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, LD0/X;->I0()I

    move-result p2

    invoke-virtual {p1}, LD0/X;->w0()I

    move-result p1

    goto :goto_2

    :cond_5
    sget-object p1, Ld1/a;->a:Ld1/a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Nothing to measure for widget: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "CCL"

    invoke-virtual {p1, p3, p2}, Ld1/a;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3, v3}, Lc1/b;->a(II)J

    move-result-wide p1

    :goto_3
    return-wide p1
.end method

.method private final g(Lm1/e$b;IIIZZI[I)Z
    .locals 5

    .prologue
    sget-object v0, Lb1/x$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_b

    const/4 v3, 0x2

    if-eq v0, v3, :cond_a

    const/4 v3, 0x3

    if-eq v0, v3, :cond_2

    const/4 p2, 0x4

    if-ne v0, p2, :cond_1

    aput p7, p8, v2

    aput p7, p8, v1

    :cond_0
    :goto_0
    move v1, v2

    goto/16 :goto_5

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported"

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    invoke-static {}, Lb1/j;->a()Z

    move-result p1

    const-string v0, "CCL"

    if-eqz p1, :cond_3

    sget-object p1, Ld1/a;->a:Ld1/a;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Measure strategy "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "DW "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ODR "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "IRH "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v0, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    if-nez p6, :cond_6

    sget-object p1, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {p1}, Ln1/b$b$a;->b()I

    move-result p6

    if-eq p4, p6, :cond_4

    invoke-virtual {p1}, Ln1/b$b$a;->c()I

    move-result p6

    if-ne p4, p6, :cond_5

    :cond_4
    invoke-virtual {p1}, Ln1/b$b$a;->c()I

    move-result p1

    if-eq p4, p1, :cond_6

    if-ne p3, v1, :cond_6

    if-eqz p5, :cond_5

    goto :goto_1

    :cond_5
    move p1, v2

    goto :goto_2

    :cond_6
    :goto_1
    move p1, v1

    :goto_2
    invoke-static {}, Lb1/j;->a()Z

    move-result p3

    if-eqz p3, :cond_7

    sget-object p3, Ld1/a;->a:Ld1/a;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "UD "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, v0, p4}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    if-eqz p1, :cond_8

    move p3, p2

    goto :goto_3

    :cond_8
    move p3, v2

    :goto_3
    aput p3, p8, v2

    if-eqz p1, :cond_9

    goto :goto_4

    :cond_9
    move p2, p7

    :goto_4
    aput p2, p8, v1

    if-nez p1, :cond_0

    goto :goto_5

    :cond_a
    aput v2, p8, v2

    aput p7, p8, v1

    goto :goto_5

    :cond_b
    aput p2, p8, v2

    aput p2, p8, v1

    goto/16 :goto_0

    :goto_5
    return v1
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Lm1/e;Ln1/b$b;)V
    .locals 19

    .prologue
    move-object/from16 v9, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    const-string v0, "constraintWidget"

    invoke-static {v10, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measure"

    invoke-static {v11, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lm1/e;->s0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-static {}, Lb1/j;->a()Z

    move-result v0

    const-string v13, "Measuring "

    const-string v14, "CCL"

    if-eqz v0, :cond_0

    sget-object v0, Ld1/a;->a:Ld1/a;

    invoke-static/range {p1 .. p1}, Lb1/j;->b(Lm1/e;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " with: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v14, v1}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, v9, Lb1/x;->d:Ljava/util/Map;

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, [Ljava/lang/Integer;

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->d()Lm1/e$b;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->e()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lm1/e;->Q()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->f()I

    move-result v4

    const/16 v16, 0x1

    const/4 v8, 0x0

    if-eqz v15, :cond_1

    aget-object v0, v15, v16

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v8

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lm1/e;->w()I

    move-result v5

    if-ne v0, v5, :cond_2

    move/from16 v5, v16

    goto :goto_1

    :cond_2
    move v5, v8

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lm1/e;->Q0()Z

    move-result v6

    iget-object v0, v9, Lb1/x;->f:Lb1/z;

    invoke-virtual {v0}, Lb1/z;->G()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, LY0/b;->l(J)I

    move-result v7

    iget-object v0, v9, Lb1/x;->g:[I

    move-object/from16 v17, v0

    move-object/from16 v0, p0

    move v11, v8

    move-object/from16 v8, v17

    invoke-direct/range {v0 .. v8}, Lb1/x;->g(Lm1/e$b;IIIZZI[I)Z

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->l()Lm1/e$b;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->m()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lm1/e;->P()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->f()I

    move-result v4

    if-eqz v15, :cond_3

    aget-object v0, v15, v11

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_2

    :cond_3
    move v8, v11

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lm1/e;->B0()I

    move-result v0

    if-ne v8, v0, :cond_4

    move/from16 v5, v16

    goto :goto_3

    :cond_4
    move v5, v11

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lm1/e;->R0()Z

    move-result v6

    iget-object v0, v9, Lb1/x;->f:Lb1/z;

    invoke-virtual {v0}, Lb1/z;->G()J

    move-result-wide v7

    invoke-static {v7, v8}, LY0/b;->k(J)I

    move-result v7

    iget-object v8, v9, Lb1/x;->h:[I

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v8}, Lb1/x;->g(Lm1/e$b;IIIZZI[I)Z

    iget-object v0, v9, Lb1/x;->g:[I

    aget v1, v0, v11

    aget v0, v0, v16

    iget-object v2, v9, Lb1/x;->h:[I

    aget v3, v2, v11

    aget v2, v2, v16

    invoke-static {v1, v0, v3, v2}, LY0/c;->a(IIII)J

    move-result-wide v0

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->f()I

    move-result v2

    sget-object v3, Ln1/b$b;->k:Ln1/b$b$a;

    invoke-virtual {v3}, Ln1/b$b$a;->b()I

    move-result v4

    if-eq v2, v4, :cond_5

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->f()I

    move-result v2

    invoke-virtual {v3}, Ln1/b$b$a;->c()I

    move-result v3

    if-eq v2, v3, :cond_5

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->d()Lm1/e$b;

    move-result-object v2

    sget-object v3, Lm1/e$b;->E:Lm1/e$b;

    if-ne v2, v3, :cond_5

    invoke-virtual/range {p1 .. p1}, Lm1/e;->Q()I

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->l()Lm1/e$b;

    move-result-object v2

    if-ne v2, v3, :cond_5

    invoke-virtual/range {p1 .. p1}, Lm1/e;->P()I

    move-result v2

    if-eqz v2, :cond_f

    :cond_5
    invoke-static {}, Lb1/j;->a()Z

    move-result v2

    const-string v3, " with "

    if-eqz v2, :cond_6

    sget-object v2, Ld1/a;->a:Ld1/a;

    invoke-static {v0, v1}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v14, v4}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    invoke-direct {v9, v10, v0, v1}, Lb1/x;->f(Lm1/e;J)J

    move-result-wide v4

    invoke-virtual {v10, v11}, Lm1/e;->E1(Z)V

    invoke-static {}, Lb1/j;->a()Z

    move-result v2

    if-eqz v2, :cond_7

    sget-object v2, Ld1/a;->a:Ld1/a;

    invoke-static {v4, v5}, Lc1/b;->c(J)I

    move-result v6

    invoke-static {v4, v5}, Lc1/b;->d(J)I

    move-result v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, " is size "

    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " "

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v14, v6}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    invoke-static {v4, v5}, Lc1/b;->c(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lm1/e;->U()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v7

    const/4 v8, 0x0

    if-lez v7, :cond_8

    goto :goto_4

    :cond_8
    move-object v6, v8

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lm1/e;->S()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v13

    if-lez v13, :cond_9

    goto :goto_5

    :cond_9
    move-object v7, v8

    :goto_5
    invoke-static {v2, v6, v7}, LE7/j;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-static {v4, v5}, Lc1/b;->d(J)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lm1/e;->T()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v13

    if-lez v13, :cond_a

    goto :goto_6

    :cond_a
    move-object v7, v8

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lm1/e;->R()I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    move-result v15

    if-lez v15, :cond_b

    move-object v8, v13

    :cond_b
    invoke-static {v6, v7, v8}, LE7/j;->m(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {v4, v5}, Lc1/b;->c(J)I

    move-result v7

    if-eq v2, v7, :cond_c

    invoke-static {v0, v1}, LY0/b;->m(J)I

    move-result v7

    invoke-static {v0, v1}, LY0/b;->k(J)I

    move-result v0

    invoke-static {v2, v2, v7, v0}, LY0/c;->a(IIII)J

    move-result-wide v0

    move/from16 v8, v16

    goto :goto_7

    :cond_c
    move v8, v11

    :goto_7
    invoke-static {v4, v5}, Lc1/b;->d(J)I

    move-result v2

    if-eq v6, v2, :cond_d

    invoke-static {v0, v1}, LY0/b;->n(J)I

    move-result v2

    invoke-static {v0, v1}, LY0/b;->l(J)I

    move-result v0

    invoke-static {v2, v0, v6, v6}, LY0/c;->a(IIII)J

    move-result-wide v0

    move/from16 v8, v16

    :cond_d
    if-eqz v8, :cond_f

    invoke-static {}, Lb1/j;->a()Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v2, Ld1/a;->a:Ld1/a;

    invoke-static {v0, v1}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Remeasuring coerced "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v14, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_e
    invoke-direct {v9, v10, v0, v1}, Lb1/x;->f(Lm1/e;J)J

    invoke-virtual {v10, v11}, Lm1/e;->E1(Z)V

    :cond_f
    iget-object v0, v9, Lb1/x;->c:Ljava/util/Map;

    invoke-virtual/range {p1 .. p1}, Lm1/e;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD0/X;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, LD0/X;->I0()I

    move-result v1

    :goto_8
    move-object/from16 v2, p2

    move v3, v11

    goto :goto_9

    :cond_10
    invoke-virtual/range {p1 .. p1}, Lm1/e;->B0()I

    move-result v1

    goto :goto_8

    :goto_9
    invoke-virtual {v2, v1}, Ln1/b$b;->u(I)V

    if-eqz v0, :cond_11

    invoke-virtual {v0}, LD0/X;->w0()I

    move-result v1

    goto :goto_a

    :cond_11
    invoke-virtual/range {p1 .. p1}, Lm1/e;->w()I

    move-result v1

    :goto_a
    invoke-virtual {v2, v1}, Ln1/b$b;->s(I)V

    const/high16 v1, -0x80000000

    if-eqz v0, :cond_12

    iget-object v4, v9, Lb1/x;->f:Lb1/z;

    invoke-virtual {v4, v10}, Lj1/g;->r(Lm1/e;)Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-static {}, LD0/b;->a()LD0/m;

    move-result-object v4

    invoke-interface {v0, v4}, LD0/O;->Q(LD0/a;)I

    move-result v0

    goto :goto_b

    :cond_12
    move v0, v1

    :goto_b
    if-eq v0, v1, :cond_13

    move/from16 v8, v16

    goto :goto_c

    :cond_13
    move v8, v3

    :goto_c
    invoke-virtual {v2, v8}, Ln1/b$b;->r(Z)V

    invoke-virtual {v2, v0}, Ln1/b$b;->q(I)V

    iget-object v0, v9, Lb1/x;->d:Ljava/util/Map;

    invoke-interface {v0, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_14

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Integer;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v16

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v5, 0x2

    aput-object v1, v4, v5

    invoke-interface {v0, v12, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    check-cast v4, [Ljava/lang/Integer;

    invoke-direct {v9, v4, v2}, Lb1/x;->e([Ljava/lang/Integer;Ln1/b$b;)V

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->k()I

    move-result v0

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->e()I

    move-result v1

    if-ne v0, v1, :cond_15

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->i()I

    move-result v0

    invoke-virtual/range {p2 .. p2}, Ln1/b$b;->m()I

    move-result v1

    if-eq v0, v1, :cond_16

    :cond_15
    move/from16 v3, v16

    :cond_16
    invoke-virtual {v2, v3}, Ln1/b$b;->t(Z)V

    return-void
.end method

.method protected final c(J)V
    .locals 2

    iget-object v0, p0, Lb1/x;->b:Lm1/f;

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v1

    invoke-virtual {v0, v1}, Lm1/e;->U1(I)V

    iget-object v0, p0, Lb1/x;->b:Lm1/f;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result p1

    invoke-virtual {v0, p1}, Lm1/e;->m1(I)V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Lb1/x;->i:F

    return-void
.end method

.method public d()V
    .locals 10

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{ "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  root: {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "interpolated: { left:  0,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  top:  0,"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "  right:   "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v2}, Lm1/e;->w()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "  bottom:  "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " } }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v1}, Lm1/m;->c2()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-string v3, " }"

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/e;

    invoke-virtual {v2}, Lm1/e;->p()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, LD0/G;

    const-string v6, "}, "

    const-string v7, ": {"

    const-string v8, " "

    if-nez v5, :cond_2

    instance-of v4, v2, Lm1/h;

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Lm1/e;->s0()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v4, v2

    check-cast v4, Lm1/h;

    invoke-virtual {v4}, Lm1/h;->b2()I

    move-result v4

    if-nez v4, :cond_1

    const-string v4, " type: \'hGuideline\', "

    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const-string v4, " type: \'vGuideline\', "

    goto :goto_1

    :goto_2
    const-string v4, " interpolated: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lm1/e;->C0()I

    move-result v4

    invoke-virtual {v2}, Lm1/e;->D0()I

    move-result v5

    invoke-virtual {v2}, Lm1/e;->C0()I

    move-result v7

    invoke-virtual {v2}, Lm1/e;->B0()I

    move-result v8

    add-int/2addr v7, v8

    invoke-virtual {v2}, Lm1/e;->D0()I

    move-result v8

    invoke-virtual {v2}, Lm1/e;->w()I

    move-result v2

    add-int/2addr v8, v2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, " { left: "

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", top: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", right: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", bottom: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_4

    :cond_2
    invoke-virtual {v2}, Lm1/e;->s0()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    if-nez v3, :cond_5

    move-object v3, v4

    check-cast v3, LD0/G;

    invoke-static {v3}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_3

    invoke-static {v3}, Lb1/m;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v9

    :cond_3
    if-eqz v9, :cond_4

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_4
    move-object v3, v5

    :goto_3
    invoke-virtual {v2, v3}, Lm1/e;->J1(Ljava/lang/String;)V

    :cond_5
    iget-object v3, p0, Lb1/x;->e:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj1/h;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lj1/h;->r()Lm1/e;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lm1/e;->u()Lj1/h;

    move-result-object v5

    :cond_6
    if-nez v5, :cond_7

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v2}, Lm1/e;->s0()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " interpolated : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    invoke-virtual {v5, v0, v2}, Lj1/h;->t(Ljava/lang/StringBuilder;Z)Ljava/lang/StringBuilder;

    :goto_4
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lb1/x;->a:Ljava/lang/String;

    return-void
.end method

.method public final h(LD0/X$a;Ljava/util/List;)V
    .locals 12

    .prologue
    const-string v0, "<this>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurables"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb1/x;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v0}, Lm1/m;->c2()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/e;

    invoke-virtual {v1}, Lm1/e;->p()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, LD0/G;

    if-eqz v3, :cond_0

    new-instance v3, Lj1/h;

    invoke-virtual {v1}, Lm1/e;->u()Lj1/h;

    move-result-object v1

    invoke-virtual {v1}, Lj1/h;->K()Lj1/h;

    move-result-object v1

    invoke-direct {v3, v1}, Lj1/h;-><init>(Lj1/h;)V

    iget-object v1, p0, Lb1/x;->e:Ljava/util/Map;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_9

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LD0/G;

    iget-object v3, p0, Lb1/x;->e:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Lb1/x;->e:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, LD0/G;

    invoke-static {v5}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-static {v5}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    check-cast v4, LD0/G;

    if-nez v4, :cond_5

    goto :goto_3

    :cond_4
    move-object v4, v2

    :cond_5
    iget-object v3, p0, Lb1/x;->e:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Lj1/h;

    if-nez v7, :cond_6

    return-void

    :cond_6
    iget-object v3, p0, Lb1/x;->c:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, LD0/X;

    if-nez v6, :cond_7

    return-void

    :cond_7
    iget-object v3, p0, Lb1/x;->e:Ljava/util/Map;

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    sget-object v3, LY0/b;->b:LY0/b$a;

    invoke-virtual {v6}, LD0/X;->I0()I

    move-result v4

    invoke-virtual {v6}, LD0/X;->w0()I

    move-result v5

    invoke-virtual {v3, v4, v5}, LY0/b$a;->c(II)J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, LD0/G;->U(J)LD0/X;

    move-result-object v6

    :cond_8
    const/4 v10, 0x4

    const/4 v11, 0x0

    const-wide/16 v8, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v11}, Lb1/j;->f(LD0/X$a;LD0/X;Lj1/h;JILjava/lang/Object;)V

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_1

    :cond_9
    sget-object p1, Lb1/v;->D:Lb1/v;

    if-nez p1, :cond_a

    invoke-virtual {p0}, Lb1/x;->d()V

    :cond_a
    return-void
.end method

.method public final i(JLY0/v;Lb1/n;Ljava/util/List;I)J
    .locals 13

    .prologue
    move-object v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const-string v4, "layoutDirection"

    invoke-static {v1, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "constraintSet"

    invoke-static {v2, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "measurables"

    invoke-static {v3, v4}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lb1/x;->f:Lb1/z;

    invoke-static {p1, p2}, LY0/b;->j(J)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Lj1/d;->i:Lj1/d$a;

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v6

    invoke-virtual {v5, v6}, Lj1/d$a;->a(I)Lj1/d;

    move-result-object v5

    goto :goto_0

    :cond_0
    sget-object v5, Lj1/d;->i:Lj1/d$a;

    invoke-virtual {v5}, Lj1/d$a;->g()Lj1/d;

    move-result-object v5

    invoke-static {p1, p2}, LY0/b;->n(J)I

    move-result v6

    invoke-virtual {v5, v6}, Lj1/d;->g(I)Lj1/d;

    move-result-object v5

    :goto_0
    invoke-virtual {v4, v5}, Lj1/g;->D(Lj1/d;)Lj1/g;

    iget-object v4, v0, Lb1/x;->f:Lb1/z;

    invoke-static {p1, p2}, LY0/b;->i(J)Z

    move-result v5

    if-eqz v5, :cond_1

    sget-object v5, Lj1/d;->i:Lj1/d$a;

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v6

    invoke-virtual {v5, v6}, Lj1/d$a;->a(I)Lj1/d;

    move-result-object v5

    goto :goto_1

    :cond_1
    sget-object v5, Lj1/d;->i:Lj1/d$a;

    invoke-virtual {v5}, Lj1/d$a;->g()Lj1/d;

    move-result-object v5

    invoke-static {p1, p2}, LY0/b;->m(J)I

    move-result v6

    invoke-virtual {v5, v6}, Lj1/d;->g(I)Lj1/d;

    move-result-object v5

    :goto_1
    invoke-virtual {v4, v5}, Lj1/g;->n(Lj1/d;)Lj1/g;

    iget-object v4, v0, Lb1/x;->f:Lb1/z;

    invoke-virtual {v4}, Lj1/g;->l()Lj1/a;

    move-result-object v4

    invoke-virtual {v4}, Lj1/a;->d0()Lj1/d;

    move-result-object v4

    iget-object v5, v0, Lb1/x;->f:Lb1/z;

    iget-object v6, v0, Lb1/x;->b:Lm1/f;

    const/4 v7, 0x0

    invoke-virtual {v4, v5, v6, v7}, Lj1/d;->a(Lj1/g;Lm1/e;I)V

    iget-object v4, v0, Lb1/x;->f:Lb1/z;

    invoke-virtual {v4}, Lj1/g;->l()Lj1/a;

    move-result-object v4

    invoke-virtual {v4}, Lj1/a;->B()Lj1/d;

    move-result-object v4

    iget-object v5, v0, Lb1/x;->f:Lb1/z;

    iget-object v6, v0, Lb1/x;->b:Lm1/f;

    const/4 v8, 0x1

    invoke-virtual {v4, v5, v6, v8}, Lj1/d;->a(Lj1/g;Lm1/e;I)V

    iget-object v4, v0, Lb1/x;->f:Lb1/z;

    move-wide v5, p1

    invoke-virtual {v4, p1, p2}, Lb1/z;->H(J)V

    iget-object v4, v0, Lb1/x;->f:Lb1/z;

    sget-object v9, LY0/v;->D:LY0/v;

    if-ne v1, v9, :cond_2

    move v7, v8

    :cond_2
    invoke-virtual {v4, v7}, Lj1/g;->y(Z)V

    invoke-virtual {p0}, Lb1/x;->j()V

    invoke-interface/range {p4 .. p5}, Lb1/n;->a(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lb1/x;->f:Lb1/z;

    invoke-virtual {v1}, Lj1/g;->v()V

    iget-object v1, v0, Lb1/x;->f:Lb1/z;

    invoke-interface {v2, v1, v3}, Lb1/n;->e(Lb1/z;Ljava/util/List;)V

    iget-object v1, v0, Lb1/x;->f:Lb1/z;

    invoke-static {v1, v3}, Lb1/j;->c(Lb1/z;Ljava/util/List;)V

    iget-object v1, v0, Lb1/x;->f:Lb1/z;

    iget-object v2, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v1, v2}, Lj1/g;->a(Lm1/f;)V

    goto :goto_2

    :cond_3
    iget-object v1, v0, Lb1/x;->f:Lb1/z;

    invoke-static {v1, v3}, Lb1/j;->c(Lb1/z;Ljava/util/List;)V

    :goto_2
    invoke-virtual {p0, p1, p2}, Lb1/x;->c(J)V

    iget-object v1, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v1}, Lm1/f;->R2()V

    invoke-static {}, Lb1/j;->a()Z

    move-result v1

    const-string v2, "CCL"

    if-eqz v1, :cond_8

    iget-object v1, v0, Lb1/x;->b:Lm1/f;

    const-string v3, "ConstraintLayout"

    invoke-virtual {v1, v3}, Lm1/e;->c1(Ljava/lang/String;)V

    iget-object v1, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v1}, Lm1/m;->c2()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/e;

    invoke-virtual {v3}, Lm1/e;->p()Ljava/lang/Object;

    move-result-object v4

    instance-of v7, v4, LD0/G;

    if-eqz v7, :cond_4

    check-cast v4, LD0/G;

    goto :goto_4

    :cond_4
    const/4 v4, 0x0

    :goto_4
    if-eqz v4, :cond_5

    invoke-static {v4}, Landroidx/compose/ui/layout/a;->a(LD0/G;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    :cond_5
    const-string v4, "NOTAG"

    :cond_6
    invoke-virtual {v3, v4}, Lm1/e;->c1(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    sget-object v1, Ld1/a;->a:Ld1/a;

    invoke-static {p1, p2}, LY0/b;->q(J)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ConstraintLayout is asked to measure with "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Lb1/x;->b:Lm1/f;

    invoke-static {v3}, Lb1/j;->b(Lm1/e;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v1}, Lm1/m;->c2()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm1/e;

    sget-object v4, Ld1/a;->a:Ld1/a;

    invoke-static {v3}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v3}, Lb1/j;->b(Lm1/e;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    iget-object v1, v0, Lb1/x;->b:Lm1/f;

    move/from16 v3, p6

    invoke-virtual {v1, v3}, Lm1/f;->O2(I)V

    iget-object v3, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v3}, Lm1/f;->F2()I

    move-result v4

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v3 .. v12}, Lm1/f;->K2(IIIIIIIII)J

    invoke-static {}, Lb1/j;->a()Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Ld1/a;->a:Ld1/a;

    iget-object v3, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v3}, Lm1/e;->B0()I

    move-result v3

    iget-object v4, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v4}, Lm1/e;->w()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ConstraintLayout is at the end "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ld1/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    iget-object v1, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v1}, Lm1/e;->B0()I

    move-result v1

    iget-object v2, v0, Lb1/x;->b:Lm1/f;

    invoke-virtual {v2}, Lm1/e;->w()I

    move-result v2

    invoke-static {v1, v2}, LY0/u;->a(II)J

    move-result-wide v1

    return-wide v1
.end method

.method public final j()V
    .locals 1

    iget-object v0, p0, Lb1/x;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lb1/x;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lb1/x;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
