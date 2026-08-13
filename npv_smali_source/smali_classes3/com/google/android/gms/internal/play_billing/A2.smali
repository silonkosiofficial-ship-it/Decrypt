.class public final Lcom/google/android/gms/internal/play_billing/A2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile b:Lcom/google/android/gms/internal/play_billing/A2;

.field static final c:Lcom/google/android/gms/internal/play_billing/A2;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/A2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/A2;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/A2;->c:Lcom/google/android/gms/internal/play_billing/A2;

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/A2;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/play_billing/A2;
    .locals 2

    .prologue
    sget-object v0, Lcom/google/android/gms/internal/play_billing/A2;->b:Lcom/google/android/gms/internal/play_billing/A2;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-class v0, Lcom/google/android/gms/internal/play_billing/A2;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/google/android/gms/internal/play_billing/A2;->b:Lcom/google/android/gms/internal/play_billing/A2;

    if-eqz v1, :cond_1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    sget v1, Lcom/google/android/gms/internal/play_billing/q3;->d:I

    const-class v1, Lcom/google/android/gms/internal/play_billing/A2;

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/H2;->a(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/A2;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/play_billing/A2;->b:Lcom/google/android/gms/internal/play_billing/A2;

    monitor-exit v0

    return-object v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/play_billing/i3;I)Lcom/google/android/gms/internal/play_billing/K2;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/z2;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/z2;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p0, Lcom/google/android/gms/internal/play_billing/A2;->a:Ljava/util/Map;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/appcompat/app/D;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
