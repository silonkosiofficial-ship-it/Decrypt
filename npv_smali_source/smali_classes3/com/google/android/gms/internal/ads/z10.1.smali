.class public final Lcom/google/android/gms/internal/ads/z10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/L20;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Lcom/google/android/gms/internal/ads/KP;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Lcom/google/android/gms/internal/ads/KP;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/z10;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/z10;->b:Lcom/google/android/gms/internal/ads/KP;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x17

    return v0
.end method

.method public final b()LP4/d;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/y10;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/y10;-><init>(Lcom/google/android/gms/internal/ads/z10;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/z10;->a:Lcom/google/android/gms/internal/ads/Yk0;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/ads/Yk0;->H0(Ljava/util/concurrent/Callable;)LP4/d;

    move-result-object v0

    return-object v0
.end method

.method final synthetic c()Lcom/google/android/gms/internal/ads/A10;
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z10;->b:Lcom/google/android/gms/internal/ads/KP;

    new-instance v7, Lcom/google/android/gms/internal/ads/A10;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/KP;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/KP;->s()Z

    move-result v3

    invoke-static {}, Lr3/v;->w()Lv3/z;

    move-result-object v0

    invoke-virtual {v0}, Lv3/z;->l()Z

    move-result v4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/z10;->b:Lcom/google/android/gms/internal/ads/KP;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/KP;->q()Z

    move-result v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/KP;->t()Z

    move-result v6

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/A10;-><init>(Ljava/lang/String;ZZZZ)V

    return-object v7
.end method
