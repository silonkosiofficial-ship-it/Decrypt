.class public final Lt8/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF8/e0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/n$a;
    }
.end annotation


# static fields
.field public static final f:Lt8/n$a;


# instance fields
.field private final a:J

.field private final b:LO7/G;

.field private final c:Ljava/util/Set;

.field private final d:LF8/M;

.field private final e:Li7/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt8/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt8/n$a;-><init>(Ly7/k;)V

    sput-object v0, Lt8/n;->f:Lt8/n$a;

    return-void
.end method

.method private constructor <init>(JLO7/G;Ljava/util/Set;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LF8/a0;->D:LF8/a0$a;

    invoke-virtual {v0}, LF8/a0$a;->i()LF8/a0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, LF8/F;->e(LF8/a0;Lt8/n;Z)LF8/M;

    move-result-object v0

    iput-object v0, p0, Lt8/n;->d:LF8/M;

    new-instance v0, Lt8/n$b;

    invoke-direct {v0, p0}, Lt8/n$b;-><init>(Lt8/n;)V

    invoke-static {v0}, Li7/o;->b(Lx7/a;)Li7/n;

    move-result-object v0

    iput-object v0, p0, Lt8/n;->e:Li7/n;

    iput-wide p1, p0, Lt8/n;->a:J

    iput-object p3, p0, Lt8/n;->b:LO7/G;

    iput-object p4, p0, Lt8/n;->c:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(JLO7/G;Ljava/util/Set;Ly7/k;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lt8/n;-><init>(JLO7/G;Ljava/util/Set;)V

    return-void
.end method

.method public static final synthetic b(Lt8/n;)LO7/G;
    .locals 0

    iget-object p0, p0, Lt8/n;->b:LO7/G;

    return-object p0
.end method

.method public static final synthetic c(Lt8/n;)LF8/M;
    .locals 0

    iget-object p0, p0, Lt8/n;->d:LF8/M;

    return-object p0
.end method

.method public static final synthetic d(Lt8/n;)J
    .locals 2

    iget-wide v0, p0, Lt8/n;->a:J

    return-wide v0
.end method

.method public static final synthetic e(Lt8/n;)Z
    .locals 0

    invoke-direct {p0}, Lt8/n;->h()Z

    move-result p0

    return p0
.end method

.method private final g()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lt8/n;->e:Li7/n;

    invoke-interface {v0}, Li7/n;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final h()Z
    .locals 4

    .prologue
    iget-object v0, p0, Lt8/n;->b:LO7/G;

    invoke-static {v0}, Lt8/s;->a(LO7/G;)Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LF8/E;

    iget-object v3, p0, Lt8/n;->c:Ljava/util/Set;

    invoke-interface {v3, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v2

    if-nez v1, :cond_1

    const/4 v2, 0x0

    :cond_2
    :goto_0
    return v2
.end method

.method private final i()Ljava/lang/String;
    .locals 11

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lt8/n;->c:Ljava/util/Set;

    move-object v2, v1

    check-cast v2, Ljava/lang/Iterable;

    sget-object v8, Lt8/n$c;->D:Lt8/n$c;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const-string v3, ","

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v10}, Lj7/v;->r0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lx7/l;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final f()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lt8/n;->c:Ljava/util/Set;

    return-object v0
.end method

.method public t()LL7/g;
    .locals 1

    iget-object v0, p0, Lt8/n;->b:LO7/G;

    invoke-interface {v0}, LO7/G;->t()LL7/g;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IntegerLiteralType"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-direct {p0}, Lt8/n;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ljava/util/Collection;
    .locals 1

    invoke-direct {p0}, Lt8/n;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public v(LG8/g;)LF8/e0;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public w()LO7/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public x()Ljava/util/List;
    .locals 1

    invoke-static {}, Lj7/v;->m()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public y()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
