.class public final Lcom/google/android/gms/internal/play_billing/j0;
.super Lcom/google/android/gms/internal/play_billing/x;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final D:Lcom/google/android/gms/internal/play_billing/j0;

.field private static final E:Lcom/google/android/gms/internal/play_billing/j0;


# instance fields
.field private final transient C:Lcom/google/android/gms/internal/play_billing/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/play_billing/j0;

    sget v1, Lcom/google/android/gms/internal/play_billing/e0;->E:I

    sget-object v1, Lcom/google/android/gms/internal/play_billing/B0;->H:Lcom/google/android/gms/internal/play_billing/e0;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/j0;-><init>(Lcom/google/android/gms/internal/play_billing/e0;)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/j0;->D:Lcom/google/android/gms/internal/play_billing/j0;

    new-instance v0, Lcom/google/android/gms/internal/play_billing/j0;

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/y0;->a()Lcom/google/android/gms/internal/play_billing/y0;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/play_billing/e0;->M(Ljava/lang/Object;)Lcom/google/android/gms/internal/play_billing/e0;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/play_billing/j0;-><init>(Lcom/google/android/gms/internal/play_billing/e0;)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/j0;->E:Lcom/google/android/gms/internal/play_billing/j0;

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/play_billing/e0;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/x;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/j0;->C:Lcom/google/android/gms/internal/play_billing/e0;

    return-void
.end method

.method static a()Lcom/google/android/gms/internal/play_billing/j0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/j0;->E:Lcom/google/android/gms/internal/play_billing/j0;

    return-object v0
.end method

.method public static b()Lcom/google/android/gms/internal/play_billing/j0;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/play_billing/j0;->D:Lcom/google/android/gms/internal/play_billing/j0;

    return-object v0
.end method


# virtual methods
.method public final bridge synthetic c()Ljava/util/Set;
    .locals 3

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/j0;->C:Lcom/google/android/gms/internal/play_billing/e0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/play_billing/H0;->K:Lcom/google/android/gms/internal/play_billing/H0;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/j0;->C:Lcom/google/android/gms/internal/play_billing/e0;

    new-instance v1, Lcom/google/android/gms/internal/play_billing/I0;

    sget-object v2, Lcom/google/android/gms/internal/play_billing/x0;->C:Lcom/google/android/gms/internal/play_billing/v0;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/play_billing/I0;-><init>(Lcom/google/android/gms/internal/play_billing/e0;Ljava/util/Comparator;)V

    move-object v0, v1

    :goto_0
    return-object v0
.end method
