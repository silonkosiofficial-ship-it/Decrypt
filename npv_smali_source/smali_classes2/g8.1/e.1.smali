.class public final Lg8/e;
.super Lg8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg8/e$a;
    }
.end annotation


# instance fields
.field private final d:LO7/G;

.field private final e:LO7/J;

.field private final f:LB8/e;

.field private g:Lm8/e;


# direct methods
.method public constructor <init>(LO7/G;LO7/J;LE8/n;Lg8/r;)V
    .locals 1

    const-string v0, "module"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "notFoundClasses"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "storageManager"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3, p4}, Lg8/a;-><init>(LE8/n;Lg8/r;)V

    iput-object p1, p0, Lg8/e;->d:LO7/G;

    iput-object p2, p0, Lg8/e;->e:LO7/J;

    new-instance p3, LB8/e;

    invoke-direct {p3, p1, p2}, LB8/e;-><init>(LO7/G;LO7/J;)V

    iput-object p3, p0, Lg8/e;->f:LB8/e;

    sget-object p1, Lm8/e;->i:Lm8/e;

    iput-object p1, p0, Lg8/e;->g:Lm8/e;

    return-void
.end method

.method public static final synthetic I(Lg8/e;Ln8/f;Ljava/lang/Object;)Lt8/g;
    .locals 0

    invoke-direct {p0, p1, p2}, Lg8/e;->J(Ln8/f;Ljava/lang/Object;)Lt8/g;

    move-result-object p0

    return-object p0
.end method

.method private final J(Ln8/f;Ljava/lang/Object;)Lt8/g;
    .locals 2

    .prologue
    sget-object v0, Lt8/h;->a:Lt8/h;

    iget-object v1, p0, Lg8/e;->d:LO7/G;

    invoke-virtual {v0, p2, v1}, Lt8/h;->c(Ljava/lang/Object;LO7/G;)Lt8/g;

    move-result-object p2

    if-nez p2, :cond_0

    sget-object p2, Lt8/k;->b:Lt8/k$a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported annotation argument: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lt8/k$a;->a(Ljava/lang/String;)Lt8/k;

    move-result-object p2

    :cond_0
    return-object p2
.end method

.method private final M(Ln8/b;)LO7/e;
    .locals 2

    iget-object v0, p0, Lg8/e;->d:LO7/G;

    iget-object v1, p0, Lg8/e;->e:LO7/J;

    invoke-static {v0, p1, v1}, LO7/x;->c(LO7/G;Ln8/b;LO7/J;)LO7/e;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public bridge synthetic F(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg8/e;->L(Ljava/lang/String;Ljava/lang/Object;)Lt8/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic H(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt8/g;

    invoke-virtual {p0, p1}, Lg8/e;->O(Lt8/g;)Lt8/g;

    move-result-object p1

    return-object p1
.end method

.method public K(Li8/b;Lk8/c;)LP7/c;
    .locals 1

    const-string v0, "proto"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lg8/e;->f:LB8/e;

    invoke-virtual {v0, p1, p2}, LB8/e;->a(Li8/b;Lk8/c;)LP7/c;

    move-result-object p1

    return-object p1
.end method

.method protected L(Ljava/lang/String;Ljava/lang/Object;)Lt8/g;
    .locals 4

    .prologue
    const-string v0, "desc"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initializer"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    const-string v2, "ZBCS"

    const/4 v3, 0x0

    invoke-static {v2, p1, v3, v0, v1}, LS8/r;->c0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x42

    if-eq v0, v1, :cond_3

    const/16 v1, 0x43

    if-eq v0, v1, :cond_2

    const/16 v1, 0x53

    if-eq v0, v1, :cond_1

    const/16 v1, 0x5a

    if-ne v0, v1, :cond_4

    const-string v0, "Z"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p2, :cond_0

    const/4 v3, 0x1

    :cond_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    goto :goto_0

    :cond_1
    const-string v0, "S"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    int-to-short p1, p2

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p2

    goto :goto_0

    :cond_2
    const-string v0, "C"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    int-to-char p1, p2

    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p2

    goto :goto_0

    :cond_3
    const-string v0, "B"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    int-to-byte p1, p2

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p2

    goto :goto_0

    :cond_4
    new-instance p2, Ljava/lang/AssertionError;

    invoke-direct {p2, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p2

    :cond_5
    :goto_0
    sget-object p1, Lt8/h;->a:Lt8/h;

    iget-object v0, p0, Lg8/e;->d:LO7/G;

    invoke-virtual {p1, p2, v0}, Lt8/h;->c(Ljava/lang/Object;LO7/G;)Lt8/g;

    move-result-object p1

    return-object p1
.end method

.method public N(Lm8/e;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg8/e;->g:Lm8/e;

    return-void
.end method

.method protected O(Lt8/g;)Lt8/g;
    .locals 3

    .prologue
    const-string v0, "constant"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lt8/d;

    if-eqz v0, :cond_0

    new-instance v0, Lt8/w;

    check-cast p1, Lt8/d;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->byteValue()B

    move-result p1

    invoke-direct {v0, p1}, Lt8/w;-><init>(B)V

    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lt8/t;

    if-eqz v0, :cond_1

    new-instance v0, Lt8/z;

    check-cast p1, Lt8/t;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->shortValue()S

    move-result p1

    invoke-direct {v0, p1}, Lt8/z;-><init>(S)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lt8/m;

    if-eqz v0, :cond_2

    new-instance v0, Lt8/x;

    check-cast p1, Lt8/m;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p1}, Lt8/x;-><init>(I)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lt8/q;

    if-eqz v0, :cond_3

    new-instance v0, Lt8/y;

    check-cast p1, Lt8/q;

    invoke-virtual {p1}, Lt8/g;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Lt8/y;-><init>(J)V

    goto :goto_0

    :cond_3
    :goto_1
    return-object p1
.end method

.method public t()Lm8/e;
    .locals 1

    iget-object v0, p0, Lg8/e;->g:Lm8/e;

    return-object v0
.end method

.method protected w(Ln8/b;LO7/a0;Ljava/util/List;)Lg8/t$a;
    .locals 7

    const-string v0, "annotationClassId"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg8/e;->M(Ln8/b;)LO7/e;

    move-result-object v3

    new-instance v0, Lg8/e$b;

    move-object v1, v0

    move-object v2, p0

    move-object v4, p1

    move-object v5, p3

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lg8/e$b;-><init>(Lg8/e;LO7/e;Ln8/b;Ljava/util/List;LO7/a0;)V

    return-object v0
.end method

.method public bridge synthetic x(Li8/b;Lk8/c;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lg8/e;->K(Li8/b;Lk8/c;)LP7/c;

    move-result-object p1

    return-object p1
.end method
