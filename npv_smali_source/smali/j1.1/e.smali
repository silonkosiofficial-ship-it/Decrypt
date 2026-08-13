.class public Lj1/e;
.super Lj1/a;
.source "SourceFile"

# interfaces
.implements Lk1/e;


# instance fields
.field private final o0:Lj1/g;

.field private final p0:Lj1/g$e;

.field private q0:Ljava/util/ArrayList;

.field private r0:Lm1/j;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lj1/g;Lj1/g$e;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lj1/a;-><init>(Lj1/g;)V

    iput-object p1, p0, Lj1/e;->o0:Lj1/g;

    iput-object p2, p0, Lj1/e;->p0:Lj1/g$e;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lj1/e;->q0:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final varargs T0([Ljava/lang/Object;)Lj1/e;
    .locals 1

    const-string v0, "objects"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj1/e;->q0:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lj7/v;->D(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final U0()V
    .locals 0

    invoke-super {p0}, Lj1/a;->apply()V

    return-void
.end method

.method public V0()Lm1/j;
    .locals 1

    iget-object v0, p0, Lj1/e;->r0:Lm1/j;

    return-object v0
.end method

.method protected final W0()Lj1/g;
    .locals 1

    iget-object v0, p0, Lj1/e;->o0:Lj1/g;

    return-object v0
.end method

.method public final X0()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lj1/e;->q0:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final Y0()Lj1/g$e;
    .locals 1

    iget-object v0, p0, Lj1/e;->p0:Lj1/g$e;

    return-object v0
.end method

.method public a()Lm1/e;
    .locals 1

    invoke-virtual {p0}, Lj1/e;->V0()Lm1/j;

    move-result-object v0

    return-object v0
.end method

.method public apply()V
    .locals 0

    return-void
.end method
