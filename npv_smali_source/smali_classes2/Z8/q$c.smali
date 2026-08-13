.class final LZ8/q$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/q;->b(LZ8/f;LZ8/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/g;

.field final synthetic D:Ly7/O;


# direct methods
.method constructor <init>(LZ8/g;Ly7/O;)V
    .locals 0

    iput-object p1, p0, LZ8/q$c;->C:LZ8/g;

    iput-object p2, p0, LZ8/q$c;->D:Ly7/O;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 4

    .prologue
    instance-of v0, p2, LZ8/q$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/q$c$a;

    iget v1, v0, LZ8/q$c$a;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/q$c$a;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/q$c$a;

    invoke-direct {v0, p0, p2}, LZ8/q$c$a;-><init>(LZ8/q$c;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/q$c$a;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/q$c$a;->I:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, LZ8/q$c$a;->F:Ljava/lang/Object;

    check-cast p1, LZ8/q$c;

    :try_start_0
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, LZ8/q$c;->C:LZ8/g;

    iput-object p0, v0, LZ8/q$c$a;->F:Ljava/lang/Object;

    iput v3, v0, LZ8/q$c$a;->I:I

    invoke-interface {p2, p1, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :catchall_1
    move-exception p2

    move-object p1, p0

    :goto_2
    iget-object p1, p1, LZ8/q$c;->D:Ly7/O;

    iput-object p2, p1, Ly7/O;->C:Ljava/lang/Object;

    throw p2
.end method
