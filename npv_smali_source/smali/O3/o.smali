.class final LO3/o;
.super Lcom/google/android/gms/common/api/internal/BasePendingResult;
.source "SourceFile"


# instance fields
.field private final n:LO3/k;


# direct methods
.method public constructor <init>(LO3/f;LO3/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/BasePendingResult;-><init>(LO3/f;)V

    iput-object p2, p0, LO3/o;->n:LO3/k;

    return-void
.end method


# virtual methods
.method protected final c(Lcom/google/android/gms/common/api/Status;)LO3/k;
    .locals 0

    iget-object p1, p0, LO3/o;->n:LO3/k;

    return-object p1
.end method
