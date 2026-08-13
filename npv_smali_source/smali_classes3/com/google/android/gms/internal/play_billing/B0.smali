.class final Lcom/google/android/gms/internal/play_billing/B0;
.super Lcom/google/android/gms/internal/play_billing/e0;
.source "SourceFile"


# static fields
.field static final H:Lcom/google/android/gms/internal/play_billing/e0;


# instance fields
.field final transient F:[Ljava/lang/Object;

.field private final transient G:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/play_billing/B0;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-direct {v0, v2, v1}, Lcom/google/android/gms/internal/play_billing/B0;-><init>([Ljava/lang/Object;I)V

    sput-object v0, Lcom/google/android/gms/internal/play_billing/B0;->H:Lcom/google/android/gms/internal/play_billing/e0;

    return-void
.end method

.method constructor <init>([Ljava/lang/Object;I)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/e0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/B0;->F:[Ljava/lang/Object;

    iput p2, p0, Lcom/google/android/gms/internal/play_billing/B0;->G:I

    return-void
.end method


# virtual methods
.method final d([Ljava/lang/Object;I)I
    .locals 2

    iget-object p2, p0, Lcom/google/android/gms/internal/play_billing/B0;->F:[Ljava/lang/Object;

    const/4 v0, 0x0

    iget v1, p0, Lcom/google/android/gms/internal/play_billing/B0;->G:I

    invoke-static {p2, v0, p1, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/android/gms/internal/play_billing/B0;->G:I

    return p1
.end method

.method final e()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/B0;->G:I

    return v0
.end method

.method final f()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/B0;->G:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/play_billing/t;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/B0;->F:[Ljava/lang/Object;

    aget-object p1, v0, p1

    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method final n()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method final o()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/B0;->F:[Ljava/lang/Object;

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/play_billing/B0;->G:I

    return v0
.end method
