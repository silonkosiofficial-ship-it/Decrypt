.class final Lcom/android/billingclient/api/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/play_billing/m1;


# instance fields
.field final synthetic a:Ljava/util/function/Consumer;

.field final synthetic b:Ljava/lang/Runnable;

.field final synthetic c:Lcom/android/billingclient/api/w;

.field final synthetic d:I


# direct methods
.method constructor <init>(Lcom/android/billingclient/api/w;ILjava/util/function/Consumer;Ljava/lang/Runnable;)V
    .locals 0

    iput p2, p0, Lcom/android/billingclient/api/t;->d:I

    iput-object p3, p0, Lcom/android/billingclient/api/t;->a:Ljava/util/function/Consumer;

    iput-object p4, p0, Lcom/android/billingclient/api/t;->b:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/android/billingclient/api/t;->c:Lcom/android/billingclient/api/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 5

    .prologue
    instance-of v0, p1, Ljava/util/concurrent/TimeoutException;

    const-string v1, "BillingClientTesting"

    const/16 v2, 0x1c

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/android/billingclient/api/t;->c:Lcom/android/billingclient/api/w;

    const/16 v3, 0x72

    sget-object v4, Lcom/android/billingclient/api/z;->G:Lcom/android/billingclient/api/d;

    invoke-static {v0, v3, v2, v4}, Lcom/android/billingclient/api/w;->J0(Lcom/android/billingclient/api/w;IILcom/android/billingclient/api/d;)V

    const-string v0, "Asynchronous call to Billing Override Service timed out."

    :goto_0
    invoke-static {v1, v0, p1}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/android/billingclient/api/t;->c:Lcom/android/billingclient/api/w;

    const/16 v3, 0x6b

    sget-object v4, Lcom/android/billingclient/api/z;->G:Lcom/android/billingclient/api/d;

    invoke-static {v0, v3, v2, v4}, Lcom/android/billingclient/api/w;->J0(Lcom/android/billingclient/api/w;IILcom/android/billingclient/api/d;)V

    const-string v0, "An error occurred while retrieving billing override."

    goto :goto_0

    :goto_1
    iget-object p1, p0, Lcom/android/billingclient/api/t;->b:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public final bridge synthetic c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lcom/android/billingclient/api/t;->c:Lcom/android/billingclient/api/w;

    invoke-static {v1, v0}, Lcom/android/billingclient/api/w;->F0(Lcom/android/billingclient/api/w;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/android/billingclient/api/t;->d:I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v1, v0, p1}, Lcom/android/billingclient/api/w;->H0(Lcom/android/billingclient/api/w;II)Lcom/android/billingclient/api/d;

    move-result-object p1

    iget-object v0, p0, Lcom/android/billingclient/api/t;->a:Ljava/util/function/Consumer;

    invoke-interface {v0, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/android/billingclient/api/t;->b:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
