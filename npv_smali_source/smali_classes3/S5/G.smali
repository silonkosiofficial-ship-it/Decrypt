.class public final LS5/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LS5/F;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS5/G$a;
    }
.end annotation


# static fields
.field private static final b:LS5/G$a;


# instance fields
.field private final a:LQ4/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS5/G$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS5/G$a;-><init>(Ly7/k;)V

    sput-object v0, LS5/G;->b:LS5/G$a;

    return-void
.end method

.method public constructor <init>(LQ4/f;)V
    .locals 1

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/G;->a:LQ4/f;

    return-void
.end method

.method private final b(Landroid/content/Context;Landroid/content/ServiceConnection;)Ljava/lang/Object;
    .locals 1

    .prologue
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    sget-object p1, Li7/M;->a:Li7/M;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "LifecycleServiceBinder"

    const-string v0, "Session lifecycle service binding failed."

    nop

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :goto_0
    return-object p1
.end method


# virtual methods
.method public a(Landroid/os/Messenger;Landroid/content/ServiceConnection;)V
    .locals 4

    .prologue
    const-string v0, "callback"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceConnection"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LS5/G;->a:LQ4/f;

    invoke-virtual {v0}, LQ4/f;->k()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "firebaseApp.applicationContext.applicationContext"

    invoke-static {v0, v1}, Ly7/t;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/google/firebase/sessions/SessionLifecycleService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "Binding service to application."

    const-string v3, "LifecycleServiceBinder"

    nop

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "ClientCallbackMessenger"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const/16 p1, 0x41

    :try_start_0
    invoke-virtual {v0, v1, p2, p1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to bind session lifecycle service to application."

    nop

    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_0

    invoke-direct {p0, v0, p2}, LS5/G;->b(Landroid/content/Context;Landroid/content/ServiceConnection;)Ljava/lang/Object;

    const-string p1, "Session lifecycle service binding failed."

    nop

    :cond_0
    return-void
.end method
