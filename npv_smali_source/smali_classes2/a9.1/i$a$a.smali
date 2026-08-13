.class final La9/i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La9/i$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Ly7/O;

.field final synthetic D:LW8/N;

.field final synthetic E:La9/i;

.field final synthetic F:LZ8/g;


# direct methods
.method constructor <init>(Ly7/O;LW8/N;La9/i;LZ8/g;)V
    .locals 0

    iput-object p1, p0, La9/i$a$a;->C:Ly7/O;

    iput-object p2, p0, La9/i$a$a;->D:LW8/N;

    iput-object p3, p0, La9/i$a$a;->E:La9/i;

    iput-object p4, p0, La9/i$a$a;->F:LZ8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p2, La9/i$a$a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La9/i$a$a$b;

    iget v1, v0, La9/i$a$a$b;->K:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La9/i$a$a$b;->K:I

    goto :goto_0

    :cond_0
    new-instance v0, La9/i$a$a$b;

    invoke-direct {v0, p0, p2}, La9/i$a$a$b;-><init>(La9/i$a$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, La9/i$a$a$b;->I:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, La9/i$a$a$b;->K:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, La9/i$a$a$b;->H:Ljava/lang/Object;

    check-cast p1, LW8/z0;

    iget-object p1, v0, La9/i$a$a$b;->G:Ljava/lang/Object;

    iget-object v0, v0, La9/i$a$a$b;->F:Ljava/lang/Object;

    check-cast v0, La9/i$a$a;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, La9/i$a$a;->C:Ly7/O;

    iget-object p2, p2, Ly7/O;->C:Ljava/lang/Object;

    check-cast p2, LW8/z0;

    if-eqz p2, :cond_3

    new-instance v2, La9/k;

    invoke-direct {v2}, La9/k;-><init>()V

    invoke-interface {p2, v2}, LW8/z0;->o(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, La9/i$a$a$b;->F:Ljava/lang/Object;

    iput-object p1, v0, La9/i$a$a$b;->G:Ljava/lang/Object;

    iput-object p2, v0, La9/i$a$a$b;->H:Ljava/lang/Object;

    iput v3, v0, La9/i$a$a$b;->K:I

    invoke-interface {p2, v0}, LW8/z0;->g0(Lm7/e;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, La9/i$a$a;->C:Ly7/O;

    iget-object v1, v0, La9/i$a$a;->D:LW8/N;

    sget-object v3, LW8/P;->F:LW8/P;

    new-instance v4, La9/i$a$a$a;

    iget-object v2, v0, La9/i$a$a;->E:La9/i;

    iget-object v0, v0, La9/i$a$a;->F:LZ8/g;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v0, p1, v5}, La9/i$a$a$a;-><init>(La9/i;LZ8/g;Ljava/lang/Object;Lm7/e;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    iput-object p1, p2, Ly7/O;->C:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
