.class public final Lh2/c$b;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh2/c;->b(LZ8/f;LW8/N;Lh2/a;)LZ8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field synthetic I:Ljava/lang/Object;

.field final synthetic J:LW8/N;


# direct methods
.method public constructor <init>(Lm7/e;LW8/N;Lh2/a;)V
    .locals 0

    iput-object p2, p0, Lh2/c$b;->J:LW8/N;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lh2/c$b;->G:I

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

    iget-object p1, p0, Lh2/c$b;->H:Ljava/lang/Object;

    check-cast p1, LZ8/g;

    iget-object v1, p0, Lh2/c$b;->I:Ljava/lang/Object;

    check-cast v1, Lh2/F;

    new-instance v3, Lh2/u;

    iget-object v4, p0, Lh2/c$b;->J:LW8/N;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v1, v5}, Lh2/u;-><init>(LW8/N;Lh2/F;Lh2/a;)V

    iput v2, p0, Lh2/c$b;->G:I

    invoke-interface {p1, v3, p0}, LZ8/g;->a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public final H(LZ8/g;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lh2/c$b;

    iget-object v1, p0, Lh2/c$b;->J:LW8/N;

    const/4 v2, 0x0

    invoke-direct {v0, p3, v1, v2}, Lh2/c$b;-><init>(Lm7/e;LW8/N;Lh2/a;)V

    iput-object p1, v0, Lh2/c$b;->H:Ljava/lang/Object;

    iput-object p2, v0, Lh2/c$b;->I:Ljava/lang/Object;

    sget-object p1, Li7/M;->a:Li7/M;

    invoke-virtual {v0, p1}, Lh2/c$b;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LZ8/g;

    check-cast p3, Lm7/e;

    invoke-virtual {p0, p1, p2, p3}, Lh2/c$b;->H(LZ8/g;Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
