.class public final LR0/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR0/m$a;
    }
.end annotation


# static fields
.field public static final c:LR0/m$a;

.field public static final d:I

.field private static final e:LR0/n;

.field private static final f:LW8/K;


# instance fields
.field private final a:LR0/e;

.field private b:LW8/N;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LR0/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LR0/m$a;-><init>(Ly7/k;)V

    sput-object v0, LR0/m;->c:LR0/m$a;

    const/16 v0, 0x8

    sput v0, LR0/m;->d:I

    new-instance v0, LR0/n;

    invoke-direct {v0}, LR0/n;-><init>()V

    sput-object v0, LR0/m;->e:LR0/n;

    sget-object v0, LW8/K;->g:LW8/K$a;

    new-instance v1, LR0/m$b;

    invoke-direct {v1, v0}, LR0/m$b;-><init>(LW8/K$a;)V

    sput-object v1, LR0/m;->f:LW8/K;

    return-void
.end method

.method public constructor <init>(LR0/e;Lm7/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR0/m;->a:LR0/e;

    sget-object p1, LR0/m;->f:LW8/K;

    invoke-static {}, LU0/l;->a()LW8/J;

    move-result-object v0

    invoke-interface {p1, v0}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    invoke-interface {p1, p2}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    sget-object v0, LW8/z0;->h:LW8/z0$b;

    invoke-interface {p2, v0}, Lm7/i;->i(Lm7/i$c;)Lm7/i$b;

    move-result-object p2

    check-cast p2, LW8/z0;

    invoke-static {p2}, LW8/U0;->a(LW8/z0;)LW8/y;

    move-result-object p2

    invoke-interface {p1, p2}, Lm7/i;->o0(Lm7/i;)Lm7/i;

    move-result-object p1

    invoke-static {p1}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object p1

    iput-object p1, p0, LR0/m;->b:LW8/N;

    return-void
.end method

.method public synthetic constructor <init>(LR0/e;Lm7/i;ILy7/k;)V
    .locals 0

    .prologue
    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    new-instance p1, LR0/e;

    invoke-direct {p1}, LR0/e;-><init>()V

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    sget-object p2, Lm7/j;->C:Lm7/j;

    :cond_1
    invoke-direct {p0, p1, p2}, LR0/m;-><init>(LR0/e;Lm7/i;)V

    return-void
.end method


# virtual methods
.method public a(LR0/F;LR0/w;Lx7/l;Lx7/l;)LR0/H;
    .locals 0

    invoke-virtual {p1}, LR0/F;->c()LR0/h;

    const/4 p1, 0x0

    return-object p1
.end method
