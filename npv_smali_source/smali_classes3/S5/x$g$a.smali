.class final LS5/x$g$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/x$g;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS5/x$g$a;->I:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LS5/x$g$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LS5/x$g$a;->H:Ljava/lang/Object;

    check-cast p1, LQ1/c;

    sget-object v0, LS5/x$d;->a:LS5/x$d;

    invoke-virtual {v0}, LS5/x$d;->a()LQ1/f$a;

    move-result-object v0

    iget-object v1, p0, LS5/x$g$a;->I:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LQ1/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS5/x$g$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS5/x$g$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS5/x$g$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ1/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS5/x$g$a;->H(LQ1/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LS5/x$g$a;

    iget-object v1, p0, LS5/x$g$a;->I:Ljava/lang/String;

    invoke-direct {v0, v1, p2}, LS5/x$g$a;-><init>(Ljava/lang/String;Lm7/e;)V

    iput-object p1, v0, LS5/x$g$a;->H:Ljava/lang/Object;

    return-object v0
.end method
