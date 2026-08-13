.class final Li7/d;
.super Li7/c;
.source "SourceFile"

# interfaces
.implements Lm7/e;


# instance fields
.field private C:Lx7/q;

.field private D:Ljava/lang/Object;

.field private E:Lm7/e;

.field private F:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lx7/q;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "block"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li7/c;-><init>(Ly7/k;)V

    iput-object p1, p0, Li7/d;->C:Lx7/q;

    iput-object p2, p0, Li7/d;->D:Ljava/lang/Object;

    const-string p1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p0, p1}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p0, Li7/d;->E:Lm7/e;

    invoke-static {}, Li7/b;->a()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Li7/d;->F:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    .prologue
    const-string v0, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p2, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Li7/d;->E:Lm7/e;

    iput-object p1, p0, Li7/d;->D:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lo7/h;->c(Lm7/e;)V

    :cond_0
    return-object p1
.end method

.method public final b()Ljava/lang/Object;
    .locals 4

    .prologue
    :cond_0
    :goto_0
    iget-object v0, p0, Li7/d;->F:Ljava/lang/Object;

    iget-object v1, p0, Li7/d;->E:Lm7/e;

    if-nez v1, :cond_1

    invoke-static {v0}, Li7/x;->b(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    invoke-static {}, Li7/b;->a()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2, v0}, Li7/w;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    :try_start_0
    iget-object v0, p0, Li7/d;->C:Lx7/q;

    iget-object v2, p0, Li7/d;->D:Ljava/lang/Object;

    instance-of v3, v0, Lo7/a;

    if-nez v3, :cond_2

    invoke-static {v0, p0, v2, v1}, Ln7/b;->f(Lx7/q;Ljava/lang/Object;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_2
    const/4 v3, 0x3

    invoke-static {v0, v3}, Ly7/W;->f(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx7/q;

    invoke-interface {v0, p0, v2, v1}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v2

    if-eq v0, v2, :cond_0

    :goto_2
    invoke-static {v0}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_3
    invoke-interface {v1, v0}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_0

    :goto_4
    sget-object v2, Li7/w;->D:Li7/w$a;

    invoke-static {v0}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_2

    :cond_3
    invoke-static {}, Li7/b;->a()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Li7/d;->F:Ljava/lang/Object;

    goto :goto_3
.end method

.method public getContext()Lm7/i;
    .locals 1

    sget-object v0, Lm7/j;->C:Lm7/j;

    return-object v0
.end method

.method public t(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Li7/d;->E:Lm7/e;

    iput-object p1, p0, Li7/d;->F:Ljava/lang/Object;

    return-void
.end method
