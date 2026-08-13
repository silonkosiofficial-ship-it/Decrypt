.class public final Lk0/e;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LF0/E0;
.implements Lk0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk0/e$a;
    }
.end annotation


# static fields
.field public static final T:Lk0/e$a;

.field public static final U:I


# instance fields
.field private final P:Lx7/l;

.field private final Q:Ljava/lang/Object;

.field private R:Lk0/d;

.field private S:Lk0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk0/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk0/e$a;-><init>(Ly7/k;)V

    sput-object v0, Lk0/e;->T:Lk0/e$a;

    const/16 v0, 0x8

    sput v0, Lk0/e;->U:I

    return-void
.end method

.method public constructor <init>(Lx7/l;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Lk0/e;->P:Lx7/l;

    sget-object p1, Lk0/e$a$a;->a:Lk0/e$a$a;

    iput-object p1, p0, Lk0/e;->Q:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic U1(Lk0/e;)Lx7/l;
    .locals 0

    iget-object p0, p0, Lk0/e;->P:Lx7/l;

    return-object p0
.end method

.method public static final synthetic V1(Lk0/e;)Lk0/g;
    .locals 0

    iget-object p0, p0, Lk0/e;->S:Lk0/g;

    return-object p0
.end method

.method public static final synthetic W1(Lk0/e;Lk0/d;)V
    .locals 0

    iput-object p1, p0, Lk0/e;->R:Lk0/d;

    return-void
.end method

.method public static final synthetic X1(Lk0/e;Lk0/g;)V
    .locals 0

    iput-object p1, p0, Lk0/e;->S:Lk0/g;

    return-void
.end method


# virtual methods
.method public E1()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lk0/e;->S:Lk0/g;

    iput-object v0, p0, Lk0/e;->R:Lk0/d;

    return-void
.end method

.method public K()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk0/e;->Q:Ljava/lang/Object;

    return-object v0
.end method

.method public S(Lk0/b;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lk0/e;->S:Lk0/g;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk0/e;->R:Lk0/d;

    if-eqz v0, :cond_1

    :cond_0
    invoke-interface {v0, p1}, Lk0/g;->S(Lk0/b;)V

    :cond_1
    return-void
.end method

.method public T1(Lk0/b;)Z
    .locals 2

    new-instance v0, Ly7/K;

    invoke-direct {v0}, Ly7/K;-><init>()V

    new-instance v1, Lk0/e$b;

    invoke-direct {v1, p1, p0, v0}, Lk0/e$b;-><init>(Lk0/b;Lk0/e;Ly7/K;)V

    invoke-static {p0, v1}, Lk0/f;->c(LF0/E0;Lx7/l;)V

    iget-boolean p1, v0, Ly7/K;->C:Z

    return p1
.end method

.method public U(Lk0/b;)V
    .locals 3

    .prologue
    iget-object v0, p0, Lk0/e;->R:Lk0/d;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lk0/i;->a(Lk0/b;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lk0/f;->a(Lk0/d;J)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    move-object v1, v0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, LF0/j;->E0()Landroidx/compose/ui/d$c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    new-instance v1, Ly7/O;

    invoke-direct {v1}, Ly7/O;-><init>()V

    new-instance v2, Lk0/e$d;

    invoke-direct {v2, v1, p0, p1}, Lk0/e$d;-><init>(Ly7/O;Lk0/e;Lk0/b;)V

    invoke-static {p0, v2}, LF0/F0;->f(LF0/E0;Lx7/l;)V

    iget-object v1, v1, Ly7/O;->C:Ljava/lang/Object;

    check-cast v1, LF0/E0;

    :goto_0
    check-cast v1, Lk0/d;

    :goto_1
    if-eqz v1, :cond_3

    if-nez v0, :cond_3

    invoke-static {v1, p1}, Lk0/f;->b(Lk0/g;Lk0/b;)V

    iget-object v0, p0, Lk0/e;->S:Lk0/g;

    if-eqz v0, :cond_8

    :cond_2
    :goto_2
    invoke-interface {v0, p1}, Lk0/g;->a1(Lk0/b;)V

    goto :goto_3

    :cond_3
    if-nez v1, :cond_4

    if-eqz v0, :cond_4

    iget-object v2, p0, Lk0/e;->S:Lk0/g;

    if-eqz v2, :cond_2

    invoke-static {v2, p1}, Lk0/f;->b(Lk0/g;Lk0/b;)V

    goto :goto_2

    :cond_4
    invoke-static {v1, v0}, Ly7/t;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    if-eqz v1, :cond_5

    invoke-static {v1, p1}, Lk0/f;->b(Lk0/g;Lk0/b;)V

    :cond_5
    if-eqz v0, :cond_8

    goto :goto_2

    :cond_6
    if-eqz v1, :cond_7

    invoke-interface {v1, p1}, Lk0/g;->U(Lk0/b;)V

    goto :goto_3

    :cond_7
    iget-object v0, p0, Lk0/e;->S:Lk0/g;

    if-eqz v0, :cond_8

    invoke-interface {v0, p1}, Lk0/g;->U(Lk0/b;)V

    :cond_8
    :goto_3
    iput-object v1, p0, Lk0/e;->R:Lk0/d;

    return-void
.end method

.method public a1(Lk0/b;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lk0/e;->S:Lk0/g;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lk0/g;->a1(Lk0/b;)V

    :cond_0
    iget-object v0, p0, Lk0/e;->R:Lk0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lk0/g;->a1(Lk0/b;)V

    :cond_1
    const/4 p1, 0x0

    iput-object p1, p0, Lk0/e;->R:Lk0/d;

    return-void
.end method

.method public c0(Lk0/b;)V
    .locals 1

    new-instance v0, Lk0/e$c;

    invoke-direct {v0, p1}, Lk0/e$c;-><init>(Lk0/b;)V

    invoke-static {p0, v0}, Lk0/f;->c(LF0/E0;Lx7/l;)V

    return-void
.end method

.method public n1(Lk0/b;)Z
    .locals 1

    .prologue
    iget-object v0, p0, Lk0/e;->R:Lk0/d;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk0/e;->S:Lk0/g;

    if-eqz v0, :cond_1

    :cond_0
    invoke-interface {v0, p1}, Lk0/g;->n1(Lk0/b;)Z

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public x0(Lk0/b;)V
    .locals 1

    .prologue
    iget-object v0, p0, Lk0/e;->S:Lk0/g;

    if-nez v0, :cond_0

    iget-object v0, p0, Lk0/e;->R:Lk0/d;

    if-eqz v0, :cond_1

    :cond_0
    invoke-interface {v0, p1}, Lk0/g;->x0(Lk0/b;)V

    :cond_1
    return-void
.end method
