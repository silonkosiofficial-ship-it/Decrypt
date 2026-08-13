.class public final Ls3/S1;
.super Ls3/J;
.source "SourceFile"


# instance fields
.field private final C:Lk3/e;

.field private final D:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lk3/e;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ls3/J;-><init>()V

    iput-object p1, p0, Ls3/S1;->C:Lk3/e;

    iput-object p2, p0, Ls3/S1;->D:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    .prologue
    iget-object v0, p0, Ls3/S1;->C:Lk3/e;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ls3/S1;->D:Ljava/lang/Object;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Lk3/e;->b(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final x0(Ls3/W0;)V
    .locals 1

    .prologue
    iget-object v0, p0, Ls3/S1;->C:Lk3/e;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ls3/W0;->f()Lk3/m;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk3/e;->a(Lk3/m;)V

    :cond_0
    return-void
.end method
