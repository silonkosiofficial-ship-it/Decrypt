.class final LL3/l;
.super LL3/e;
.source "SourceFile"


# instance fields
.field final synthetic C:LL3/m;


# direct methods
.method constructor <init>(LL3/m;)V
    .locals 0

    iput-object p1, p0, LL3/l;->C:LL3/m;

    invoke-direct {p0}, LL3/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final n3(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    iget-object v0, p0, LL3/l;->C:LL3/m;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(LO3/k;)V

    return-void
.end method
