.class final Lx/h$c$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx/h$c$a;->B(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:Lx/h;

.field final synthetic E:Lx/I;

.field final synthetic F:Lx/f;


# direct methods
.method constructor <init>(Lx/h;Lx/I;Lx/f;)V
    .locals 0

    iput-object p1, p0, Lx/h$c$a$b;->D:Lx/h;

    iput-object p2, p0, Lx/h$c$a$b;->E:Lx/I;

    iput-object p3, p0, Lx/h$c$a$b;->F:Lx/f;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 9

    .prologue
    iget-object v0, p0, Lx/h$c$a$b;->D:Lx/h;

    invoke-static {v0}, Lx/h;->U1(Lx/h;)Lx/d;

    move-result-object v0

    iget-object v7, p0, Lx/h$c$a$b;->D:Lx/h;

    :goto_0
    invoke-static {v0}, Lx/d;->a(Lx/d;)LX/b;

    move-result-object v1

    invoke-virtual {v1}, LX/b;->x()Z

    move-result v1

    const/4 v8, 0x1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lx/d;->a(Lx/d;)LX/b;

    move-result-object v1

    invoke-virtual {v1}, LX/b;->y()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx/h$a;

    invoke-virtual {v1}, Lx/h$a;->b()Lx7/a;

    move-result-object v1

    invoke-interface {v1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Ln0/i;

    if-nez v2, :cond_0

    move v1, v8

    goto :goto_1

    :cond_0
    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    move-object v1, v7

    invoke-static/range {v1 .. v6}, Lx/h;->l2(Lx/h;Ln0/i;JILjava/lang/Object;)Z

    move-result v1

    :goto_1
    if-eqz v1, :cond_1

    invoke-static {v0}, Lx/d;->a(Lx/d;)LX/b;

    move-result-object v1

    invoke-static {v0}, Lx/d;->a(Lx/d;)LX/b;

    move-result-object v2

    invoke-virtual {v2}, LX/b;->t()I

    move-result v2

    sub-int/2addr v2, v8

    invoke-virtual {v1, v2}, LX/b;->D(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx/h$a;

    invoke-virtual {v1}, Lx/h$a;->a()LW8/l;

    move-result-object v1

    sget-object v2, Li7/M;->a:Li7/M;

    invoke-static {v2}, Li7/w;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Lm7/e;->t(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx/h$c$a$b;->D:Lx/h;

    invoke-static {v0}, Lx/h;->Y1(Lx/h;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lx/h$c$a$b;->D:Lx/h;

    invoke-static {v0}, Lx/h;->V1(Lx/h;)Ln0/i;

    move-result-object v2

    const/4 v0, 0x0

    if-eqz v2, :cond_2

    iget-object v1, p0, Lx/h$c$a$b;->D:Lx/h;

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v3, 0x0

    invoke-static/range {v1 .. v6}, Lx/h;->l2(Lx/h;Ln0/i;JILjava/lang/Object;)Z

    move-result v1

    if-ne v1, v8, :cond_2

    goto :goto_2

    :cond_2
    move v8, v0

    :goto_2
    if-eqz v8, :cond_3

    iget-object v1, p0, Lx/h$c$a$b;->D:Lx/h;

    invoke-static {v1, v0}, Lx/h;->c2(Lx/h;Z)V

    :cond_3
    iget-object v0, p0, Lx/h$c$a$b;->E:Lx/I;

    iget-object v1, p0, Lx/h$c$a$b;->D:Lx/h;

    iget-object v2, p0, Lx/h$c$a$b;->F:Lx/f;

    invoke-static {v1, v2}, Lx/h;->T1(Lx/h;Lx/f;)F

    move-result v1

    invoke-virtual {v0, v1}, Lx/I;->j(F)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lx/h$c$a$b;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
