.class final Lu0/m$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu0/m;-><init>(Lu0/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lu0/m;


# direct methods
.method constructor <init>(Lu0/m;)V
    .locals 0

    iput-object p1, p0, Lu0/m$b;->D:Lu0/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/g;)V
    .locals 9

    .prologue
    iget-object v0, p0, Lu0/m$b;->D:Lu0/m;

    invoke-virtual {v0}, Lu0/m;->l()Lu0/c;

    move-result-object v0

    iget-object v1, p0, Lu0/m$b;->D:Lu0/m;

    invoke-static {v1}, Lu0/m;->f(Lu0/m;)F

    move-result v2

    invoke-static {v1}, Lu0/m;->g(Lu0/m;)F

    move-result v1

    sget-object v3, Ln0/g;->b:Ln0/g$a;

    invoke-virtual {v3}, Ln0/g$a;->c()J

    move-result-wide v3

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v5

    invoke-interface {v5}, Lq0/d;->i()J

    move-result-wide v6

    invoke-interface {v5}, Lq0/d;->h()Lo0/q0;

    move-result-object v8

    invoke-interface {v8}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v5}, Lq0/d;->c()Lq0/j;

    move-result-object v8

    invoke-interface {v8, v2, v1, v3, v4}, Lq0/j;->e(FFJ)V

    invoke-virtual {v0, p1}, Lu0/c;->a(Lq0/g;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v5}, Lq0/d;->h()Lo0/q0;

    move-result-object p1

    invoke-interface {p1}, Lo0/q0;->s()V

    invoke-interface {v5, v6, v7}, Lq0/d;->d(J)V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v5}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->s()V

    invoke-interface {v5, v6, v7}, Lq0/d;->d(J)V

    throw p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/g;

    invoke-virtual {p0, p1}, Lu0/m$b;->a(Lq0/g;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
