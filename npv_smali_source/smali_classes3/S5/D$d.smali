.class public final LS5/D$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LS5/D;-><init>(Lm7/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LS5/D;


# direct methods
.method constructor <init>(LS5/D;)V
    .locals 0

    iput-object p1, p0, LS5/D$d;->a:LS5/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Connected to SessionLifecycleService. Queue size "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, LS5/D$d;->a:LS5/D;

    invoke-static {v0}, LS5/D;->c(LS5/D;)Ljava/util/concurrent/LinkedBlockingDeque;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingDeque;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SessionLifecycleClient"

    nop

    iget-object p1, p0, LS5/D$d;->a:LS5/D;

    new-instance v0, Landroid/os/Messenger;

    invoke-direct {v0, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    invoke-static {p1, v0}, LS5/D;->f(LS5/D;Landroid/os/Messenger;)V

    iget-object p1, p0, LS5/D$d;->a:LS5/D;

    const/4 p2, 0x1

    invoke-static {p1, p2}, LS5/D;->g(LS5/D;Z)V

    iget-object p1, p0, LS5/D$d;->a:LS5/D;

    invoke-static {p1}, LS5/D;->a(LS5/D;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2}, LS5/D;->d(LS5/D;Ljava/util/List;)LW8/z0;

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "SessionLifecycleClient"

    const-string v0, "Disconnected from SessionLifecycleService"

    nop

    iget-object p1, p0, LS5/D$d;->a:LS5/D;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LS5/D;->f(LS5/D;Landroid/os/Messenger;)V

    iget-object p1, p0, LS5/D$d;->a:LS5/D;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LS5/D;->g(LS5/D;Z)V

    return-void
.end method
