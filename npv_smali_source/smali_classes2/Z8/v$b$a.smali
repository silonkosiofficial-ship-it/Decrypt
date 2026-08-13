.class public final LZ8/v$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ8/v$b;->b(LZ8/g;Lm7/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic C:LZ8/g;

.field final synthetic D:Lx7/p;


# direct methods
.method public constructor <init>(LZ8/g;Lx7/p;)V
    .locals 0

    iput-object p1, p0, LZ8/v$b$a;->C:LZ8/g;

    iput-object p2, p0, LZ8/v$b$a;->D:Lx7/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p2, LZ8/v$b$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, LZ8/v$b$a$a;

    iget v1, v0, LZ8/v$b$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LZ8/v$b$a$a;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, LZ8/v$b$a$a;

    invoke-direct {v0, p0, p2}, LZ8/v$b$a$a;-><init>(LZ8/v$b$a;Lm7/e;)V

    :goto_0
    iget-object p2, v0, LZ8/v$b$a$a;->F:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LZ8/v$b$a$a;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, LZ8/v$b$a$a;->J:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    iget-object v2, v0, LZ8/v$b$a$a;->I:Ljava/lang/Object;

    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p2, p0, LZ8/v$b$a;->C:LZ8/g;

    iget-object v2, p0, LZ8/v$b$a;->D:Lx7/p;

    iput-object p1, v0, LZ8/v$b$a$a;->I:Ljava/lang/Object;

    iput-object p2, v0, LZ8/v$b$a$a;->J:Ljava/lang/Object;

    iput v4, v0, LZ8/v$b$a$a;->G:I

    const/4 v4, 0x6

    invoke-static {v4}, Ly7/r;->a(I)V

    invoke-interface {v2, p1, v0}, Lx7/p;->u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x7

    invoke-static {v4}, Ly7/r;->a(I)V

    if-ne v2, v1, :cond_4

    return-object v1

    :cond_4
    move-object v2, p1

    move-object p1, p2

    :goto_1
    const/4 p2, 0x0

    iput-object p2, v0, LZ8/v$b$a$a;->I:Ljava/lang/Object;

    iput-object p2, v0, LZ8/v$b$a$a;->J:Ljava/lang/Object;

    iput v3, v0, LZ8/v$b$a$a;->G:I

    invoke-interface {p1, v2, v0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
