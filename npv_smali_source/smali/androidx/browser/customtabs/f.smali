.class public final Landroidx/browser/customtabs/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Ld/b;

.field private final c:Ld/a;

.field private final d:Landroid/content/ComponentName;

.field private final e:Landroid/app/PendingIntent;


# direct methods
.method constructor <init>(Ld/b;Ld/a;Landroid/content/ComponentName;Landroid/app/PendingIntent;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/browser/customtabs/f;->a:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/browser/customtabs/f;->b:Ld/b;

    iput-object p2, p0, Landroidx/browser/customtabs/f;->c:Ld/a;

    iput-object p3, p0, Landroidx/browser/customtabs/f;->d:Landroid/content/ComponentName;

    iput-object p4, p0, Landroidx/browser/customtabs/f;->e:Landroid/app/PendingIntent;

    return-void
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    iget-object v0, p0, Landroidx/browser/customtabs/f;->e:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    const-string v1, "android.support.customtabs.extra.SESSION_ID"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-void
.end method

.method private b(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 1

    .prologue
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    invoke-direct {p0, v0}, Landroidx/browser/customtabs/f;->a(Landroid/os/Bundle;)V

    return-object v0
.end method

.method private c(Landroid/net/Uri;)Landroid/os/Bundle;
    .locals 2

    .prologue
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    if-eqz p1, :cond_0

    const-string v1, "target_origin"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    iget-object p1, p0, Landroidx/browser/customtabs/f;->e:Landroid/app/PendingIntent;

    if-eqz p1, :cond_1

    invoke-direct {p0, v0}, Landroidx/browser/customtabs/f;->a(Landroid/os/Bundle;)V

    :cond_1
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    :cond_2
    return-object v0
.end method


# virtual methods
.method d()Landroid/os/IBinder;
    .locals 1

    iget-object v0, p0, Landroidx/browser/customtabs/f;->c:Ld/a;

    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    return-object v0
.end method

.method e()Landroid/content/ComponentName;
    .locals 1

    iget-object v0, p0, Landroidx/browser/customtabs/f;->d:Landroid/content/ComponentName;

    return-object v0
.end method

.method f()Landroid/app/PendingIntent;
    .locals 1

    iget-object v0, p0, Landroidx/browser/customtabs/f;->e:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public g(Ljava/lang/String;Landroid/os/Bundle;)I
    .locals 3

    .prologue
    invoke-direct {p0, p2}, Landroidx/browser/customtabs/f;->b(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    iget-object v0, p0, Landroidx/browser/customtabs/f;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/browser/customtabs/f;->b:Ld/b;

    iget-object v2, p0, Landroidx/browser/customtabs/f;->c:Ld/a;

    invoke-interface {v1, v2, p1, p2}, Ld/b;->a3(Ld/a;Ljava/lang/String;Landroid/os/Bundle;)I

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    monitor-exit v0

    const/4 p1, -0x2

    return p1

    :goto_0
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h(Landroid/net/Uri;)Z
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Landroidx/browser/customtabs/f;->i(Landroid/net/Uri;Landroid/net/Uri;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public i(Landroid/net/Uri;Landroid/net/Uri;Landroid/os/Bundle;)Z
    .locals 1

    .prologue
    :try_start_0
    invoke-direct {p0, p2}, Landroidx/browser/customtabs/f;->c(Landroid/net/Uri;)Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p3, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    iget-object p2, p0, Landroidx/browser/customtabs/f;->b:Ld/b;

    iget-object v0, p0, Landroidx/browser/customtabs/f;->c:Ld/a;

    invoke-interface {p2, v0, p1, p3}, Ld/b;->t3(Ld/a;Landroid/net/Uri;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_0
    iget-object p2, p0, Landroidx/browser/customtabs/f;->b:Ld/b;

    iget-object p3, p0, Landroidx/browser/customtabs/f;->c:Ld/a;

    invoke-interface {p2, p3, p1}, Ld/b;->o5(Ld/a;Landroid/net/Uri;)Z

    move-result p1
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
