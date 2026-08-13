.class final Laa/f$h;
.super Lo7/l;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Laa/f;->l(Laa/d;LV/n;I)Lt0/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field G:I

.field synthetic H:Ljava/lang/Object;

.field final synthetic I:Laa/d;

.field final synthetic J:Laa/r;

.field final synthetic K:LY0/e;


# direct methods
.method constructor <init>(Laa/d;Laa/r;LY0/e;Lm7/e;)V
    .locals 0

    iput-object p1, p0, Laa/f$h;->I:Laa/d;

    iput-object p2, p0, Laa/f$h;->J:Laa/r;

    iput-object p3, p0, Laa/f$h;->K:LY0/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lo7/l;-><init>(ILm7/e;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .prologue
    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Laa/f$h;->G:I

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

    iget-object p1, p0, Laa/f$h;->H:Ljava/lang/Object;

    check-cast p1, Laa/n;

    iget-object v1, p0, Laa/f$h;->I:Laa/d;

    invoke-static {v1, p1}, Laa/o;->f(Laa/m;Laa/n;)Laa/q;

    move-result-object p1

    invoke-virtual {p1}, Laa/q;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Laa/f$h;->J:Laa/r;

    new-instance v3, Laa/f$h$a;

    iget-object v4, p0, Laa/f$h;->K:LY0/e;

    invoke-direct {v3, v4}, Laa/f$h$a;-><init>(LY0/e;)V

    iput v2, p0, Laa/f$h;->G:I

    invoke-static {p1, p1, v1, v3, p0}, Laa/f;->d(Ljava/lang/String;Ljava/lang/String;Laa/r;Lx7/l;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    const-string v0, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Svg"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Laa/e$b;

    invoke-virtual {p1}, Laa/e$b;->a()Lt0/b;

    move-result-object p1

    return-object p1
.end method

.method public final H(Laa/n;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Laa/f$h;->x(Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    check-cast p1, Laa/f$h;

    sget-object p2, Li7/M;->a:Li7/M;

    invoke-virtual {p1, p2}, Laa/f$h;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic u(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Laa/n;

    check-cast p2, Lm7/e;

    invoke-virtual {p0, p1, p2}, Laa/f$h;->H(Laa/n;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ljava/lang/Object;Lm7/e;)Lm7/e;
    .locals 4

    new-instance v0, Laa/f$h;

    iget-object v1, p0, Laa/f$h;->I:Laa/d;

    iget-object v2, p0, Laa/f$h;->J:Laa/r;

    iget-object v3, p0, Laa/f$h;->K:LY0/e;

    invoke-direct {v0, v1, v2, v3, p2}, Laa/f$h;-><init>(Laa/d;Laa/r;LY0/e;Lm7/e;)V

    iput-object p1, v0, Laa/f$h;->H:Ljava/lang/Object;

    return-object v0
.end method
