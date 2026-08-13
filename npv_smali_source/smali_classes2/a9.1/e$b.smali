.class final La9/e$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La9/e;->k()Lx7/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:La9/e;


# direct methods
.method constructor <init>(La9/e;Lm7/e;)V
    .locals 0

    iput-object p1, p0, La9/e$b;->I:La9/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La9/e$b;->G:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, La9/e$b;->H:Ljava/lang/Object;

    check-cast p1, LY8/z;

    iget-object v1, p0, La9/e$b;->I:La9/e;

    iput v2, p0, La9/e$b;->G:I

    invoke-virtual {v1, p1, p0}, La9/e;->h(LY8/z;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LY8/z;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, La9/e$b;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, La9/e$b;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, La9/e$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LY8/z;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, La9/e$b;->H(LY8/z;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, La9/e$b;

    iget-object v1, p0, La9/e$b;->I:La9/e;

    invoke-direct {v0, v1, p2}, La9/e$b;-><init>(La9/e;Lm7/e;)V

    iput-object p1, v0, La9/e$b;->H:Ljava/lang/Object;

    return-object v0
.end method
