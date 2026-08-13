.class public abstract LT6/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a()Ljava/util/ArrayList;
    .locals 1

    invoke-static {}, LT6/u;->f()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ljava/util/ArrayList;
    .locals 1

    invoke-static {}, LT6/u;->h()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private static final c(Ljava/lang/String;I)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    add-int/2addr p1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x20

    if-ne v1, v2, :cond_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-eq p1, v1, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 p1, 0x3b

    if-ne p0, p1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_1
    return v0
.end method

.method public static final d(Ljava/lang/String;)Ljava/util/List;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, LT6/u;->e(Ljava/lang/String;Z)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Z)Ljava/util/List;
    .locals 3

    .prologue
    if-nez p0, :cond_0

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object v0, Li7/r;->E:Li7/r;

    new-instance v1, LT6/s;

    invoke-direct {v1}, LT6/s;-><init>()V

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-static {p0}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v2

    if-gt v1, v2, :cond_1

    invoke-static {p0, v1, v0, p1}, LT6/u;->g(Ljava/lang/String;ILi7/n;Z)I

    move-result v1

    goto :goto_0

    :cond_1
    invoke-static {v0}, LT6/u;->n(Li7/n;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final f()Ljava/util/ArrayList;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method private static final g(Ljava/lang/String;ILi7/n;Z)I
    .locals 5

    .prologue
    sget-object v0, Li7/r;->E:Li7/r;

    new-instance v1, LT6/t;

    invoke-direct {v1}, LT6/t;-><init>()V

    invoke-static {v0, v1}, Li7/o;->a(Li7/r;Lx7/a;)Li7/n;

    move-result-object v0

    if-eqz p3, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    move v2, p1

    :goto_1
    invoke-static {p0}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v3

    if-gt v2, v3, :cond_6

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2c

    if-eq v3, v4, :cond_4

    const/16 v4, 0x3b

    if-eq v3, v4, :cond_2

    if-eqz p3, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    :goto_2
    invoke-static {p0, v2, v0}, LT6/u;->i(Ljava/lang/String;ILi7/n;)I

    move-result v2

    goto :goto_1

    :cond_4
    invoke-interface {p2}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    new-instance p3, LT6/l;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_3

    :cond_5
    move v1, v2

    :goto_3
    invoke-static {p0, p1, v1}, LT6/u;->m(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, LT6/u;->n(Li7/n;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p0, p1}, LT6/l;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    return v2

    :cond_6
    invoke-interface {p2}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    new-instance p3, LT6/l;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_4

    :cond_7
    move v1, v2

    :goto_4
    invoke-static {p0, p1, v1}, LT6/u;->m(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0}, LT6/u;->n(Li7/n;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p3, p0, p1}, LT6/l;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return v2
.end method

.method private static final h()Ljava/util/ArrayList;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method private static final i(Ljava/lang/String;ILi7/n;)I
    .locals 4

    .prologue
    move v0, p1

    :goto_0
    invoke-static {p0}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v1

    const-string v2, ""

    if-gt v0, v1, :cond_2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x2c

    if-eq v1, v3, :cond_1

    const/16 v3, 0x3b

    if-eq v1, v3, :cond_1

    const/16 v2, 0x3d

    if-eq v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v0, 0x1

    invoke-static {p0, v1}, LT6/u;->k(Ljava/lang/String;I)Li7/u;

    move-result-object v1

    invoke-virtual {v1}, Li7/u;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v1}, Li7/u;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p2, p0, p1, v0, v1}, LT6/u;->j(Li7/n;Ljava/lang/String;IILjava/lang/String;)V

    return v2

    :cond_1
    invoke-static {p2, p0, p1, v0, v2}, LT6/u;->j(Li7/n;Ljava/lang/String;IILjava/lang/String;)V

    return v0

    :cond_2
    invoke-static {p2, p0, p1, v0, v2}, LT6/u;->j(Li7/n;Ljava/lang/String;IILjava/lang/String;)V

    return v0
.end method

.method private static final j(Li7/n;Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .prologue
    invoke-static {p1, p2, p3}, LT6/u;->m(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/ArrayList;

    new-instance p2, LT6/m;

    invoke-direct {p2, p1, p4}, LT6/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static final k(Ljava/lang/String;I)Li7/u;
    .locals 3

    .prologue
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ne v0, p1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, ""

    invoke-static {p0, p1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x22

    if-ne v0, v1, :cond_1

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1}, LT6/u;->l(Ljava/lang/String;I)Li7/u;

    move-result-object p0

    return-object p0

    :cond_1
    move v0, p1

    :goto_0
    invoke-static {p0}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v1

    if-gt v0, v1, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x2c

    if-eq v1, v2, :cond_2

    const/16 v2, 0x3b

    if-eq v1, v2, :cond_2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p0, p1, v0}, LT6/u;->m(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {p0, p1, v0}, LT6/u;->m(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Ljava/lang/String;I)Li7/u;
    .locals 3

    .prologue
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-static {p0}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v1

    const/16 v2, 0x22

    if-gt p1, v1, :cond_2

    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_0

    invoke-static {p0, p1}, LT6/u;->c(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Li7/B;->a(Ljava/lang/Object;Ljava/lang/Object;)Li7/u;

    move-result-object p0

    return-object p0

    :cond_0
    const/16 v2, 0x5c

    if-ne v1, v2, :cond_1

    invoke-static {p0}, LS8/r;->j0(Ljava/lang/CharSequence;)I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    if-ge p1, v2, :cond_1

    add-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1
.end method

.method private static final m(Ljava/lang/String;II)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "substring(...)"

    invoke-static {p0, p1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LS8/r;->u1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Li7/n;)Ljava/util/List;
    .locals 1

    .prologue
    invoke-interface {p0}, Li7/n;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object p0

    :goto_0
    return-object p0
.end method
