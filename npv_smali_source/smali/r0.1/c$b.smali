.class final Lr0/c$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/c;-><init>(Lr0/e;Lr0/G;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lr0/c;


# direct methods
.method constructor <init>(Lr0/c;)V
    .locals 0

    iput-object p1, p0, Lr0/c$b;->D:Lr0/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 7

    .prologue
    iget-object v0, p0, Lr0/c$b;->D:Lr0/c;

    invoke-static {v0}, Lr0/c;->b(Lr0/c;)Lo0/Q1;

    move-result-object v0

    iget-object v1, p0, Lr0/c$b;->D:Lr0/c;

    invoke-static {v1}, Lr0/c;->c(Lr0/c;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lr0/c$b;->D:Lr0/c;

    invoke-virtual {v1}, Lr0/c;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lr0/c$b;->D:Lr0/c;

    invoke-static {v1}, Lr0/c;->a(Lr0/c;)Lx7/l;

    move-result-object v1

    sget-object v2, Lo0/x0;->a:Lo0/x0$a;

    invoke-virtual {v2}, Lo0/x0$a;->b()I

    move-result v2

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v3

    invoke-interface {v3}, Lq0/d;->i()J

    move-result-wide v4

    invoke-interface {v3}, Lq0/d;->h()Lo0/q0;

    move-result-object v6

    invoke-interface {v6}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v3}, Lq0/d;->c()Lq0/j;

    move-result-object v6

    invoke-interface {v6, v0, v2}, Lq0/j;->b(Lo0/Q1;I)V

    invoke-interface {v1, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3}, Lq0/d;->h()Lo0/q0;

    move-result-object p1

    invoke-interface {p1}, Lo0/q0;->s()V

    invoke-interface {v3, v4, v5}, Lq0/d;->d(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v3}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->s()V

    invoke-interface {v3, v4, v5}, Lq0/d;->d(J)V

    throw p1

    :cond_0
    iget-object v0, p0, Lr0/c$b;->D:Lr0/c;

    invoke-static {v0}, Lr0/c;->a(Lr0/c;)Lx7/l;

    move-result-object v0

    invoke-interface {v0, p1}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, Lr0/c$b;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
