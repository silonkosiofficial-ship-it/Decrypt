.class final LL3/j;
.super LL3/e;
.source "SourceFile"


# instance fields
.field final synthetic C:LL3/k;


# direct methods
.method constructor <init>(LL3/k;)V
    .locals 0

    iput-object p1, p0, LL3/j;->C:LL3/k;

    invoke-direct {p0}, LL3/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final Y3(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, LL3/j;->C:LL3/k;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(LO3/k;)V

    return-void
.end method
