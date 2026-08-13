.class abstract synthetic Lu2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lh2/M;)Ljava/lang/Integer;
    .locals 1

    .prologue
    const-string v0, "<this>"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lh2/M;->a()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0}, Lh2/M;->b()Lh2/E;

    move-result-object p0

    iget p0, p0, Lh2/E;->d:I

    div-int/lit8 p0, p0, 0x2

    sub-int/2addr v0, p0

    const/4 p0, 0x0

    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final b(Lh2/L$a;I)I
    .locals 1

    .prologue
    const-string v0, "params"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lh2/L$a$c;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lh2/L$a;->b()I

    move-result v0

    if-ge p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh2/L$a;->b()I

    move-result p1

    :goto_0
    return p1
.end method

.method public static final c(Lh2/L$a;II)I
    .locals 2

    .prologue
    const-string v0, "params"

    invoke-static {p0, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lh2/L$a$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lh2/L$a;->b()I

    move-result p2

    if-ge p1, p2, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lh2/L$a;->b()I

    move-result p0

    sub-int/2addr p1, p0

    goto :goto_0

    :cond_1
    instance-of v0, p0, Lh2/L$a$a;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    instance-of v0, p0, Lh2/L$a$d;

    if-eqz v0, :cond_4

    if-lt p1, p2, :cond_3

    invoke-virtual {p0}, Lh2/L$a;->b()I

    move-result p0

    sub-int/2addr p2, p0

    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    :cond_3
    :goto_0
    return p1

    :cond_4
    new-instance p0, Li7/s;

    invoke-direct {p0}, Li7/s;-><init>()V

    throw p0
.end method

.method public static final d(Lh2/L$a;Lo2/u;ILx7/q;Lm7/e;)Ljava/lang/Object;
    .locals 10

    .prologue
    instance-of v0, p4, Lu2/b$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lu2/b$a;

    iget v1, v0, Lu2/b$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu2/b$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lu2/b$a;

    invoke-direct {v0, p4}, Lu2/b$a;-><init>(Lm7/e;)V

    :goto_0
    iget-object p4, v0, Lu2/b$a;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lu2/b$a;->J:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p0, v0, Lu2/b$a;->H:I

    iget p1, v0, Lu2/b$a;->G:I

    iget p2, v0, Lu2/b$a;->F:I

    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    move v8, p0

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Li7/x;->b(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lh2/L$a;->a()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Integer;

    if-eqz p4, :cond_3

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p4

    goto :goto_1

    :cond_3
    move p4, v3

    :goto_1
    invoke-static {p0, p4}, Lu2/a;->b(Lh2/L$a;I)I

    move-result v2

    invoke-static {p0, p4, p2}, Lu2/a;->c(Lh2/L$a;II)I

    move-result p0

    add-int p4, v2, p0

    if-le p4, p2, :cond_4

    sub-int p4, p2, p0

    goto :goto_2

    :cond_4
    move p4, v2

    :goto_2
    new-instance v5, Lo2/u;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "SELECT * FROM ( "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lo2/u;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " ) LIMIT "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, " OFFSET "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lo2/u;->a()Lx7/l;

    move-result-object p1

    invoke-direct {v5, v6, p1}, Lo2/u;-><init>(Ljava/lang/String;Lx7/l;)V

    invoke-static {p4}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    iput p2, v0, Lu2/b$a;->F:I

    iput v2, v0, Lu2/b$a;->G:I

    iput p0, v0, Lu2/b$a;->H:I

    iput v4, v0, Lu2/b$a;->J:I

    invoke-interface {p3, v5, p1, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    return-object v1

    :cond_5
    move v8, p0

    move p1, v2

    :goto_3
    move-object v5, p4

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p0

    add-int/2addr p0, v8

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result p3

    const/4 p4, 0x0

    if-nez p3, :cond_7

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result p3

    if-lt p3, p1, :cond_7

    if-lt p0, p2, :cond_6

    goto :goto_4

    :cond_6
    invoke-static {p0}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v7, p1

    goto :goto_5

    :cond_7
    :goto_4
    move-object v7, p4

    :goto_5
    if-lez v8, :cond_9

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_6

    :cond_8
    invoke-static {v8}, Lo7/b;->c(I)Ljava/lang/Integer;

    move-result-object p1

    move-object v6, p1

    goto :goto_7

    :cond_9
    :goto_6
    move-object v6, p4

    :goto_7
    new-instance p1, Lh2/L$b$c;

    sub-int/2addr p2, p0

    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    move-result v9

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lh2/L$b$c;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V

    return-object p1
.end method

.method public static final e(Lo2/u;Lo2/n;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SELECT COUNT(*) FROM ( "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lo2/u;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lu2/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p0, v2}, Lu2/b$b;-><init>(Ljava/lang/String;Lo2/u;Lm7/e;)V

    invoke-static {p1, v1, p2}, Lo2/o;->a(Lo2/n;Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
