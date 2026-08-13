.class final Lcom/google/android/gms/internal/ads/Uv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/RO;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Ev;

.field private b:Landroid/content/Context;

.field private c:Lcom/google/android/gms/internal/ads/Ij;


# direct methods
.method synthetic constructor <init>(Lcom/google/android/gms/internal/ads/Ev;Lcom/google/android/gms/internal/ads/kw;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Uv;->a:Lcom/google/android/gms/internal/ads/Ev;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Landroid/content/Context;)Lcom/google/android/gms/internal/ads/RO;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Uv;->b:Landroid/content/Context;

    return-object p0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/internal/ads/Ij;)Lcom/google/android/gms/internal/ads/RO;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/Uv;->c:Lcom/google/android/gms/internal/ads/Ij;

    return-object p0
.end method

.method public final c()Lcom/google/android/gms/internal/ads/SO;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uv;->b:Landroid/content/Context;

    const-class v1, Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/Uv;->c:Lcom/google/android/gms/internal/ads/Ij;

    const-class v1, Lcom/google/android/gms/internal/ads/Ij;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/iz0;->c(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/Vv;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/Uv;->a:Lcom/google/android/gms/internal/ads/Ev;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/Uv;->b:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/Uv;->c:Lcom/google/android/gms/internal/ads/Ij;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/Vv;-><init>(Lcom/google/android/gms/internal/ads/Ev;Landroid/content/Context;Lcom/google/android/gms/internal/ads/Ij;Lcom/google/android/gms/internal/ads/kw;)V

    return-object v0
.end method
