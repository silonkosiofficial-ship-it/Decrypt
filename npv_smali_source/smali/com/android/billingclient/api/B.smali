.class final Lcom/android/billingclient/api/B;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:LW2/h;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-static {p1}, LY2/u;->f(Landroid/content/Context;)V

    invoke-static {}, LY2/u;->c()LY2/u;

    move-result-object p1

    sget-object v0, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    invoke-virtual {p1, v0}, LY2/u;->g(LY2/f;)LW2/i;

    move-result-object p1

    const-string v0, "PLAY_BILLING_LIBRARY"

    const-class v1, Lcom/google/android/gms/internal/play_billing/A4;

    const-string v2, "proto"

    invoke-static {v2}, LW2/b;->b(Ljava/lang/String;)LW2/b;

    move-result-object v2

    new-instance v3, LT2/t;

    invoke-direct {v3}, LT2/t;-><init>()V

    invoke-interface {p1, v0, v1, v2, v3}, LW2/i;->a(Ljava/lang/String;Ljava/lang/Class;LW2/b;LW2/g;)LW2/h;

    move-result-object p1

    iput-object p1, p0, Lcom/android/billingclient/api/B;->b:LW2/h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/android/billingclient/api/B;->a:Z

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/play_billing/A4;)V
    .locals 2

    .prologue
    iget-boolean v0, p0, Lcom/android/billingclient/api/B;->a:Z

    const-string v1, "BillingLogger"

    if-eqz v0, :cond_0

    const-string p1, "Skipping logging since initialization failed."

    :goto_0
    invoke-static {v1, p1}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/android/billingclient/api/B;->b:LW2/h;

    invoke-static {p1}, LW2/c;->f(Ljava/lang/Object;)LW2/c;

    move-result-object p1

    invoke-interface {v0, p1}, LW2/h;->a(LW2/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    const-string p1, "logging failed."

    goto :goto_0
.end method
