.class final LW8/P0;
.super LW8/E0;
.source "SourceFile"


# instance fields
.field private final G:LW8/n;


# direct methods
.method public constructor <init>(LW8/n;)V
    .locals 0

    invoke-direct {p0}, LW8/E0;-><init>()V

    iput-object p1, p0, LW8/P0;->G:LW8/n;

    return-void
.end method


# virtual methods
.method public w()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    invoke-virtual {p0}, LW8/E0;->v()LW8/F0;

    move-result-object p1

    invoke-virtual {p1}, LW8/F0;->b0()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LW8/A;

    if-eqz v0, :cond_0

    iget-object v0, p0, LW8/P0;->G:LW8/n;

    sget-object v1, Li7/w;->D:Li7/w$a;

    check-cast p1, LW8/A;

    iget-object p1, p1, LW8/A;->a:Ljava/lang/Throwable;

    invoke-static {p1}, Li7/x;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, LW8/P0;->G:LW8/n;

    sget-object v1, Li7/w;->D:Li7/w$a;

    invoke-static {p1}, LW8/G0;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :goto_1
    return-void
.end method
