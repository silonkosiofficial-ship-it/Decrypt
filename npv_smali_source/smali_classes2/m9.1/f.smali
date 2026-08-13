.class public abstract Lm9/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(Ljava/lang/CharSequence;II)I
    .locals 0

    invoke-static {p0, p1, p2}, Lm9/f;->d(Ljava/lang/CharSequence;II)I

    move-result p0

    return p0
.end method

.method public static final synthetic b(Ljava/lang/CharSequence;II)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1, p2}, Lm9/f;->e(Ljava/lang/CharSequence;II)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;)Lm9/g;
    .locals 0

    invoke-static {p0, p1, p2}, Lm9/f;->f(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;)Lm9/g;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljava/lang/CharSequence;II)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    :goto_0
    if-ge p1, p2, :cond_0

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    mul-int/lit8 v0, v0, 0xa

    invoke-static {v1}, Lj9/f;->a(C)I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method private static final e(Ljava/lang/CharSequence;II)Ljava/lang/Integer;
    .locals 2

    .prologue
    const/4 v0, 0x0

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    mul-int/lit8 v0, v0, 0xa

    invoke-static {v1}, Lj9/f;->a(C)I

    move-result v1

    add-int/2addr v0, v1

    if-gez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lm9/a;Ljava/lang/Object;Ljava/lang/Object;)Lm9/g;
    .locals 0

    .prologue
    invoke-interface {p0, p1, p2}, Lm9/a;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance p1, Lm9/g$a;

    invoke-direct {p1, p0}, Lm9/g$a;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method
