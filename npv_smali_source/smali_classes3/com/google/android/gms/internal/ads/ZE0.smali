.class public final Lcom/google/android/gms/internal/ads/ZE0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/ZE0;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/D;Lcom/google/android/gms/internal/ads/vS;)Lcom/google/android/gms/internal/ads/vE0;
    .locals 6

    .prologue
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lcom/google/android/gms/internal/ads/EW;->a:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_b

    iget v1, p1, Lcom/google/android/gms/internal/ads/D;->E:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto/16 :goto_7

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZE0;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/ZE0;->b:Ljava/lang/Boolean;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    goto :goto_3

    :cond_1
    if-eqz v1, :cond_3

    const-string v2, "audio"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/media/AudioManager;

    if-eqz v1, :cond_3

    const-string v2, "offloadVariableRateSupported"

    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v2, "offloadVariableRateSupported=1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v4

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/internal/ads/ZE0;->b:Ljava/lang/Boolean;

    goto :goto_2

    :cond_3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_1

    :goto_2
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/ZE0;->b:Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_3
    iget-object v2, p1, Lcom/google/android/gms/internal/ads/D;->o:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, p1, Lcom/google/android/gms/internal/ads/D;->k:Ljava/lang/String;

    invoke-static {v2, v5}, Lcom/google/android/gms/internal/ads/ed;->a(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_a

    invoke-static {v2}, Lcom/google/android/gms/internal/ads/EW;->z(I)I

    move-result v5

    if-ge v0, v5, :cond_4

    goto :goto_6

    :cond_4
    iget v5, p1, Lcom/google/android/gms/internal/ads/D;->D:I

    invoke-static {v5}, Lcom/google/android/gms/internal/ads/EW;->A(I)I

    move-result v5

    if-nez v5, :cond_5

    sget-object p1, Lcom/google/android/gms/internal/ads/vE0;->d:Lcom/google/android/gms/internal/ads/vE0;

    return-object p1

    :cond_5
    :try_start_0
    iget p1, p1, Lcom/google/android/gms/internal/ads/D;->E:I

    invoke-static {p1, v5, v2}, Lcom/google/android/gms/internal/ads/EW;->P(III)Landroid/media/AudioFormat;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v2, 0x1f

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/vS;->a()Lcom/google/android/gms/internal/ads/jr;

    move-result-object p2

    iget-object p2, p2, Lcom/google/android/gms/internal/ads/jr;->a:Landroid/media/AudioAttributes;

    if-lt v0, v2, :cond_8

    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/XE0;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p1

    if-nez p1, :cond_6

    :goto_4
    sget-object p1, Lcom/google/android/gms/internal/ads/vE0;->d:Lcom/google/android/gms/internal/ads/vE0;

    goto :goto_5

    :cond_6
    new-instance p2, Lcom/google/android/gms/internal/ads/tE0;

    invoke-direct {p2}, Lcom/google/android/gms/internal/ads/tE0;-><init>()V

    const/16 v2, 0x20

    if-le v0, v2, :cond_7

    const/4 v0, 0x2

    if-ne p1, v0, :cond_7

    move v3, v4

    :cond_7
    invoke-virtual {p2, v4}, Lcom/google/android/gms/internal/ads/tE0;->a(Z)Lcom/google/android/gms/internal/ads/tE0;

    invoke-virtual {p2, v3}, Lcom/google/android/gms/internal/ads/tE0;->b(Z)Lcom/google/android/gms/internal/ads/tE0;

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/ads/tE0;->c(Z)Lcom/google/android/gms/internal/ads/tE0;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/tE0;->d()Lcom/google/android/gms/internal/ads/vE0;

    move-result-object p1

    goto :goto_5

    :cond_8
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/ads/YE0;->a(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result p1

    if-nez p1, :cond_9

    goto :goto_4

    :cond_9
    new-instance p1, Lcom/google/android/gms/internal/ads/tE0;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/tE0;-><init>()V

    invoke-virtual {p1, v4}, Lcom/google/android/gms/internal/ads/tE0;->a(Z)Lcom/google/android/gms/internal/ads/tE0;

    invoke-virtual {p1, v1}, Lcom/google/android/gms/internal/ads/tE0;->c(Z)Lcom/google/android/gms/internal/ads/tE0;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/tE0;->d()Lcom/google/android/gms/internal/ads/vE0;

    move-result-object p1

    :goto_5
    return-object p1

    :catch_0
    sget-object p1, Lcom/google/android/gms/internal/ads/vE0;->d:Lcom/google/android/gms/internal/ads/vE0;

    return-object p1

    :cond_a
    :goto_6
    sget-object p1, Lcom/google/android/gms/internal/ads/vE0;->d:Lcom/google/android/gms/internal/ads/vE0;

    return-object p1

    :cond_b
    :goto_7
    sget-object p1, Lcom/google/android/gms/internal/ads/vE0;->d:Lcom/google/android/gms/internal/ads/vE0;

    return-object p1
.end method
