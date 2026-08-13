.class public final synthetic Lcom/google/android/gms/internal/ads/UB;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/pg0;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lw3/a;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/n70;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/n70;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/UB;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/UB;->b:Lw3/a;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/UB;->c:Lcom/google/android/gms/internal/ads/n70;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/R60;

    new-instance v0, Lv3/v;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/UB;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lv3/v;-><init>(Landroid/content/Context;)V

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/R60;->B:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lv3/v;->p(Ljava/lang/String;)V

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/R60;->C:Lorg/json/JSONObject;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lv3/v;->q(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/UB;->b:Lw3/a;

    iget-object p1, p1, Lw3/a;->C:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lv3/v;->o(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/UB;->c:Lcom/google/android/gms/internal/ads/n70;

    iget-object p1, p1, Lcom/google/android/gms/internal/ads/n70;->f:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lv3/v;->n(Ljava/lang/String;)V

    return-object v0
.end method
