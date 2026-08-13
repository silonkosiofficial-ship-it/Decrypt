.class public final Lcom/google/android/gms/internal/ads/bN;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/az0;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/rz0;

.field private final b:Lcom/google/android/gms/internal/ads/rz0;

.field private final c:Lcom/google/android/gms/internal/ads/rz0;

.field private final d:Lcom/google/android/gms/internal/ads/rz0;

.field private final e:Lcom/google/android/gms/internal/ads/rz0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;Lcom/google/android/gms/internal/ads/rz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/bN;->a:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/bN;->b:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/bN;->c:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/bN;->d:Lcom/google/android/gms/internal/ads/rz0;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/bN;->e:Lcom/google/android/gms/internal/ads/rz0;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b()Ljava/lang/Object;
    .locals 7

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/bN;->a:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v0, Lcom/google/android/gms/internal/ads/av;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/av;->a()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/bN;->b:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v1, Lcom/google/android/gms/internal/ads/JQ;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/JQ;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/bN;->c:Lcom/google/android/gms/internal/ads/rz0;

    check-cast v2, Lcom/google/android/gms/internal/ads/ov;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/ov;->a()Lw3/a;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/bN;->d:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/ads/vd;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/bN;->e:Lcom/google/android/gms/internal/ads/rz0;

    invoke-interface {v4}, Lcom/google/android/gms/internal/ads/rz0;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v5, Lcom/google/android/gms/internal/ads/od;

    new-instance v6, Lcom/google/android/gms/internal/ads/ud;

    invoke-direct {v6, v0}, Lcom/google/android/gms/internal/ads/ud;-><init>(Landroid/content/Context;)V

    invoke-direct {v5, v6}, Lcom/google/android/gms/internal/ads/od;-><init>(Lcom/google/android/gms/internal/ads/ud;)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/Yd;->h0()Lcom/google/android/gms/internal/ads/Xd;

    move-result-object v0

    iget v6, v2, Lw3/a;->D:I

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/Xd;->z(I)Lcom/google/android/gms/internal/ads/Xd;

    iget v6, v2, Lw3/a;->E:I

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ads/Xd;->B(I)Lcom/google/android/gms/internal/ads/Xd;

    const/4 v6, 0x1

    iget-boolean v2, v2, Lw3/a;->F:Z

    if-eq v6, v2, :cond_0

    const/4 v2, 0x2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ads/Xd;->A(I)Lcom/google/android/gms/internal/ads/Xd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/Yd;

    new-instance v2, Lcom/google/android/gms/internal/ads/aN;

    invoke-direct {v2, v3, v1, v0, v4}, Lcom/google/android/gms/internal/ads/aN;-><init>(Lcom/google/android/gms/internal/ads/vd;Ljava/lang/String;Lcom/google/android/gms/internal/ads/Yd;Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Lcom/google/android/gms/internal/ads/od;->b(Lcom/google/android/gms/internal/ads/nd;)V

    return-object v5
.end method
