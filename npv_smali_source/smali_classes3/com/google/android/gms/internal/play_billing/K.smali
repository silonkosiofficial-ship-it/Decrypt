.class abstract Lcom/google/android/gms/internal/play_billing/K;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lj$/util/stream/Collector;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/play_billing/y;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/y;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/play_billing/B;

    invoke-direct {v1}, Lcom/google/android/gms/internal/play_billing/B;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/play_billing/C;

    invoke-direct {v2}, Lcom/google/android/gms/internal/play_billing/C;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/play_billing/D;

    invoke-direct {v3}, Lcom/google/android/gms/internal/play_billing/D;-><init>()V

    const/4 v4, 0x0

    new-array v5, v4, [Lj$/util/stream/Collector$Characteristics;

    invoke-static {v0, v1, v2, v3, v5}, Lj$/util/stream/Collector$-CC;->of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Lj$/util/stream/Collector$Characteristics;)Lj$/util/stream/Collector;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/play_billing/K;->a:Lj$/util/stream/Collector;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/E;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/E;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/play_billing/F;

    invoke-direct {v1}, Lcom/google/android/gms/internal/play_billing/F;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/play_billing/G;

    invoke-direct {v2}, Lcom/google/android/gms/internal/play_billing/G;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/play_billing/H;

    invoke-direct {v3}, Lcom/google/android/gms/internal/play_billing/H;-><init>()V

    new-array v5, v4, [Lj$/util/stream/Collector$Characteristics;

    invoke-static {v0, v1, v2, v3, v5}, Lj$/util/stream/Collector$-CC;->of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Lj$/util/stream/Collector$Characteristics;)Lj$/util/stream/Collector;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/I;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/I;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/play_billing/J;

    invoke-direct {v1}, Lcom/google/android/gms/internal/play_billing/J;-><init>()V

    new-instance v2, Lcom/google/android/gms/internal/play_billing/z;

    invoke-direct {v2}, Lcom/google/android/gms/internal/play_billing/z;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/play_billing/A;

    invoke-direct {v3}, Lcom/google/android/gms/internal/play_billing/A;-><init>()V

    new-array v4, v4, [Lj$/util/stream/Collector$Characteristics;

    invoke-static {v0, v1, v2, v3, v4}, Lj$/util/stream/Collector$-CC;->of(Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/BinaryOperator;Ljava/util/function/Function;[Lj$/util/stream/Collector$Characteristics;)Lj$/util/stream/Collector;

    return-void
.end method

.method static a()Lj$/util/stream/Collector;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/K;->a:Lj$/util/stream/Collector;

    return-object v0
.end method
