.class public final LB3/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/ZG;


# instance fields
.field private final C:Lcom/google/android/gms/internal/ads/YN;

.field private final D:LB3/s0;

.field private final E:Ljava/lang/String;

.field private final F:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/YN;LB3/s0;Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB3/t0;->C:Lcom/google/android/gms/internal/ads/YN;

    iput-object p2, p0, LB3/t0;->D:LB3/s0;

    iput-object p3, p0, LB3/t0;->E:Ljava/lang/String;

    iput p4, p0, LB3/t0;->F:I

    return-void
.end method


# virtual methods
.method public final G(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final a(LB3/N;)V
    .locals 3

    .prologue
    if-eqz p1, :cond_2

    iget v0, p0, LB3/t0;->F:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, LB3/N;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p1, LB3/N;->c:Ljava/lang/String;

    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "request_id"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "RenderSignals.getRequestId"

    invoke-static {}, Lr3/v;->s()Lcom/google/android/gms/internal/ads/Uq;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Uq;->x(Ljava/lang/Throwable;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, LB3/t0;->D:LB3/s0;

    iget-object p1, p1, LB3/N;->c:Ljava/lang/String;

    iget-object v2, p0, LB3/t0;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v1, v0, p1, v2}, LB3/s0;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/YN;)V

    return-void

    :cond_1
    iget-object v0, p0, LB3/t0;->D:LB3/s0;

    iget-object v1, p0, LB3/t0;->E:Ljava/lang/String;

    iget-object p1, p1, LB3/N;->b:Ljava/lang/String;

    iget-object v2, p0, LB3/t0;->C:Lcom/google/android/gms/internal/ads/YN;

    invoke-virtual {v0, v1, p1, v2}, LB3/s0;->d(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/YN;)V

    :cond_2
    :goto_1
    return-void
.end method
