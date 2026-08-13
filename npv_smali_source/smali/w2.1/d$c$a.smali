.class public final Lw2/d$c$a;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw2/d$c;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lx7/l;


# direct methods
.method public constructor <init>(Lm7/e;Lx7/l;)V
    .locals 0

    iput-object p2, p0, Lw2/d$c$a;->I:Lx7/l;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    iget v0, p0, Lw2/d$c$a;->G:I

    if-nez v0, :cond_0

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw2/d$c$a;->H:Ljava/lang/Object;

    check-cast p1, Lo2/A;

    const-string v0, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lq2/j;

    invoke-interface {p1}, Lq2/j;->d()Ly2/b;

    move-result-object p1

    iget-object v0, p0, Lw2/d$c$a;->I:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H(Lo2/A;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw2/d$c$a;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Lw2/d$c$a;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Lw2/d$c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo2/A;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Lw2/d$c$a;->H(Lo2/A;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 2

    new-instance v0, Lw2/d$c$a;

    iget-object v1, p0, Lw2/d$c$a;->I:Lx7/l;

    invoke-direct {v0, p2, v1}, Lw2/d$c$a;-><init>(Lm7/e;Lx7/l;)V

    iput-object p1, v0, Lw2/d$c$a;->H:Ljava/lang/Object;

    return-object v0
.end method
