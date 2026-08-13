.class public final synthetic Lcom/google/android/gms/internal/ads/aN;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/nd;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/vd;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/google/android/gms/internal/ads/Yd;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/vd;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Yd;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/aN;->a:Lcom/google/android/gms/internal/ads/vd;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/aN;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/aN;->c:Lcom/google/android/gms/internal/ads/Yd;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/aN;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/ads/Xe;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Xe;->H()Lcom/google/android/gms/internal/ads/yd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->H()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/xd;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aN;->a:Lcom/google/android/gms/internal/ads/vd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/xd;->z(Lcom/google/android/gms/internal/ads/vd;)Lcom/google/android/gms/internal/ads/xd;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Xe;->z(Lcom/google/android/gms/internal/ads/xd;)Lcom/google/android/gms/internal/ads/Xe;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/Xe;->I()Lcom/google/android/gms/internal/ads/Qe;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Jv0;->H()Lcom/google/android/gms/internal/ads/Fv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Pe;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aN;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Pe;->z(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Pe;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/aN;->c:Lcom/google/android/gms/internal/ads/Yd;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/Pe;->A(Lcom/google/android/gms/internal/ads/Yd;)Lcom/google/android/gms/internal/ads/Pe;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Xe;->B(Lcom/google/android/gms/internal/ads/Pe;)Lcom/google/android/gms/internal/ads/Xe;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/aN;->d:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/Xe;->C(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/Xe;

    return-void
.end method
