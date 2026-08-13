.class public abstract Lcom/google/android/gms/common/api/internal/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/common/api/internal/d$a;
    }
.end annotation


# instance fields
.field private final a:[LN3/d;

.field private final b:Z

.field private final c:I


# direct methods
.method protected constructor <init>([LN3/d;ZI)V
    .locals 1

    .prologue
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/d;->a:[LN3/d;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/google/android/gms/common/api/internal/d;->b:Z

    iput p3, p0, Lcom/google/android/gms/common/api/internal/d;->c:I

    return-void
.end method

.method public static a()Lcom/google/android/gms/common/api/internal/d$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/internal/d$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/internal/d$a;-><init>(LP3/z;)V

    return-object v0
.end method


# virtual methods
.method protected abstract b(LO3/a$b;Ll4/m;)V
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/common/api/internal/d;->b:Z

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/common/api/internal/d;->c:I

    return v0
.end method

.method public final e()[LN3/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/d;->a:[LN3/d;

    return-object v0
.end method
