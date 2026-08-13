.class public final LC3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LC3/b;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, LC3/b;->b:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)LC3/b;
    .locals 1

    new-instance v0, LC3/b;

    invoke-direct {v0, p0, p1}, LC3/b;-><init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V

    return-object v0
.end method

.method public static d(Landroid/content/Context;Lw3/a;)LC3/a;
    .locals 1

    new-instance v0, LC3/a;

    invoke-direct {v0, p0, p1}, LC3/a;-><init>(Landroid/content/Context;Lw3/a;)V

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LC3/b;->c()LC3/a;

    move-result-object v0

    return-object v0
.end method

.method public c()LC3/a;
    .locals 2

    iget-object v0, p0, LC3/b;->a:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, LC3/b;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw3/a;

    invoke-static {v0, v1}, LC3/b;->d(Landroid/content/Context;Lw3/a;)LC3/a;

    move-result-object v0

    return-object v0
.end method
