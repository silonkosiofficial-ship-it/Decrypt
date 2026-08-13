.class public final Lcom/google/android/gms/internal/ads/xn0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/zn0;

.field private b:Ljava/lang/String;

.field private c:Lcom/google/android/gms/internal/ads/yn0;

.field private d:Lcom/google/android/gms/internal/ads/cm0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/An0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/cm0;)Lcom/google/android/gms/internal/ads/xn0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xn0;->d:Lcom/google/android/gms/internal/ads/cm0;

    return-object p0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/yn0;)Lcom/google/android/gms/internal/ads/xn0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xn0;->c:Lcom/google/android/gms/internal/ads/yn0;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/xn0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xn0;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final d(Lcom/google/android/gms/internal/ads/zn0;)Lcom/google/android/gms/internal/ads/xn0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/xn0;->a:Lcom/google/android/gms/internal/ads/zn0;

    return-object p0
.end method

.method public final e()Lcom/google/android/gms/internal/ads/Bn0;
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xn0;->a:Lcom/google/android/gms/internal/ads/zn0;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ads/zn0;->c:Lcom/google/android/gms/internal/ads/zn0;

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/xn0;->a:Lcom/google/android/gms/internal/ads/zn0;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xn0;->b:Ljava/lang/String;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/xn0;->c:Lcom/google/android/gms/internal/ads/yn0;

    if-eqz v0, :cond_a

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xn0;->d:Lcom/google/android/gms/internal/ads/cm0;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/Sl0;->a()Z

    move-result v2

    if-nez v2, :cond_8

    sget-object v2, Lcom/google/android/gms/internal/ads/yn0;->b:Lcom/google/android/gms/internal/ads/yn0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    instance-of v2, v1, Lcom/google/android/gms/internal/ads/Pm0;

    if-nez v2, :cond_6

    :cond_1
    sget-object v2, Lcom/google/android/gms/internal/ads/yn0;->d:Lcom/google/android/gms/internal/ads/yn0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    instance-of v2, v1, Lcom/google/android/gms/internal/ads/gn0;

    if-nez v2, :cond_6

    :cond_2
    sget-object v2, Lcom/google/android/gms/internal/ads/yn0;->c:Lcom/google/android/gms/internal/ads/yn0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, Lcom/google/android/gms/internal/ads/co0;

    if-nez v2, :cond_6

    :cond_3
    sget-object v2, Lcom/google/android/gms/internal/ads/yn0;->e:Lcom/google/android/gms/internal/ads/yn0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    instance-of v2, v1, Lcom/google/android/gms/internal/ads/tm0;

    if-nez v2, :cond_6

    :cond_4
    sget-object v2, Lcom/google/android/gms/internal/ads/yn0;->f:Lcom/google/android/gms/internal/ads/yn0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    instance-of v2, v1, Lcom/google/android/gms/internal/ads/Dm0;

    if-nez v2, :cond_6

    :cond_5
    sget-object v2, Lcom/google/android/gms/internal/ads/yn0;->g:Lcom/google/android/gms/internal/ads/yn0;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    instance-of v0, v1, Lcom/google/android/gms/internal/ads/an0;

    if-eqz v0, :cond_7

    :cond_6
    new-instance v0, Lcom/google/android/gms/internal/ads/Bn0;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/xn0;->a:Lcom/google/android/gms/internal/ads/zn0;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/xn0;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/xn0;->c:Lcom/google/android/gms/internal/ads/yn0;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/xn0;->d:Lcom/google/android/gms/internal/ads/cm0;

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/Bn0;-><init>(Lcom/google/android/gms/internal/ads/zn0;Ljava/lang/String;Lcom/google/android/gms/internal/ads/yn0;Lcom/google/android/gms/internal/ads/cm0;Lcom/google/android/gms/internal/ads/An0;)V

    return-object v0

    :cond_7
    new-instance v0, Ljava/security/GeneralSecurityException;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/xn0;->c:Lcom/google/android/gms/internal/ads/yn0;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/yn0;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/xn0;->d:Lcom/google/android/gms/internal/ads/cm0;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Cannot use parsing strategy "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " when new keys are picked according to "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParametersForNewKeys must not have ID Requirements"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParametersForNewKeys must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "dekParsingStrategy must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "kekUri must be set"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
