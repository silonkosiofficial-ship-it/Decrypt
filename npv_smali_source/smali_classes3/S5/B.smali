.class public final LS5/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/sessions/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS5/B$a;
    }
.end annotation


# static fields
.field public static final g:LS5/B$a;

.field private static final h:D


# instance fields
.field private final b:LQ4/f;

.field private final c:LG5/e;

.field private final d:LU5/f;

.field private final e:LS5/h;

.field private final f:Lm7/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LS5/B$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LS5/B$a;-><init>(Ly7/k;)V

    sput-object v0, LS5/B;->g:LS5/B$a;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    sput-wide v0, LS5/B;->h:D

    return-void
.end method

.method public constructor <init>(LQ4/f;LG5/e;LU5/f;LS5/h;Lm7/i;)V
    .locals 1

    const-string v0, "firebaseApp"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firebaseInstallations"

    invoke-static {p2, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sessionSettings"

    invoke-static {p3, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventGDTLogger"

    invoke-static {p4, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p5, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS5/B;->b:LQ4/f;

    iput-object p2, p0, LS5/B;->c:LG5/e;

    iput-object p3, p0, LS5/B;->d:LU5/f;

    iput-object p4, p0, LS5/B;->e:LS5/h;

    iput-object p5, p0, LS5/B;->f:Lm7/i;

    return-void
.end method

.method public static final synthetic b(LS5/B;LS5/z;)V
    .locals 0

    invoke-direct {p0, p1}, LS5/B;->g(LS5/z;)V

    return-void
.end method

.method public static final synthetic c(LS5/B;)LQ4/f;
    .locals 0

    iget-object p0, p0, LS5/B;->b:LQ4/f;

    return-object p0
.end method

.method public static final synthetic d(LS5/B;)LG5/e;
    .locals 0

    iget-object p0, p0, LS5/B;->c:LG5/e;

    return-object p0
.end method

.method public static final synthetic e(LS5/B;)LU5/f;
    .locals 0

    iget-object p0, p0, LS5/B;->d:LU5/f;

    return-object p0
.end method

.method public static final synthetic f(LS5/B;Lm7/e;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, LS5/B;->i(Lm7/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(LS5/z;)V
    .locals 2

    .prologue
    const-string v0, "SessionFirelogPublisher"

    :try_start_0
    iget-object v1, p0, LS5/B;->e:LS5/h;

    invoke-interface {v1, p1}, LS5/h;->a(LS5/z;)V

    const-string p1, "Successfully logged Session Start event."

    nop
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Error logging Session Start event to DataTransport: "

    nop

    :goto_0
    return-void
.end method

.method private final h()Z
    .locals 4

    .prologue
    sget-wide v0, LS5/B;->h:D

    iget-object v2, p0, LS5/B;->d:LU5/f;

    invoke-virtual {v2}, LU5/f;->b()D

    move-result-wide v2

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final i(Lm7/e;)Ljava/lang/Object;
    .locals 5

    .prologue
    instance-of v0, p1, LS5/B$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LS5/B$c;

    iget v1, v0, LS5/B$c;->I:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LS5/B$c;->I:I

    goto :goto_0

    :cond_0
    new-instance v0, LS5/B$c;

    invoke-direct {v0, p0, p1}, LS5/B$c;-><init>(LS5/B;Lm7/e;)V

    :goto_0
    iget-object p1, v0, LS5/B$c;->G:Ljava/lang/Object;

    invoke-static {}, Ln7/b;->g()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LS5/B$c;->I:I

    const-string v3, "SessionFirelogPublisher"

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, LS5/B$c;->F:Ljava/lang/Object;

    check-cast v0, LS5/B;

    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Li7/x;->b(Ljava/lang/Object;)V

    const-string p1, "Data Collection is enabled for at least one Subscriber"

    nop

    iget-object p1, p0, LS5/B;->d:LU5/f;

    iput-object p0, v0, LS5/B$c;->F:Ljava/lang/Object;

    iput v4, v0, LS5/B$c;->I:I

    invoke-virtual {p1, v0}, LU5/f;->g(Lm7/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p1, v0, LS5/B;->d:LU5/f;

    invoke-virtual {p1}, LU5/f;->d()Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_4

    const-string p1, "Sessions SDK disabled. Events will not be sent."

    :goto_2
    nop

    invoke-static {v1}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-direct {v0}, LS5/B;->h()Z

    move-result p1

    if-nez p1, :cond_5

    const-string p1, "Sessions SDK has dropped this session due to sampling."

    goto :goto_2

    :cond_5
    invoke-static {v4}, Lo7/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(LS5/y;)V
    .locals 7

    const-string v0, "sessionDetails"

    invoke-static {p1, v0}, Ly7/t;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LS5/B;->f:Lm7/i;

    invoke-static {v0}, LW8/O;->a(Lm7/i;)LW8/N;

    move-result-object v1

    new-instance v4, LS5/B$b;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, LS5/B$b;-><init>(LS5/B;LS5/y;Lm7/e;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, LW8/g;->d(LW8/N;Lm7/i;LW8/P;Lx7/p;ILjava/lang/Object;)LW8/z0;

    return-void
.end method
