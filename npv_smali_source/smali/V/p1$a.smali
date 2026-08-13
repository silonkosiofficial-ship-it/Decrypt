.class final LV/p1$a;
.super Lf0/A;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV/p1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private c:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    invoke-direct {p0}, Lf0/A;-><init>()V

    iput p1, p0, LV/p1$a;->c:F

    return-void
.end method


# virtual methods
.method public c(Lf0/A;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord"

    invoke-static {p1, v0}, Ly7/t;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, LV/p1$a;

    iget p1, p1, LV/p1$a;->c:F

    iput p1, p0, LV/p1$a;->c:F

    return-void
.end method

.method public d()Lf0/A;
    .locals 2

    new-instance v0, LV/p1$a;

    iget v1, p0, LV/p1$a;->c:F

    invoke-direct {v0, v1}, LV/p1$a;-><init>(F)V

    return-object v0
.end method

.method public final i()F
    .locals 1

    iget v0, p0, LV/p1$a;->c:F

    return v0
.end method

.method public final j(F)V
    .locals 0

    iput p1, p0, LV/p1$a;->c:F

    return-void
.end method
