.class abstract synthetic LZ8/r;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LZ8/f;I)LZ8/f;
    .locals 1

    .prologue
    if-ltz p1, :cond_0

    new-instance v0, LZ8/r$a;

    invoke-direct {v0, p0, p1}, LZ8/r$a;-><init>(LZ8/f;I)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Drop count should be non-negative, but had "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final b(LZ8/f;Lx7/p;)LZ8/f;
    .locals 1

    new-instance v0, LZ8/r$c;

    invoke-direct {v0, p0, p1}, LZ8/r$c;-><init>(LZ8/f;Lx7/p;)V

    return-object v0
.end method

.method public static final c(LZ8/f;Lx7/p;)LZ8/f;
    .locals 1

    new-instance v0, LZ8/r$e;

    invoke-direct {v0, p0, p1}, LZ8/r$e;-><init>(LZ8/f;Lx7/p;)V

    return-object v0
.end method
