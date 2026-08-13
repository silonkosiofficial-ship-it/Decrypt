.class LR7/a$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR7/a$a;->a()LF8/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic C:LR7/a$a;


# direct methods
.method constructor <init>(LR7/a$a;)V
    .locals 0

    iput-object p1, p0, LR7/a$a$a;->C:LR7/a$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LG8/g;)LF8/M;
    .locals 2

    .prologue
    iget-object v0, p0, LR7/a$a$a;->C:LR7/a$a;

    iget-object v0, v0, LR7/a$a;->C:LR7/a;

    invoke-virtual {p1, v0}, LG8/g;->f(LO7/m;)LO7/h;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p0, LR7/a$a$a;->C:LR7/a$a;

    iget-object p1, p1, LR7/a$a;->C:LR7/a;

    iget-object p1, p1, LR7/a;->E:LE8/i;

    invoke-interface {p1}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF8/M;

    return-object p1

    :cond_0
    instance-of v1, v0, LO7/e0;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, LO7/e0;

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v0

    invoke-interface {v0}, LF8/e0;->x()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, LF8/q0;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, LF8/F;->b(LO7/e0;Ljava/util/List;)LF8/M;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, v0, LR7/t;

    if-eqz v1, :cond_2

    invoke-interface {v0}, LO7/h;->p()LF8/e0;

    move-result-object v1

    invoke-interface {v1, p1}, LF8/e0;->v(LG8/g;)LF8/e0;

    move-result-object v1

    check-cast v0, LR7/t;

    invoke-virtual {v0, p1}, LR7/t;->Q(LG8/g;)Ly8/h;

    move-result-object p1

    invoke-static {v1, p1, p0}, LF8/q0;->u(LF8/e0;Ly8/h;Lx7/l;)LF8/M;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {v0}, LO7/h;->w()LF8/M;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LG8/g;

    invoke-virtual {p0, p1}, LR7/a$a$a;->a(LG8/g;)LF8/M;

    move-result-object p1

    return-object p1
.end method
