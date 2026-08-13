.class public final Lcom/google/android/gms/internal/ads/gz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Xy;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;

.field private final d:Lcom/google/android/gms/internal/ads/rz0;

.field private final e:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/Xy;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/gz;->a:Lcom/google/android/gms/internal/ads/Xy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/gz;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/gz;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/gz;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/gz;->e:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/ads/Xy;Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/EG;
    .locals 1

    new-instance p0, Lcom/google/android/gms/internal/ads/EG;

    new-instance v0, Lcom/google/android/gms/internal/ads/Vy;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/ads/Vy;-><init>(Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/n70;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/dr;->g:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ads/EG;-><init>(Ljava/lang/Object;Ljava/util/concurrent/Executor;)V

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/gz;->b:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/gz;->c:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/ov;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/ov;->a()Lw3/a;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/gz;->d:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v2, Lcom/google/android/gms/internal/ads/xA;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/xA;->a()Lcom/google/android/gms/internal/ads/R60;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/gz;->e:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v3, Lcom/google/android/gms/internal/ads/vC;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/vC;->a()Lcom/google/android/gms/internal/ads/n70;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/gz;->a:Lcom/google/android/gms/internal/ads/Xy;

    invoke-static {v4, v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/gz;->a(Lcom/google/android/gms/internal/ads/Xy;Landroid/content/Context;Lw3/a;Lcom/google/android/gms/internal/ads/R60;Lcom/google/android/gms/internal/ads/n70;)Lcom/google/android/gms/internal/ads/EG;

    move-result-object v0

    return-object v0
.end method
