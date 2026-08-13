.class public final Landroidx/compose/foundation/relocation/f;
.super Landroidx/compose/ui/d$c;
.source "SourceFile"

# interfaces
.implements LE/a;
.implements LF0/C;
.implements LF0/E0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/relocation/f$a;
    }
.end annotation


# static fields
.field public static final S:Landroidx/compose/foundation/relocation/f$a;

.field public static final T:I


# instance fields
.field private P:LE/c;

.field private final Q:Z

.field private R:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/foundation/relocation/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/foundation/relocation/f$a;-><init>(Ly7/k;)V

    sput-object v0, Landroidx/compose/foundation/relocation/f;->S:Landroidx/compose/foundation/relocation/f$a;

    const/16 v0, 0x8

    sput v0, Landroidx/compose/foundation/relocation/f;->T:I

    return-void
.end method

.method public constructor <init>(LE/c;)V
    .locals 0

    invoke-direct {p0}, Landroidx/compose/ui/d$c;-><init>()V

    iput-object p1, p0, Landroidx/compose/foundation/relocation/f;->P:LE/c;

    return-void
.end method

.method public static final synthetic T1(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;)Ln0/i;
    .locals 0

    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/relocation/f;->U1(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;)Ln0/i;

    move-result-object p0

    return-object p0
.end method

.method private static final U1(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;)Ln0/i;
    .locals 2

    .prologue
    invoke-virtual {p0}, Landroidx/compose/ui/d$c;->A1()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/relocation/f;->R:Z

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, LF0/k;->k(LF0/j;)LD0/t;

    move-result-object p0

    invoke-interface {p1}, LD0/t;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-object p1, v1

    :goto_0
    if-nez p1, :cond_3

    return-object v1

    :cond_3
    invoke-interface {p2}, Lx7/a;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ln0/i;

    if-nez p2, :cond_4

    return-object v1

    :cond_4
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/relocation/d;->a(LD0/t;LD0/t;Ln0/i;)Ln0/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public K()Ljava/lang/Object;
    .locals 1

    sget-object v0, Landroidx/compose/foundation/relocation/f;->S:Landroidx/compose/foundation/relocation/f$a;

    return-object v0
.end method

.method public synthetic M(J)V
    .locals 0

    invoke-static {p0, p1, p2}, LF0/B;->b(LF0/C;J)V

    return-void
.end method

.method public final V1()LE/c;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/relocation/f;->P:LE/c;

    return-object v0
.end method

.method public j1(LD0/t;Lx7/a;Lm7/e;)Ljava/lang/Object;
    .locals 7

    .prologue
    new-instance v4, Landroidx/compose/foundation/relocation/f$c;

    invoke-direct {v4, p0, p1, p2}, Landroidx/compose/foundation/relocation/f$c;-><init>(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;)V

    new-instance v6, Landroidx/compose/foundation/relocation/f$b;

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/relocation/f$b;-><init>(Landroidx/compose/foundation/relocation/f;LD0/t;Lx7/a;Lx7/a;Lm7/e;)V

    invoke-static {v6, p3}, LW8/O;->f(Lx7/p;Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Li7/M;->a:Li7/M;

    return-object p1
.end method

.method public m1(LD0/t;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/compose/foundation/relocation/f;->R:Z

    return-void
.end method

.method public y1()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/relocation/f;->Q:Z

    return v0
.end method
