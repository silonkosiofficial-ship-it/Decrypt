.class public final synthetic Lcom/google/android/gms/internal/ads/GS;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/Y80;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/HS;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/HS;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/GS;->a:Lcom/google/android/gms/internal/ads/HS;

    iput-wide p2, p0, Lcom/google/android/gms/internal/ads/GS;->b:J

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/GS;->a:Lcom/google/android/gms/internal/ads/HS;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/MS;->a()Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/internal/ads/GS;->b:J

    invoke-static {}, Lcom/google/android/gms/internal/ads/Hd;->E0()Lcom/google/android/gms/internal/ads/Id;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ads/Id;->K(J)Lcom/google/android/gms/internal/ads/Id;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Fv0;->u()Lcom/google/android/gms/internal/ads/Jv0;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/Hd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ads/Ou0;->l()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {p1, v3, v3}, Lcom/google/android/gms/internal/ads/OS;->f(Landroid/database/sqlite/SQLiteDatabase;ZZ)V

    invoke-static {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/OS;->c(Landroid/database/sqlite/SQLiteDatabase;J[B)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
