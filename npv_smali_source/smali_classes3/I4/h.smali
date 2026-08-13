.class final LI4/h;
.super LK4/y;
.source "SourceFile"


# instance fields
.field final synthetic D:[B

.field final synthetic E:Ljava/lang/Long;

.field final synthetic F:Ll4/m;

.field final synthetic G:LI4/d;

.field final synthetic H:LI4/k;


# direct methods
.method constructor <init>(LI4/k;Ll4/m;[BLjava/lang/Long;Landroid/os/Parcelable;Ll4/m;LI4/d;)V
    .locals 0

    iput-object p1, p0, LI4/h;->H:LI4/k;

    iput-object p3, p0, LI4/h;->D:[B

    iput-object p4, p0, LI4/h;->E:Ljava/lang/Long;

    iput-object p6, p0, LI4/h;->F:Ll4/m;

    iput-object p7, p0, LI4/h;->G:LI4/d;

    invoke-direct {p0, p2}, LK4/y;-><init>(Ll4/m;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;)V
    .locals 2

    .prologue
    instance-of v0, p1, LK4/e;

    if-eqz v0, :cond_0

    new-instance v0, LI4/c;

    const/16 v1, -0x9

    invoke-direct {v0, v1, p1}, LI4/c;-><init>(ILjava/lang/Throwable;)V

    invoke-super {p0, v0}, LK4/y;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, LK4/y;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method protected final b()V
    .locals 5

    .prologue
    :try_start_0
    iget-object v0, p0, LI4/h;->H:LI4/k;

    iget-object v0, v0, LI4/k;->c:LK4/d;

    invoke-virtual {v0}, LK4/d;->e()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, LK4/u;

    iget-object v1, p0, LI4/h;->H:LI4/k;

    iget-object v2, p0, LI4/h;->D:[B

    iget-object v3, p0, LI4/h;->E:Ljava/lang/Long;

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, LI4/k;->a(LI4/k;[BLjava/lang/Long;Landroid/os/Parcelable;)Landroid/os/Bundle;

    move-result-object v1

    new-instance v2, LI4/j;

    iget-object v3, p0, LI4/h;->H:LI4/k;

    iget-object v4, p0, LI4/h;->F:Ll4/m;

    invoke-direct {v2, v3, v4}, LI4/j;-><init>(LI4/k;Ll4/m;)V

    invoke-interface {v0, v1, v2}, LK4/u;->K2(Landroid/os/Bundle;LK4/w;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, LI4/h;->H:LI4/k;

    invoke-static {v1}, LI4/k;->c(LI4/k;)LK4/x;

    move-result-object v1

    iget-object v2, p0, LI4/h;->G:LI4/d;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v2, v3, v4

    const-string v2, "requestIntegrityToken(%s)"

    invoke-virtual {v1, v0, v2, v3}, LK4/x;->b(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, LI4/h;->F:Ll4/m;

    new-instance v2, LI4/c;

    const/16 v3, -0x64

    invoke-direct {v2, v3, v0}, LI4/c;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Ll4/m;->d(Ljava/lang/Exception;)Z

    return-void
.end method
