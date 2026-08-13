.class final Lcom/android/billingclient/api/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/android/billingclient/api/w;


# direct methods
.method synthetic constructor <init>(Lcom/android/billingclient/api/w;LT2/o;)V
    .locals 0

    iput-object p1, p0, Lcom/android/billingclient/api/v;->a:Lcom/android/billingclient/api/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string p1, "BillingClientTesting"

    const-string v0, "Billing Override Service connected."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/c1;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/v;->a:Lcom/android/billingclient/api/w;

    invoke-static {p2}, Lcom/google/android/gms/internal/play_billing/i;->y0(Landroid/os/IBinder;)Lcom/google/android/gms/internal/play_billing/j;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/w;->W0(Lcom/android/billingclient/api/w;Lcom/google/android/gms/internal/play_billing/j;)V

    iget-object p1, p0, Lcom/android/billingclient/api/v;->a:Lcom/android/billingclient/api/w;

    const/4 p2, 0x2

    invoke-static {p1, p2}, Lcom/android/billingclient/api/w;->X0(Lcom/android/billingclient/api/w;I)V

    iget-object p1, p0, Lcom/android/billingclient/api/v;->a:Lcom/android/billingclient/api/w;

    const/16 p2, 0x1a

    invoke-static {p1, p2}, Lcom/android/billingclient/api/w;->K0(Lcom/android/billingclient/api/w;I)V

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string p1, "BillingClientTesting"

    const-string v0, "Billing Override Service disconnected."

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/play_billing/c1;->j(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/android/billingclient/api/v;->a:Lcom/android/billingclient/api/w;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/w;->W0(Lcom/android/billingclient/api/w;Lcom/google/android/gms/internal/play_billing/j;)V

    iget-object p1, p0, Lcom/android/billingclient/api/v;->a:Lcom/android/billingclient/api/w;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/android/billingclient/api/w;->X0(Lcom/android/billingclient/api/w;I)V

    return-void
.end method
