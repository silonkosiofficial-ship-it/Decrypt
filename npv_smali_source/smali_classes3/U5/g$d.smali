.class final LU5/g$d;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU5/g;->h(LQ1/f$a;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Ljava/lang/Object;

.field final synthetic J:LQ1/f$a;

.field final synthetic K:LU5/g;


# direct methods
.method constructor <init>(Ljava/lang/Object;LQ1/f$a;LU5/g;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LU5/g$d;->I:Ljava/lang/Object;

    iput-object p2, p0, LU5/g$d;->J:LQ1/f$a;

    iput-object p3, p0, LU5/g$d;->K:LU5/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LU5/g$d;->G:I

    if-nez v0, :cond_1

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LU5/g$d;->H:Ljava/lang/Object;

    check-cast p1, LQ1/c;

    iget-object v0, p0, LU5/g$d;->I:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v1, p0, LU5/g$d;->J:LQ1/f$a;

    invoke-virtual {p1, v1, v0}, LQ1/c;->i(LQ1/f$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LU5/g$d;->J:LQ1/f$a;

    invoke-virtual {p1, v0}, LQ1/c;->h(LQ1/f$a;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, LU5/g$d;->K:LU5/g;

    invoke-static {v0, p1}, LU5/g;->c(LU5/g;LQ1/f;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(LQ1/c;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LU5/g$d;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LU5/g$d;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LU5/g$d;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ1/c;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LU5/g$d;->H(LQ1/c;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, LU5/g$d;

    iget-object v1, p0, LU5/g$d;->I:Ljava/lang/Object;

    iget-object v2, p0, LU5/g$d;->J:LQ1/f$a;

    iget-object v3, p0, LU5/g$d;->K:LU5/g;

    invoke-direct {v0, v1, v2, v3, p2}, LU5/g$d;-><init>(Ljava/lang/Object;LQ1/f$a;LU5/g;Lm7/e;)V

    iput-object p1, v0, LU5/g$d;->H:Ljava/lang/Object;

    return-object v0
.end method
