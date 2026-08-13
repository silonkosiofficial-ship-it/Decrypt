.class final LN/a$f$a$a;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/a$f$a;->a(Ll0/d;)Ll0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx7/a;

.field final synthetic E:Z

.field final synthetic F:Lo0/E1;

.field final synthetic G:Lo0/z0;


# direct methods
.method constructor <init>(Lx7/a;ZLo0/E1;Lo0/z0;)V
    .locals 0

    iput-object p1, p0, LN/a$f$a$a;->D:Lx7/a;

    iput-boolean p2, p0, LN/a$f$a$a;->E:Z

    iput-object p3, p0, LN/a$f$a$a;->F:Lo0/E1;

    iput-object p4, p0, LN/a$f$a$a;->G:Lo0/z0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 14

    .prologue
    invoke-interface {p1}, Lq0/c;->l1()V

    iget-object v0, p0, LN/a$f$a$a;->D:Lx7/a;

    invoke-interface {v0}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, LN/a$f$a$a;->E:Z

    iget-object v2, p0, LN/a$f$a$a;->F:Lo0/E1;

    iget-object v7, p0, LN/a$f$a$a;->G:Lo0/z0;

    if-eqz v0, :cond_1

    invoke-interface {p1}, Lq0/g;->W0()J

    move-result-wide v0

    invoke-interface {p1}, Lq0/g;->F0()Lq0/d;

    move-result-object v11

    invoke-interface {v11}, Lq0/d;->i()J

    move-result-wide v12

    invoke-interface {v11}, Lq0/d;->h()Lo0/q0;

    move-result-object v3

    invoke-interface {v3}, Lo0/q0;->m()V

    :try_start_0
    invoke-interface {v11}, Lq0/d;->c()Lq0/j;

    move-result-object v3

    const/high16 v4, -0x40800000    # -1.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-interface {v3, v4, v5, v0, v1}, Lq0/j;->e(FFJ)V

    const/16 v9, 0x2e

    const/4 v10, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lq0/f;->g(Lq0/g;Lo0/E1;JFLq0/h;Lo0/z0;IILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v11}, Lq0/d;->h()Lo0/q0;

    move-result-object p1

    invoke-interface {p1}, Lo0/q0;->s()V

    invoke-interface {v11, v12, v13}, Lq0/d;->d(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v11}, Lq0/d;->h()Lo0/q0;

    move-result-object v0

    invoke-interface {v0}, Lo0/q0;->s()V

    invoke-interface {v11, v12, v13}, Lq0/d;->d(J)V

    throw p1

    :cond_1
    const/16 v9, 0x2e

    const/4 v10, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v10}, Lq0/f;->g(Lq0/g;Lo0/E1;JFLq0/h;Lo0/z0;IILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lq0/c;

    invoke-virtual {p0, p1}, LN/a$f$a$a;->a(Lq0/c;)V

    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method
