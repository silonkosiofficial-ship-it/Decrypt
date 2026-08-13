.class final LM1/j$d$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/j$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LW8/z0;


# direct methods
.method constructor <init>(LW8/z0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/j$d$b;->H:LW8/z0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LM1/j$d$b;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/j$d$b;->H:LW8/z0;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LW8/z0$a;->a(LW8/z0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LZ8/g;Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Object;
    .locals 0

    new-instance p1, LM1/j$d$b;

    iget-object p2, p0, LM1/j$d$b;->H:LW8/z0;

    invoke-direct {p1, p2, p3}, LM1/j$d$b;-><init>(LW8/z0;Lm7/e;)V

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/j$d$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LM1/j$d$b;->H(LZ8/g;Ljava/lang/Throwable;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
