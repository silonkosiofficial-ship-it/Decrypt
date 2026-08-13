.class final LZ8/b;
.super LZ8/d;
.source "SourceFile"


# instance fields
.field private final G:Lx7/p;


# direct methods
.method public constructor <init>(Lx7/p;Lm7/i;ILY8/d;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, LZ8/d;-><init>(Lx7/p;Lm7/i;ILY8/d;)V

    iput-object p1, p0, LZ8/b;->G:Lx7/p;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/p;Lm7/i;ILY8/d;ILy7/k;)V
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
    invoke-direct {p0, p1, p2, p3, p4}, LZ8/b;-><init>(Lx7/p;Lm7/i;ILY8/d;)V

    return-void
.end method


# virtual methods
.method protected h(LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LZ8/b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/b$a;

    iget v1, v0, LZ8/b$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/b$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/b$a;

    invoke-direct {v0, p0, p2}, LZ8/b$a;-><init>(LZ8/b;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/b$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/b$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LZ8/b$a;->F:Ljava/lang/Object;

    check-cast p1, LY8/z;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iput-object p1, v0, LZ8/b$a;->F:Ljava/lang/Object;

    iput v3, v0, LZ8/b$a;->I:I

    invoke-super {p0, p1, v0}, LZ8/d;->h(LY8/z;Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-interface {p1}, LY8/C;->m()Z

    move-result p1

    if-eqz p1, :cond_4

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "\'awaitClose { yourCallbackOrListener.cancel() }\' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected i(Lm7/i;ILY8/d;)La9/e;
    .locals 2

    new-instance v0, LZ8/b;

    iget-object v1, p0, LZ8/b;->G:Lx7/p;

    invoke-direct {v0, v1, p1, p2, p3}, LZ8/b;-><init>(Lx7/p;Lm7/i;ILY8/d;)V

    return-object v0
.end method
