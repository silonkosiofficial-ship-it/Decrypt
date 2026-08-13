.class final Lcom/google/android/gms/internal/ads/em0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ul0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/vq0;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/vq0;Lcom/google/android/gms/internal/ads/fm0;)V
    .locals 2

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/em0;->a:Lcom/google/android/gms/internal/ads/vq0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/vq0;->g()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/ads/Up0;->b()Lcom/google/android/gms/internal/ads/Up0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/Up0;->a()Lcom/google/android/gms/internal/ads/Ep0;

    move-result-object p2

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/Lp0;->a(Lcom/google/android/gms/internal/ads/vq0;)Lcom/google/android/gms/internal/ads/Ip0;

    move-result-object p1

    const-string v0, "encrypt"

    const-string v1, "aead"

    invoke-interface {p2, p1, v1, v0}, Lcom/google/android/gms/internal/ads/Ep0;->a(Lcom/google/android/gms/internal/ads/Ip0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Dp0;

    const-string v0, "decrypt"

    invoke-interface {p2, p1, v1, v0}, Lcom/google/android/gms/internal/ads/Ep0;->a(Lcom/google/android/gms/internal/ads/Ip0;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Dp0;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 3

    .prologue
    array-length v0, p1

    const/4 v1, 0x5

    if-le v0, v1, :cond_0

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/em0;->a:Lcom/google/android/gms/internal/ads/vq0;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/vq0;->f([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/tq0;

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/tq0;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/ul0;

    invoke-interface {v2, p1, p2}, Lcom/google/android/gms/internal/ads/ul0;->a([B[B)[B

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/tq0;->a()I
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/em0;->a:Lcom/google/android/gms/internal/ads/vq0;

    sget-object v1, Lcom/google/android/gms/internal/ads/zl0;->a:[B

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/vq0;->f([B)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/tq0;

    :try_start_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/tq0;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/ul0;

    invoke-interface {v2, p1, p2}, Lcom/google/android/gms/internal/ads/ul0;->a([B[B)[B

    move-result-object v2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/tq0;->a()I
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v2

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "decryption failed"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
