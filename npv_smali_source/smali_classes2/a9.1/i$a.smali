.class final La9/i$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La9/i;->t(LZ8/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:La9/i;

.field final synthetic J:LZ8/g;


# direct methods
.method constructor <init>(La9/i;LZ8/g;Lm7/e;)V
    .locals 0

    iput-object p1, p0, La9/i$a;->I:La9/i;

    iput-object p2, p0, La9/i$a;->J:LZ8/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La9/i$a;->G:I

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

    iget-object p1, p0, La9/i$a;->H:Ljava/lang/Object;

    check-cast p1, LW8/N;

    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    iget-object v3, p0, La9/i$a;->I:La9/i;

    iget-object v4, v3, La9/g;->F:LZ8/f;

    new-instance v5, La9/i$a$a;

    iget-object v6, p0, La9/i$a;->J:LZ8/g;

    invoke-direct {v5, v1, p1, v3, v6}, La9/i$a$a;-><init>(Ly7/O;LW8/N;La9/i;LZ8/g;)V

    iput v2, p0, La9/i$a;->G:I

    invoke-interface {v4, v5, p0}, LZ8/f;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, La9/i$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, La9/i$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, La9/i$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, La9/i$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, La9/i$a;

    iget-object v1, p0, La9/i$a;->I:La9/i;

    iget-object v2, p0, La9/i$a;->J:LZ8/g;

    invoke-direct {v0, v1, v2, p2}, La9/i$a;-><init>(La9/i;LZ8/g;Lm7/e;)V

    iput-object p1, v0, La9/i$a;->H:Ljava/lang/Object;

    return-object v0
.end method
