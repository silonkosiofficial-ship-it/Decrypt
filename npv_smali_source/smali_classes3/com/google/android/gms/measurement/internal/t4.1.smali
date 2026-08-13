.class public final synthetic Lcom/google/android/gms/measurement/internal/t4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic C:Lcom/google/android/gms/measurement/internal/u4;

.field private synthetic D:I

.field private synthetic E:Ljava/lang/Exception;

.field private synthetic F:[B

.field private synthetic G:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/u4;ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/t4;->C:Lcom/google/android/gms/measurement/internal/u4;

    iput p2, p0, Lcom/google/android/gms/measurement/internal/t4;->D:I

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/t4;->E:Ljava/lang/Exception;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/t4;->F:[B

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/t4;->G:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/t4;->C:Lcom/google/android/gms/measurement/internal/u4;

    iget v1, p0, Lcom/google/android/gms/measurement/internal/t4;->D:I

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/t4;->E:Ljava/lang/Exception;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/t4;->F:[B

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/t4;->G:Ljava/util/Map;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/measurement/internal/u4;->a(ILjava/lang/Exception;[BLjava/util/Map;)V

    return-void
.end method
