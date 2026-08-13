.class public final synthetic Lcom/google/android/gms/internal/ads/RH0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/rF;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/VH0;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/BH0;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/HH0;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/VH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/RH0;->a:Lcom/google/android/gms/internal/ads/VH0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/RH0;->b:Lcom/google/android/gms/internal/ads/BH0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/RH0;->c:Lcom/google/android/gms/internal/ads/HH0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/RH0;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/ads/RH0;->e:Z

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/RH0;->a:Lcom/google/android/gms/internal/ads/VH0;

    iget-object v3, v0, Lcom/google/android/gms/internal/ads/VH0;->b:Lcom/google/android/gms/internal/ads/LH0;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/RH0;->b:Lcom/google/android/gms/internal/ads/BH0;

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/RH0;->c:Lcom/google/android/gms/internal/ads/HH0;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/RH0;->d:Ljava/io/IOException;

    iget-boolean v7, p0, Lcom/google/android/gms/internal/ads/RH0;->e:Z

    move-object v1, p1

    check-cast v1, Lcom/google/android/gms/internal/ads/WH0;

    const/4 v2, 0x0

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/ads/WH0;->F(ILcom/google/android/gms/internal/ads/LH0;Lcom/google/android/gms/internal/ads/BH0;Lcom/google/android/gms/internal/ads/HH0;Ljava/io/IOException;Z)V

    return-void
.end method
