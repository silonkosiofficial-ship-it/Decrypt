.class public final LZ8/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# instance fields
.field private final C:LZ8/g;

.field private final D:Lx7/p;


# direct methods
.method public constructor <init>(LZ8/g;Lx7/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZ8/S;->C:LZ8/g;

    iput-object p2, p0, LZ8/S;->D:Lx7/p;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LZ8/S;->C:LZ8/g;

    invoke-interface {v0, p1, p2}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lm7/e;)Ljava/lang/Object;
    .locals 6

    .prologue
    instance-of v0, p1, LZ8/S$a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LZ8/S$a;

    iget v1, v0, LZ8/S$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/S$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/S$a;

    invoke-direct {v0, p0, p1}, LZ8/S$a;-><init>(LZ8/S;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LZ8/S$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/S$a;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, LZ8/S$a;->G:Ljava/lang/Object;

    check-cast v2, La9/v;

    iget-object v4, v0, LZ8/S$a;->F:Ljava/lang/Object;

    check-cast v4, LZ8/S;

    :try_start_0
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    new-instance v2, La9/v;

    iget-object p1, p0, LZ8/S;->C:LZ8/g;

    invoke-interface {v0}, Lm7/e;->getContext()Lm7/i;

    move-result-object v5

    invoke-direct {v2, p1, v5}, La9/v;-><init>(LZ8/g;Lm7/i;)V

    :try_start_1
    iget-object p1, p0, LZ8/S;->D:Lx7/p;

    iput-object p0, v0, LZ8/S$a;->F:Ljava/lang/Object;

    iput-object v2, v0, LZ8/S$a;->G:Ljava/lang/Object;

    iput v4, v0, LZ8/S$a;->J:I

    invoke-interface {p1, v2, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v4, p0

    :goto_1
    invoke-virtual {v2}, La9/v;->D()V

    iget-object p1, v4, LZ8/S;->C:LZ8/g;

    instance-of v2, p1, LZ8/S;

    if-eqz v2, :cond_6

    check-cast p1, LZ8/S;

    const/4 v2, 0x0

    iput-object v2, v0, LZ8/S$a;->F:Ljava/lang/Object;

    iput-object v2, v0, LZ8/S$a;->G:Ljava/lang/Object;

    iput v3, v0, LZ8/S$a;->J:I

    invoke-virtual {p1, v0}, LZ8/S;->b(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_6
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :goto_3
    invoke-virtual {v2}, La9/v;->D()V

    throw p1
.end method
