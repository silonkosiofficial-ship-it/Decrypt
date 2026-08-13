.class public final Lcom/google/android/gms/internal/ads/Jm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Oh0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Ts0;

.field private b:Lcom/google/android/gms/internal/ads/Pv0;

.field private c:Ljava/lang/String;

.field private d:I

.field private e:I

.field private f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/Ts0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/Ts0;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/Jm0;->a:Lcom/google/android/gms/internal/ads/Ts0;

    const/16 v0, 0x1f40

    iput v0, p0, Lcom/google/android/gms/internal/ads/Jm0;->d:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/Jm0;->e:I

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Lcom/google/android/gms/internal/ads/pi0;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/Jm0;->g()Lcom/google/android/gms/internal/ads/np0;

    move-result-object v0

    return-object v0
.end method

.method public final b(Z)Lcom/google/android/gms/internal/ads/Jm0;
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/Jm0;->f:Z

    return-object p0
.end method

.method public final c(I)Lcom/google/android/gms/internal/ads/Jm0;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Jm0;->d:I

    return-object p0
.end method

.method public final d(I)Lcom/google/android/gms/internal/ads/Jm0;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/ads/Jm0;->e:I

    return-object p0
.end method

.method public final e(Lcom/google/android/gms/internal/ads/Pv0;)Lcom/google/android/gms/internal/ads/Jm0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Jm0;->b:Lcom/google/android/gms/internal/ads/Pv0;

    return-object p0
.end method

.method public final f(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Jm0;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Jm0;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final g()Lcom/google/android/gms/internal/ads/np0;
    .locals 11

    .prologue
    iget-object v6, p0, Lcom/google/android/gms/internal/ads/Jm0;->a:Lcom/google/android/gms/internal/ads/Ts0;

    new-instance v10, Lcom/google/android/gms/internal/ads/np0;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Jm0;->c:Ljava/lang/String;

    iget v2, p0, Lcom/google/android/gms/internal/ads/Jm0;->d:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/Jm0;->e:I

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/Jm0;->f:Z

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/internal/ads/np0;-><init>(Ljava/lang/String;IIZZLcom/google/android/gms/internal/ads/Ts0;Lcom/google/android/gms/internal/ads/Bg0;ZLcom/google/android/gms/internal/ads/Mo0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Jm0;->b:Lcom/google/android/gms/internal/ads/Pv0;

    if-eqz v0, :cond_0

    invoke-virtual {v10, v0}, Lcom/google/android/gms/internal/ads/Je0;->b(Lcom/google/android/gms/internal/ads/Pv0;)V

    :cond_0
    return-object v10
.end method
