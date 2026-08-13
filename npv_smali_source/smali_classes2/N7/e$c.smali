.class final LN7/e$c;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN7/e;-><init>(LE8/n;LO7/G;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LN7/e;

.field final synthetic E:LE8/n;


# direct methods
.method constructor <init>(LN7/e;LE8/n;)V
    .locals 0

    iput-object p1, p0, LN7/e$c;->D:LN7/e;

    iput-object p2, p0, LN7/e$c;->E:LE8/n;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LR7/h;
    .locals 10

    new-instance v9, LR7/h;

    iget-object v0, p0, LN7/e$c;->D:LN7/e;

    invoke-static {v0}, LN7/e;->f(LN7/e;)Lx7/l;

    move-result-object v0

    iget-object v1, p0, LN7/e$c;->D:LN7/e;

    invoke-static {v1}, LN7/e;->h(LN7/e;)LO7/G;

    move-result-object v1

    invoke-interface {v0, v1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LO7/m;

    invoke-static {}, LN7/e;->e()Ln8/f;

    move-result-object v2

    sget-object v3, LO7/D;->G:LO7/D;

    sget-object v4, LO7/f;->E:LO7/f;

    iget-object v0, p0, LN7/e$c;->D:LN7/e;

    invoke-static {v0}, LN7/e;->h(LN7/e;)LO7/G;

    move-result-object v0

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v0

    invoke-virtual {v0}, LL7/g;->i()LF8/M;

    move-result-object v0

    invoke-static {v0}, Lj7/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    sget-object v6, LO7/a0;->a:LO7/a0;

    const/4 v7, 0x0

    iget-object v8, p0, LN7/e$c;->E:LE8/n;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, LR7/h;-><init>(LO7/m;Ln8/f;LO7/D;LO7/f;Ljava/util/Collection;LO7/a0;ZLE8/n;)V

    iget-object v0, p0, LN7/e$c;->E:LE8/n;

    new-instance v1, LN7/a;

    invoke-direct {v1, v0, v9}, LN7/a;-><init>(LE8/n;LO7/e;)V

    invoke-static {}, Lj7/Z;->d()Ljava/util/Set;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v9, v1, v0, v2}, LR7/h;->T0(Ly8/h;Ljava/util/Set;LO7/d;)V

    return-object v9
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LN7/e$c;->a()LR7/h;

    move-result-object v0

    return-object v0
.end method
