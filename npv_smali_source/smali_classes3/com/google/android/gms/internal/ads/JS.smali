.class public final synthetic Lcom/google/android/gms/internal/ads/JS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Y80;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/KS;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/util/ArrayList;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/Ed;

.field public final synthetic e:Lcom/google/android/gms/internal/ads/Kd;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/KS;ZLjava/util/ArrayList;Lcom/google/android/gms/internal/ads/Ed;Lcom/google/android/gms/internal/ads/Kd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/JS;->a:Lcom/google/android/gms/internal/ads/KS;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/JS;->b:Z

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/JS;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/JS;->d:Lcom/google/android/gms/internal/ads/Ed;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/JS;->e:Lcom/google/android/gms/internal/ads/Kd;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/JS;->a:Lcom/google/android/gms/internal/ads/KS;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/KS;->b:Lcom/google/android/gms/internal/ads/LS;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/MS;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/JS;->e:Lcom/google/android/gms/internal/ads/Kd;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/JS;->d:Lcom/google/android/gms/internal/ads/Ed;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/JS;->c:Ljava/util/ArrayList;

    iget-boolean v4, p0, Lcom/google/android/gms/internal/ads/JS;->b:Z

    iget-object v5, v0, Lcom/google/android/gms/internal/ads/KS;->b:Lcom/google/android/gms/internal/ads/LS;

    invoke-static {v5, v4, v3, v2, v1}, Lcom/google/android/gms/internal/ads/LS;->f(Lcom/google/android/gms/internal/ads/LS;ZLjava/util/ArrayList;Lcom/google/android/gms/internal/ads/Ed;Lcom/google/android/gms/internal/ads/Kd;)[B

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {p1, v4, v2}, Lcom/google/android/gms/internal/ads/OS;->f(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/KS;->b:Lcom/google/android/gms/internal/ads/LS;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/LS;->d(Lcom/google/android/gms/internal/ads/LS;)Lcom/google/android/gms/internal/ads/DS;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/DS;->d()J

    move-result-wide v2

    invoke-static {p1, v2, v3, v1}, Lcom/google/android/gms/internal/ads/OS;->c(Landroid/database/sqlite/SQLiteDatabase;J[B)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
