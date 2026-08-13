.class final La9/e$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La9/e;->f(La9/e;LZ8/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:LZ8/g;

.field final synthetic J:La9/e;


# direct methods
.method constructor <init>(LZ8/g;La9/e;Lm7/e;)V
    .locals 0

    iput-object p1, p0, La9/e$a;->I:LZ8/g;

    iput-object p2, p0, La9/e$a;->J:La9/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La9/e$a;->G:I

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

    iget-object p1, p0, La9/e$a;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    iget-object v1, p0, La9/e$a;->I:LZ8/g;

    iget-object v3, p0, La9/e$a;->J:La9/e;

    invoke-virtual {v3, p1}, La9/e;->o(LW8/N;)LY8/B;

    move-result-object p1

    iput v2, p0, La9/e$a;->G:I

    invoke-static {v1, p1, p0}, LZ8/h;->q(LZ8/g;LY8/B;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, La9/e$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, La9/e$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, La9/e$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, La9/e$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, La9/e$a;

    iget-object v1, p0, La9/e$a;->I:LZ8/g;

    iget-object v2, p0, La9/e$a;->J:La9/e;

    invoke-direct {v0, v1, v2, p2}, La9/e$a;-><init>(LZ8/g;La9/e;Lm7/e;)V

    iput-object p1, v0, La9/e$a;->H:Ljava/lang/Object;

    return-object v0
.end method
