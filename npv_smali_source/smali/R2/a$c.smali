.class LR2/a$c;
.super LR2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR2/a;->c(Ljava/lang/String;LJ2/j;Z)LR2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic D:LJ2/j;

.field final synthetic E:Ljava/lang/String;

.field final synthetic F:Z


# direct methods
.method constructor <init>(LJ2/j;Ljava/lang/String;Z)V
    .locals 0

    iput-object p1, p0, LR2/a$c;->D:LJ2/j;

    iput-object p2, p0, LR2/a$c;->E:Ljava/lang/String;

    iput-boolean p3, p0, LR2/a$c;->F:Z

    invoke-direct {p0}, LR2/a;-><init>()V

    return-void
.end method


# virtual methods
.method h()V
    .locals 4

    .prologue
    iget-object v0, p0, LR2/a$c;->D:LJ2/j;

    invoke-virtual {v0}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->Y()LQ2/q;

    move-result-object v1

    iget-object v2, p0, LR2/a$c;->E:Ljava/lang/String;

    invoke-interface {v1, v2}, LQ2/q;->l(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, LR2/a$c;->D:LJ2/j;

    invoke-virtual {p0, v3, v2}, LR2/a;->a(LJ2/j;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lo2/n;->n()V

    iget-boolean v0, p0, LR2/a$c;->F:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LR2/a$c;->D:LJ2/j;

    invoke-virtual {p0, v0}, LR2/a;->g(LJ2/j;)V

    :cond_1
    return-void

    :goto_1
    invoke-virtual {v0}, Lo2/n;->n()V

    throw v1
.end method
