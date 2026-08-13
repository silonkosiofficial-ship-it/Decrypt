.class public final LC/j;
.super LD/o;
.source "SourceFile"

# interfaces
.implements LC/E;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC/j$b;
    }
.end annotation


# static fields
.field private static final d:LC/j$b;

.field public static final e:I

.field private static final f:Lx7/p;


# instance fields
.field private final a:LC/J;

.field private final b:LD/I;

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC/j$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LC/j$b;-><init>(Ly7/k;)V

    sput-object v0, LC/j;->d:LC/j$b;

    const/16 v0, 0x8

    sput v0, LC/j;->e:I

    sget-object v0, LC/j$a;->D:LC/j$a;

    sput-object v0, LC/j;->f:Lx7/p;

    return-void
.end method

.method public constructor <init>(Lx7/l;)V
    .locals 1

    invoke-direct {p0}, LD/o;-><init>()V

    new-instance v0, LC/J;

    invoke-direct {v0, p0}, LC/J;-><init>(LC/j;)V

    iput-object v0, p0, LC/j;->a:LC/J;

    new-instance v0, LD/I;

    invoke-direct {v0}, LD/I;-><init>()V

    iput-object v0, p0, LC/j;->b:LD/I;

    invoke-interface {p1, p0}, Lx7/l;->l(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(ILx7/l;Lx7/p;Lx7/l;Lx7/r;)V
    .locals 3

    .prologue
    invoke-virtual {p0}, LC/j;->j()LD/I;

    move-result-object v0

    new-instance v1, LC/i;

    if-nez p3, :cond_0

    sget-object v2, LC/j;->f:Lx7/p;

    goto :goto_0

    :cond_0
    move-object v2, p3

    :goto_0
    invoke-direct {v1, p2, v2, p4, p5}, LC/i;-><init>(Lx7/l;Lx7/p;Lx7/l;Lx7/r;)V

    invoke-virtual {v0, p1, v1}, LD/I;->c(ILjava/lang/Object;)V

    if-eqz p3, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, LC/j;->c:Z

    :cond_1
    return-void
.end method

.method public bridge synthetic f()LD/d;
    .locals 1

    invoke-virtual {p0}, LC/j;->j()LD/I;

    move-result-object v0

    return-object v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, LC/j;->c:Z

    return v0
.end method

.method public j()LD/I;
    .locals 1

    iget-object v0, p0, LC/j;->b:LD/I;

    return-object v0
.end method

.method public final k()LC/J;
    .locals 1

    iget-object v0, p0, LC/j;->a:LC/J;

    return-object v0
.end method
