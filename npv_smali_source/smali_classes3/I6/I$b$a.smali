.class final LI6/I$b$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI6/I$b;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:Ljava/lang/Long;

.field final synthetic I:LO6/d;

.field final synthetic J:LW8/z0;


# direct methods
.method constructor <init>(Ljava/lang/Long;LO6/d;LW8/z0;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/I$b$a;->H:Ljava/lang/Long;

    iput-object p2, p0, LI6/I$b$a;->I:LO6/d;

    iput-object p3, p0, LI6/I$b$a;->J:LW8/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/I$b$a;->G:I

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

    iget-object p1, p0, LI6/I$b$a;->H:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput v2, p0, LI6/I$b$a;->G:I

    invoke-static {v3, v4, p0}, LW8/Y;->a(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, LI6/D;

    iget-object v0, p0, LI6/I$b$a;->I:LO6/d;

    invoke-direct {p1, v0}, LI6/D;-><init>(LO6/d;)V

    invoke-static {}, LI6/I;->g()Lfa/d;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Request timeout: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LI6/I$b$a;->I:LO6/d;

    invoke-virtual {v2}, LO6/d;->j()LT6/M;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lfa/d;->g(Ljava/lang/String;)V

    iget-object v0, p0, LI6/I$b$a;->J:LW8/z0;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ly7/t;->c(Ljava/lang/Object;)V

    invoke-static {v0, v1, p1}, LW8/C0;->c(LW8/z0;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI6/I$b$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LI6/I$b$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LI6/I$b$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LI6/I$b$a;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance p1, LI6/I$b$a;

    iget-object v0, p0, LI6/I$b$a;->H:Ljava/lang/Long;

    iget-object v1, p0, LI6/I$b$a;->I:LO6/d;

    iget-object v2, p0, LI6/I$b$a;->J:LW8/z0;

    invoke-direct {p1, v0, v1, v2, p2}, LI6/I$b$a;-><init>(Ljava/lang/Long;LO6/d;LW8/z0;Lm7/e;)V

    return-object p1
.end method
