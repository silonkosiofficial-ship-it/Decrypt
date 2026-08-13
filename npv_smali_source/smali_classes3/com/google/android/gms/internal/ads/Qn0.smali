.class public final Lcom/google/android/gms/internal/ads/Qn0;
.super Lcom/google/android/gms/internal/ads/bm0;
.source "SourceFile"


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Vn0;

.field private final b:Lcom/google/android/gms/internal/ads/Mu0;

.field private final c:Lcom/google/android/gms/internal/ads/Lu0;

.field private final d:Ljava/lang/Integer;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ads/Vn0;Lcom/google/android/gms/internal/ads/Mu0;Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/bm0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Qn0;->a:Lcom/google/android/gms/internal/ads/Vn0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Qn0;->b:Lcom/google/android/gms/internal/ads/Mu0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Qn0;->c:Lcom/google/android/gms/internal/ads/Lu0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Qn0;->d:Ljava/lang/Integer;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/Vn0;Lcom/google/android/gms/internal/ads/Mu0;Ljava/lang/Integer;)Lcom/google/android/gms/internal/ads/Qn0;
    .locals 3

    .prologue
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Vn0;->c()Lcom/google/android/gms/internal/ads/Un0;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/Un0;->c:Lcom/google/android/gms/internal/ads/Un0;

    if-eq v0, v1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Vn0;->c()Lcom/google/android/gms/internal/ads/Un0;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "For given Variant "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " the value of idRequirement must be non-null"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Vn0;->c()Lcom/google/android/gms/internal/ads/Un0;

    move-result-object v0

    if-ne v0, v1, :cond_3

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "For given Variant NO_PREFIX the value of idRequirement must be null"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Mu0;->a()I

    move-result v0

    const/16 v2, 0x20

    if-ne v0, v2, :cond_6

    new-instance v0, Lcom/google/android/gms/internal/ads/Qn0;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Vn0;->c()Lcom/google/android/gms/internal/ads/Un0;

    move-result-object v2

    if-ne v2, v1, :cond_4

    sget-object v1, Lcom/google/android/gms/internal/ads/aq0;->a:Lcom/google/android/gms/internal/ads/Lu0;

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Vn0;->c()Lcom/google/android/gms/internal/ads/Un0;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/ads/Un0;->b:Lcom/google/android/gms/internal/ads/Un0;

    if-ne v1, v2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/aq0;->b(I)Lcom/google/android/gms/internal/ads/Lu0;

    move-result-object v1

    :goto_2
    invoke-direct {v0, p0, p1, v1, p2}, Lcom/google/android/gms/internal/ads/Qn0;-><init>(Lcom/google/android/gms/internal/ads/Vn0;Lcom/google/android/gms/internal/ads/Mu0;Lcom/google/android/gms/internal/ads/Lu0;Ljava/lang/Integer;)V

    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Vn0;->c()Lcom/google/android/gms/internal/ads/Un0;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p2, "Unknown Variant: "

    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Mu0;->a()I

    move-result p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "XAesGcmKey key must be constructed with key of length 32 bytes, not "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/ads/Vn0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qn0;->a:Lcom/google/android/gms/internal/ads/Vn0;

    return-object v0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/Lu0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qn0;->c:Lcom/google/android/gms/internal/ads/Lu0;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/ads/Mu0;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qn0;->b:Lcom/google/android/gms/internal/ads/Mu0;

    return-object v0
.end method

.method public final e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Qn0;->d:Ljava/lang/Integer;

    return-object v0
.end method
