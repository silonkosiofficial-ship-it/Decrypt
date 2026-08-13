.class final Lcom/google/android/gms/internal/ads/Tv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/IO;


# instance fields
.field private final a:Ljava/lang/Long;

.field private final b:Ljava/lang/String;

.field private final c:Lcom/google/android/gms/internal/ads/Ev;

.field private final d:Lcom/google/android/gms/internal/ads/Vv;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ev;Lcom/google/android/gms/internal/ads/Vv;Ljava/lang/Long;Ljava/lang/String;Lcom/google/android/gms/internal/ads/kw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Tv;->c:Lcom/google/android/gms/internal/ads/Ev;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/Tv;->d:Lcom/google/android/gms/internal/ads/Vv;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/Tv;->a:Ljava/lang/Long;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/Tv;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/UO;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Tv;->d:Lcom/google/android/gms/internal/ads/Vv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Tv;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Vv;->a(Lcom/google/android/gms/internal/ads/Vv;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Vv;->c(Lcom/google/android/gms/internal/ads/Vv;)Lcom/google/android/gms/internal/ads/NO;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/Tv;->c:Lcom/google/android/gms/internal/ads/Ev;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/Tv;->b:Ljava/lang/String;

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/VO;->a(JLandroid/content/Context;Lcom/google/android/gms/internal/ads/NO;Lcom/google/android/gms/internal/ads/Su;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/UO;

    move-result-object v0

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/internal/ads/YO;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Tv;->d:Lcom/google/android/gms/internal/ads/Vv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Tv;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Vv;->a(Lcom/google/android/gms/internal/ads/Vv;)Landroid/content/Context;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Vv;->c(Lcom/google/android/gms/internal/ads/Vv;)Lcom/google/android/gms/internal/ads/NO;

    move-result-object v5

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/Tv;->c:Lcom/google/android/gms/internal/ads/Ev;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/Tv;->b:Ljava/lang/String;

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/ZO;->a(JLandroid/content/Context;Lcom/google/android/gms/internal/ads/NO;Lcom/google/android/gms/internal/ads/Su;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/YO;

    move-result-object v0

    return-object v0
.end method
