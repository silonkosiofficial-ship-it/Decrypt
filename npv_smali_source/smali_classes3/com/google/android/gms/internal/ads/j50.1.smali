.class final Lcom/google/android/gms/internal/ads/j50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/x80;


# instance fields
.field public final a:Lcom/google/android/gms/internal/ads/E50;

.field public final b:Lcom/google/android/gms/internal/ads/G50;

.field public final c:Ls3/X1;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/concurrent/Executor;

.field public final f:Ls3/i2;

.field public final g:Lcom/google/android/gms/internal/ads/m80;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/E50;Lcom/google/android/gms/internal/ads/G50;Ls3/X1;Ljava/lang/String;Ljava/util/concurrent/Executor;Ls3/i2;Lcom/google/android/gms/internal/ads/m80;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/j50;->a:Lcom/google/android/gms/internal/ads/E50;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/j50;->b:Lcom/google/android/gms/internal/ads/G50;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/j50;->c:Ls3/X1;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/j50;->d:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/j50;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lcom/google/android/gms/internal/ads/j50;->f:Ls3/i2;

    iput-object p7, p0, Lcom/google/android/gms/internal/ads/j50;->g:Lcom/google/android/gms/internal/ads/m80;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/ads/m80;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j50;->g:Lcom/google/android/gms/internal/ads/m80;

    return-object v0
.end method

.method public final b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/j50;->e:Ljava/util/concurrent/Executor;

    return-object v0
.end method
