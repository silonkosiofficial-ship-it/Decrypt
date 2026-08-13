.class final LM1/g$a$c;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM1/g$a;->c(Ljava/util/List;LM1/m;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:I

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Ljava/util/List;

.field final synthetic M:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/List;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LM1/g$a$c;->L:Ljava/util/List;

    iput-object p2, p0, LM1/g$a$c;->M:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, LM1/g$a$c;->J:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    const/4 v3, 0x2

    if-eq v0, v1, :cond_1

    if-ne v0, v3, :cond_0

    iget-object v0, p0, LM1/g$a$c;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/Iterator;

    iget-object v3, p0, LM1/g$a$c;->K:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, LM1/g$a$c;->I:Ljava/lang/Object;

    iget-object v4, p0, LM1/g$a$c;->H:Ljava/lang/Object;

    invoke-static {v4}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    iget-object v4, p0, LM1/g$a$c;->G:Ljava/lang/Object;

    check-cast v4, Ljava/util/Iterator;

    iget-object v5, p0, LM1/g$a$c;->K:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    move-object p1, v0

    move-object v0, v4

    move-object v3, v5

    goto :goto_0

    :cond_2
    new-instance p1, LM1/g$a$c$a;

    invoke-direct {p1, v2, v2}, LM1/g$a$c$a;-><init>(LM1/f;Lm7/e;)V

    invoke-interface {v5, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v5, p0, LM1/g$a$c;->K:Ljava/lang/Object;

    iput-object v4, p0, LM1/g$a$c;->G:Ljava/lang/Object;

    iput-object v2, p0, LM1/g$a$c;->H:Ljava/lang/Object;

    iput-object v2, p0, LM1/g$a$c;->I:Ljava/lang/Object;

    iput v3, p0, LM1/g$a$c;->J:I

    throw v2

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM1/g$a$c;->K:Ljava/lang/Object;

    iget-object v0, p0, LM1/g$a$c;->L:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    iget-object v3, p0, LM1/g$a$c;->M:Ljava/util/List;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_4

    return-object p1

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    iput-object v3, p0, LM1/g$a$c;->K:Ljava/lang/Object;

    iput-object v0, p0, LM1/g$a$c;->G:Ljava/lang/Object;

    iput-object v2, p0, LM1/g$a$c;->H:Ljava/lang/Object;

    iput-object p1, p0, LM1/g$a$c;->I:Ljava/lang/Object;

    iput v1, p0, LM1/g$a$c;->J:I

    throw v2
.end method

.method public final H(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM1/g$a$c;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LM1/g$a$c;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LM1/g$a$c;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LM1/g$a$c;->H(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 3

    new-instance v0, LM1/g$a$c;

    iget-object v1, p0, LM1/g$a$c;->L:Ljava/util/List;

    iget-object v2, p0, LM1/g$a$c;->M:Ljava/util/List;

    invoke-direct {v0, v1, v2, p2}, LM1/g$a$c;-><init>(Ljava/util/List;Ljava/util/List;Lm7/e;)V

    iput-object p1, v0, LM1/g$a$c;->K:Ljava/lang/Object;

    return-object v0
.end method
