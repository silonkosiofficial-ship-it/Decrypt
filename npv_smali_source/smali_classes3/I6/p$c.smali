.class final LI6/p$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LI6/p$c;->J:Ljava/util/List;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI6/p$c;->G:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, LI6/p$c;->H:Ljava/lang/Object;

    check-cast v0, LD6/b;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI6/p$c;->H:Ljava/lang/Object;

    check-cast p1, LJ6/k$a;

    iget-object v1, p0, LI6/p$c;->I:Ljava/lang/Object;

    check-cast v1, LO6/d;

    const/4 v4, 0x0

    iput-object v4, p0, LI6/p$c;->H:Ljava/lang/Object;

    iput v3, p0, LI6/p$c;->G:I

    invoke-virtual {p1, v1, p0}, LJ6/k$a;->a(LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, LD6/b;

    iget-object v1, p0, LI6/p$c;->J:Ljava/util/List;

    invoke-virtual {p1}, LD6/b;->e()LQ6/c;

    move-result-object v3

    iput-object p1, p0, LI6/p$c;->H:Ljava/lang/Object;

    iput v2, p0, LI6/p$c;->G:I

    invoke-static {v1, v3, p0}, LI6/p;->h(Ljava/util/List;LQ6/c;Lm7/e;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    return-object v0

    :cond_4
    move-object v0, p1

    :goto_1
    return-object v0
.end method

.method public final H(LJ6/k$a;LO6/d;Lm7/e;)Ljava/lang/Object;
    .locals 2

    new-instance v0, LI6/p$c;

    iget-object v1, p0, LI6/p$c;->J:Ljava/util/List;

    invoke-direct {v0, v1, p3}, LI6/p$c;-><init>(Ljava/util/List;Lm7/e;)V

    iput-object p1, v0, LI6/p$c;->H:Ljava/lang/Object;

    iput-object p2, v0, LI6/p$c;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, LI6/p$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJ6/k$a;

    check-cast p2, LO6/d;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, LI6/p$c;->H(LJ6/k$a;LO6/d;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
