.class public final LM0/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private final c:J

.field private final d:LX0/r;

.field private final e:LM0/y;

.field private final f:LX0/h;

.field private final g:I

.field private final h:I

.field private final i:LX0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;)V
    .locals 0

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LM0/v;->a:I

    iput p2, p0, LM0/v;->b:I

    iput-wide p3, p0, LM0/v;->c:J

    iput-object p5, p0, LM0/v;->d:LX0/r;

    iput-object p6, p0, LM0/v;->e:LM0/y;

    iput-object p7, p0, LM0/v;->f:LX0/h;

    iput p8, p0, LM0/v;->g:I

    iput p9, p0, LM0/v;->h:I

    iput-object p10, p0, LM0/v;->i:LX0/t;

    sget-object p1, LY0/x;->b:LY0/x$a;

    invoke-virtual {p1}, LY0/x$a;->a()J

    move-result-wide p1

    invoke-static {p3, p4, p1, p2}, LY0/x;->e(JJ)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p3, p4}, LY0/x;->h(J)F

    move-result p1

    const/4 p2, 0x0

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "lineHeight can\'t be negative ("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3, p4}, LY0/x;->h(J)F

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    :goto_0
    return-void
.end method

.method public synthetic constructor <init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;ILy7/k;)V
    .locals 11

    .prologue
    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    sget-object v1, LX0/j;->b:LX0/j$a;

    invoke-virtual {v1}, LX0/j$a;->g()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    sget-object v2, LX0/l;->b:LX0/l$a;

    invoke-virtual {v2}, LX0/l$a;->f()I

    move-result v2

    goto :goto_1

    :cond_1
    move v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    sget-object v3, LY0/x;->b:LY0/x$a;

    invoke-virtual {v3}, LY0/x$a;->a()J

    move-result-wide v3

    goto :goto_2

    :cond_2
    move-wide v3, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    const/4 v6, 0x0

    if-eqz v5, :cond_3

    move-object v5, v6

    goto :goto_3

    :cond_3
    move-object/from16 v5, p5

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    move-object v7, v6

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    move-object v8, v6

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    sget-object v9, LX0/f;->b:LX0/f$a;

    invoke-virtual {v9}, LX0/f$a;->b()I

    move-result v9

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    sget-object v10, LX0/e;->b:LX0/e$a;

    invoke-virtual {v10}, LX0/e$a;->c()I

    move-result v10

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_8

    goto :goto_8

    :cond_8
    move-object/from16 v6, p10

    :goto_8
    const/4 v0, 0x0

    move-object p1, p0

    move p2, v1

    move p3, v2

    move-wide p4, v3

    move-object/from16 p6, v5

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move-object/from16 p11, v6

    move-object/from16 p12, v0

    invoke-direct/range {p1 .. p12}, LM0/v;-><init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;Ly7/k;)V

    return-void
.end method

.method public synthetic constructor <init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;Ly7/k;)V
    .locals 0

    invoke-direct/range {p0 .. p10}, LM0/v;-><init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;)V

    return-void
.end method

.method public static synthetic b(LM0/v;IIJLX0/r;LM0/y;LX0/h;IILX0/t;ILjava/lang/Object;)LM0/v;
    .locals 11

    .prologue
    move-object v0, p0

    move/from16 v1, p11

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, LM0/v;->a:I

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, LM0/v;->b:I

    goto :goto_1

    :cond_1
    move v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-wide v4, v0, LM0/v;->c:J

    goto :goto_2

    :cond_2
    move-wide v4, p3

    :goto_2
    and-int/lit8 v6, v1, 0x8

    if-eqz v6, :cond_3

    iget-object v6, v0, LM0/v;->d:LX0/r;

    goto :goto_3

    :cond_3
    move-object/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v1, 0x10

    if-eqz v7, :cond_4

    iget-object v7, v0, LM0/v;->e:LM0/y;

    goto :goto_4

    :cond_4
    move-object/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-object v8, v0, LM0/v;->f:LX0/h;

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit8 v9, v1, 0x40

    if-eqz v9, :cond_6

    iget v9, v0, LM0/v;->g:I

    goto :goto_6

    :cond_6
    move/from16 v9, p8

    :goto_6
    and-int/lit16 v10, v1, 0x80

    if-eqz v10, :cond_7

    iget v10, v0, LM0/v;->h:I

    goto :goto_7

    :cond_7
    move/from16 v10, p9

    :goto_7
    and-int/lit16 v1, v1, 0x100

    if-eqz v1, :cond_8

    iget-object v1, v0, LM0/v;->i:LX0/t;

    goto :goto_8

    :cond_8
    move-object/from16 v1, p10

    :goto_8
    move p1, v2

    move p2, v3

    move-wide p3, v4

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move/from16 p8, v9

    move/from16 p9, v10

    move-object/from16 p10, v1

    invoke-virtual/range {p0 .. p10}, LM0/v;->a(IIJLX0/r;LM0/y;LX0/h;IILX0/t;)LM0/v;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(IIJLX0/r;LM0/y;LX0/h;IILX0/t;)LM0/v;
    .locals 13

    new-instance v12, LM0/v;

    const/4 v11, 0x0

    move-object v0, v12

    move v1, p1

    move v2, p2

    move-wide/from16 v3, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    move-object/from16 v10, p10

    invoke-direct/range {v0 .. v11}, LM0/v;-><init>(IIJLX0/r;LM0/y;LX0/h;IILX0/t;Ly7/k;)V

    return-object v12
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LM0/v;->h:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, LM0/v;->g:I

    return v0
