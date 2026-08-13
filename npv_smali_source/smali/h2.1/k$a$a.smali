.class final Lh2/k$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/k$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Ly7/O;

.field final synthetic D:Lx7/q;

.field final synthetic E:LZ8/g;


# direct methods
.method constructor <init>(Ly7/O;Lx7/q;LZ8/g;)V
    .locals 0

    iput-object p1, p0, Lh2/k$a$a;->C:Ly7/O;

    iput-object p2, p0, Lh2/k$a$a;->D:Lx7/q;

    iput-object p3, p0, Lh2/k$a$a;->E:LZ8/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    instance-of v0, p2, Lh2/k$a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh2/k$a$a$a;

    iget v1, v0, Lh2/k$a$a$a;->J:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh2/k$a$a$a;->J:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh2/k$a$a$a;

    invoke-direct {v0, p0, p2}, Lh2/k$a$a$a;-><init>(Lh2/k$a$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, Lh2/k$a$a$a;->H:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lh2/k$a$a$a;->J:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lh2/k$a$a$a;->G:Ljava/lang/Object;

    check-cast p1, Ly7/O;

    iget-object v2, v0, Lh2/k$a$a$a;->F:Ljava/lang/Object;

    check-cast v2, Lh2/k$a$a;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lh2/k$a$a;->C:Ly7/O;

    iget-object v2, p2, Ly7/O;->C:Ljava/lang/Object;

    invoke-static {}, Lh2/k;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_4

    move-object v2, p0

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lh2/k$a$a;->D:Lx7/q;

    iget-object v5, p0, Lh2/k$a$a;->C:Ly7/O;

    iget-object v5, v5, Ly7/O;->C:Ljava/lang/Object;

    iput-object p0, v0, Lh2/k$a$a$a;->F:Ljava/lang/Object;

    iput-object p2, v0, Lh2/k$a$a$a;->G:Ljava/lang/Object;

    iput v4, v0, Lh2/k$a$a$a;->J:I

    invoke-interface {v2, v5, p1, v0}, Lx7/q;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    move-object v2, p0

    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_1
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_2
    iput-object p1, p2, Ly7/O;->C:Ljava/lang/Object;

    iget-object p1, v2, Lh2/k$a$a;->E:LZ8/g;

    iget-object p2, v2, Lh2/k$a$a;->C:Ly7/O;

    iget-object p2, p2, Ly7/O;->C:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, v0, Lh2/k$a$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lh2/k$a$a$a;->G:Ljava/lang/Object;

    iput v3, v0, Lh2/k$a$a$a;->J:I

    invoke-interface {p1, p2, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    return-object v1

    :cond_6
    :goto_3
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
