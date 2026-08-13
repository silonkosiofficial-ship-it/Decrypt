.class final LF0/O$a$b;
.super Ly7/v;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/O$a;->d0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic D:LF0/O$a;

.field final synthetic E:LF0/U;

.field final synthetic F:LF0/O;


# direct methods
.method constructor <init>(LF0/O$a;LF0/U;LF0/O;)V
    .locals 0

    iput-object p1, p0, LF0/O$a$b;->D:LF0/O$a;

    iput-object p2, p0, LF0/O$a$b;->E:LF0/U;

    iput-object p3, p0, LF0/O$a$b;->F:LF0/O;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ly7/v;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    iget-object v0, p0, LF0/O$a$b;->D:LF0/O$a;

    invoke-static {v0}, LF0/O$a;->f1(LF0/O$a;)V

    iget-object v0, p0, LF0/O$a$b;->D:LF0/O$a;

    sget-object v1, LF0/O$a$b$a;->D:LF0/O$a$b$a;

    invoke-virtual {v0, v1}, LF0/O$a;->c0(Lx7/l;)V

    iget-object v0, p0, LF0/O$a$b;->D:LF0/O$a;

    invoke-virtual {v0}, LF0/O$a;->F()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF0/T;->y1()Z

    move-result v0

    iget-object v2, p0, LF0/O$a$b;->F:LF0/O;

    invoke-static {v2}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v2

    invoke-virtual {v2}, LF0/J;->H()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LF0/J;

    invoke-virtual {v5}, LF0/J;->m0()LF0/d0;

    move-result-object v5

    invoke-virtual {v5}, LF0/d0;->j2()LF0/U;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v5, v0}, LF0/T;->C1(Z)V

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LF0/O$a$b;->E:LF0/U;

    invoke-virtual {v0}, LF0/U;->q1()LD0/K;

    move-result-object v0

    invoke-interface {v0}, LD0/K;->k()V

    iget-object v0, p0, LF0/O$a$b;->D:LF0/O$a;

    invoke-virtual {v0}, LF0/O$a;->F()LF0/d0;

    move-result-object v0

    invoke-virtual {v0}, LF0/d0;->j2()LF0/U;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LF0/T;->y1()Z

    iget-object v0, p0, LF0/O$a$b;->F:LF0/O;

    invoke-static {v0}, LF0/O;->a(LF0/O;)LF0/J;

    move-result-object v0

    invoke-virtual {v0}, LF0/J;->H()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    move v3, v1

    :goto_2
    if-ge v3, v2, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LF0/J;

    invoke-virtual {v4}, LF0/J;->m0()LF0/d0;

    move-result-object v4

    invoke-virtual {v4}, LF0/d0;->j2()LF0/U;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v4, v1}, LF0/T;->C1(Z)V

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_3
    iget-object v0, p0, LF0/O$a$b;->D:LF0/O$a;

    invoke-static {v0}, LF0/O$a;->e1(LF0/O$a;)V

    iget-object v0, p0, LF0/O$a$b;->D:LF0/O$a;

    sget-object v1, LF0/O$a$b$b;->D:LF0/O$a$b$b;

    invoke-virtual {v0, v1}, LF0/O$a;->c0(Lx7/l;)V

    return-void
.end method

.method public bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LF0/O$a$b;->a()V

    sget-object v0, Li7/M;->a:Li7/M;

    return-object v0
.end method
