.class public final La9/h;
.super La9/g;
.source "SourceFile"


# direct methods
.method public constructor <init>(LZ8/f;Lm7/i;ILY8/d;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, La9/g;-><init>(LZ8/f;Lm7/i;ILY8/d;)V

    return-void
.end method

.method public synthetic constructor <init>(LZ8/f;Lm7/i;ILY8/d;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    sget-object p2, Lm7/j;->C:Lm7/j;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    sget-object p4, LY8/d;->C:LY8/d;

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, La9/h;-><init>(LZ8/f;Lm7/i;ILY8/d;)V

    return-void
.end method


# virtual methods
.method protected i(Lm7/i;ILY8/d;)La9/e;
    .locals 2

    new-instance v0, La9/h;

    iget-object v1, p0, La9/g;->F:LZ8/f;

    invoke-direct {v0, v1, p1, p2, p3}, La9/h;-><init>(LZ8/f;Lm7/i;ILY8/d;)V

    return-object v0
.end method

.method public j()LZ8/f;
    .locals 1

    iget-object v0, p0, La9/g;->F:LZ8/f;

    return-object v0
.end method

.method protected t(LZ8/g;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    iget-object v0, p0, La9/g;->F:LZ8/f;

    invoke-interface {v0, p1, p2}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