.end method

.method public final e()J
    .locals 2

    iget-wide v0, p0, LM0/v;->c:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    .prologue
    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LM0/v;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    iget v1, p0, LM0/v;->a:I

    check-cast p1, LM0/v;

    iget v3, p1, LM0/v;->a:I

    invoke-static {v1, v3}, LX0/j;->k(II)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, LM0/v;->b:I

    iget v3, p1, LM0/v;->b:I

    invoke-static {v1, v3}, LX0/l;->j(II)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, LM0/v;->c:J

    iget-wide v5, p1, LM0/v;->c:J

    invoke-static {v3, v4, v5, v6}, LY0/x;->e(JJ)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LM0/v;->d:LX0/r;

    iget-object v3, p1, LM0/v;->d:LX0/r;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LM0/v;->e:LM0/y;

    iget-object v3, p1, LM0/v;->e:LM0/y;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, LM0/v;->f:LX0/h;

    iget-object v3, p1, LM0/v;->f:LX0/h;

    invoke-static {v1, v3}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, LM0/v;->g:I

    iget v3, p1, LM0/v;->g:I

    invoke-static {v1, v3}, LX0/f;->f(II)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, LM0/v;->h:I

    iget v3, p1, LM0/v;->h:I

    invoke-static {v1, v3}, LX0/e;->g(II)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, LM0/v;->i:LX0/t;

    iget-object p1, p1, LM0/v;->i:LX0/t;

    invoke-static {v1, p1}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final f()LX0/h;
    .locals 1

    iget-object v0, p0, LM0/v;->f:LX0/h;

    return-object v0
.end method

.method public final g()LM0/y;
    .locals 1

    iget-object v0, p0, LM0/v;->e:LM0/y;

    return-object v0
.end method

.method public final h()I
    .locals 1

    iget v0, p0, LM0/v;->a:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    .prologue
    iget v0, p0, LM0/v;->a:I

    invoke-static {v0}, LX0/j;->l(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LM0/v;->b:I

    invoke-static {v1}, LX0/l;->k(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, LM0/v;->c:J

    invoke-static {v1, v2}, LY0/x;->i(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM0/v;->d:LX0/r;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, LX0/r;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM0/v;->e:LM0/y;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LM0/y;->hashCode()I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM0/v;->f:LX0/h;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, LX0/h;->hashCode()I

    move-result v1

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LM0/v;->g:I

    invoke-static {v1}, LX0/f;->j(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LM0/v;->h:I

    invoke-static {v1}, LX0/e;->h(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LM0/v;->i:LX0/t;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LX0/t;->hashCode()I

    move-result v2

    :cond_3
    add-int/2addr v0, v2

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, LM0/v;->b:I

    return v0
.end method

.method public final j()LX0/r;
    .locals 1

    iget-object v0, p0, LM0/v;->d:LX0/r;

    return-object v0
.end method

.method public final k()LX0/t;
    .locals 1

    iget-object v0, p0, LM0/v;->i:LX0/t;

    return-object v0
.end method

.method public final l(LM0/v;)LM0/v;
    .locals 11

    .prologue
    if-nez p1, :cond_0

    return-object p0

    :cond_0
    iget v1, p1, LM0/v;->a:I

    iget v2, p1, LM0/v;->b:I

    iget-wide v3, p1, LM0/v;->c:J

    iget-object v5, p1, LM0/v;->d:LX0/r;

    iget-object v6, p1, LM0/v;->e:LM0/y;

    iget-object v7, p1, LM0/v;->f:LX0/h;

    iget v8, p1, LM0/v;->g:I

    iget v9, p1, LM0/v;->h:I

    iget-object v10, p1, LM0/v;->i:LX0/t;

    move-object v0, p0

    invoke-static/range {v0 .. v10}, LM0/w;->a(LM0/v;IIJLX0/r;LM0/y;LX0/h;IILX0/t;)LM0/v;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ParagraphStyle(textAlign="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM0/v;->a:I

    invoke-static {v1}, LX0/j;->m(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textDirection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM0/v;->b:I

    invoke-static {v1}, LX0/l;->l(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LM0/v;->c:J

    invoke-static {v1, v2}, LY0/x;->j(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textIndent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM0/v;->d:LX0/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", platformStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM0/v;->e:LM0/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineHeightStyle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM0/v;->f:LX0/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lineBreak="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM0/v;->g:I

    invoke-static {v1}, LX0/f;->k(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hyphens="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LM0/v;->h:I

    invoke-static {v1}, LX0/e;->i(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", textMotion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LM0/v;->i:LX0/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
