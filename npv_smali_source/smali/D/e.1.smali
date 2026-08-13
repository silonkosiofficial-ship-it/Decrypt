.class public abstract LD/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LX/b;I)I
    .locals 0

    invoke-static {p0, p1}, LD/e;->b(LX/b;I)I

    move-result p0

    return p0
.end method

.method private static final b(LX/b;I)I
    .locals 4

    .prologue
    invoke-virtual {p0}, LX/b;->t()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    if-ge v1, v0, :cond_3

    sub-int v2, v0, v1

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v2, v1

    invoke-virtual {p0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v2

    check-cast v3, LD/d$a;

    invoke-virtual {v3}, LD/d$a;->b()I

    move-result v3

    if-ne v3, p1, :cond_1

    return v2

    :cond_1
    if-ge v3, p1, :cond_2

    add-int/lit8 v1, v2, 0x1

    invoke-virtual {p0}, LX/b;->s()[Ljava/lang/Object;

    move-result-object v3

    aget-object v3, v3, v1

    check-cast v3, LD/d$a;

    invoke-virtual {v3}, LD/d$a;->b()I

    move-result v3

    if-ge p1, v3, :cond_0

    return v2

    :cond_2
    add-int/lit8 v0, v2, -0x1

    goto :goto_0

    :cond_3
    return v1
.end method
