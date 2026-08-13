.class public final synthetic Lr3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/tk0;


# instance fields
.field public final synthetic a:Ljava/lang/Long;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/eO;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/T90;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/E90;


# direct methods
.method public synthetic constructor <init>(Lr3/f;Ljava/lang/Long;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/T90;Lcom/google/android/gms/internal/ads/E90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr3/d;->a:Ljava/lang/Long;

    iput-object p3, p0, Lr3/d;->b:Lcom/google/android/gms/internal/ads/eO;

    iput-object p4, p0, Lr3/d;->c:Lcom/google/android/gms/internal/ads/T90;

    iput-object p5, p0, Lr3/d;->d:Lcom/google/android/gms/internal/ads/E90;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)LP4/d;
    .locals 4

    iget-object v0, p0, Lr3/d;->a:Ljava/lang/Long;

    iget-object v1, p0, Lr3/d;->b:Lcom/google/android/gms/internal/ads/eO;

    iget-object v2, p0, Lr3/d;->c:Lcom/google/android/gms/internal/ads/T90;

    iget-object v3, p0, Lr3/d;->d:Lcom/google/android/gms/internal/ads/E90;

    check-cast p1, Lorg/json/JSONObject;

    invoke-static {v0, v1, v2, v3, p1}, Lr3/f;->d(Ljava/lang/Long;Lcom/google/android/gms/internal/ads/eO;Lcom/google/android/gms/internal/ads/T90;Lcom/google/android/gms/internal/ads/E90;Lorg/json/JSONObject;)LP4/d;

    move-result-object p1

    return-object p1
.end method
