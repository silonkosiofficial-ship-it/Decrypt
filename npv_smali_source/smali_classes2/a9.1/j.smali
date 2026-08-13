.class public final La9/j;
.super La9/e;
.source "SourceFile"


# instance fields
.field private final F:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Lm7/i;ILY8/d;)V
    .locals 0

    invoke-direct {p0, p2, p3, p4}, La9/e;-><init>(Lm7/i;ILY8/d;)V

    iput-object p1, p0, La9/j;->F:Ljava/lang/Iterable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Iterable;Lm7/i;ILY8/d;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    sget-object p2, Lm7/j;->C:Lm7/j;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x2

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, LY8/d;->C:LY8/d;

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, La9/j;-><init>(Ljava/lang/Iterable;Lm7/i;ILY8/d;)V

    return-void
.end method


# virtual methods
.method protected h(LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 8

    .prologue
    new-instance p2, La9/z;

    invoke-direct {p2, p1}, La9/z;-><init>(LY8/C;)V

    iget-object v0, p0, La9/j;->F:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ8/f;

    new-instance v5, La9/j$a;

    const/4 v2, 0x0

    invoke-direct {v5, v1, p2, v2}, La9/j$a;-><init>(LZ8/f;La9/z;Lm7/e;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    goto :goto_0

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method protected i(Lm7/i;ILY8/d;)La9/e;
    .locals 2

    new-instance v0, La9/j;

    iget-object v1, p0, La9/j;->F:Ljava/lang/Iterable;

    invoke-direct {v0, v1, p1, p2, p3}, La9/j;-><init>(Ljava/lang/Iterable;Lm7/i;ILY8/d;)V

    return-object v0
.end method

.method public o(LW8/N;)LY8/B;
    .locals 3

    iget-object v0, p0, La9/e;->C:Lm7/i;

    iget v1, p0, La9/e;->D:I

    invoke-virtual {p0}, La9/e;->k()Lx7/p;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LY8/x;->c(LW8/N;Lm7/i;ILx7/p;)LY8/B;

    move-result-object p1

    return-object p1
.end method
