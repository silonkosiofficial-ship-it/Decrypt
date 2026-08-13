.class final Lcom/google/android/gms/internal/ads/Iv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/l40;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Ev;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ev;Lcom/google/android/gms/internal/ads/kw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Iv;->a:Lcom/google/android/gms/internal/ads/Ev;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/l40;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Iv;->b:Landroid/content/Context;

    return-object p0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/m40;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Iv;->b:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Iv;->c:Ljava/lang/String;

    const-class v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Jv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Iv;->a:Lcom/google/android/gms/internal/ads/Ev;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Iv;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Iv;->c:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Jv;-><init>(Lcom/google/android/gms/internal/ads/Ev;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/ads/kw;)V

    return-object v0
.end method

.method public final bridge synthetic o(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/l40;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Iv;->c:Ljava/lang/String;

    return-object p0
.end method
