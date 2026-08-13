.class public final synthetic Lcom/google/android/gms/internal/ads/fT;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic C:Landroid/database/sqlite/SQLiteDatabase;

.field public final synthetic D:Ljava/lang/String;

.field public final synthetic E:Lw3/v;


# direct methods
.method public synthetic constructor <init>(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lw3/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/fT;->C:Landroid/database/sqlite/SQLiteDatabase;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/fT;->D:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/fT;->E:Lw3/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/fT;->C:Landroid/database/sqlite/SQLiteDatabase;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/fT;->D:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/fT;->E:Lw3/v;

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/ads/iT;->r(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Lw3/v;)V

    return-void
.end method
