.class public abstract Lcom/google/android/gms/internal/ads/n90;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:LP4/d;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ads/Yk0;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Lcom/google/android/gms/internal/ads/o90;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/Nk0;->h(Ljava/lang/Object;)LP4/d;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/ads/n90;->d:LP4/d;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/ads/Yk0;Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ads/o90;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/n90;->a:Lcom/google/android/gms/internal/ads/Yk0;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/n90;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/n90;->c:Lcom/google/android/gms/internal/ads/o90;

    return-void
.end method

.method static bridge synthetic c(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/o90;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/n90;->c:Lcom/google/android/gms/internal/ads/o90;

    return-object p0
.end method

.method static bridge synthetic d()LP4/d;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/n90;->d:LP4/d;

    return-object v0
.end method

.method static bridge synthetic e(Lcom/google/android/gms/internal/ads/n90;)Lcom/google/android/gms/internal/ads/Yk0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/n90;->a:Lcom/google/android/gms/internal/ads/Yk0;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/internal/ads/n90;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/n90;->b:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method


# virtual methods
.method public final varargs a(Ljava/lang/Object;[LP4/d;)Lcom/google/android/gms/internal/ads/c90;
    .locals 2

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    new-instance v0, Lcom/google/android/gms/internal/ads/c90;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/google/android/gms/internal/ads/c90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/util/List;Lcom/google/android/gms/internal/ads/m90;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;LP4/d;)Lcom/google/android/gms/internal/ads/l90;
    .locals 9

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    new-instance v8, Lcom/google/android/gms/internal/ads/l90;

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v6, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/ads/l90;-><init>(Lcom/google/android/gms/internal/ads/n90;Ljava/lang/Object;Ljava/lang/String;LP4/d;Ljava/util/List;LP4/d;Lcom/google/android/gms/internal/ads/m90;)V

    return-object v8
.end method

.method protected abstract f(Ljava/lang/Object;)Ljava/lang/String;
.end method
