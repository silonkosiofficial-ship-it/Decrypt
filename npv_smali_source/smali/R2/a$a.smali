.class LR2/a$a;
.super LR2/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LR2/a;->b(Ljava/util/UUID;LJ2/j;)LR2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic D:LJ2/j;

.field final synthetic E:Ljava/util/UUID;


# direct methods
.method constructor <init>(LJ2/j;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, LR2/a$a;->D:LJ2/j;

    iput-object p2, p0, LR2/a$a;->E:Ljava/util/UUID;

    invoke-direct {p0}, LR2/a;-><init>()V

    return-void
.end method


# virtual methods
.method h()V
    .locals 3

    .prologue
    iget-object v0, p0, LR2/a$a;->D:LJ2/j;

    invoke-virtual {v0}, LJ2/j;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lo2/n;->g()V

    :try_start_0
    iget-object v1, p0, LR2/a$a;->D:LJ2/j;

    iget-object v2, p0, LR2/a$a;->E:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, LR2/a;->a(LJ2/j;Ljava/lang/String;)V

    invoke-virtual {v0}, Lo2/n;->N()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lo2/n;->n()V

    iget-object v0, p0, LR2/a$a;->D:LJ2/j;

    invoke-virtual {p0, v0}, LR2/a;->g(LJ2/j;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lo2/n;->n()V

    throw v1
.end method
