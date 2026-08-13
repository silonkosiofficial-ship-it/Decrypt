.class final LQ1/d$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ1/d;->a(Lx7/p;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/p;


# direct methods
.method constructor <init>(Lx7/p;Lm7/e;)V
    .locals 0

    iput-object p1, p0, LQ1/d$a;->I:Lx7/p;

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

    iget v1, p0, LQ1/d$a;->G:I

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

    iget-object p1, p0, LQ1/d$a;->H:Ljava/lang/Object;

    check-cast p1, LQ1/f;

    iget-object v1, p0, LQ1/d$a;->I:Lx7/p;

    iput v2, p0, LQ1/d$a;->G:I

    invoke-interface {v1, p1, p0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, LQ1/f;

    const-string v0, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p1

    check-cast v0, LQ1/c;

    invoke-virtual {v0}, LQ1/c;->f()V

    return-object p1
.end method

.method public final H(LQ1/f;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LQ1/d$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, LQ1/d$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, LQ1/d$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LQ1/f;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, LQ1/d$a;->H(LQ1/f;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, LQ1/d$a;

    iget-object v1, p0, LQ1/d$a;->I:Lx7/p;

    invoke-direct {v0, v1, p2}, LQ1/d$a;-><init>(Lx7/p;Lm7/e;)V

    iput-object p1, v0, LQ1/d$a;->H:Ljava/lang/Object;

    return-object v0
.end method
