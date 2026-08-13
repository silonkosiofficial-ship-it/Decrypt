.class public final synthetic Lcom/google/android/gms/internal/ads/nH;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/uD;


# instance fields
.field public final synthetic C:Landroid/content/Context;

.field public final synthetic D:Lw3/a;

.field public final synthetic E:Lcom/google/android/gms/internal/ads/R60;

.field public final synthetic F:Lcom/google/android/gms/internal/ads/n70;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/n70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/nH;->C:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/nH;->D:Lw3/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/nH;->E:Lcom/google/android/gms/internal/ads/R60;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/nH;->F:Lcom/google/android/gms/internal/ads/n70;

    return-void
.end method


# virtual methods
.method public final u()V
    .locals 5

    invoke-static {}, Lr3/v;->w()Lv3/z;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/nH;->C:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/nH;->F:Lcom/google/android/gms/internal/ads/n70;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/nH;->E:Lcom/google/android/gms/internal/ads/R60;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/R60;->C:Lorg/json/JSONObject;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/nH;->D:Lw3/a;

    iget-object v4, v4, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-virtual {v0, v1, v4, v3, v2}, Lv3/z;->n(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method
