.class public abstract LO3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LO3/k;LO3/f;)LO3/g;
    .locals 2

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, LO3/k;->d()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/Status;->C()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Status code must not be SUCCESS"

    invoke-static {v0, v1}, LQ3/p;->b(ZLjava/lang/Object;)V

    new-instance v0, LO3/o;

    invoke-direct {v0, p1, p0}, LO3/o;-><init>(LO3/f;LO3/k;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(LO3/k;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/common/api/Status;LO3/f;)LO3/g;
    .locals 1

    const-string v0, "Result must not be null"

    invoke-static {p0, v0}, LQ3/p;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, LP3/l;

    invoke-direct {v0, p1}, LP3/l;-><init>(LO3/f;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/internal/BasePendingResult;->f(LO3/k;)V

    return-object v0
.end method
