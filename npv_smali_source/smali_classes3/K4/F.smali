.class final LK4/F;
.super LK4/y;
.source "SourceFile"


# instance fields
.field final synthetic D:Landroid/os/IBinder;

.field final synthetic E:LK4/c;


# direct methods
.method constructor <init>(LK4/c;Landroid/os/IBinder;)V
    .locals 0

    iput-object p1, p0, LK4/F;->E:LK4/c;

    iput-object p2, p0, LK4/F;->D:Landroid/os/IBinder;

    invoke-direct {p0}, LK4/y;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .prologue
    iget-object v0, p0, LK4/F;->E:LK4/c;

    iget-object v0, v0, LK4/c;->a:LK4/d;

    invoke-static {v0}, LK4/d;->g(LK4/d;)LK4/E;

    move-result-object v1

    iget-object v2, p0, LK4/F;->D:Landroid/os/IBinder;

    invoke-interface {v1, v2}, LK4/E;->a(Landroid/os/IBinder;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/os/IInterface;

    invoke-static {v0, v1}, LK4/d;->n(LK4/d;Landroid/os/IInterface;)V

    iget-object v0, p0, LK4/F;->E:LK4/c;

    iget-object v0, v0, LK4/c;->a:LK4/d;

    invoke-static {v0}, LK4/d;->r(LK4/d;)V

    iget-object v0, p0, LK4/F;->E:LK4/c;

    iget-object v0, v0, LK4/c;->a:LK4/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LK4/d;->m(LK4/d;Z)V

    iget-object v0, p0, LK4/F;->E:LK4/c;

    iget-object v0, v0, LK4/c;->a:LK4/d;

    invoke-static {v0}, LK4/d;->i(LK4/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LK4/F;->E:LK4/c;

    iget-object v0, v0, LK4/c;->a:LK4/d;

    invoke-static {v0}, LK4/d;->i(LK4/d;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method
