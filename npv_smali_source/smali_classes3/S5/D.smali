.class public final LS5/D;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS5/D$a;,
        LS5/D$b;
    }
.end annotation


# static fields
.field public static final f:LS5/D$b;


# instance fields
.field private final a:Lm7/i;

.field private b:Landroid/os/Messenger;

.field private c:Z

.field private final d:Ljava/util/concurrent/LinkedBlockingDeque;

.field private final e:LS5/D$d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS5/D$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS5/D$b;-><init>(Ly7/k;)V

    sput-object v0, LS5/D;->f:LS5/D$b;

    return-void
.end method

.method public constructor <init>(Lm7/i;)V
    .locals 1

    const-string v0, "backgroundDispatcher"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/D;->a:Lm7/i;

    new-instance p1, Ljava/util/concurrent/LinkedBlockingDeque;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>(I)V

    iput-object p1, p0, LS5/D;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    new-instance p1, LS5/D$d;

    invoke-direct {p1, p0}, LS5/D$d;-><init>(LS5/D;)V

    iput-object p1, p0, LS5/D;->e:LS5/D$d;

    return-void
.end method

.method public static final synthetic a(LS5/D;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, LS5/D;->j()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(LS5/D;Ljava/util/List;I)Landroid/os/Message;
    .locals 0

    invoke-direct {p0, p1, p2}, LS5/D;->l(Ljava/util/List;I)Landroid/os/Message;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LS5/D;)Ljava/util/concurrent/LinkedBlockingDeque;
    .locals 0

    iget-object p0, p0, LS5/D;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    return-object p0
.end method

.method public static final synthetic d(LS5/D;Ljava/util/List;)LW8/z0;
    .locals 0

    invoke-direct {p0, p1}, LS5/D;->o(Ljava/util/List;)LW8/z0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(LS5/D;Landroid/os/Message;)V
    .locals 0

    invoke-direct {p0, p1}, LS5/D;->p(Landroid/os/Message;)V

    return-void
.end method

.method public static final synthetic f(LS5/D;Landroid/os/Messenger;)V
    .locals 0

    iput-object p1, p0, LS5/D;->b:Landroid/os/Messenger;

    return-void
.end method

.method public static final synthetic g(LS5/D;Z)V
    .locals 0

    iput-boolean p1, p0, LS5/D;->c:Z

    return-void
.end method

.method private final j()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LS5/D;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/LinkedBlockingDeque;->drainTo(Ljava/util/Collection;)I

    return-object v0
.end method

.method private final l(Ljava/util/List;I)Landroid/os/Message;
    .locals 6

    .prologue
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Landroid/os/Message;

    iget v2, v2, Landroid/os/Message;->what:I

    if-ne v2, p2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    move-object p1, p2

    goto :goto_2

    :cond_3
    move-object v0, p2

    check-cast v0, Landroid/os/Message;

    invoke-virtual {v0}, Landroid/os/Message;->getWhen()J

    move-result-wide v0

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/os/Message;

    invoke-virtual {v3}, Landroid/os/Message;->getWhen()J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-gez v5, :cond_5

    move-object p2, v2

    move-wide v0, v3

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :goto_2
    check-cast p1, Landroid/os/Message;

    return-object p1
.end method

.method private final m(Landroid/os/Message;)V
    .locals 3

    .prologue
    iget-object v0, p0, LS5/D;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/LinkedBlockingDeque;->offer(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "SessionLifecycleClient"

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Queued message "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Queue size "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LS5/D;->d:Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-virtual {p1}, Ljava/util/concurrent/LinkedBlockingDeque;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    nop

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to enqueue message "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Dropping."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :goto_1
    return-void
.end method

.method private final n(I)V
    .locals 3

    invoke-direct {p0}, LS5/D;->j()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v1, p1, v2, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object p1

    const-string v1, "obtain(null, messageCode, 0, 0)"

    invoke-static {p1, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, v0}, LS5/D;->o(Ljava/util/List;)LW8/z0;

    return-void
.end method

.method private final o(Ljava/util/List;)LW8/z0;
    .locals 7

    iget-object v0, p0, LS5/D;->a:Lm7/i;

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, LS5/D$c;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LS5/D$c;-><init>(LS5/D;Ljava/util/List;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    move-result-object p1

    return-object p1
.end method

.method private final p(Landroid/os/Message;)V
    .locals 4

    .prologue
    const-string v0, "SessionLifecycleClient"

    iget-object v1, p0, LS5/D;->b:Landroid/os/Messenger;

    if-eqz v1, :cond_0

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending lifecycle "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " to service"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    nop

    iget-object v1, p0, LS5/D;->b:Landroid/os/Messenger;

    if-eqz v1, :cond_1

    invoke-virtual {v1, p1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to deliver message: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    nop

    :cond_0
    invoke-direct {p0, p1}, LS5/D;->m(Landroid/os/Message;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final h()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, LS5/D;->n(I)V

    return-void
.end method

.method public final i(LS5/F;)V
    .locals 3

    const-string v0, "sessionLifecycleServiceBinder"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Messenger;

    new-instance v1, LS5/D$a;

    iget-object v2, p0, LS5/D;->a:Lm7/i;

    invoke-direct {v1, v2}, LS5/D$a;-><init>(Lm7/i;)V

    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, LS5/D;->e:LS5/D$d;

    invoke-interface {p1, v0, v1}, LS5/F;->a(Landroid/os/Messenger;Landroid/content/ServiceConnection;)V

    return-void
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, LS5/D;->n(I)V

    return-void
.end method
