.class abstract synthetic LZ8/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx7/p;)LZ8/f;
    .locals 8

    new-instance v7, LZ8/b;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LZ8/b;-><init>(Lx7/p;Lm7/i;ILY8/d;ILy7/k;)V

    return-object v7
.end method

.method public static final b(Lx7/p;)LZ8/f;
    .locals 8

    new-instance v7, LZ8/d;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, LZ8/d;-><init>(Lx7/p;Lm7/i;ILY8/d;ILy7/k;)V

    return-object v7
.end method

.method public static final c(Lx7/p;)LZ8/f;
    .locals 1

    new-instance v0, LZ8/B;

    invoke-direct {v0, p0}, LZ8/B;-><init>(Lx7/p;)V

    return-object v0
.end method

.method public static final d(Ljava/lang/Object;)LZ8/f;
    .locals 1

    new-instance v0, LZ8/i$b;

    invoke-direct {v0, p0}, LZ8/i$b;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final varargs e([Ljava/lang/Object;)LZ8/f;
    .locals 1

    new-instance v0, LZ8/i$a;

    invoke-direct {v0, p0}, LZ8/i$a;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method
