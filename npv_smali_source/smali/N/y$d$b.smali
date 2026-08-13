.class final LN/y$d$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ8/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/y$d;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic C:Lu/a;

.field final synthetic D:LW8/N;


# direct methods
.method constructor <init>(Lu/a;LW8/N;)V
    .locals 0

    iput-object p1, p0, LN/y$d$b;->C:Lu/a;

    iput-object p2, p0, LN/y$d$b;->D:LW8/N;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ln0/g;

    invoke-virtual {p1}, Ln0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p2}, LN/y$d$b;->b(JLm7/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(JLm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    iget-object v0, p0, LN/y$d$b;->C:Lu/a;

    invoke-virtual {v0}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1, p2}, Ln0/h;->c(J)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LN/y$d$b;->C:Lu/a;

    invoke-virtual {v0}, Lu/a;->m()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln0/g;

    invoke-virtual {v0}, Ln0/g;->v()J

    move-result-wide v0

    invoke-static {v0, v1}, Ln0/g;->n(J)F

    move-result v0

    invoke-static {p1, p2}, Ln0/g;->n(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, LN/y$d$b;->D:LW8/N;

    new-instance v4, LN/y$d$b$a;

    iget-object p3, p0, LN/y$d$b;->C:Lu/a;

    const/4 v0, 0x0

    invoke-direct {v4, p3, p1, p2, v0}, LN/y$d$b$a;-><init>(Lu/a;JLm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1

    :cond_1
    :goto_0
    iget-object v0, p0, LN/y$d$b;->C:Lu/a;

    invoke-static {p1, p2}, Ln0/g;->d(J)Ln0/g;

    move-result-object p1

    invoke-virtual {v0, p1, p3}, Lu/a;->s(Ljava/lang/Object;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
