.class LO2/f$b;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LO2/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:LO2/f;


# direct methods
.method constructor <init>(LO2/f;)V
    .locals 0

    iput-object p1, p0, LO2/f$b;->a:LO2/f;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 4

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p1

    sget-object v0, LO2/f;->j:Ljava/lang/String;

    const-string v1, "Network capabilities changed: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-array v1, v3, [Ljava/lang/Throwable;

    invoke-virtual {p1, v0, p2, v1}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object p1, p0, LO2/f$b;->a:LO2/f;

    invoke-virtual {p1}, LO2/f;->g()LM2/b;

    move-result-object p2

    invoke-virtual {p1, p2}, LO2/d;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 3

    invoke-static {}, LI2/j;->c()LI2/j;

    move-result-object p1

    sget-object v0, LO2/f;->j:Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Throwable;

    const-string v2, "Network connection lost"

    invoke-virtual {p1, v0, v2, v1}, LI2/j;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    iget-object p1, p0, LO2/f$b;->a:LO2/f;

    invoke-virtual {p1}, LO2/f;->g()LM2/b;

    move-result-object v0

    invoke-virtual {p1, v0}, LO2/d;->d(Ljava/lang/Object;)V

    return-void
.end method
