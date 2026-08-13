.class public abstract synthetic Lcom/android/billingclient/api/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/android/billingclient/api/y;->a:I

    return-void
.end method

.method public static a(Ljava/lang/Exception;)Ljava/lang/String;
    .locals 3

    .prologue
    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/play_billing/u;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget v1, Lcom/google/android/gms/internal/play_billing/c1;->a:I

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x28

    if-le v1, v2, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_1
    :goto_0
    return-object p0

    :goto_1
    const-string v1, "BillingLogger"

    const-string v2, "Unable to get truncated exception info"

    invoke-static {v1, v2, p0}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static b(IILcom/android/billingclient/api/d;)Lcom/google/android/gms/internal/play_billing/N3;
    .locals 3

    .prologue
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N3;->E()Lcom/google/android/gms/internal/play_billing/L3;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/X3;->F()Lcom/google/android/gms/internal/play_billing/T3;

    move-result-object v1

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/play_billing/T3;->t(I)Lcom/google/android/gms/internal/play_billing/T3;

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/play_billing/T3;->r(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/T3;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/play_billing/T3;->u(I)Lcom/google/android/gms/internal/play_billing/T3;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/L3;->q(Lcom/google/android/gms/internal/play_billing/T3;)Lcom/google/android/gms/internal/play_billing/L3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/L3;->r(I)Lcom/google/android/gms/internal/play_billing/L3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/N3;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string p1, "BillingLogger"

    const-string p2, "Unable to create logging payload"

    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static c(IILcom/android/billingclient/api/d;Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/N3;
    .locals 2

    .prologue
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/X3;->F()Lcom/google/android/gms/internal/play_billing/T3;

    move-result-object v0

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/T3;->t(I)Lcom/google/android/gms/internal/play_billing/T3;

    invoke-virtual {p2}, Lcom/android/billingclient/api/d;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/play_billing/T3;->r(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/T3;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/T3;->u(I)Lcom/google/android/gms/internal/play_billing/T3;

    if-eqz p3, :cond_0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/play_billing/T3;->q(Ljava/lang/String;)Lcom/google/android/gms/internal/play_billing/T3;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/N3;->E()Lcom/google/android/gms/internal/play_billing/L3;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/play_billing/L3;->q(Lcom/google/android/gms/internal/play_billing/T3;)Lcom/google/android/gms/internal/play_billing/L3;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/play_billing/L3;->r(I)Lcom/google/android/gms/internal/play_billing/L3;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/N3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :goto_1
    const-string p1, "BillingLogger"

    const-string p2, "Unable to create logging payload"

    invoke-static {p1, p2, p0}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(I)Lcom/google/android/gms/internal/play_billing/S3;
    .locals 2

    .prologue
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/play_billing/S3;->D()Lcom/google/android/gms/internal/play_billing/Q3;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/play_billing/Q3;->r(I)Lcom/google/android/gms/internal/play_billing/Q3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/J2;->l()Lcom/google/android/gms/internal/play_billing/L2;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/play_billing/S3;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "BillingLogger"

    const-string v1, "Unable to create logging payload"

    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/play_billing/c1;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method
