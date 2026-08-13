.class final LY8/w;
.super LY8/a;
.source "SourceFile"


# instance fields
.field private G:Lm7/e;


# direct methods
.method public constructor <init>(Lm7/i;LY8/j;Lx7/p;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, LY8/a;-><init>(Lm7/i;LY8/j;Z)V

    invoke-static {p3, p0, p0}, Ln7/b;->b(Lx7/p;Ljava/lang/Object;Lm7/e;)Lm7/e;

    move-result-object p1

    iput-object p1, p0, LY8/w;->G:Lm7/e;

    return-void
.end method


# virtual methods
.method protected I0()V
    .locals 1

    iget-object v0, p0, LY8/w;->G:Lm7/e;

    invoke-static {v0, p0}, Lc9/a;->b(Lm7/e;Lm7/e;)V

    return-void
.end method

.method public c(Ljava/lang/Throwable;)Z
    .locals 0

    invoke-super {p0, p1}, LY8/k;->c(Ljava/lang/Throwable;)Z

    move-result p1

    invoke-virtual {p0}, LW8/F0;->start()Z

    return p1
.end method

.method public h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 0

    .prologue
    invoke-virtual {p0}, LW8/F0;->start()Z

    invoke-super {p0, p1, p2}, LY8/k;->h(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0}, LW8/F0;->start()Z

    invoke-super {p0, p1}, LY8/k;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
