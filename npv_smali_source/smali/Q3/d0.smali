.class public final LQ3/d0;
.super LQ3/T;
.source "SourceFile"


# instance fields
.field private C:LQ3/c;

.field private final D:I


# direct methods
.method public constructor <init>(LQ3/c;I)V
    .locals 0

    invoke-direct {p0}, LQ3/T;-><init>()V

    iput-object p1, p0, LQ3/d0;->C:LQ3/c;

    iput p2, p0, LQ3/d0;->D:I

    return-void
.end method


# virtual methods
.method public final D3(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, LQ3/d0;->C:LQ3/c;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, LQ3/d0;->C:LQ3/c;

    iget v1, p0, LQ3/d0;->D:I

    invoke-virtual {v0, p1, p2, p3, v1}, LQ3/c;->N(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, LQ3/d0;->C:LQ3/c;

    return-void
.end method

.method public final l2(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    nop

    return-void
.end method

.method public final n1(ILandroid/os/IBinder;LQ3/h0;)V
    .locals 2

    iget-object v0, p0, LQ3/d0;->C:LQ3/c;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, LQ3/p;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p3}, LQ3/c;->c0(LQ3/c;LQ3/h0;)V

    iget-object p3, p3, LQ3/h0;->C:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, LQ3/d0;->D3(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method
