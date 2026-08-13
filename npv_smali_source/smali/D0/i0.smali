.class public final LD0/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD0/i0$a;
    }
.end annotation


# static fields
.field public static final f:I = 0x8


# instance fields
.field private final a:LD0/k0;

.field private b:LD0/C;

.field private final c:Lx7/p;

.field private final d:Lx7/p;

.field private final e:Lx7/p;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, LD0/Q;->a:LD0/Q;

    invoke-direct {p0, v0}, LD0/i0;-><init>(LD0/k0;)V

    return-void
.end method

.method public constructor <init>(LD0/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD0/i0;->a:LD0/k0;

    new-instance p1, LD0/i0$d;

    invoke-direct {p1, p0}, LD0/i0$d;-><init>(LD0/i0;)V

    iput-object p1, p0, LD0/i0;->c:Lx7/p;

    new-instance p1, LD0/i0$b;

    invoke-direct {p1, p0}, LD0/i0$b;-><init>(LD0/i0;)V

    iput-object p1, p0, LD0/i0;->d:Lx7/p;

    new-instance p1, LD0/i0$c;

    invoke-direct {p1, p0}, LD0/i0$c;-><init>(LD0/i0;)V

    iput-object p1, p0, LD0/i0;->e:Lx7/p;

    return-void
.end method

.method public static final synthetic a(LD0/i0;)LD0/k0;
    .locals 0

    iget-object p0, p0, LD0/i0;->a:LD0/k0;

    return-object p0
.end method

.method public static final synthetic b(LD0/i0;)LD0/C;
    .locals 0

    invoke-direct {p0}, LD0/i0;->h()LD0/C;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(LD0/i0;LD0/C;)V
    .locals 0

    iput-object p1, p0, LD0/i0;->b:LD0/C;

    return-void
.end method

.method private final h()LD0/C;
    .locals 2

    .prologue
    iget-object v0, p0, LD0/i0;->b:LD0/C;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "SubcomposeLayoutState is not attached to SubcomposeLayout"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final d()V
    .locals 1

    invoke-direct {p0}, LD0/i0;->h()LD0/C;

    move-result-object v0

    invoke-virtual {v0}, LD0/C;->z()V

    return-void
.end method

.method public final e()Lx7/p;
    .locals 1

    iget-object v0, p0, LD0/i0;->d:Lx7/p;

    return-object v0
.end method

.method public final f()Lx7/p;
    .locals 1

    iget-object v0, p0, LD0/i0;->e:Lx7/p;

    return-object v0
.end method

.method public final g()Lx7/p;
    .locals 1

    iget-object v0, p0, LD0/i0;->c:Lx7/p;

    return-object v0
.end method

.method public final i(Ljava/lang/Object;Lx7/p;)LD0/i0$a;
    .locals 1

    invoke-direct {p0}, LD0/i0;->h()LD0/C;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LD0/C;->G(Ljava/lang/Object;Lx7/p;)LD0/i0$a;

    move-result-object p1

    return-object p1
.end method
