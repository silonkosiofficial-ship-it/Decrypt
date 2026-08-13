.class final LS5/D$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/D;->o(Ljava/util/List;)LW8/z0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field final synthetic H:LS5/D;

.field final synthetic I:Ljava/util/List;


# direct methods
.method constructor <init>(LS5/D;Ljava/util/List;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LS5/D$c;->H:LS5/D;

    iput-object p2, p0, LS5/D$c;->I:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2

    iget v3, p0, LS5/D$c;->G:I

    if-eqz v3, :cond_1

    if-ne v3, v1, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    sget-object p1, LT5/a;->a:LT5/a;

    iput v1, p0, LS5/D$c;->G:I

    invoke-virtual {p1, p0}, LT5/a;->c(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    const-string v3, "SessionLifecycleClient"

    if-eqz v2, :cond_3

    const-string p1, "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent."

    :goto_1
    nop

    goto :goto_4

    :cond_3
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v2, p1, Ljava/util/Collection;

    if-eqz v2, :cond_4

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LT5/b;

    invoke-interface {v2}, LT5/b;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object p1, p0, LS5/D$c;->H:LS5/D;

    iget-object v2, p0, LS5/D$c;->I:Ljava/util/List;

    invoke-static {p1, v2, v0}, LS5/D;->b(LS5/D;Ljava/util/List;I)Landroid/os/Message;

    move-result-object p1

    iget-object v2, p0, LS5/D$c;->H:LS5/D;

    iget-object v3, p0, LS5/D$c;->I:Ljava/util/List;

    invoke-static {v2, v3, v1}, LS5/D;->b(LS5/D;Ljava/util/List;I)Landroid/os/Message;

    move-result-object v2

    new-array v0, v0, [Landroid/os/Message;

    const/4 v3, 0x0

    aput-object p1, v0, v3

    aput-object v2, v0, v1

    invoke-static {v0}, Lj7/v;->s([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lj7/v;->f0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, LS5/D$c$a;

    invoke-direct {v0}, LS5/D$c$a;-><init>()V

    invoke-static {p1, v0}, Lj7/v;->L0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    iget-object v0, p0, LS5/D$c;->H:LS5/D;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/Message;

    invoke-static {v0, v1}, LS5/D;->e(LS5/D;Landroid/os/Message;)V

    goto :goto_2

    :cond_6
    :goto_3
    const-string p1, "Data Collection is disabled for all subscribers. Skipping this Event"

    goto :goto_1

    :cond_7
    :goto_4
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LW8/N;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LS5/D$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LS5/D$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LS5/D$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LW8/N;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LS5/D$c;->H(LW8/N;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance p1, LS5/D$c;

    iget-object v0, p0, LS5/D$c;->H:LS5/D;

    iget-object v1, p0, LS5/D$c;->I:Ljava/util/List;

    invoke-direct {p1, v0, v1, p2}, LS5/D$c;-><init>(LS5/D;Ljava/util/List;Lm7/e;)V

    return-object p1
.end method
