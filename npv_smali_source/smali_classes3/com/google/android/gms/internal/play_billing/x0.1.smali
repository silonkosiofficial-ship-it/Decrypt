.class final Lcom/google/android/gms/internal/play_billing/x0;
.super Lcom/google/android/gms/internal/play_billing/v0;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field static final C:Lcom/google/android/gms/internal/play_billing/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/play_billing/x0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/play_billing/x0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/x0;->C:Lcom/google/android/gms/internal/play_billing/v0;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/v0;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/play_billing/y0;

    check-cast p2, Lcom/google/android/gms/internal/play_billing/y0;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/Q;->f()Lcom/google/android/gms/internal/play_billing/Q;

    move-result-object v0

    iget-object v1, p1, Lcom/google/android/gms/internal/play_billing/y0;->C:Lcom/google/android/gms/internal/play_billing/U;

    iget-object v2, p2, Lcom/google/android/gms/internal/play_billing/y0;->C:Lcom/google/android/gms/internal/play_billing/U;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/play_billing/Q;->b(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/google/android/gms/internal/play_billing/Q;

    move-result-object v0

    iget-object p1, p1, Lcom/google/android/gms/internal/play_billing/y0;->D:Lcom/google/android/gms/internal/play_billing/U;

    iget-object p2, p2, Lcom/google/android/gms/internal/play_billing/y0;->D:Lcom/google/android/gms/internal/play_billing/U;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/play_billing/Q;->b(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lcom/google/android/gms/internal/play_billing/Q;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/Q;->a()I

    move-result p1

    return p1
.end method
