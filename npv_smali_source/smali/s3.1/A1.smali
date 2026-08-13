.class final Ls3/A1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic C:Ls3/B1;


# direct methods
.method constructor <init>(Ls3/B1;)V
    .locals 0

    iput-object p1, p0, Ls3/A1;->C:Ls3/B1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/A1;->C:Ls3/B1;

    invoke-static {v0}, Ls3/B1;->o6(Ls3/B1;)Ls3/H;

    move-result-object v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-static {v0}, Ls3/B1;->o6(Ls3/B1;)Ls3/H;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ls3/H;->F(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not notify onAdFailedToLoad event."

    invoke-static {v1, v0}, Lw3/p;->h(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
